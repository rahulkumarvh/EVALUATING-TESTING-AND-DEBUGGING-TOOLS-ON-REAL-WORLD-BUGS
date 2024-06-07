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
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

/**
 * <code>Parser</code> creates {@link CommandLine}s.
 *
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$, $Date$
 */
public abstract class Parser implements CommandLineParser
{public static class __CLR4_5_2nmnmlvl36x8g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402847792L,8589935092L,997,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** commandline instance */
    protected CommandLine cmd;

    /** current Options */
    private Options options;

    /** list of required options strings */
    private List requiredOptions;

    protected void setOptions(final Options options)
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(850);
        __CLR4_5_2nmnmlvl36x8g.R.inc(851);this.options = options;
        __CLR4_5_2nmnmlvl36x8g.R.inc(852);this.requiredOptions = new ArrayList(options.getRequiredOptions());
    }finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    protected Options getOptions()
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(853);
        __CLR4_5_2nmnmlvl36x8g.R.inc(854);return options;
    }finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    protected List getRequiredOptions()
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(855);
        __CLR4_5_2nmnmlvl36x8g.R.inc(856);return requiredOptions;
    }finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    /**
     * Subclasses must implement this method to reduce
     * the <code>arguments</code> that have been passed to the parse method.
     *
     * @param opts The Options to parse the arguments by.
     * @param arguments The arguments that have to be flattened.
     * @param stopAtNonOption specifies whether to stop
     * flattening when a non option has been encountered
     * @return a String array of the flattened arguments
     */
    protected abstract String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption);

    /**
     * Parses the specified <code>arguments</code> based
     * on the specifed {@link Options}.
     *
     * @param options the <code>Options</code>
     * @param arguments the <code>arguments</code>
     * @return the <code>CommandLine</code>
     * @throws ParseException if an error occurs when parsing the
     * arguments.
     */
    public CommandLine parse(Options options, String[] arguments) throws ParseException
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(857);
        __CLR4_5_2nmnmlvl36x8g.R.inc(858);return parse(options, arguments, null, false);
    }finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    /**
     * Parse the arguments according to the specified options and properties.
     *
     * @param options    the specified Options
     * @param arguments  the command line arguments
     * @param properties command line option name-value pairs
     * @return the list of atomic option and value tokens
     * @throws ParseException if there are any problems encountered
     *                        while parsing the command line tokens.
     *
     * @since 1.1
     */
    public CommandLine parse(Options options, String[] arguments, Properties properties) throws ParseException
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(859);
        __CLR4_5_2nmnmlvl36x8g.R.inc(860);return parse(options, arguments, properties, false);
    }finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    /**
     * Parses the specified <code>arguments</code>
     * based on the specifed {@link Options}.
     *
     * @param options         the <code>Options</code>
     * @param arguments       the <code>arguments</code>
     * @param stopAtNonOption specifies whether to stop interpreting the
     *                        arguments when a non option has been encountered
     *                        and to add them to the CommandLines args list.
     * @return the <code>CommandLine</code>
     * @throws ParseException if an error occurs when parsing the arguments.
     */
    public CommandLine parse(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(861);
        __CLR4_5_2nmnmlvl36x8g.R.inc(862);return parse(options, arguments, null, stopAtNonOption);
    }finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    /**
     * Parse the arguments according to the specified options and
     * properties.
     *
     * @param options the specified Options
     * @param arguments the command line arguments
     * @param properties command line option name-value pairs
     * @param stopAtNonOption stop parsing the arguments when the first
     * non option is encountered.
     *
     * @return the list of atomic option and value tokens
     *
     * @throws ParseException if there are any problems encountered
     * while parsing the command line tokens.
     *
     * @since 1.1
     */
    public CommandLine parse(Options options, String[] arguments, Properties properties, boolean stopAtNonOption)
            throws ParseException
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(863);
        // clear out the data in options in case it's been used before (CLI-71)
        __CLR4_5_2nmnmlvl36x8g.R.inc(864);for (Iterator it = options.helpOptions().iterator(); (((it.hasNext())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(865)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(866)==0&false));)
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(867);Option opt = (Option) it.next();
            __CLR4_5_2nmnmlvl36x8g.R.inc(868);opt.clearValues();
        }

        // initialise members
        }__CLR4_5_2nmnmlvl36x8g.R.inc(869);setOptions(options);

        __CLR4_5_2nmnmlvl36x8g.R.inc(870);cmd = new CommandLine();

        __CLR4_5_2nmnmlvl36x8g.R.inc(871);boolean eatTheRest = false;

        __CLR4_5_2nmnmlvl36x8g.R.inc(872);if ((((arguments == null)&&(__CLR4_5_2nmnmlvl36x8g.R.iget(873)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(874)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(875);arguments = new String[0];
        }

        }__CLR4_5_2nmnmlvl36x8g.R.inc(876);List tokenList = Arrays.asList(flatten(getOptions(), arguments, stopAtNonOption));

        __CLR4_5_2nmnmlvl36x8g.R.inc(877);ListIterator iterator = tokenList.listIterator();

        // process each flattened token
        __CLR4_5_2nmnmlvl36x8g.R.inc(878);while ((((iterator.hasNext())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(879)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(880)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(881);String t = (String) iterator.next();

            // the value is the double-dash
            __CLR4_5_2nmnmlvl36x8g.R.inc(882);if (((("--".equals(t))&&(__CLR4_5_2nmnmlvl36x8g.R.iget(883)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(884)==0&false)))
            {{
                __CLR4_5_2nmnmlvl36x8g.R.inc(885);eatTheRest = true;
            }

            // the value is a single dash
            }else {__CLR4_5_2nmnmlvl36x8g.R.inc(886);if (((("-".equals(t))&&(__CLR4_5_2nmnmlvl36x8g.R.iget(887)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(888)==0&false)))
            {{
                __CLR4_5_2nmnmlvl36x8g.R.inc(889);if ((((stopAtNonOption)&&(__CLR4_5_2nmnmlvl36x8g.R.iget(890)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(891)==0&false)))
                {{
                    __CLR4_5_2nmnmlvl36x8g.R.inc(892);eatTheRest = true;
                }
                }else
                {{
                    __CLR4_5_2nmnmlvl36x8g.R.inc(893);cmd.addArg(t);
                }
            }}

            // the value is an option
            }else {__CLR4_5_2nmnmlvl36x8g.R.inc(894);if ((((t.startsWith("-"))&&(__CLR4_5_2nmnmlvl36x8g.R.iget(895)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(896)==0&false)))
            {{
                __CLR4_5_2nmnmlvl36x8g.R.inc(897);if ((((stopAtNonOption && !getOptions().hasOption(t))&&(__CLR4_5_2nmnmlvl36x8g.R.iget(898)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(899)==0&false)))
                {{
                    __CLR4_5_2nmnmlvl36x8g.R.inc(900);eatTheRest = true;
                    __CLR4_5_2nmnmlvl36x8g.R.inc(901);cmd.addArg(t);
                }
                }else
                {{
                    __CLR4_5_2nmnmlvl36x8g.R.inc(902);processOption(t, iterator);
                }
            }}

            // the value is an argument
            }else
            {{
                __CLR4_5_2nmnmlvl36x8g.R.inc(903);cmd.addArg(t);

                __CLR4_5_2nmnmlvl36x8g.R.inc(904);if ((((stopAtNonOption)&&(__CLR4_5_2nmnmlvl36x8g.R.iget(905)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(906)==0&false)))
                {{
                    __CLR4_5_2nmnmlvl36x8g.R.inc(907);eatTheRest = true;
                }
            }}

            // eat the remaining tokens
            }}}__CLR4_5_2nmnmlvl36x8g.R.inc(908);if ((((eatTheRest)&&(__CLR4_5_2nmnmlvl36x8g.R.iget(909)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(910)==0&false)))
            {{
                __CLR4_5_2nmnmlvl36x8g.R.inc(911);while ((((iterator.hasNext())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(912)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(913)==0&false)))
                {{
                    __CLR4_5_2nmnmlvl36x8g.R.inc(914);String str = (String) iterator.next();

                    // ensure only one double-dash is added
                    __CLR4_5_2nmnmlvl36x8g.R.inc(915);if ((((!"--".equals(str))&&(__CLR4_5_2nmnmlvl36x8g.R.iget(916)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(917)==0&false)))
                    {{
                        __CLR4_5_2nmnmlvl36x8g.R.inc(918);cmd.addArg(str);
                    }
                }}
            }}
        }}

        }__CLR4_5_2nmnmlvl36x8g.R.inc(919);processProperties(properties);
        __CLR4_5_2nmnmlvl36x8g.R.inc(920);checkRequiredOptions();

        __CLR4_5_2nmnmlvl36x8g.R.inc(921);return cmd;
    }finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    /**
     * Sets the values of Options using the values in <code>properties</code>.
     *
     * @param properties The value properties to be processed.
     */
    protected void processProperties(Properties properties)
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(922);
        __CLR4_5_2nmnmlvl36x8g.R.inc(923);if ((((properties == null)&&(__CLR4_5_2nmnmlvl36x8g.R.iget(924)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(925)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(926);return;
        }

        }__CLR4_5_2nmnmlvl36x8g.R.inc(927);for (Enumeration e = properties.propertyNames(); (((e.hasMoreElements())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(928)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(929)==0&false));)
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(930);String option = e.nextElement().toString();

            __CLR4_5_2nmnmlvl36x8g.R.inc(931);if ((((!cmd.hasOption(option))&&(__CLR4_5_2nmnmlvl36x8g.R.iget(932)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(933)==0&false)))
            {{
                __CLR4_5_2nmnmlvl36x8g.R.inc(934);Option opt = getOptions().getOption(option);

                // get the value from the properties instance
                __CLR4_5_2nmnmlvl36x8g.R.inc(935);String value = properties.getProperty(option);

                __CLR4_5_2nmnmlvl36x8g.R.inc(936);if ((((opt.hasArg())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(937)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(938)==0&false)))
                {{
                    __CLR4_5_2nmnmlvl36x8g.R.inc(939);if ((((opt.getValues() == null || opt.getValues().length == 0)&&(__CLR4_5_2nmnmlvl36x8g.R.iget(940)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(941)==0&false)))
                    {{
                        __CLR4_5_2nmnmlvl36x8g.R.inc(942);try
                        {
                            __CLR4_5_2nmnmlvl36x8g.R.inc(943);opt.addValueForProcessing(value);
                        }
                        catch (RuntimeException exp)
                        {
                            // if we cannot add the value don't worry about it
                        }
                    }
                }}
                }else {__CLR4_5_2nmnmlvl36x8g.R.inc(944);if ((((!("yes".equalsIgnoreCase(value)
                        || "true".equalsIgnoreCase(value)
                        || "1".equalsIgnoreCase(value)))&&(__CLR4_5_2nmnmlvl36x8g.R.iget(945)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(946)==0&false)))
                {{
                    // if the value is not yes, true or 1 then don't add the
                    // option to the CommandLine
                    __CLR4_5_2nmnmlvl36x8g.R.inc(947);break;
                }

                }}__CLR4_5_2nmnmlvl36x8g.R.inc(948);cmd.addOption(opt);
            }
        }}
    }}finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    /**
     * Throws a {@link MissingOptionException} if all of the required options
     * are not present.
     *
     * @throws MissingOptionException if any of the required Options
     * are not present.
     */
    protected void checkRequiredOptions() throws MissingOptionException
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(949);
        // if there are required options that have not been processsed
        __CLR4_5_2nmnmlvl36x8g.R.inc(950);if ((((!getRequiredOptions().isEmpty())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(951)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(952)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(953);throw new MissingOptionException(getRequiredOptions());
        }
    }}finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    /**
     * <p>Process the argument values for the specified Option
     * <code>opt</code> using the values retrieved from the
     * specified iterator <code>iter</code>.
     *
     * @param opt The current Option
     * @param iter The iterator over the flattened command line
     * Options.
     *
     * @throws ParseException if an argument value is required
     * and it is has not been found.
     */
    public void processArgs(Option opt, ListIterator iter) throws ParseException
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(954);
        // loop until an option is found
        __CLR4_5_2nmnmlvl36x8g.R.inc(955);while ((((iter.hasNext())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(956)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(957)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(958);String str = (String) iter.next();

            // found an Option, not an argument
            __CLR4_5_2nmnmlvl36x8g.R.inc(959);if ((((getOptions().hasOption(str) && str.startsWith("-"))&&(__CLR4_5_2nmnmlvl36x8g.R.iget(960)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(961)==0&false)))
            {{
                __CLR4_5_2nmnmlvl36x8g.R.inc(962);iter.previous();
                __CLR4_5_2nmnmlvl36x8g.R.inc(963);break;
            }

            // found a value
            }__CLR4_5_2nmnmlvl36x8g.R.inc(964);try
            {
                __CLR4_5_2nmnmlvl36x8g.R.inc(965);opt.addValueForProcessing(Util.stripLeadingAndTrailingQuotes(str));
            }
            catch (RuntimeException exp)
            {
                __CLR4_5_2nmnmlvl36x8g.R.inc(966);iter.previous();
                __CLR4_5_2nmnmlvl36x8g.R.inc(967);break;
            }
        }

        }__CLR4_5_2nmnmlvl36x8g.R.inc(968);if ((((opt.getValues() == null && !opt.hasOptionalArg())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(969)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(970)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(971);throw new MissingArgumentException(opt);
        }
    }}finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}

    /**
     * Process the Option specified by <code>arg</code> using the values
     * retrieved from the specfied iterator <code>iter</code>.
     *
     * @param arg The String value representing an Option
     * @param iter The iterator over the flattened command line arguments.
     *
     * @throws ParseException if <code>arg</code> does not represent an Option
     */
    protected void processOption(String arg, ListIterator iter) throws ParseException
    {try{__CLR4_5_2nmnmlvl36x8g.R.inc(972);
        __CLR4_5_2nmnmlvl36x8g.R.inc(973);boolean hasOption = getOptions().hasOption(arg);

        // if there is no option throw an UnrecognisedOptionException
        __CLR4_5_2nmnmlvl36x8g.R.inc(974);if ((((!hasOption)&&(__CLR4_5_2nmnmlvl36x8g.R.iget(975)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(976)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(977);throw new UnrecognizedOptionException("Unrecognized option: " + arg, arg);
        }

        // get the option represented by arg
        }__CLR4_5_2nmnmlvl36x8g.R.inc(978);Option opt = (Option) getOptions().getOption(arg).clone();

        // if the option is a required option remove the option from
        // the requiredOptions list
        __CLR4_5_2nmnmlvl36x8g.R.inc(979);if ((((opt.isRequired())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(980)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(981)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(982);getRequiredOptions().remove(opt.getKey());
        }

        // if the option is in an OptionGroup make that option the selected
        // option of the group
        }__CLR4_5_2nmnmlvl36x8g.R.inc(983);if ((((getOptions().getOptionGroup(opt) != null)&&(__CLR4_5_2nmnmlvl36x8g.R.iget(984)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(985)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(986);OptionGroup group = getOptions().getOptionGroup(opt);

            __CLR4_5_2nmnmlvl36x8g.R.inc(987);if ((((group.isRequired())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(988)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(989)==0&false)))
            {{
                __CLR4_5_2nmnmlvl36x8g.R.inc(990);getRequiredOptions().remove(group);
            }

            }__CLR4_5_2nmnmlvl36x8g.R.inc(991);group.setSelected(opt);
        }

        // if the option takes an argument value
        }__CLR4_5_2nmnmlvl36x8g.R.inc(992);if ((((opt.hasArg())&&(__CLR4_5_2nmnmlvl36x8g.R.iget(993)!=0|true))||(__CLR4_5_2nmnmlvl36x8g.R.iget(994)==0&false)))
        {{
            __CLR4_5_2nmnmlvl36x8g.R.inc(995);processArgs(opt, iter);
        }

        // set the option on the command line
        }__CLR4_5_2nmnmlvl36x8g.R.inc(996);cmd.addOption(opt);
    }finally{__CLR4_5_2nmnmlvl36x8g.R.flushNeeded();}}
}
