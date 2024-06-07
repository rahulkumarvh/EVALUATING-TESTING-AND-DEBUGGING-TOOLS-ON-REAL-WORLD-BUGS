package com.fasterxml.jackson.core.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory0.createParser("JSON");
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory7.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean11 = jsonToken10.isBoolean();
        byte[] byteArray12 = jsonToken10.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory9.createJsonParser(byteArray12);
        jsonParser13.close();
        java.lang.Object obj15 = jsonParser13.getEmbeddedObject();
        boolean boolean16 = jsonParser13.hasTextCharacters();
        boolean boolean17 = jsonParser13.hasCurrentToken();
        double double18 = jsonParser13.getValueAsDouble();
        java.lang.String str19 = jsonParser13.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator21 = jsonFactory20.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory20.configure(feature22, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory24.enable(feature25);
        com.fasterxml.jackson.core.JsonParser.Feature feature27 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory26.disable(feature27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonParser13.enable(feature27);
        boolean boolean30 = jsonFactory0.isEnabled(feature27);
        boolean boolean31 = jsonFactory0.requiresCustomCodec();
        java.io.File file32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory0.createParser(file32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(outputDecorator21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature22.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature27.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.getValueAsLong(100L);
        int int15 = jsonParser6.getTextLength();
        java.lang.String str17 = jsonParser6.getValueAsString(" ");
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray8 = new char[] { ' ' };
        bufferRecycler2.releaseCharBuffer(0, charArray8);
        char[] charArray12 = bufferRecycler2.allocCharBuffer(0, (int) ' ');
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        int int14 = textBuffer13.size();
        textBuffer13.resetWithString("false");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        java.lang.String str12 = jsonParser6.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.enable(feature18);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory19.disable(feature20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonParser6.enable(feature20);
        jsonParser6.close();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser22);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Writer writer5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory4.createGenerator(writer5);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = jsonFactory4._getBufferRecycler();
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(bufferRecycler7);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = jsonParser6.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        boolean boolean5 = jsonFactory0.canUseCharArrays();
        com.fasterxml.jackson.core.JsonParser.Feature feature6 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean8 = feature6.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory0.enable(feature6);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = new com.fasterxml.jackson.core.util.BufferRecycler();
        char[] charArray13 = bufferRecycler10.allocCharBuffer(0, (int) (short) -1);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory9.createParser(charArray13);
        java.lang.String str15 = jsonParser14.getCurrentName();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature6.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        boolean boolean3 = jsonFactory0.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser("}");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = jsonFactory0._getBufferRecycler();
        int int8 = bufferRecycler6.byteBufferLength(0);
        char[][] charArray9 = bufferRecycler6._charBuffers;
        byte[][] byteArray10 = bufferRecycler6._byteBuffers;
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(bufferRecycler6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8000 + "'", int8 == 8000);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(byteArray10);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonLocation jsonLocation9 = jsonParser6.getCurrentLocation();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(jsonLocation9);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        char[] charArray4 = textBuffer1.getTextBuffer();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        textBuffer1.setCurrentLength(262144);
        textBuffer1.append(' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        java.io.Reader reader23 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createJsonParser(reader23);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser24.configure(feature25, true);
        jsonParser27.clearCurrentToken();
        com.fasterxml.jackson.core.Version version29 = jsonParser27.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature30 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean32 = feature30.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonParser27.configure(feature30, true);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser15.disable(feature30);
        long long36 = jsonParser15.getValueAsLong();
        int int38 = jsonParser15.nextIntValue(2);
        com.fasterxml.jackson.core.FormatSchema formatSchema39 = jsonParser15.getSchema();
        int int40 = jsonParser15.getFeatureMask();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature30.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNull(formatSchema39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        java.io.OutputStream outputStream7 = null;
        int int8 = jsonParser6.releaseBuffered(outputStream7);
        java.io.Writer writer9 = null;
        int int10 = jsonParser6.releaseBuffered(writer9);
        jsonParser6.overrideCurrentName("JSON");
        // The following exception was thrown during execution in test generation
        try {
            short short13 = jsonParser6.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = jsonParser6.getSchema();
        int int10 = jsonParser6.getValueAsInt();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonParser6.getIntValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.disable(feature7);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        byte[][] byteArray17 = bufferRecycler12._byteBuffers;
        char[][] charArray18 = bufferRecycler12._charBuffers;
        byte[] byteArray20 = bufferRecycler12.balloc((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory8.createJsonParser(byteArray20, (int) (short) 10, 0);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory8.setInputDecorator(inputDecorator24);
        java.io.File file26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory8.createParser(file26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser9.getCurrentToken();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext11 = jsonParser9.getParsingContext();
        java.lang.Object obj12 = jsonParser9.getObjectId();
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser9.setFeatureMask(3);
        com.fasterxml.jackson.core.Version version15 = jsonParser9.version();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertNotNull(jsonStreamContext11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(version15);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray8 = new char[] { ' ' };
        bufferRecycler2.releaseCharBuffer(0, charArray8);
        char[] charArray12 = bufferRecycler2.allocCharBuffer(0, (int) ' ');
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        int int14 = textBuffer13.size();
        textBuffer13.setCurrentLength(0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.fasterxml.jackson.core.JsonLocation jsonLocation1 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory3.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken6 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean7 = jsonToken6.isBoolean();
        byte[] byteArray8 = jsonToken6.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory5.createJsonParser(byteArray8);
        jsonParser9.close();
        java.lang.Object obj11 = jsonParser9.getEmbeddedObject();
        boolean boolean12 = jsonParser9.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = jsonParser9.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException14 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation13);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory16.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken19 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean20 = jsonToken19.isBoolean();
        byte[] byteArray21 = jsonToken19.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory18.createJsonParser(byteArray21);
        jsonParser22.close();
        java.lang.Object obj24 = jsonParser22.getEmbeddedObject();
        boolean boolean25 = jsonParser22.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation26 = jsonParser22.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException27 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation26);
        java.lang.String str28 = jsonParseException27.getOriginalMessage();
        jsonParseException14.addSuppressed((java.lang.Throwable) jsonParseException27);
        com.fasterxml.jackson.core.JsonParseException jsonParseException30 = new com.fasterxml.jackson.core.JsonParseException("}", jsonLocation1, (java.lang.Throwable) jsonParseException27);
        java.lang.Throwable[] throwableArray31 = jsonParseException27.getSuppressed();
        java.lang.String str32 = jsonParseException27.getOriginalMessage();
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + jsonToken19 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken19.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonLocation26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser9.hasCurrentToken();
        double double11 = jsonParser9.getValueAsDouble();
        jsonParser9.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = jsonParser9.getNumberValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        java.lang.String str10 = jsonParser6.nextTextValue();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        boolean boolean11 = jsonParser6.canReadTypeId();
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator13 = jsonFactory12.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory12.configure(feature14, true);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory12.createParser("JSON");
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory19.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken22 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean23 = jsonToken22.isBoolean();
        byte[] byteArray24 = jsonToken22.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory21.createJsonParser(byteArray24);
        jsonParser25.close();
        java.lang.Object obj27 = jsonParser25.getEmbeddedObject();
        boolean boolean28 = jsonParser25.hasTextCharacters();
        boolean boolean29 = jsonParser25.hasCurrentToken();
        double double30 = jsonParser25.getValueAsDouble();
        java.lang.String str31 = jsonParser25.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator33 = jsonFactory32.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature34 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory32.configure(feature34, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature37 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory36.enable(feature37);
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory38.disable(feature39);
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser25.enable(feature39);
        boolean boolean42 = jsonFactory12.isEnabled(feature39);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = jsonParser6.disable(feature39);
        // The following exception was thrown during execution in test generation
        try {
            float float44 = jsonParser6.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(outputDecorator13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature14.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertTrue("'" + jsonToken22 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken22.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(outputDecorator33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature34.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertTrue("'" + feature37 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature37.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jsonParser43);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.disable(feature7);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        byte[][] byteArray17 = bufferRecycler12._byteBuffers;
        char[][] charArray18 = bufferRecycler12._charBuffers;
        byte[] byteArray20 = bufferRecycler12.balloc((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory8.createJsonParser(byteArray20, (int) (short) 10, 0);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory8.setInputDecorator(inputDecorator24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory25.copy();
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory25.createParser(reader27);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = jsonFactory25._getBufferRecycler();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(bufferRecycler29);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray4 = textBuffer1.contentsAsArray();
        java.lang.String str5 = textBuffer1.toString();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser6.nextToken();
        boolean boolean8 = jsonToken7.isStructStart();
        boolean boolean9 = jsonToken7.isBoolean();
        boolean boolean10 = jsonToken7.isStructStart();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = jsonParser6.getCurrentLocation();
        double double12 = jsonParser6.getValueAsDouble((double) '4');
        java.io.Writer writer13 = null;
        int int14 = jsonParser6.releaseBuffered(writer13);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jsonParser6.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonLocation10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator11 = jsonFactory10.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory10.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser6.disable(feature12);
        boolean boolean16 = feature12.enabledByDefault();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(outputDecorator11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory8.createJsonParser(byteArray11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(byteArray11);
        java.lang.String str14 = jsonParser13.getCurrentName();
        long long16 = jsonParser13.nextLongValue((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float17 = jsonParser13.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@60c46119; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.Writer writer2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(writer2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator5 = jsonFactory4.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory4.configure(feature6, true);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createParser("");
        byte[] byteArray11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean16 = jsonToken15.isStructEnd();
        boolean boolean17 = jsonToken15.isScalarValue();
        byte[] byteArray18 = jsonToken15.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory8.createJsonParser(byteArray18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory0.createParser(byteArray18);
        char[] charArray21 = jsonParser20.getTextCharacters();
        com.fasterxml.jackson.core.ObjectCodec objectCodec22 = null;
        jsonParser20.setCodec(objectCodec22);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonParser20.setFeatureMask((int) (byte) 10);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonParser25.skipChildren();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNull(outputDecorator5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(charArray21);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertNotNull(jsonParser26);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        // The following exception was thrown during execution in test generation
        try {
            float float7 = jsonParser6.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray8 = bufferRecycler7._byteBuffers;
        byte[][] byteArray9 = bufferRecycler7._byteBuffers;
        char[] charArray11 = bufferRecycler7.allocCharBuffer((int) (short) 1);
        int int13 = bufferRecycler7.byteBufferLength(0);
        char[] charArray15 = bufferRecycler7.calloc(0);
        textBuffer1.resetWithShared(charArray15, 7, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8000 + "'", int13 == 8000);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[]");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        long long10 = jsonParser6.getValueAsLong();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = jsonParser6.nextToken();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(jsonToken11);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        boolean boolean11 = jsonFactory2.canUseCharArrays();
        com.fasterxml.jackson.core.Version version12 = jsonFactory2.version();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(version12);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature11 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory2.enable(feature11);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler15.releaseByteBuffer(1, byteArray21);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory12.createParser(byteArray21);
        com.fasterxml.jackson.core.ObjectCodec objectCodec24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory12.setCodec(objectCodec24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory26.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken29 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean30 = jsonToken29.isBoolean();
        byte[] byteArray31 = jsonToken29.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory28.createJsonParser(byteArray31);
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory28.configure(feature33, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory28.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator38 = jsonFactory37.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory37.configure(feature39, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature42 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory41.enable(feature42);
        boolean boolean44 = jsonFactory43.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator46 = jsonFactory45.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature47 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory45.configure(feature47, true);
        boolean boolean50 = feature47.enabledByDefault();
        boolean boolean51 = jsonFactory43.isEnabled(feature47);
        int int52 = feature47.getMask();
        boolean boolean53 = jsonFactory36.isEnabled(feature47);
        com.fasterxml.jackson.core.JsonFactory jsonFactory55 = jsonFactory12.configure(feature47, true);
        java.io.File file56 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator58 = jsonFactory55.createGenerator(file56, jsonEncoding57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10, -1, -1]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertTrue("'" + jsonToken29 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken29.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNull(outputDecorator38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature42.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(outputDecorator46);
        org.junit.Assert.assertTrue("'" + feature47 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature47.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonFactory55);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("}", (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.disable(feature7);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        byte[][] byteArray17 = bufferRecycler12._byteBuffers;
        char[][] charArray18 = bufferRecycler12._charBuffers;
        byte[] byteArray20 = bufferRecycler12.balloc((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory8.createJsonParser(byteArray20, (int) (short) 10, 0);
        boolean boolean24 = jsonParser23.requiresCustomCodec();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec20 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory2.setCodec(objectCodec20);
        java.io.Reader reader22 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory2.createParser(reader22);
        long long25 = jsonParser23.getValueAsLong((long) (byte) 0);
        java.lang.String str26 = jsonParser23.getText();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        double double8 = jsonParser6.getValueAsDouble();
        int int9 = jsonParser6.getValueAsInt();
        jsonParser6.close();
        java.io.Writer writer11 = null;
        int int12 = jsonParser6.releaseBuffered(writer11);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        boolean boolean12 = jsonParser6.hasTextCharacters();
        java.io.Writer writer13 = null;
        int int14 = jsonParser6.releaseBuffered(writer13);
        boolean boolean15 = jsonParser6.isExpectedStartArrayToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setCharacterEscapes(characterEscapes5);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory6.createJsonParser(byteArray13, 2, 11);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory6.createJsonParser("");
        // The following exception was thrown during execution in test generation
        try {
            long long19 = jsonParser18.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 100, 10, -1, 100, 0]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonParser18);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory6.setInputDecorator(inputDecorator8);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory6.setInputDecorator(inputDecorator10);
        java.io.Reader reader12 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser(reader12);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.disable(feature7);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        byte[][] byteArray17 = bufferRecycler12._byteBuffers;
        char[][] charArray18 = bufferRecycler12._charBuffers;
        byte[] byteArray20 = bufferRecycler12.balloc((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory8.createJsonParser(byteArray20, (int) (short) 10, 0);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory8.setInputDecorator(inputDecorator24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory25.copy();
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory25.createParser(reader27);
        java.io.OutputStream outputStream29 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator30 = jsonFactory25.createJsonGenerator(outputStream29);
        java.net.URL uRL31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory25.createJsonParser(uRL31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonGenerator30);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        char[] charArray3 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        java.lang.String str12 = jsonParser6.getText();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        java.lang.String str11 = jsonParser6.getCurrentName();
        int int12 = jsonParser6.getTextOffset();
        int int13 = jsonParser6.getCurrentTokenId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        java.lang.String str10 = jsonParser6.nextTextValue();
        java.lang.String str11 = jsonParser6.getValueAsString();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "true" + "'", str11, "true");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler7.releaseByteBuffer(1, byteArray13);
        bufferRecycler2.releaseByteBuffer(7, byteArray13);
        char[][] charArray16 = bufferRecycler2._charBuffers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator23 = jsonFactory22.getInputDecorator();
        java.lang.String str24 = jsonFactory22.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(1);
        boolean boolean28 = jsonFactory22.isEnabled(feature25);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory22.setInputDecorator(inputDecorator29);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean33 = feature31.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory22.enable(feature31);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.size();
        char[] charArray43 = new char[] { 'a', ' ', 'a', '#', ' ' };
        textBuffer36.resetWithShared(charArray43, 100, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory22.createParser(charArray43);
        bufferRecycler2.releaseCharBuffer(11, charArray43);
        char[] charArray50 = bufferRecycler2.calloc((int) 'a');
        byte[][] byteArray51 = bufferRecycler2._byteBuffers;
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1, -1]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNull(inputDecorator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " " + "'", str24, " ");
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "a a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "a a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a,  , a, #,  ]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(byteArray51);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = jsonFactory4.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory8.configure(feature10, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = jsonFactory8.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator15 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.configure(feature16, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = jsonFactory18.getInputDecorator();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = jsonFactory21.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, true);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory25.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean29 = feature28.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory25.enable(feature28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory18.configure(feature28, false);
        byte[] byteArray34 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory18.createJsonParser(byteArray34);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory8.createJsonParser(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory4.createParser(byteArray34, 256, 4000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(characterEscapes7);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNull(characterEscapes13);
        org.junit.Assert.assertNull(outputDecorator15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNull(outputDecorator22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser36);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory2._getBufferRecycler();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        int int22 = feature21.getMask();
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory2.enable(feature21);
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory23.createJsonParser("\000\000\000\000\000\000\000\000\000\000\000\000");
        java.lang.String str26 = jsonFactory23.getFormatName();
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory23.createParser(reader27);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "JSON" + "'", str26, "JSON");
        org.junit.Assert.assertNotNull(jsonParser28);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        int int7 = jsonParser6.getTextOffset();
        com.fasterxml.jackson.core.Base64Variant base64Variant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = jsonParser6.getBinaryValue(base64Variant8);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        java.io.Reader reader23 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createJsonParser(reader23);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser24.configure(feature25, true);
        jsonParser27.clearCurrentToken();
        com.fasterxml.jackson.core.Version version29 = jsonParser27.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature30 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean32 = feature30.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonParser27.configure(feature30, true);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser15.disable(feature30);
        // The following exception was thrown during execution in test generation
        try {
            double double36 = jsonParser35.getDoubleValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature30.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonParser35);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory2.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator12 = jsonFactory11.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature13 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory11.configure(feature13, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature16 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory15.enable(feature16);
        boolean boolean18 = jsonFactory17.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator20 = jsonFactory19.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory19.configure(feature21, true);
        boolean boolean24 = feature21.enabledByDefault();
        boolean boolean25 = jsonFactory17.isEnabled(feature21);
        int int26 = feature21.getMask();
        boolean boolean27 = jsonFactory10.isEnabled(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory28.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory30.createParser("true");
        com.fasterxml.jackson.core.ObjectCodec objectCodec33 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory30.setCodec(objectCodec33);
        com.fasterxml.jackson.core.JsonParser.Feature feature35 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory30.enable(feature35);
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory10.disable(feature35);
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator39 = jsonFactory38.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature40 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory38.configure(feature40, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator43 = jsonFactory42.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory42.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory46.setRootValueSeparator("hi!");
        byte[] byteArray49 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory46.createJsonParser(byteArray49);
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonFactory45.createJsonParser(byteArray49);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory10.createParser(byteArray49);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(outputDecorator12);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature13.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature16.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(outputDecorator20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature35.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertNull(outputDecorator39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature40.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNull(inputDecorator43);
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(jsonParser52);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        com.fasterxml.jackson.core.JsonToken jsonToken11 = jsonParser6.getCurrentToken();
        boolean boolean12 = jsonParser6.hasCurrentToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jsonToken11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = jsonFactory0.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory6.configure(feature8, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator11 = jsonFactory10.getInputDecorator();
        java.lang.String str12 = jsonFactory10.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean21 = feature20.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory17.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory10.configure(feature20, false);
        byte[] byteArray26 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory10.createJsonParser(byteArray26);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory0.createJsonParser(byteArray26);
        long long29 = jsonParser28.getValueAsLong();
        // The following exception was thrown during execution in test generation
        try {
            short short30 = jsonParser28.getShortValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@2d589d76; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(characterEscapes5);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(inputDecorator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator18 = jsonFactory17.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory17.configure(feature19, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory21.enable(feature22);
        com.fasterxml.jackson.core.JsonParser.Feature feature24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory23.disable(feature24);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonParser16.disable(feature24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = jsonParser16.getBooleanValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not of boolean type? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNull(outputDecorator18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature22.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature24.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonParser26);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator18 = jsonFactory17.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory17.configure(feature19, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory21.enable(feature22);
        com.fasterxml.jackson.core.JsonParser.Feature feature24 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory23.disable(feature24);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonParser16.disable(feature24);
        boolean boolean28 = feature24.enabledIn(1000);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNull(outputDecorator18);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature22.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertTrue("'" + feature24 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature24.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.Version version16 = jsonParser4.version();
        jsonParser4.close();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertNotNull(version16);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        boolean boolean11 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.setFeatureMask(4000);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        java.io.Reader reader17 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory16.createJsonParser(reader17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator20 = jsonFactory19.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory19.configure(feature21, true);
        java.io.Reader reader24 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory23.createJsonParser(reader24);
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser25.configure(feature26, true);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonParser18.disable(feature26);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = null;
        boolean boolean31 = jsonParser29.canUseSchema(formatSchema30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator33 = jsonFactory32.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory32.configure(feature34, true);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createJsonParser(reader37);
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser38.configure(feature39, true);
        jsonParser41.clearCurrentToken();
        com.fasterxml.jackson.core.Version version43 = jsonParser41.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean46 = feature44.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonParser41.configure(feature44, true);
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonParser29.disable(feature44);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonParser13.enable(feature44);
        int int51 = jsonParser50.getValueAsInt();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNull(outputDecorator20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(outputDecorator33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        int int7 = jsonParser6.getTextOffset();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal9 = jsonParser6.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        int int11 = jsonParser6.getValueAsInt();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal12 = jsonParser6.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        char[] charArray3 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.resetWithEmpty();
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.OutputStream outputStream10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = jsonFactory5.createGenerator(outputStream10);
        java.io.Writer writer12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = jsonFactory5.createJsonGenerator(writer12);
        java.io.Writer writer14 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = jsonFactory5.createGenerator(writer14);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler16 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer17 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler16);
        textBuffer17.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler21 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray24 = bufferRecycler21.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray27 = new char[] { ' ' };
        bufferRecycler21.releaseCharBuffer(0, charArray27);
        textBuffer17.resetWithShared(charArray27, 4000, 4);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonFactory5.createParser(charArray27, 262144, (-1));
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append(charArray27, 262144, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonGenerator11);
        org.junit.Assert.assertNotNull(jsonGenerator13);
        org.junit.Assert.assertNotNull(jsonGenerator15);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[ ]");
        org.junit.Assert.assertNotNull(jsonParser34);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory2._getBufferRecycler();
        byte[] byteArray22 = bufferRecycler20.balloc(1);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer23 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0]");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        boolean boolean11 = jsonParser7.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation12 = jsonParser7.getTokenLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException13 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation12);
        java.lang.Throwable[] throwableArray14 = jsonParseException13.getSuppressed();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonLocation12);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        jsonParser9.setCodec(objectCodec17);
        boolean boolean19 = jsonParser9.isClosed();
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonParser9.setFeatureMask(9);
        int int22 = jsonParser21.getTextOffset();
        com.fasterxml.jackson.core.FormatSchema formatSchema23 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser21.setSchema(formatSchema23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory2.getOutputDecorator();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(outputDecorator7);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler7.releaseByteBuffer(1, byteArray13);
        bufferRecycler2.releaseByteBuffer(7, byteArray13);
        char[][] charArray16 = bufferRecycler2._charBuffers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator23 = jsonFactory22.getInputDecorator();
        java.lang.String str24 = jsonFactory22.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(1);
        boolean boolean28 = jsonFactory22.isEnabled(feature25);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory22.setInputDecorator(inputDecorator29);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean33 = feature31.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory22.enable(feature31);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.size();
        char[] charArray43 = new char[] { 'a', ' ', 'a', '#', ' ' };
        textBuffer36.resetWithShared(charArray43, 100, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory22.createParser(charArray43);
        bufferRecycler2.releaseCharBuffer(11, charArray43);
        char[][] charArray49 = bufferRecycler2._charBuffers;
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1, -1]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNull(inputDecorator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " " + "'", str24, " ");
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "a a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "a a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a,  , a, #,  ]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(charArray49);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean11 = feature7.enabledIn((int) (byte) 100);
        boolean boolean12 = feature7.enabledByDefault();
        int int13 = feature7.getMask();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory8.createJsonParser(byteArray11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(byteArray11);
        java.lang.String str14 = jsonParser13.getCurrentName();
        long long16 = jsonParser13.nextLongValue((long) ' ');
        int int17 = jsonParser13.getTextLength();
        com.fasterxml.jackson.core.FormatSchema formatSchema18 = jsonParser13.getSchema();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(formatSchema18);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory3.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken6 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean7 = jsonToken6.isBoolean();
        byte[] byteArray8 = jsonToken6.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory5.createJsonParser(byteArray8);
        jsonParser9.close();
        java.lang.Object obj11 = jsonParser9.getEmbeddedObject();
        boolean boolean12 = jsonParser9.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = jsonParser9.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException14 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation13);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory16.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken19 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean20 = jsonToken19.isBoolean();
        byte[] byteArray21 = jsonToken19.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory18.createJsonParser(byteArray21);
        jsonParser22.close();
        java.lang.Object obj24 = jsonParser22.getEmbeddedObject();
        boolean boolean25 = jsonParser22.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation26 = jsonParser22.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException27 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation26);
        java.lang.String str28 = jsonParseException27.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException29 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation13, (java.lang.Throwable) jsonParseException27);
        com.fasterxml.jackson.core.JsonLocation jsonLocation31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory34.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken37 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean38 = jsonToken37.isBoolean();
        byte[] byteArray39 = jsonToken37.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory36.createJsonParser(byteArray39);
        jsonParser40.close();
        java.lang.Object obj42 = jsonParser40.getEmbeddedObject();
        boolean boolean43 = jsonParser40.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation44 = jsonParser40.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException45 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory47.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken50 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean51 = jsonToken50.isBoolean();
        byte[] byteArray52 = jsonToken50.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory49.createJsonParser(byteArray52);
        jsonParser53.close();
        java.lang.Object obj55 = jsonParser53.getEmbeddedObject();
        boolean boolean56 = jsonParser53.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation57 = jsonParser53.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException58 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation57);
        java.lang.String str59 = jsonParseException58.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException60 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation44, (java.lang.Throwable) jsonParseException58);
        com.fasterxml.jackson.core.JsonParseException jsonParseException61 = new com.fasterxml.jackson.core.JsonParseException("false", jsonLocation31, (java.lang.Throwable) jsonParseException58);
        com.fasterxml.jackson.core.JsonFactory jsonFactory63 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory65 = jsonFactory63.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken66 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean67 = jsonToken66.isBoolean();
        byte[] byteArray68 = jsonToken66.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser69 = jsonFactory65.createJsonParser(byteArray68);
        jsonParser69.close();
        java.lang.Object obj71 = jsonParser69.getEmbeddedObject();
        boolean boolean72 = jsonParser69.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation73 = jsonParser69.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException74 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation73);
        jsonParseException58.addSuppressed((java.lang.Throwable) jsonParseException74);
        com.fasterxml.jackson.core.JsonParseException jsonParseException76 = new com.fasterxml.jackson.core.JsonParseException("}", jsonLocation13, (java.lang.Throwable) jsonParseException74);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + jsonToken19 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken19.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonLocation26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertTrue("'" + jsonToken37 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken37.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jsonLocation44);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertTrue("'" + jsonToken50 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken50.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonLocation57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(jsonFactory65);
        org.junit.Assert.assertTrue("'" + jsonToken66 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken66.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jsonLocation73);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        java.lang.String str13 = jsonParser6.getText();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jsonParser6.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "true" + "'", str13, "true");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser9.hasCurrentToken();
        jsonParser9.clearCurrentToken();
        long long13 = jsonParser9.getValueAsLong(0L);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        java.lang.String str13 = jsonParser6.getText();
        int int15 = jsonParser6.getValueAsInt(0);
        jsonParser6.clearCurrentToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "true" + "'", str13, "true");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.setRootValueSeparator("hi!");
        java.io.Reader reader9 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createJsonParser(reader9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator12 = jsonFactory11.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory11.configure(feature13, true);
        java.io.Reader reader16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory15.createJsonParser(reader16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonParser10.disable(feature18);
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = null;
        boolean boolean23 = jsonParser21.canUseSchema(formatSchema22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator25 = jsonFactory24.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory24.configure(feature26, true);
        java.io.Reader reader29 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory28.createJsonParser(reader29);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonParser30.configure(feature31, true);
        jsonParser33.clearCurrentToken();
        com.fasterxml.jackson.core.Version version35 = jsonParser33.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean38 = feature36.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonParser33.configure(feature36, true);
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser21.disable(feature36);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator43 = jsonFactory42.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory42.configure(feature44, true);
        java.io.Reader reader47 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory46.createJsonParser(reader47);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonParser48.configure(feature49, true);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonParser41.disable(feature49);
        boolean boolean53 = jsonFactory4.isEnabled(feature49);
        java.io.Writer writer54 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator55 = jsonFactory4.createJsonGenerator(writer54);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator56 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = jsonFactory4.setOutputDecorator(outputDecorator56);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNull(outputDecorator12);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(outputDecorator25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNotNull(version35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNull(outputDecorator43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonGenerator55);
        org.junit.Assert.assertNotNull(jsonFactory57);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.Version version8 = jsonParser6.version();
        java.lang.String str9 = jsonParser6.getText();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator11 = jsonFactory10.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature12 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory10.configure(feature12, true);
        java.io.Reader reader15 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory14.createJsonParser(reader15);
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonParser16.configure(feature17, true);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser6.enable(feature17);
        java.lang.String str21 = jsonParser20.getCurrentName();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(outputDecorator11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature12.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature17.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature11 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory2.enable(feature11);
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory12.createJsonParser("false");
        jsonParser14.overrideCurrentName("com.fasterxml.jackson.core.JsonParseException: JSON");
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertTrue("'" + feature11 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature11.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonParser14);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        boolean boolean7 = jsonFactory6.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory8.configure(feature10, true);
        boolean boolean13 = feature10.enabledByDefault();
        boolean boolean14 = jsonFactory6.isEnabled(feature10);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory6.getCharacterEscapes();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory6.setCharacterEscapes(characterEscapes16);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.setInputDecorator(inputDecorator18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory20.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken23 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean24 = jsonToken23.isBoolean();
        byte[] byteArray25 = jsonToken23.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonFactory22.createJsonParser(byteArray25);
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory22.configure(feature27, false);
        boolean boolean31 = feature27.enabledIn(262144);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory17.enable(feature27);
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS;
        int int34 = feature33.getMask();
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory32.configure(feature33, true);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS + "'", feature33.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(jsonFactory36);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        long long14 = jsonParser6.nextLongValue(0L);
        com.fasterxml.jackson.core.JsonLocation jsonLocation15 = jsonParser6.getTokenLocation();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType16 = jsonParser6.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 17]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(jsonLocation15);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        java.io.Reader reader11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory10.createJsonParser(reader11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        java.io.Reader reader18 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createJsonParser(reader18);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonParser19.configure(feature20, true);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonParser12.disable(feature20);
        com.fasterxml.jackson.core.FormatSchema formatSchema24 = null;
        boolean boolean25 = jsonParser23.canUseSchema(formatSchema24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator27 = jsonFactory26.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory26.configure(feature28, true);
        java.io.Reader reader31 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonFactory30.createJsonParser(reader31);
        com.fasterxml.jackson.core.JsonParser.Feature feature33 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser32.configure(feature33, true);
        jsonParser35.clearCurrentToken();
        com.fasterxml.jackson.core.Version version37 = jsonParser35.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean40 = feature38.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonParser35.configure(feature38, true);
        com.fasterxml.jackson.core.JsonParser jsonParser43 = jsonParser23.disable(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator45 = jsonFactory44.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature46 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory48 = jsonFactory44.configure(feature46, true);
        java.io.Reader reader49 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory48.createJsonParser(reader49);
        com.fasterxml.jackson.core.JsonParser.Feature feature51 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonParser50.configure(feature51, true);
        com.fasterxml.jackson.core.JsonParser jsonParser54 = jsonParser43.disable(feature51);
        boolean boolean55 = jsonFactory7.isEnabled(feature51);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler58 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray59 = bufferRecycler58._byteBuffers;
        byte[][] byteArray60 = bufferRecycler58._byteBuffers;
        char[] charArray62 = bufferRecycler58.allocCharBuffer((int) (short) 1);
        byte[][] byteArray63 = bufferRecycler58._byteBuffers;
        byte[] byteArray65 = bufferRecycler58.balloc((int) (short) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser68 = jsonFactory7.createParser(byteArray65, (int) '#', 0);
        boolean boolean69 = jsonFactory7.canHandleBinaryNatively();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(outputDecorator27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature33.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(version37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(jsonParser43);
        org.junit.Assert.assertNull(outputDecorator45);
        org.junit.Assert.assertTrue("'" + feature46 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature46.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory48);
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertTrue("'" + feature51 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature51.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNotNull(jsonParser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(jsonParser68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        com.fasterxml.jackson.core.Version version19 = jsonFactory4.version();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(version19);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setOutputDecorator(outputDecorator6);
        boolean boolean8 = jsonFactory4.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory9.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken12 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean13 = jsonToken12.isBoolean();
        byte[] byteArray14 = jsonToken12.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory11.createJsonParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory11.configure(feature16, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory11.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator21 = jsonFactory20.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory20.configure(feature22, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator25 = jsonFactory24.getInputDecorator();
        java.lang.String str26 = jsonFactory24.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator28 = jsonFactory27.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature29 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory27.configure(feature29, true);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory31.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean35 = feature34.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory31.enable(feature34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory24.configure(feature34, false);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory24.disable(feature39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory11.enable(feature39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory4.disable(feature39);
        java.io.Writer writer43 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator44 = jsonFactory4.createGenerator(writer43);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNull(outputDecorator21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNull(inputDecorator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " " + "'", str26, " ");
        org.junit.Assert.assertNull(outputDecorator28);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature29.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertNotNull(jsonGenerator44);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory3.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken6 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean7 = jsonToken6.isBoolean();
        byte[] byteArray8 = jsonToken6.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory5.createJsonParser(byteArray8);
        jsonParser9.close();
        java.lang.Object obj11 = jsonParser9.getEmbeddedObject();
        boolean boolean12 = jsonParser9.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = jsonParser9.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException14 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation13);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory16.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken19 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean20 = jsonToken19.isBoolean();
        byte[] byteArray21 = jsonToken19.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory18.createJsonParser(byteArray21);
        jsonParser22.close();
        java.lang.Object obj24 = jsonParser22.getEmbeddedObject();
        boolean boolean25 = jsonParser22.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation26 = jsonParser22.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException27 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation26);
        java.lang.String str28 = jsonParseException27.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException29 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation13, (java.lang.Throwable) jsonParseException27);
        com.fasterxml.jackson.core.JsonLocation jsonLocation30 = jsonParseException29.getLocation();
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory32.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken35 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean36 = jsonToken35.isBoolean();
        byte[] byteArray37 = jsonToken35.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory34.createJsonParser(byteArray37);
        jsonParser38.close();
        java.lang.Object obj40 = jsonParser38.getEmbeddedObject();
        boolean boolean41 = jsonParser38.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation42 = jsonParser38.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException43 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation42);
        java.lang.String str44 = jsonParseException43.getOriginalMessage();
        java.lang.Throwable[] throwableArray45 = jsonParseException43.getSuppressed();
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory47.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken50 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean51 = jsonToken50.isBoolean();
        byte[] byteArray52 = jsonToken50.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory49.createJsonParser(byteArray52);
        jsonParser53.close();
        java.lang.Object obj55 = jsonParser53.getEmbeddedObject();
        boolean boolean56 = jsonParser53.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation57 = jsonParser53.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException58 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation57);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory62 = jsonFactory60.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken63 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean64 = jsonToken63.isBoolean();
        byte[] byteArray65 = jsonToken63.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory62.createJsonParser(byteArray65);
        jsonParser66.close();
        java.lang.Object obj68 = jsonParser66.getEmbeddedObject();
        boolean boolean69 = jsonParser66.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation70 = jsonParser66.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException71 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation70);
        java.lang.String str72 = jsonParseException71.getOriginalMessage();
        jsonParseException58.addSuppressed((java.lang.Throwable) jsonParseException71);
        java.lang.Throwable[] throwableArray74 = jsonParseException71.getSuppressed();
        jsonParseException43.addSuppressed((java.lang.Throwable) jsonParseException71);
        com.fasterxml.jackson.core.JsonParseException jsonParseException76 = new com.fasterxml.jackson.core.JsonParseException("", jsonLocation30, (java.lang.Throwable) jsonParseException43);
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertTrue("'" + jsonToken6 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken6.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + jsonToken19 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken19.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonLocation26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(jsonLocation30);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertTrue("'" + jsonToken35 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken35.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jsonLocation42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertTrue("'" + jsonToken50 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken50.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonLocation57);
        org.junit.Assert.assertNotNull(jsonFactory62);
        org.junit.Assert.assertTrue("'" + jsonToken63 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken63.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jsonLocation70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNotNull(throwableArray74);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        com.fasterxml.jackson.core.ObjectCodec objectCodec18 = null;
        jsonParser15.setCodec(objectCodec18);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        java.lang.String str11 = jsonParser6.getCurrentName();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = jsonParser6.getParsingContext();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        long long13 = jsonParser6.getValueAsLong(10L);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        java.lang.String str12 = jsonParser6.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.enable(feature18);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory19.disable(feature20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonParser6.enable(feature20);
        boolean boolean23 = jsonParser22.canReadObjectId();
        java.lang.Object obj24 = jsonParser22.getObjectId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec10 = jsonParser6.getCodec();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(objectCodec10);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        boolean boolean11 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.setFeatureMask(4000);
        jsonParser6.close();
        jsonParser6.close();
        com.fasterxml.jackson.core.JsonToken jsonToken16 = jsonParser6.nextValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        java.io.Writer writer19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory4.createJsonGenerator(writer19);
        java.io.InputStream inputStream21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory4.createParser(inputStream21);
        java.lang.Object obj23 = jsonParser22.getInputSource();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext12 = jsonParser6.getParsingContext();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory13.setRootValueSeparator("hi!");
        java.io.Reader reader16 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory15.createJsonParser(reader16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        java.io.Reader reader23 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createJsonParser(reader23);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser24.configure(feature25, true);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser17.disable(feature25);
        com.fasterxml.jackson.core.FormatSchema formatSchema29 = null;
        boolean boolean30 = jsonParser28.canUseSchema(formatSchema29);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator32 = jsonFactory31.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature33 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory31.configure(feature33, true);
        java.io.Reader reader36 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory35.createJsonParser(reader36);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonParser37.configure(feature38, true);
        jsonParser40.clearCurrentToken();
        com.fasterxml.jackson.core.Version version42 = jsonParser40.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature43 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean45 = feature43.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonParser40.configure(feature43, true);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonParser28.disable(feature43);
        int int49 = feature43.getMask();
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonParser6.disable(feature43);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(jsonStreamContext12);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(outputDecorator32);
        org.junit.Assert.assertTrue("'" + feature33 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature33.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNotNull(version42);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature43.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 256 + "'", int49 == 256);
        org.junit.Assert.assertNotNull(jsonParser50);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        java.lang.String str12 = jsonParser6.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.enable(feature18);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory19.disable(feature20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonParser6.enable(feature20);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonParser6.setFeatureMask(256);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator26 = jsonFactory25.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature27 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory25.configure(feature27, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator30 = jsonFactory29.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory29.setRootValueSeparator("true");
        com.fasterxml.jackson.core.Version version33 = jsonFactory29.version();
        java.io.Writer writer34 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator35 = jsonFactory29.createGenerator(writer34);
        com.fasterxml.jackson.core.ObjectCodec objectCodec36 = jsonFactory29.getCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator38 = jsonFactory37.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory37.configure(feature39, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature42 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory43 = jsonFactory41.enable(feature42);
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory43.disable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory29.enable(feature44);
        boolean boolean47 = jsonParser6.isEnabled(feature44);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertNull(outputDecorator26);
        org.junit.Assert.assertTrue("'" + feature27 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature27.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertNull(inputDecorator30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(version33);
        org.junit.Assert.assertNotNull(jsonGenerator35);
        org.junit.Assert.assertNull(objectCodec36);
        org.junit.Assert.assertNull(outputDecorator38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertTrue("'" + feature42 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature42.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        byte[] byteArray20 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser21 = jsonFactory4.createJsonParser(byteArray20);
        com.fasterxml.jackson.core.FormatSchema formatSchema22 = jsonParser21.getSchema();
        boolean boolean23 = jsonParser21.isClosed();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser21);
        org.junit.Assert.assertNull(formatSchema22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        java.io.Writer writer19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory4.createJsonGenerator(writer19);
        java.io.InputStream inputStream21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory4.createParser(inputStream21);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal23 = jsonParser22.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(jsonParser22);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean18 = jsonToken17.isBoolean();
        byte[] byteArray19 = jsonToken17.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory16.createJsonParser(byteArray19);
        jsonParser20.close();
        java.lang.Object obj22 = jsonParser20.getEmbeddedObject();
        boolean boolean23 = jsonParser20.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation24 = jsonParser20.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException25 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory27.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken30 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean31 = jsonToken30.isBoolean();
        byte[] byteArray32 = jsonToken30.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory29.createJsonParser(byteArray32);
        jsonParser33.close();
        java.lang.Object obj35 = jsonParser33.getEmbeddedObject();
        boolean boolean36 = jsonParser33.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation37 = jsonParser33.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException38 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation37);
        java.lang.String str39 = jsonParseException38.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException40 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24, (java.lang.Throwable) jsonParseException38);
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = jsonParseException40.getLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException42 = new com.fasterxml.jackson.core.JsonParseException("true", jsonLocation11, (java.lang.Throwable) jsonParseException40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory44.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken47 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean48 = jsonToken47.isBoolean();
        byte[] byteArray49 = jsonToken47.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory46.createJsonParser(byteArray49);
        jsonParser50.close();
        java.lang.Object obj52 = jsonParser50.getEmbeddedObject();
        boolean boolean53 = jsonParser50.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation54 = jsonParser50.getCurrentLocation();
        com.fasterxml.jackson.core.JsonFactory jsonFactory57 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory59 = jsonFactory57.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken60 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean61 = jsonToken60.isBoolean();
        byte[] byteArray62 = jsonToken60.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonFactory59.createJsonParser(byteArray62);
        jsonParser63.close();
        java.lang.Object obj65 = jsonParser63.getEmbeddedObject();
        boolean boolean66 = jsonParser63.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation67 = jsonParser63.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException68 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation67);
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = jsonFactory70.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken73 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean74 = jsonToken73.isBoolean();
        byte[] byteArray75 = jsonToken73.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser76 = jsonFactory72.createJsonParser(byteArray75);
        jsonParser76.close();
        java.lang.Object obj78 = jsonParser76.getEmbeddedObject();
        boolean boolean79 = jsonParser76.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation80 = jsonParser76.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException81 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation80);
        java.lang.String str82 = jsonParseException81.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException83 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation67, (java.lang.Throwable) jsonParseException81);
        com.fasterxml.jackson.core.JsonLocation jsonLocation84 = jsonParseException83.getLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException85 = new com.fasterxml.jackson.core.JsonParseException("true", jsonLocation54, (java.lang.Throwable) jsonParseException83);
        java.lang.String str86 = jsonParseException85.getOriginalMessage();
        jsonParseException42.addSuppressed((java.lang.Throwable) jsonParseException85);
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonLocation24);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + jsonToken30 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken30.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonLocation37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(jsonLocation41);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertTrue("'" + jsonToken47 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken47.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonLocation54);
        org.junit.Assert.assertNotNull(jsonFactory59);
        org.junit.Assert.assertTrue("'" + jsonToken60 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken60.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jsonLocation67);
        org.junit.Assert.assertNotNull(jsonFactory72);
        org.junit.Assert.assertTrue("'" + jsonToken73 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken73.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jsonLocation80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(jsonLocation84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "true" + "'", str86, "true");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator2 = jsonFactory1.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature3 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = jsonFactory1.configure(feature3, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes6 = jsonFactory1.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator12 = jsonFactory11.getInputDecorator();
        java.lang.String str13 = jsonFactory11.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator15 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.configure(feature16, true);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory18.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean22 = feature21.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory18.enable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory11.configure(feature21, false);
        byte[] byteArray27 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory11.createJsonParser(byteArray27);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory1.createJsonParser(byteArray27);
        com.fasterxml.jackson.core.JsonLocation jsonLocation30 = jsonParser29.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException31 = new com.fasterxml.jackson.core.JsonParseException("true", jsonLocation30);
        org.junit.Assert.assertNull(outputDecorator2);
        org.junit.Assert.assertTrue("'" + feature3 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature3.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory5);
        org.junit.Assert.assertNull(characterEscapes6);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNull(inputDecorator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertNull(outputDecorator15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonLocation30);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.disable(feature7);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        byte[][] byteArray17 = bufferRecycler12._byteBuffers;
        char[][] charArray18 = bufferRecycler12._charBuffers;
        byte[] byteArray20 = bufferRecycler12.balloc((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory8.createJsonParser(byteArray20, (int) (short) 10, 0);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory8.setInputDecorator(inputDecorator24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory25.copy();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory25.createJsonParser("false");
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray8 = new char[] { ' ' };
        bufferRecycler2.releaseCharBuffer(0, charArray8);
        char[] charArray12 = bufferRecycler2.allocCharBuffer(0, (int) ' ');
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        int int14 = textBuffer13.size();
        boolean boolean15 = textBuffer13.hasTextAsCharacters();
        char[] charArray16 = textBuffer13.emptyAndGetCurrentSegment();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray5 = bufferRecycler2.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray8 = new char[] { ' ' };
        bufferRecycler2.releaseCharBuffer(0, charArray8);
        char[] charArray12 = bufferRecycler2.allocCharBuffer(0, (int) ' ');
        com.fasterxml.jackson.core.util.TextBuffer textBuffer13 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = bufferRecycler2.charBufferLength((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertNotNull(charArray12);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = jsonFactory9.canUseSchema(formatSchema10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createGenerator(outputStream5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory0.createJsonGenerator(writer7);
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory0.createGenerator(writer9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.disable(feature18);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory0.setOutputDecorator(outputDecorator22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory24.setRootValueSeparator("hi!");
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createJsonParser(reader27);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator30 = jsonFactory29.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory29.configure(feature31, true);
        java.io.Reader reader34 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory33.createJsonParser(reader34);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonParser35.configure(feature36, true);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonParser28.disable(feature36);
        com.fasterxml.jackson.core.FormatSchema formatSchema40 = null;
        boolean boolean41 = jsonParser39.canUseSchema(formatSchema40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator43 = jsonFactory42.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory42.configure(feature44, true);
        java.io.Reader reader47 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory46.createJsonParser(reader47);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonParser48.configure(feature49, true);
        jsonParser51.clearCurrentToken();
        com.fasterxml.jackson.core.Version version53 = jsonParser51.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature54 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean56 = feature54.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonParser51.configure(feature54, true);
        com.fasterxml.jackson.core.JsonParser jsonParser59 = jsonParser39.disable(feature54);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator61 = jsonFactory60.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature62 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory64 = jsonFactory60.configure(feature62, true);
        java.io.Reader reader65 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory64.createJsonParser(reader65);
        com.fasterxml.jackson.core.JsonParser.Feature feature67 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser69 = jsonParser66.configure(feature67, true);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonParser59.disable(feature67);
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory23.enable(feature67);
        com.fasterxml.jackson.core.Version version72 = jsonFactory71.version();
        com.fasterxml.jackson.core.JsonFactory jsonFactory73 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = jsonFactory73.setCodec(objectCodec74);
        com.fasterxml.jackson.core.JsonParser.Feature feature76 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory73.configure(feature76, false);
        boolean boolean79 = feature76.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory80 = jsonFactory71.disable(feature76);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature81 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory82 = jsonFactory80.enable(feature81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNull(outputDecorator30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(outputDecorator43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature54.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertNull(outputDecorator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature62.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory64);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature67.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertNotNull(jsonFactory75);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature76.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jsonFactory80);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setOutputDecorator(outputDecorator6);
        boolean boolean8 = jsonFactory4.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory9.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken12 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean13 = jsonToken12.isBoolean();
        byte[] byteArray14 = jsonToken12.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonFactory11.createJsonParser(byteArray14);
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory11.configure(feature16, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory11.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator21 = jsonFactory20.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory20.configure(feature22, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator25 = jsonFactory24.getInputDecorator();
        java.lang.String str26 = jsonFactory24.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator28 = jsonFactory27.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature29 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory27.configure(feature29, true);
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory31.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean35 = feature34.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory31.enable(feature34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory24.configure(feature34, false);
        com.fasterxml.jackson.core.JsonFactory.Feature feature39 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory24.disable(feature39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory11.enable(feature39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = jsonFactory4.disable(feature39);
        boolean boolean43 = jsonFactory4.canHandleBinaryNatively();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertNull(outputDecorator21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNull(inputDecorator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " " + "'", str26, " ");
        org.junit.Assert.assertNull(outputDecorator28);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature29.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature39.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonFactory42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory2._getBufferRecycler();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        int int22 = feature21.getMask();
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory2.enable(feature21);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator24 = jsonFactory23.getInputDecorator();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNull(inputDecorator24);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.size();
        boolean boolean5 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory6.createParser("");
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory6.createParser(" ");
        com.fasterxml.jackson.core.JsonGenerator.Feature feature12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jsonFactory6.isEnabled(feature12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonParser11);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.Writer writer2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(writer2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator5 = jsonFactory4.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory4.configure(feature6, true);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createParser("");
        byte[] byteArray11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean16 = jsonToken15.isStructEnd();
        boolean boolean17 = jsonToken15.isScalarValue();
        byte[] byteArray18 = jsonToken15.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory8.createJsonParser(byteArray18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory0.createParser(byteArray18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory0.setCodec(objectCodec21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory23.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken26 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean27 = jsonToken26.isBoolean();
        byte[] byteArray28 = jsonToken26.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray28);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory22.createParser(byteArray28);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNull(outputDecorator5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertNotNull(jsonParser30);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        java.lang.Object obj11 = jsonParser6.getInputSource();
        java.lang.String str12 = jsonParser6.getText();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator3 = jsonFactory0.getOutputDecorator();
        java.io.Reader reader4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser(reader4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory6.configure(feature8, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator11 = jsonFactory10.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory10.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        byte[] byteArray17 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory14.createJsonParser(byteArray17);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory13.createJsonParser(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory0.createJsonParser(byteArray17, (-1), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNull(outputDecorator3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(inputDecorator11);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.Version version8 = jsonFactory4.version();
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory4.createGenerator(writer9);
        java.io.InputStream inputStream11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory4.createJsonParser(inputStream11);
        boolean boolean13 = jsonParser12.isClosed();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        boolean boolean12 = jsonParser6.canReadObjectId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator3 = jsonFactory0.getOutputDecorator();
        java.io.Reader reader4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser(reader4);
        boolean boolean6 = jsonParser5.canReadTypeId();
        boolean boolean7 = jsonParser5.canReadObjectId();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = jsonParser5.getLastClearedToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNull(outputDecorator3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jsonToken8);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = new com.fasterxml.jackson.core.util.BufferRecycler();
        char[] charArray7 = bufferRecycler4.allocCharBuffer(0, (int) (short) -1);
        textBuffer3.resetWithCopy(charArray7, (int) (short) 10, 2);
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser9.hasCurrentToken();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser.NumberType numberType11 = jsonParser9.getNumberType();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: UNKNOWN; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setCharacterEscapes(characterEscapes5);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 0 };
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory6.createJsonParser(byteArray13, 2, 11);
        java.lang.String str17 = jsonFactory6.getFormatName();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 100, 10, -1, 100, 0]");
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JSON" + "'", str17, "JSON");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setCharacterEscapes(characterEscapes5);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory6.createJsonGenerator(outputStream7);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory6.createJsonParser("null");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = jsonParser10.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: null; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonParser10);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean9 = feature7.enabledIn(1);
        int int10 = feature7.getMask();
        boolean boolean12 = feature7.enabledIn((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.disable(feature7);
        java.lang.Object obj14 = jsonParser6.getTypeId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 256 + "'", int10 == 256);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        java.io.Reader reader23 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createJsonParser(reader23);
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser24.configure(feature25, true);
        jsonParser27.clearCurrentToken();
        com.fasterxml.jackson.core.Version version29 = jsonParser27.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature30 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean32 = feature30.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser34 = jsonParser27.configure(feature30, true);
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonParser15.disable(feature30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator37 = jsonFactory36.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature38 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory40 = jsonFactory36.configure(feature38, true);
        java.io.Reader reader41 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonFactory40.createJsonParser(reader41);
        com.fasterxml.jackson.core.JsonParser.Feature feature43 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser45 = jsonParser42.configure(feature43, true);
        com.fasterxml.jackson.core.JsonParser jsonParser46 = jsonParser35.disable(feature43);
        double double48 = jsonParser35.getValueAsDouble((double) (short) 1);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(version29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature30.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jsonParser34);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNull(outputDecorator37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature38.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory40);
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature43.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser45);
        org.junit.Assert.assertNotNull(jsonParser46);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createGenerator(outputStream5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory0.createJsonGenerator(writer7);
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory0.createGenerator(writer9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.disable(feature18);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory0.setOutputDecorator(outputDecorator22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory24.setRootValueSeparator("hi!");
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createJsonParser(reader27);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator30 = jsonFactory29.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory29.configure(feature31, true);
        java.io.Reader reader34 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory33.createJsonParser(reader34);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonParser35.configure(feature36, true);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonParser28.disable(feature36);
        com.fasterxml.jackson.core.FormatSchema formatSchema40 = null;
        boolean boolean41 = jsonParser39.canUseSchema(formatSchema40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator43 = jsonFactory42.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory42.configure(feature44, true);
        java.io.Reader reader47 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory46.createJsonParser(reader47);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonParser48.configure(feature49, true);
        jsonParser51.clearCurrentToken();
        com.fasterxml.jackson.core.Version version53 = jsonParser51.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature54 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean56 = feature54.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonParser51.configure(feature54, true);
        com.fasterxml.jackson.core.JsonParser jsonParser59 = jsonParser39.disable(feature54);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator61 = jsonFactory60.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature62 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory64 = jsonFactory60.configure(feature62, true);
        java.io.Reader reader65 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory64.createJsonParser(reader65);
        com.fasterxml.jackson.core.JsonParser.Feature feature67 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser69 = jsonParser66.configure(feature67, true);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonParser59.disable(feature67);
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory23.enable(feature67);
        com.fasterxml.jackson.core.ObjectCodec objectCodec72 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory73 = jsonFactory23.setCodec(objectCodec72);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNull(outputDecorator30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(outputDecorator43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature54.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertNull(outputDecorator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature62.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory64);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature67.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(jsonFactory73);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer2 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler1);
        textBuffer2.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray9 = bufferRecycler6.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray12 = new char[] { ' ' };
        bufferRecycler6.releaseCharBuffer(0, charArray12);
        textBuffer2.resetWithShared(charArray12, 4000, 4);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(charArray12);
        com.fasterxml.jackson.core.Base64Variant base64Variant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = jsonParser17.getBinaryValue(base64Variant18);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [C@156c9783; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertNotNull(jsonParser17);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser6.nextToken();
        java.lang.String str8 = jsonToken7.asString();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "true" + "'", str8, "true");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        boolean boolean11 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.setFeatureMask(4000);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        java.io.Reader reader17 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory16.createJsonParser(reader17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator20 = jsonFactory19.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory19.configure(feature21, true);
        java.io.Reader reader24 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory23.createJsonParser(reader24);
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser25.configure(feature26, true);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonParser18.disable(feature26);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = null;
        boolean boolean31 = jsonParser29.canUseSchema(formatSchema30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator33 = jsonFactory32.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory32.configure(feature34, true);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createJsonParser(reader37);
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser38.configure(feature39, true);
        jsonParser41.clearCurrentToken();
        com.fasterxml.jackson.core.Version version43 = jsonParser41.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean46 = feature44.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonParser41.configure(feature44, true);
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonParser29.disable(feature44);
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonParser13.enable(feature44);
        // The following exception was thrown during execution in test generation
        try {
            byte byte51 = jsonParser13.getByteValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNull(outputDecorator20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(outputDecorator33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertNotNull(jsonParser50);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        boolean boolean9 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = jsonParser6.getSchema();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser11.nextValue();
        boolean boolean13 = jsonToken12.isScalarValue();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        boolean boolean13 = jsonToken12.isBoolean();
        char[] charArray14 = jsonToken12.asCharArray();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[t, r, u, e]");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        textBuffer1.append(' ');
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.releaseBuffers();
        textBuffer1.setCurrentLength(12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser9.getCurrentToken();
        int int12 = jsonParser9.getValueAsInt(10);
        java.lang.String str13 = jsonParser9.getCurrentName();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.ensureNotShared();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator4 = jsonFactory3.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory3.configure(feature5, true);
        java.io.Writer writer8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = jsonFactory7.createGenerator(writer8);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = jsonFactory7._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler();
        char[] charArray15 = bufferRecycler12.allocCharBuffer(0, (int) (short) -1);
        bufferRecycler10.releaseCharBuffer(0, charArray15);
        char[][] charArray17 = bufferRecycler10._charBuffers;
        char[] charArray19 = bufferRecycler10.allocCharBuffer((int) (byte) 1);
        textBuffer1.resetWithShared(charArray19, 4000, 10);
        org.junit.Assert.assertNull(outputDecorator4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonGenerator9);
        org.junit.Assert.assertNotNull(bufferRecycler10);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray19);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.Writer writer2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(writer2);
        java.io.Writer writer4 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = jsonFactory0.createGenerator(writer4);
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory0.createParser("null");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray13 = bufferRecycler10.allocByteBuffer(2, (int) (byte) 10);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonFactory0.createJsonParser(byteArray13, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken17 = jsonParser16.nextValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Illegal character ((CTRL-CHAR, code 0)): only regular white space (\\r, \\n, \\t) is allowed between tokens? at [Source: [B@6c56ea72; line: 1, column: 2]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNotNull(jsonGenerator5);
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(jsonParser16);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        int int5 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal6 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        int int2 = textBuffer1.size();
        char[] charArray3 = textBuffer1.getCurrentSegment();
        textBuffer1.ensureNotShared();
        char[] charArray5 = textBuffer1.contentsAsArray();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        double double9 = jsonParser6.getValueAsDouble();
        int int11 = jsonParser6.nextIntValue(0);
        boolean boolean12 = jsonParser6.getBooleanValue();
        // The following exception was thrown during execution in test generation
        try {
            float float13 = jsonParser6.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        boolean boolean11 = jsonParser6.canReadObjectId();
        java.lang.Object obj12 = jsonParser6.getEmbeddedObject();
        int int13 = jsonParser6.getFeatureMask();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray6 = textBuffer1.getCurrentSegment();
        char[] charArray7 = textBuffer1.getCurrentSegment();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        long long13 = jsonParser9.getValueAsLong(100L);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        com.fasterxml.jackson.core.ObjectCodec objectCodec9 = jsonParser6.getCodec();
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextToken();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(objectCodec9);
        org.junit.Assert.assertNull(jsonToken10);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.OutputStream outputStream2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(outputStream2);
        java.lang.String str4 = jsonFactory0.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory5.setRootValueSeparator("hi!");
        java.io.Reader reader8 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory7.createJsonParser(reader8);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory7.createParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION;
        boolean boolean13 = jsonFactory7.isEnabled(feature12);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory0.configure(feature12, false);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jsonFactory15);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("}");
        boolean boolean10 = jsonParser6.isExpectedStartArrayToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "}" + "'", str9, "}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        boolean boolean7 = jsonFactory6.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory8.configure(feature10, true);
        boolean boolean13 = feature10.enabledByDefault();
        boolean boolean14 = jsonFactory6.isEnabled(feature10);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes15 = jsonFactory6.getCharacterEscapes();
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes16 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory6.setCharacterEscapes(characterEscapes16);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator18 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.setInputDecorator(inputDecorator18);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer21 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler20);
        textBuffer21.resetWithEmpty();
        int int23 = textBuffer21.size();
        char[] charArray24 = textBuffer21.getTextBuffer();
        char[] charArray25 = textBuffer21.getCurrentSegment();
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory19.createParser(charArray25, (int) (short) 100, 7);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(characterEscapes15);
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(charArray24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(jsonParser28);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Writer writer5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory4.createGenerator(writer5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory7.setCodec(objectCodec8);
        boolean boolean10 = jsonFactory9.requiresPropertyOrdering();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler13 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer14 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler13);
        char[] charArray15 = textBuffer14.emptyAndGetCurrentSegment();
        char[] charArray16 = textBuffer14.contentsAsArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory9.createParser(charArray16, 12, 3);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.emptyAndGetCurrentSegment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        com.fasterxml.jackson.core.Version version12 = jsonParser11.version();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonParser11.enable(feature15);
        boolean boolean19 = jsonParser18.requiresCustomCodec();
        boolean boolean21 = jsonParser18.getValueAsBoolean(true);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        textBuffer1.setCurrentLength((int) ' ');
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        char[] charArray7 = textBuffer1.expandCurrentSegment(12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler();
        char[] charArray11 = bufferRecycler8.allocCharBuffer(0, (int) (short) -1);
        textBuffer1.resetWithShared(charArray11, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal15 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        int int9 = jsonParser6.getFeatureMask();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = jsonParser6.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = jsonParser6.getCodec();
        com.fasterxml.jackson.core.FormatSchema formatSchema9 = jsonParser6.getSchema();
        int int10 = jsonParser6.getValueAsInt();
        long long11 = jsonParser6.getValueAsLong();
        int int12 = jsonParser6.getTextOffset();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objectCodec8);
        org.junit.Assert.assertNull(formatSchema9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException12 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean18 = jsonToken17.isBoolean();
        byte[] byteArray19 = jsonToken17.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory16.createJsonParser(byteArray19);
        jsonParser20.close();
        java.lang.Object obj22 = jsonParser20.getEmbeddedObject();
        boolean boolean23 = jsonParser20.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation24 = jsonParser20.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException25 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24);
        java.lang.String str26 = jsonParseException25.getOriginalMessage();
        jsonParseException12.addSuppressed((java.lang.Throwable) jsonParseException25);
        com.fasterxml.jackson.core.JsonLocation jsonLocation29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory31.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken34 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean35 = jsonToken34.isBoolean();
        byte[] byteArray36 = jsonToken34.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser37 = jsonFactory33.createJsonParser(byteArray36);
        jsonParser37.close();
        java.lang.Object obj39 = jsonParser37.getEmbeddedObject();
        boolean boolean40 = jsonParser37.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = jsonParser37.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException42 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation41);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory44.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken47 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean48 = jsonToken47.isBoolean();
        byte[] byteArray49 = jsonToken47.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonFactory46.createJsonParser(byteArray49);
        jsonParser50.close();
        java.lang.Object obj52 = jsonParser50.getEmbeddedObject();
        boolean boolean53 = jsonParser50.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation54 = jsonParser50.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException55 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation54);
        java.lang.String str56 = jsonParseException55.getOriginalMessage();
        jsonParseException42.addSuppressed((java.lang.Throwable) jsonParseException55);
        com.fasterxml.jackson.core.JsonParseException jsonParseException58 = new com.fasterxml.jackson.core.JsonParseException("}", jsonLocation29, (java.lang.Throwable) jsonParseException55);
        jsonParseException12.addSuppressed((java.lang.Throwable) jsonParseException58);
        java.lang.String str60 = jsonParseException12.toString();
        com.fasterxml.jackson.core.JsonLocation jsonLocation61 = jsonParseException12.getLocation();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonLocation24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertTrue("'" + jsonToken34 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken34.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jsonLocation41);
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertTrue("'" + jsonToken47 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken47.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jsonLocation54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(jsonLocation61);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.Reader reader3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createJsonParser(reader3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory5 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator6 = jsonFactory5.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory5.configure(feature7, true);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory9.createJsonParser(reader10);
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonParser11.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser4.disable(feature12);
        com.fasterxml.jackson.core.FormatSchema formatSchema16 = null;
        boolean boolean17 = jsonParser15.canUseSchema(formatSchema16);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonParser15.setFeatureMask((int) '#');
        jsonParser19.close();
        double double21 = jsonParser19.getValueAsDouble();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(outputDecorator6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory6.disable(feature7);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        byte[][] byteArray17 = bufferRecycler12._byteBuffers;
        char[][] charArray18 = bufferRecycler12._charBuffers;
        byte[] byteArray20 = bufferRecycler12.balloc((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonFactory8.createJsonParser(byteArray20, (int) (short) 10, 0);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator24 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory8.setInputDecorator(inputDecorator24);
        java.io.File file26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory8.createJsonParser(file26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertNotNull(jsonFactory25);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler2.releaseByteBuffer(1, byteArray8);
        char[] charArray11 = bufferRecycler2.calloc(10);
        char[][] charArray12 = bufferRecycler2._charBuffers;
        int int14 = bufferRecycler2.byteBufferLength(0);
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator17 = jsonFactory16.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory16.configure(feature18, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory20.enable(feature21);
        boolean boolean23 = jsonFactory22.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator25 = jsonFactory24.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature26 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory24.configure(feature26, true);
        boolean boolean29 = feature26.enabledByDefault();
        boolean boolean30 = jsonFactory22.isEnabled(feature26);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory22.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonToken jsonToken33 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean34 = jsonToken33.isStructEnd();
        boolean boolean35 = jsonToken33.isScalarValue();
        byte[] byteArray36 = jsonToken33.asByteArray();
        char[] charArray37 = jsonToken33.asCharArray();
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory32.createParser(charArray37);
        bufferRecycler2.releaseCharBuffer(2, charArray37);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10, -1, -1]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8000 + "'", int14 == 8000);
        org.junit.Assert.assertNull(outputDecorator17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(outputDecorator25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature26.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertTrue("'" + jsonToken33 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken33.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[t, r, u, e]");
        org.junit.Assert.assertNotNull(jsonParser38);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = jsonFactory0.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory6.configure(feature8, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator11 = jsonFactory10.getInputDecorator();
        java.lang.String str12 = jsonFactory10.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean21 = feature20.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory17.enable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory10.configure(feature20, false);
        byte[] byteArray26 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory10.createJsonParser(byteArray26);
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory0.createJsonParser(byteArray26);
        java.lang.String str29 = jsonParser28.getValueAsString();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonToken jsonToken30 = jsonParser28.nextValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Unrecognized token 'y?': was expecting ('true', 'false' or 'null')? at [Source: [B@60bb414c; line: 1, column: 3]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(characterEscapes5);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(inputDecorator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation10 = jsonParser6.getCurrentLocation();
        double double12 = jsonParser6.getValueAsDouble((double) '4');
        int int13 = jsonParser6.getCurrentTokenId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonLocation10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray3 = bufferRecycler2._byteBuffers;
        byte[][] byteArray4 = bufferRecycler2._byteBuffers;
        char[] charArray6 = bufferRecycler2.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory8.configure(feature10, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes13 = jsonFactory8.getCharacterEscapes();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator15 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.configure(feature16, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = jsonFactory18.getInputDecorator();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = jsonFactory21.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature23 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory21.configure(feature23, true);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory25.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature28 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean29 = feature28.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory25.enable(feature28);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory18.configure(feature28, false);
        byte[] byteArray34 = new byte[] { (byte) -1 };
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory18.createJsonParser(byteArray34);
        com.fasterxml.jackson.core.JsonParser jsonParser36 = jsonFactory8.createJsonParser(byteArray34);
        bufferRecycler2.releaseByteBuffer(2, byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray40 = bufferRecycler2.allocByteBuffer((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNull(characterEscapes13);
        org.junit.Assert.assertNull(outputDecorator15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertNull(outputDecorator22);
        org.junit.Assert.assertTrue("'" + feature23 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature23.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + feature28 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature28.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1]");
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertNotNull(jsonParser36);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.resetWithEmpty();
        textBuffer11.setCurrentLength((int) ' ');
        char[] charArray15 = textBuffer11.emptyAndGetCurrentSegment();
        char[] charArray17 = textBuffer11.expandCurrentSegment(12);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory9.createParser(charArray17);
        boolean boolean19 = jsonParser18.getValueAsBoolean();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean9 = feature7.enabledIn(1);
        boolean boolean10 = jsonFactory4.isEnabled(feature7);
        java.io.Writer writer11 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = jsonFactory4.createJsonGenerator(writer11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory17.createParser("");
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean22 = feature20.enabledIn(1);
        int int23 = feature20.getMask();
        boolean boolean25 = feature20.enabledIn(2);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonParser19.disable(feature20);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory4.configure(feature20, false);
        java.io.OutputStream outputStream29 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory28.createGenerator(outputStream29, jsonEncoding30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonGenerator12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 256 + "'", int23 == 256);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertNotNull(jsonFactory28);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator3 = jsonFactory0.getOutputDecorator();
        java.io.Reader reader4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser(reader4);
        boolean boolean6 = jsonParser5.canReadTypeId();
        boolean boolean7 = jsonParser5.canReadObjectId();
        long long9 = jsonParser5.getValueAsLong(1000L);
        jsonParser5.clearCurrentToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNull(outputDecorator3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1000L + "'", long9 == 1000L);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        textBuffer1.append(' ');
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.expandCurrentSegment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory8.setRootValueSeparator("hi!");
        byte[] byteArray11 = new byte[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory8.createJsonParser(byteArray11);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(byteArray11);
        java.io.OutputStream outputStream14 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator15 = jsonFactory7.createGenerator(outputStream14);
        java.io.File file16 = null;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = jsonFactory7.createJsonGenerator(file16, jsonEncoding17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNotNull(jsonGenerator15);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.ensureNotShared();
        boolean boolean3 = textBuffer1.hasTextAsCharacters();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory2.setOutputDecorator(outputDecorator11);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertNotNull(jsonFactory12);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createGenerator(outputStream5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory0.createJsonGenerator(writer7);
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory0.createGenerator(writer9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.disable(feature18);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator22 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory0.setOutputDecorator(outputDecorator22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory26 = jsonFactory24.setRootValueSeparator("hi!");
        java.io.Reader reader27 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonFactory26.createJsonParser(reader27);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator30 = jsonFactory29.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature31 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory29.configure(feature31, true);
        java.io.Reader reader34 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser35 = jsonFactory33.createJsonParser(reader34);
        com.fasterxml.jackson.core.JsonParser.Feature feature36 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonParser35.configure(feature36, true);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonParser28.disable(feature36);
        com.fasterxml.jackson.core.FormatSchema formatSchema40 = null;
        boolean boolean41 = jsonParser39.canUseSchema(formatSchema40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory42 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator43 = jsonFactory42.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature44 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory46 = jsonFactory42.configure(feature44, true);
        java.io.Reader reader47 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonFactory46.createJsonParser(reader47);
        com.fasterxml.jackson.core.JsonParser.Feature feature49 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonParser48.configure(feature49, true);
        jsonParser51.clearCurrentToken();
        com.fasterxml.jackson.core.Version version53 = jsonParser51.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature54 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean56 = feature54.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser58 = jsonParser51.configure(feature54, true);
        com.fasterxml.jackson.core.JsonParser jsonParser59 = jsonParser39.disable(feature54);
        com.fasterxml.jackson.core.JsonFactory jsonFactory60 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator61 = jsonFactory60.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature62 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory64 = jsonFactory60.configure(feature62, true);
        java.io.Reader reader65 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory64.createJsonParser(reader65);
        com.fasterxml.jackson.core.JsonParser.Feature feature67 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser69 = jsonParser66.configure(feature67, true);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonParser59.disable(feature67);
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = jsonFactory23.enable(feature67);
        com.fasterxml.jackson.core.Version version72 = jsonFactory71.version();
        com.fasterxml.jackson.core.JsonFactory jsonFactory73 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec74 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = jsonFactory73.setCodec(objectCodec74);
        com.fasterxml.jackson.core.JsonParser.Feature feature76 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory73.configure(feature76, false);
        boolean boolean79 = feature76.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory80 = jsonFactory71.disable(feature76);
        boolean boolean81 = feature76.enabledByDefault();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonFactory26);
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNull(outputDecorator30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature31.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonParser35);
        org.junit.Assert.assertTrue("'" + feature36 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature36.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(jsonParser39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(outputDecorator43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature44.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory46);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertTrue("'" + feature49 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature49.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertNotNull(version53);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature54.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jsonParser58);
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertNull(outputDecorator61);
        org.junit.Assert.assertTrue("'" + feature62 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature62.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory64);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertTrue("'" + feature67 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature67.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser69);
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(jsonFactory71);
        org.junit.Assert.assertNotNull(version72);
        org.junit.Assert.assertNotNull(jsonFactory75);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature76.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jsonFactory80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.Version version8 = jsonFactory4.version();
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory4.createGenerator(writer9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory4.setCodec(objectCodec11);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory4.createParser(inputStream13);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = jsonFactory15.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature17 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory15.configure(feature17, true);
        boolean boolean20 = jsonFactory15.canUseCharArrays();
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean23 = feature21.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory15.enable(feature21);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler25 = jsonFactory15._getBufferRecycler();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler29 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler29.releaseByteBuffer(1, byteArray35);
        bufferRecycler25.releaseByteBuffer(2, byteArray35);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory4.createParser(byteArray35);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNull(outputDecorator16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature17.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertNotNull(bufferRecycler25);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 10, -1, -1]");
        org.junit.Assert.assertNotNull(jsonParser38);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        com.fasterxml.jackson.core.Version version12 = jsonParser11.version();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonParser11.enable(feature15);
        boolean boolean19 = jsonParser18.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = jsonParser18.getLastClearedToken();
        boolean boolean21 = jsonParser18.hasTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = jsonParser18.getLongValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(jsonToken20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        int int8 = jsonParser6.getValueAsInt((int) (byte) 1);
        java.lang.String str9 = jsonParser6.getCurrentName();
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = jsonParser6.releaseBuffered(outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.resetWithEmpty();
        textBuffer7.setCurrentLength((int) ' ');
        char[] charArray11 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray11, 0, 12);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler17 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        char[][] charArray18 = bufferRecycler17._charBuffers;
        char[] charArray20 = bufferRecycler17.calloc((int) '#');
        textBuffer1.resetWithShared(charArray20, 9, 4);
        // The following exception was thrown during execution in test generation
        try {
            textBuffer1.append("JSON", 262144, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 262144");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler10 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer11 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler10);
        textBuffer11.resetWithEmpty();
        textBuffer11.setCurrentLength((int) ' ');
        char[] charArray15 = textBuffer11.emptyAndGetCurrentSegment();
        char[] charArray17 = textBuffer11.expandCurrentSegment(12);
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory9.createParser(charArray17);
        com.fasterxml.jackson.core.FormatSchema formatSchema19 = jsonParser18.getSchema();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNull(formatSchema19);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        boolean boolean10 = jsonParser6.canReadObjectId();
        java.lang.String str11 = jsonParser6.getCurrentName();
        java.lang.Object obj12 = jsonParser6.getTypeId();
        jsonParser6.close();
        com.fasterxml.jackson.core.Version version14 = jsonParser6.version();
        int int16 = jsonParser6.getValueAsInt(12);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(version14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.Version version8 = jsonFactory4.version();
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory4.createGenerator(writer9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory4.setCodec(objectCodec11);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory4.createParser(inputStream13);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator15 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory4.setOutputDecorator(outputDecorator15);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator17 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.setInputDecorator(inputDecorator17);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator11 = jsonFactory10.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = jsonFactory10.configure(feature12, true);
        com.fasterxml.jackson.core.JsonParser jsonParser15 = jsonParser6.disable(feature12);
        boolean boolean16 = jsonParser6.hasCurrentToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(outputDecorator11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory14);
        org.junit.Assert.assertNotNull(jsonParser15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        java.lang.Object obj11 = jsonParser6.getObjectId();
        boolean boolean12 = jsonParser6.isClosed();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        boolean boolean18 = jsonFactory13.canUseCharArrays();
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean21 = feature19.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory13.enable(feature19);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonParser6.disable(feature19);
        long long25 = jsonParser23.nextLongValue((long) 3);
        com.fasterxml.jackson.core.Base64Variant base64Variant26 = null;
        java.io.OutputStream outputStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = jsonParser23.readBinaryValue(base64Variant26, outputStream27);
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: [B@6d2d99fc; line: 1, column: 13]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setCharacterEscapes(characterEscapes5);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory6.createJsonGenerator(outputStream7);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory6.createJsonParser("null");
        boolean boolean11 = jsonFactory6.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator13 = jsonFactory12.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory12.configure(feature14, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory16.enable(feature17);
        boolean boolean19 = jsonFactory18.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator21 = jsonFactory20.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature22 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = jsonFactory20.configure(feature22, true);
        boolean boolean25 = feature22.enabledByDefault();
        boolean boolean26 = jsonFactory18.isEnabled(feature22);
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory6.configure(feature22, true);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(outputDecorator13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature14.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature17.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(outputDecorator21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature22.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jsonFactory28);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory2._getBufferRecycler();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        int int22 = feature21.getMask();
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory2.enable(feature21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory24 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator25 = jsonFactory24.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory28 = jsonFactory24.configure(feature26, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature29 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory28.enable(feature29);
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory23.disable(feature29);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator32 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory31.setOutputDecorator(outputDecorator32);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory31.enable(feature34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNull(outputDecorator25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory28);
        org.junit.Assert.assertTrue("'" + feature29 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature29.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonFactory33);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = jsonFactory1.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean5 = jsonToken4.isBoolean();
        byte[] byteArray6 = jsonToken4.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser7 = jsonFactory3.createJsonParser(byteArray6);
        jsonParser7.close();
        java.lang.Object obj9 = jsonParser7.getEmbeddedObject();
        boolean boolean10 = jsonParser7.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser7.getCurrentLocation();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken17 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean18 = jsonToken17.isBoolean();
        byte[] byteArray19 = jsonToken17.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory16.createJsonParser(byteArray19);
        jsonParser20.close();
        java.lang.Object obj22 = jsonParser20.getEmbeddedObject();
        boolean boolean23 = jsonParser20.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation24 = jsonParser20.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException25 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24);
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory27.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken30 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean31 = jsonToken30.isBoolean();
        byte[] byteArray32 = jsonToken30.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser33 = jsonFactory29.createJsonParser(byteArray32);
        jsonParser33.close();
        java.lang.Object obj35 = jsonParser33.getEmbeddedObject();
        boolean boolean36 = jsonParser33.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation37 = jsonParser33.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException38 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation37);
        java.lang.String str39 = jsonParseException38.getOriginalMessage();
        com.fasterxml.jackson.core.JsonParseException jsonParseException40 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation24, (java.lang.Throwable) jsonParseException38);
        com.fasterxml.jackson.core.JsonLocation jsonLocation41 = jsonParseException40.getLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException42 = new com.fasterxml.jackson.core.JsonParseException("true", jsonLocation11, (java.lang.Throwable) jsonParseException40);
        com.fasterxml.jackson.core.JsonLocation jsonLocation43 = jsonParseException40.getLocation();
        java.lang.String str44 = jsonParseException40.toString();
        java.lang.Throwable[] throwableArray45 = jsonParseException40.getSuppressed();
        org.junit.Assert.assertNotNull(jsonFactory3);
        org.junit.Assert.assertTrue("'" + jsonToken4 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken4.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertTrue("'" + jsonToken17 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken17.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jsonLocation24);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + jsonToken30 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken30.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jsonLocation37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(jsonLocation41);
        org.junit.Assert.assertNotNull(jsonLocation43);
        org.junit.Assert.assertNotNull(throwableArray45);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        // The following exception was thrown during execution in test generation
        try {
            float float8 = jsonParser6.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        com.fasterxml.jackson.core.JsonLocation jsonLocation17 = jsonParser9.getTokenLocation();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNotNull(jsonLocation17);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean10 = jsonParser6.getValueAsBoolean(false);
        jsonParser6.overrideCurrentName("com.fasterxml.jackson.core.JsonParseException: JSON");
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.OutputStream outputStream5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory0.createGenerator(outputStream5);
        java.io.Writer writer7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory0.createJsonGenerator(writer7);
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory0.createGenerator(writer9);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonParser17.configure(feature18, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.disable(feature18);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory21.createParser(byteArray26, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 10, 10, 1]");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        char[] charArray12 = jsonParser6.getTextCharacters();
        // The following exception was thrown during execution in test generation
        try {
            float float13 = jsonParser6.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        double double11 = jsonParser6.getValueAsDouble();
        java.lang.String str12 = jsonParser6.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature18 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory17.enable(feature18);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory19.disable(feature20);
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonParser6.enable(feature20);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonParser6.setFeatureMask(256);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = jsonParser24.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature18.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertNotNull(jsonParser24);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        java.io.InputStream inputStream8 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory4.createParser(inputStream8);
        boolean boolean10 = jsonFactory4.canUseCharArrays();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        java.lang.Boolean boolean8 = jsonParser6.nextBooleanValue();
        com.fasterxml.jackson.core.JsonToken jsonToken9 = jsonParser6.nextValue();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = jsonParser6.getBinaryValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(jsonToken9);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        java.lang.Object obj11 = jsonParser6.getObjectId();
        boolean boolean12 = jsonParser6.isClosed();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature15 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        boolean boolean18 = jsonFactory13.canUseCharArrays();
        com.fasterxml.jackson.core.JsonParser.Feature feature19 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean21 = feature19.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory13.enable(feature19);
        com.fasterxml.jackson.core.JsonParser jsonParser23 = jsonParser6.disable(feature19);
        int int24 = jsonParser6.getTextLength();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature15.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + feature19 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature19.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        boolean boolean12 = jsonParser9.hasTextCharacters();
        com.fasterxml.jackson.core.FormatSchema formatSchema13 = jsonParser9.getSchema();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(formatSchema13);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        long long10 = jsonParser6.getValueAsLong();
        long long11 = jsonParser6.getValueAsLong();
        java.lang.Object obj12 = jsonParser6.getTypeId();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        long long12 = jsonParser6.getValueAsLong((long) 1000);
        boolean boolean13 = jsonParser6.hasCurrentToken();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1000L + "'", long12 == 1000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonToken jsonToken7 = jsonParser6.nextToken();
        int int8 = jsonToken7.id();
        byte[] byteArray9 = jsonToken7.asByteArray();
        int int10 = jsonToken7.id();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + jsonToken7 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken7.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[116, 114, 117, 101]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.setRootValueSeparator("true");
        com.fasterxml.jackson.core.Version version8 = jsonFactory4.version();
        java.io.Writer writer9 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator10 = jsonFactory4.createGenerator(writer9);
        com.fasterxml.jackson.core.ObjectCodec objectCodec11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory4.setCodec(objectCodec11);
        java.io.InputStream inputStream13 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory4.createParser(inputStream13);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = jsonParser14.nextToken();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(version8);
        org.junit.Assert.assertNotNull(jsonGenerator10);
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertNull(jsonToken15);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        jsonParser6.close();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = jsonParser6.getCurrentToken();
        java.lang.Boolean boolean9 = jsonParser6.nextBooleanValue();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger10 = jsonParser6.getBigIntegerValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: ; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(jsonToken8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonFactory jsonFactory3 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator4 = jsonFactory3.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature5 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory3.configure(feature5, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator8 = jsonFactory7.getInputDecorator();
        java.lang.String str9 = jsonFactory7.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature10 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean12 = feature10.enabledIn(1);
        boolean boolean13 = jsonFactory7.isEnabled(feature10);
        com.fasterxml.jackson.core.JsonParser.Feature feature14 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean16 = feature14.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory7.configure(feature14, false);
        boolean boolean19 = jsonFactory0.isEnabled(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory20.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken23 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean24 = jsonToken23.isBoolean();
        byte[] byteArray25 = jsonToken23.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonFactory22.createJsonParser(byteArray25);
        jsonParser26.close();
        java.lang.Object obj28 = jsonParser26.getEmbeddedObject();
        boolean boolean29 = jsonParser26.hasTextCharacters();
        boolean boolean30 = jsonParser26.hasCurrentToken();
        double double31 = jsonParser26.getValueAsDouble();
        java.lang.String str32 = jsonParser26.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator34 = jsonFactory33.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature35 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory33.configure(feature35, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory37.enable(feature38);
        com.fasterxml.jackson.core.JsonParser.Feature feature40 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory39.disable(feature40);
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonParser26.enable(feature40);
        com.fasterxml.jackson.core.JsonFactory jsonFactory44 = jsonFactory0.configure(feature40, true);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler45 = jsonFactory44._getBufferRecycler();
        com.fasterxml.jackson.core.JsonFactory jsonFactory47 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory49 = jsonFactory47.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken50 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean51 = jsonToken50.isBoolean();
        byte[] byteArray52 = jsonToken50.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser53 = jsonFactory49.createJsonParser(byteArray52);
        com.fasterxml.jackson.core.JsonFactory.Feature feature54 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory56 = jsonFactory49.configure(feature54, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler59 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray60 = bufferRecycler59._byteBuffers;
        byte[][] byteArray61 = bufferRecycler59._byteBuffers;
        char[] charArray63 = bufferRecycler59.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser66 = jsonFactory49.createParser(charArray63, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler67 = jsonFactory49._getBufferRecycler();
        com.fasterxml.jackson.core.JsonFactory.Feature feature68 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        int int69 = feature68.getMask();
        com.fasterxml.jackson.core.JsonFactory jsonFactory70 = jsonFactory49.enable(feature68);
        com.fasterxml.jackson.core.JsonFactory jsonFactory71 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator72 = jsonFactory71.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature73 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory75 = jsonFactory71.configure(feature73, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature76 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory77 = jsonFactory75.enable(feature76);
        com.fasterxml.jackson.core.JsonFactory jsonFactory78 = jsonFactory70.disable(feature76);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator79 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory80 = jsonFactory78.setOutputDecorator(outputDecorator79);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler83 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray84 = bufferRecycler83._byteBuffers;
        byte[][] byteArray85 = bufferRecycler83._byteBuffers;
        char[] charArray87 = bufferRecycler83.allocCharBuffer((int) (short) 1);
        byte[][] byteArray88 = bufferRecycler83._byteBuffers;
        byte[] byteArray90 = bufferRecycler83.balloc((int) (short) 100);
        com.fasterxml.jackson.core.JsonParser jsonParser91 = jsonFactory80.createJsonParser(byteArray90);
        bufferRecycler45.releaseByteBuffer((int) (byte) 0, byteArray90);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNull(outputDecorator4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature5.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNull(inputDecorator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature10.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(outputDecorator34);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature35.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature40.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(jsonFactory44);
        org.junit.Assert.assertNotNull(bufferRecycler45);
        org.junit.Assert.assertNotNull(jsonFactory49);
        org.junit.Assert.assertTrue("'" + jsonToken50 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken50.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser53);
        org.junit.Assert.assertTrue("'" + feature54 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature54.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory56);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertNotNull(jsonParser66);
        org.junit.Assert.assertNotNull(bufferRecycler67);
        org.junit.Assert.assertTrue("'" + feature68 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature68.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
        org.junit.Assert.assertNotNull(jsonFactory70);
        org.junit.Assert.assertNull(outputDecorator72);
        org.junit.Assert.assertTrue("'" + feature73 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature73.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory75);
        org.junit.Assert.assertTrue("'" + feature76 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature76.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory77);
        org.junit.Assert.assertNotNull(jsonFactory78);
        org.junit.Assert.assertNotNull(jsonFactory80);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray90), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(jsonParser91);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        java.io.InputStream inputStream3 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createParser(inputStream3);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray8 = bufferRecycler7._byteBuffers;
        byte[][] byteArray9 = bufferRecycler7._byteBuffers;
        char[] charArray11 = bufferRecycler7.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory2.createParser(charArray11);
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator14 = jsonFactory13.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature15 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory17 = jsonFactory13.configure(feature15, true);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory13.createParser("JSON");
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory20.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken23 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean24 = jsonToken23.isBoolean();
        byte[] byteArray25 = jsonToken23.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonFactory22.createJsonParser(byteArray25);
        jsonParser26.close();
        java.lang.Object obj28 = jsonParser26.getEmbeddedObject();
        boolean boolean29 = jsonParser26.hasTextCharacters();
        boolean boolean30 = jsonParser26.hasCurrentToken();
        double double31 = jsonParser26.getValueAsDouble();
        java.lang.String str32 = jsonParser26.getCurrentName();
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator34 = jsonFactory33.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature35 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory33.configure(feature35, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory39 = jsonFactory37.enable(feature38);
        com.fasterxml.jackson.core.JsonParser.Feature feature40 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory39.disable(feature40);
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonParser26.enable(feature40);
        boolean boolean43 = jsonFactory13.isEnabled(feature40);
        boolean boolean44 = jsonFactory2.isEnabled(feature40);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNull(outputDecorator14);
        org.junit.Assert.assertTrue("'" + feature15 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature15.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory17);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + jsonToken23 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken23.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(outputDecorator34);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature35.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory39);
        org.junit.Assert.assertTrue("'" + feature40 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature40.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonParser jsonParser4 = jsonFactory2.createParser("true");
        java.lang.Object obj5 = jsonParser4.getTypeId();
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator7 = jsonFactory6.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature8 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory6.configure(feature8, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator11 = jsonFactory10.getInputDecorator();
        java.lang.String str12 = jsonFactory10.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory10.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory14.setRootValueSeparator("hi!");
        java.io.Reader reader17 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser18 = jsonFactory16.createJsonParser(reader17);
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator20 = jsonFactory19.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory19.configure(feature21, true);
        java.io.Reader reader24 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser25 = jsonFactory23.createJsonParser(reader24);
        com.fasterxml.jackson.core.JsonParser.Feature feature26 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser28 = jsonParser25.configure(feature26, true);
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonParser18.disable(feature26);
        com.fasterxml.jackson.core.FormatSchema formatSchema30 = null;
        boolean boolean31 = jsonParser29.canUseSchema(formatSchema30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator33 = jsonFactory32.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature34 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = jsonFactory32.configure(feature34, true);
        java.io.Reader reader37 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory36.createJsonParser(reader37);
        com.fasterxml.jackson.core.JsonParser.Feature feature39 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonParser38.configure(feature39, true);
        jsonParser41.clearCurrentToken();
        com.fasterxml.jackson.core.Version version43 = jsonParser41.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature44 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean46 = feature44.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser48 = jsonParser41.configure(feature44, true);
        com.fasterxml.jackson.core.JsonParser jsonParser49 = jsonParser29.disable(feature44);
        com.fasterxml.jackson.core.JsonFactory jsonFactory50 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator51 = jsonFactory50.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature52 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = jsonFactory50.configure(feature52, true);
        java.io.Reader reader55 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser56 = jsonFactory54.createJsonParser(reader55);
        com.fasterxml.jackson.core.JsonParser.Feature feature57 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser59 = jsonParser56.configure(feature57, true);
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonParser49.disable(feature57);
        boolean boolean61 = jsonFactory13.isEnabled(feature57);
        com.fasterxml.jackson.core.JsonParser jsonParser62 = jsonParser4.disable(feature57);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNotNull(jsonParser4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(outputDecorator7);
        org.junit.Assert.assertTrue("'" + feature8 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature8.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(inputDecorator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonParser18);
        org.junit.Assert.assertNull(outputDecorator20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonParser25);
        org.junit.Assert.assertTrue("'" + feature26 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature26.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser28);
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(outputDecorator33);
        org.junit.Assert.assertTrue("'" + feature34 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature34.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory36);
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertTrue("'" + feature39 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature39.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser41);
        org.junit.Assert.assertNotNull(version43);
        org.junit.Assert.assertTrue("'" + feature44 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature44.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jsonParser48);
        org.junit.Assert.assertNotNull(jsonParser49);
        org.junit.Assert.assertNull(outputDecorator51);
        org.junit.Assert.assertTrue("'" + feature52 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature52.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory54);
        org.junit.Assert.assertNotNull(jsonParser56);
        org.junit.Assert.assertTrue("'" + feature57 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature57.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser59);
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jsonParser62);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        double double11 = jsonParser6.getValueAsDouble((double) 100.0f);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        textBuffer1.append(' ');
        textBuffer1.append('4');
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer8 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler7);
        textBuffer8.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray15 = bufferRecycler12.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray18 = new char[] { ' ' };
        bufferRecycler12.releaseCharBuffer(0, charArray18);
        textBuffer8.resetWithShared(charArray18, 4000, 4);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator24 = jsonFactory23.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory23.configure(feature25, true);
        java.io.OutputStream outputStream28 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator29 = jsonFactory23.createGenerator(outputStream28);
        java.io.Writer writer30 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator31 = jsonFactory23.createJsonGenerator(writer30);
        java.io.Writer writer32 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator33 = jsonFactory23.createGenerator(writer32);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler34 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer35 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler34);
        textBuffer35.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler39 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray42 = bufferRecycler39.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray45 = new char[] { ' ' };
        bufferRecycler39.releaseCharBuffer(0, charArray45);
        textBuffer35.resetWithShared(charArray45, 4000, 4);
        com.fasterxml.jackson.core.JsonParser jsonParser52 = jsonFactory23.createParser(charArray45, 262144, (-1));
        textBuffer8.resetWithShared(charArray45, 0, 2);
        textBuffer8.resetWithString("hi!");
        char[] charArray58 = textBuffer8.contentsAsArray();
        textBuffer1.resetWithShared(charArray58, (int) ' ', 1);
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ ]");
        org.junit.Assert.assertNull(outputDecorator24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonGenerator29);
        org.junit.Assert.assertNotNull(jsonGenerator31);
        org.junit.Assert.assertNotNull(jsonGenerator33);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ ]");
        org.junit.Assert.assertNotNull(jsonParser52);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[h, i, !]");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser9.getCurrentToken();
        int int11 = jsonParser9.getValueAsInt();
        // The following exception was thrown during execution in test generation
        try {
            float float12 = jsonParser9.getFloatValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (null) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 1]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNull(jsonToken10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.Writer writer2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(writer2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator5 = jsonFactory4.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory4.configure(feature6, true);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createParser("");
        byte[] byteArray11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean16 = jsonToken15.isStructEnd();
        boolean boolean17 = jsonToken15.isScalarValue();
        byte[] byteArray18 = jsonToken15.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory8.createJsonParser(byteArray18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory0.createParser(byteArray18);
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory0.copy();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNull(outputDecorator5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory21);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        java.lang.Object obj7 = jsonParser6.getEmbeddedObject();
        com.fasterxml.jackson.core.JsonToken jsonToken8 = jsonParser6.nextToken();
        java.lang.Object obj9 = jsonParser6.getObjectId();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal10 = jsonParser6.getDecimalValue();
            org.junit.Assert.fail("Expected exception of type com.fasterxml.jackson.core.JsonParseException; message: Current token (VALUE_TRUE) not numeric, can not use numeric value accessors? at [Source: [B@6d2d99fc; line: 1, column: 9]");
        } catch (com.fasterxml.jackson.core.JsonParseException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + jsonToken8 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken8.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Writer writer5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory4.createGenerator(writer5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory7.setCodec(objectCodec8);
        java.io.Reader reader10 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonFactory7.createParser(reader10);
        java.io.InputStream inputStream12 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory7.createJsonParser(inputStream12);
        com.fasterxml.jackson.core.format.InputAccessor inputAccessor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.format.MatchStrength matchStrength15 = jsonFactory7.hasFormat(inputAccessor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertNotNull(jsonParser13);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.contentsAsArray();
        char[] charArray6 = textBuffer1.contentsAsArray();
        textBuffer1.ensureNotShared();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.fasterxml.jackson.core.ObjectCodec objectCodec0 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory1 = new com.fasterxml.jackson.core.JsonFactory(objectCodec0);
        java.io.InputStream inputStream2 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser3 = jsonFactory1.createJsonParser(inputStream2);
        boolean boolean5 = jsonParser3.getValueAsBoolean(false);
        org.junit.Assert.assertNotNull(jsonParser3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.setCharacterEscapes(characterEscapes5);
        java.io.OutputStream outputStream7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = jsonFactory6.createJsonGenerator(outputStream7);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory6.createJsonParser("null");
        boolean boolean11 = jsonFactory6.requiresPropertyOrdering();
        java.io.Reader reader12 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory6.createJsonParser(reader12);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertNotNull(jsonGenerator8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) (byte) 0);
        java.lang.String str11 = jsonParser6.nextTextValue();
        boolean boolean12 = jsonParser6.isClosed();
        boolean boolean13 = jsonParser6.isExpectedStartArrayToken();
        boolean boolean14 = jsonParser6.getValueAsBoolean();
        com.fasterxml.jackson.core.JsonToken jsonToken15 = jsonParser6.nextValue();
        long long17 = jsonParser6.getValueAsLong((long) 1);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jsonToken15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        java.io.Writer writer19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory4.createJsonGenerator(writer19);
        java.io.InputStream inputStream21 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser22 = jsonFactory4.createParser(inputStream21);
        int int24 = jsonParser22.nextIntValue(8);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(jsonParser22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        boolean boolean9 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema10 = jsonParser6.getSchema();
        com.fasterxml.jackson.core.JsonParser jsonParser11 = jsonParser6.skipChildren();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser11.nextValue();
        byte[] byteArray13 = jsonToken12.asByteArray();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(formatSchema10);
        org.junit.Assert.assertNotNull(jsonParser11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[116, 114, 117, 101]");
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = jsonFactory2.getCharacterEscapes();
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator11 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory2.setInputDecorator(inputDecorator11);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(characterEscapes10);
        org.junit.Assert.assertNotNull(jsonFactory12);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler12 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray13 = bufferRecycler12._byteBuffers;
        byte[][] byteArray14 = bufferRecycler12._byteBuffers;
        char[] charArray16 = bufferRecycler12.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory2.createParser(charArray16, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler20 = jsonFactory2._getBufferRecycler();
        com.fasterxml.jackson.core.JsonFactory.Feature feature21 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        int int22 = feature21.getMask();
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory2.enable(feature21);
        java.io.OutputStream outputStream24 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator25 = jsonFactory23.createJsonGenerator(outputStream24);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(bufferRecycler20);
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNotNull(jsonGenerator25);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler2.releaseByteBuffer(1, byteArray8);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer12 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler11);
        int int13 = textBuffer12.size();
        char[] charArray19 = new char[] { 'a', ' ', 'a', '#', ' ' };
        textBuffer12.resetWithShared(charArray19, 100, 0);
        bufferRecycler2.releaseCharBuffer(0, charArray19);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer24 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        char[] charArray26 = bufferRecycler2.calloc(0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = bufferRecycler2.allocByteBuffer((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 10, -1, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a,  , a, #,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[]");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean9 = feature7.enabledIn(1);
        int int10 = feature7.getMask();
        boolean boolean12 = feature7.enabledIn(2);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.disable(feature7);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator15 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.configure(feature16, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator19 = jsonFactory18.getInputDecorator();
        java.lang.String str20 = jsonFactory18.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature21 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean23 = feature21.enabledIn(1);
        boolean boolean24 = jsonFactory18.isEnabled(feature21);
        int int25 = feature21.getMask();
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonParser13.configure(feature21, false);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 256 + "'", int10 == 256);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(outputDecorator15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNull(inputDecorator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
        org.junit.Assert.assertTrue("'" + feature21 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature21.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(jsonParser27);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory2.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken5 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean6 = jsonToken5.isBoolean();
        byte[] byteArray7 = jsonToken5.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser8 = jsonFactory4.createJsonParser(byteArray7);
        long long9 = jsonParser8.getValueAsLong();
        int int10 = jsonParser8.getValueAsInt();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser8.getCurrentLocation();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory13.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken16 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean17 = jsonToken16.isBoolean();
        byte[] byteArray18 = jsonToken16.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory15.createJsonParser(byteArray18);
        jsonParser19.close();
        java.lang.Object obj21 = jsonParser19.getEmbeddedObject();
        boolean boolean22 = jsonParser19.hasTextCharacters();
        com.fasterxml.jackson.core.JsonLocation jsonLocation23 = jsonParser19.getCurrentLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException24 = new com.fasterxml.jackson.core.JsonParseException("hi!", jsonLocation23);
        com.fasterxml.jackson.core.JsonLocation jsonLocation25 = jsonParseException24.getLocation();
        com.fasterxml.jackson.core.JsonParseException jsonParseException26 = new com.fasterxml.jackson.core.JsonParseException("JSON", jsonLocation11, (java.lang.Throwable) jsonParseException24);
        com.fasterxml.jackson.core.JsonParseException jsonParseException27 = new com.fasterxml.jackson.core.JsonParseException("", jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + jsonToken5 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken5.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken16.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jsonLocation23);
        org.junit.Assert.assertNotNull(jsonLocation25);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        boolean boolean11 = jsonParser6.canReadTypeId();
        jsonParser6.overrideCurrentName("");
        jsonParser6.overrideCurrentName("hi!");
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        boolean boolean11 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.setFeatureMask(4000);
        int int15 = jsonParser13.nextIntValue(10);
        int int16 = jsonParser13.getFeatureMask();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4000 + "'", int16 == 4000);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean9 = feature7.enabledIn(1);
        int int10 = feature7.getMask();
        boolean boolean12 = feature7.enabledIn((int) (short) 10);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.disable(feature7);
        com.fasterxml.jackson.core.JsonToken jsonToken14 = jsonParser6.getLastClearedToken();
        com.fasterxml.jackson.core.FormatSchema formatSchema15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser6.setSchema(formatSchema15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 256 + "'", int10 == 256);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(jsonToken14);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        jsonParser6.close();
        java.lang.Object obj8 = jsonParser6.getEmbeddedObject();
        boolean boolean9 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.hasCurrentToken();
        com.fasterxml.jackson.core.JsonLocation jsonLocation11 = jsonParser6.getTokenLocation();
        com.fasterxml.jackson.core.JsonToken jsonToken12 = jsonParser6.nextValue();
        boolean boolean13 = jsonToken12.isBoolean();
        boolean boolean14 = jsonToken12.isStructStart();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jsonLocation11);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken12.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator3 = jsonFactory0.getOutputDecorator();
        java.io.Reader reader4 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser(reader4);
        com.fasterxml.jackson.core.JsonLocation jsonLocation6 = jsonParser5.getCurrentLocation();
        boolean boolean7 = jsonParser5.isClosed();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertNull(outputDecorator3);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(jsonLocation6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory2.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        boolean boolean14 = feature13.enabledByDefault();
        boolean boolean15 = jsonFactory2.isEnabled(feature13);
        byte[] byteArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory2.createParser(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        boolean boolean3 = jsonFactory0.requiresPropertyOrdering();
        com.fasterxml.jackson.core.JsonParser jsonParser5 = jsonFactory0.createJsonParser("}");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = jsonFactory0._getBufferRecycler();
        byte[][] byteArray7 = bufferRecycler6._byteBuffers;
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonParser5);
        org.junit.Assert.assertNotNull(bufferRecycler6);
        org.junit.Assert.assertNotNull(byteArray7);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.getCurrentSegmentSize();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal5 = textBuffer1.contentsAsDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Value \"\" can not be represented as BigDecimal");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        java.lang.Object obj11 = jsonParser6.getObjectId();
        boolean boolean12 = jsonParser6.isClosed();
        boolean boolean13 = jsonParser6.canReadObjectId();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes5 = jsonFactory0.getCharacterEscapes();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray9 = bufferRecycler8._byteBuffers;
        byte[][] byteArray10 = bufferRecycler8._byteBuffers;
        char[] charArray12 = bufferRecycler8.allocCharBuffer((int) (short) 1);
        int int14 = bufferRecycler8.byteBufferLength(0);
        char[] charArray16 = bufferRecycler8.calloc(0);
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory0.createParser(charArray16, 12, 1000);
        com.fasterxml.jackson.core.FormatSchema formatSchema20 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonParser19.setSchema(formatSchema20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(characterEscapes5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8000 + "'", int14 == 8000);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(jsonParser19);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        boolean boolean8 = jsonParser6.hasTextCharacters();
        boolean boolean10 = jsonParser6.getValueAsBoolean(true);
        boolean boolean11 = jsonParser6.hasTextCharacters();
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonParser6.setFeatureMask(4000);
        int int15 = jsonParser13.nextIntValue(0);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature5 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory6 = jsonFactory4.enable(feature5);
        boolean boolean7 = jsonFactory6.requiresCustomCodec();
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator9 = jsonFactory8.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature10 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = jsonFactory8.configure(feature10, true);
        boolean boolean13 = feature10.enabledByDefault();
        boolean boolean14 = jsonFactory6.isEnabled(feature10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator16 = jsonFactory15.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature17 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory19 = jsonFactory15.configure(feature17, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature20 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory21 = jsonFactory19.enable(feature20);
        com.fasterxml.jackson.core.JsonParser.Feature feature22 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = jsonFactory21.disable(feature22);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator24 = jsonFactory23.getOutputDecorator();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler27 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray28 = bufferRecycler27._byteBuffers;
        byte[][] byteArray29 = bufferRecycler27._byteBuffers;
        char[] charArray31 = bufferRecycler27.allocCharBuffer((int) (short) 1);
        byte[][] byteArray32 = bufferRecycler27._byteBuffers;
        char[][] charArray33 = bufferRecycler27._charBuffers;
        byte[] byteArray35 = bufferRecycler27.balloc((int) (byte) 0);
        com.fasterxml.jackson.core.JsonParser jsonParser38 = jsonFactory23.createJsonParser(byteArray35, (int) (short) 10, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser39 = jsonFactory6.createParser(byteArray35);
        java.net.URL uRL40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.JsonParser jsonParser41 = jsonFactory6.createParser(uRL40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertTrue("'" + feature5 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature5.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(outputDecorator9);
        org.junit.Assert.assertTrue("'" + feature10 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature10.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(outputDecorator16);
        org.junit.Assert.assertTrue("'" + feature17 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature17.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature20.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertNotNull(jsonFactory21);
        org.junit.Assert.assertTrue("'" + feature22 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature22.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonFactory23);
        org.junit.Assert.assertNull(outputDecorator24);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(jsonParser38);
        org.junit.Assert.assertNotNull(jsonParser39);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator5 = jsonFactory4.getInputDecorator();
        java.lang.String str6 = jsonFactory4.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory11.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean15 = feature14.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory11.enable(feature14);
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory4.configure(feature14, false);
        com.fasterxml.jackson.core.ObjectCodec objectCodec19 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory18.setCodec(objectCodec19);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNull(inputDecorator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertNotNull(jsonFactory20);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator10 = jsonFactory2.getInputDecorator();
        com.fasterxml.jackson.core.JsonParser jsonParser12 = jsonFactory2.createParser("");
        com.fasterxml.jackson.core.JsonLocation jsonLocation13 = jsonParser12.getCurrentLocation();
        int int15 = jsonParser12.getValueAsInt(9);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNull(inputDecorator10);
        org.junit.Assert.assertNotNull(jsonParser12);
        org.junit.Assert.assertNotNull(jsonLocation13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        textBuffer1.ensureNotShared();
        int int5 = textBuffer1.size();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer7 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler6);
        textBuffer7.resetWithEmpty();
        textBuffer7.setCurrentLength((int) ' ');
        char[] charArray11 = textBuffer7.emptyAndGetCurrentSegment();
        textBuffer1.resetWithCopy(charArray11, 0, 12);
        char[] charArray15 = textBuffer1.getTextBuffer();
        char[] charArray16 = textBuffer1.finishCurrentSegment();
        textBuffer1.resetWithEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray16);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        textBuffer1.append(' ');
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        textBuffer1.append('4');
        char[] charArray8 = textBuffer1.getTextBuffer();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        java.lang.String str2 = textBuffer1.contentsAsString();
        char[] charArray3 = textBuffer1.getTextBuffer();
        int int4 = textBuffer1.size();
        textBuffer1.releaseBuffers();
        char[] charArray6 = textBuffer1.contentsAsArray();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = textBuffer1.contentsAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.Writer writer2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(writer2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator5 = jsonFactory4.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature6 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory8 = jsonFactory4.configure(feature6, true);
        com.fasterxml.jackson.core.JsonParser jsonParser10 = jsonFactory8.createParser("");
        byte[] byteArray11 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser14 = jsonFactory8.createParser(byteArray11, 262144, 0);
        com.fasterxml.jackson.core.JsonToken jsonToken15 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean16 = jsonToken15.isStructEnd();
        boolean boolean17 = jsonToken15.isScalarValue();
        byte[] byteArray18 = jsonToken15.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser19 = jsonFactory8.createJsonParser(byteArray18);
        com.fasterxml.jackson.core.JsonParser jsonParser20 = jsonFactory0.createParser(byteArray18);
        com.fasterxml.jackson.core.ObjectCodec objectCodec21 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory0.setCodec(objectCodec21);
        boolean boolean23 = jsonFactory0.requiresPropertyOrdering();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNull(outputDecorator5);
        org.junit.Assert.assertTrue("'" + feature6 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature6.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory8);
        org.junit.Assert.assertNotNull(jsonParser10);
        org.junit.Assert.assertNotNull(jsonParser14);
        org.junit.Assert.assertTrue("'" + jsonToken15 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken15.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser19);
        org.junit.Assert.assertNotNull(jsonParser20);
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler1 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer2 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler1);
        textBuffer2.resetWithEmpty();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler6 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray9 = bufferRecycler6.allocByteBuffer(2, (int) (byte) 10);
        char[] charArray12 = new char[] { ' ' };
        bufferRecycler6.releaseCharBuffer(0, charArray12);
        textBuffer2.resetWithShared(charArray12, 4000, 4);
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory0.createParser(charArray12);
        int int18 = jsonParser17.getCurrentTokenId();
        com.fasterxml.jackson.core.JsonToken jsonToken19 = jsonParser17.nextValue();
        com.fasterxml.jackson.core.JsonToken jsonToken20 = jsonParser17.nextValue();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNull(jsonToken20);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Writer writer5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory4.createGenerator(writer5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.copy();
        java.io.Reader reader8 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonFactory4.createJsonParser(reader8);
        char[] charArray10 = new char[] {};
        com.fasterxml.jackson.core.JsonParser jsonParser13 = jsonFactory4.createParser(charArray10, 0, (int) (short) -1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory14 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator15 = jsonFactory14.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature16 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = jsonFactory14.configure(feature16, true);
        boolean boolean19 = feature16.enabledByDefault();
        boolean boolean20 = feature16.enabledByDefault();
        int int21 = feature16.getMask();
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory4.disable(feature16);
        com.fasterxml.jackson.core.JsonGenerator.Feature feature23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = jsonFactory4.isEnabled(feature23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertNotNull(jsonParser13);
        org.junit.Assert.assertNull(outputDecorator15);
        org.junit.Assert.assertTrue("'" + feature16 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature16.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(jsonFactory22);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.String str9 = jsonParser6.getValueAsString("JSON");
        com.fasterxml.jackson.core.JsonToken jsonToken10 = jsonParser6.nextValue();
        java.lang.Object obj11 = jsonParser6.getObjectId();
        com.fasterxml.jackson.core.Version version12 = jsonParser6.version();
        com.fasterxml.jackson.core.ObjectCodec objectCodec13 = jsonParser6.getCodec();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSON" + "'", str9, "JSON");
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken10.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(version12);
        org.junit.Assert.assertNull(objectCodec13);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        java.io.OutputStream outputStream2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = jsonFactory0.createJsonGenerator(outputStream2);
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.copy();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("");
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes7 = jsonFactory4.getCharacterEscapes();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler8 = jsonFactory4._getBufferRecycler();
        byte[][] byteArray9 = bufferRecycler8._byteBuffers;
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertNotNull(jsonGenerator3);
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(characterEscapes7);
        org.junit.Assert.assertNotNull(bufferRecycler8);
        org.junit.Assert.assertNotNull(byteArray9);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        long long7 = jsonParser6.getValueAsLong();
        java.lang.Object obj8 = jsonParser6.getTypeId();
        long long10 = jsonParser6.nextLongValue((long) 3);
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory13 = jsonFactory11.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken14 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean15 = jsonToken14.isBoolean();
        byte[] byteArray16 = jsonToken14.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser17 = jsonFactory13.createJsonParser(byteArray16);
        com.fasterxml.jackson.core.JsonFactory.Feature feature18 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory20 = jsonFactory13.configure(feature18, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler23 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray24 = bufferRecycler23._byteBuffers;
        byte[][] byteArray25 = bufferRecycler23._byteBuffers;
        char[] charArray27 = bufferRecycler23.allocCharBuffer((int) (short) 1);
        com.fasterxml.jackson.core.JsonParser jsonParser30 = jsonFactory13.createParser(charArray27, 262144, (int) (short) 10);
        com.fasterxml.jackson.core.ObjectCodec objectCodec31 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory13.setCodec(objectCodec31);
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator34 = jsonFactory33.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature35 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory37 = jsonFactory33.configure(feature35, true);
        com.fasterxml.jackson.core.JsonParser.Feature feature38 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        boolean boolean39 = jsonFactory37.isEnabled(feature38);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = jsonFactory32.configure(feature38, true);
        com.fasterxml.jackson.core.JsonParser jsonParser42 = jsonParser6.disable(feature38);
        com.fasterxml.jackson.core.JsonLocation jsonLocation43 = jsonParser6.getCurrentLocation();
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(jsonFactory13);
        org.junit.Assert.assertTrue("'" + jsonToken14 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken14.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser17);
        org.junit.Assert.assertTrue("'" + feature18 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature18.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertNotNull(jsonParser30);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNull(outputDecorator34);
        org.junit.Assert.assertTrue("'" + feature35 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature35.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory37);
        org.junit.Assert.assertTrue("'" + feature38 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature38.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jsonFactory41);
        org.junit.Assert.assertNotNull(jsonParser42);
        org.junit.Assert.assertNotNull(jsonLocation43);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer1 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler0);
        textBuffer1.resetWithEmpty();
        int int3 = textBuffer1.size();
        java.lang.String str4 = textBuffer1.contentsAsString();
        char[] charArray5 = textBuffer1.emptyAndGetCurrentSegment();
        int int6 = textBuffer1.getCurrentSegmentSize();
        textBuffer1.resetWithString("JSON");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature2 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Reader reader5 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createJsonParser(reader5);
        com.fasterxml.jackson.core.JsonParser.Feature feature7 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser9 = jsonParser6.configure(feature7, true);
        jsonParser9.clearCurrentToken();
        com.fasterxml.jackson.core.Version version11 = jsonParser9.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature12 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean14 = feature12.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser16 = jsonParser9.configure(feature12, true);
        com.fasterxml.jackson.core.ObjectCodec objectCodec17 = null;
        jsonParser9.setCodec(objectCodec17);
        com.fasterxml.jackson.core.JsonToken jsonToken19 = jsonParser9.nextValue();
        com.fasterxml.jackson.core.JsonStreamContext jsonStreamContext20 = jsonParser9.getParsingContext();
        boolean boolean21 = jsonParser9.getValueAsBoolean();
        double double22 = jsonParser9.getValueAsDouble();
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature2.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature7.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser9);
        org.junit.Assert.assertNotNull(version11);
        org.junit.Assert.assertTrue("'" + feature12 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature12.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jsonParser16);
        org.junit.Assert.assertNull(jsonToken19);
        org.junit.Assert.assertNotNull(jsonStreamContext20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory2 = jsonFactory0.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean4 = jsonToken3.isBoolean();
        byte[] byteArray5 = jsonToken3.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory2.createJsonParser(byteArray5);
        com.fasterxml.jackson.core.JsonFactory.Feature feature7 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory2.configure(feature7, false);
        com.fasterxml.jackson.core.JsonFactory jsonFactory10 = jsonFactory2.copy();
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator12 = jsonFactory11.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature13 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory15 = jsonFactory11.configure(feature13, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator16 = jsonFactory15.getInputDecorator();
        java.lang.String str17 = jsonFactory15.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        com.fasterxml.jackson.core.JsonParser jsonParser24 = jsonFactory22.createParser("");
        com.fasterxml.jackson.core.JsonFactory.Feature feature25 = com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES;
        boolean boolean26 = feature25.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory27 = jsonFactory22.enable(feature25);
        com.fasterxml.jackson.core.JsonFactory jsonFactory29 = jsonFactory15.configure(feature25, false);
        com.fasterxml.jackson.core.JsonFactory.Feature feature30 = com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES;
        com.fasterxml.jackson.core.JsonFactory jsonFactory31 = jsonFactory15.disable(feature30);
        com.fasterxml.jackson.core.JsonFactory jsonFactory32 = jsonFactory2.enable(feature30);
        java.io.OutputStream outputStream33 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator34 = jsonFactory2.createGenerator(outputStream33);
        org.junit.Assert.assertNotNull(jsonFactory2);
        org.junit.Assert.assertTrue("'" + jsonToken3 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken3.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertTrue("'" + feature7 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature7.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory10);
        org.junit.Assert.assertNull(outputDecorator12);
        org.junit.Assert.assertTrue("'" + feature13 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature13.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory15);
        org.junit.Assert.assertNull(inputDecorator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNotNull(jsonParser24);
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonFactory.Feature.CANONICALIZE_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jsonFactory27);
        org.junit.Assert.assertNotNull(jsonFactory29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES + "'", feature30.equals(com.fasterxml.jackson.core.JsonFactory.Feature.INTERN_FIELD_NAMES));
        org.junit.Assert.assertNotNull(jsonFactory31);
        org.junit.Assert.assertNotNull(jsonFactory32);
        org.junit.Assert.assertNotNull(jsonGenerator34);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler2 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer3 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler2);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        bufferRecycler7.releaseByteBuffer(1, byteArray13);
        bufferRecycler2.releaseByteBuffer(7, byteArray13);
        char[][] charArray16 = bufferRecycler2._charBuffers;
        com.fasterxml.jackson.core.JsonFactory jsonFactory18 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator19 = jsonFactory18.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature20 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory22 = jsonFactory18.configure(feature20, true);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator23 = jsonFactory22.getInputDecorator();
        java.lang.String str24 = jsonFactory22.getRootValueSeparator();
        com.fasterxml.jackson.core.JsonParser.Feature feature25 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean27 = feature25.enabledIn(1);
        boolean boolean28 = jsonFactory22.isEnabled(feature25);
        com.fasterxml.jackson.core.io.InputDecorator inputDecorator29 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory30 = jsonFactory22.setInputDecorator(inputDecorator29);
        com.fasterxml.jackson.core.JsonParser.Feature feature31 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES;
        boolean boolean33 = feature31.enabledIn(1);
        com.fasterxml.jackson.core.JsonFactory jsonFactory34 = jsonFactory22.enable(feature31);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler35 = null;
        com.fasterxml.jackson.core.util.TextBuffer textBuffer36 = new com.fasterxml.jackson.core.util.TextBuffer(bufferRecycler35);
        int int37 = textBuffer36.size();
        char[] charArray43 = new char[] { 'a', ' ', 'a', '#', ' ' };
        textBuffer36.resetWithShared(charArray43, 100, 0);
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory22.createParser(charArray43);
        bufferRecycler2.releaseCharBuffer(11, charArray43);
        int int50 = bufferRecycler2.charBufferLength(0);
        char[] charArray52 = bufferRecycler2.calloc(4000);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 10, -1, -1]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertNull(outputDecorator19);
        org.junit.Assert.assertTrue("'" + feature20 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature20.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory22);
        org.junit.Assert.assertNull(inputDecorator23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " " + "'", str24, " ");
        org.junit.Assert.assertTrue("'" + feature25 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature25.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jsonFactory30);
        org.junit.Assert.assertTrue("'" + feature31 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES + "'", feature31.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jsonFactory34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "a a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "a a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a,  , a, #,  ]");
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4000 + "'", int50 == 4000);
        org.junit.Assert.assertNotNull(charArray52);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        com.fasterxml.jackson.core.JsonParser jsonParser6 = jsonFactory4.createParser("true");
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator8 = jsonFactory7.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature9 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory7.configure(feature9, true);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes12 = jsonFactory7.getCharacterEscapes();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler15 = new com.fasterxml.jackson.core.util.BufferRecycler((int) (byte) 10, (int) (short) 100);
        byte[][] byteArray16 = bufferRecycler15._byteBuffers;
        byte[][] byteArray17 = bufferRecycler15._byteBuffers;
        char[] charArray19 = bufferRecycler15.allocCharBuffer((int) (short) 1);
        int int21 = bufferRecycler15.byteBufferLength(0);
        char[] charArray23 = bufferRecycler15.calloc(0);
        com.fasterxml.jackson.core.JsonParser jsonParser26 = jsonFactory7.createParser(charArray23, 12, 1000);
        com.fasterxml.jackson.core.JsonParser jsonParser27 = jsonFactory4.createParser(charArray23);
        com.fasterxml.jackson.core.ObjectCodec objectCodec28 = null;
        jsonParser27.setCodec(objectCodec28);
        boolean boolean30 = jsonParser27.requiresCustomCodec();
        java.lang.String str32 = jsonParser27.getValueAsString(" ");
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonParser6);
        org.junit.Assert.assertNull(outputDecorator8);
        org.junit.Assert.assertTrue("'" + feature9 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature9.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNull(characterEscapes12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8000 + "'", int21 == 8000);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertNotNull(jsonParser26);
        org.junit.Assert.assertNotNull(jsonParser27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + " " + "'", str32, " ");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.fasterxml.jackson.core.JsonFactory jsonFactory0 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator1 = jsonFactory0.getOutputDecorator();
        com.fasterxml.jackson.core.JsonParser.Feature feature2 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory4 = jsonFactory0.configure(feature2, true);
        java.io.Writer writer5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = jsonFactory4.createGenerator(writer5);
        com.fasterxml.jackson.core.JsonFactory jsonFactory7 = jsonFactory4.copy();
        com.fasterxml.jackson.core.ObjectCodec objectCodec8 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory9 = jsonFactory7.setCodec(objectCodec8);
        com.fasterxml.jackson.core.io.CharacterEscapes characterEscapes10 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory11 = jsonFactory9.setCharacterEscapes(characterEscapes10);
        com.fasterxml.jackson.core.JsonFactory jsonFactory12 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator13 = jsonFactory12.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature14 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory16 = jsonFactory12.configure(feature14, true);
        java.io.OutputStream outputStream17 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = jsonFactory12.createGenerator(outputStream17);
        java.io.Writer writer19 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = jsonFactory12.createJsonGenerator(writer19);
        java.io.Writer writer21 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = jsonFactory12.createGenerator(writer21);
        com.fasterxml.jackson.core.JsonFactory jsonFactory23 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory25 = jsonFactory23.setRootValueSeparator("hi!");
        com.fasterxml.jackson.core.JsonToken jsonToken26 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
        boolean boolean27 = jsonToken26.isBoolean();
        byte[] byteArray28 = jsonToken26.asByteArray();
        com.fasterxml.jackson.core.JsonParser jsonParser29 = jsonFactory25.createJsonParser(byteArray28);
        com.fasterxml.jackson.core.JsonParser.Feature feature30 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        com.fasterxml.jackson.core.JsonParser jsonParser32 = jsonParser29.configure(feature30, true);
        com.fasterxml.jackson.core.JsonFactory jsonFactory33 = jsonFactory12.disable(feature30);
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator34 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory35 = jsonFactory12.setOutputDecorator(outputDecorator34);
        com.fasterxml.jackson.core.JsonFactory jsonFactory36 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.JsonFactory jsonFactory38 = jsonFactory36.setRootValueSeparator("hi!");
        java.io.Reader reader39 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser40 = jsonFactory38.createJsonParser(reader39);
        com.fasterxml.jackson.core.JsonFactory jsonFactory41 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator42 = jsonFactory41.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature43 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory45 = jsonFactory41.configure(feature43, true);
        java.io.Reader reader46 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser47 = jsonFactory45.createJsonParser(reader46);
        com.fasterxml.jackson.core.JsonParser.Feature feature48 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser50 = jsonParser47.configure(feature48, true);
        com.fasterxml.jackson.core.JsonParser jsonParser51 = jsonParser40.disable(feature48);
        com.fasterxml.jackson.core.FormatSchema formatSchema52 = null;
        boolean boolean53 = jsonParser51.canUseSchema(formatSchema52);
        com.fasterxml.jackson.core.JsonFactory jsonFactory54 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator55 = jsonFactory54.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature56 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory58 = jsonFactory54.configure(feature56, true);
        java.io.Reader reader59 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser60 = jsonFactory58.createJsonParser(reader59);
        com.fasterxml.jackson.core.JsonParser.Feature feature61 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser63 = jsonParser60.configure(feature61, true);
        jsonParser63.clearCurrentToken();
        com.fasterxml.jackson.core.Version version65 = jsonParser63.version();
        com.fasterxml.jackson.core.JsonParser.Feature feature66 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS;
        boolean boolean68 = feature66.enabledIn(1);
        com.fasterxml.jackson.core.JsonParser jsonParser70 = jsonParser63.configure(feature66, true);
        com.fasterxml.jackson.core.JsonParser jsonParser71 = jsonParser51.disable(feature66);
        com.fasterxml.jackson.core.JsonFactory jsonFactory72 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.io.OutputDecorator outputDecorator73 = jsonFactory72.getOutputDecorator();
        com.fasterxml.jackson.core.JsonFactory.Feature feature74 = com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW;
        com.fasterxml.jackson.core.JsonFactory jsonFactory76 = jsonFactory72.configure(feature74, true);
        java.io.Reader reader77 = null;
        com.fasterxml.jackson.core.JsonParser jsonParser78 = jsonFactory76.createJsonParser(reader77);
        com.fasterxml.jackson.core.JsonParser.Feature feature79 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonParser jsonParser81 = jsonParser78.configure(feature79, true);
        com.fasterxml.jackson.core.JsonParser jsonParser82 = jsonParser71.disable(feature79);
        com.fasterxml.jackson.core.JsonFactory jsonFactory83 = jsonFactory35.enable(feature79);
        com.fasterxml.jackson.core.Version version84 = jsonFactory83.version();
        com.fasterxml.jackson.core.JsonFactory jsonFactory85 = new com.fasterxml.jackson.core.JsonFactory();
        com.fasterxml.jackson.core.ObjectCodec objectCodec86 = null;
        com.fasterxml.jackson.core.JsonFactory jsonFactory87 = jsonFactory85.setCodec(objectCodec86);
        com.fasterxml.jackson.core.JsonParser.Feature feature88 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS;
        com.fasterxml.jackson.core.JsonFactory jsonFactory90 = jsonFactory85.configure(feature88, false);
        boolean boolean91 = feature88.enabledByDefault();
        com.fasterxml.jackson.core.JsonFactory jsonFactory92 = jsonFactory83.disable(feature88);
        com.fasterxml.jackson.core.JsonFactory jsonFactory93 = jsonFactory9.disable(feature88);
        org.junit.Assert.assertNull(outputDecorator1);
        org.junit.Assert.assertTrue("'" + feature2 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS + "'", feature2.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory4);
        org.junit.Assert.assertNotNull(jsonGenerator6);
        org.junit.Assert.assertNotNull(jsonFactory7);
        org.junit.Assert.assertNotNull(jsonFactory9);
        org.junit.Assert.assertNotNull(jsonFactory11);
        org.junit.Assert.assertNull(outputDecorator13);
        org.junit.Assert.assertTrue("'" + feature14 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature14.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory16);
        org.junit.Assert.assertNotNull(jsonGenerator18);
        org.junit.Assert.assertNotNull(jsonGenerator20);
        org.junit.Assert.assertNotNull(jsonGenerator22);
        org.junit.Assert.assertNotNull(jsonFactory25);
        org.junit.Assert.assertTrue("'" + jsonToken26 + "' != '" + com.fasterxml.jackson.core.JsonToken.VALUE_TRUE + "'", jsonToken26.equals(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[116, 114, 117, 101]");
        org.junit.Assert.assertNotNull(jsonParser29);
        org.junit.Assert.assertTrue("'" + feature30 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER + "'", feature30.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER));
        org.junit.Assert.assertNotNull(jsonParser32);
        org.junit.Assert.assertNotNull(jsonFactory33);
        org.junit.Assert.assertNotNull(jsonFactory35);
        org.junit.Assert.assertNotNull(jsonFactory38);
        org.junit.Assert.assertNotNull(jsonParser40);
        org.junit.Assert.assertNull(outputDecorator42);
        org.junit.Assert.assertTrue("'" + feature43 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature43.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory45);
        org.junit.Assert.assertNotNull(jsonParser47);
        org.junit.Assert.assertTrue("'" + feature48 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature48.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser50);
        org.junit.Assert.assertNotNull(jsonParser51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(outputDecorator55);
        org.junit.Assert.assertTrue("'" + feature56 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature56.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory58);
        org.junit.Assert.assertNotNull(jsonParser60);
        org.junit.Assert.assertTrue("'" + feature61 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature61.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser63);
        org.junit.Assert.assertNotNull(version65);
        org.junit.Assert.assertTrue("'" + feature66 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS + "'", feature66.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jsonParser70);
        org.junit.Assert.assertNotNull(jsonParser71);
        org.junit.Assert.assertNull(outputDecorator73);
        org.junit.Assert.assertTrue("'" + feature74 + "' != '" + com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW + "'", feature74.equals(com.fasterxml.jackson.core.JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW));
        org.junit.Assert.assertNotNull(jsonFactory76);
        org.junit.Assert.assertNotNull(jsonParser78);
        org.junit.Assert.assertTrue("'" + feature79 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature79.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonParser81);
        org.junit.Assert.assertNotNull(jsonParser82);
        org.junit.Assert.assertNotNull(jsonFactory83);
        org.junit.Assert.assertNotNull(version84);
        org.junit.Assert.assertNotNull(jsonFactory87);
        org.junit.Assert.assertTrue("'" + feature88 + "' != '" + com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS + "'", feature88.equals(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_YAML_COMMENTS));
        org.junit.Assert.assertNotNull(jsonFactory90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(jsonFactory92);
        org.junit.Assert.assertNotNull(jsonFactory93);
    }
}

