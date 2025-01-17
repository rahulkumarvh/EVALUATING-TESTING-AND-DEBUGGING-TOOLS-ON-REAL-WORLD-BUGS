/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 00:05:19 GMT 2024
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.map.MultiValueMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultiValueMap_ESTest extends MultiValueMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Collection<Object>, Object> hashMap0 = new HashMap<Collection<Object>, Object>();
      // Undeclared exception!
      try { 
        MultiValueMap.multiValueMap((Map<Collection<Object>, ? super Collection<AbstractMap.SimpleImmutableEntry<String, Integer>>>) hashMap0, (Factory<Collection<AbstractMap.SimpleImmutableEntry<String, Integer>>>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The factory must not be null
         //
         verifyException("org.apache.commons.collections4.map.MultiValueMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<LinkedList<Object>, Object> hashMap0 = new HashMap<LinkedList<Object>, Object>();
      MultiValueMap<LinkedList<Object>, Object> multiValueMap0 = MultiValueMap.multiValueMap((Map<LinkedList<Object>, ? super Collection<Object>>) hashMap0);
      Iterator<Map.Entry<LinkedList<Object>, Object>> iterator0 = (Iterator<Map.Entry<LinkedList<Object>, Object>>)multiValueMap0.iterator();
      Iterator<Object> iterator1 = multiValueMap0.iterator((Object) iterator0);
      assertNotNull(iterator1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultiValueMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>> multiValueMap0 = new MultiValueMap<Integer, AbstractMap.SimpleImmutableEntry<String, Integer>>();
      multiValueMap0.clear();
      assertTrue(multiValueMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<LinkedList<Object>, Object> hashMap0 = new HashMap<LinkedList<Object>, Object>();
      MultiValueMap<LinkedList<Object>, Object> multiValueMap0 = MultiValueMap.multiValueMap((Map<LinkedList<Object>, ? super Collection<Object>>) hashMap0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      hashMap0.put(linkedList0, linkedList0);
      multiValueMap0.putAll((Map<? extends LinkedList<Object>, ?>) hashMap0);
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultiValueMap<Object, Integer> multiValueMap0 = new MultiValueMap<Object, Integer>();
      MultiValueMap<Object, Object> multiValueMap1 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<Object>>) multiValueMap0);
      multiValueMap0.put(multiValueMap1, "");
      boolean boolean0 = multiValueMap1.containsValue((Object) "");
      assertFalse(multiValueMap1.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultiValueMap<HashMap<Object, String>, ArrayList<Object>> multiValueMap0 = new MultiValueMap<HashMap<Object, String>, ArrayList<Object>>();
      Integer integer0 = new Integer(1);
      boolean boolean0 = multiValueMap0.removeMapping(integer0, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<LinkedList<Object>, Object> hashMap0 = new HashMap<LinkedList<Object>, Object>();
      MultiValueMap<LinkedList<Object>, Object> multiValueMap0 = MultiValueMap.multiValueMap((Map<LinkedList<Object>, ? super Collection<Object>>) hashMap0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      hashMap0.put(linkedList0, linkedList0);
      boolean boolean0 = multiValueMap0.containsValue((Object) hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MultiValueMap<Object, Integer> multiValueMap0 = new MultiValueMap<Object, Integer>();
      MultiValueMap<Object, Object> multiValueMap1 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<Object>>) multiValueMap0);
      MultiValueMap multiValueMap2 = (MultiValueMap)multiValueMap0.put(multiValueMap1, multiValueMap1);
      MultiValueMap<Object, Collection<String>> multiValueMap3 = new MultiValueMap<Object, Collection<String>>();
      // Undeclared exception!
      try { 
        multiValueMap3.putAll((Map<?, ?>) multiValueMap2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultiValueMap<String, AbstractMap.SimpleEntry<Object, Object>> multiValueMap0 = new MultiValueMap<String, AbstractMap.SimpleEntry<Object, Object>>();
      MultiValueMap<String, LinkedList<Object>> multiValueMap1 = new MultiValueMap<String, LinkedList<Object>>();
      multiValueMap1.putAll((Map<? extends String, ?>) multiValueMap0);
      assertEquals(0, multiValueMap0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultiValueMap<Collection<Object>, Integer> multiValueMap0 = new MultiValueMap<Collection<Object>, Integer>();
      Collection<Object> collection0 = multiValueMap0.values();
      Collection<Object> collection1 = multiValueMap0.values();
      assertSame(collection1, collection0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultiValueMap<ArrayList<Object>, Integer> multiValueMap0 = new MultiValueMap<ArrayList<Object>, Integer>();
      boolean boolean0 = multiValueMap0.containsValue((Object) "6", (Object) "6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultiValueMap<ArrayList<Object>, String> multiValueMap0 = new MultiValueMap<ArrayList<Object>, String>();
      MultiValueMap<Object, Integer> multiValueMap1 = new MultiValueMap<Object, Integer>();
      MultiValueMap<Object, LinkedList<Object>> multiValueMap2 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<LinkedList<Object>>>) multiValueMap1);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      multiValueMap2.put(multiValueMap0, arrayList0);
      MultiValueMap<Object, AbstractMap.SimpleEntry<Object, Object>> multiValueMap3 = MultiValueMap.multiValueMap((Map<Object, ? super Collection<AbstractMap.SimpleEntry<Object, Object>>>) multiValueMap1);
      int int0 = multiValueMap3.size((Object) multiValueMap0);
      assertFalse(multiValueMap1.isEmpty());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultiValueMap<ArrayList<String>, Collection<Object>> multiValueMap0 = new MultiValueMap<ArrayList<String>, Collection<Object>>();
      MultiValueMap<LinkedList<String>, ArrayList<String>> multiValueMap1 = new MultiValueMap<LinkedList<String>, ArrayList<String>>();
      int int0 = multiValueMap0.size((Object) multiValueMap1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultiValueMap<ArrayList<String>, Object> multiValueMap0 = new MultiValueMap<ArrayList<String>, Object>();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      boolean boolean0 = multiValueMap0.putAll(arrayList0, (Collection<Object>) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MultiValueMap<String, Object> multiValueMap0 = MultiValueMap.multiValueMap((Map<String, ? super Collection<Object>>) hashMap0);
      HashMap<HashMap<Object, Object>, Object> hashMap1 = new HashMap<HashMap<Object, Object>, Object>();
      MultiValueMap<HashMap<Object, Object>, AbstractMap.SimpleEntry<Object, Object>> multiValueMap1 = MultiValueMap.multiValueMap((Map<HashMap<Object, Object>, ? super Collection<AbstractMap.SimpleEntry<Object, Object>>>) hashMap1);
      Collection<Object> collection0 = multiValueMap1.values();
      assertNotNull(collection0);
      
      LinkedList<Object> linkedList0 = new LinkedList<Object>(collection0);
      boolean boolean0 = multiValueMap0.putAll((String) null, (Collection<Object>) linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "q lMsxI|");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      MultiValueMap<String, Object> multiValueMap0 = MultiValueMap.multiValueMap((Map<String, ? super Collection<Object>>) hashMap0);
      boolean boolean0 = multiValueMap0.putAll((String) null, (Collection<Object>) linkedList0);
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<LinkedList<String>, Object> hashMap0 = new HashMap<LinkedList<String>, Object>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Integer integer0 = new Integer(694);
      hashMap0.put(linkedList0, integer0);
      MultiValueMap<LinkedList<String>, AbstractMap.SimpleImmutableEntry<Object, Integer>> multiValueMap0 = MultiValueMap.multiValueMap((Map<LinkedList<String>, ? super Collection<AbstractMap.SimpleImmutableEntry<Object, Integer>>>) hashMap0);
      // Undeclared exception!
      try { 
        multiValueMap0.totalSize();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unsupported object type: java.lang.Integer
         //
         verifyException("org.apache.commons.collections4.CollectionUtils", e);
      }
  }
}
