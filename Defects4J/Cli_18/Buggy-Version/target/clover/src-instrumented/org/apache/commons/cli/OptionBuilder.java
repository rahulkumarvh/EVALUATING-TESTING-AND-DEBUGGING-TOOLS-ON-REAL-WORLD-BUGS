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
 * <p>OptionBuilder allows the user to create Options using descriptive
 * methods.</p>
 * <p>Details on the Builder pattern can be found at 
 * <a href="http://c2.com/cgi-bin/wiki?BuilderPattern">
 * http://c2.com/cgi-bin/wiki?BuilderPattern</a>.</p>
 *
 * @author John Keyes (john at integralsource.com)
 * @since 1.0
 */
public class OptionBuilder {public static class __CLR4_5_2hrhrlvkk1rzy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370696164L,8589935092L,718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** long option */
    private static String longopt;

    /** option description */
    private static String description;

    /** argument name */
    private static String argName;

    /** is required? */
    private static boolean required;

    /** the number of arguments */
    private static int numberOfArgs = Option.UNINITIALIZED;

    /** option type */
    private static Object type;

    /** option can have an optional argument value */
    private static boolean optionalArg;

    /** value separator for argument value */
    private static char valuesep;

    /** option builder instance */
    private static OptionBuilder instance = new OptionBuilder();

    /**
     * private constructor to prevent instances being created
     */
    private OptionBuilder()
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(639);
        // hide the constructor
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * Resets the member variables to their default values.
     */
    private static void reset()
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(640);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(641);description = null;
        __CLR4_5_2hrhrlvkk1rzy.R.inc(642);argName = "arg";
        __CLR4_5_2hrhrlvkk1rzy.R.inc(643);longopt = null;
        __CLR4_5_2hrhrlvkk1rzy.R.inc(644);type = null;
        __CLR4_5_2hrhrlvkk1rzy.R.inc(645);required = false;
        __CLR4_5_2hrhrlvkk1rzy.R.inc(646);numberOfArgs = Option.UNINITIALIZED;


        // PMM 9/6/02 - these were missing
        __CLR4_5_2hrhrlvkk1rzy.R.inc(647);optionalArg = false;
        __CLR4_5_2hrhrlvkk1rzy.R.inc(648);valuesep = (char) 0;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created will have the following long option value.
     *
     * @param newLongopt the long option value
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withLongOpt(String newLongopt)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(649);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(650);OptionBuilder.longopt = newLongopt;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(651);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created will require an argument value.
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasArg()
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(652);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(653);OptionBuilder.numberOfArgs = 1;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(654);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created will require an argument value if
     * <code>hasArg</code> is true.
     *
     * @param hasArg if true then the Option has an argument value
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasArg(boolean hasArg)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(655);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(656);OptionBuilder.numberOfArgs = ((((hasArg == true) )&&(__CLR4_5_2hrhrlvkk1rzy.R.iget(657)!=0|true))||(__CLR4_5_2hrhrlvkk1rzy.R.iget(658)==0&false))? 1 : Option.UNINITIALIZED;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(659);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created will have the specified argument value 
     * name.
     *
     * @param name the name for the argument value
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withArgName(String name)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(660);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(661);OptionBuilder.argName = name;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(662);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created will be required.
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder isRequired()
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(663);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(664);OptionBuilder.required = true;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(665);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created uses <code>sep</code> as a means to
     * separate argument values.
     *
     * <b>Example:</b>
     * <pre>
     * Option opt = OptionBuilder.withValueSeparator(':')
     *                           .create('D');
     *
     * CommandLine line = parser.parse(args);
     * String propertyName = opt.getValue(0);
     * String propertyValue = opt.getValue(1);
     * </pre>
     *
     * @param sep The value separator to be used for the argument values.
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withValueSeparator(char sep)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(666);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(667);OptionBuilder.valuesep = sep;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(668);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created uses '<code>=</code>' as a means to
     * separate argument values.
     *
     * <b>Example:</b>
     * <pre>
     * Option opt = OptionBuilder.withValueSeparator()
     *                           .create('D');
     *
     * CommandLine line = parser.parse(args);
     * String propertyName = opt.getValue(0);
     * String propertyValue = opt.getValue(1);
     * </pre>
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withValueSeparator()
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(669);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(670);OptionBuilder.valuesep = '=';

