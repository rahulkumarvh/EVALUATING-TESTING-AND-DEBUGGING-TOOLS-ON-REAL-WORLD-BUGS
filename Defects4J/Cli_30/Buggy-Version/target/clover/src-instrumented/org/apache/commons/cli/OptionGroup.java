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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * A group of mutually exclusive options.
 *
 * @author John Keyes ( john at integralsource.com )
 * @version $Revision$, $Date$
 */
public class OptionGroup implements Serializable
{public static class __CLR4_5_2tktklvn1ne1s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521190328L,8589935092L,1111,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The serial version UID. */
    private static final long serialVersionUID = 1L;
    
    /** hold the options */
    private Map optionMap = new HashMap();

    /** the name of the selected option */
    private String selected;

    /** specified whether this group is required */
    private boolean required;

    /**
     * Add the specified <code>Option</code> to this group.
     *
     * @param option the option to add to this group
     * @return this option group with the option added
     */
    public OptionGroup addOption(Option option)
    {try{__CLR4_5_2tktklvn1ne1s.R.inc(1064);
        // key   - option name
        // value - the option
        __CLR4_5_2tktklvn1ne1s.R.inc(1065);optionMap.put(option.getKey(), option);

        __CLR4_5_2tktklvn1ne1s.R.inc(1066);return this;
    }finally{__CLR4_5_2tktklvn1ne1s.R.flushNeeded();}}

    /**
     * @return the names of the options in this group as a 
     * <code>Collection</code>
     */
    public Collection getNames()
    {try{__CLR4_5_2tktklvn1ne1s.R.inc(1067);
        // the key set is the collection of names
        __CLR4_5_2tktklvn1ne1s.R.inc(1068);return optionMap.keySet();
    }finally{__CLR4_5_2tktklvn1ne1s.R.flushNeeded();}}

    /**
     * @return the options in this group as a <code>Collection</code>
     */
    public Collection getOptions()
    {try{__CLR4_5_2tktklvn1ne1s.R.inc(1069);
        // the values are the collection of options
        __CLR4_5_2tktklvn1ne1s.R.inc(1070);return optionMap.values();
    }finally{__CLR4_5_2tktklvn1ne1s.R.flushNeeded();}}

    /**
     * Set the selected option of this group to <code>name</code>.
     *
     * @param option the option that is selected
     * @throws AlreadySelectedException if an option from this group has 
     * already been selected.
     */
    public void setSelected(Option option) throws AlreadySelectedException
    {try{__CLR4_5_2tktklvn1ne1s.R.inc(1071);
        __CLR4_5_2tktklvn1ne1s.R.inc(1072);if ((((option == null)&&(__CLR4_5_2tktklvn1ne1s.R.iget(1073)!=0|true))||(__CLR4_5_2tktklvn1ne1s.R.iget(1074)==0&false)))
        {{
            // reset the option previously selected
            __CLR4_5_2tktklvn1ne1s.R.inc(1075);selected = null;
            __CLR4_5_2tktklvn1ne1s.R.inc(1076);return;
        }
        
        // if no option has already been selected or the 
        // same option is being reselected then set the
        // selected member variable
        }__CLR4_5_2tktklvn1ne1s.R.inc(1077);if ((((selected == null || selected.equals(option.getKey()))&&(__CLR4_5_2tktklvn1ne1s.R.iget(1078)!=0|true))||(__CLR4_5_2tktklvn1ne1s.R.iget(1079)==0&false)))
        {{
            __CLR4_5_2tktklvn1ne1s.R.inc(1080);selected = option.getKey();
        }
        }else
        {{
            __CLR4_5_2tktklvn1ne1s.R.inc(1081);throw new AlreadySelectedException(this, option);
        }
    }}finally{__CLR4_5_2tktklvn1ne1s.R.flushNeeded();}}

    /**
     * @return the selected option name
     */
    public String getSelected()
    {try{__CLR4_5_2tktklvn1ne1s.R.inc(1082);
        __CLR4_5_2tktklvn1ne1s.R.inc(1083);return selected;
    }finally{__CLR4_5_2tktklvn1ne1s.R.flushNeeded();}}

    /**
     * @param required specifies if this group is required
     */
    public void setRequired(boolean required)
    {try{__CLR4_5_2tktklvn1ne1s.R.inc(1084);
        __CLR4_5_2tktklvn1ne1s.R.inc(1085);this.required = required;
    }finally{__CLR4_5_2tktklvn1ne1s.R.flushNeeded();}}

    /**
     * Returns whether this option group is required.
     *
     * @return whether this option group is required
     */
    public boolean isRequired()
    {try{__CLR4_5_2tktklvn1ne1s.R.inc(1086);
        __CLR4_5_2tktklvn1ne1s.R.inc(1087);return required;
    }finally{__CLR4_5_2tktklvn1ne1s.R.flushNeeded();}}

    /**
     * Returns the stringified version of this OptionGroup.
     * 
     * @return the stringified representation of this group
     */
    public String toString()
    {try{__CLR4_5_2tktklvn1ne1s.R.inc(1088);
        __CLR4_5_2tktklvn1ne1s.R.inc(1089);StringBuffer buff = new StringBuffer();

        __CLR4_5_2tktklvn1ne1s.R.inc(1090);Iterator iter = getOptions().iterator();

        __CLR4_5_2tktklvn1ne1s.R.inc(1091);buff.append("[");

        __CLR4_5_2tktklvn1ne1s.R.inc(1092);while ((((iter.hasNext())&&(__CLR4_5_2tktklvn1ne1s.R.iget(1093)!=0|true))||(__CLR4_5_2tktklvn1ne1s.R.iget(1094)==0&false)))
        {{
            __CLR4_5_2tktklvn1ne1s.R.inc(1095);Option option = (Option) iter.next();

            __CLR4_5_2tktklvn1ne1s.R.inc(1096);if ((((option.getOpt() != null)&&(__CLR4_5_2tktklvn1ne1s.R.iget(1097)!=0|true))||(__CLR4_5_2tktklvn1ne1s.R.iget(1098)==0&false)))
            {{
                __CLR4_5_2tktklvn1ne1s.R.inc(1099);buff.append("-");
                __CLR4_5_2tktklvn1ne1s.R.inc(1100);buff.append(option.getOpt());
            }
            }else
            {{
                __CLR4_5_2tktklvn1ne1s.R.inc(1101);buff.append("--");
                __CLR4_5_2tktklvn1ne1s.R.inc(1102);buff.append(option.getLongOpt());
            }

            }__CLR4_5_2tktklvn1ne1s.R.inc(1103);buff.append(" ");
            __CLR4_5_2tktklvn1ne1s.R.inc(1104);buff.append(option.getDescription());

            __CLR4_5_2tktklvn1ne1s.R.inc(1105);if ((((iter.hasNext())&&(__CLR4_5_2tktklvn1ne1s.R.iget(1106)!=0|true))||(__CLR4_5_2tktklvn1ne1s.R.iget(1107)==0&false)))
            {{
                __CLR4_5_2tktklvn1ne1s.R.inc(1108);buff.append(", ");
            }
        }}

        }__CLR4_5_2tktklvn1ne1s.R.inc(1109);buff.append("]");

        __CLR4_5_2tktklvn1ne1s.R.inc(1110);return buff.toString();
    }finally{__CLR4_5_2tktklvn1ne1s.R.flushNeeded();}}
}
