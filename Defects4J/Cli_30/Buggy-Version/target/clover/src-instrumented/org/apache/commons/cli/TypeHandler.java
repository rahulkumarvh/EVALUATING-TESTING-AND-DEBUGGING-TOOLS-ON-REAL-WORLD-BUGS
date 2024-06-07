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

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.Date;

/**
  * This is a temporary implementation. TypeHandler will handle the
  * pluggableness of OptionTypes and it will direct all of these types
  * of conversion functionalities to ConvertUtils component in Commons
  * already. BeanUtils I think.
  *
  * @version $Revision$, $Date$
  */
public class TypeHandler
{public static class __CLR4_5_216s16slvn1necw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0033\u0030\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714521190328L,8589935092L,1612,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Returns the <code>Object</code> of type <code>obj</code>
     * with the value of <code>str</code>.
     *
     * @param str the command line value
     * @param obj the type of argument
     * @return The instance of <code>obj</code> initialised with
     * the value of <code>str</code>.
     */
    public static Object createValue(String str, Object obj) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1540);
        __CLR4_5_216s16slvn1necw.R.inc(1541);return createValue(str, (Class) obj);
    }finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}

    /**
     * Returns the <code>Object</code> of type <code>clazz</code>
     * with the value of <code>str</code>.
     *
     * @param str the command line value
     * @param clazz the type of argument
     * @return The instance of <code>clazz</code> initialised with
     * the value of <code>str</code>.
     */
    public static Object createValue(String str, Class clazz) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1542);
        __CLR4_5_216s16slvn1necw.R.inc(1543);if ((((PatternOptionBuilder.STRING_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1544)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1545)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1546);return str;
        }
        }else {__CLR4_5_216s16slvn1necw.R.inc(1547);if ((((PatternOptionBuilder.OBJECT_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1548)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1549)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1550);return createObject(str);
        }
        }else {__CLR4_5_216s16slvn1necw.R.inc(1551);if ((((PatternOptionBuilder.NUMBER_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1552)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1553)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1554);return createNumber(str);
        }
        }else {__CLR4_5_216s16slvn1necw.R.inc(1555);if ((((PatternOptionBuilder.DATE_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1556)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1557)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1558);return createDate(str);
        }
        }else {__CLR4_5_216s16slvn1necw.R.inc(1559);if ((((PatternOptionBuilder.CLASS_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1560)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1561)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1562);return createClass(str);
        }
        }else {__CLR4_5_216s16slvn1necw.R.inc(1563);if ((((PatternOptionBuilder.FILE_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1564)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1565)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1566);return createFile(str);
        }
        }else {__CLR4_5_216s16slvn1necw.R.inc(1567);if ((((PatternOptionBuilder.EXISTING_FILE_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1568)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1569)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1570);return createFile(str);
        }
        }else {__CLR4_5_216s16slvn1necw.R.inc(1571);if ((((PatternOptionBuilder.FILES_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1572)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1573)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1574);return createFiles(str);
        }
        }else {__CLR4_5_216s16slvn1necw.R.inc(1575);if ((((PatternOptionBuilder.URL_VALUE == clazz)&&(__CLR4_5_216s16slvn1necw.R.iget(1576)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1577)==0&false)))
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1578);return createURL(str);
        }
        }else
        {{
            __CLR4_5_216s16slvn1necw.R.inc(1579);return null;
        }
    }}}}}}}}}}finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}

    /**
      * Create an Object from the classname and empty constructor.
      *
      * @param classname the argument value
      * @return the initialised object, or null if it couldn't create
      * the Object.
      */
    public static Object createObject(String classname) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1580);
        __CLR4_5_216s16slvn1necw.R.inc(1581);Class cl = null;

        __CLR4_5_216s16slvn1necw.R.inc(1582);try
        {
            __CLR4_5_216s16slvn1necw.R.inc(1583);cl = Class.forName(classname);
        }
        catch (ClassNotFoundException cnfe)
        {
            __CLR4_5_216s16slvn1necw.R.inc(1584);throw new ParseException("Unable to find the class: " + classname);
        }

        __CLR4_5_216s16slvn1necw.R.inc(1585);Object instance = null;

        __CLR4_5_216s16slvn1necw.R.inc(1586);try
        {
            __CLR4_5_216s16slvn1necw.R.inc(1587);instance = cl.newInstance();
        }
        catch (Exception e)
        {
            __CLR4_5_216s16slvn1necw.R.inc(1588);throw new ParseException(e.getClass().getName() + "; Unable to create an instance of: " + classname);
        }

        __CLR4_5_216s16slvn1necw.R.inc(1589);return instance;
    }finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}

    /**
     * Create a number from a String. If a . is present, it creates a
     * Double, otherwise a Long.
     *
     * @param str the value
     * @return the number represented by <code>str</code>, if <code>str</code>
     * is not a number, null is returned.
     */
    public static Number createNumber(String str) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1590);
        __CLR4_5_216s16slvn1necw.R.inc(1591);try
        {
            __CLR4_5_216s16slvn1necw.R.inc(1592);if ((((str.indexOf('.') != -1)&&(__CLR4_5_216s16slvn1necw.R.iget(1593)!=0|true))||(__CLR4_5_216s16slvn1necw.R.iget(1594)==0&false)))
            {{
                __CLR4_5_216s16slvn1necw.R.inc(1595);return Double.valueOf(str);
            }
            }else
            {{
                __CLR4_5_216s16slvn1necw.R.inc(1596);return Long.valueOf(str);
            }
        }}
        catch (NumberFormatException e)
        {
            __CLR4_5_216s16slvn1necw.R.inc(1597);throw new ParseException(e.getMessage());
        }
    }finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}

    /**
     * Returns the class whose name is <code>classname</code>.
     *
     * @param classname the class name
     * @return The class if it is found, otherwise return null
     */
    public static Class createClass(String classname) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1598);
        __CLR4_5_216s16slvn1necw.R.inc(1599);try
        {
            __CLR4_5_216s16slvn1necw.R.inc(1600);return Class.forName(classname);
        }
        catch (ClassNotFoundException e)
        {
            __CLR4_5_216s16slvn1necw.R.inc(1601);throw new ParseException("Unable to find the class: " + classname);
        }
    }finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}

    /**
     * Returns the date represented by <code>str</code>.
     *
     * @param str the date string
     * @return The date if <code>str</code> is a valid date string,
     * otherwise return null.
     */
    public static Date createDate(String str) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1602);
        __CLR4_5_216s16slvn1necw.R.inc(1603);throw new UnsupportedOperationException("Not yet implemented");
    }finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}

    /**
     * Returns the URL represented by <code>str</code>.
     *
     * @param str the URL string
     * @return The URL is <code>str</code> is well-formed, otherwise
     * return null.
     */
    public static URL createURL(String str) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1604);
        __CLR4_5_216s16slvn1necw.R.inc(1605);try
        {
            __CLR4_5_216s16slvn1necw.R.inc(1606);return new URL(str);
        }
        catch (MalformedURLException e)
        {
            __CLR4_5_216s16slvn1necw.R.inc(1607);throw new ParseException("Unable to parse the URL: " + str);
        }
    }finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}

    /**
     * Returns the File represented by <code>str</code>.
     *
     * @param str the File location
     * @return The file represented by <code>str</code>.
     */
    public static File createFile(String str) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1608);
        __CLR4_5_216s16slvn1necw.R.inc(1609);return new File(str);
    }finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}

    /**
     * Returns the File[] represented by <code>str</code>.
     *
     * @param str the paths to the files
     * @return The File[] represented by <code>str</code>.
     */
    public static File[] createFiles(String str) throws ParseException
    {try{__CLR4_5_216s16slvn1necw.R.inc(1610);
        // to implement/port:
        //        return FileW.findFiles(str);
        __CLR4_5_216s16slvn1necw.R.inc(1611);throw new UnsupportedOperationException("Not yet implemented");
    }finally{__CLR4_5_216s16slvn1necw.R.flushNeeded();}}
}
