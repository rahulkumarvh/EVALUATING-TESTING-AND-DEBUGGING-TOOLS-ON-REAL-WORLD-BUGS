/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 20:53:31 GMT 2024
 */

package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.filter.FilteringGeneratorDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.TestKeySerializers;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.util.EnumValues;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.Date;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StdKeySerializers_ESTest extends StdKeySerializers_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
      PropertySerializerMap propertySerializerMap0 = PropertySerializerMap.emptyForProperties();
      Class<Integer> class0 = Integer.class;
      PropertySerializerMap propertySerializerMap1 = propertySerializerMap0.newWith(class0, stdKeySerializers_Dynamic0);
      Class<Byte> class1 = Byte.class;
      ObjectMapper objectMapper0 = new ObjectMapper();
      SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
      JsonSerializer<Object> jsonSerializer0 = stdKeySerializers_Dynamic0._findAndAddDynamic(propertySerializerMap1, class1, serializerProvider0);
      assertFalse(jsonSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PropertySerializerMap propertySerializerMap0 = PropertySerializerMap.emptyForRootValues();
      Class<Object> class0 = Object.class;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
      JsonSerializer<Object> jsonSerializer0 = stdKeySerializers_Dynamic0._findAndAddDynamic(propertySerializerMap0, class0, defaultSerializerProvider_Impl0);
      assertFalse(jsonSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Class<Long> class0 = Long.class;
      StdKeySerializers.EnumKeySerializer stdKeySerializers_EnumKeySerializer0 = new StdKeySerializers.EnumKeySerializer(class0, (EnumValues) null);
      assertFalse(stdKeySerializers_EnumKeySerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<String> class0 = String.class;
      StdKeySerializers.Default stdKeySerializers_Default0 = new StdKeySerializers.Default((-324), class0);
      Object object0 = new Object();
      FilteringGeneratorDelegate filteringGeneratorDelegate0 = new FilteringGeneratorDelegate((JsonGenerator) null, (TokenFilter) null, false, false);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      stdKeySerializers_Default0.serialize(object0, filteringGeneratorDelegate0, defaultSerializerProvider_Impl0);
      assertFalse(stdKeySerializers_Default0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Byte> class0 = Byte.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, true);
      assertFalse(jsonSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Object> class0 = Object.class;
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
      PropertySerializerMap propertySerializerMap0 = PropertySerializerMap.emptyForProperties();
      stdKeySerializers_Dynamic0._findAndAddDynamic(propertySerializerMap0, class0, defaultSerializerProvider_Impl0);
      Object object0 = new Object();
      JsonFactory jsonFactory0 = new JsonFactory();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) dataOutputStream0);
      try { 
        stdKeySerializers_Dynamic0.serialize(object0, jsonGenerator0, defaultSerializerProvider_Impl0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Can not write a field name, expecting a value
         //
         verifyException("com.fasterxml.jackson.core.JsonGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<MockCalendar> class0 = MockCalendar.class;
      StdKeySerializers.Default stdKeySerializers_Default0 = new StdKeySerializers.Default(4, class0);
      Class<Long> class1 = Long.TYPE;
      ObjectMapper objectMapper0 = new ObjectMapper();
      SerializerProvider serializerProvider0 = objectMapper0.getSerializerProvider();
      // Undeclared exception!
      try { 
        stdKeySerializers_Default0.serialize(class1, (JsonGenerator) null, serializerProvider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<TestKeySerializers.Outer> class0 = TestKeySerializers.Outer.class;
      StdKeySerializers.Default stdKeySerializers_Default0 = new StdKeySerializers.Default(2, class0);
      Byte byte0 = new Byte((byte) (-1));
      JsonFactory jsonFactory0 = new JsonFactory();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((DataOutput) dataOutputStream0);
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      // Undeclared exception!
      try { 
        stdKeySerializers_Default0.serialize(byte0, jsonGenerator0, defaultSerializerProvider_Impl0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Byte cannot be cast to java.util.Calendar
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<TestKeySerializers.ABCMixin> class0 = TestKeySerializers.ABCMixin.class;
      // Undeclared exception!
      try { 
        StdKeySerializers.getFallbackKeySerializer((SerializationConfig) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.util.EnumValues", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getFallbackKeySerializer((SerializationConfig) null, class0);
      assertFalse(jsonSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getFallbackKeySerializer((SerializationConfig) null, (Class<?>) null);
      assertFalse(jsonSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<TestKeySerializers.ABCMixin> class0 = TestKeySerializers.ABCMixin.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, false);
      assertNull(jsonSerializer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
      RootNameLookup rootNameLookup0 = new RootNameLookup();
      ConfigOverrides configOverrides0 = new ConfigOverrides();
      SerializationConfig serializationConfig0 = new SerializationConfig((BaseSettings) null, stdSubtypeResolver0, (SimpleMixInResolver) null, rootNameLookup0, configOverrides0);
      Class<UUID> class0 = UUID.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer(serializationConfig0, class0, true);
      assertFalse(jsonSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<MockCalendar> class0 = MockCalendar.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, true);
      assertFalse(jsonSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<TestKeySerializers.ABCMixin> class0 = TestKeySerializers.ABCMixin.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, true);
      assertFalse(jsonSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
      Class<TestKeySerializers.ABCMixin> class0 = TestKeySerializers.ABCMixin.class;
      JsonFactory jsonFactory0 = new JsonFactory();
      JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((OutputStream) null);
      ObjectMapper objectMapper0 = new ObjectMapper();
      SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
      try { 
        stdKeySerializers_Dynamic0.serialize(class0, jsonGenerator0, serializerProvider0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Can not write a field name, expecting a value
         //
         verifyException("com.fasterxml.jackson.core.JsonGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, true);
      assertFalse(jsonSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, true);
      assertFalse(jsonSerializer0.isUnwrappingSerializer());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, false);
      assertFalse(jsonSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, (Class<?>) null, false);
      assertFalse(jsonSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<UUID> class0 = UUID.class;
      StdKeySerializers.EnumKeySerializer stdKeySerializers_EnumKeySerializer0 = StdKeySerializers.EnumKeySerializer.construct(class0, (EnumValues) null);
      ObjectMapper objectMapper0 = new ObjectMapper();
      SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
      // Undeclared exception!
      try { 
        stdKeySerializers_EnumKeySerializer0.serialize((Object) null, (JsonGenerator) null, serializerProvider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$EnumKeySerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
      StdKeySerializers.StringKeySerializer stdKeySerializers_StringKeySerializer0 = new StdKeySerializers.StringKeySerializer();
      // Undeclared exception!
      try { 
        stdKeySerializers_StringKeySerializer0.serialize((Object) null, (JsonGenerator) null, defaultSerializerProvider_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
      JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
      stdKeySerializers_Dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
      assertFalse(stdKeySerializers_Dynamic0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
      StdKeySerializers.Dynamic stdKeySerializers_Dynamic1 = (StdKeySerializers.Dynamic)stdKeySerializers_Dynamic0.readResolve();
      assertFalse(stdKeySerializers_Dynamic1.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Date> class0 = Date.class;
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, false);
      assertFalse(jsonSerializer0.usesObjectId());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getDefault();
      assertFalse(jsonSerializer0.isUnwrappingSerializer());
  }
}
