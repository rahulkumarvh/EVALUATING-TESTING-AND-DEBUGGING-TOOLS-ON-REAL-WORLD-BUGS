/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 12:36:57 GMT 2024
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java_programs.QUICKSORT;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EvosuiteQUICKSORT_ESTest extends EvosuiteQUICKSORT_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(0, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        QUICKSORT.quicksort((ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(1);
      arrayList0.add(0, integer1);
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      ArrayList<Integer> arrayList2 = QUICKSORT.quicksort(arrayList1);
      assertEquals(2, arrayList1.size());
      assertTrue(arrayList2.equals((Object)arrayList1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      arrayList0.add(0, integer0);
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(1, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QUICKSORT qUICKSORT0 = new QUICKSORT();
  }
}
