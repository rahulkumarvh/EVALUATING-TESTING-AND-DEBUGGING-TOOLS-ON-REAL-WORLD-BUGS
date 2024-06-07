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
{public static class __CLR4_5_2d3d3lvn1m4yk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521132493L,8589935092L,651,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        this(opt, null, false, description);__CLR4_5_2d3d3lvn1m4yk.R.inc(472);try{__CLR4_5_2d3d3lvn1m4yk.R.inc(471);
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

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
        this(opt, null, hasArg, description);__CLR4_5_2d3d3lvn1m4yk.R.inc(474);try{__CLR4_5_2d3d3lvn1m4yk.R.inc(473);
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

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
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(475);
        // ensure that the option is valid
        __CLR4_5_2d3d3lvn1m4yk.R.inc(476);OptionValidator.validateOption(opt);

        __CLR4_5_2d3d3lvn1m4yk.R.inc(477);this.opt = opt;
        __CLR4_5_2d3d3lvn1m4yk.R.inc(478);this.longOpt = longOpt;

        // if hasArg is set then the number of arguments is 1
        __CLR4_5_2d3d3lvn1m4yk.R.inc(479);if ((((hasArg)&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(480)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(481)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(482);this.numberOfArgs = 1;
        }

        }__CLR4_5_2d3d3lvn1m4yk.R.inc(483);this.description = description;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Returns the id of this Option.  This is only set when the
     * Option shortOpt is a single character.  This is used for switch
     * statements.
     *
     * @return the id of this Option
     */
    public int getId()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(484);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(485);return getKey().charAt(0);
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Returns the 'unique' Option identifier.
     * 
     * @return the 'unique' Option identifier
     */
    String getKey()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(486);
        // if 'opt' is null, then it is a 'long' option
        __CLR4_5_2d3d3lvn1m4yk.R.inc(487);if ((((opt == null)&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(488)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(489)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(490);return longOpt;
        }

        }__CLR4_5_2d3d3lvn1m4yk.R.inc(491);return opt;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

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
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(492);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(493);return opt;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Retrieve the type of this Option.
     * 
     * @return The type of this option
     */
    public Object getType()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(494);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(495);return type;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Sets the type of this Option.
     *
     * @param type the type of this Option
     */
    public void setType(Object type)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(496);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(497);this.type = type;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Retrieve the long name of this Option.
     *
     * @return Long name of this option, or null, if there is no long name
     */
    public String getLongOpt()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(498);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(499);return longOpt;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Sets the long name of this Option.
     *
     * @param longOpt the long name of this Option
     */
    public void setLongOpt(String longOpt)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(500);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(501);this.longOpt = longOpt;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Sets whether this Option can have an optional argument.
     *
     * @param optionalArg specifies whether the Option can have
     * an optional argument.
     */
    public void setOptionalArg(boolean optionalArg)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(502);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(503);this.optionalArg = optionalArg;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * @return whether this Option can have an optional argument
     */
    public boolean hasOptionalArg()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(504);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(505);return optionalArg;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Query to see if this Option has a long name
     *
     * @return boolean flag indicating existence of a long name
     */
    public boolean hasLongOpt()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(506);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(507);return longOpt != null;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Query to see if this Option requires an argument
     *
     * @return boolean flag indicating if an argument is required
     */
    public boolean hasArg()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(508);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(509);return numberOfArgs > 0 || numberOfArgs == UNLIMITED_VALUES;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Retrieve the self-documenting description of this Option
     *
     * @return The string description of this option
     */
    public String getDescription()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(510);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(511);return description;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Sets the self-documenting description of this Option
     *
     * @param description The description of this option
     * @since 1.1
     */
    public void setDescription(String description)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(512);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(513);this.description = description;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Query to see if this Option requires an argument
     *
     * @return boolean flag indicating if an argument is required
     */
    public boolean isRequired()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(514);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(515);return required;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Sets whether this Option is mandatory.
     *
     * @param required specifies whether this Option is mandatory
     */
    public void setRequired(boolean required)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(516);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(517);this.required = required;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Sets the display name for the argument value.
     *
     * @param argName the display name for the argument value.
     */
    public void setArgName(String argName)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(518);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(519);this.argName = argName;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Gets the display name for the argument value.
     *
     * @return the display name for the argument value.
     */
    public String getArgName()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(520);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(521);return argName;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Returns whether the display name for the argument value
     * has been set.
     *
     * @return if the display name for the argument value has been
     * set.
     */
    public boolean hasArgName()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(522);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(523);return argName != null && argName.length() > 0;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Query to see if this Option can take many values.
     *
     * @return boolean flag indicating if multiple values are allowed
     */
    public boolean hasArgs()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(524);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(525);return numberOfArgs > 1 || numberOfArgs == UNLIMITED_VALUES;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Sets the number of argument values this Option can take.
     *
     * @param num the number of argument values
     */
    public void setArgs(int num)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(526);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(527);this.numberOfArgs = num;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Sets the value separator.  For example if the argument value
     * was a Java property, the value separator would be '='.
     *
     * @param sep The value separator.
     */
    public void setValueSeparator(char sep)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(528);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(529);this.valuesep = sep;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Returns the value separator character.
     *
     * @return the value separator character.
     */
    public char getValueSeparator()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(530);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(531);return valuesep;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Return whether this Option has specified a value separator.
     * 
     * @return whether this Option has specified a value separator.
     * @since 1.1
     */
    public boolean hasValueSeparator()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(532);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(533);return valuesep > 0;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Returns the number of argument values this Option can take.
     *
     * @return num the number of argument values
     */
    public int getArgs()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(534);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(535);return numberOfArgs;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Adds the specified value to this Option.
     * 
     * @param value is a/the value of this Option
     */
    void addValueForProcessing(String value)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(536);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2d3d3lvn1m4yk.R.inc(537);switch (numberOfArgs)
        {
            case UNINITIALIZED:if (!__CLB4_5_2_bool0) {__CLR4_5_2d3d3lvn1m4yk.R.inc(538);__CLB4_5_2_bool0=true;}
                __CLR4_5_2d3d3lvn1m4yk.R.inc(539);throw new RuntimeException("NO_ARGS_ALLOWED");

            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2d3d3lvn1m4yk.R.inc(540);__CLB4_5_2_bool0=true;}
                __CLR4_5_2d3d3lvn1m4yk.R.inc(541);processValue(value);
        }
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

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
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(542);
        // this Option has a separator character
        __CLR4_5_2d3d3lvn1m4yk.R.inc(543);if ((((hasValueSeparator())&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(544)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(545)==0&false)))
        {{
            // get the separator character
            __CLR4_5_2d3d3lvn1m4yk.R.inc(546);char sep = getValueSeparator();

            // store the index for the value separator
            __CLR4_5_2d3d3lvn1m4yk.R.inc(547);int index = value.indexOf(sep);

            // while there are more value separators
            __CLR4_5_2d3d3lvn1m4yk.R.inc(548);while ((((index != -1)&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(549)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(550)==0&false)))
            {{
                // next value to be added 
                __CLR4_5_2d3d3lvn1m4yk.R.inc(551);if ((((values.size() == (numberOfArgs - 1))&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(552)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(553)==0&false)))
                {{
                    __CLR4_5_2d3d3lvn1m4yk.R.inc(554);break;
                }

                // store
                }__CLR4_5_2d3d3lvn1m4yk.R.inc(555);add(value.substring(0, index));

                // parse
                __CLR4_5_2d3d3lvn1m4yk.R.inc(556);value = value.substring(index + 1);

                // get new index
                __CLR4_5_2d3d3lvn1m4yk.R.inc(557);index = value.indexOf(sep);
            }
        }}

        // store the actual value or the last value that has been parsed
        }__CLR4_5_2d3d3lvn1m4yk.R.inc(558);add(value);
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

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
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(559);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(560);if (((((numberOfArgs > 0) && (values.size() > (numberOfArgs - 1)))&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(561)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(562)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(563);throw new RuntimeException("Cannot add value, list full.");
        }

        // store value
        }__CLR4_5_2d3d3lvn1m4yk.R.inc(564);values.add(value);
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Returns the specified value of this Option or 
     * <code>null</code> if there is no value.
     *
     * @return the value/first value of this Option or 
     * <code>null</code> if there is no value.
     */
    public String getValue()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(565);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(566);return (((hasNoValues() )&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(567)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(568)==0&false))? null : (String) values.get(0);
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

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
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(569);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(570);return (((hasNoValues() )&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(571)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(572)==0&false))? null : (String) values.get(index);
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

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
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(573);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(574);String value = getValue();

        __CLR4_5_2d3d3lvn1m4yk.R.inc(575);return ((((value != null) )&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(576)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(577)==0&false))? value : defaultValue;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Return the values of this Option as a String array 
     * or null if there are no values
     *
     * @return the values of this Option as a String array 
     * or null if there are no values
     */
    public String[] getValues()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(578);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(579);return (((hasNoValues() )&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(580)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(581)==0&false))? null : (String[]) values.toArray(new String[values.size()]);
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * @return the values of this Option as a List
     * or null if there are no values
     */
    public List getValuesList()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(582);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(583);return values;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /** 
     * Dump state, suitable for debugging.
     *
     * @return Stringified form of this object
     */
    public String toString()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(584);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(585);StringBuffer buf = new StringBuffer().append("[ option: ");

        __CLR4_5_2d3d3lvn1m4yk.R.inc(586);buf.append(opt);

        __CLR4_5_2d3d3lvn1m4yk.R.inc(587);if ((((longOpt != null)&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(588)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(589)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(590);buf.append(" ").append(longOpt);
        }

        }__CLR4_5_2d3d3lvn1m4yk.R.inc(591);buf.append(" ");

        __CLR4_5_2d3d3lvn1m4yk.R.inc(592);if ((((hasArgs())&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(593)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(594)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(595);buf.append("[ARG...]");
        }
        }else {__CLR4_5_2d3d3lvn1m4yk.R.inc(596);if ((((hasArg())&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(597)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(598)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(599);buf.append(" [ARG]");
        }

        }}__CLR4_5_2d3d3lvn1m4yk.R.inc(600);buf.append(" :: ").append(description);

        __CLR4_5_2d3d3lvn1m4yk.R.inc(601);if ((((type != null)&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(602)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(603)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(604);buf.append(" :: ").append(type);
        }

        }__CLR4_5_2d3d3lvn1m4yk.R.inc(605);buf.append(" ]");

        __CLR4_5_2d3d3lvn1m4yk.R.inc(606);return buf.toString();
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Returns whether this Option has any values.
     *
     * @return whether this Option has any values.
     */
    private boolean hasNoValues()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(607);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(608);return values.isEmpty();
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    public boolean equals(Object o)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(609);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(610);if ((((this == o)&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(611)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(612)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(613);return true;
        }
        }__CLR4_5_2d3d3lvn1m4yk.R.inc(614);if ((((o == null || getClass() != o.getClass())&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(615)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(616)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(617);return false;
        }

        }__CLR4_5_2d3d3lvn1m4yk.R.inc(618);Option option = (Option) o;


        __CLR4_5_2d3d3lvn1m4yk.R.inc(619);if (((((((opt != null )&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(620)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(621)==0&false))? !opt.equals(option.opt) : option.opt != null)&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(622)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(623)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(624);return false;
        }
        }__CLR4_5_2d3d3lvn1m4yk.R.inc(625);if (((((((longOpt != null )&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(626)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(627)==0&false))? !longOpt.equals(option.longOpt) : option.longOpt != null)&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(628)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(629)==0&false)))
        {{
            __CLR4_5_2d3d3lvn1m4yk.R.inc(630);return false;
        }

        }__CLR4_5_2d3d3lvn1m4yk.R.inc(631);return true;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    public int hashCode()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(632);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(633);int result;
        __CLR4_5_2d3d3lvn1m4yk.R.inc(634);result = ((((opt != null )&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(635)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(636)==0&false))? opt.hashCode() : 0);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(637);result = 31 * result + ((((longOpt != null )&&(__CLR4_5_2d3d3lvn1m4yk.R.iget(638)!=0|true))||(__CLR4_5_2d3d3lvn1m4yk.R.iget(639)==0&false))? longOpt.hashCode() : 0);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(640);return result;
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

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
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(641);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(642);try
        {
            __CLR4_5_2d3d3lvn1m4yk.R.inc(643);Option option = (Option) super.clone();
            __CLR4_5_2d3d3lvn1m4yk.R.inc(644);option.values = new ArrayList(values);
            __CLR4_5_2d3d3lvn1m4yk.R.inc(645);return option;
        }
        catch (CloneNotSupportedException cnse)
        {
            __CLR4_5_2d3d3lvn1m4yk.R.inc(646);throw new RuntimeException("A CloneNotSupportedException was thrown: " + cnse.getMessage());
        }
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * Clear the Option values. After a parse is complete, these are left with
     * data in them and they need clearing if another parse is done.
     *
     * See: <a href="https://issues.apache.org/jira/browse/CLI-71">CLI-71</a>
     */
    void clearValues()
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(647);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(648);values.clear();
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

    /**
     * This method is not intended to be used. It was a piece of internal 
     * API that was made public in 1.0. It currently throws an UnsupportedOperationException. 
     * @deprecated
     * @throws UnsupportedOperationException
     */
    public boolean addValue(String value)
    {try{__CLR4_5_2d3d3lvn1m4yk.R.inc(649);
        __CLR4_5_2d3d3lvn1m4yk.R.inc(650);throw new UnsupportedOperationException("The addValue method is not intended for client use. "
                + "Subclasses should use the addValueForProcessing method instead. ");
    }finally{__CLR4_5_2d3d3lvn1m4yk.R.flushNeeded();}}

}
