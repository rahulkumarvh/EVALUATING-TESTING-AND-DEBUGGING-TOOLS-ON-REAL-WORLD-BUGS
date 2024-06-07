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

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/** 
 * A formatter of help messages for the current command line options
 *
 * @author Slawek Zachcial
 * @author John Keyes (john at integralsource.com)
 * @version $Revision$, $Date$
 */
public class HelpFormatter
{public static class __CLR4_5_24a4alvl36w5l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0032\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402847792L,8589935092L,428,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // --------------------------------------------------------------- Constants

    /** default number of characters per line */
    public static final int DEFAULT_WIDTH = 74;

    /** default padding to the left of each line */
    public static final int DEFAULT_LEFT_PAD = 1;

    /**
     * the number of characters of padding to be prefixed
     * to each description line
     */
    public static final int DEFAULT_DESC_PAD = 3;

    /** the string to display at the begining of the usage statement */
    public static final String DEFAULT_SYNTAX_PREFIX = "usage: ";

    /** default prefix for shortOpts */
    public static final String DEFAULT_OPT_PREFIX = "-";

    /** default prefix for long Option */
    public static final String DEFAULT_LONG_OPT_PREFIX = "--";

    /** default name for an argument */
    public static final String DEFAULT_ARG_NAME = "arg";

    // -------------------------------------------------------------- Attributes

    /**
     * number of characters per line
     *
     * @deprecated Scope will be made private for next major version
     * - use get/setWidth methods instead.
     */
    public int defaultWidth = DEFAULT_WIDTH;

    /**
     * amount of padding to the left of each line
     *
     * @deprecated Scope will be made private for next major version
     * - use get/setLeftPadding methods instead.
     */
    public int defaultLeftPad = DEFAULT_LEFT_PAD;

    /**
     * the number of characters of padding to be prefixed
     * to each description line
     *
     * @deprecated Scope will be made private for next major version
     * - use get/setDescPadding methods instead.
     */
    public int defaultDescPad = DEFAULT_DESC_PAD;

    /**
     * the string to display at the begining of the usage statement
     *
     * @deprecated Scope will be made private for next major version
     * - use get/setSyntaxPrefix methods instead.
     */
    public String defaultSyntaxPrefix = DEFAULT_SYNTAX_PREFIX;

    /**
     * the new line string
     *
     * @deprecated Scope will be made private for next major version
     * - use get/setNewLine methods instead.
     */
    public String defaultNewLine = System.getProperty("line.separator");

    /**
     * the shortOpt prefix
     *
     * @deprecated Scope will be made private for next major version
     * - use get/setOptPrefix methods instead.
     */
    public String defaultOptPrefix = DEFAULT_OPT_PREFIX;

    /**
     * the long Opt prefix
     *
     * @deprecated Scope will be made private for next major version
     * - use get/setLongOptPrefix methods instead.
     */
    public String defaultLongOptPrefix = DEFAULT_LONG_OPT_PREFIX;

    /**
     * the name of the argument
     *
     * @deprecated Scope will be made private for next major version
     * - use get/setArgName methods instead.
     */
    public String defaultArgName = DEFAULT_ARG_NAME;

    /**
     * Comparator used to sort the options when they output in help text
     * 
     * Defaults to case-insensitive alphabetical sorting by option key
     */
    protected Comparator optionComparator = new OptionComparator();