        __CLR4_5_2hrhrlvkk1rzy.R.inc(671);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created will be required if <code>required</code>
     * is true.
     *
     * @param newRequired if true then the Option is required
     * @return the OptionBuilder instance
     */
    public static OptionBuilder isRequired(boolean newRequired)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(672);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(673);OptionBuilder.required = newRequired;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(674);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created can have unlimited argument values.
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasArgs()
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(675);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(676);OptionBuilder.numberOfArgs = Option.UNLIMITED_VALUES;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(677);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created can have <code>num</code> 
     * argument values.
     *
     * @param num the number of args that the option can have
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasArgs(int num)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(678);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(679);OptionBuilder.numberOfArgs = num;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(680);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option can have an optional argument.
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasOptionalArg()
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(681);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(682);OptionBuilder.numberOfArgs = 1;
        __CLR4_5_2hrhrlvkk1rzy.R.inc(683);OptionBuilder.optionalArg = true;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(684);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option can have an unlimited number of
     * optional arguments.
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasOptionalArgs()
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(685);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(686);OptionBuilder.numberOfArgs = Option.UNLIMITED_VALUES;
        __CLR4_5_2hrhrlvkk1rzy.R.inc(687);OptionBuilder.optionalArg = true;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(688);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option can have the specified number of 
     * optional arguments.
     *
     * @param numArgs - the maximum number of optional arguments
     * the next Option created can have.
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasOptionalArgs(int numArgs)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(689);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(690);OptionBuilder.numberOfArgs = numArgs;
        __CLR4_5_2hrhrlvkk1rzy.R.inc(691);OptionBuilder.optionalArg = true;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(692);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created will have a value that will be an instance 
     * of <code>type</code>.
     *
     * @param newType the type of the Options argument value
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withType(Object newType)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(693);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(694);OptionBuilder.type = newType;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(695);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * The next Option created will have the specified description
     *
     * @param newDescription a description of the Option's purpose
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withDescription(String newDescription)
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(696);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(697);OptionBuilder.description = newDescription;

        __CLR4_5_2hrhrlvkk1rzy.R.inc(698);return instance;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * Create an Option using the current settings and with 
     * the specified Option <code>char</code>.
     *
     * @param opt the character representation of the Option
     * @return the Option instance
     * @throws IllegalArgumentException if <code>opt</code> is not
     * a valid character.  See Option.
     */
    public static Option create(char opt)
                         throws IllegalArgumentException
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(699);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(700);return create(String.valueOf(opt));
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * Create an Option using the current settings
     *
     * @return the Option instance
     * @throws IllegalArgumentException if <code>longOpt</code> has
     * not been set.  
     */
    public static Option create()
                         throws IllegalArgumentException
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(701);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(702);if ((((longopt == null)&&(__CLR4_5_2hrhrlvkk1rzy.R.iget(703)!=0|true))||(__CLR4_5_2hrhrlvkk1rzy.R.iget(704)==0&false)))
        {{
            __CLR4_5_2hrhrlvkk1rzy.R.inc(705);throw new IllegalArgumentException("must specify longopt");
        }

        }__CLR4_5_2hrhrlvkk1rzy.R.inc(706);return create(null);
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}

    /**
     * Create an Option using the current settings and with 
     * the specified Option <code>char</code>.
     *
     * @param opt the <code>java.lang.String</code> representation 
     * of the Option
     * @return the Option instance
     * @throws IllegalArgumentException if <code>opt</code> is not
     * a valid character.  See Option.
     */
    public static Option create(String opt)
                         throws IllegalArgumentException
    {try{__CLR4_5_2hrhrlvkk1rzy.R.inc(707);
        // create the option
        __CLR4_5_2hrhrlvkk1rzy.R.inc(708);Option option = new Option(opt, description);


        // set the option properties
        __CLR4_5_2hrhrlvkk1rzy.R.inc(709);option.setLongOpt(longopt);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(710);option.setRequired(required);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(711);option.setOptionalArg(optionalArg);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(712);option.setArgs(numberOfArgs);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(713);option.setType(type);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(714);option.setValueSeparator(valuesep);
        __CLR4_5_2hrhrlvkk1rzy.R.inc(715);option.setArgName(argName);


        // reset the OptionBuilder properties
        __CLR4_5_2hrhrlvkk1rzy.R.inc(716);OptionBuilder.reset();

        // return the Option instance
        __CLR4_5_2hrhrlvkk1rzy.R.inc(717);return option;
    }finally{__CLR4_5_2hrhrlvkk1rzy.R.flushNeeded();}}
}