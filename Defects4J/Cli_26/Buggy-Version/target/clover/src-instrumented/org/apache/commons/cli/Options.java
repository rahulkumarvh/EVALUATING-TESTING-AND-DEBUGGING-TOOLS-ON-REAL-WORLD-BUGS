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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <p>Main entry-point into the library.</p>
 *
 * <p>Options represents a collection of {@link Option} objects, which
 * describe the possible options for a command-line.<p>
 *
 * <p>It may flexibly parse long and short options, with or without
 * values.  Additionally, it may parse only a portion of a commandline,
 * allowing for flexible multi-stage parsing.<p>
 *
 * @see org.apache.commons.cli.CommandLine
 *
 * @author bob mcwhirter (bob @ werken.com)
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @version $Revision$, $Date$
 */
public class Options implements Serializable
{public static class __CLR4_5_2m6m6lvn1m50t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0036\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521132493L,8589935092L,862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = 1L;

    /** a map of the options with the character key */
    private Map shortOpts = new HashMap();

    /** a map of the options with the long key */
    private Map longOpts = new HashMap();

    /** a map of the required options */
    private List requiredOpts = new ArrayList();

    /** a map of the option groups */
    private Map optionGroups = new HashMap();

    /**
     * Add the specified option group.
     *
     * @param group the OptionGroup that is to be added
     * @return the resulting Options instance
     */
    public Options addOptionGroup(OptionGroup group)
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(798);
        __CLR4_5_2m6m6lvn1m50t.R.inc(799);Iterator options = group.getOptions().iterator();

        __CLR4_5_2m6m6lvn1m50t.R.inc(800);if ((((group.isRequired())&&(__CLR4_5_2m6m6lvn1m50t.R.iget(801)!=0|true))||(__CLR4_5_2m6m6lvn1m50t.R.iget(802)==0&false)))
        {{
            __CLR4_5_2m6m6lvn1m50t.R.inc(803);requiredOpts.add(group);
        }

        }__CLR4_5_2m6m6lvn1m50t.R.inc(804);while ((((options.hasNext())&&(__CLR4_5_2m6m6lvn1m50t.R.iget(805)!=0|true))||(__CLR4_5_2m6m6lvn1m50t.R.iget(806)==0&false)))
        {{
            __CLR4_5_2m6m6lvn1m50t.R.inc(807);Option option = (Option) options.next();

            // an Option cannot be required if it is in an
            // OptionGroup, either the group is required or
            // nothing is required
            __CLR4_5_2m6m6lvn1m50t.R.inc(808);option.setRequired(false);
            __CLR4_5_2m6m6lvn1m50t.R.inc(809);addOption(option);

            __CLR4_5_2m6m6lvn1m50t.R.inc(810);optionGroups.put(option.getKey(), group);
        }

        }__CLR4_5_2m6m6lvn1m50t.R.inc(811);return this;
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Lists the OptionGroups that are members of this Options instance.
     *
     * @return a Collection of OptionGroup instances.
     */
    Collection getOptionGroups()
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(812);
        __CLR4_5_2m6m6lvn1m50t.R.inc(813);return new HashSet(optionGroups.values());
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Add an option that only contains a short-name.
     * It may be specified as requiring an argument.
     *
     * @param opt Short single-character name of the option.
     * @param hasArg flag signally if an argument is required after this option
     * @param description Self-documenting description
     * @return the resulting Options instance
     */
    public Options addOption(String opt, boolean hasArg, String description)
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(814);
        __CLR4_5_2m6m6lvn1m50t.R.inc(815);addOption(opt, null, hasArg, description);

        __CLR4_5_2m6m6lvn1m50t.R.inc(816);return this;
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Add an option that contains a short-name and a long-name.
     * It may be specified as requiring an argument.
     *
     * @param opt Short single-character name of the option.
     * @param longOpt Long multi-character name of the option.
     * @param hasArg flag signally if an argument is required after this option
     * @param description Self-documenting description
     * @return the resulting Options instance
     */
    public Options addOption(String opt, String longOpt, boolean hasArg, String description)
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(817);
        __CLR4_5_2m6m6lvn1m50t.R.inc(818);addOption(new Option(opt, longOpt, hasArg, description));

        __CLR4_5_2m6m6lvn1m50t.R.inc(819);return this;
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Adds an option instance
     *
     * @param opt the option that is to be added
     * @return the resulting Options instance
     */
    public Options addOption(Option opt)
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(820);
        __CLR4_5_2m6m6lvn1m50t.R.inc(821);String key = opt.getKey();

