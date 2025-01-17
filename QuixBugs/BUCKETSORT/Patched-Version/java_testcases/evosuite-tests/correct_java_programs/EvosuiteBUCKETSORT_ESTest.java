/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 11:16:13 GMT 2024
 */

package correct_java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import correct_java_programs.BUCKETSORT;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EvosuiteBUCKETSORT_ESTest extends EvosuiteBUCKETSORT_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = BUCKETSORT.bucketsort(arrayList0, 2458);
      ArrayList<Integer> arrayList2 = BUCKETSORT.bucketsort(arrayList1, 2458);
      BUCKETSORT.bucketsort(arrayList0, 2458);
      ArrayList<Integer> arrayList3 = BUCKETSORT.bucketsort(arrayList2, 2458);
      // Undeclared exception!
      BUCKETSORT.bucketsort(arrayList3, 2458);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort((ArrayList<Integer>) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("correct_java_programs.BUCKETSORT", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort(arrayList0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort(arrayList0, (-1655));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // List length = -1655
         //
         verifyException("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = Integer.getInteger((String) null, (-1));
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        BUCKETSORT.bucketsort(arrayList0, 44);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      ArrayList<Integer> arrayList1 = BUCKETSORT.bucketsort(arrayList0, 184);
      assertTrue(arrayList1.equals((Object)arrayList0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BUCKETSORT bUCKETSORT0 = new BUCKETSORT();
  }
}
