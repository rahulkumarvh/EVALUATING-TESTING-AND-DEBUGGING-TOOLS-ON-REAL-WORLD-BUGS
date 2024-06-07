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
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

/**
 * Represents list of arguments parsed against a {@link Options} descriptor.
 *
 * <p>It allows querying of a boolean {@link #hasOption(String opt)},
 * in addition to retrieving the {@link #getOptionValue(String opt)}
 * for options requiring arguments.</p>
 *
 * <p>Additionally, any left-over or unrecognized arguments,
 * are available for further processing.</p>
 *
 * @author bob mcwhirter (bob @ werken.com)
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$, $Date$
 */
public class CommandLine implements Serializable
{public static class __CLR4_5_2cclvn1m4p8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521132493L,8589935092L,114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = 1L;

    /** the unrecognised options/arguments */
    private List args = new LinkedList();

    /** the processed options */
    private List options = new ArrayList();

    /**
     * Creates a command line.
     */
    CommandLine()
    {try{__CLR4_5_2cclvn1m4p8.R.inc(12);
        // nothing to do
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Query to see if an option has been set.
     *
     * @param opt Short name of the option
     * @return true if set, false if not
     */
    public boolean hasOption(String opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(13);
        __CLR4_5_2cclvn1m4p8.R.inc(14);return options.contains(resolveOption(opt));
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Query to see if an option has been set.
     *
     * @param opt character name of the option
     * @return true if set, false if not
     */
    public boolean hasOption(char opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(15);
        __CLR4_5_2cclvn1m4p8.R.inc(16);return hasOption(String.valueOf(opt));
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /**
     * Return the <code>Object</code> type of this <code>Option</code>.
     *
     * @param opt the name of the option
     * @return the type of this <code>Option</code>
     * @deprecated due to System.err message. Instead use getParsedOptionValue(String)
     */
    public Object getOptionObject(String opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(17);
        __CLR4_5_2cclvn1m4p8.R.inc(18);try {
            __CLR4_5_2cclvn1m4p8.R.inc(19);return getParsedOptionValue(opt);
        } catch(ParseException pe) {
            __CLR4_5_2cclvn1m4p8.R.inc(20);System.err.println("Exception found converting " + opt + " to desired type: " + 
                pe.getMessage() );
            __CLR4_5_2cclvn1m4p8.R.inc(21);return null;
        }
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /**
     * Return a version of this <code>Option</code> converted to a particular type. 
     *
     * @param opt the name of the option
     * @return the value parsed into a particluar object
     * @throws ParseException if there are problems turning the option value into the desired type
     * @see PatternOptionBuilder
     */
    public Object getParsedOptionValue(String opt)
    throws ParseException
    {try{__CLR4_5_2cclvn1m4p8.R.inc(22);
        __CLR4_5_2cclvn1m4p8.R.inc(23);String res = getOptionValue(opt);

        __CLR4_5_2cclvn1m4p8.R.inc(24);Option option = resolveOption(opt);
        __CLR4_5_2cclvn1m4p8.R.inc(25);if ((((option == null)&&(__CLR4_5_2cclvn1m4p8.R.iget(26)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(27)==0&false)))
        {{
            __CLR4_5_2cclvn1m4p8.R.inc(28);return null;
        }

        }__CLR4_5_2cclvn1m4p8.R.inc(29);Object type = option.getType();

        __CLR4_5_2cclvn1m4p8.R.inc(30);return ((((res == null)        )&&(__CLR4_5_2cclvn1m4p8.R.iget(31)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(32)==0&false))? null : TypeHandler.createValue(res, type);
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /**
     * Return the <code>Object</code> type of this <code>Option</code>.
     *
     * @param opt the name of the option
     * @return the type of opt
     */
    public Object getOptionObject(char opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(33);
        __CLR4_5_2cclvn1m4p8.R.inc(34);return getOptionObject(String.valueOf(opt));
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Retrieve the argument, if any, of this option.
     *
     * @param opt the name of the option
     * @return Value of the argument if option is set, and has an argument,
     * otherwise null.
     */
    public String getOptionValue(String opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(35);
        __CLR4_5_2cclvn1m4p8.R.inc(36);String[] values = getOptionValues(opt);

        __CLR4_5_2cclvn1m4p8.R.inc(37);return ((((values == null) )&&(__CLR4_5_2cclvn1m4p8.R.iget(38)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(39)==0&false))? null : values[0];
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Retrieve the argument, if any, of this option.
     *
     * @param opt the character name of the option
     * @return Value of the argument if option is set, and has an argument,
     * otherwise null.
     */
    public String getOptionValue(char opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(40);
        __CLR4_5_2cclvn1m4p8.R.inc(41);return getOptionValue(String.valueOf(opt));
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Retrieves the array of values, if any, of an option.
     *
     * @param opt string name of the option
     * @return Values of the argument if option is set, and has an argument,
     * otherwise null.
     */
    public String[] getOptionValues(String opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(42);
        __CLR4_5_2cclvn1m4p8.R.inc(43);List values = new ArrayList();

        __CLR4_5_2cclvn1m4p8.R.inc(44);for (Iterator it = options.iterator(); (((it.hasNext())&&(__CLR4_5_2cclvn1m4p8.R.iget(45)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(46)==0&false));)
        {{
            __CLR4_5_2cclvn1m4p8.R.inc(47);Option option = (Option) it.next();
            __CLR4_5_2cclvn1m4p8.R.inc(48);if ((((opt.equals(option.getOpt()) || opt.equals(option.getLongOpt()))&&(__CLR4_5_2cclvn1m4p8.R.iget(49)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(50)==0&false)))
            {{
                __CLR4_5_2cclvn1m4p8.R.inc(51);values.addAll(option.getValuesList());
            }
        }}

        }__CLR4_5_2cclvn1m4p8.R.inc(52);return (((values.isEmpty() )&&(__CLR4_5_2cclvn1m4p8.R.iget(53)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(54)==0&false))? null : (String[]) values.toArray(new String[values.size()]);
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /**
     * Retrieves the option object given the long or short option as a String
     * 
     * @param opt short or long name of the option
     * @return Canonicalized option
     */
    private Option resolveOption(String opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(55);
        __CLR4_5_2cclvn1m4p8.R.inc(56);opt = Util.stripLeadingHyphens(opt);
        __CLR4_5_2cclvn1m4p8.R.inc(57);for (Iterator it = options.iterator(); (((it.hasNext())&&(__CLR4_5_2cclvn1m4p8.R.iget(58)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(59)==0&false));)
        {{
            __CLR4_5_2cclvn1m4p8.R.inc(60);Option option = (Option) it.next();
            __CLR4_5_2cclvn1m4p8.R.inc(61);if ((((opt.equals(option.getOpt()))&&(__CLR4_5_2cclvn1m4p8.R.iget(62)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(63)==0&false)))
            {{
                __CLR4_5_2cclvn1m4p8.R.inc(64);return option;
            }

            }__CLR4_5_2cclvn1m4p8.R.inc(65);if ((((opt.equals(option.getLongOpt()))&&(__CLR4_5_2cclvn1m4p8.R.iget(66)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(67)==0&false)))
            {{
                __CLR4_5_2cclvn1m4p8.R.inc(68);return option;
            }

        }}
        }__CLR4_5_2cclvn1m4p8.R.inc(69);return null;
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Retrieves the array of values, if any, of an option.
     *
     * @param opt character name of the option
     * @return Values of the argument if option is set, and has an argument,
     * otherwise null.
     */
    public String[] getOptionValues(char opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(70);
        __CLR4_5_2cclvn1m4p8.R.inc(71);return getOptionValues(String.valueOf(opt));
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Retrieve the argument, if any, of an option.
     *
     * @param opt name of the option
     * @param defaultValue is the default value to be returned if the option
     * is not specified
     * @return Value of the argument if option is set, and has an argument,
     * otherwise <code>defaultValue</code>.
     */
    public String getOptionValue(String opt, String defaultValue)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(72);
        __CLR4_5_2cclvn1m4p8.R.inc(73);String answer = getOptionValue(opt);

        __CLR4_5_2cclvn1m4p8.R.inc(74);return ((((answer != null) )&&(__CLR4_5_2cclvn1m4p8.R.iget(75)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(76)==0&false))? answer : defaultValue;
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Retrieve the argument, if any, of an option.
     *
     * @param opt character name of the option
     * @param defaultValue is the default value to be returned if the option
     * is not specified
     * @return Value of the argument if option is set, and has an argument,
     * otherwise <code>defaultValue</code>.
     */
    public String getOptionValue(char opt, String defaultValue)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(77);
        __CLR4_5_2cclvn1m4p8.R.inc(78);return getOptionValue(String.valueOf(opt), defaultValue);
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /**
     * Retrieve the map of values associated to the option. This is convenient
     * for options specifying Java properties like <tt>-Dparam1=value1
     * -Dparam2=value2</tt>. The first argument of the option is the key, and
     * the 2nd argument is the value. If the option has only one argument
     * (<tt>-Dfoo</tt>) it is considered as a boolean flag and the value is
     * <tt>"true"</tt>.
     *
     * @param opt name of the option
     * @return The Properties mapped by the option, never <tt>null</tt>
     *         even if the option doesn't exists
     * @since 1.2
     */
    public Properties getOptionProperties(String opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(79);
        __CLR4_5_2cclvn1m4p8.R.inc(80);Properties props = new Properties();

        __CLR4_5_2cclvn1m4p8.R.inc(81);for (Iterator it = options.iterator(); (((it.hasNext())&&(__CLR4_5_2cclvn1m4p8.R.iget(82)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(83)==0&false));)
        {{
            __CLR4_5_2cclvn1m4p8.R.inc(84);Option option = (Option) it.next();

            __CLR4_5_2cclvn1m4p8.R.inc(85);if ((((opt.equals(option.getOpt()) || opt.equals(option.getLongOpt()))&&(__CLR4_5_2cclvn1m4p8.R.iget(86)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(87)==0&false)))
            {{
                __CLR4_5_2cclvn1m4p8.R.inc(88);List values = option.getValuesList();
                __CLR4_5_2cclvn1m4p8.R.inc(89);if ((((values.size() >= 2)&&(__CLR4_5_2cclvn1m4p8.R.iget(90)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(91)==0&false)))
                {{
                    // use the first 2 arguments as the key/value pair
                    __CLR4_5_2cclvn1m4p8.R.inc(92);props.put(values.get(0), values.get(1));
                }
                }else {__CLR4_5_2cclvn1m4p8.R.inc(93);if ((((values.size() == 1)&&(__CLR4_5_2cclvn1m4p8.R.iget(94)!=0|true))||(__CLR4_5_2cclvn1m4p8.R.iget(95)==0&false)))
                {{
                    // no explicit value, handle it as a boolean
                    __CLR4_5_2cclvn1m4p8.R.inc(96);props.put(values.get(0), "true");
                }
            }}}
        }}

        }__CLR4_5_2cclvn1m4p8.R.inc(97);return props;
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Retrieve any left-over non-recognized options and arguments
     *
     * @return remaining items passed in but not parsed as an array
     */
    public String[] getArgs()
    {try{__CLR4_5_2cclvn1m4p8.R.inc(98);
        __CLR4_5_2cclvn1m4p8.R.inc(99);String[] answer = new String[args.size()];

        __CLR4_5_2cclvn1m4p8.R.inc(100);args.toArray(answer);

        __CLR4_5_2cclvn1m4p8.R.inc(101);return answer;
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * Retrieve any left-over non-recognized options and arguments
     *
     * @return remaining items passed in but not parsed as a <code>List</code>.
     */
    public List getArgList()
    {try{__CLR4_5_2cclvn1m4p8.R.inc(102);
        __CLR4_5_2cclvn1m4p8.R.inc(103);return args;
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /** 
     * jkeyes
     * - commented out until it is implemented properly
     * <p>Dump state, suitable for debugging.</p>
     *
     * @return Stringified form of this object
     */

    /*
    public String toString() {
        StringBuffer buf = new StringBuffer();
            
        buf.append("[ CommandLine: [ options: ");
        buf.append(options.toString());
        buf.append(" ] [ args: ");
        buf.append(args.toString());
        buf.append(" ] ]");
            
        return buf.toString();
    }
    */

    /**
     * Add left-over unrecognized option/argument.
     *
     * @param arg the unrecognised option/argument.
     */
    void addArg(String arg)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(104);
        __CLR4_5_2cclvn1m4p8.R.inc(105);args.add(arg);
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /**
     * Add an option to the command line.  The values of the option are stored.
     *
     * @param opt the processed option
     */
    void addOption(Option opt)
    {try{__CLR4_5_2cclvn1m4p8.R.inc(106);
        __CLR4_5_2cclvn1m4p8.R.inc(107);options.add(opt);
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /**
     * Returns an iterator over the Option members of CommandLine.
     *
     * @return an <code>Iterator</code> over the processed {@link Option}
     * members of this {@link CommandLine}
     */
    public Iterator iterator()
    {try{__CLR4_5_2cclvn1m4p8.R.inc(108);
        __CLR4_5_2cclvn1m4p8.R.inc(109);return options.iterator();
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}

    /**
     * Returns an array of the processed {@link Option}s.
     *
     * @return an array of the processed {@link Option}s.
     */
    public Option[] getOptions()
    {try{__CLR4_5_2cclvn1m4p8.R.inc(110);
        __CLR4_5_2cclvn1m4p8.R.inc(111);Collection processed = options;

        // reinitialise array
        __CLR4_5_2cclvn1m4p8.R.inc(112);Option[] optionsArray = new Option[processed.size()];

        // return the array
        __CLR4_5_2cclvn1m4p8.R.inc(113);return (Option[]) processed.toArray(optionsArray);
    }finally{__CLR4_5_2cclvn1m4p8.R.flushNeeded();}}
}
