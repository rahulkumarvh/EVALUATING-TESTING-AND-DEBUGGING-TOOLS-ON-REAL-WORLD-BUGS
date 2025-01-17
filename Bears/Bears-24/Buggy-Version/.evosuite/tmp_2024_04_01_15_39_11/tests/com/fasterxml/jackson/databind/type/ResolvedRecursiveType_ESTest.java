/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 20:40:36 GMT 2024
 */

package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ResolvedRecursiveType_ESTest extends ResolvedRecursiveType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withValueHandler("");
      assertFalse(javaType0.isFinal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withValueHandler(typeBindings0);
      assertTrue(javaType0.isConcrete());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Stack<JavaType> stack0 = new Stack<JavaType>();
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (List<JavaType>) stack0);
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withTypeHandler(typeBindings0);
      assertTrue(javaType0.isConcrete());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withStaticTyping();
      assertFalse(javaType0.isArrayType());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withStaticTyping();
      assertFalse(javaType0.isAbstract());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentValueHandler(resolvedRecursiveType0);
      assertFalse(javaType0.isAbstract());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      Class<ResolvedRecursiveType> class1 = ResolvedRecursiveType.class;
      ArrayList<JavaType> arrayList0 = new ArrayList<JavaType>();
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class1, (List<JavaType>) arrayList0);
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentValueHandler((Object) null);
      assertFalse(javaType0.isArrayType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ArrayList<JavaType> arrayList0 = new ArrayList<JavaType>();
      TypeBindings typeBindings0 = TypeBindings.create((Class<?>) class0, (List<JavaType>) arrayList0);
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentTypeHandler(arrayList0);
      assertEquals(0, javaType0.containedTypeCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentTypeHandler(resolvedRecursiveType0);
      assertFalse(javaType0.isContainerType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
      MapLikeType mapLikeType0 = new MapLikeType(simpleType0, simpleType0, simpleType0);
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentType(mapLikeType0);
      assertFalse(javaType0.useStaticType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentType(resolvedRecursiveType0);
      assertTrue(javaType0.isConcrete());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
      Class<ResolvedRecursiveType> class1 = ResolvedRecursiveType.class;
      JavaType[] javaTypeArray0 = new JavaType[4];
      javaTypeArray0[3] = (JavaType) resolvedRecursiveType0;
      CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class1, (TypeBindings) null, (JavaType) resolvedRecursiveType0, javaTypeArray0, javaTypeArray0[3]);
      resolvedRecursiveType0.setReference(collectionLikeType0);
      JavaType javaType0 = resolvedRecursiveType0.getSuperClass();
      assertFalse(javaType0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      resolvedRecursiveType0.setReference(resolvedRecursiveType0);
      JavaType javaType0 = resolvedRecursiveType0.getSelfReferencedType();
      assertFalse(javaType0.isAbstract());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
      Class<ResolvedRecursiveType> class1 = ResolvedRecursiveType.class;
      JavaType[] javaTypeArray0 = new JavaType[4];
      javaTypeArray0[3] = (JavaType) resolvedRecursiveType0;
      CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class1, (TypeBindings) null, (JavaType) resolvedRecursiveType0, javaTypeArray0, javaTypeArray0[3]);
      resolvedRecursiveType0.setReference(collectionLikeType0);
      JavaType javaType0 = resolvedRecursiveType0.getSelfReferencedType();
      assertFalse(javaType0.isArrayType());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      Class<Locale.FilteringMode> class1 = Locale.FilteringMode.class;
      JavaType[] javaTypeArray0 = new JavaType[5];
      SimpleType simpleType0 = new SimpleType(class1, typeBindings0, resolvedRecursiveType0, javaTypeArray0);
      resolvedRecursiveType0.setReference(simpleType0);
      StringBuilder stringBuilder0 = new StringBuilder("]c*6Da-5\"u(qK");
      StringBuilder stringBuilder1 = resolvedRecursiveType0.getGenericSignature(stringBuilder0);
      assertSame(stringBuilder1, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
      Class<ResolvedRecursiveType> class1 = ResolvedRecursiveType.class;
      JavaType[] javaTypeArray0 = new JavaType[4];
      javaTypeArray0[3] = (JavaType) resolvedRecursiveType0;
      CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class1, (TypeBindings) null, (JavaType) resolvedRecursiveType0, javaTypeArray0, javaTypeArray0[3]);
      resolvedRecursiveType0.setReference(collectionLikeType0);
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = resolvedRecursiveType0.getErasedSignature(stringBuilder0);
      assertSame(stringBuilder0, stringBuilder1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0._narrow(class0);
      assertSame(resolvedRecursiveType0, javaType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<Locale.FilteringMode> class0 = Locale.FilteringMode.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0._narrow(class0);
      assertFalse(javaType0.isAbstract());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<ResolvedRecursiveType> class0 = ResolvedRecursiveType.class;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      ReferenceType referenceType0 = ReferenceType.upgradeFrom(resolvedRecursiveType0, resolvedRecursiveType0);
      resolvedRecursiveType0.setReference(referenceType0);
      StringBuilder stringBuilder0 = new StringBuilder("]c*6Da-5\"u(qK");
      // Undeclared exception!
      resolvedRecursiveType0.getGenericSignature(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
      CollectionLikeType collectionLikeType0 = CollectionLikeType.upgradeFrom(resolvedRecursiveType0, resolvedRecursiveType0);
      resolvedRecursiveType0.setReference(collectionLikeType0);
      String string0 = resolvedRecursiveType0.toString();
      assertEquals("[recursive type; java.lang.Object", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      boolean boolean0 = resolvedRecursiveType0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<String> class0 = String.class;
      TypeBindings typeBindings0 = TypeBindings.createIfNeeded(class0, (JavaType[]) null);
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      boolean boolean0 = resolvedRecursiveType0.equals(resolvedRecursiveType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      boolean boolean0 = resolvedRecursiveType0.equals(typeBindings0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      String string0 = resolvedRecursiveType0.toString();
      assertEquals("[recursive type; UNRESOLVED", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Object> class0 = Object.class;
      SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
      MapLikeType mapLikeType0 = new MapLikeType(simpleType0, simpleType0, simpleType0);
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      resolvedRecursiveType0.setReference(mapLikeType0);
      JavaType javaType0 = resolvedRecursiveType0.getSuperClass();
      assertNull(javaType0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.getSuperClass();
      assertNull(javaType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<Object> class0 = Object.class;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
      Class<ResolvedRecursiveType> class1 = ResolvedRecursiveType.class;
      JavaType[] javaTypeArray0 = new JavaType[4];
      javaTypeArray0[3] = (JavaType) resolvedRecursiveType0;
      CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class1, (TypeBindings) null, (JavaType) resolvedRecursiveType0, javaTypeArray0, javaTypeArray0[3]);
      resolvedRecursiveType0.setReference(collectionLikeType0);
      // Undeclared exception!
      try { 
        resolvedRecursiveType0.setReference(javaTypeArray0[3]);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Trying to re-set self reference; old value = [collection-like type; class com.fasterxml.jackson.databind.type.ResolvedRecursiveType, contains [recursive type; com.fasterxml.jackson.databind.type.ResolvedRecursiveType], new = [recursive type; com.fasterxml.jackson.databind.type.ResolvedRecursiveType
         //
         verifyException("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0._narrow(class0);
      assertSame(javaType0, resolvedRecursiveType0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentValueHandler((Object) null);
      assertTrue(javaType0.isConcrete());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withStaticTyping();
      assertSame(resolvedRecursiveType0, javaType0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      Class<String> class1 = String.class;
      JavaType[] javaTypeArray0 = new JavaType[5];
      JavaType javaType0 = resolvedRecursiveType0.refine(class1, typeBindings0, resolvedRecursiveType0, javaTypeArray0);
      assertNull(javaType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
      JavaType javaType0 = resolvedRecursiveType0.withValueHandler(class0);
      assertFalse(javaType0.hasValueHandler());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentTypeHandler(typeBindings0);
      assertFalse(javaType0.isCollectionLikeType());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      boolean boolean0 = resolvedRecursiveType0.isContainerType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.withContentType((JavaType) null);
      assertFalse(javaType0.isArrayType());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      Integer integer0 = new Integer(1);
      JavaType javaType0 = resolvedRecursiveType0.withTypeHandler(integer0);
      assertFalse(javaType0.isArrayType());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      TypeBindings typeBindings0 = TypeBindings.emptyBindings();
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      JavaType javaType0 = resolvedRecursiveType0.getSelfReferencedType();
      assertNull(javaType0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TypeBindings typeBindings0 = TypeFactory.EMPTY_BINDINGS;
      Class<Object> class0 = Object.class;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
      StringBuilder stringBuilder0 = new StringBuilder();
      // Undeclared exception!
      try { 
        resolvedRecursiveType0.getGenericSignature(stringBuilder0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, (TypeBindings) null);
      // Undeclared exception!
      try { 
        resolvedRecursiveType0.getErasedSignature((StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.type.ResolvedRecursiveType", e);
      }
  }
}
