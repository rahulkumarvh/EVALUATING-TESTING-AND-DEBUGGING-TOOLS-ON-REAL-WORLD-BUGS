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
{public static class __CLR4_5_2nznzlvn1liqy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0034\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521103352L,8589935092L,1010,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** commandline instance */
    protected CommandLine cmd;

    /** current Options */
    private Options options;

    /** list of required options strings */
    private List requiredOptions;

    protected void setOptions(final Options options)
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(863);
        __CLR4_5_2nznzlvn1liqy.R.inc(864);this.options = options;
        __CLR4_5_2nznzlvn1liqy.R.inc(865);this.requiredOptions = new ArrayList(options.getRequiredOptions());
    }finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

    protected Options getOptions()
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(866);
        __CLR4_5_2nznzlvn1liqy.R.inc(867);return options;
    }finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

    protected List getRequiredOptions()
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(868);
        __CLR4_5_2nznzlvn1liqy.R.inc(869);return requiredOptions;
    }finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

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
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(870);
        __CLR4_5_2nznzlvn1liqy.R.inc(871);return parse(options, arguments, null, false);
    }finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

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
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(872);
        __CLR4_5_2nznzlvn1liqy.R.inc(873);return parse(options, arguments, properties, false);
    }finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

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
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(874);
        __CLR4_5_2nznzlvn1liqy.R.inc(875);return parse(options, arguments, null, stopAtNonOption);
    }finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

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
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(876);
        // clear out the data in options in case it's been used before (CLI-71)
        __CLR4_5_2nznzlvn1liqy.R.inc(877);for (Iterator it = options.helpOptions().iterator(); (((it.hasNext())&&(__CLR4_5_2nznzlvn1liqy.R.iget(878)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(879)==0&false));)
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(880);Option opt = (Option) it.next();
            __CLR4_5_2nznzlvn1liqy.R.inc(881);opt.clearValues();
        }

        // initialise members
        }__CLR4_5_2nznzlvn1liqy.R.inc(882);setOptions(options);

        __CLR4_5_2nznzlvn1liqy.R.inc(883);cmd = new CommandLine();

        __CLR4_5_2nznzlvn1liqy.R.inc(884);boolean eatTheRest = false;

        __CLR4_5_2nznzlvn1liqy.R.inc(885);if ((((arguments == null)&&(__CLR4_5_2nznzlvn1liqy.R.iget(886)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(887)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(888);arguments = new String[0];
        }

        }__CLR4_5_2nznzlvn1liqy.R.inc(889);List tokenList = Arrays.asList(flatten(getOptions(), arguments, stopAtNonOption));

        __CLR4_5_2nznzlvn1liqy.R.inc(890);ListIterator iterator = tokenList.listIterator();

        // process each flattened token
        __CLR4_5_2nznzlvn1liqy.R.inc(891);while ((((iterator.hasNext())&&(__CLR4_5_2nznzlvn1liqy.R.iget(892)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(893)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(894);String t = (String) iterator.next();

            // the value is the double-dash
            __CLR4_5_2nznzlvn1liqy.R.inc(895);if (((("--".equals(t))&&(__CLR4_5_2nznzlvn1liqy.R.iget(896)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(897)==0&false)))
            {{
                __CLR4_5_2nznzlvn1liqy.R.inc(898);eatTheRest = true;
            }

            // the value is a single dash
            }else {__CLR4_5_2nznzlvn1liqy.R.inc(899);if (((("-".equals(t))&&(__CLR4_5_2nznzlvn1liqy.R.iget(900)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(901)==0&false)))
            {{
                __CLR4_5_2nznzlvn1liqy.R.inc(902);if ((((stopAtNonOption)&&(__CLR4_5_2nznzlvn1liqy.R.iget(903)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(904)==0&false)))
                {{
                    __CLR4_5_2nznzlvn1liqy.R.inc(905);eatTheRest = true;
                }
                }else
                {{
                    __CLR4_5_2nznzlvn1liqy.R.inc(906);cmd.addArg(t);
                }
            }}

            // the value is an option
            }else {__CLR4_5_2nznzlvn1liqy.R.inc(907);if ((((t.startsWith("-"))&&(__CLR4_5_2nznzlvn1liqy.R.iget(908)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(909)==0&false)))
            {{
                __CLR4_5_2nznzlvn1liqy.R.inc(910);if ((((stopAtNonOption && !getOptions().hasOption(t))&&(__CLR4_5_2nznzlvn1liqy.R.iget(911)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(912)==0&false)))
                {{
                    __CLR4_5_2nznzlvn1liqy.R.inc(913);eatTheRest = true;
                    __CLR4_5_2nznzlvn1liqy.R.inc(914);cmd.addArg(t);
                }
                }else
                {{
                    __CLR4_5_2nznzlvn1liqy.R.inc(915);processOption(t, iterator);
                }
            }}

            // the value is an argument
            }else
            {{
                __CLR4_5_2nznzlvn1liqy.R.inc(916);cmd.addArg(t);

                __CLR4_5_2nznzlvn1liqy.R.inc(917);if ((((stopAtNonOption)&&(__CLR4_5_2nznzlvn1liqy.R.iget(918)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(919)==0&false)))
                {{
                    __CLR4_5_2nznzlvn1liqy.R.inc(920);eatTheRest = true;
                }
            }}

            // eat the remaining tokens
            }}}__CLR4_5_2nznzlvn1liqy.R.inc(921);if ((((eatTheRest)&&(__CLR4_5_2nznzlvn1liqy.R.iget(922)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(923)==0&false)))
            {{
                __CLR4_5_2nznzlvn1liqy.R.inc(924);while ((((iterator.hasNext())&&(__CLR4_5_2nznzlvn1liqy.R.iget(925)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(926)==0&false)))
                {{
                    __CLR4_5_2nznzlvn1liqy.R.inc(927);String str = (String) iterator.next();

                    // ensure only one double-dash is added
                    __CLR4_5_2nznzlvn1liqy.R.inc(928);if ((((!"--".equals(str))&&(__CLR4_5_2nznzlvn1liqy.R.iget(929)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(930)==0&false)))
                    {{
                        __CLR4_5_2nznzlvn1liqy.R.inc(931);cmd.addArg(str);
                    }
                }}
            }}
        }}

        }__CLR4_5_2nznzlvn1liqy.R.inc(932);processProperties(properties);
        __CLR4_5_2nznzlvn1liqy.R.inc(933);checkRequiredOptions();

        __CLR4_5_2nznzlvn1liqy.R.inc(934);return cmd;
    }finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

    /**
     * Sets the values of Options using the values in <code>properties</code>.
     *
     * @param properties The value properties to be processed.
     */
    protected void processProperties(Properties properties)
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(935);
        __CLR4_5_2nznzlvn1liqy.R.inc(936);if ((((properties == null)&&(__CLR4_5_2nznzlvn1liqy.R.iget(937)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(938)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(939);return;
        }

        }__CLR4_5_2nznzlvn1liqy.R.inc(940);for (Enumeration e = properties.propertyNames(); (((e.hasMoreElements())&&(__CLR4_5_2nznzlvn1liqy.R.iget(941)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(942)==0&false));)
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(943);String option = e.nextElement().toString();

            __CLR4_5_2nznzlvn1liqy.R.inc(944);if ((((!cmd.hasOption(option))&&(__CLR4_5_2nznzlvn1liqy.R.iget(945)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(946)==0&false)))
            {{
                __CLR4_5_2nznzlvn1liqy.R.inc(947);Option opt = getOptions().getOption(option);

                // get the value from the properties instance
                __CLR4_5_2nznzlvn1liqy.R.inc(948);String value = properties.getProperty(option);

                __CLR4_5_2nznzlvn1liqy.R.inc(949);if ((((opt.hasArg())&&(__CLR4_5_2nznzlvn1liqy.R.iget(950)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(951)==0&false)))
                {{
                    __CLR4_5_2nznzlvn1liqy.R.inc(952);if ((((opt.getValues() == null || opt.getValues().length == 0)&&(__CLR4_5_2nznzlvn1liqy.R.iget(953)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(954)==0&false)))
                    {{
                        __CLR4_5_2nznzlvn1liqy.R.inc(955);try
                        {
                            __CLR4_5_2nznzlvn1liqy.R.inc(956);opt.addValueForProcessing(value);
                        }
                        catch (RuntimeException exp)
                        {
                            // if we cannot add the value don't worry about it
                        }
                    }
                }}
                }else {__CLR4_5_2nznzlvn1liqy.R.inc(957);if ((((!("yes".equalsIgnoreCase(value)
                        || "true".equalsIgnoreCase(value)
                        || "1".equalsIgnoreCase(value)))&&(__CLR4_5_2nznzlvn1liqy.R.iget(958)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(959)==0&false)))
                {{
                    // if the value is not yes, true or 1 then don't add the
                    // option to the CommandLine
                    __CLR4_5_2nznzlvn1liqy.R.inc(960);break;
                }

                }}__CLR4_5_2nznzlvn1liqy.R.inc(961);cmd.addOption(opt);
            }
        }}
    }}finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

    /**
     * Throws a {@link MissingOptionException} if all of the required options
     * are not present.
     *
     * @throws MissingOptionException if any of the required Options
     * are not present.
     */
    protected void checkRequiredOptions() throws MissingOptionException
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(962);
        // if there are required options that have not been processsed
        __CLR4_5_2nznzlvn1liqy.R.inc(963);if ((((!getRequiredOptions().isEmpty())&&(__CLR4_5_2nznzlvn1liqy.R.iget(964)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(965)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(966);throw new MissingOptionException(getRequiredOptions());
        }
    }}finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

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
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(967);
        // loop until an option is found
        __CLR4_5_2nznzlvn1liqy.R.inc(968);while ((((iter.hasNext())&&(__CLR4_5_2nznzlvn1liqy.R.iget(969)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(970)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(971);String str = (String) iter.next();

            // found an Option, not an argument
            __CLR4_5_2nznzlvn1liqy.R.inc(972);if ((((getOptions().hasOption(str) && str.startsWith("-"))&&(__CLR4_5_2nznzlvn1liqy.R.iget(973)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(974)==0&false)))
            {{
                __CLR4_5_2nznzlvn1liqy.R.inc(975);iter.previous();
                __CLR4_5_2nznzlvn1liqy.R.inc(976);break;
            }

            // found a value
            }__CLR4_5_2nznzlvn1liqy.R.inc(977);try
            {
                __CLR4_5_2nznzlvn1liqy.R.inc(978);opt.addValueForProcessing(Util.stripLeadingAndTrailingQuotes(str));
            }
            catch (RuntimeException exp)
            {
                __CLR4_5_2nznzlvn1liqy.R.inc(979);iter.previous();
                __CLR4_5_2nznzlvn1liqy.R.inc(980);break;
            }
        }

        }__CLR4_5_2nznzlvn1liqy.R.inc(981);if ((((opt.getValues() == null && !opt.hasOptionalArg())&&(__CLR4_5_2nznzlvn1liqy.R.iget(982)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(983)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(984);throw new MissingArgumentException(opt);
        }
    }}finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}

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
    {try{__CLR4_5_2nznzlvn1liqy.R.inc(985);
        __CLR4_5_2nznzlvn1liqy.R.inc(986);boolean hasOption = getOptions().hasOption(arg);

        // if there is no option throw an UnrecognisedOptionException
        __CLR4_5_2nznzlvn1liqy.R.inc(987);if ((((!hasOption)&&(__CLR4_5_2nznzlvn1liqy.R.iget(988)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(989)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(990);throw new UnrecognizedOptionException("Unrecognized option: " + arg, arg);
        }

        // get the option represented by arg
        }__CLR4_5_2nznzlvn1liqy.R.inc(991);Option opt = (Option) getOptions().getOption(arg).clone();

        // if the option is a required option remove the option from
        // the requiredOptions list
        __CLR4_5_2nznzlvn1liqy.R.inc(992);if ((((opt.isRequired())&&(__CLR4_5_2nznzlvn1liqy.R.iget(993)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(994)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(995);getRequiredOptions().remove(opt.getKey());
        }

        // if the option is in an OptionGroup make that option the selected
        // option of the group
        }__CLR4_5_2nznzlvn1liqy.R.inc(996);if ((((getOptions().getOptionGroup(opt) != null)&&(__CLR4_5_2nznzlvn1liqy.R.iget(997)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(998)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(999);OptionGroup group = getOptions().getOptionGroup(opt);

            __CLR4_5_2nznzlvn1liqy.R.inc(1000);if ((((group.isRequired())&&(__CLR4_5_2nznzlvn1liqy.R.iget(1001)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(1002)==0&false)))
            {{
                __CLR4_5_2nznzlvn1liqy.R.inc(1003);getRequiredOptions().remove(group);
            }

            }__CLR4_5_2nznzlvn1liqy.R.inc(1004);group.setSelected(opt);
        }

        // if the option takes an argument value
        }__CLR4_5_2nznzlvn1liqy.R.inc(1005);if ((((opt.hasArg())&&(__CLR4_5_2nznzlvn1liqy.R.iget(1006)!=0|true))||(__CLR4_5_2nznzlvn1liqy.R.iget(1007)==0&false)))
        {{
            __CLR4_5_2nznzlvn1liqy.R.inc(1008);processArgs(opt, iter);
        }

        // set the option on the command line
        }__CLR4_5_2nznzlvn1liqy.R.inc(1009);cmd.addOption(opt);
    }finally{__CLR4_5_2nznzlvn1liqy.R.flushNeeded();}}
}
