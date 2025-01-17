/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 02 00:27:06 GMT 2024
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.Quote;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVFormat_ESTest extends CSVFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      boolean boolean0 = cSVFormat0.getSkipHeaderRecord();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord(true);
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat1.isNullHandling());
      assertTrue(cSVFormat1.isEscaping());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isQuoting());
      assertFalse(boolean0);
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      StringReader stringReader0 = new StringReader("33e+fP}6{|KK':HX)!");
      CSVParser cSVParser0 = cSVFormat0.parse(stringReader0);
      assertEquals(0L, cSVParser0.getCurrentLineNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      Quote quote0 = Quote.NONE;
      CSVFormat cSVFormat1 = cSVFormat0.withQuotePolicy(quote0);
      cSVFormat1.hashCode();
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat1.isEscaping());
      assertTrue(cSVFormat1.getIgnoreSurroundingSpaces());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(' ');
      assertEquals('\"', (char)cSVFormat1.getQuoteChar());
      
      Object[] objectArray0 = new Object[5];
      String string0 = cSVFormat1.format(objectArray0);
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertEquals("\"\",,,,", string0);
      assertEquals(' ', (char)cSVFormat1.getCommentStart());
      assertTrue(cSVFormat1.isCommentingEnabled());
      assertFalse(cSVFormat1.isEscaping());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVFormat cSVFormat1 = cSVFormat0.withIgnoreEmptyLines(true);
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(cSVFormat1.isEscaping());
      assertFalse(cSVFormat1.isNullHandling());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.isQuoting());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        cSVFormat0.withHeader(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The header contains a duplicate entry: 'null' in [null, null, null]
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      // Undeclared exception!
      try { 
        cSVFormat0.withCommentStart('\n');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The comment start character cannot be a line break
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      // Undeclared exception!
      try { 
        cSVFormat0.withDelimiter('\r');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The delimiter cannot be a line break
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Ct},~hYGx";
      stringArray0[2] = "";
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(cSVFormat1.isNullHandling());
      assertTrue(cSVFormat1.isEscaping());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertFalse(boolean0);
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(cSVFormat1.isQuoting());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.newFormat('e');
      boolean boolean0 = cSVFormat0.equals("6AI[$ii0[|[x");
      assertFalse(cSVFormat0.getSkipHeaderRecord());
      assertFalse(cSVFormat0.getIgnoreEmptyLines());
      assertFalse(cSVFormat0.getIgnoreSurroundingSpaces());
      assertEquals('e', cSVFormat0.getDelimiter());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      boolean boolean0 = cSVFormat0.equals(cSVFormat0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      boolean boolean0 = cSVFormat0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.newFormat('e');
      CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('e');
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertTrue(boolean0);
      assertFalse(cSVFormat1.getSkipHeaderRecord());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertEquals('e', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = CSVFormat.TDF;
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      Quote quote0 = Quote.MINIMAL;
      CSVFormat cSVFormat1 = cSVFormat0.withQuotePolicy(quote0);
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(cSVFormat1.isEscaping());
      assertTrue(cSVFormat1.isQuoting());
      assertFalse(cSVFormat1.isNullHandling());
      assertFalse(boolean0);
      assertEquals(',', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withQuoteChar('E');
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(boolean0);
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(cSVFormat1.isNullHandling());
      assertEquals('\\', (char)cSVFormat1.getEscape());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
      assertEquals('E', (char)cSVFormat1.getQuoteChar());
      assertFalse(cSVFormat1.isCommentingEnabled());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withQuoteChar((Character) null);
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(boolean0);
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.isNullHandling());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      Character character0 = Character.valueOf('T');
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(character0);
      CSVFormat cSVFormat2 = cSVFormat1.withNullString("U");
      boolean boolean0 = cSVFormat2.equals(cSVFormat1);
      assertTrue(cSVFormat2.isQuoting());
      assertTrue(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(cSVFormat1.equals((Object)cSVFormat0));
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertEquals("\r\n", cSVFormat2.getRecordSeparator());
      assertFalse(boolean0);
      assertFalse(cSVFormat2.isEscaping());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('8');
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat1.isQuoting());
      assertFalse(boolean0);
      assertTrue(cSVFormat1.isEscaping());
      assertFalse(cSVFormat1.isNullHandling());
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertEquals('8', (char)cSVFormat1.getCommentStart());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      Character character0 = new Character('u');
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(character0);
      boolean boolean0 = cSVFormat1.equals(cSVFormat0);
      assertFalse(cSVFormat1.isNullHandling());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(cSVFormat1.isEscaping());
      assertFalse(boolean0);
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.isQuoting());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      Character character0 = Character.valueOf('_');
      CSVFormat cSVFormat1 = cSVFormat0.withEscape(character0);
      boolean boolean0 = cSVFormat1.equals(cSVFormat0);
      assertEquals(',', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertEquals('_', (char)cSVFormat1.getEscape());
      assertFalse(cSVFormat1.isCommentingEnabled());
      assertFalse(cSVFormat1.isNullHandling());
      assertEquals('\"', (char)cSVFormat1.getQuoteChar());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withEscape((Character) null);
      boolean boolean0 = cSVFormat1.equals(cSVFormat0);
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat1.isNullHandling());
      assertFalse(boolean0);
      assertEquals('\t', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      Character character0 = Character.valueOf('_');
      CSVFormat cSVFormat1 = cSVFormat0.withEscape(character0);
      CSVFormat cSVFormat2 = cSVFormat1.withNullString("BD)yx");
      boolean boolean0 = cSVFormat1.equals(cSVFormat2);
      assertFalse(boolean0);
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat2.isCommentingEnabled());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertEquals('\"', (char)cSVFormat2.getQuoteChar());
      assertEquals('_', (char)cSVFormat2.getEscape());
      assertEquals("\r\n", cSVFormat2.getRecordSeparator());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVFormat cSVFormat1 = cSVFormat0.withNullString("BD)yx");
      CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces(false);
      boolean boolean0 = cSVFormat2.equals(cSVFormat1);
      assertTrue(cSVFormat2.isQuoting());
      assertTrue(boolean0);
      assertEquals("BD)yx", cSVFormat2.getNullString());
      assertFalse(cSVFormat2.isEscaping());
      assertEquals("\r\n", cSVFormat2.getRecordSeparator());
      assertFalse(cSVFormat2.equals((Object)cSVFormat0));
      assertFalse(cSVFormat2.getIgnoreSurroundingSpaces());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces(true);
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(cSVFormat1.isQuoting());
      assertFalse(boolean0);
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.isEscaping());
      assertFalse(cSVFormat1.isNullHandling());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat1.isCommentingEnabled());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = CSVFormat.RFC4180;
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVFormat cSVFormat1 = cSVFormat0.withRecordSeparator((String) null);
      boolean boolean0 = cSVFormat1.equals(cSVFormat0);
      assertTrue(cSVFormat1.isQuoting());
      assertFalse(cSVFormat1.isEscaping());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(boolean0);
      assertEquals(',', cSVFormat1.getDelimiter());
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withRecordSeparator('U');
      boolean boolean0 = cSVFormat0.equals(cSVFormat1);
      assertFalse(cSVFormat1.isNullHandling());
      assertFalse(cSVFormat1.isEscaping());
      assertTrue(cSVFormat1.isQuoting());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(boolean0);
      assertEquals(',', cSVFormat1.getDelimiter());
      assertEquals("U", cSVFormat1.getRecordSeparator());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      String[] stringArray0 = new String[1];
      CSVFormat cSVFormat1 = cSVFormat0.DEFAULT.withHeader(stringArray0);
      cSVFormat1.getHeader();
      assertFalse(cSVFormat1.isNullHandling());
      assertFalse(cSVFormat1.isEscaping());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertEquals(',', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.isQuoting());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(')');
      cSVFormat1.hashCode();
      assertTrue(cSVFormat1.getIgnoreSurroundingSpaces());
      assertFalse(cSVFormat1.isNullHandling());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withNullString("");
      cSVFormat1.hashCode();
      assertEquals('\t', cSVFormat1.getDelimiter());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertTrue(cSVFormat1.getIgnoreSurroundingSpaces());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord(true);
      cSVFormat1.hashCode();
      assertFalse(cSVFormat1.getIgnoreEmptyLines());
      assertFalse(cSVFormat1.getIgnoreSurroundingSpaces());
      assertTrue(cSVFormat1.getSkipHeaderRecord());
      assertFalse(cSVFormat1.isNullHandling());
      assertFalse(cSVFormat1.isQuoting());
      assertEquals('\t', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.newFormat('r');
      cSVFormat0.hashCode();
      assertFalse(cSVFormat0.getSkipHeaderRecord());
      assertEquals('r', cSVFormat0.getDelimiter());
      assertFalse(cSVFormat0.getIgnoreEmptyLines());
      assertFalse(cSVFormat0.getIgnoreSurroundingSpaces());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('9');
      String string0 = cSVFormat1.toString();
      assertEquals("Delimiter=<\t> QuoteChar=<\"> CommentStart=<9> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withEscape('K');
      String string0 = cSVFormat1.toString();
      assertEquals("Delimiter=<,> Escape=<K> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withNullString("");
      String[] stringArray0 = new String[1];
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
      String string0 = cSVFormat2.toString();
      assertEquals("Delimiter=<\t> QuoteChar=<\"> NullString=<> RecordSeparator=<\r\n> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false Header:[null]", string0);
      assertTrue(cSVFormat1.getIgnoreSurroundingSpaces());
      assertTrue(cSVFormat1.getIgnoreEmptyLines());
      assertEquals('\t', cSVFormat1.getDelimiter());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String string0 = cSVFormat0.toString();
      assertEquals("Delimiter=<\t> Escape=<\\> RecordSeparator=<\n> SkipHeaderRecord:false", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.newFormat('>');
      String string0 = cSVFormat0.toString();
      assertEquals("Delimiter=<>> SkipHeaderRecord:false", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      Character character0 = new Character('.');
      CSVFormat cSVFormat1 = cSVFormat0.withQuoteChar(character0);
      CSVFormat cSVFormat2 = cSVFormat1.withDelimiter('.');
      try { 
        cSVFormat2.validate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The quoteChar character and the delimiter cannot be the same ('.')
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      Character character0 = new Character('i');
      CSVFormat cSVFormat1 = cSVFormat0.withEscape(character0);
      CSVFormat cSVFormat2 = cSVFormat1.withDelimiter('i');
      try { 
        cSVFormat2.validate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The escape character and the delimiter cannot be the same ('i')
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.newFormat('u');
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart('u');
      try { 
        cSVFormat1.validate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The comment start character and the delimiter cannot be the same ('u')
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Character character0 = new Character('o');
      CSVFormat cSVFormat1 = cSVFormat0.withQuoteChar(character0);
      CSVFormat cSVFormat2 = cSVFormat1.withCommentStart(character0);
      try { 
        cSVFormat2.validate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The comment start character and the quoteChar cannot be the same ('o')
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      Character character0 = Character.valueOf(' ');
      CSVFormat cSVFormat1 = cSVFormat0.withEscape(character0);
      CSVFormat cSVFormat2 = cSVFormat1.withCommentStart(' ');
      Object[] objectArray0 = new Object[5];
      // Undeclared exception!
      try { 
        cSVFormat2.format(objectArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The comment start and the escape character cannot be the same (' ')
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      Quote quote0 = Quote.NONE;
      CSVFormat cSVFormat1 = cSVFormat0.withQuotePolicy(quote0);
      try { 
        cSVFormat1.validate();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No quotes mode set but no escape character is set
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      // Undeclared exception!
      try { 
        cSVFormat0.withQuoteChar('\n');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The quoteChar cannot be a line break
         //
         verifyException("org.apache.commons.csv.CSVFormat", e);
      }
  }
}
