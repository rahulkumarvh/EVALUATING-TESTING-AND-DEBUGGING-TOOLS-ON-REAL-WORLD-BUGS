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

/** 
 * A sample program shpwing the use of Options and the HelpFormatter class 
 *
 * @author Slawek Zachcial
 **/
public class HelpFormatterExamples
{public static class __CLR4_5_21b01b0lvkk1tb3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0061\u006e\u006a\u0069\u0074\u006b\u0075\u006d\u0061\u0072\u002f\u0070\u0065\u0072\u0073\u006f\u006e\u0061\u006c\u005f\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0043\u006f\u006c\u006c\u0065\u0067\u0065\u0049\u006c\u006c\u0069\u006e\u006f\u0069\u0073\u002f\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0045\u006e\u0067\u0069\u006e\u0065\u0065\u0072\u0069\u006e\u0067\u0050\u0072\u0069\u006e\u0063\u0069\u0070\u006c\u0065\u0073\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u0034\u002f\u006d\u0069\u006c\u0065\u0073\u0074\u006f\u006e\u0065\u002d\u0034\u002d\u006e\u0065\u0077\u002f\u0043\u006c\u0069\u005f\u0031\u0038\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1714370698324L,8589935092L,1704,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
   // --------------------------------------------------------------- Constants

   // ------------------------------------------------------------------ Static

   public static void main( String[] args )
   {try{__CLR4_5_21b01b0lvkk1tb3.R.inc(1692);
      __CLR4_5_21b01b0lvkk1tb3.R.inc(1693);System.out.println("\n#\n# 'man' example\n#");
      __CLR4_5_21b01b0lvkk1tb3.R.inc(1694);manExample();
/*
      System.out.println("\n#\n# 'bzip2' example\n#");
      bzip2Example();
      System.out.println("\n#\n# 'ls' example\n#");
      lsExample();
*/
   }finally{__CLR4_5_21b01b0lvkk1tb3.R.flushNeeded();}}

   static void manExample()
   {try{__CLR4_5_21b01b0lvkk1tb3.R.inc(1695);
      __CLR4_5_21b01b0lvkk1tb3.R.inc(1696);String cmdLine =
         "man [-c|-f|-k|-w|-tZT device] [-adlhu7V] [-Mpath] [-Ppager] [-Slist] " +
         "[-msystem] [-pstring] [-Llocale] [-eextension] [section] page ...";
      __CLR4_5_21b01b0lvkk1tb3.R.inc(1697);Options opts =
         new Options().
         addOption("a", "all",            false, "find all matching manual pages.").
         addOption("d", "debug",          false, "emit debugging messages.").
         addOption("e", "extension",      false, "limit search to extension type 'extension'.").
         addOption("f", "whatis",         false, "equivalent to whatis.").
         addOption("k", "apropos",        false, "equivalent to apropos.").
         addOption("w", "location",       false, "print physical location of man page(s).").
         addOption("l", "local-file",     false, "interpret 'page' argument(s) as local filename(s)").
         addOption("u", "update",         false, "force a cache consistency check.").
         //FIXME - should generate -r,--prompt string
         addOption("r", "prompt",         true,  "provide 'less' pager with prompt.").
         addOption("c", "catman",         false, "used by catman to reformat out of date cat pages.").
         addOption("7", "ascii",          false, "display ASCII translation or certain latin1 chars.").
         addOption("t", "troff",          false, "use troff format pages.").
         //FIXME - should generate -T,--troff-device device
         addOption("T", "troff-device",   true,  "use groff with selected device.").
         addOption("Z", "ditroff",        false, "use groff with selected device.").
         addOption("D", "default",        false, "reset all options to their default values.").
         //FIXME - should generate -M,--manpath path
         addOption("M", "manpath",        true,  "set search path for manual pages to 'path'.").
         //FIXME - should generate -P,--pager pager
         addOption("P", "pager",          true,  "use program 'pager' to display output.").
         //FIXME - should generate -S,--sections list
         addOption("S", "sections",       true,  "use colon separated section list.").
         //FIXME - should generate -m,--systems system
         addOption("m", "systems",        true,  "search for man pages from other unix system(s).").
         //FIXME - should generate -L,--locale locale
         addOption("L", "locale",         true,  "defaine the locale for this particular man search.").
         //FIXME - should generate -p,--preprocessor string
         addOption("p", "preprocessor",   true,  "string indicates which preprocessor to run.\n" +
                                                 " e - [n]eqn  p - pic     t - tbl\n" +
                                                 " g - grap    r - refer   v - vgrind").
         addOption("V", "version",        false, "show version.").
         addOption("h", "help",           false, "show this usage message.");

      __CLR4_5_21b01b0lvkk1tb3.R.inc(1698);HelpFormatter hf = new HelpFormatter();
      //hf.printHelp(cmdLine, opts);
      __CLR4_5_21b01b0lvkk1tb3.R.inc(1699);hf.printHelp(60, cmdLine, null, opts, null);
   }finally{__CLR4_5_21b01b0lvkk1tb3.R.flushNeeded();}}

   static void bzip2Example()
   {try{__CLR4_5_21b01b0lvkk1tb3.R.inc(1700);
      __CLR4_5_21b01b0lvkk1tb3.R.inc(1701);System.out.println( "Coming soon" );
   }finally{__CLR4_5_21b01b0lvkk1tb3.R.flushNeeded();}}

   static void lsExample()
   {try{__CLR4_5_21b01b0lvkk1tb3.R.inc(1702);
      __CLR4_5_21b01b0lvkk1tb3.R.inc(1703);System.out.println( "Coming soon" );
   }finally{__CLR4_5_21b01b0lvkk1tb3.R.flushNeeded();}}


   // -------------------------------------------------------------- Attributes

   // ------------------------------------------------------------ Constructors
   
   // ------------------------------------------------------------------ Public

   // --------------------------------------------------------------- Protected

   // ------------------------------------------------------- Package protected   
   
   // ----------------------------------------------------------------- Private
   
   // ----------------------------------------------------------- Inner classes

}