        // add it to the long option list
        __CLR4_5_2m6m6lvn1m50t.R.inc(822);if ((((opt.hasLongOpt())&&(__CLR4_5_2m6m6lvn1m50t.R.iget(823)!=0|true))||(__CLR4_5_2m6m6lvn1m50t.R.iget(824)==0&false)))
        {{
            __CLR4_5_2m6m6lvn1m50t.R.inc(825);longOpts.put(opt.getLongOpt(), opt);
        }

        // if the option is required add it to the required list
        }__CLR4_5_2m6m6lvn1m50t.R.inc(826);if ((((opt.isRequired())&&(__CLR4_5_2m6m6lvn1m50t.R.iget(827)!=0|true))||(__CLR4_5_2m6m6lvn1m50t.R.iget(828)==0&false)))
        {{
            __CLR4_5_2m6m6lvn1m50t.R.inc(829);if ((((requiredOpts.contains(key))&&(__CLR4_5_2m6m6lvn1m50t.R.iget(830)!=0|true))||(__CLR4_5_2m6m6lvn1m50t.R.iget(831)==0&false)))
            {{
                __CLR4_5_2m6m6lvn1m50t.R.inc(832);requiredOpts.remove(requiredOpts.indexOf(key));
            }
            }__CLR4_5_2m6m6lvn1m50t.R.inc(833);requiredOpts.add(key);
        }

        }__CLR4_5_2m6m6lvn1m50t.R.inc(834);shortOpts.put(key, opt);

        __CLR4_5_2m6m6lvn1m50t.R.inc(835);return this;
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Retrieve a read-only list of options in this set
     *
     * @return read-only Collection of {@link Option} objects in this descriptor
     */
    public Collection getOptions()
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(836);
        __CLR4_5_2m6m6lvn1m50t.R.inc(837);return Collections.unmodifiableCollection(helpOptions());
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Returns the Options for use by the HelpFormatter.
     *
     * @return the List of Options
     */
    List helpOptions()
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(838);
        __CLR4_5_2m6m6lvn1m50t.R.inc(839);return new ArrayList(shortOpts.values());
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Returns the required options.
     *
     * @return List of required options
     */
    public List getRequiredOptions()
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(840);
        __CLR4_5_2m6m6lvn1m50t.R.inc(841);return requiredOpts;
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Retrieve the {@link Option} matching the long or short name specified.
     * The leading hyphens in the name are ignored (up to 2).
     *
     * @param opt short or long name of the {@link Option}
     * @return the option represented by opt
     */
    public Option getOption(String opt)
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(842);
        __CLR4_5_2m6m6lvn1m50t.R.inc(843);opt = Util.stripLeadingHyphens(opt);

        __CLR4_5_2m6m6lvn1m50t.R.inc(844);if ((((shortOpts.containsKey(opt))&&(__CLR4_5_2m6m6lvn1m50t.R.iget(845)!=0|true))||(__CLR4_5_2m6m6lvn1m50t.R.iget(846)==0&false)))
        {{
            __CLR4_5_2m6m6lvn1m50t.R.inc(847);return (Option) shortOpts.get(opt);
        }

        }__CLR4_5_2m6m6lvn1m50t.R.inc(848);return (Option) longOpts.get(opt);
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Returns whether the named {@link Option} is a member of this {@link Options}.
     *
     * @param opt short or long name of the {@link Option}
     * @return true if the named {@link Option} is a member
     * of this {@link Options}
     */
    public boolean hasOption(String opt)
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(849);
        __CLR4_5_2m6m6lvn1m50t.R.inc(850);opt = Util.stripLeadingHyphens(opt);

        __CLR4_5_2m6m6lvn1m50t.R.inc(851);return shortOpts.containsKey(opt) || longOpts.containsKey(opt);
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Returns the OptionGroup the <code>opt</code> belongs to.
     * @param opt the option whose OptionGroup is being queried.
     *
     * @return the OptionGroup if <code>opt</code> is part
     * of an OptionGroup, otherwise return null
     */
    public OptionGroup getOptionGroup(Option opt)
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(852);
        __CLR4_5_2m6m6lvn1m50t.R.inc(853);return (OptionGroup) optionGroups.get(opt.getKey());
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}

    /**
     * Dump state, suitable for debugging.
     *
     * @return Stringified form of this object
     */
    public String toString()
    {try{__CLR4_5_2m6m6lvn1m50t.R.inc(854);
        __CLR4_5_2m6m6lvn1m50t.R.inc(855);StringBuffer buf = new StringBuffer();

        __CLR4_5_2m6m6lvn1m50t.R.inc(856);buf.append("[ Options: [ short ");
        __CLR4_5_2m6m6lvn1m50t.R.inc(857);buf.append(shortOpts.toString());
        __CLR4_5_2m6m6lvn1m50t.R.inc(858);buf.append(" ] [ long ");
        __CLR4_5_2m6m6lvn1m50t.R.inc(859);buf.append(longOpts);
        __CLR4_5_2m6m6lvn1m50t.R.inc(860);buf.append(" ]");

        __CLR4_5_2m6m6lvn1m50t.R.inc(861);return buf.toString();
    }finally{__CLR4_5_2m6m6lvn1m50t.R.flushNeeded();}}
}
