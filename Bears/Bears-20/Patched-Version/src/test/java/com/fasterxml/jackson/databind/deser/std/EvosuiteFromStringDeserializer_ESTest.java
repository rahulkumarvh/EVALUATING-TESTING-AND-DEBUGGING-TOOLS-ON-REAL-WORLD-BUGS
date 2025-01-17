/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 01 20:36:18 GMT 2024
 */

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.type.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.Test;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.*;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EvosuiteFromStringDeserializer_ESTest extends FromStringDeserializer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<InputStream> class0 = InputStream.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 1499);
      Object object0 = fromStringDeserializer_Std0._deserializeFromEmptyString();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<File> class0 = File.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 2);
      Object object0 = fromStringDeserializer_Std0._deserializeFromEmptyString();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std((Class<?>) null, (-261));
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      // Undeclared exception!
      try { 
        fromStringDeserializer_Std0._deserializeEmbedded((Object) null, defaultDeserializationContext_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<InetSocketAddress> class0 = InetSocketAddress.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      try { 
        fromStringDeserializer_Std0._deserializeEmbedded(fromStringDeserializer_Std0.STD_STRING_BUILDER, defaultDeserializationContext_Impl0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Don't know how to convert embedded Object of type java.lang.Integer into java.net.InetSocketAddress
         //
         verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Class<Pattern> class0 = Pattern.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 28);
      int int0 = fromStringDeserializer_Std0._firstHyphenOrUnderscore("-Z?@K0P/^");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<Currency> class0 = Currency.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 1124);
      int int0 = fromStringDeserializer_Std0._firstHyphenOrUnderscore("C)_)DN!-e1F`");
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<String> class0 = String.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 13);
      Object object0 = fromStringDeserializer_Std0._deserializeFromEmptyString();
      assertEquals("", object0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<MapType> class0 = MapType.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
      Locale locale0 = (Locale)fromStringDeserializer_Std0._deserializeFromEmptyString();
      assertEquals("", locale0.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<SimpleType> class0 = SimpleType.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 3);
      URI uRI0 = (URI)fromStringDeserializer_Std0._deserializeFromEmptyString();
      assertFalse(uRI0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<ReferenceType> class0 = ReferenceType.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, (-3822));
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      // Undeclared exception!
      try { 
        fromStringDeserializer_Std0._deserialize("", defaultDeserializationContext_Impl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal error: this code path should never get executed
         //
         verifyException("com.fasterxml.jackson.core.util.VersionUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 13);
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      Object object0 = fromStringDeserializer_Std0._deserialize(" (through reference chain: ", defaultDeserializationContext_Impl0);
      assertEquals(" (through reference chain: ", object0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<ArrayType> class0 = ArrayType.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 12);
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      MockInetSocketAddress mockInetSocketAddress0 = (MockInetSocketAddress)fromStringDeserializer_Std0._deserialize("pKJ}5[D4", defaultDeserializationContext_Impl0);
      assertEquals("200.42.42.0", mockInetSocketAddress0.getHostString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<InetSocketAddress> class0 = InetSocketAddress.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 11);
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      Inet4Address inet4Address0 = (Inet4Address)fromStringDeserializer_Std0._deserialize(") to output", defaultDeserializationContext_Impl0);
      assertFalse(inet4Address0.isMulticastAddress());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Class<ArrayType> class0 = ArrayType.class;
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 10);
      ZoneInfo zoneInfo0 = (ZoneInfo)fromStringDeserializer_Std0._deserialize("6", defaultDeserializationContext_Impl0);
      assertEquals("GMT", zoneInfo0.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<MapLikeType> class0 = MapLikeType.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 8);
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      Object object0 = fromStringDeserializer_Std0._deserialize("r)P.V[y!3.@{y", defaultDeserializationContext_Impl0);
      assertEquals("r)p.v[y!3.@{y", object0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Class<URL> class0 = URL.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 7);
      Object object0 = fromStringDeserializer_Std0._deserialize("", (DeserializationContext) null);
      assertEquals("", object0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<InputStream> class0 = InputStream.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 6);
      ObjectMapper objectMapper0 = new ObjectMapper();
      DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
      // Undeclared exception!
      try { 
        fromStringDeserializer_Std0._deserialize("t{", deserializationContext0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Currency", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<NullNode> class0 = NullNode.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 5);
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      // Undeclared exception!
      try { 
        fromStringDeserializer_Std0._deserialize("=ZGQ/[#OOV=*gB", defaultDeserializationContext_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 4);
      // Undeclared exception!
      try { 
        fromStringDeserializer_Std0._deserialize("kRGQ \"", defaultDeserializationContext_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      Class<Pattern> class0 = Pattern.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 3);
      Object object0 = fromStringDeserializer_Std0._deserialize("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer", defaultDeserializationContext_Impl0);
      assertEquals("com.fasterxml.jackson.databind.deser.std.FromStringDeserializer", object0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Pattern> class0 = Pattern.class;
      DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
      BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 1);
      MockFile mockFile0 = (MockFile)fromStringDeserializer_Std0._deserialize("com.fasterxml.jackson.databind.MapperFeature", defaultDeserializationContext_Impl0);
      assertFalse(mockFile0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      Locale locale0 = Locale.KOREA;
      Class<URL> class0 = URL.class;
      try { 
        objectMapper0.convertValue((Object) locale0, class0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can not deserialize value of type java.net.URL from String \"java.util.Locale@0000000500\": not a valid textual representation, problem: no protocol: java.util.Locale@0000000500
         //  at [Source: java.lang.String@0000000511; line: -1, column: -1]
         //
         verifyException("com.fasterxml.jackson.databind.ObjectMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UUIDDeserializer uUIDDeserializer0 = new UUIDDeserializer();
      Class<TimeZone> class0 = TimeZone.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 680);
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      IOContext iOContext0 = new IOContext(bufferRecycler0, uUIDDeserializer0, false);
      StringReader stringReader0 = new StringReader("~)1{)&+:d<0");
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
      ObjectReader objectReader0 = objectMapper0.reader(jsonNodeFactory0);
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 6, stringReader0, objectReader0, charsToNameCanonicalizer0);
      BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
      DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
      // Undeclared exception!
      try { 
        fromStringDeserializer_Std0.deserialize((JsonParser) readerBasedJsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<StringBuilder> class0 = StringBuilder.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(9, FromStringDeserializer.Std.STD_CHARSET);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<InetSocketAddress> class0 = InetSocketAddress.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(1, FromStringDeserializer.Std.STD_FILE);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<CollectionType> class0 = CollectionType.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertNull(fromStringDeserializer_Std0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Class<TimeZone> class0 = TimeZone.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(4, FromStringDeserializer.Std.STD_CLASS);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Class<Charset> class0 = Charset.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(13, FromStringDeserializer.Std.STD_STRING_BUILDER);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Class<Locale> class0 = Locale.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(10, FromStringDeserializer.Std.STD_TIME_ZONE);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<Pattern> class0 = Pattern.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(13, FromStringDeserializer.Std.STD_STRING_BUILDER);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Currency> class0 = Currency.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(10, FromStringDeserializer.Std.STD_TIME_ZONE);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ObjectMapper objectMapper0 = new ObjectMapper();
      Class<MapType> class0 = MapType.class;
      ObjectReader objectReader0 = objectMapper0.readerFor(class0);
      assertNotNull(objectReader0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<URI> class0 = URI.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      URI uRI0 = (URI)fromStringDeserializer_Std0._deserializeFromEmptyString();
      assertEquals("", uRI0.getRawPath());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<URL> class0 = URL.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(9, FromStringDeserializer.Std.STD_CHARSET);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Class<File> class0 = File.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertFalse(fromStringDeserializer_Std0.isCachable());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<?>[] classArray0 = FromStringDeserializer.types();
      assertEquals(13, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<InetAddress> class0 = InetAddress.class;
      FromStringDeserializer.Std fromStringDeserializer_Std0 = FromStringDeserializer.findDeserializer(class0);
      assertEquals(2, FromStringDeserializer.Std.STD_URL);
  }
}
