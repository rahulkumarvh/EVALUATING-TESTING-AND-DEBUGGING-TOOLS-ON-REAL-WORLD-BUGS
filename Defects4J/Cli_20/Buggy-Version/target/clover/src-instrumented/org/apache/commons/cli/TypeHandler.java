/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.Date;

/**
  * This is a temporary implementation. TypeHandler will handle the 
  * pluggableness of OptionTypes and it will direct all of these types 
  * of conversion functionalities to ConvertUtils component in Commons 
  * alreayd. BeanUtils I think.
  *
  * @author Henri Yandell (bayard @ generationjava.com)
  * @version $Revision$
  */
public class TypeHandler {public static class __CLR4_5_2w6w6lvl2txga{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0032\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714402241546L,8589935092L,1234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Returns the <code>Object</code> of type <code>obj</code>
     * with the value of <code>str</code>.
     *
     * @param str the command line value
     * @param obj the type of argument
     * @return The instance of <code>obj</code> initialised with
     * the value of <code>str</code>.
     */
    public static Object createValue(String str, Object obj)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1158);
        __CLR4_5_2w6w6lvl2txga.R.inc(1159);return createValue(str, (Class) obj);
    }finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}

    /**
     * Returns the <code>Object</code> of type <code>clazz</code>
     * with the value of <code>str</code>.
     *
     * @param str the command line value
     * @param clazz the type of argument
     * @return The instance of <code>clazz</code> initialised with
     * the value of <code>str</code>.
     */
    public static Object createValue(String str, Class clazz)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1160);
        __CLR4_5_2w6w6lvl2txga.R.inc(1161);if ((((PatternOptionBuilder.STRING_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1162)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1163)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1164);return str;
        }
        }else {__CLR4_5_2w6w6lvl2txga.R.inc(1165);if ((((PatternOptionBuilder.OBJECT_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1166)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1167)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1168);return createObject(str);
        }
        }else {__CLR4_5_2w6w6lvl2txga.R.inc(1169);if ((((PatternOptionBuilder.NUMBER_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1170)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1171)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1172);return createNumber(str);
        }
        }else {__CLR4_5_2w6w6lvl2txga.R.inc(1173);if ((((PatternOptionBuilder.DATE_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1174)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1175)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1176);return createDate(str);
        }
        }else {__CLR4_5_2w6w6lvl2txga.R.inc(1177);if ((((PatternOptionBuilder.CLASS_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1178)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1179)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1180);return createClass(str);
        }
        }else {__CLR4_5_2w6w6lvl2txga.R.inc(1181);if ((((PatternOptionBuilder.FILE_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1182)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1183)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1184);return createFile(str);
        }
        }else {__CLR4_5_2w6w6lvl2txga.R.inc(1185);if ((((PatternOptionBuilder.EXISTING_FILE_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1186)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1187)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1188);return createFile(str);
        }
        }else {__CLR4_5_2w6w6lvl2txga.R.inc(1189);if ((((PatternOptionBuilder.FILES_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1190)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1191)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1192);return createFiles(str);
        }
        }else {__CLR4_5_2w6w6lvl2txga.R.inc(1193);if ((((PatternOptionBuilder.URL_VALUE == clazz)&&(__CLR4_5_2w6w6lvl2txga.R.iget(1194)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1195)==0&false)))
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1196);return createURL(str);
        }
        }else
        {{
            __CLR4_5_2w6w6lvl2txga.R.inc(1197);return null;
        }
    }}}}}}}}}}finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}

    /**
      * Create an Object from the classname and empty constructor.
      *
      * @param str the argument value
      * @return the initialised object, or null if it couldn't create 
      * the Object.
      */
    public static Object createObject(String str)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1198);
        __CLR4_5_2w6w6lvl2txga.R.inc(1199);Class cl = null;

        __CLR4_5_2w6w6lvl2txga.R.inc(1200);try
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1201);cl = Class.forName(str);
        }
        catch (ClassNotFoundException cnfe)
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1202);System.err.println("Unable to find the class: " + str);

            __CLR4_5_2w6w6lvl2txga.R.inc(1203);return null;
        }

        __CLR4_5_2w6w6lvl2txga.R.inc(1204);Object instance = null;

        __CLR4_5_2w6w6lvl2txga.R.inc(1205);try
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1206);instance = cl.newInstance();
        }
        catch (Exception e)
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1207);System.err.println(e.getClass().getName() + "; Unable to create an instance of: " + str);
        }

        __CLR4_5_2w6w6lvl2txga.R.inc(1208);return instance;
    }finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}

    /**
     * Create a number from a String. If a . is present, it creates a 
     * Double, otherwise a Long.
     *
     * @param str the value
     * @return the number represented by <code>str</code>, if <code>str</code>
     * is not a number, null is returned.
     */
    public static Number createNumber(String str)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1209);
        __CLR4_5_2w6w6lvl2txga.R.inc(1210);try
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1211);if( (((str.indexOf('.') != -1 )&&(__CLR4_5_2w6w6lvl2txga.R.iget(1212)!=0|true))||(__CLR4_5_2w6w6lvl2txga.R.iget(1213)==0&false)))
            {{
                __CLR4_5_2w6w6lvl2txga.R.inc(1214);return Double.valueOf(str);
            }
            }else
            {{
                __CLR4_5_2w6w6lvl2txga.R.inc(1215);return Long.valueOf(str);
            }
        }}
        catch (NumberFormatException nfe)
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1216);System.err.println(nfe.getMessage());
        }

        __CLR4_5_2w6w6lvl2txga.R.inc(1217);return null;
    }finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}

    /**
     * Returns the class whose name is <code>str</code>.
     *
     * @param str the class name
     * @return The class if it is found, otherwise return null
     */
    public static Class createClass(String str)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1218);
        __CLR4_5_2w6w6lvl2txga.R.inc(1219);try
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1220);return Class.forName(str);
        }
        catch (ClassNotFoundException cnfe)
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1221);System.err.println("Unable to find: " + str);

            __CLR4_5_2w6w6lvl2txga.R.inc(1222);return null;
        }
    }finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}

    /**
     * Returns the date represented by <code>str</code>.
     *
     * @param str the date string
     * @return The date if <code>str</code> is a valid date string,
     * otherwise return null.
     */
    public static Date createDate(String str)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1223);
        __CLR4_5_2w6w6lvl2txga.R.inc(1224);throw new UnsupportedOperationException("Not yet implemented");
    }finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}

    /**
     * Returns the URL represented by <code>str</code>.
     *
     * @param str the URL string
     * @return The URL is <code>str</code> is well-formed, otherwise
     * return null.
     */
    public static URL createURL(String str)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1225);
        __CLR4_5_2w6w6lvl2txga.R.inc(1226);try
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1227);return new URL(str);
        }
        catch (MalformedURLException e)
        {
            __CLR4_5_2w6w6lvl2txga.R.inc(1228);System.err.println("Unable to parse the URL: " + str);

            __CLR4_5_2w6w6lvl2txga.R.inc(1229);return null;
        }
    }finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}

    /**
     * Returns the File represented by <code>str</code>.
     *
     * @param str the File location
     * @return The file represented by <code>str</code>.
     */
    public static File createFile(String str)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1230);
        __CLR4_5_2w6w6lvl2txga.R.inc(1231);return new File(str);
    }finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}

    /**
     * Returns the File[] represented by <code>str</code>.
     *
     * @param str the paths to the files
     * @return The File[] represented by <code>str</code>.
     */
    public static File[] createFiles(String str)
    {try{__CLR4_5_2w6w6lvl2txga.R.inc(1232);
        // to implement/port:
        //        return FileW.findFiles(str);
        __CLR4_5_2w6w6lvl2txga.R.inc(1233);return null;
    }finally{__CLR4_5_2w6w6lvl2txga.R.flushNeeded();}}
}