    /**
     * Sets the 'width'.
     *
     * @param width the new value of 'width'
     */
    public void setWidth(int width)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(154);
        __CLR4_5_24a4alvl36w5l.R.inc(155);this.defaultWidth = width;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Returns the 'width'.
     *
     * @return the 'width'
     */
    public int getWidth()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(156);
        __CLR4_5_24a4alvl36w5l.R.inc(157);return defaultWidth;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Sets the 'leftPadding'.
     *
     * @param padding the new value of 'leftPadding'
     */
    public void setLeftPadding(int padding)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(158);
        __CLR4_5_24a4alvl36w5l.R.inc(159);this.defaultLeftPad = padding;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Returns the 'leftPadding'.
     *
     * @return the 'leftPadding'
     */
    public int getLeftPadding()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(160);
        __CLR4_5_24a4alvl36w5l.R.inc(161);return defaultLeftPad;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Sets the 'descPadding'.
     *
     * @param padding the new value of 'descPadding'
     */
    public void setDescPadding(int padding)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(162);
        __CLR4_5_24a4alvl36w5l.R.inc(163);this.defaultDescPad = padding;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Returns the 'descPadding'.
     *
     * @return the 'descPadding'
     */
    public int getDescPadding()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(164);
        __CLR4_5_24a4alvl36w5l.R.inc(165);return defaultDescPad;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Sets the 'syntaxPrefix'.
     *
     * @param prefix the new value of 'syntaxPrefix'
     */
    public void setSyntaxPrefix(String prefix)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(166);
        __CLR4_5_24a4alvl36w5l.R.inc(167);this.defaultSyntaxPrefix = prefix;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Returns the 'syntaxPrefix'.
     *
     * @return the 'syntaxPrefix'
     */
    public String getSyntaxPrefix()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(168);
        __CLR4_5_24a4alvl36w5l.R.inc(169);return defaultSyntaxPrefix;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Sets the 'newLine'.
     *
     * @param newline the new value of 'newLine'
     */
    public void setNewLine(String newline)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(170);
        __CLR4_5_24a4alvl36w5l.R.inc(171);this.defaultNewLine = newline;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Returns the 'newLine'.
     *
     * @return the 'newLine'
     */
    public String getNewLine()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(172);
        __CLR4_5_24a4alvl36w5l.R.inc(173);return defaultNewLine;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Sets the 'optPrefix'.
     *
     * @param prefix the new value of 'optPrefix'
     */
    public void setOptPrefix(String prefix)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(174);
        __CLR4_5_24a4alvl36w5l.R.inc(175);this.defaultOptPrefix = prefix;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Returns the 'optPrefix'.
     *
     * @return the 'optPrefix'
     */
    public String getOptPrefix()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(176);
        __CLR4_5_24a4alvl36w5l.R.inc(177);return defaultOptPrefix;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Sets the 'longOptPrefix'.
     *
     * @param prefix the new value of 'longOptPrefix'
     */
    public void setLongOptPrefix(String prefix)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(178);
        __CLR4_5_24a4alvl36w5l.R.inc(179);this.defaultLongOptPrefix = prefix;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Returns the 'longOptPrefix'.
     *
     * @return the 'longOptPrefix'
     */
    public String getLongOptPrefix()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(180);
        __CLR4_5_24a4alvl36w5l.R.inc(181);return defaultLongOptPrefix;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Sets the 'argName'.
     *
     * @param name the new value of 'argName'
     */
    public void setArgName(String name)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(182);
        __CLR4_5_24a4alvl36w5l.R.inc(183);this.defaultArgName = name;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Returns the 'argName'.
     *
     * @return the 'argName'
     */
    public String getArgName()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(184);
        __CLR4_5_24a4alvl36w5l.R.inc(185);return defaultArgName;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Comparator used to sort the options when they output in help text
     * 
     * Defaults to case-insensitive alphabetical sorting by option key
     */
    public Comparator getOptionComparator()
    {try{__CLR4_5_24a4alvl36w5l.R.inc(186);
        __CLR4_5_24a4alvl36w5l.R.inc(187);return optionComparator;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Set the comparator used to sort the options when they output in help text
     * 
     * Passing in a null parameter will set the ordering to the default mode
     */
    public void setOptionComparator(Comparator comparator)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(188);
        __CLR4_5_24a4alvl36w5l.R.inc(189);if ((((comparator == null)&&(__CLR4_5_24a4alvl36w5l.R.iget(190)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(191)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(192);this.optionComparator = new OptionComparator();
        }
        }else
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(193);this.optionComparator = comparator;
        }
    }}finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.  This method prints help information to
     * System.out.
     *
     * @param cmdLineSyntax the syntax for this application
     * @param options the Options instance
     */
    public void printHelp(String cmdLineSyntax, Options options)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(194);
        __CLR4_5_24a4alvl36w5l.R.inc(195);printHelp(defaultWidth, cmdLineSyntax, null, options, null, false);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.  This method prints help information to 
     * System.out.
     *
     * @param cmdLineSyntax the syntax for this application
     * @param options the Options instance
     * @param autoUsage whether to print an automatically generated
     * usage statement
     */
    public void printHelp(String cmdLineSyntax, Options options, boolean autoUsage)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(196);
        __CLR4_5_24a4alvl36w5l.R.inc(197);printHelp(defaultWidth, cmdLineSyntax, null, options, null, autoUsage);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.  This method prints help information to
     * System.out.
     *
     * @param cmdLineSyntax the syntax for this application
     * @param header the banner to display at the begining of the help
     * @param options the Options instance
     * @param footer the banner to display at the end of the help
     */
    public void printHelp(String cmdLineSyntax, String header, Options options, String footer)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(198);
        __CLR4_5_24a4alvl36w5l.R.inc(199);printHelp(cmdLineSyntax, header, options, footer, false);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.  This method prints help information to 
     * System.out.
     *
     * @param cmdLineSyntax the syntax for this application
     * @param header the banner to display at the begining of the help
     * @param options the Options instance
     * @param footer the banner to display at the end of the help
     * @param autoUsage whether to print an automatically generated
     * usage statement
     */
    public void printHelp(String cmdLineSyntax, String header, Options options, String footer, boolean autoUsage)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(200);
        __CLR4_5_24a4alvl36w5l.R.inc(201);printHelp(defaultWidth, cmdLineSyntax, header, options, footer, autoUsage);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.  This method prints help information to
     * System.out.
     *
     * @param width the number of characters to be displayed on each line
     * @param cmdLineSyntax the syntax for this application
     * @param header the banner to display at the begining of the help
     * @param options the Options instance
     * @param footer the banner to display at the end of the help
     */
    public void printHelp(int width, String cmdLineSyntax, String header, Options options, String footer)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(202);
        __CLR4_5_24a4alvl36w5l.R.inc(203);printHelp(width, cmdLineSyntax, header, options, footer, false);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.  This method prints help information to
     * System.out.
     *
     * @param width the number of characters to be displayed on each line
     * @param cmdLineSyntax the syntax for this application
     * @param header the banner to display at the begining of the help
     * @param options the Options instance
     * @param footer the banner to display at the end of the help
     * @param autoUsage whether to print an automatically generated 
     * usage statement
     */
    public void printHelp(int width, String cmdLineSyntax, String header,
                          Options options, String footer, boolean autoUsage)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(204);
        __CLR4_5_24a4alvl36w5l.R.inc(205);PrintWriter pw = new PrintWriter(System.out);

        __CLR4_5_24a4alvl36w5l.R.inc(206);printHelp(pw, width, cmdLineSyntax, header, options, defaultLeftPad, defaultDescPad, footer, autoUsage);
        __CLR4_5_24a4alvl36w5l.R.inc(207);pw.flush();
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.
     *
     * @param pw the writer to which the help will be written
     * @param width the number of characters to be displayed on each line
     * @param cmdLineSyntax the syntax for this application
     * @param header the banner to display at the begining of the help
     * @param options the Options instance
     * @param leftPad the number of characters of padding to be prefixed
     * to each line
     * @param descPad the number of characters of padding to be prefixed
     * to each description line
     * @param footer the banner to display at the end of the help
     */
    public void printHelp(PrintWriter pw, int width, String cmdLineSyntax, 
                          String header, Options options, int leftPad, 
                          int descPad, String footer)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(208);
        __CLR4_5_24a4alvl36w5l.R.inc(209);printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, false);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}


    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.
     *
     * @param pw the writer to which the help will be written
     * @param width the number of characters to be displayed on each line
     * @param cmdLineSyntax the syntax for this application
     * @param header the banner to display at the begining of the help
     * @param options the Options instance
     * @param leftPad the number of characters of padding to be prefixed
     * to each line
     * @param descPad the number of characters of padding to be prefixed
     * to each description line
     * @param footer the banner to display at the end of the help
     * @param autoUsage whether to print an automatically generated
     * usage statement
     */
    public void printHelp(PrintWriter pw, int width, String cmdLineSyntax,
                          String header, Options options, int leftPad,
                          int descPad, String footer, boolean autoUsage)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(210);
        __CLR4_5_24a4alvl36w5l.R.inc(211);if (((((cmdLineSyntax == null) || (cmdLineSyntax.length() == 0))&&(__CLR4_5_24a4alvl36w5l.R.iget(212)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(213)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(214);throw new IllegalArgumentException("cmdLineSyntax not provided");
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(215);if ((((autoUsage)&&(__CLR4_5_24a4alvl36w5l.R.iget(216)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(217)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(218);printUsage(pw, width, cmdLineSyntax, options);
        }
        }else
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(219);printUsage(pw, width, cmdLineSyntax);
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(220);if (((((header != null) && (header.trim().length() > 0))&&(__CLR4_5_24a4alvl36w5l.R.iget(221)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(222)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(223);printWrapped(pw, width, header);
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(224);printOptions(pw, width, options, leftPad, descPad);

        __CLR4_5_24a4alvl36w5l.R.inc(225);if (((((footer != null) && (footer.trim().length() > 0))&&(__CLR4_5_24a4alvl36w5l.R.iget(226)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(227)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(228);printWrapped(pw, width, footer);
        }
    }}finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * <p>Prints the usage statement for the specified application.</p>
     *
     * @param pw The PrintWriter to print the usage statement 
     * @param width The number of characters to display per line
     * @param app The application name
     * @param options The command line Options
     *
     */
    public void printUsage(PrintWriter pw, int width, String app, Options options)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(229);
        // initialise the string buffer
        __CLR4_5_24a4alvl36w5l.R.inc(230);StringBuffer buff = new StringBuffer(defaultSyntaxPrefix).append(app).append(" ");

        // create a list for processed option groups
        __CLR4_5_24a4alvl36w5l.R.inc(231);final Collection processedGroups = new ArrayList();

        // temp variable
        __CLR4_5_24a4alvl36w5l.R.inc(232);Option option;

        __CLR4_5_24a4alvl36w5l.R.inc(233);List optList = new ArrayList(options.getOptions());
        __CLR4_5_24a4alvl36w5l.R.inc(234);Collections.sort(optList, getOptionComparator());
        // iterate over the options
        __CLR4_5_24a4alvl36w5l.R.inc(235);for (Iterator i = optList.iterator(); (((i.hasNext())&&(__CLR4_5_24a4alvl36w5l.R.iget(236)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(237)==0&false));)
        {{
            // get the next Option
            __CLR4_5_24a4alvl36w5l.R.inc(238);option = (Option) i.next();

            // check if the option is part of an OptionGroup
            __CLR4_5_24a4alvl36w5l.R.inc(239);OptionGroup group = options.getOptionGroup(option);

            // if the option is part of a group 
            __CLR4_5_24a4alvl36w5l.R.inc(240);if ((((group != null)&&(__CLR4_5_24a4alvl36w5l.R.iget(241)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(242)==0&false)))
            {{
                // and if the group has not already been processed
                __CLR4_5_24a4alvl36w5l.R.inc(243);if ((((!processedGroups.contains(group))&&(__CLR4_5_24a4alvl36w5l.R.iget(244)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(245)==0&false)))
                {{
                    // add the group to the processed list
                    __CLR4_5_24a4alvl36w5l.R.inc(246);processedGroups.add(group);


                    // add the usage clause
                    __CLR4_5_24a4alvl36w5l.R.inc(247);appendOptionGroup(buff, group);
                }

                // otherwise the option was displayed in the group
                // previously so ignore it.
            }}

            // if the Option is not part of an OptionGroup
            }else
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(248);appendOption(buff, option, option.isRequired());
            }

            }__CLR4_5_24a4alvl36w5l.R.inc(249);if ((((i.hasNext())&&(__CLR4_5_24a4alvl36w5l.R.iget(250)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(251)==0&false)))
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(252);buff.append(" ");
            }
        }}


        // call printWrapped
        }__CLR4_5_24a4alvl36w5l.R.inc(253);printWrapped(pw, width, buff.toString().indexOf(' ') + 1, buff.toString());
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Appends the usage clause for an OptionGroup to a StringBuffer.  
     * The clause is wrapped in square brackets if the group is required.
     * The display of the options is handled by appendOption
     * @param buff the StringBuffer to append to
     * @param group the group to append
     * @see #appendOption(StringBuffer,Option,boolean)
     */
    private void appendOptionGroup(final StringBuffer buff, final OptionGroup group)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(254);
        __CLR4_5_24a4alvl36w5l.R.inc(255);if ((((!group.isRequired())&&(__CLR4_5_24a4alvl36w5l.R.iget(256)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(257)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(258);buff.append("[");
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(259);List optList = new ArrayList(group.getOptions());
        __CLR4_5_24a4alvl36w5l.R.inc(260);Collections.sort(optList, getOptionComparator());
        // for each option in the OptionGroup
        __CLR4_5_24a4alvl36w5l.R.inc(261);for (Iterator i = optList.iterator(); (((i.hasNext())&&(__CLR4_5_24a4alvl36w5l.R.iget(262)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(263)==0&false));)
        {{
            // whether the option is required or not is handled at group level
            __CLR4_5_24a4alvl36w5l.R.inc(264);appendOption(buff, (Option) i.next(), true);

            __CLR4_5_24a4alvl36w5l.R.inc(265);if ((((i.hasNext())&&(__CLR4_5_24a4alvl36w5l.R.iget(266)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(267)==0&false)))
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(268);buff.append(" | ");
            }
        }}

        }__CLR4_5_24a4alvl36w5l.R.inc(269);if ((((!group.isRequired())&&(__CLR4_5_24a4alvl36w5l.R.iget(270)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(271)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(272);buff.append("]");
        }
    }}finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Appends the usage clause for an Option to a StringBuffer.  
     *
     * @param buff the StringBuffer to append to
     * @param option the Option to append
     * @param required whether the Option is required or not
     */
    private static void appendOption(final StringBuffer buff, final Option option, final boolean required)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(273);
        __CLR4_5_24a4alvl36w5l.R.inc(274);if ((((!required)&&(__CLR4_5_24a4alvl36w5l.R.iget(275)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(276)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(277);buff.append("[");
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(278);if ((((option.getOpt() != null)&&(__CLR4_5_24a4alvl36w5l.R.iget(279)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(280)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(281);buff.append("-").append(option.getOpt());
        }
        }else
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(282);buff.append("--").append(option.getLongOpt());
        }

        // if the Option has a value
        }__CLR4_5_24a4alvl36w5l.R.inc(283);if ((((option.hasArg() && option.hasArgName())&&(__CLR4_5_24a4alvl36w5l.R.iget(284)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(285)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(286);buff.append(" <").append(option.getArgName()).append(">");
        }

        // if the Option is not a required option
        }__CLR4_5_24a4alvl36w5l.R.inc(287);if ((((!required)&&(__CLR4_5_24a4alvl36w5l.R.iget(288)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(289)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(290);buff.append("]");
        }
    }}finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the cmdLineSyntax to the specified writer, using the
     * specified width.
     *
     * @param pw The printWriter to write the help to
     * @param width The number of characters per line for the usage statement.
     * @param cmdLineSyntax The usage statement.
     */
    public void printUsage(PrintWriter pw, int width, String cmdLineSyntax)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(291);
        __CLR4_5_24a4alvl36w5l.R.inc(292);int argPos = cmdLineSyntax.indexOf(' ') + 1;

        __CLR4_5_24a4alvl36w5l.R.inc(293);printWrapped(pw, width, defaultSyntaxPrefix.length() + argPos, defaultSyntaxPrefix + cmdLineSyntax);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * <p>Print the help for the specified Options to the specified writer, 
     * using the specified width, left padding and description padding.</p>
     *
     * @param pw The printWriter to write the help to
     * @param width The number of characters to display per line
     * @param options The command line Options
     * @param leftPad the number of characters of padding to be prefixed
     * to each line
     * @param descPad the number of characters of padding to be prefixed
     * to each description line
     */
    public void printOptions(PrintWriter pw, int width, Options options, 
                             int leftPad, int descPad)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(294);
        __CLR4_5_24a4alvl36w5l.R.inc(295);StringBuffer sb = new StringBuffer();

        __CLR4_5_24a4alvl36w5l.R.inc(296);renderOptions(sb, width, options, leftPad, descPad);
        __CLR4_5_24a4alvl36w5l.R.inc(297);pw.println(sb.toString());
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the specified text to the specified PrintWriter.
     *
     * @param pw The printWriter to write the help to
     * @param width The number of characters to display per line
     * @param text The text to be written to the PrintWriter
     */
    public void printWrapped(PrintWriter pw, int width, String text)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(298);
        __CLR4_5_24a4alvl36w5l.R.inc(299);printWrapped(pw, width, 0, text);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Print the specified text to the specified PrintWriter.
     *
     * @param pw The printWriter to write the help to
     * @param width The number of characters to display per line
     * @param nextLineTabStop The position on the next line for the first tab.
     * @param text The text to be written to the PrintWriter
     */
    public void printWrapped(PrintWriter pw, int width, int nextLineTabStop, String text)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(300);
        __CLR4_5_24a4alvl36w5l.R.inc(301);StringBuffer sb = new StringBuffer(text.length());

        __CLR4_5_24a4alvl36w5l.R.inc(302);renderWrappedText(sb, width, nextLineTabStop, text);
        __CLR4_5_24a4alvl36w5l.R.inc(303);pw.println(sb.toString());
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    // --------------------------------------------------------------- Protected

    /**
     * Render the specified Options and return the rendered Options
     * in a StringBuffer.
     *
     * @param sb The StringBuffer to place the rendered Options into.
     * @param width The number of characters to display per line
     * @param options The command line Options
     * @param leftPad the number of characters of padding to be prefixed
     * to each line
     * @param descPad the number of characters of padding to be prefixed
     * to each description line
     *
     * @return the StringBuffer with the rendered Options contents.
     */
    protected StringBuffer renderOptions(StringBuffer sb, int width, Options options, int leftPad, int descPad)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(304);
        __CLR4_5_24a4alvl36w5l.R.inc(305);final String lpad = createPadding(leftPad);
        __CLR4_5_24a4alvl36w5l.R.inc(306);final String dpad = createPadding(descPad);

        // first create list containing only <lpad>-a,--aaa where 
        // -a is opt and --aaa is long opt; in parallel look for 
        // the longest opt string this list will be then used to 
        // sort options ascending
        __CLR4_5_24a4alvl36w5l.R.inc(307);int max = 0;
        __CLR4_5_24a4alvl36w5l.R.inc(308);StringBuffer optBuf;
        __CLR4_5_24a4alvl36w5l.R.inc(309);List prefixList = new ArrayList();

        __CLR4_5_24a4alvl36w5l.R.inc(310);List optList = options.helpOptions();

        __CLR4_5_24a4alvl36w5l.R.inc(311);Collections.sort(optList, getOptionComparator());

        __CLR4_5_24a4alvl36w5l.R.inc(312);for (Iterator i = optList.iterator(); (((i.hasNext())&&(__CLR4_5_24a4alvl36w5l.R.iget(313)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(314)==0&false));)
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(315);Option option = (Option) i.next();
            __CLR4_5_24a4alvl36w5l.R.inc(316);optBuf = new StringBuffer(8);

            __CLR4_5_24a4alvl36w5l.R.inc(317);if ((((option.getOpt() == null)&&(__CLR4_5_24a4alvl36w5l.R.iget(318)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(319)==0&false)))
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(320);optBuf.append(lpad).append("   " + defaultLongOptPrefix).append(option.getLongOpt());
            }
            }else
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(321);optBuf.append(lpad).append(defaultOptPrefix).append(option.getOpt());

                __CLR4_5_24a4alvl36w5l.R.inc(322);if ((((option.hasLongOpt())&&(__CLR4_5_24a4alvl36w5l.R.iget(323)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(324)==0&false)))
                {{
                    __CLR4_5_24a4alvl36w5l.R.inc(325);optBuf.append(',').append(defaultLongOptPrefix).append(option.getLongOpt());
                }
            }}

            }__CLR4_5_24a4alvl36w5l.R.inc(326);if ((((option.hasArg())&&(__CLR4_5_24a4alvl36w5l.R.iget(327)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(328)==0&false)))
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(329);if ((((option.hasArgName())&&(__CLR4_5_24a4alvl36w5l.R.iget(330)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(331)==0&false)))
                {{
                    __CLR4_5_24a4alvl36w5l.R.inc(332);optBuf.append(" <").append(option.getArgName()).append(">");
                }
                }else
                {{
                    __CLR4_5_24a4alvl36w5l.R.inc(333);optBuf.append(' ');
                }
            }}

            }__CLR4_5_24a4alvl36w5l.R.inc(334);prefixList.add(optBuf);
            __CLR4_5_24a4alvl36w5l.R.inc(335);max = ((((optBuf.length() > max) )&&(__CLR4_5_24a4alvl36w5l.R.iget(336)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(337)==0&false))? optBuf.length() : max;
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(338);int x = 0;

        __CLR4_5_24a4alvl36w5l.R.inc(339);for (Iterator i = optList.iterator(); (((i.hasNext())&&(__CLR4_5_24a4alvl36w5l.R.iget(340)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(341)==0&false));)
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(342);Option option = (Option) i.next();
            __CLR4_5_24a4alvl36w5l.R.inc(343);optBuf = new StringBuffer(prefixList.get(x++).toString());

            __CLR4_5_24a4alvl36w5l.R.inc(344);if ((((optBuf.length() < max)&&(__CLR4_5_24a4alvl36w5l.R.iget(345)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(346)==0&false)))
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(347);optBuf.append(createPadding(max - optBuf.length()));
            }

            }__CLR4_5_24a4alvl36w5l.R.inc(348);optBuf.append(dpad);

            __CLR4_5_24a4alvl36w5l.R.inc(349);int nextLineTabStop = max + descPad;

            __CLR4_5_24a4alvl36w5l.R.inc(350);if ((((option.getDescription() != null)&&(__CLR4_5_24a4alvl36w5l.R.iget(351)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(352)==0&false)))
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(353);optBuf.append(option.getDescription());
            }

            }__CLR4_5_24a4alvl36w5l.R.inc(354);renderWrappedText(sb, width, nextLineTabStop, optBuf.toString());

            __CLR4_5_24a4alvl36w5l.R.inc(355);if ((((i.hasNext())&&(__CLR4_5_24a4alvl36w5l.R.iget(356)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(357)==0&false)))
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(358);sb.append(defaultNewLine);
            }
        }}

        }__CLR4_5_24a4alvl36w5l.R.inc(359);return sb;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Render the specified text and return the rendered Options
     * in a StringBuffer.
     *
     * @param sb The StringBuffer to place the rendered text into.
     * @param width The number of characters to display per line
     * @param nextLineTabStop The position on the next line for the first tab.
     * @param text The text to be rendered.
     *
     * @return the StringBuffer with the rendered Options contents.
     */
    protected StringBuffer renderWrappedText(StringBuffer sb, int width, 
                                             int nextLineTabStop, String text)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(360);
        __CLR4_5_24a4alvl36w5l.R.inc(361);int pos = findWrapPos(text, width, 0);

        __CLR4_5_24a4alvl36w5l.R.inc(362);if ((((pos == -1)&&(__CLR4_5_24a4alvl36w5l.R.iget(363)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(364)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(365);sb.append(rtrim(text));

            __CLR4_5_24a4alvl36w5l.R.inc(366);return sb;
        }
        }__CLR4_5_24a4alvl36w5l.R.inc(367);sb.append(rtrim(text.substring(0, pos))).append(defaultNewLine);

        // all following lines must be padded with nextLineTabStop space 
        // characters
        __CLR4_5_24a4alvl36w5l.R.inc(368);final String padding = createPadding(nextLineTabStop);

        __CLR4_5_24a4alvl36w5l.R.inc(369);while (true)
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(370);text = padding + text.substring(pos).trim();
            __CLR4_5_24a4alvl36w5l.R.inc(371);pos = findWrapPos(text, width, 0);

            __CLR4_5_24a4alvl36w5l.R.inc(372);if ((((pos == -1)&&(__CLR4_5_24a4alvl36w5l.R.iget(373)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(374)==0&false)))
            {{
                __CLR4_5_24a4alvl36w5l.R.inc(375);sb.append(text);

                __CLR4_5_24a4alvl36w5l.R.inc(376);return sb;
            }

            }__CLR4_5_24a4alvl36w5l.R.inc(377);sb.append(rtrim(text.substring(0, pos))).append(defaultNewLine);
        }
    }}finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Finds the next text wrap position after <code>startPos</code> for the
     * text in <code>text</code> with the column width <code>width</code>.
     * The wrap point is the last postion before startPos+width having a 
     * whitespace character (space, \n, \r).
     *
     * @param text The text being searched for the wrap position
     * @param width width of the wrapped text
     * @param startPos position from which to start the lookup whitespace
     * character
     * @return postion on which the text must be wrapped or -1 if the wrap
     * position is at the end of the text
     */
    protected int findWrapPos(String text, int width, int startPos)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(378);
        __CLR4_5_24a4alvl36w5l.R.inc(379);int pos = -1;

        // the line ends before the max wrap pos or a new line char found
        __CLR4_5_24a4alvl36w5l.R.inc(380);if (((pos = text.indexOf('\n', startPos)) != -1 && pos <= width)
                || ((pos = text.indexOf('\t', startPos)) != -1 && pos <= width))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(383);return pos + 1;
        }
        }else {__CLR4_5_24a4alvl36w5l.R.inc(384);if ((((startPos + width >= text.length())&&(__CLR4_5_24a4alvl36w5l.R.iget(385)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(386)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(387);return -1;
        }


        // look for the last whitespace character before startPos+width
        }}__CLR4_5_24a4alvl36w5l.R.inc(388);pos = startPos + width;

        __CLR4_5_24a4alvl36w5l.R.inc(389);char c;

        __CLR4_5_24a4alvl36w5l.R.inc(390);while ((pos >= startPos) && ((c = text.charAt(pos)) != ' ')
                && (c != '\n') && (c != '\r'))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(393);--pos;
        }

        // if we found it - just return
        }__CLR4_5_24a4alvl36w5l.R.inc(394);if ((((pos > startPos)&&(__CLR4_5_24a4alvl36w5l.R.iget(395)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(396)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(397);return pos;
        }
        
        // must look for the first whitespace chearacter after startPos 
        // + width
        }__CLR4_5_24a4alvl36w5l.R.inc(398);pos = startPos + width;

        __CLR4_5_24a4alvl36w5l.R.inc(399);while ((pos <= text.length()) && ((c = text.charAt(pos)) != ' ')
               && (c != '\n') && (c != '\r'))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(402);++pos;
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(403);return ((((pos == text.length()) )&&(__CLR4_5_24a4alvl36w5l.R.iget(404)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(405)==0&false))? (-1) : pos;
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Return a String of padding of length <code>len</code>.
     *
     * @param len The length of the String of padding to create.
     *
     * @return The String of padding
     */
    protected String createPadding(int len)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(406);
        __CLR4_5_24a4alvl36w5l.R.inc(407);StringBuffer sb = new StringBuffer(len);

        __CLR4_5_24a4alvl36w5l.R.inc(408);for (int i = 0; (((i < len)&&(__CLR4_5_24a4alvl36w5l.R.iget(409)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(410)==0&false)); ++i)
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(411);sb.append(' ');
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(412);return sb.toString();
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    /**
     * Remove the trailing whitespace from the specified String.
     *
     * @param s The String to remove the trailing padding from.
     *
     * @return The String of without the trailing padding
     */
    protected String rtrim(String s)
    {try{__CLR4_5_24a4alvl36w5l.R.inc(413);
        __CLR4_5_24a4alvl36w5l.R.inc(414);if (((((s == null) || (s.length() == 0))&&(__CLR4_5_24a4alvl36w5l.R.iget(415)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(416)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(417);return s;
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(418);int pos = s.length();

        __CLR4_5_24a4alvl36w5l.R.inc(419);while (((((pos > 0) && Character.isWhitespace(s.charAt(pos - 1)))&&(__CLR4_5_24a4alvl36w5l.R.iget(420)!=0|true))||(__CLR4_5_24a4alvl36w5l.R.iget(421)==0&false)))
        {{
            __CLR4_5_24a4alvl36w5l.R.inc(422);--pos;
        }

        }__CLR4_5_24a4alvl36w5l.R.inc(423);return s.substring(0, pos);
    }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}

    // ------------------------------------------------------ Package protected
    // ---------------------------------------------------------------- Private
    // ---------------------------------------------------------- Inner classes
    /**
     * This class implements the <code>Comparator</code> interface
     * for comparing Options.
     */
    private static class OptionComparator implements Comparator
    {

        /**
         * Compares its two arguments for order. Returns a negative
         * integer, zero, or a positive integer as the first argument
         * is less than, equal to, or greater than the second.
         *
         * @param o1 The first Option to be compared.
         * @param o2 The second Option to be compared.
         * @return a negative integer, zero, or a positive integer as
         *         the first argument is less than, equal to, or greater than the
         *         second.
         */
        public int compare(Object o1, Object o2)
        {try{__CLR4_5_24a4alvl36w5l.R.inc(424);
            __CLR4_5_24a4alvl36w5l.R.inc(425);Option opt1 = (Option) o1;
            __CLR4_5_24a4alvl36w5l.R.inc(426);Option opt2 = (Option) o2;

            __CLR4_5_24a4alvl36w5l.R.inc(427);return opt1.getKey().compareToIgnoreCase(opt2.getKey());
        }finally{__CLR4_5_24a4alvl36w5l.R.flushNeeded();}}
    }
}
