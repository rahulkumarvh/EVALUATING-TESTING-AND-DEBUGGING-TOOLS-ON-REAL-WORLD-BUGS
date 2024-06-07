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
{public static class __CLR4_5_2c4c4lvn1n5n7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521179989L,8589935092L,728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    /** the string to display at the beginning of the usage statement */
    public static final String DEFAULT_SYNTAX_PREFIX = "usage: ";

    /** default prefix for shortOpts */
    public static final String DEFAULT_OPT_PREFIX = "-";

    /** default prefix for long Option */
    public static final String DEFAULT_LONG_OPT_PREFIX = "--";

    /** default separator displayed between a long Option and its value */
    public static final String DEFAULT_LONG_OPT_SEPARATOR = " ";

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

    /** The separator displayed between the long option and its value. */
    private String longOptSeparator = DEFAULT_LONG_OPT_SEPARATOR;

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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(436);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(437);this.defaultWidth = width;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the 'width'.
     *
     * @return the 'width'
     */
    public int getWidth()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(438);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(439);return defaultWidth;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Sets the 'leftPadding'.
     *
     * @param padding the new value of 'leftPadding'
     */
    public void setLeftPadding(int padding)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(440);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(441);this.defaultLeftPad = padding;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the 'leftPadding'.
     *
     * @return the 'leftPadding'
     */
    public int getLeftPadding()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(442);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(443);return defaultLeftPad;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Sets the 'descPadding'.
     *
     * @param padding the new value of 'descPadding'
     */
    public void setDescPadding(int padding)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(444);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(445);this.defaultDescPad = padding;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the 'descPadding'.
     *
     * @return the 'descPadding'
     */
    public int getDescPadding()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(446);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(447);return defaultDescPad;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Sets the 'syntaxPrefix'.
     *
     * @param prefix the new value of 'syntaxPrefix'
     */
    public void setSyntaxPrefix(String prefix)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(448);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(449);this.defaultSyntaxPrefix = prefix;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the 'syntaxPrefix'.
     *
     * @return the 'syntaxPrefix'
     */
    public String getSyntaxPrefix()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(450);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(451);return defaultSyntaxPrefix;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Sets the 'newLine'.
     *
     * @param newline the new value of 'newLine'
     */
    public void setNewLine(String newline)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(452);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(453);this.defaultNewLine = newline;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the 'newLine'.
     *
     * @return the 'newLine'
     */
    public String getNewLine()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(454);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(455);return defaultNewLine;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Sets the 'optPrefix'.
     *
     * @param prefix the new value of 'optPrefix'
     */
    public void setOptPrefix(String prefix)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(456);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(457);this.defaultOptPrefix = prefix;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the 'optPrefix'.
     *
     * @return the 'optPrefix'
     */
    public String getOptPrefix()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(458);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(459);return defaultOptPrefix;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Sets the 'longOptPrefix'.
     *
     * @param prefix the new value of 'longOptPrefix'
     */
    public void setLongOptPrefix(String prefix)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(460);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(461);this.defaultLongOptPrefix = prefix;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the 'longOptPrefix'.
     *
     * @return the 'longOptPrefix'
     */
    public String getLongOptPrefix()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(462);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(463);return defaultLongOptPrefix;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Set the separator displayed between a long option and its value.
     * Ensure that the separator specified is supported by the parser used,
     * typically ' ' or '='.
     * 
     * @param longOptSeparator the separator, typically ' ' or '='.
     * @since 1.3
     */
    public void setLongOptSeparator(String longOptSeparator)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(464);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(465);this.longOptSeparator = longOptSeparator;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the separator displayed between a long option and its value.
     * 
     * @return the separator
     * @since 1.3
     */
    public String getLongOptSeparator()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(466);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(467);return longOptSeparator;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Sets the 'argName'.
     *
     * @param name the new value of 'argName'
     */
    public void setArgName(String name)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(468);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(469);this.defaultArgName = name;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Returns the 'argName'.
     *
     * @return the 'argName'
     */
    public String getArgName()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(470);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(471);return defaultArgName;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Comparator used to sort the options when they output in help text.
     * Defaults to case-insensitive alphabetical sorting by option key.
     * 
     * @since 1.2
     */
    public Comparator getOptionComparator()
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(472);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(473);return optionComparator;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Set the comparator used to sort the options when they output in help text.
     * Passing in a null parameter will set the ordering to the default mode.
     * 
     * @since 1.2
     */
    public void setOptionComparator(Comparator comparator)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(474);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(475);if ((((comparator == null)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(476)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(477)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(478);this.optionComparator = new OptionComparator();
        }
        }else
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(479);this.optionComparator = comparator;
        }
    }}finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.  This method prints help information to
     * System.out.
     *
     * @param cmdLineSyntax the syntax for this application
     * @param options the Options instance
     */
    public void printHelp(String cmdLineSyntax, Options options)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(480);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(481);printHelp(defaultWidth, cmdLineSyntax, null, options, null, false);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(482);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(483);printHelp(defaultWidth, cmdLineSyntax, null, options, null, autoUsage);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(484);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(485);printHelp(cmdLineSyntax, header, options, footer, false);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(486);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(487);printHelp(defaultWidth, cmdLineSyntax, header, options, footer, autoUsage);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Print the help for <code>options</code> with the specified
     * command line syntax.  This method prints help information to
     * System.out.
     *
     * @param width the number of characters to be displayed on each line
     * @param cmdLineSyntax the syntax for this application
     * @param header the banner to display at the beginning of the help
     * @param options the Options instance
     * @param footer the banner to display at the end of the help
     */
    public void printHelp(int width, String cmdLineSyntax, String header, Options options, String footer)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(488);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(489);printHelp(width, cmdLineSyntax, header, options, footer, false);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(490);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(491);PrintWriter pw = new PrintWriter(System.out);

        __CLR4_5_2c4c4lvn1n5n7.R.inc(492);printHelp(pw, width, cmdLineSyntax, header, options, defaultLeftPad, defaultDescPad, footer, autoUsage);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(493);pw.flush();
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
     *
     * @throws IllegalStateException if there is no room to print a line
     */
    public void printHelp(PrintWriter pw, int width, String cmdLineSyntax, 
                          String header, Options options, int leftPad, 
                          int descPad, String footer)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(494);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(495);printHelp(pw, width, cmdLineSyntax, header, options, leftPad, descPad, footer, false);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}


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
     *
     * @throws IllegalStateException if there is no room to print a line
     */
    public void printHelp(PrintWriter pw, int width, String cmdLineSyntax,
                          String header, Options options, int leftPad,
                          int descPad, String footer, boolean autoUsage)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(496);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(497);if (((((cmdLineSyntax == null) || (cmdLineSyntax.length() == 0))&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(498)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(499)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(500);throw new IllegalArgumentException("cmdLineSyntax not provided");
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(501);if ((((autoUsage)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(502)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(503)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(504);printUsage(pw, width, cmdLineSyntax, options);
        }
        }else
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(505);printUsage(pw, width, cmdLineSyntax);
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(506);if (((((header != null) && (header.trim().length() > 0))&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(507)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(508)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(509);printWrapped(pw, width, header);
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(510);printOptions(pw, width, options, leftPad, descPad);

        __CLR4_5_2c4c4lvn1n5n7.R.inc(511);if (((((footer != null) && (footer.trim().length() > 0))&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(512)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(513)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(514);printWrapped(pw, width, footer);
        }
    }}finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Prints the usage statement for the specified application.
     *
     * @param pw The PrintWriter to print the usage statement 
     * @param width The number of characters to display per line
     * @param app The application name
     * @param options The command line Options
     */
    public void printUsage(PrintWriter pw, int width, String app, Options options)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(515);
        // initialise the string buffer
        __CLR4_5_2c4c4lvn1n5n7.R.inc(516);StringBuffer buff = new StringBuffer(defaultSyntaxPrefix).append(app).append(" ");

        // create a list for processed option groups
        __CLR4_5_2c4c4lvn1n5n7.R.inc(517);final Collection processedGroups = new ArrayList();

        // temp variable
        __CLR4_5_2c4c4lvn1n5n7.R.inc(518);Option option;

        __CLR4_5_2c4c4lvn1n5n7.R.inc(519);List optList = new ArrayList(options.getOptions());
        __CLR4_5_2c4c4lvn1n5n7.R.inc(520);Collections.sort(optList, getOptionComparator());
        // iterate over the options
        __CLR4_5_2c4c4lvn1n5n7.R.inc(521);for (Iterator i = optList.iterator(); (((i.hasNext())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(522)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(523)==0&false));)
        {{
            // get the next Option
            __CLR4_5_2c4c4lvn1n5n7.R.inc(524);option = (Option) i.next();

            // check if the option is part of an OptionGroup
            __CLR4_5_2c4c4lvn1n5n7.R.inc(525);OptionGroup group = options.getOptionGroup(option);

            // if the option is part of a group 
            __CLR4_5_2c4c4lvn1n5n7.R.inc(526);if ((((group != null)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(527)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(528)==0&false)))
            {{
                // and if the group has not already been processed
                __CLR4_5_2c4c4lvn1n5n7.R.inc(529);if ((((!processedGroups.contains(group))&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(530)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(531)==0&false)))
                {{
                    // add the group to the processed list
                    __CLR4_5_2c4c4lvn1n5n7.R.inc(532);processedGroups.add(group);


                    // add the usage clause
                    __CLR4_5_2c4c4lvn1n5n7.R.inc(533);appendOptionGroup(buff, group);
                }

                // otherwise the option was displayed in the group
                // previously so ignore it.
            }}

            // if the Option is not part of an OptionGroup
            }else
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(534);appendOption(buff, option, option.isRequired());
            }

            }__CLR4_5_2c4c4lvn1n5n7.R.inc(535);if ((((i.hasNext())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(536)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(537)==0&false)))
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(538);buff.append(" ");
            }
        }}


        // call printWrapped
        }__CLR4_5_2c4c4lvn1n5n7.R.inc(539);printWrapped(pw, width, buff.toString().indexOf(' ') + 1, buff.toString());
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Appends the usage clause for an OptionGroup to a StringBuffer.  
     * The clause is wrapped in square brackets if the group is required.
     * The display of the options is handled by appendOption
     * @param buff the StringBuffer to append to
     * @param group the group to append
     * @see #appendOption(StringBuffer,Option,boolean)
     */
    private void appendOptionGroup(final StringBuffer buff, final OptionGroup group)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(540);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(541);if ((((!group.isRequired())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(542)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(543)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(544);buff.append("[");
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(545);List optList = new ArrayList(group.getOptions());
        __CLR4_5_2c4c4lvn1n5n7.R.inc(546);Collections.sort(optList, getOptionComparator());
        // for each option in the OptionGroup
        __CLR4_5_2c4c4lvn1n5n7.R.inc(547);for (Iterator i = optList.iterator(); (((i.hasNext())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(548)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(549)==0&false));)
        {{
            // whether the option is required or not is handled at group level
            __CLR4_5_2c4c4lvn1n5n7.R.inc(550);appendOption(buff, (Option) i.next(), true);

            __CLR4_5_2c4c4lvn1n5n7.R.inc(551);if ((((i.hasNext())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(552)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(553)==0&false)))
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(554);buff.append(" | ");
            }
        }}

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(555);if ((((!group.isRequired())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(556)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(557)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(558);buff.append("]");
        }
    }}finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Appends the usage clause for an Option to a StringBuffer.  
     *
     * @param buff the StringBuffer to append to
     * @param option the Option to append
     * @param required whether the Option is required or not
     */
    private void appendOption(final StringBuffer buff, final Option option, final boolean required)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(559);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(560);if ((((!required)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(561)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(562)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(563);buff.append("[");
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(564);if ((((option.getOpt() != null)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(565)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(566)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(567);buff.append("-").append(option.getOpt());
        }
        }else
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(568);buff.append("--").append(option.getLongOpt());
        }

        // if the Option has a value
        }__CLR4_5_2c4c4lvn1n5n7.R.inc(569);if ((((option.hasArg() && option.hasArgName())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(570)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(571)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(572);buff.append((((option.getOpt() == null )&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(573)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(574)==0&false))? longOptSeparator : " ");
            __CLR4_5_2c4c4lvn1n5n7.R.inc(575);buff.append("<").append(option.getArgName()).append(">");
        }

        // if the Option is not a required option
        }__CLR4_5_2c4c4lvn1n5n7.R.inc(576);if ((((!required)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(577)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(578)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(579);buff.append("]");
        }
    }}finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}
    
    /**
     * Print the cmdLineSyntax to the specified writer, using the
     * specified width.
     *
     * @param pw The printWriter to write the help to
     * @param width The number of characters per line for the usage statement.
     * @param cmdLineSyntax The usage statement.
     */
    public void printUsage(PrintWriter pw, int width, String cmdLineSyntax)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(580);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(581);int argPos = cmdLineSyntax.indexOf(' ') + 1;

        __CLR4_5_2c4c4lvn1n5n7.R.inc(582);printWrapped(pw, width, defaultSyntaxPrefix.length() + argPos, defaultSyntaxPrefix + cmdLineSyntax);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Print the help for the specified Options to the specified writer, 
     * using the specified width, left padding and description padding.
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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(583);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(584);StringBuffer sb = new StringBuffer();

        __CLR4_5_2c4c4lvn1n5n7.R.inc(585);renderOptions(sb, width, options, leftPad, descPad);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(586);pw.println(sb.toString());
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Print the specified text to the specified PrintWriter.
     *
     * @param pw The printWriter to write the help to
     * @param width The number of characters to display per line
     * @param text The text to be written to the PrintWriter
     */
    public void printWrapped(PrintWriter pw, int width, String text)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(587);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(588);printWrapped(pw, width, 0, text);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Print the specified text to the specified PrintWriter.
     *
     * @param pw The printWriter to write the help to
     * @param width The number of characters to display per line
     * @param nextLineTabStop The position on the next line for the first tab.
     * @param text The text to be written to the PrintWriter
     */
    public void printWrapped(PrintWriter pw, int width, int nextLineTabStop, String text)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(589);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(590);StringBuffer sb = new StringBuffer(text.length());

        __CLR4_5_2c4c4lvn1n5n7.R.inc(591);renderWrappedText(sb, width, nextLineTabStop, text);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(592);pw.println(sb.toString());
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(593);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(594);final String lpad = createPadding(leftPad);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(595);final String dpad = createPadding(descPad);

        // first create list containing only <lpad>-a,--aaa where 
        // -a is opt and --aaa is long opt; in parallel look for 
        // the longest opt string this list will be then used to 
        // sort options ascending
        __CLR4_5_2c4c4lvn1n5n7.R.inc(596);int max = 0;
        __CLR4_5_2c4c4lvn1n5n7.R.inc(597);StringBuffer optBuf;
        __CLR4_5_2c4c4lvn1n5n7.R.inc(598);List prefixList = new ArrayList();

        __CLR4_5_2c4c4lvn1n5n7.R.inc(599);List optList = options.helpOptions();

        __CLR4_5_2c4c4lvn1n5n7.R.inc(600);Collections.sort(optList, getOptionComparator());

        __CLR4_5_2c4c4lvn1n5n7.R.inc(601);for (Iterator i = optList.iterator(); (((i.hasNext())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(602)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(603)==0&false));)
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(604);Option option = (Option) i.next();
            __CLR4_5_2c4c4lvn1n5n7.R.inc(605);optBuf = new StringBuffer(8);

            __CLR4_5_2c4c4lvn1n5n7.R.inc(606);if ((((option.getOpt() == null)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(607)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(608)==0&false)))
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(609);optBuf.append(lpad).append("   " + defaultLongOptPrefix).append(option.getLongOpt());
            }
            }else
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(610);optBuf.append(lpad).append(defaultOptPrefix).append(option.getOpt());

                __CLR4_5_2c4c4lvn1n5n7.R.inc(611);if ((((option.hasLongOpt())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(612)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(613)==0&false)))
                {{
                    __CLR4_5_2c4c4lvn1n5n7.R.inc(614);optBuf.append(',').append(defaultLongOptPrefix).append(option.getLongOpt());
                }
            }}

            }__CLR4_5_2c4c4lvn1n5n7.R.inc(615);if ((((option.hasArg())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(616)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(617)==0&false)))
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(618);if ((((option.hasArgName())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(619)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(620)==0&false)))
                {{
                    __CLR4_5_2c4c4lvn1n5n7.R.inc(621);optBuf.append((((option.hasLongOpt() )&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(622)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(623)==0&false))? longOptSeparator : " ");
                    __CLR4_5_2c4c4lvn1n5n7.R.inc(624);optBuf.append("<").append(option.getArgName()).append(">");
                }
                }else
                {{
                    __CLR4_5_2c4c4lvn1n5n7.R.inc(625);optBuf.append(' ');
                }
            }}

            }__CLR4_5_2c4c4lvn1n5n7.R.inc(626);prefixList.add(optBuf);
            __CLR4_5_2c4c4lvn1n5n7.R.inc(627);max = ((((optBuf.length() > max) )&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(628)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(629)==0&false))? optBuf.length() : max;
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(630);int x = 0;

        __CLR4_5_2c4c4lvn1n5n7.R.inc(631);for (Iterator i = optList.iterator(); (((i.hasNext())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(632)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(633)==0&false));)
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(634);Option option = (Option) i.next();
            __CLR4_5_2c4c4lvn1n5n7.R.inc(635);optBuf = new StringBuffer(prefixList.get(x++).toString());

            __CLR4_5_2c4c4lvn1n5n7.R.inc(636);if ((((optBuf.length() < max)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(637)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(638)==0&false)))
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(639);optBuf.append(createPadding(max - optBuf.length()));
            }

            }__CLR4_5_2c4c4lvn1n5n7.R.inc(640);optBuf.append(dpad);

            __CLR4_5_2c4c4lvn1n5n7.R.inc(641);int nextLineTabStop = max + descPad;

            __CLR4_5_2c4c4lvn1n5n7.R.inc(642);if ((((option.getDescription() != null)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(643)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(644)==0&false)))
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(645);optBuf.append(option.getDescription());
            }

            }__CLR4_5_2c4c4lvn1n5n7.R.inc(646);renderWrappedText(sb, width, nextLineTabStop, optBuf.toString());

            __CLR4_5_2c4c4lvn1n5n7.R.inc(647);if ((((i.hasNext())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(648)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(649)==0&false)))
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(650);sb.append(defaultNewLine);
            }
        }}

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(651);return sb;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(652);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(653);int pos = findWrapPos(text, width, 0);

        __CLR4_5_2c4c4lvn1n5n7.R.inc(654);if ((((pos == -1)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(655)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(656)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(657);sb.append(rtrim(text));

            __CLR4_5_2c4c4lvn1n5n7.R.inc(658);return sb;
        }
        }__CLR4_5_2c4c4lvn1n5n7.R.inc(659);sb.append(rtrim(text.substring(0, pos))).append(defaultNewLine);

        __CLR4_5_2c4c4lvn1n5n7.R.inc(660);if ((((nextLineTabStop >= width)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(661)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(662)==0&false)))
        {{
            // stops infinite loop happening
            __CLR4_5_2c4c4lvn1n5n7.R.inc(663);nextLineTabStop = 1;
        }

        // all following lines must be padded with nextLineTabStop space 
        // characters
        }__CLR4_5_2c4c4lvn1n5n7.R.inc(664);final String padding = createPadding(nextLineTabStop);

        __CLR4_5_2c4c4lvn1n5n7.R.inc(665);while (true)
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(666);text = padding + text.substring(pos).trim();
            __CLR4_5_2c4c4lvn1n5n7.R.inc(667);pos = findWrapPos(text, width, 0);

            __CLR4_5_2c4c4lvn1n5n7.R.inc(668);if ((((pos == -1)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(669)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(670)==0&false)))
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(671);sb.append(text);

                __CLR4_5_2c4c4lvn1n5n7.R.inc(672);return sb;
            }
            
            }__CLR4_5_2c4c4lvn1n5n7.R.inc(673);if ( ((((text.length() > width) && (pos == nextLineTabStop - 1) )&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(674)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(675)==0&false))) 
            {{
                __CLR4_5_2c4c4lvn1n5n7.R.inc(676);pos = width;
            }

            }__CLR4_5_2c4c4lvn1n5n7.R.inc(677);sb.append(rtrim(text.substring(0, pos))).append(defaultNewLine);
        }
    }}finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(678);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(679);int pos = -1;

        // the line ends before the max wrap pos or a new line char found
        __CLR4_5_2c4c4lvn1n5n7.R.inc(680);if (((pos = text.indexOf('\n', startPos)) != -1 && pos <= width)
                || ((pos = text.indexOf('\t', startPos)) != -1 && pos <= width))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(683);return pos + 1;
        }
        }else {__CLR4_5_2c4c4lvn1n5n7.R.inc(684);if ((((startPos + width >= text.length())&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(685)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(686)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(687);return -1;
        }


        // look for the last whitespace character before startPos+width
        }}__CLR4_5_2c4c4lvn1n5n7.R.inc(688);pos = startPos + width;

        __CLR4_5_2c4c4lvn1n5n7.R.inc(689);char c;

        __CLR4_5_2c4c4lvn1n5n7.R.inc(690);while ((pos >= startPos) && ((c = text.charAt(pos)) != ' ')
                && (c != '\n') && (c != '\r'))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(693);--pos;
        }

        // if we found it - just return
        }__CLR4_5_2c4c4lvn1n5n7.R.inc(694);if ((((pos > startPos)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(695)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(696)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(697);return pos;
        }
        
        // must look for the first whitespace chearacter after startPos 
        // + width
        }__CLR4_5_2c4c4lvn1n5n7.R.inc(698);pos = startPos + width;

        __CLR4_5_2c4c4lvn1n5n7.R.inc(699);while ((pos <= text.length()) && ((c = text.charAt(pos)) != ' ')
               && (c != '\n') && (c != '\r'))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(702);++pos;
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(703);return ((((pos == text.length()) )&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(704)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(705)==0&false))? (-1) : pos;
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Return a String of padding of length <code>len</code>.
     *
     * @param len The length of the String of padding to create.
     *
     * @return The String of padding
     */
    protected String createPadding(int len)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(706);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(707);StringBuffer sb = new StringBuffer(len);

        __CLR4_5_2c4c4lvn1n5n7.R.inc(708);for (int i = 0; (((i < len)&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(709)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(710)==0&false)); ++i)
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(711);sb.append(' ');
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(712);return sb.toString();
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

    /**
     * Remove the trailing whitespace from the specified String.
     *
     * @param s The String to remove the trailing padding from.
     *
     * @return The String of without the trailing padding
     */
    protected String rtrim(String s)
    {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(713);
        __CLR4_5_2c4c4lvn1n5n7.R.inc(714);if (((((s == null) || (s.length() == 0))&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(715)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(716)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(717);return s;
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(718);int pos = s.length();

        __CLR4_5_2c4c4lvn1n5n7.R.inc(719);while (((((pos > 0) && Character.isWhitespace(s.charAt(pos - 1)))&&(__CLR4_5_2c4c4lvn1n5n7.R.iget(720)!=0|true))||(__CLR4_5_2c4c4lvn1n5n7.R.iget(721)==0&false)))
        {{
            __CLR4_5_2c4c4lvn1n5n7.R.inc(722);--pos;
        }

        }__CLR4_5_2c4c4lvn1n5n7.R.inc(723);return s.substring(0, pos);
    }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}

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
        {try{__CLR4_5_2c4c4lvn1n5n7.R.inc(724);
            __CLR4_5_2c4c4lvn1n5n7.R.inc(725);Option opt1 = (Option) o1;
            __CLR4_5_2c4c4lvn1n5n7.R.inc(726);Option opt2 = (Option) o2;

            __CLR4_5_2c4c4lvn1n5n7.R.inc(727);return opt1.getKey().compareToIgnoreCase(opt2.getKey());
        }finally{__CLR4_5_2c4c4lvn1n5n7.R.flushNeeded();}}
    }

}
