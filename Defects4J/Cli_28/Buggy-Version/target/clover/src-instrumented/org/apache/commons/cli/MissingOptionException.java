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

import java.util.List;
import java.util.Iterator;

/**
 * Thrown when a required option has not been provided.
 *
 * @author John Keyes ( john at integralsource.com )
 * @version $Revision$, $Date$
 */
public class MissingOptionException extends ParseException
{public static class __CLR4_5_2kfkflvn1n5oc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521179989L,8589935092L,758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The list of missing options */
    private List missingOptions;

    /**
     * Construct a new <code>MissingSelectedException</code>
     * with the specified detail message.
     *
     * @param message the detail message
     */
    public MissingOptionException(String message)
    {
        super(message);__CLR4_5_2kfkflvn1n5oc.R.inc(736);try{__CLR4_5_2kfkflvn1n5oc.R.inc(735);
    }finally{__CLR4_5_2kfkflvn1n5oc.R.flushNeeded();}}

    /**
     * Constructs a new <code>MissingSelectedException</code> with the
     * specified list of missing options.
     *
     * @param missingOptions the list of missing options
     * @since 1.2
     */
    public MissingOptionException(List missingOptions)
    {
        this(createMessage(missingOptions));__CLR4_5_2kfkflvn1n5oc.R.inc(738);try{__CLR4_5_2kfkflvn1n5oc.R.inc(737);
        __CLR4_5_2kfkflvn1n5oc.R.inc(739);this.missingOptions = missingOptions;
    }finally{__CLR4_5_2kfkflvn1n5oc.R.flushNeeded();}}

    /**
     * Return the list of options (as strings) missing in the command line parsed.
     *
     * @return the missing options
     * @since 1.2
     */
    public List getMissingOptions()
    {try{__CLR4_5_2kfkflvn1n5oc.R.inc(740);
        __CLR4_5_2kfkflvn1n5oc.R.inc(741);return missingOptions;
    }finally{__CLR4_5_2kfkflvn1n5oc.R.flushNeeded();}}

    /**
     * Build the exception message from the specified list of options.
     *
     * @param missingOptions
     * @since 1.2
     */
    private static String createMessage(List missingOptions)
    {try{__CLR4_5_2kfkflvn1n5oc.R.inc(742);
        __CLR4_5_2kfkflvn1n5oc.R.inc(743);StringBuffer buff = new StringBuffer("Missing required option");
        __CLR4_5_2kfkflvn1n5oc.R.inc(744);buff.append((((missingOptions.size() == 1 )&&(__CLR4_5_2kfkflvn1n5oc.R.iget(745)!=0|true))||(__CLR4_5_2kfkflvn1n5oc.R.iget(746)==0&false))? "" : "s");
        __CLR4_5_2kfkflvn1n5oc.R.inc(747);buff.append(": ");

        __CLR4_5_2kfkflvn1n5oc.R.inc(748);Iterator it = missingOptions.iterator();
        __CLR4_5_2kfkflvn1n5oc.R.inc(749);while ((((it.hasNext())&&(__CLR4_5_2kfkflvn1n5oc.R.iget(750)!=0|true))||(__CLR4_5_2kfkflvn1n5oc.R.iget(751)==0&false)))
        {{
            __CLR4_5_2kfkflvn1n5oc.R.inc(752);buff.append(it.next());
            __CLR4_5_2kfkflvn1n5oc.R.inc(753);if ((((it.hasNext())&&(__CLR4_5_2kfkflvn1n5oc.R.iget(754)!=0|true))||(__CLR4_5_2kfkflvn1n5oc.R.iget(755)==0&false)))
            {{
                __CLR4_5_2kfkflvn1n5oc.R.inc(756);buff.append(", ");
            }
        }}

        }__CLR4_5_2kfkflvn1n5oc.R.inc(757);return buff.toString();
    }finally{__CLR4_5_2kfkflvn1n5oc.R.flushNeeded();}}
}
