/*
 * This file was automatically generated by EvoSuite
 * Wed May 01 03:49:16 GMT 2024
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PosixParser_ESTest extends PosixParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "L";
      stringArray0[1] = "-w";
      stringArray0[2] = "--:;";
      stringArray0[3] = "w";
      stringArray0[4] = "L";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
      assertEquals(5, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "--SM8=2*";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
      assertEquals(1, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-VzN";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(9, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-VN";
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("VN", true, (String) null);
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      // Undeclared exception!
      try { 
        posixParser0.flatten(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      options0.addOption("w", "w", false, "w");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "L";
      stringArray0[1] = "-w";
      stringArray0[2] = "--:;";
      stringArray0[3] = "w";
      stringArray0[4] = "L";
      posixParser0.flatten(options0, stringArray0, false);
      posixParser0.burstToken("--:;", true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-o";
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(3, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      Options options1 = options0.addOption("", false, "");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      posixParser0.flatten(options1, stringArray0, true);
      posixParser0.burstToken("--:;", true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      Options options1 = options0.addOption("", true, "");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      posixParser0.flatten(options1, stringArray0, true);
      posixParser0.burstToken("--:;", true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      options0.addOption("", "", true, "");
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      posixParser0.flatten(options0, stringArray0, false);
      posixParser0.burstToken("--", false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      posixParser0.flatten(options0, stringArray0, false);
      posixParser0.burstToken("--:;", false);
  }
}
