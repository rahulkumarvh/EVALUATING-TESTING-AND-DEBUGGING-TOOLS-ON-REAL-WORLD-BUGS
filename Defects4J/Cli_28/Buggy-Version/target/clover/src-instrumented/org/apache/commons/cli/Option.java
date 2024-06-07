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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/** <p>Describes a single command-line option.  It maintains
 * information regarding the short-name of the option, the long-name,
 * if any exists, a flag indicating if an argument is required for
 * this option, and a self-documenting description of the option.</p>
 *
 * <p>An Option is not created independantly, but is create through
 * an instance of {@link Options}.<p>
 *
 * @see org.apache.commons.cli.Options
 * @see org.apache.commons.cli.CommandLine
 *
 * @author bob mcwhirter (bob @ werken.com)
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @version $Revision$, $Date$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Option implements Cloneable, Serializable
{public static class __CLR4_5_2l2l2lvn1n5wi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521179989L,8589935092L,950,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = 1L;

    /** constant that specifies the number of argument values has not been specified */
    public static final int UNINITIALIZED = -1;

    /** constant that specifies the number of argument values is infinite */
    public static final int UNLIMITED_VALUES = -2;

    /** the name of the option */
    private String opt;

    /** the long representation of the option */
    private String longOpt;

    /** the name of the argument for this option */
    private String argName = "arg";

    /** description of the option */
    private String description;

    /** specifies whether this option is required to be present */
    private boolean required;

    /** specifies whether the argument value of this Option is optional */
    private boolean optionalArg;

    /** the number of argument values this option can have */
    private int numberOfArgs = UNINITIALIZED;

    /** the type of this Option */
    private Object type;

    /** the list of argument values **/
    private List values = new ArrayList();

    /** the character that is the value separator */
    private char valuesep;

    /**
     * Creates an Option using the specified parameters.
     *
     * @param opt short representation of the option
     * @param description describes the function of the option
     *
     * @throws IllegalArgumentException if there are any non valid
     * Option characters in <code>opt</code>.
     */
    public Option(String opt, String description) throws IllegalArgumentException
    {
        this(opt, null, false, description);__CLR4_5_2l2l2lvn1n5wi.R.inc(759);try{__CLR4_5_2l2l2lvn1n5wi.R.inc(758);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Creates an Option using the specified parameters.
     *
     * @param opt short representation of the option
     * @param hasArg specifies whether the Option takes an argument or not
     * @param description describes the function of the option
     *
     * @throws IllegalArgumentException if there are any non valid
     * Option characters in <code>opt</code>.
     */
    public Option(String opt, boolean hasArg, String description) throws IllegalArgumentException
    {
        this(opt, null, hasArg, description);__CLR4_5_2l2l2lvn1n5wi.R.inc(761);try{__CLR4_5_2l2l2lvn1n5wi.R.inc(760);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Creates an Option using the specified parameters.
     *
     * @param opt short representation of the option
     * @param longOpt the long representation of the option
     * @param hasArg specifies whether the Option takes an argument or not
     * @param description describes the function of the option
     *
     * @throws IllegalArgumentException if there are any non valid
     * Option characters in <code>opt</code>.
     */
    public Option(String opt, String longOpt, boolean hasArg, String description)
           throws IllegalArgumentException
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(762);
        // ensure that the option is valid
        __CLR4_5_2l2l2lvn1n5wi.R.inc(763);OptionValidator.validateOption(opt);

        __CLR4_5_2l2l2lvn1n5wi.R.inc(764);this.opt = opt;
        __CLR4_5_2l2l2lvn1n5wi.R.inc(765);this.longOpt = longOpt;

        // if hasArg is set then the number of arguments is 1
        __CLR4_5_2l2l2lvn1n5wi.R.inc(766);if ((((hasArg)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(767)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(768)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(769);this.numberOfArgs = 1;
        }

        }__CLR4_5_2l2l2lvn1n5wi.R.inc(770);this.description = description;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Returns the id of this Option.  This is only set when the
     * Option shortOpt is a single character.  This is used for switch
     * statements.
     *
     * @return the id of this Option
     */
    public int getId()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(771);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(772);return getKey().charAt(0);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Returns the 'unique' Option identifier.
     * 
     * @return the 'unique' Option identifier
     */
    String getKey()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(773);
        // if 'opt' is null, then it is a 'long' option
        __CLR4_5_2l2l2lvn1n5wi.R.inc(774);if ((((opt == null)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(775)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(776)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(777);return longOpt;
        }

        }__CLR4_5_2l2l2lvn1n5wi.R.inc(778);return opt;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Retrieve the name of this Option.
     *
     * It is this String which can be used with
     * {@link CommandLine#hasOption(String opt)} and
     * {@link CommandLine#getOptionValue(String opt)} to check
     * for existence and argument.
     *
     * @return The name of this option
     */
    public String getOpt()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(779);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(780);return opt;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Retrieve the type of this Option.
     * 
     * @return The type of this option
     */
    public Object getType()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(781);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(782);return type;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Sets the type of this Option.
     *
     * @param type the type of this Option
     */
    public void setType(Object type)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(783);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(784);this.type = type;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Retrieve the long name of this Option.
     *
     * @return Long name of this option, or null, if there is no long name
     */
    public String getLongOpt()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(785);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(786);return longOpt;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Sets the long name of this Option.
     *
     * @param longOpt the long name of this Option
     */
    public void setLongOpt(String longOpt)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(787);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(788);this.longOpt = longOpt;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Sets whether this Option can have an optional argument.
     *
     * @param optionalArg specifies whether the Option can have
     * an optional argument.
     */
    public void setOptionalArg(boolean optionalArg)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(789);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(790);this.optionalArg = optionalArg;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * @return whether this Option can have an optional argument
     */
    public boolean hasOptionalArg()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(791);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(792);return optionalArg;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Query to see if this Option has a long name
     *
     * @return boolean flag indicating existence of a long name
     */
    public boolean hasLongOpt()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(793);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(794);return longOpt != null;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Query to see if this Option requires an argument
     *
     * @return boolean flag indicating if an argument is required
     */
    public boolean hasArg()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(795);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(796);return numberOfArgs > 0 || numberOfArgs == UNLIMITED_VALUES;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Retrieve the self-documenting description of this Option
     *
     * @return The string description of this option
     */
    public String getDescription()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(797);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(798);return description;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Sets the self-documenting description of this Option
     *
     * @param description The description of this option
     * @since 1.1
     */
    public void setDescription(String description)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(799);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(800);this.description = description;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Query to see if this Option requires an argument
     *
     * @return boolean flag indicating if an argument is required
     */
    public boolean isRequired()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(801);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(802);return required;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Sets whether this Option is mandatory.
     *
     * @param required specifies whether this Option is mandatory
     */
    public void setRequired(boolean required)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(803);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(804);this.required = required;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Sets the display name for the argument value.
     *
     * @param argName the display name for the argument value.
     */
    public void setArgName(String argName)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(805);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(806);this.argName = argName;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Gets the display name for the argument value.
     *
     * @return the display name for the argument value.
     */
    public String getArgName()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(807);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(808);return argName;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Returns whether the display name for the argument value
     * has been set.
     *
     * @return if the display name for the argument value has been
     * set.
     */
    public boolean hasArgName()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(809);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(810);return argName != null && argName.length() > 0;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Query to see if this Option can take many values.
     *
     * @return boolean flag indicating if multiple values are allowed
     */
    public boolean hasArgs()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(811);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(812);return numberOfArgs > 1 || numberOfArgs == UNLIMITED_VALUES;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Sets the number of argument values this Option can take.
     *
     * @param num the number of argument values
     */
    public void setArgs(int num)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(813);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(814);this.numberOfArgs = num;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Sets the value separator.  For example if the argument value
     * was a Java property, the value separator would be '='.
     *
     * @param sep The value separator.
     */
    public void setValueSeparator(char sep)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(815);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(816);this.valuesep = sep;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Returns the value separator character.
     *
     * @return the value separator character.
     */
    public char getValueSeparator()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(817);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(818);return valuesep;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Return whether this Option has specified a value separator.
     * 
     * @return whether this Option has specified a value separator.
     * @since 1.1
     */
    public boolean hasValueSeparator()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(819);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(820);return valuesep > 0;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Returns the number of argument values this Option can take.
     *
     * @return num the number of argument values
     */
    public int getArgs()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(821);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(822);return numberOfArgs;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Adds the specified value to this Option.
     * 
     * @param value is a/the value of this Option
     */
    void addValueForProcessing(String value)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(823);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2l2l2lvn1n5wi.R.inc(824);switch (numberOfArgs)
        {
            case UNINITIALIZED:if (!__CLB4_5_2_bool0) {__CLR4_5_2l2l2lvn1n5wi.R.inc(825);__CLB4_5_2_bool0=true;}
                __CLR4_5_2l2l2lvn1n5wi.R.inc(826);throw new RuntimeException("NO_ARGS_ALLOWED");

            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2l2l2lvn1n5wi.R.inc(827);__CLB4_5_2_bool0=true;}
                __CLR4_5_2l2l2lvn1n5wi.R.inc(828);processValue(value);
        }
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Processes the value.  If this Option has a value separator
     * the value will have to be parsed into individual tokens.  When
     * n-1 tokens have been processed and there are more value separators
     * in the value, parsing is ceased and the remaining characters are
     * added as a single token.
     *
     * @param value The String to be processed.
     *
     * @since 1.0.1
     */
    private void processValue(String value)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(829);
        // this Option has a separator character
        __CLR4_5_2l2l2lvn1n5wi.R.inc(830);if ((((hasValueSeparator())&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(831)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(832)==0&false)))
        {{
            // get the separator character
            __CLR4_5_2l2l2lvn1n5wi.R.inc(833);char sep = getValueSeparator();

            // store the index for the value separator
            __CLR4_5_2l2l2lvn1n5wi.R.inc(834);int index = value.indexOf(sep);

            // while there are more value separators
            __CLR4_5_2l2l2lvn1n5wi.R.inc(835);while ((((index != -1)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(836)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(837)==0&false)))
            {{
                // next value to be added 
                __CLR4_5_2l2l2lvn1n5wi.R.inc(838);if ((((values.size() == (numberOfArgs - 1))&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(839)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(840)==0&false)))
                {{
                    __CLR4_5_2l2l2lvn1n5wi.R.inc(841);break;
                }

                // store
                }__CLR4_5_2l2l2lvn1n5wi.R.inc(842);add(value.substring(0, index));

                // parse
                __CLR4_5_2l2l2lvn1n5wi.R.inc(843);value = value.substring(index + 1);

                // get new index
                __CLR4_5_2l2l2lvn1n5wi.R.inc(844);index = value.indexOf(sep);
            }
        }}

        // store the actual value or the last value that has been parsed
        }__CLR4_5_2l2l2lvn1n5wi.R.inc(845);add(value);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Add the value to this Option.  If the number of arguments
     * is greater than zero and there is enough space in the list then
     * add the value.  Otherwise, throw a runtime exception.
     *
     * @param value The value to be added to this Option
     *
     * @since 1.0.1
     */
    private void add(String value)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(846);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(847);if ((((!acceptsArg())&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(848)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(849)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(850);throw new RuntimeException("Cannot add value, list full.");
        }

        // store value
        }__CLR4_5_2l2l2lvn1n5wi.R.inc(851);values.add(value);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Returns the specified value of this Option or 
     * <code>null</code> if there is no value.
     *
     * @return the value/first value of this Option or 
     * <code>null</code> if there is no value.
     */
    public String getValue()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(852);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(853);return (((hasNoValues() )&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(854)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(855)==0&false))? null : (String) values.get(0);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Returns the specified value of this Option or 
     * <code>null</code> if there is no value.
     *
     * @param index The index of the value to be returned.
     *
     * @return the specified value of this Option or 
     * <code>null</code> if there is no value.
     *
     * @throws IndexOutOfBoundsException if index is less than 1
     * or greater than the number of the values for this Option.
     */
    public String getValue(int index) throws IndexOutOfBoundsException
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(856);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(857);return (((hasNoValues() )&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(858)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(859)==0&false))? null : (String) values.get(index);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Returns the value/first value of this Option or the 
     * <code>defaultValue</code> if there is no value.
     *
     * @param defaultValue The value to be returned if ther
     * is no value.
     *
     * @return the value/first value of this Option or the 
     * <code>defaultValue</code> if there are no values.
     */
    public String getValue(String defaultValue)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(860);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(861);String value = getValue();

        __CLR4_5_2l2l2lvn1n5wi.R.inc(862);return ((((value != null) )&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(863)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(864)==0&false))? value : defaultValue;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Return the values of this Option as a String array 
     * or null if there are no values
     *
     * @return the values of this Option as a String array 
     * or null if there are no values
     */
    public String[] getValues()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(865);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(866);return (((hasNoValues() )&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(867)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(868)==0&false))? null : (String[]) values.toArray(new String[values.size()]);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * @return the values of this Option as a List
     * or null if there are no values
     */
    public List getValuesList()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(869);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(870);return values;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /** 
     * Dump state, suitable for debugging.
     *
     * @return Stringified form of this object
     */
    public String toString()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(871);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(872);StringBuffer buf = new StringBuffer().append("[ option: ");

        __CLR4_5_2l2l2lvn1n5wi.R.inc(873);buf.append(opt);

        __CLR4_5_2l2l2lvn1n5wi.R.inc(874);if ((((longOpt != null)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(875)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(876)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(877);buf.append(" ").append(longOpt);
        }

        }__CLR4_5_2l2l2lvn1n5wi.R.inc(878);buf.append(" ");

        __CLR4_5_2l2l2lvn1n5wi.R.inc(879);if ((((hasArgs())&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(880)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(881)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(882);buf.append("[ARG...]");
        }
        }else {__CLR4_5_2l2l2lvn1n5wi.R.inc(883);if ((((hasArg())&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(884)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(885)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(886);buf.append(" [ARG]");
        }

        }}__CLR4_5_2l2l2lvn1n5wi.R.inc(887);buf.append(" :: ").append(description);

        __CLR4_5_2l2l2lvn1n5wi.R.inc(888);if ((((type != null)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(889)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(890)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(891);buf.append(" :: ").append(type);
        }

        }__CLR4_5_2l2l2lvn1n5wi.R.inc(892);buf.append(" ]");

        __CLR4_5_2l2l2lvn1n5wi.R.inc(893);return buf.toString();
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Returns whether this Option has any values.
     *
     * @return whether this Option has any values.
     */
    private boolean hasNoValues()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(894);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(895);return values.isEmpty();
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    public boolean equals(Object o)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(896);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(897);if ((((this == o)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(898)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(899)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(900);return true;
        }
        }__CLR4_5_2l2l2lvn1n5wi.R.inc(901);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(902)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(903)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(904);return false;
        }

        }__CLR4_5_2l2l2lvn1n5wi.R.inc(905);Option option = (Option) o;


        __CLR4_5_2l2l2lvn1n5wi.R.inc(906);if (((((((opt != null )&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(907)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(908)==0&false))? !opt.equals(option.opt) : option.opt != null)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(909)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(910)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(911);return false;
        }
        }__CLR4_5_2l2l2lvn1n5wi.R.inc(912);if (((((((longOpt != null )&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(913)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(914)==0&false))? !longOpt.equals(option.longOpt) : option.longOpt != null)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(915)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(916)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(917);return false;
        }

        }__CLR4_5_2l2l2lvn1n5wi.R.inc(918);return true;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    public int hashCode()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(919);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(920);int result;
        __CLR4_5_2l2l2lvn1n5wi.R.inc(921);result = ((((opt != null )&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(922)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(923)==0&false))? opt.hashCode() : 0);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(924);result = 31 * result + ((((longOpt != null )&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(925)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(926)==0&false))? longOpt.hashCode() : 0);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(927);return result;
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * A rather odd clone method - due to incorrect code in 1.0 it is public 
     * and in 1.1 rather than throwing a CloneNotSupportedException it throws 
     * a RuntimeException so as to maintain backwards compat at the API level. 
     *
     * After calling this method, it is very likely you will want to call 
     * clearValues(). 
     *
     * @throws RuntimeException
     */
    public Object clone()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(928);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(929);try
        {
            __CLR4_5_2l2l2lvn1n5wi.R.inc(930);Option option = (Option) super.clone();
            __CLR4_5_2l2l2lvn1n5wi.R.inc(931);option.values = new ArrayList(values);
            __CLR4_5_2l2l2lvn1n5wi.R.inc(932);return option;
        }
        catch (CloneNotSupportedException cnse)
        {
            __CLR4_5_2l2l2lvn1n5wi.R.inc(933);throw new RuntimeException("A CloneNotSupportedException was thrown: " + cnse.getMessage());
        }
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Clear the Option values. After a parse is complete, these are left with
     * data in them and they need clearing if another parse is done.
     *
     * See: <a href="https://issues.apache.org/jira/browse/CLI-71">CLI-71</a>
     */
    void clearValues()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(934);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(935);values.clear();
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * This method is not intended to be used. It was a piece of internal 
     * API that was made public in 1.0. It currently throws an UnsupportedOperationException. 
     * @deprecated
     * @throws UnsupportedOperationException
     */
    public boolean addValue(String value)
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(936);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(937);throw new UnsupportedOperationException("The addValue method is not intended for client use. "
                + "Subclasses should use the addValueForProcessing method instead. ");
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Tells if the option can accept more arguments.
     * 
     * @return false if the maximum number of arguments is reached
     * @since 1.3
     */
    boolean acceptsArg()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(938);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(939);return (hasArg() || hasArgs() || hasOptionalArg()) && (numberOfArgs <= 0 || values.size() < numberOfArgs);
    }finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}

    /**
     * Tells if the option requires more arguments to be valid.
     * 
     * @return false if the option doesn't require more arguments
     * @since 1.3
     */
    boolean requiresArg()
    {try{__CLR4_5_2l2l2lvn1n5wi.R.inc(940);
        __CLR4_5_2l2l2lvn1n5wi.R.inc(941);if ((((optionalArg)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(942)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(943)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(944);return false;
        }
        }__CLR4_5_2l2l2lvn1n5wi.R.inc(945);if ((((numberOfArgs == UNLIMITED_VALUES)&&(__CLR4_5_2l2l2lvn1n5wi.R.iget(946)!=0|true))||(__CLR4_5_2l2l2lvn1n5wi.R.iget(947)==0&false)))
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(948);return values.size() < 1;
        }
        }else
        {{
            __CLR4_5_2l2l2lvn1n5wi.R.inc(949);return acceptsArg();
        }
    }}finally{__CLR4_5_2l2l2lvn1n5wi.R.flushNeeded();}}
}
