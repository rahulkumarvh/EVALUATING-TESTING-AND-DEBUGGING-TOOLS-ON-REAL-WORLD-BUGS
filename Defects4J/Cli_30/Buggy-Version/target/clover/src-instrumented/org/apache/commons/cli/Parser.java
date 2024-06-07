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
 * @deprecated The two-pass parsing with the flatten method is not enough flexible to handle complex cases
 */
public abstract class Parser implements CommandLineParser
{public static class __CLR4_5_2xxxxlvn1ne7q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521190328L,8589935092L,1376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** commandline instance */
    protected CommandLine cmd;

    /** current Options */
    private Options options;

    /** list of required options strings */
    private List requiredOptions;

    protected void setOptions(final Options options)
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1221);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1222);this.options = options;
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1223);this.requiredOptions = new ArrayList(options.getRequiredOptions());
    }finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

    protected Options getOptions()
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1224);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1225);return options;
    }finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

    protected List getRequiredOptions()
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1226);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1227);return requiredOptions;
    }finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

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
    protected abstract String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) throws ParseException;

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
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1228);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1229);return parse(options, arguments, null, false);
    }finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

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
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1230);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1231);return parse(options, arguments, properties, false);
    }finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

    /**
     * Parses the specified <code>arguments</code>
     * based on the specifed {@link Options}.
     *
     * @param options         the <code>Options</code>
     * @param arguments       the <code>arguments</code>
     * @param stopAtNonOption if <tt>true</tt> an unrecognized argument stops
     *     the parsing and the remaining arguments are added to the 
     *     {@link CommandLine}s args list. If <tt>false</tt> an unrecognized
     *     argument triggers a ParseException.
     * @return the <code>CommandLine</code>
     * @throws ParseException if an error occurs when parsing the arguments.
     */
    public CommandLine parse(Options options, String[] arguments, boolean stopAtNonOption) throws ParseException
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1232);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1233);return parse(options, arguments, null, stopAtNonOption);
    }finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

    /**
     * Parse the arguments according to the specified options and
     * properties.
     *
     * @param options the specified Options
     * @param arguments the command line arguments
     * @param properties command line option name-value pairs
     * @param stopAtNonOption if <tt>true</tt> an unrecognized argument stops
     *     the parsing and the remaining arguments are added to the 
     *     {@link CommandLine}s args list. If <tt>false</tt> an unrecognized
     *     argument triggers a ParseException.
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
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1234);
        // clear out the data in options in case it's been used before (CLI-71)
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1235);for (Iterator it = options.helpOptions().iterator(); (((it.hasNext())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1236)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1237)==0&false));)
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1238);Option opt = (Option) it.next();
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1239);opt.clearValues();
        }
        
        // clear the data from the groups
        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1240);for (Iterator it = options.getOptionGroups().iterator(); (((it.hasNext())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1241)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1242)==0&false));)
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1243);OptionGroup group = (OptionGroup) it.next();
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1244);group.setSelected(null);
        }        

        // initialise members
        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1245);setOptions(options);

        __CLR4_5_2xxxxlvn1ne7q.R.inc(1246);cmd = new CommandLine();

        __CLR4_5_2xxxxlvn1ne7q.R.inc(1247);boolean eatTheRest = false;

        __CLR4_5_2xxxxlvn1ne7q.R.inc(1248);if ((((arguments == null)&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1249)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1250)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1251);arguments = new String[0];
        }

        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1252);List tokenList = Arrays.asList(flatten(getOptions(), arguments, stopAtNonOption));

        __CLR4_5_2xxxxlvn1ne7q.R.inc(1253);ListIterator iterator = tokenList.listIterator();

        // process each flattened token
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1254);while ((((iterator.hasNext())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1255)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1256)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1257);String t = (String) iterator.next();

            // the value is the double-dash
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1258);if (((("--".equals(t))&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1259)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1260)==0&false)))
            {{
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1261);eatTheRest = true;
            }

            // the value is a single dash
            }else {__CLR4_5_2xxxxlvn1ne7q.R.inc(1262);if (((("-".equals(t))&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1263)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1264)==0&false)))
            {{
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1265);if ((((stopAtNonOption)&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1266)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1267)==0&false)))
                {{
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1268);eatTheRest = true;
                }
                }else
                {{
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1269);cmd.addArg(t);
                }
            }}

            // the value is an option
            }else {__CLR4_5_2xxxxlvn1ne7q.R.inc(1270);if ((((t.startsWith("-"))&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1271)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1272)==0&false)))
            {{
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1273);if ((((stopAtNonOption && !getOptions().hasOption(t))&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1274)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1275)==0&false)))
                {{
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1276);eatTheRest = true;
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1277);cmd.addArg(t);
                }
                }else
                {{
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1278);processOption(t, iterator);
                }
            }}

            // the value is an argument
            }else
            {{
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1279);cmd.addArg(t);

                __CLR4_5_2xxxxlvn1ne7q.R.inc(1280);if ((((stopAtNonOption)&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1281)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1282)==0&false)))
                {{
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1283);eatTheRest = true;
                }
            }}

            // eat the remaining tokens
            }}}__CLR4_5_2xxxxlvn1ne7q.R.inc(1284);if ((((eatTheRest)&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1285)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1286)==0&false)))
            {{
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1287);while ((((iterator.hasNext())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1288)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1289)==0&false)))
                {{
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1290);String str = (String) iterator.next();

                    // ensure only one double-dash is added
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1291);if ((((!"--".equals(str))&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1292)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1293)==0&false)))
                    {{
                        __CLR4_5_2xxxxlvn1ne7q.R.inc(1294);cmd.addArg(str);
                    }
                }}
            }}
        }}

        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1295);processProperties(properties);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1296);checkRequiredOptions();

        __CLR4_5_2xxxxlvn1ne7q.R.inc(1297);return cmd;
    }finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

    /**
     * Sets the values of Options using the values in <code>properties</code>.
     *
     * @param properties The value properties to be processed.
     */
    protected void processProperties(Properties properties) throws ParseException
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1298);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1299);if ((((properties == null)&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1300)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1301)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1302);return;
        }

        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1303);for (Enumeration e = properties.propertyNames(); (((e.hasMoreElements())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1304)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1305)==0&false));)
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1306);String option = e.nextElement().toString();
            
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1307);if ((((!cmd.hasOption(option))&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1308)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1309)==0&false)))
            {{
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1310);Option opt = getOptions().getOption(option);
            
            // if the option is part of a group, check if another option of the group has been selected
            
                // get the value from the properties instance
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1311);String value = properties.getProperty(option);

                __CLR4_5_2xxxxlvn1ne7q.R.inc(1312);if ((((opt.hasArg())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1313)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1314)==0&false)))
                {{
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1315);if ((((opt.getValues() == null || opt.getValues().length == 0)&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1316)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1317)==0&false)))
                    {{
                        __CLR4_5_2xxxxlvn1ne7q.R.inc(1318);try
                        {
                            __CLR4_5_2xxxxlvn1ne7q.R.inc(1319);opt.addValueForProcessing(value);
                        }
                        catch (RuntimeException exp)
                        {
                            // if we cannot add the value don't worry about it
                        }
                    }
                }}
                }else {__CLR4_5_2xxxxlvn1ne7q.R.inc(1320);if ((((!("yes".equalsIgnoreCase(value)
                        || "true".equalsIgnoreCase(value)
                        || "1".equalsIgnoreCase(value)))&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1321)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1322)==0&false)))
                {{
                    // if the value is not yes, true or 1 then don't add the
                    // option to the CommandLine
                    __CLR4_5_2xxxxlvn1ne7q.R.inc(1323);continue;
                }

                }}__CLR4_5_2xxxxlvn1ne7q.R.inc(1324);cmd.addOption(opt);
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1325);updateRequiredOptions(opt);
            }
        }}
    }}finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

    /**
     * Throws a {@link MissingOptionException} if all of the required options
     * are not present.
     *
     * @throws MissingOptionException if any of the required Options
     * are not present.
     */
    protected void checkRequiredOptions() throws MissingOptionException
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1326);
        // if there are required options that have not been processsed
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1327);if ((((!getRequiredOptions().isEmpty())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1328)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1329)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1330);throw new MissingOptionException(getRequiredOptions());
        }
    }}finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

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
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1331);
        // loop until an option is found
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1332);while ((((iter.hasNext())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1333)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1334)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1335);String str = (String) iter.next();

            // found an Option, not an argument
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1336);if ((((getOptions().hasOption(str) && str.startsWith("-"))&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1337)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1338)==0&false)))
            {{
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1339);iter.previous();
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1340);break;
            }

            // found a value
            }__CLR4_5_2xxxxlvn1ne7q.R.inc(1341);try
            {
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1342);opt.addValueForProcessing(Util.stripLeadingAndTrailingQuotes(str));
            }
            catch (RuntimeException exp)
            {
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1343);iter.previous();
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1344);break;
            }
        }

        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1345);if ((((opt.getValues() == null && !opt.hasOptionalArg())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1346)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1347)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1348);throw new MissingArgumentException(opt);
        }
    }}finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

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
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1349);
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1350);boolean hasOption = getOptions().hasOption(arg);

        // if there is no option throw an UnrecognisedOptionException
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1351);if ((((!hasOption)&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1352)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1353)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1354);throw new UnrecognizedOptionException("Unrecognized option: " + arg, arg);
        }

        // get the option represented by arg
        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1355);Option opt = (Option) getOptions().getOption(arg).clone();
        
        // update the required options and groups
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1356);updateRequiredOptions(opt);
        
        // if the option takes an argument value
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1357);if ((((opt.hasArg())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1358)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1359)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1360);processArgs(opt, iter);
        }
        
        // set the option on the command line
        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1361);cmd.addOption(opt);
    }finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}

    /**
     * Removes the option or its group from the list of expected elements.
     * 
     * @param opt
     */
    private void updateRequiredOptions(Option opt) throws ParseException
    {try{__CLR4_5_2xxxxlvn1ne7q.R.inc(1362);
        // if the option is a required option remove the option from
        // the requiredOptions list
        __CLR4_5_2xxxxlvn1ne7q.R.inc(1363);if ((((opt.isRequired())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1364)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1365)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1366);getRequiredOptions().remove(opt.getKey());
        }

        // if the option is in an OptionGroup make that option the selected
        // option of the group
        }__CLR4_5_2xxxxlvn1ne7q.R.inc(1367);if ((((getOptions().getOptionGroup(opt) != null)&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1368)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1369)==0&false)))
        {{
            __CLR4_5_2xxxxlvn1ne7q.R.inc(1370);OptionGroup group = getOptions().getOptionGroup(opt);

            __CLR4_5_2xxxxlvn1ne7q.R.inc(1371);if ((((group.isRequired())&&(__CLR4_5_2xxxxlvn1ne7q.R.iget(1372)!=0|true))||(__CLR4_5_2xxxxlvn1ne7q.R.iget(1373)==0&false)))
            {{
                __CLR4_5_2xxxxlvn1ne7q.R.inc(1374);getRequiredOptions().remove(group);
            }

            }__CLR4_5_2xxxxlvn1ne7q.R.inc(1375);group.setSelected(opt);
        }
    }}finally{__CLR4_5_2xxxxlvn1ne7q.R.flushNeeded();}}
}
