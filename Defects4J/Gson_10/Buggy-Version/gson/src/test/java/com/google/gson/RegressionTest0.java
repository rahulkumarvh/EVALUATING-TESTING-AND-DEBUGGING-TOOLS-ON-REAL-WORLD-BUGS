package com.google.gson.internal.bind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        com.google.gson.JsonPrimitive jsonPrimitive4 = new com.google.gson.JsonPrimitive("hi!");
        java.lang.reflect.Type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.RuntimeException runtimeException6 = gson0.fromJson((com.google.gson.JsonElement) jsonPrimitive4, type5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        java.lang.String str6 = gson0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.FieldNamingPolicy fieldNamingPolicy7 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) fieldNamingPolicy7, appendable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fieldNamingPolicy7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.JsonElement jsonElement7 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader8 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement7);
        jsonTreeReader8.close();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement10 = autoCloseableArrayTypeAdapter6.toJsonTree((java.lang.Object) jsonTreeReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass6 = gson0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy3 = null;
        com.google.gson.internal.Excluder excluder6 = excluder2.withExclusionStrategy(exclusionStrategy3, true, false);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory7 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        java.lang.reflect.Field field8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = reflectiveTypeAdapterFactory7.excludeField(field8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy3 = null;
        com.google.gson.internal.Excluder excluder6 = excluder2.withExclusionStrategy(exclusionStrategy3, true, false);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory7 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        java.lang.reflect.Field field8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fieldNamingPolicy1.translateName(field8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = autoCloseableArrayTypeAdapter6.fromJson("0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected BEGIN_ARRAY but was NUMBER at line 1 column 2 path $");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        com.google.gson.JsonPrimitive jsonPrimitive9 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean10 = jsonPrimitive9.isString();
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter7, (java.lang.Object) jsonPrimitive9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = autoCloseableArrayTypeAdapter6.toJson((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = autoCloseableArrayTypeAdapter6.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter7, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy3 = null;
        com.google.gson.internal.Excluder excluder6 = excluder2.withExclusionStrategy(exclusionStrategy3, false, false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.io.Writer writer7 = null;
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.toJson(writer7, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.reflect.Field field0 = null;
        com.google.gson.internal.ConstructorConstructor constructorConstructor2 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy3 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
        com.google.gson.internal.Excluder excluder4 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy5 = null;
        com.google.gson.internal.Excluder excluder8 = excluder4.withExclusionStrategy(exclusionStrategy5, true, false);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory9 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor2, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy3, excluder4);
        com.google.gson.internal.Excluder excluder10 = excluder4.disableInnerClassSerialization();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField(field0, true, excluder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy3);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertNotNull(excluder10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.toJson(writer7, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonReader jsonReader8 = gson0.newJsonReader(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = autoCloseableArrayTypeAdapter6.fromJson("com.google.gson.stream.MalformedJsonException: com.google.gson.JsonSyntaxException: hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        com.google.gson.JsonNull jsonNull1 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        com.google.gson.internal.Excluder excluder5 = excluder4.excludeFieldsWithoutExposeAnnotation();
        boolean boolean6 = jsonNull1.equals((java.lang.Object) excluder4);
        java.lang.Number number7 = numberTypeAdapter0.fromJsonTree((com.google.gson.JsonElement) jsonNull1);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = jsonNull1.getAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNull");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        com.google.gson.JsonNull jsonNull1 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        com.google.gson.internal.Excluder excluder5 = excluder4.excludeFieldsWithoutExposeAnnotation();
        boolean boolean6 = jsonNull1.equals((java.lang.Object) excluder4);
        java.lang.Number number7 = numberTypeAdapter0.fromJsonTree((com.google.gson.JsonElement) jsonNull1);
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = numberTypeAdapter0.fromJson(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.google.gson.JsonNull jsonNull0 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson1 = new com.google.gson.Gson();
        boolean boolean2 = gson1.htmlSafe();
        com.google.gson.internal.Excluder excluder3 = gson1.excluder();
        com.google.gson.internal.Excluder excluder4 = excluder3.excludeFieldsWithoutExposeAnnotation();
        boolean boolean5 = jsonNull0.equals((java.lang.Object) excluder3);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = jsonNull0.getAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNull");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(excluder3);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.LongSerializationPolicy longSerializationPolicy4 = com.google.gson.LongSerializationPolicy.STRING;
        com.google.gson.JsonElement jsonElement6 = longSerializationPolicy4.serialize((java.lang.Long) 100L);
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson(jsonElement6, (java.lang.Appendable) writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(longSerializationPolicy4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(writer8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy3 = null;
        com.google.gson.internal.Excluder excluder6 = excluder2.withExclusionStrategy(exclusionStrategy3, true, false);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory7 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        java.lang.reflect.Field field8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = reflectiveTypeAdapterFactory7.excludeField(field8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.reflect.Type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> strEntrySet6 = gson0.fromJson("com.google.gson.JsonSyntaxException: ", type5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.google.gson.JsonNull jsonNull0 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson1 = new com.google.gson.Gson();
        boolean boolean2 = gson1.htmlSafe();
        com.google.gson.internal.Excluder excluder3 = gson1.excluder();
        com.google.gson.internal.Excluder excluder4 = excluder3.excludeFieldsWithoutExposeAnnotation();
        boolean boolean5 = jsonNull0.equals((java.lang.Object) excluder3);
        // The following exception was thrown during execution in test generation
        try {
            char char6 = jsonNull0.getAsCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNull");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(excluder3);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.Object obj3 = null;
        com.google.gson.JsonElement jsonElement4 = gson0.toJsonTree(obj3);
        boolean boolean5 = gson0.htmlSafe();
        com.google.gson.internal.JsonReaderInternalAccess jsonReaderInternalAccess6 = com.google.gson.internal.JsonReaderInternalAccess.INSTANCE;
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) jsonReaderInternalAccess6, (java.lang.Appendable) writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jsonReaderInternalAccess6);
        org.junit.Assert.assertNotNull(writer8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = autoCloseableArrayTypeAdapter6.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.String str7 = gson0.toString();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        java.lang.Appendable appendable10 = null;
        java.io.Writer writer11 = com.google.gson.internal.Streams.writerForAppendable(appendable10);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonObject8, (java.lang.Appendable) writer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = objTypeAdapter7.fromJson("JsonTreeReader");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonArray jsonArray6 = jsonElement5.getAsJsonArray();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: This is not a JSON Array.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.JsonPrimitive jsonPrimitive8 = new com.google.gson.JsonPrimitive((java.lang.Number) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = autoCloseableArrayTypeAdapter6.fromJsonTree((com.google.gson.JsonElement) jsonPrimitive8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected BEGIN_ARRAY but was NUMBER");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        com.google.gson.stream.JsonWriter jsonWriter9 = new com.google.gson.stream.JsonWriter(writer8);
        com.google.gson.TypeAdapterFactory typeAdapterFactory10 = com.google.gson.internal.bind.TimeTypeAdapter.FACTORY;
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter9, (java.lang.Object) typeAdapterFactory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertNotNull(typeAdapterFactory10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.Object obj7 = null;
        com.google.gson.JsonElement jsonElement8 = autoCloseableArrayTypeAdapter6.toJsonTree(obj7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = autoCloseableArrayTypeAdapter6.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonElement8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.reflect.Field field0 = null;
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        com.google.gson.internal.Excluder excluder5 = excluder4.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder6 = excluder4.disableInnerClassSerialization();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField(field0, true, excluder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertNotNull(excluder6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.reflect.Field field0 = null;
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.excludeField(field0, false, excluder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonElement jsonElement7 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader8 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement7);
        jsonTreeReader8.close();
        jsonTreeReader8.setLenient(false);
        java.lang.String str12 = jsonTreeReader8.toString();
        jsonTreeReader8.setLenient(true);
        jsonTreeReader8.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy4 = gson0.fieldNamingStrategy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(fieldNamingStrategy4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = autoCloseableArrayTypeAdapter6.fromJson(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.google.gson.internal.bind.TimeTypeAdapter timeTypeAdapter0 = new com.google.gson.internal.bind.TimeTypeAdapter();
        com.google.gson.TypeAdapter<java.sql.Time> timeTypeAdapter1 = timeTypeAdapter0.nullSafe();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        java.lang.String str4 = gson2.toString();
        boolean boolean5 = gson2.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter6 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass7 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter8 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson2, autoCloseableTypeAdapter6, autoCloseableClass7);
        java.lang.String str9 = gson2.toString();
        java.lang.Appendable appendable10 = null;
        java.io.Writer writer11 = com.google.gson.internal.Streams.writerForAppendable(appendable10);
        com.google.gson.stream.JsonWriter jsonWriter12 = new com.google.gson.stream.JsonWriter(writer11);
        com.google.gson.stream.JsonWriter jsonWriter13 = new com.google.gson.stream.JsonWriter(writer11);
        com.google.gson.stream.JsonWriter jsonWriter14 = gson2.newJsonWriter(writer11);
        java.sql.Time time15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeTypeAdapter0.write(jsonWriter14, time15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeTypeAdapter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter8 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.Gson gson9 = new com.google.gson.Gson();
        boolean boolean10 = gson9.htmlSafe();
        java.lang.String str11 = gson9.toString();
        boolean boolean12 = gson9.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter13 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass14 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter15 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson9, autoCloseableTypeAdapter13, autoCloseableClass14);
        java.lang.String str16 = gson9.toString();
        java.lang.Appendable appendable17 = null;
        java.io.Writer writer18 = com.google.gson.internal.Streams.writerForAppendable(appendable17);
        com.google.gson.stream.JsonWriter jsonWriter19 = new com.google.gson.stream.JsonWriter(writer18);
        com.google.gson.stream.JsonWriter jsonWriter20 = new com.google.gson.stream.JsonWriter(writer18);
        com.google.gson.stream.JsonWriter jsonWriter21 = gson9.newJsonWriter(writer18);
        com.google.gson.JsonPrimitive jsonPrimitive23 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean24 = jsonPrimitive23.isNumber();
        boolean boolean25 = jsonPrimitive23.isString();
        char char26 = jsonPrimitive23.getAsCharacter();
        java.lang.String str27 = jsonPrimitive23.toString();
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter21, (java.lang.Object) jsonPrimitive23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertNotNull(objTypeAdapter8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(writer18);
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + 'h' + "'", char26 == 'h');
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"hi!\"" + "'", str27, "\"hi!\"");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader8 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = autoCloseableArrayTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected BEGIN_ARRAY but was BEGIN_OBJECT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonNull jsonNull7 = new com.google.gson.JsonNull();
        boolean boolean9 = jsonNull7.equals((java.lang.Object) (byte) 10);
        com.google.gson.JsonNull jsonNull10 = jsonNull7.getAsJsonNull();
        com.google.gson.JsonElement jsonElement11 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader12 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement11);
        jsonTreeReader12.close();
        jsonTreeReader12.setLenient(false);
        java.lang.String str16 = jsonTreeReader12.toString();
        jsonTreeReader12.setLenient(true);
        jsonTreeReader12.close();
        boolean boolean20 = jsonNull10.equals((java.lang.Object) jsonTreeReader12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNull10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JsonTreeReader" + "'", str16, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        boolean boolean12 = jsonTreeReader9.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader9.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected END_OBJECT but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.Object obj3 = null;
        com.google.gson.JsonElement jsonElement4 = gson0.toJsonTree(obj3);
        com.google.gson.internal.Excluder excluder5 = gson0.excluder();
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        java.io.Writer writer9 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        com.google.gson.stream.JsonWriter jsonWriter10 = new com.google.gson.stream.JsonWriter(writer9);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) "\"hi!\"", (java.lang.Appendable) writer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertNotNull(writer9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.google.gson.internal.bind.SqlDateTypeAdapter sqlDateTypeAdapter0 = new com.google.gson.internal.bind.SqlDateTypeAdapter();
        com.google.gson.TypeAdapter<java.sql.Date> dateTypeAdapter1 = sqlDateTypeAdapter0.nullSafe();
        java.sql.Date date2 = null;
        java.lang.String str3 = dateTypeAdapter1.toJson(date2);
        java.sql.Date date4 = null;
        java.lang.String str5 = dateTypeAdapter1.toJson(date4);
        com.google.gson.Gson gson6 = new com.google.gson.Gson();
        boolean boolean7 = gson6.htmlSafe();
        java.lang.String str8 = gson6.toString();
        boolean boolean9 = gson6.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter10 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass11 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter12 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson6, autoCloseableTypeAdapter10, autoCloseableClass11);
        java.lang.String str13 = gson6.toString();
        java.lang.Appendable appendable14 = null;
        java.io.Writer writer15 = com.google.gson.internal.Streams.writerForAppendable(appendable14);
        com.google.gson.stream.JsonWriter jsonWriter16 = new com.google.gson.stream.JsonWriter(writer15);
        com.google.gson.stream.JsonWriter jsonWriter17 = new com.google.gson.stream.JsonWriter(writer15);
        com.google.gson.stream.JsonWriter jsonWriter18 = gson6.newJsonWriter(writer15);
        java.sql.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter1.toJson(writer15, date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(writer15);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = objectTypeAdapter6.fromJson("? super com.google.gson.Gson");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.JsonElement jsonElement7 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader8 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement7);
        jsonTreeReader8.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = autoCloseableArrayTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        com.google.gson.internal.Excluder excluder3 = excluder2.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder4 = excluder2.disableInnerClassSerialization();
        java.lang.reflect.Field field5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = excluder4.excludeField(field5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder3);
        org.junit.Assert.assertNotNull(excluder4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        com.google.gson.stream.JsonReader jsonReader12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = objectTypeAdapter6.read(jsonReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = jsonTreeReader9.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.FieldNamingStrategy fieldNamingStrategy7 = gson0.fieldNamingStrategy();
        java.lang.reflect.Field field8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fieldNamingStrategy7.translateName(field8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fieldNamingStrategy7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        java.io.Writer writer9 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        com.google.gson.stream.JsonWriter jsonWriter10 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.JsonPrimitive jsonPrimitive12 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean13 = jsonPrimitive12.isNumber();
        com.google.gson.JsonArray jsonArray14 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive16 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean17 = jsonPrimitive16.isString();
        boolean boolean18 = jsonPrimitive16.isBoolean();
        boolean boolean19 = jsonArray14.contains((com.google.gson.JsonElement) jsonPrimitive16);
        boolean boolean20 = jsonPrimitive12.equals((java.lang.Object) jsonArray14);
        // The following exception was thrown during execution in test generation
        try {
            objectTypeAdapter6.write(jsonWriter10, (java.lang.Object) jsonPrimitive12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertNotNull(writer9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.JsonPrimitive jsonPrimitive7 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean8 = jsonPrimitive7.isNumber();
        java.lang.Appendable appendable9 = null;
        java.io.Writer writer10 = com.google.gson.internal.Streams.writerForAppendable(appendable9);
        com.google.gson.stream.JsonWriter jsonWriter11 = new com.google.gson.stream.JsonWriter(writer10);
        jsonWriter11.setHtmlSafe(true);
        jsonWriter11.flush();
        jsonWriter11.flush();
        boolean boolean16 = jsonWriter11.isHtmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonPrimitive7, jsonWriter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(writer10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.Object obj7 = null;
        com.google.gson.JsonElement jsonElement8 = autoCloseableArrayTypeAdapter6.toJsonTree(obj7);
        java.lang.Appendable appendable9 = null;
        java.io.Writer writer10 = com.google.gson.internal.Streams.writerForAppendable(appendable9);
        com.google.gson.stream.JsonWriter jsonWriter11 = new com.google.gson.stream.JsonWriter(writer10);
        jsonWriter11.setHtmlSafe(true);
        jsonWriter11.flush();
        jsonWriter11.flush();
        jsonWriter11.setSerializeNulls(false);
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter11, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(writer10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        com.google.gson.stream.JsonWriter jsonWriter9 = new com.google.gson.stream.JsonWriter(writer8);
        com.google.gson.stream.JsonWriter jsonWriter10 = new com.google.gson.stream.JsonWriter(writer8);
        boolean boolean11 = jsonWriter10.isHtmlSafe();
        com.google.gson.Gson gson12 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement13 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader14 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement13);
        java.lang.String str15 = gson12.toJson((java.lang.Object) jsonElement13);
        java.lang.String str17 = gson12.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter18 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson12);
        boolean boolean19 = gson12.htmlSafe();
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter10, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter3 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter4 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.String str7 = gson0.toString();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> strEntrySet9 = jsonObject8.entrySet();
        com.google.gson.JsonObject jsonObject10 = jsonObject8.getAsJsonObject();
        com.google.gson.JsonObject jsonObject11 = jsonObject10.getAsJsonObject();
        java.lang.Appendable appendable12 = null;
        java.io.Writer writer13 = com.google.gson.internal.Streams.writerForAppendable(appendable12);
        com.google.gson.stream.JsonWriter jsonWriter14 = new com.google.gson.stream.JsonWriter(writer13);
        com.google.gson.stream.JsonWriter jsonWriter15 = new com.google.gson.stream.JsonWriter(writer13);
        com.google.gson.stream.JsonWriter jsonWriter16 = new com.google.gson.stream.JsonWriter(writer13);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((com.google.gson.JsonElement) jsonObject11, jsonWriter16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strEntrySet9);
        org.junit.Assert.assertNotNull(jsonObject10);
        org.junit.Assert.assertNotNull(jsonObject11);
        org.junit.Assert.assertNotNull(writer13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> atomicIntegerTypeAdapter1 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER;
        boolean boolean2 = jsonArray0.equals((java.lang.Object) atomicIntegerTypeAdapter1);
        com.google.gson.JsonNull jsonNull3 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson4 = new com.google.gson.Gson();
        boolean boolean5 = gson4.htmlSafe();
        com.google.gson.internal.Excluder excluder6 = gson4.excluder();
        com.google.gson.internal.Excluder excluder7 = excluder6.excludeFieldsWithoutExposeAnnotation();
        boolean boolean8 = jsonNull3.equals((java.lang.Object) excluder6);
        com.google.gson.internal.Excluder excluder9 = excluder6.disableInnerClassSerialization();
        boolean boolean10 = jsonArray0.equals((java.lang.Object) excluder6);
        org.junit.Assert.assertNotNull(atomicIntegerTypeAdapter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(excluder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(excluder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        com.google.gson.internal.Excluder excluder6 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy7 = null;
        com.google.gson.internal.Excluder excluder10 = excluder6.withExclusionStrategy(exclusionStrategy7, true, false);
        java.lang.String str11 = gson0.toJson((java.lang.Object) false);
        boolean boolean12 = gson0.htmlSafe();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy13 = gson0.fieldNamingStrategy();
        java.lang.reflect.Field field14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = fieldNamingStrategy13.translateName(field14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(excluder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "false" + "'", str11, "false");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldNamingStrategy13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.stream.JsonWriter jsonWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter7, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        boolean boolean6 = jsonElement5.isJsonPrimitive();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.google.gson.internal.JsonReaderInternalAccess jsonReaderInternalAccess0 = com.google.gson.internal.JsonReaderInternalAccess.INSTANCE;
        com.google.gson.Gson gson1 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement2 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader3 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement2);
        java.lang.String str4 = gson1.toJson((java.lang.Object) jsonElement2);
        java.lang.String str6 = gson1.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter7 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson1);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter8 = objectTypeAdapter7.nullSafe();
        com.google.gson.JsonObject jsonObject9 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader10 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject9);
        com.google.gson.stream.JsonToken jsonToken11 = jsonTreeReader10.peek();
        java.lang.Object obj12 = objectTypeAdapter7.read((com.google.gson.stream.JsonReader) jsonTreeReader10);
        boolean boolean13 = jsonTreeReader10.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonReaderInternalAccess0.promoteNameToValue((com.google.gson.stream.JsonReader) jsonTreeReader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NAME but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonReaderInternalAccess0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter8);
        org.junit.Assert.assertTrue("'" + jsonToken11 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken11.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.IDENTITY;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        java.lang.reflect.Field field4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = reflectiveTypeAdapterFactory3.excludeField(field4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.IDENTITY;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        java.lang.reflect.Field field4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = fieldNamingPolicy1.translateName(field4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.Object obj3 = null;
        com.google.gson.JsonElement jsonElement4 = gson0.toJsonTree(obj3);
        com.google.gson.internal.Excluder excluder5 = gson0.excluder();
        java.lang.reflect.Field field6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = excluder5.excludeField(field6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(excluder5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy3 = null;
        com.google.gson.internal.Excluder excluder6 = excluder2.withExclusionStrategy(exclusionStrategy3, true, false);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory7 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        java.lang.reflect.Field field8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = fieldNamingPolicy1.translateName(field8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.internal.bind.TimeTypeAdapter timeTypeAdapter7 = new com.google.gson.internal.bind.TimeTypeAdapter();
        com.google.gson.TypeAdapter<java.sql.Time> timeTypeAdapter8 = timeTypeAdapter7.nullSafe();
        java.sql.Time time9 = null;
        java.lang.String str10 = timeTypeAdapter8.toJson(time9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement11 = autoCloseableArrayTypeAdapter6.toJsonTree((java.lang.Object) timeTypeAdapter8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(timeTypeAdapter8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        java.lang.String str13 = objectTypeAdapter6.toJson((java.lang.Object) "{\"out\":{\"currentWrite\":{}},\"stack\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"stackSize\":1,\"separator\":\":\",\"lenient\":false,\"htmlSafe\":true,\"serializeNulls\":true}");
        com.google.gson.JsonElement jsonElement14 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader15 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement14);
        jsonTreeReader15.close();
        jsonTreeReader15.setLenient(false);
        java.lang.String str19 = jsonTreeReader15.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"{\\\"out\\\":{\\\"currentWrite\\\":{}},\\\"stack\\\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\\\"stackSize\\\":1,\\\"separator\\\":\\\":\\\",\\\"lenient\\\":false,\\\"htmlSafe\\\":true,\\\"serializeNulls\\\":true}\"" + "'", str13, "\"{\\\"out\\\":{\\\"currentWrite\\\":{}},\\\"stack\\\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\\\"stackSize\\\":1,\\\"separator\\\":\\\":\\\",\\\"lenient\\\":false,\\\"htmlSafe\\\":true,\\\"serializeNulls\\\":true}\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "JsonTreeReader" + "'", str19, "JsonTreeReader");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        com.google.gson.JsonNull jsonNull1 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        com.google.gson.internal.Excluder excluder5 = excluder4.excludeFieldsWithoutExposeAnnotation();
        boolean boolean6 = jsonNull1.equals((java.lang.Object) excluder4);
        java.lang.Number number7 = numberTypeAdapter0.fromJsonTree((com.google.gson.JsonElement) jsonNull1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = jsonNull1.getAsNumber();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNull");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(number7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter12 = objectTypeAdapter6.nullSafe();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertNotNull(objTypeAdapter12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        boolean boolean12 = jsonTreeReader9.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = jsonTreeReader9.nextDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonNull jsonNull7 = new com.google.gson.JsonNull();
        boolean boolean9 = jsonNull7.equals((java.lang.Object) (byte) 10);
        com.google.gson.JsonNull jsonNull10 = jsonNull7.getAsJsonNull();
        com.google.gson.JsonElement jsonElement11 = objectTypeAdapter6.toJsonTree((java.lang.Object) jsonNull10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = jsonNull10.getAsBigInteger();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNull");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNull10);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        boolean boolean7 = gson0.htmlSafe();
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter8 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.FieldNamingStrategy fieldNamingStrategy9 = gson0.fieldNamingStrategy();
        java.lang.reflect.Field field10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = fieldNamingStrategy9.translateName(field10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(fieldNamingStrategy9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        com.google.gson.internal.Excluder excluder3 = excluder2.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder4 = excluder2.disableInnerClassSerialization();
        com.google.gson.ExclusionStrategy exclusionStrategy5 = null;
        com.google.gson.internal.Excluder excluder8 = excluder2.withExclusionStrategy(exclusionStrategy5, false, true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder3);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.IDENTITY;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        java.lang.reflect.Field field4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = reflectiveTypeAdapterFactory3.excludeField(field4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        com.google.gson.JsonPrimitive jsonPrimitive4 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean5 = jsonPrimitive4.isString();
        boolean boolean6 = jsonPrimitive4.isNumber();
        java.lang.String str7 = gson0.toJson((com.google.gson.JsonElement) jsonPrimitive4);
        java.lang.String str8 = gson0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.String str7 = gson0.toString();
        java.lang.Appendable appendable8 = null;
        java.io.Writer writer9 = com.google.gson.internal.Streams.writerForAppendable(appendable8);
        com.google.gson.stream.JsonWriter jsonWriter10 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.stream.JsonWriter jsonWriter11 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.stream.JsonWriter jsonWriter12 = gson0.newJsonWriter(writer9);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = gson0.newJsonWriter(writer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        boolean boolean7 = gson0.htmlSafe();
        com.google.gson.Gson gson8 = new com.google.gson.Gson();
        boolean boolean9 = gson8.htmlSafe();
        java.lang.String str10 = gson8.toString();
        boolean boolean11 = gson8.serializeNulls();
        com.google.gson.internal.Excluder excluder12 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy13 = null;
        com.google.gson.internal.Excluder excluder16 = excluder12.withExclusionStrategy(exclusionStrategy13, true, false);
        java.lang.String str17 = gson8.toJson((java.lang.Object) excluder12);
        java.lang.Appendable appendable18 = null;
        java.io.Writer writer19 = com.google.gson.internal.Streams.writerForAppendable(appendable18);
        com.google.gson.stream.JsonWriter jsonWriter20 = new com.google.gson.stream.JsonWriter(writer19);
        jsonWriter20.setHtmlSafe(true);
        jsonWriter20.flush();
        jsonWriter20.flush();
        boolean boolean25 = jsonWriter20.isHtmlSafe();
        java.lang.Class<?> wildcardClass26 = jsonWriter20.getClass();
        java.lang.Appendable appendable27 = null;
        java.io.Writer writer28 = com.google.gson.internal.Streams.writerForAppendable(appendable27);
        com.google.gson.stream.JsonWriter jsonWriter29 = new com.google.gson.stream.JsonWriter(writer28);
        com.google.gson.stream.JsonWriter jsonWriter30 = new com.google.gson.stream.JsonWriter(writer28);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) excluder12, (java.lang.reflect.Type) wildcardClass26, (java.lang.Appendable) writer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(excluder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str17, "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNotNull(writer19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(writer28);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter8 = gson0.newJsonWriter(writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.String str7 = gson0.toString();
        java.lang.Appendable appendable8 = null;
        java.io.Writer writer9 = com.google.gson.internal.Streams.writerForAppendable(appendable8);
        com.google.gson.stream.JsonWriter jsonWriter10 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.stream.JsonWriter jsonWriter11 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.stream.JsonWriter jsonWriter12 = gson0.newJsonWriter(writer9);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter13 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = objectTypeAdapter13.fromJson(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        com.google.gson.stream.JsonWriter jsonWriter9 = new com.google.gson.stream.JsonWriter(writer8);
        jsonWriter9.setHtmlSafe(true);
        jsonWriter9.flush();
        jsonWriter9.flush();
        com.google.gson.JsonPrimitive jsonPrimitive15 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean16 = jsonPrimitive15.isString();
        boolean boolean17 = jsonPrimitive15.isNumber();
        boolean boolean18 = jsonPrimitive15.isBoolean();
        java.lang.String str19 = jsonPrimitive15.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter9, (java.lang.Object) str19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.String str7 = gson0.toString();
        java.lang.Appendable appendable8 = null;
        java.io.Writer writer9 = com.google.gson.internal.Streams.writerForAppendable(appendable8);
        com.google.gson.stream.JsonWriter jsonWriter10 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.stream.JsonWriter jsonWriter11 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.stream.JsonWriter jsonWriter12 = gson0.newJsonWriter(writer9);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter13 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.math.BigDecimal> bigDecimalTypeAdapter14 = com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL;
        java.lang.String str15 = objectTypeAdapter13.toJson((java.lang.Object) bigDecimalTypeAdapter14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer9);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(bigDecimalTypeAdapter14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        com.google.gson.stream.JsonWriter jsonWriter9 = new com.google.gson.stream.JsonWriter(writer8);
        com.google.gson.stream.JsonWriter jsonWriter10 = new com.google.gson.stream.JsonWriter(writer8);
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonWriter10.name("hi!");
        jsonWriter12.setHtmlSafe(true);
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter12, obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Nesting problem.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(writer8);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonPrimitive jsonPrimitive8 = new com.google.gson.JsonPrimitive((java.lang.Number) 10.0f);
        boolean boolean9 = jsonPrimitive8.isNumber();
        com.google.gson.JsonElement jsonElement10 = objectTypeAdapter6.toJsonTree((java.lang.Object) boolean9);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter11 = objectTypeAdapter6.nullSafe();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(objTypeAdapter11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.String str7 = gson0.toString();
        java.lang.Appendable appendable8 = null;
        java.io.Writer writer9 = com.google.gson.internal.Streams.writerForAppendable(appendable8);
        com.google.gson.stream.JsonWriter jsonWriter10 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.stream.JsonWriter jsonWriter11 = new com.google.gson.stream.JsonWriter(writer9);
        com.google.gson.stream.JsonWriter jsonWriter12 = gson0.newJsonWriter(writer9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter14 = jsonWriter12.value((long) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer9);
        org.junit.Assert.assertNotNull(jsonWriter12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonNull jsonNull7 = new com.google.gson.JsonNull();
        boolean boolean9 = jsonNull7.equals((java.lang.Object) (byte) 10);
        com.google.gson.JsonNull jsonNull10 = jsonNull7.getAsJsonNull();
        com.google.gson.JsonElement jsonElement11 = objectTypeAdapter6.toJsonTree((java.lang.Object) jsonNull10);
        com.google.gson.Gson gson12 = new com.google.gson.Gson();
        boolean boolean13 = gson12.htmlSafe();
        com.google.gson.internal.Excluder excluder14 = gson12.excluder();
        com.google.gson.internal.Excluder excluder15 = excluder14.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder16 = excluder15.excludeFieldsWithoutExposeAnnotation();
        java.lang.String str17 = objectTypeAdapter6.toJson((java.lang.Object) excluder16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonNull10);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(excluder14);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertNotNull(excluder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":true,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str17, "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":true,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.google.gson.JsonPrimitive jsonPrimitive1 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean2 = jsonPrimitive1.isNumber();
        com.google.gson.JsonArray jsonArray3 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive5 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean6 = jsonPrimitive5.isString();
        boolean boolean7 = jsonPrimitive5.isBoolean();
        boolean boolean8 = jsonArray3.contains((com.google.gson.JsonElement) jsonPrimitive5);
        boolean boolean9 = jsonPrimitive1.equals((java.lang.Object) jsonArray3);
        int int10 = jsonArray3.size();
        int int11 = jsonArray3.size();
        com.google.gson.Gson gson12 = new com.google.gson.Gson();
        boolean boolean13 = gson12.htmlSafe();
        com.google.gson.internal.Excluder excluder14 = gson12.excluder();
        com.google.gson.internal.Excluder excluder15 = excluder14.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder16 = excluder14.disableInnerClassSerialization();
        int[] intArray18 = new int[] { 'h' };
        com.google.gson.internal.Excluder excluder19 = excluder16.withModifiers(intArray18);
        boolean boolean20 = jsonArray3.equals((java.lang.Object) excluder19);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal21 = jsonArray3.getAsBigDecimal();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(excluder14);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertNotNull(excluder16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[104]");
        org.junit.Assert.assertNotNull(excluder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.internal.Excluder excluder4 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy5 = null;
        com.google.gson.internal.Excluder excluder8 = excluder4.withExclusionStrategy(exclusionStrategy5, true, false);
        java.lang.String str9 = gson0.toJson((java.lang.Object) excluder4);
        boolean boolean10 = gson0.htmlSafe();
        boolean boolean11 = gson0.serializeNulls();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy12 = gson0.fieldNamingStrategy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str9, "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fieldNamingStrategy12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter3 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonIOException jsonIOException7 = new com.google.gson.JsonIOException("hi!");
        com.google.gson.stream.MalformedJsonException malformedJsonException8 = new com.google.gson.stream.MalformedJsonException("com.google.gson.JsonSyntaxException: hi!", (java.lang.Throwable) jsonIOException7);
        com.google.gson.stream.MalformedJsonException malformedJsonException9 = new com.google.gson.stream.MalformedJsonException((java.lang.Throwable) jsonIOException7);
        com.google.gson.stream.MalformedJsonException malformedJsonException10 = new com.google.gson.stream.MalformedJsonException("com.google.gson.stream.MalformedJsonException: com.google.gson.JsonSyntaxException: hi!", (java.lang.Throwable) malformedJsonException9);
        java.lang.String str11 = objectTypeAdapter3.toJson((java.lang.Object) malformedJsonException10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{\"detailMessage\":\"com.google.gson.stream.MalformedJsonException: com.google.gson.JsonSyntaxException: hi!\",\"cause\":{\"detailMessage\":null,\"cause\":{\"detailMessage\":\"hi!\",\"stackTrace\":[],\"suppressedExceptions\":[]},\"stackTrace\":[],\"suppressedExceptions\":[]},\"stackTrace\":[],\"suppressedExceptions\":[]}" + "'", str11, "{\"detailMessage\":\"com.google.gson.stream.MalformedJsonException: com.google.gson.JsonSyntaxException: hi!\",\"cause\":{\"detailMessage\":null,\"cause\":{\"detailMessage\":\"hi!\",\"stackTrace\":[],\"suppressedExceptions\":[]},\"stackTrace\":[],\"suppressedExceptions\":[]},\"stackTrace\":[],\"suppressedExceptions\":[]}");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter7 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter7.nullValue();
        jsonTreeWriter7.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter7.value((long) (short) -1);
        jsonTreeWriter7.flush();
        com.google.gson.stream.JsonWriter jsonWriter14 = jsonTreeWriter7.value((long) (byte) 10);
        com.google.gson.JsonPrimitive jsonPrimitive16 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean17 = jsonPrimitive16.isNumber();
        boolean boolean18 = jsonPrimitive16.isString();
        char char19 = jsonPrimitive16.getAsCharacter();
        java.lang.String str20 = jsonPrimitive16.getAsString();
        boolean boolean21 = jsonPrimitive16.isNumber();
        java.lang.String str22 = jsonPrimitive16.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write(jsonWriter14, (java.lang.Object) str22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + 'h' + "'", char19 == 'h');
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.google.gson.JsonObject jsonObject0 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject0);
        jsonObject0.addProperty("com.google.gson.JsonSyntaxException: hi!", "");
        com.google.gson.Gson gson5 = new com.google.gson.Gson();
        boolean boolean6 = gson5.htmlSafe();
        java.lang.String str7 = gson5.toString();
        java.lang.String str8 = gson5.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory9 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement10 = gson5.toJsonTree((java.lang.Object) typeAdapterFactory9);
        com.google.gson.internal.Excluder excluder11 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy12 = null;
        com.google.gson.internal.Excluder excluder15 = excluder11.withExclusionStrategy(exclusionStrategy12, true, false);
        java.lang.String str16 = gson5.toJson((java.lang.Object) false);
        boolean boolean17 = gson5.htmlSafe();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy18 = gson5.fieldNamingStrategy();
        boolean boolean19 = jsonObject0.equals((java.lang.Object) gson5);
        jsonObject0.addProperty("{\"out\":{\"currentWrite\":{}},\"stack\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"stackSize\":1,\"separator\":\":\",\"lenient\":false,\"htmlSafe\":true,\"serializeNulls\":true}", (java.lang.Number) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory9);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "false" + "'", str16, "false");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldNamingStrategy18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        com.google.gson.JsonNull jsonNull1 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        com.google.gson.internal.Excluder excluder5 = excluder4.excludeFieldsWithoutExposeAnnotation();
        boolean boolean6 = jsonNull1.equals((java.lang.Object) excluder4);
        java.lang.Number number7 = numberTypeAdapter0.fromJsonTree((com.google.gson.JsonElement) jsonNull1);
        com.google.gson.JsonElement jsonElement9 = numberTypeAdapter0.toJsonTree((java.lang.Number) 100L);
        char char10 = jsonElement9.getAsCharacter();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '1' + "'", char10 == '1');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy3 = null;
        com.google.gson.internal.Excluder excluder6 = excluder2.withExclusionStrategy(exclusionStrategy3, true, false);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory7 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        com.google.gson.internal.Excluder excluder8 = excluder2.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder10 = excluder8.withVersion((double) '4');
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertNotNull(excluder10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.google.gson.internal.bind.SqlDateTypeAdapter sqlDateTypeAdapter0 = new com.google.gson.internal.bind.SqlDateTypeAdapter();
        com.google.gson.TypeAdapter<java.sql.Date> dateTypeAdapter1 = sqlDateTypeAdapter0.nullSafe();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement3 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader4 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement3);
        java.lang.String str5 = gson2.toJson((java.lang.Object) jsonElement3);
        java.lang.String str7 = gson2.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter8 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson2);
        boolean boolean9 = gson2.htmlSafe();
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter10 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson2);
        com.google.gson.JsonPrimitive jsonPrimitive12 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean13 = jsonPrimitive12.isNumber();
        com.google.gson.JsonArray jsonArray14 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive16 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean17 = jsonPrimitive16.isString();
        boolean boolean18 = jsonPrimitive16.isBoolean();
        boolean boolean19 = jsonArray14.contains((com.google.gson.JsonElement) jsonPrimitive16);
        boolean boolean20 = jsonPrimitive12.equals((java.lang.Object) jsonArray14);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader21 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonPrimitive12);
        java.lang.Object obj22 = objectTypeAdapter10.read((com.google.gson.stream.JsonReader) jsonTreeReader21);
        // The following exception was thrown during execution in test generation
        try {
            java.sql.Date date23 = sqlDateTypeAdapter0.read((com.google.gson.stream.JsonReader) jsonTreeReader21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected STRING but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTypeAdapter1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "4" + "'", obj22, "4");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        boolean boolean12 = jsonTreeReader9.isLenient();
        com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader9.peek();
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement14 = com.google.gson.internal.Streams.parse((com.google.gson.stream.JsonReader) jsonTreeReader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.google.gson.stream.JsonToken.END_DOCUMENT + "'", jsonToken13.equals(com.google.gson.stream.JsonToken.END_DOCUMENT));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        boolean boolean12 = jsonTreeReader9.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jsonTreeReader9.nextInt();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter8 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter9 = objTypeAdapter8.nullSafe();
        com.google.gson.JsonNull jsonNull10 = new com.google.gson.JsonNull();
        boolean boolean12 = jsonNull10.equals((java.lang.Object) (byte) 10);
        com.google.gson.JsonNull jsonNull13 = jsonNull10.getAsJsonNull();
        java.lang.Object obj14 = objTypeAdapter9.fromJsonTree((com.google.gson.JsonElement) jsonNull13);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = jsonNull13.getAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JsonNull");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertNotNull(objTypeAdapter8);
        org.junit.Assert.assertNotNull(objTypeAdapter9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jsonNull13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        boolean boolean12 = jsonTreeReader9.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader9.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected END_OBJECT but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonPrimitive jsonPrimitive9 = new com.google.gson.JsonPrimitive((java.lang.Number) 0.0d);
        boolean boolean10 = jsonPrimitive9.getAsBoolean();
        java.lang.Object obj11 = objTypeAdapter7.fromJsonTree((com.google.gson.JsonElement) jsonPrimitive9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0d + "'", obj11, 0.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.FLOAT;
        com.google.gson.Gson gson1 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement2 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader3 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement2);
        java.lang.String str4 = gson1.toJson((java.lang.Object) jsonElement2);
        java.lang.String str6 = gson1.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter7 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson1);
        boolean boolean8 = gson1.htmlSafe();
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter9 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson1);
        com.google.gson.JsonPrimitive jsonPrimitive11 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean12 = jsonPrimitive11.isNumber();
        com.google.gson.JsonArray jsonArray13 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive15 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean16 = jsonPrimitive15.isString();
        boolean boolean17 = jsonPrimitive15.isBoolean();
        boolean boolean18 = jsonArray13.contains((com.google.gson.JsonElement) jsonPrimitive15);
        boolean boolean19 = jsonPrimitive11.equals((java.lang.Object) jsonArray13);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader20 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonPrimitive11);
        java.lang.Object obj21 = objectTypeAdapter9.read((com.google.gson.stream.JsonReader) jsonTreeReader20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = numberTypeAdapter0.read((com.google.gson.stream.JsonReader) jsonTreeReader20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "4" + "'", obj21, "4");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator1 = jsonArray0.spliterator();
        jsonArray0.add("{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        com.google.gson.JsonObject jsonObject4 = new com.google.gson.JsonObject();
        com.google.gson.JsonArray jsonArray6 = jsonObject4.getAsJsonArray("JsonTreeReader");
        com.google.gson.JsonElement jsonElement8 = jsonObject4.get("com.google.gson.stream.MalformedJsonException: com.google.gson.JsonSyntaxException: hi!");
        jsonObject4.addProperty("", (java.lang.Number) (short) 1);
        com.google.gson.JsonElement jsonElement13 = jsonObject4.get("\"4\"");
        boolean boolean14 = jsonArray0.equals((java.lang.Object) jsonElement13);
        com.google.gson.JsonPrimitive jsonPrimitive16 = new com.google.gson.JsonPrimitive((java.lang.Number) 10.0f);
        byte byte17 = jsonPrimitive16.getAsByte();
        boolean boolean18 = jsonArray0.contains((com.google.gson.JsonElement) jsonPrimitive16);
        com.google.gson.JsonPrimitive jsonPrimitive21 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean22 = jsonPrimitive21.isNumber();
        com.google.gson.JsonArray jsonArray23 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive25 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean26 = jsonPrimitive25.isString();
        boolean boolean27 = jsonPrimitive25.isBoolean();
        boolean boolean28 = jsonArray23.contains((com.google.gson.JsonElement) jsonPrimitive25);
        boolean boolean29 = jsonPrimitive21.equals((java.lang.Object) jsonArray23);
        int int30 = jsonArray23.size();
        int int31 = jsonArray23.size();
        com.google.gson.Gson gson32 = new com.google.gson.Gson();
        boolean boolean33 = gson32.htmlSafe();
        com.google.gson.internal.Excluder excluder34 = gson32.excluder();
        com.google.gson.internal.Excluder excluder35 = excluder34.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder36 = excluder34.disableInnerClassSerialization();
        int[] intArray38 = new int[] { 'h' };
        com.google.gson.internal.Excluder excluder39 = excluder36.withModifiers(intArray38);
        boolean boolean40 = jsonArray23.equals((java.lang.Object) excluder39);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement41 = jsonArray0.set((int) 'h', (com.google.gson.JsonElement) jsonArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 104, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElementSpliterator1);
        org.junit.Assert.assertNull(jsonArray6);
        org.junit.Assert.assertNull(jsonElement8);
        org.junit.Assert.assertNull(jsonElement13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(excluder34);
        org.junit.Assert.assertNotNull(excluder35);
        org.junit.Assert.assertNotNull(excluder36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[104]");
        org.junit.Assert.assertNotNull(excluder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        com.google.gson.internal.Excluder excluder6 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy7 = null;
        com.google.gson.internal.Excluder excluder10 = excluder6.withExclusionStrategy(exclusionStrategy7, true, false);
        java.lang.String str11 = gson0.toJson((java.lang.Object) false);
        boolean boolean12 = gson0.htmlSafe();
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter13 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = objectTypeAdapter13.fromJson(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(excluder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "false" + "'", str11, "false");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter3 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        java.lang.reflect.Type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.Gson gson6 = gson0.fromJson("\"4\"", type5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        java.lang.String str13 = objectTypeAdapter6.toJson((java.lang.Object) "{\"out\":{\"currentWrite\":{}},\"stack\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"stackSize\":1,\"separator\":\":\",\"lenient\":false,\"htmlSafe\":true,\"serializeNulls\":true}");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter14 = com.google.gson.internal.bind.TypeAdapters.NUMBER;
        java.lang.Number number15 = null;
        com.google.gson.JsonElement jsonElement16 = numberTypeAdapter14.toJsonTree(number15);
        java.lang.String str17 = objectTypeAdapter6.toJson((java.lang.Object) jsonElement16);
        java.lang.Appendable appendable18 = null;
        java.io.Writer writer19 = com.google.gson.internal.Streams.writerForAppendable(appendable18);
        java.io.Writer writer20 = com.google.gson.internal.Streams.writerForAppendable(appendable18);
        com.google.gson.stream.JsonWriter jsonWriter21 = new com.google.gson.stream.JsonWriter(writer20);
        com.google.gson.JsonPrimitive jsonPrimitive23 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        double double24 = jsonPrimitive23.getAsDouble();
        boolean boolean25 = jsonPrimitive23.isBoolean();
        java.lang.Number number26 = jsonPrimitive23.getAsNumber();
        // The following exception was thrown during execution in test generation
        try {
            objectTypeAdapter6.toJson(writer20, (java.lang.Object) jsonPrimitive23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"{\\\"out\\\":{\\\"currentWrite\\\":{}},\\\"stack\\\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\\\"stackSize\\\":1,\\\"separator\\\":\\\":\\\",\\\"lenient\\\":false,\\\"htmlSafe\\\":true,\\\"serializeNulls\\\":true}\"" + "'", str13, "\"{\\\"out\\\":{\\\"currentWrite\\\":{}},\\\"stack\\\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\\\"stackSize\\\":1,\\\"separator\\\":\\\":\\\",\\\"lenient\\\":false,\\\"htmlSafe\\\":true,\\\"serializeNulls\\\":true}\"");
        org.junit.Assert.assertNotNull(numberTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(writer19);
        org.junit.Assert.assertNotNull(writer20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(number26);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter7 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter8 = jsonTreeWriter7.nullValue();
        jsonTreeWriter7.flush();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter7.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter13 = jsonTreeWriter7.value((java.lang.Boolean) true);
        java.lang.Object obj14 = null;
        autoCloseableArrayTypeAdapter6.write((com.google.gson.stream.JsonWriter) jsonTreeWriter7, obj14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter7.endObject();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(jsonWriter8);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter1 = com.google.gson.internal.bind.TypeAdapters.NUMBER;
        java.lang.Number number2 = null;
        com.google.gson.JsonElement jsonElement3 = numberTypeAdapter1.toJsonTree(number2);
        java.lang.Appendable appendable4 = null;
        java.io.Writer writer5 = com.google.gson.internal.Streams.writerForAppendable(appendable4);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson(jsonElement3, (java.lang.Appendable) writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberTypeAdapter1);
        org.junit.Assert.assertNotNull(jsonElement3);
        org.junit.Assert.assertNotNull(writer5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter4 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonNull jsonNull5 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson6 = new com.google.gson.Gson();
        boolean boolean7 = gson6.htmlSafe();
        com.google.gson.internal.Excluder excluder8 = gson6.excluder();
        com.google.gson.internal.Excluder excluder9 = excluder8.excludeFieldsWithoutExposeAnnotation();
        boolean boolean10 = jsonNull5.equals((java.lang.Object) excluder8);
        java.lang.reflect.Type type11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonElement jsonElement12 = gson0.toJsonTree((java.lang.Object) boolean10, type11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertNotNull(excluder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.JsonElement jsonElement7 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader8 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement7);
        jsonTreeReader8.close();
        jsonTreeReader8.setLenient(false);
        java.lang.String str12 = jsonTreeReader8.toString();
        boolean boolean13 = jsonTreeReader8.isLenient();
        boolean boolean14 = jsonTreeReader8.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = autoCloseableArrayTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JsonReader is closed");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JsonTreeReader" + "'", str12, "JsonTreeReader");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter8 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter10 = jsonTreeWriter8.value("null");
        com.google.gson.JsonIOException jsonIOException13 = new com.google.gson.JsonIOException("hi!");
        com.google.gson.JsonParseException jsonParseException14 = new com.google.gson.JsonParseException((java.lang.Throwable) jsonIOException13);
        java.lang.Throwable[] throwableArray15 = jsonIOException13.getSuppressed();
        com.google.gson.JsonSyntaxException jsonSyntaxException16 = new com.google.gson.JsonSyntaxException("{\"out\":{\"currentWrite\":{}},\"stack\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"stackSize\":1,\"separator\":\":\",\"lenient\":false,\"htmlSafe\":true,\"serializeNulls\":true}", (java.lang.Throwable) jsonIOException13);
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.write((com.google.gson.stream.JsonWriter) jsonTreeWriter8, (java.lang.Object) "{\"out\":{\"currentWrite\":{}},\"stack\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"stackSize\":1,\"separator\":\":\",\"lenient\":false,\"htmlSafe\":true,\"serializeNulls\":true}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertNotNull(jsonWriter10);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        com.google.gson.internal.Excluder excluder6 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy7 = null;
        com.google.gson.internal.Excluder excluder10 = excluder6.withExclusionStrategy(exclusionStrategy7, true, false);
        java.lang.String str11 = gson0.toJson((java.lang.Object) false);
        boolean boolean12 = gson0.htmlSafe();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy13 = gson0.fieldNamingStrategy();
        boolean boolean14 = gson0.htmlSafe();
        com.google.gson.JsonPrimitive jsonPrimitive16 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean17 = jsonPrimitive16.isNumber();
        com.google.gson.JsonArray jsonArray18 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive20 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean21 = jsonPrimitive20.isString();
        boolean boolean22 = jsonPrimitive20.isBoolean();
        boolean boolean23 = jsonArray18.contains((com.google.gson.JsonElement) jsonPrimitive20);
        boolean boolean24 = jsonPrimitive16.equals((java.lang.Object) jsonArray18);
        com.google.gson.JsonPrimitive jsonPrimitive26 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        float float27 = jsonPrimitive26.getAsFloat();
        short short28 = jsonPrimitive26.getAsShort();
        boolean boolean29 = jsonArray18.contains((com.google.gson.JsonElement) jsonPrimitive26);
        java.lang.Appendable appendable30 = null;
        java.io.Writer writer31 = com.google.gson.internal.Streams.writerForAppendable(appendable30);
        java.io.Writer writer32 = com.google.gson.internal.Streams.writerForAppendable(appendable30);
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) jsonPrimitive26, appendable30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertNotNull(excluder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "false" + "'", str11, "false");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fieldNamingStrategy13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 4.0f + "'", float27 == 4.0f);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 4 + "'", short28 == (short) 4);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertNotNull(writer32);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.internal.Excluder excluder7 = gson0.excluder();
        com.google.gson.JsonPrimitive jsonPrimitive9 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean10 = jsonPrimitive9.isNumber();
        com.google.gson.JsonArray jsonArray11 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive13 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean14 = jsonPrimitive13.isString();
        boolean boolean15 = jsonPrimitive13.isBoolean();
        boolean boolean16 = jsonArray11.contains((com.google.gson.JsonElement) jsonPrimitive13);
        boolean boolean17 = jsonPrimitive9.equals((java.lang.Object) jsonArray11);
        int int18 = jsonArray11.size();
        int int19 = jsonArray11.size();
        com.google.gson.Gson gson20 = new com.google.gson.Gson();
        boolean boolean21 = gson20.htmlSafe();
        com.google.gson.internal.Excluder excluder22 = gson20.excluder();
        com.google.gson.internal.Excluder excluder23 = excluder22.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder24 = excluder22.disableInnerClassSerialization();
        int[] intArray26 = new int[] { 'h' };
        com.google.gson.internal.Excluder excluder27 = excluder24.withModifiers(intArray26);
        boolean boolean28 = jsonArray11.equals((java.lang.Object) excluder27);
        com.google.gson.Gson gson29 = new com.google.gson.Gson();
        boolean boolean30 = gson29.htmlSafe();
        com.google.gson.internal.Excluder excluder31 = gson29.excluder();
        int[] intArray37 = new int[] { 10, (byte) 10, 10, ' ', (short) 100 };
        com.google.gson.internal.Excluder excluder38 = excluder31.withModifiers(intArray37);
        com.google.gson.internal.Excluder excluder39 = excluder27.withModifiers(intArray37);
        com.google.gson.internal.Excluder excluder40 = excluder7.withModifiers(intArray37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(excluder7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(excluder22);
        org.junit.Assert.assertNotNull(excluder23);
        org.junit.Assert.assertNotNull(excluder24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[104]");
        org.junit.Assert.assertNotNull(excluder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(excluder31);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10, 10, 10, 32, 100]");
        org.junit.Assert.assertNotNull(excluder38);
        org.junit.Assert.assertNotNull(excluder39);
        org.junit.Assert.assertNotNull(excluder40);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.JsonPrimitive jsonPrimitive9 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        float float10 = jsonPrimitive9.getAsFloat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = autoCloseableArrayTypeAdapter6.fromJsonTree((com.google.gson.JsonElement) jsonPrimitive9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected BEGIN_ARRAY but was STRING");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 4.0f + "'", float10 == 4.0f);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.google.gson.JsonObject jsonObject0 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader1 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject0);
        jsonObject0.addProperty("com.google.gson.JsonSyntaxException: hi!", "");
        com.google.gson.Gson gson5 = new com.google.gson.Gson();
        boolean boolean6 = gson5.htmlSafe();
        java.lang.String str7 = gson5.toString();
        java.lang.String str8 = gson5.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory9 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement10 = gson5.toJsonTree((java.lang.Object) typeAdapterFactory9);
        com.google.gson.internal.Excluder excluder11 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy12 = null;
        com.google.gson.internal.Excluder excluder15 = excluder11.withExclusionStrategy(exclusionStrategy12, true, false);
        java.lang.String str16 = gson5.toJson((java.lang.Object) false);
        boolean boolean17 = gson5.htmlSafe();
        com.google.gson.FieldNamingStrategy fieldNamingStrategy18 = gson5.fieldNamingStrategy();
        boolean boolean19 = jsonObject0.equals((java.lang.Object) gson5);
        com.google.gson.FieldNamingStrategy fieldNamingStrategy20 = gson5.fieldNamingStrategy();
        java.io.Writer writer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.stream.JsonWriter jsonWriter22 = gson5.newJsonWriter(writer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory9);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "false" + "'", str16, "false");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(fieldNamingStrategy18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(fieldNamingStrategy20);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.Gson gson7 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement8 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement8);
        java.lang.String str10 = gson7.toJson((java.lang.Object) jsonElement8);
        java.lang.String str12 = gson7.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter13 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson7);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter14 = objectTypeAdapter13.nullSafe();
        java.lang.String str15 = gson0.toJson((java.lang.Object) objectTypeAdapter13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null" + "'", str10, "null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\"gson\":{\"calls\":{\"threadLocalHashCode\":719997541},\"typeTokenCache\":{\"java.lang.Integer\":{}},\"factories\":[null,null,{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]},null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,{\"constructorConstructor\":{\"instanceCreators\":{}}},{\"constructorConstructor\":{\"instanceCreators\":{}},\"complexMapKeySerialization\":false},{\"constructorConstructor\":{\"instanceCreators\":{}}},null,{\"constructorConstructor\":{\"instanceCreators\":{}},\"fieldNamingPolicy\":\"IDENTITY\",\"excluder\":{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}}],\"constructorConstructor\":{\"instanceCreators\":{}},\"excluder\":{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]},\"fieldNamingStrategy\":\"IDENTITY\",\"serializeNulls\":false,\"htmlSafe\":true,\"generateNonExecutableJson\":false,\"prettyPrinting\":false,\"lenient\":false}}" + "'", str15, "{\"gson\":{\"calls\":{\"threadLocalHashCode\":719997541},\"typeTokenCache\":{\"java.lang.Integer\":{}},\"factories\":[null,null,{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]},null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,{\"constructorConstructor\":{\"instanceCreators\":{}}},{\"constructorConstructor\":{\"instanceCreators\":{}},\"complexMapKeySerialization\":false},{\"constructorConstructor\":{\"instanceCreators\":{}}},null,{\"constructorConstructor\":{\"instanceCreators\":{}},\"fieldNamingPolicy\":\"IDENTITY\",\"excluder\":{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}}],\"constructorConstructor\":{\"instanceCreators\":{}},\"excluder\":{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]},\"fieldNamingStrategy\":\"IDENTITY\",\"serializeNulls\":false,\"htmlSafe\":true,\"generateNonExecutableJson\":false,\"prettyPrinting\":false,\"lenient\":false}}");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.google.gson.internal.JsonReaderInternalAccess jsonReaderInternalAccess0 = com.google.gson.internal.JsonReaderInternalAccess.INSTANCE;
        com.google.gson.internal.JsonReaderInternalAccess.INSTANCE = jsonReaderInternalAccess0;
        com.google.gson.internal.JsonReaderInternalAccess.INSTANCE = jsonReaderInternalAccess0;
        com.google.gson.Gson gson3 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement4 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader5 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement4);
        java.lang.String str6 = gson3.toJson((java.lang.Object) jsonElement4);
        java.lang.String str8 = gson3.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter9 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson3);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter10 = objectTypeAdapter9.nullSafe();
        com.google.gson.JsonObject jsonObject11 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader12 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject11);
        com.google.gson.stream.JsonToken jsonToken13 = jsonTreeReader12.peek();
        java.lang.Object obj14 = objectTypeAdapter9.read((com.google.gson.stream.JsonReader) jsonTreeReader12);
        boolean boolean15 = jsonTreeReader12.isLenient();
        com.google.gson.stream.JsonToken jsonToken16 = jsonTreeReader12.peek();
        // The following exception was thrown during execution in test generation
        try {
            jsonReaderInternalAccess0.promoteNameToValue((com.google.gson.stream.JsonReader) jsonTreeReader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NAME but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonReaderInternalAccess0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null" + "'", str6, "null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter10);
        org.junit.Assert.assertTrue("'" + jsonToken13 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken13.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{}");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + jsonToken16 + "' != '" + com.google.gson.stream.JsonToken.END_DOCUMENT + "'", jsonToken16.equals(com.google.gson.stream.JsonToken.END_DOCUMENT));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        java.lang.String str13 = objectTypeAdapter6.toJson((java.lang.Object) "{\"out\":{\"currentWrite\":{}},\"stack\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"stackSize\":1,\"separator\":\":\",\"lenient\":false,\"htmlSafe\":true,\"serializeNulls\":true}");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter14 = com.google.gson.internal.bind.TypeAdapters.NUMBER;
        java.lang.Number number15 = null;
        com.google.gson.JsonElement jsonElement16 = numberTypeAdapter14.toJsonTree(number15);
        java.lang.String str17 = objectTypeAdapter6.toJson((java.lang.Object) jsonElement16);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '1');
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter20 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter21 = jsonTreeWriter20.nullValue();
        jsonTreeWriter20.flush();
        com.google.gson.stream.JsonWriter jsonWriter24 = jsonTreeWriter20.value((long) (short) -1);
        jsonTreeWriter20.flush();
        com.google.gson.stream.JsonWriter jsonWriter26 = jsonTreeWriter20.beginArray();
        com.google.gson.stream.JsonWriter jsonWriter27 = jsonTreeWriter20.beginArray();
        com.google.gson.internal.Streams.write((com.google.gson.JsonElement) jsonPrimitive19, jsonWriter27);
        short short29 = jsonPrimitive19.getAsShort();
        java.lang.Object obj30 = objectTypeAdapter6.fromJsonTree((com.google.gson.JsonElement) jsonPrimitive19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"{\\\"out\\\":{\\\"currentWrite\\\":{}},\\\"stack\\\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\\\"stackSize\\\":1,\\\"separator\\\":\\\":\\\",\\\"lenient\\\":false,\\\"htmlSafe\\\":true,\\\"serializeNulls\\\":true}\"" + "'", str13, "\"{\\\"out\\\":{\\\"currentWrite\\\":{}},\\\"stack\\\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\\\"stackSize\\\":1,\\\"separator\\\":\\\":\\\",\\\"lenient\\\":false,\\\"htmlSafe\\\":true,\\\"serializeNulls\\\":true}\"");
        org.junit.Assert.assertNotNull(numberTypeAdapter14);
        org.junit.Assert.assertNotNull(jsonElement16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null" + "'", str17, "null");
        org.junit.Assert.assertNotNull(jsonWriter21);
        org.junit.Assert.assertNotNull(jsonWriter24);
        org.junit.Assert.assertNotNull(jsonWriter26);
        org.junit.Assert.assertNotNull(jsonWriter27);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 1 + "'", short29 == (short) 1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "1" + "'", obj30, "1");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.IDENTITY;
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement3 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader4 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement3);
        java.lang.String str5 = gson2.toJson((java.lang.Object) jsonElement3);
        java.lang.String str7 = gson2.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter8 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson2);
        com.google.gson.Gson gson9 = new com.google.gson.Gson();
        boolean boolean10 = gson9.htmlSafe();
        java.lang.String str11 = gson9.toString();
        boolean boolean12 = gson9.serializeNulls();
        com.google.gson.internal.Excluder excluder13 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy14 = null;
        com.google.gson.internal.Excluder excluder17 = excluder13.withExclusionStrategy(exclusionStrategy14, true, false);
        java.lang.String str18 = gson9.toJson((java.lang.Object) excluder13);
        com.google.gson.JsonElement jsonElement19 = gson2.toJsonTree((java.lang.Object) excluder13);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory20 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder13);
        java.lang.reflect.Field field21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = reflectiveTypeAdapterFactory20.excludeField(field21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str18, "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNotNull(jsonElement19);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.Appendable appendable7 = null;
        java.io.Writer writer8 = com.google.gson.internal.Streams.writerForAppendable(appendable7);
        com.google.gson.stream.JsonWriter jsonWriter9 = new com.google.gson.stream.JsonWriter(writer8);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            autoCloseableArrayTypeAdapter6.toJson(writer8, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(writer8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.google.gson.internal.bind.DateTypeAdapter dateTypeAdapter0 = new com.google.gson.internal.bind.DateTypeAdapter();
        java.util.Date date1 = null;
        java.lang.String str2 = dateTypeAdapter0.toJson(date1);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter3 = dateTypeAdapter0.nullSafe();
        java.util.Date date4 = null;
        java.lang.String str5 = dateTypeAdapter3.toJson(date4);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter6 = dateTypeAdapter3.nullSafe();
        com.google.gson.Gson gson7 = new com.google.gson.Gson();
        boolean boolean8 = gson7.htmlSafe();
        java.lang.String str9 = gson7.toString();
        boolean boolean10 = gson7.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter11 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass12 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter13 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson7, autoCloseableTypeAdapter11, autoCloseableClass12);
        java.lang.Appendable appendable14 = null;
        java.io.Writer writer15 = com.google.gson.internal.Streams.writerForAppendable(appendable14);
        java.io.Writer writer16 = com.google.gson.internal.Streams.writerForAppendable(appendable14);
        com.google.gson.stream.JsonWriter jsonWriter17 = new com.google.gson.stream.JsonWriter(writer16);
        com.google.gson.stream.JsonWriter jsonWriter18 = gson7.newJsonWriter(writer16);
        java.util.Date date19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter3.toJson(writer16, date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null" + "'", str2, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(dateTypeAdapter6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(writer15);
        org.junit.Assert.assertNotNull(writer16);
        org.junit.Assert.assertNotNull(jsonWriter18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        com.google.gson.internal.Excluder excluder3 = excluder2.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder4 = excluder2.disableInnerClassSerialization();
        int[] intArray6 = new int[] { 'h' };
        com.google.gson.internal.Excluder excluder7 = excluder4.withModifiers(intArray6);
        com.google.gson.internal.Excluder excluder8 = excluder7.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder10 = excluder8.withVersion((double) (short) 0);
        com.google.gson.internal.Excluder excluder11 = excluder8.disableInnerClassSerialization();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder3);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[104]");
        org.junit.Assert.assertNotNull(excluder7);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertNotNull(excluder10);
        org.junit.Assert.assertNotNull(excluder11);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = autoCloseableArrayTypeAdapter6.toJson((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.IDENTITY;
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement3 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader4 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement3);
        java.lang.String str5 = gson2.toJson((java.lang.Object) jsonElement3);
        java.lang.String str7 = gson2.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter8 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson2);
        com.google.gson.Gson gson9 = new com.google.gson.Gson();
        boolean boolean10 = gson9.htmlSafe();
        java.lang.String str11 = gson9.toString();
        boolean boolean12 = gson9.serializeNulls();
        com.google.gson.internal.Excluder excluder13 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy14 = null;
        com.google.gson.internal.Excluder excluder17 = excluder13.withExclusionStrategy(exclusionStrategy14, true, false);
        java.lang.String str18 = gson9.toJson((java.lang.Object) excluder13);
        com.google.gson.JsonElement jsonElement19 = gson2.toJsonTree((java.lang.Object) excluder13);
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory20 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder13);
        java.lang.reflect.Field field21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = fieldNamingPolicy1.translateName(field21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str18, "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNotNull(jsonElement19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.google.gson.JsonNull jsonNull0 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson1 = new com.google.gson.Gson();
        boolean boolean2 = gson1.htmlSafe();
        com.google.gson.internal.Excluder excluder3 = gson1.excluder();
        com.google.gson.internal.Excluder excluder4 = excluder3.excludeFieldsWithoutExposeAnnotation();
        boolean boolean5 = jsonNull0.equals((java.lang.Object) excluder3);
        com.google.gson.internal.Excluder excluder6 = excluder3.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder8 = excluder3.withVersion((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(excluder3);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(excluder6);
        org.junit.Assert.assertNotNull(excluder8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.JsonArray jsonArray7 = new com.google.gson.JsonArray();
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> atomicIntegerTypeAdapter8 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER;
        boolean boolean9 = jsonArray7.equals((java.lang.Object) atomicIntegerTypeAdapter8);
        java.lang.reflect.Type type10 = null;
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter11 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter12 = jsonTreeWriter11.nullValue();
        jsonTreeWriter11.flush();
        com.google.gson.stream.JsonWriter jsonWriter15 = jsonTreeWriter11.value((long) (short) 10);
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonTreeWriter11.value((java.lang.Boolean) true);
        jsonTreeWriter11.close();
        // The following exception was thrown during execution in test generation
        try {
            gson0.toJson((java.lang.Object) atomicIntegerTypeAdapter8, type10, (com.google.gson.stream.JsonWriter) jsonTreeWriter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(atomicIntegerTypeAdapter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jsonWriter12);
        org.junit.Assert.assertNotNull(jsonWriter15);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        java.lang.Object obj7 = null;
        com.google.gson.JsonElement jsonElement8 = autoCloseableArrayTypeAdapter6.toJsonTree(obj7);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter9 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter10 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter11 = jsonTreeWriter10.nullValue();
        jsonWriter11.setSerializeNulls(true);
        jsonWriter11.setIndent("");
        com.google.gson.stream.JsonWriter jsonWriter17 = jsonWriter11.value(false);
        java.lang.Object obj18 = null;
        autoCloseableArrayTypeAdapter6.write(jsonWriter17, obj18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jsonElement8);
        org.junit.Assert.assertNotNull(objTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonWriter11);
        org.junit.Assert.assertNotNull(jsonWriter17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        java.lang.reflect.Type type8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.internal.bind.MapTypeAdapterFactory mapTypeAdapterFactory9 = gson0.fromJson("com.google.gson.stream.MalformedJsonException: com.google.gson.JsonSyntaxException: hi!", type8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BYTE;
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter1 = numberTypeAdapter0.nullSafe();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        java.lang.String str4 = gson2.toString();
        boolean boolean5 = gson2.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter6 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass7 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter8 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson2, autoCloseableTypeAdapter6, autoCloseableClass7);
        java.lang.String str9 = gson2.toString();
        java.lang.Appendable appendable10 = null;
        java.io.Writer writer11 = com.google.gson.internal.Streams.writerForAppendable(appendable10);
        com.google.gson.stream.JsonWriter jsonWriter12 = new com.google.gson.stream.JsonWriter(writer11);
        com.google.gson.stream.JsonWriter jsonWriter13 = new com.google.gson.stream.JsonWriter(writer11);
        com.google.gson.stream.JsonWriter jsonWriter14 = gson2.newJsonWriter(writer11);
        // The following exception was thrown during execution in test generation
        try {
            numberTypeAdapter0.toJson(writer11, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(numberTypeAdapter1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(jsonWriter14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        java.lang.String str13 = objectTypeAdapter6.toJson((java.lang.Object) "{\"out\":{\"currentWrite\":{}},\"stack\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"stackSize\":1,\"separator\":\":\",\"lenient\":false,\"htmlSafe\":true,\"serializeNulls\":true}");
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter14 = objectTypeAdapter6.nullSafe();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"{\\\"out\\\":{\\\"currentWrite\\\":{}},\\\"stack\\\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\\\"stackSize\\\":1,\\\"separator\\\":\\\":\\\",\\\"lenient\\\":false,\\\"htmlSafe\\\":true,\\\"serializeNulls\\\":true}\"" + "'", str13, "\"{\\\"out\\\":{\\\"currentWrite\\\":{}},\\\"stack\\\":[6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],\\\"stackSize\\\":1,\\\"separator\\\":\\\":\\\",\\\"lenient\\\":false,\\\"htmlSafe\\\":true,\\\"serializeNulls\\\":true}\"");
        org.junit.Assert.assertNotNull(objTypeAdapter14);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        int[] intArray8 = new int[] { 10, (byte) 10, 10, ' ', (short) 100 };
        com.google.gson.internal.Excluder excluder9 = excluder2.withModifiers(intArray8);
        com.google.gson.internal.Excluder excluder10 = excluder2.disableInnerClassSerialization();
        java.lang.reflect.Field field11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = excluder2.excludeField(field11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10, 10, 32, 100]");
        org.junit.Assert.assertNotNull(excluder9);
        org.junit.Assert.assertNotNull(excluder10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.Gson gson7 = new com.google.gson.Gson();
        boolean boolean8 = gson7.htmlSafe();
        java.lang.String str9 = gson7.toString();
        boolean boolean10 = gson7.serializeNulls();
        com.google.gson.internal.Excluder excluder11 = new com.google.gson.internal.Excluder();
        com.google.gson.ExclusionStrategy exclusionStrategy12 = null;
        com.google.gson.internal.Excluder excluder15 = excluder11.withExclusionStrategy(exclusionStrategy12, true, false);
        java.lang.String str16 = gson7.toJson((java.lang.Object) excluder11);
        com.google.gson.JsonElement jsonElement17 = gson0.toJsonTree((java.lang.Object) excluder11);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Number) 0.0d);
        java.lang.String str20 = gson0.toJson((com.google.gson.JsonElement) jsonPrimitive19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(excluder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}" + "'", str16, "{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        org.junit.Assert.assertNotNull(jsonElement17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0.0" + "'", str20, "0.0");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<com.google.gson.FieldNamingPolicy> fieldNamingPolicyTypeAdapter4 = null;
        java.lang.Class<com.google.gson.FieldNamingPolicy> fieldNamingPolicyClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<com.google.gson.FieldNamingPolicy> fieldNamingPolicyArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<com.google.gson.FieldNamingPolicy>(gson0, fieldNamingPolicyTypeAdapter4, fieldNamingPolicyClass5);
        java.lang.String str7 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter8 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass9 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter10 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter8, autoCloseableClass9);
        com.google.gson.internal.Excluder excluder11 = gson0.excluder();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter8 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter9 = objTypeAdapter8.nullSafe();
        com.google.gson.JsonArray jsonArray10 = new com.google.gson.JsonArray();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator11 = jsonArray10.spliterator();
        jsonArray10.add("{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        com.google.gson.JsonObject jsonObject14 = new com.google.gson.JsonObject();
        com.google.gson.JsonArray jsonArray16 = jsonObject14.getAsJsonArray("JsonTreeReader");
        com.google.gson.JsonElement jsonElement18 = jsonObject14.get("com.google.gson.stream.MalformedJsonException: com.google.gson.JsonSyntaxException: hi!");
        jsonObject14.addProperty("", (java.lang.Number) (short) 1);
        com.google.gson.JsonElement jsonElement23 = jsonObject14.get("\"4\"");
        boolean boolean24 = jsonArray10.equals((java.lang.Object) jsonElement23);
        com.google.gson.JsonPrimitive jsonPrimitive26 = new com.google.gson.JsonPrimitive((java.lang.Number) 10.0f);
        byte byte27 = jsonPrimitive26.getAsByte();
        boolean boolean28 = jsonArray10.contains((com.google.gson.JsonElement) jsonPrimitive26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = objTypeAdapter9.fromJsonTree((com.google.gson.JsonElement) jsonArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertNotNull(objTypeAdapter8);
        org.junit.Assert.assertNotNull(objTypeAdapter9);
        org.junit.Assert.assertNotNull(jsonElementSpliterator11);
        org.junit.Assert.assertNull(jsonArray16);
        org.junit.Assert.assertNull(jsonElement18);
        org.junit.Assert.assertNull(jsonElement23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 10 + "'", byte27 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        com.google.gson.JsonArray jsonArray9 = jsonObject7.getAsJsonArray("JsonTreeReader");
        com.google.gson.JsonElement jsonElement11 = jsonObject7.get("com.google.gson.stream.MalformedJsonException: com.google.gson.JsonSyntaxException: hi!");
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> strEntrySet12 = jsonObject7.entrySet();
        com.google.gson.JsonElement jsonElement14 = jsonObject7.remove("{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        com.google.gson.JsonElement jsonElement16 = jsonObject7.remove("");
        com.google.gson.JsonElement jsonElement18 = jsonObject7.get("\"hi!\"");
        java.lang.String str19 = gson0.toJson(jsonElement18);
        com.google.gson.FieldNamingStrategy fieldNamingStrategy20 = gson0.fieldNamingStrategy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jsonArray9);
        org.junit.Assert.assertNull(jsonElement11);
        org.junit.Assert.assertNotNull(strEntrySet12);
        org.junit.Assert.assertNull(jsonElement14);
        org.junit.Assert.assertNull(jsonElement16);
        org.junit.Assert.assertNull(jsonElement18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null" + "'", str19, "null");
        org.junit.Assert.assertNotNull(fieldNamingStrategy20);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        com.google.gson.JsonPrimitive jsonPrimitive4 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean5 = jsonPrimitive4.isString();
        boolean boolean6 = jsonPrimitive4.isNumber();
        java.lang.String str7 = gson0.toJson((com.google.gson.JsonElement) jsonPrimitive4);
        com.google.gson.FieldNamingStrategy fieldNamingStrategy8 = gson0.fieldNamingStrategy();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertNotNull(fieldNamingStrategy8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.FieldNamingStrategy fieldNamingStrategy7 = gson0.fieldNamingStrategy();
        com.google.gson.Gson gson8 = new com.google.gson.Gson();
        boolean boolean9 = gson8.htmlSafe();
        com.google.gson.internal.Excluder excluder10 = gson8.excluder();
        com.google.gson.internal.Excluder excluder11 = excluder10.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.JsonElement jsonElement12 = gson0.toJsonTree((java.lang.Object) excluder10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fieldNamingStrategy7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(excluder10);
        org.junit.Assert.assertNotNull(excluder11);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.google.gson.internal.ConstructorConstructor constructorConstructor0 = null;
        com.google.gson.FieldNamingPolicy fieldNamingPolicy1 = com.google.gson.FieldNamingPolicy.IDENTITY;
        com.google.gson.internal.Excluder excluder2 = new com.google.gson.internal.Excluder();
        com.google.gson.internal.bind.ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(constructorConstructor0, (com.google.gson.FieldNamingStrategy) fieldNamingPolicy1, excluder2);
        com.google.gson.internal.Excluder excluder4 = excluder2.disableInnerClassSerialization();
        org.junit.Assert.assertNotNull(fieldNamingPolicy1);
        org.junit.Assert.assertNotNull(excluder4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.google.gson.JsonPrimitive jsonPrimitive1 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean2 = jsonPrimitive1.isNumber();
        com.google.gson.JsonArray jsonArray3 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive5 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean6 = jsonPrimitive5.isString();
        boolean boolean7 = jsonPrimitive5.isBoolean();
        boolean boolean8 = jsonArray3.contains((com.google.gson.JsonElement) jsonPrimitive5);
        boolean boolean9 = jsonPrimitive1.equals((java.lang.Object) jsonArray3);
        int int10 = jsonArray3.size();
        int int11 = jsonArray3.size();
        java.util.Spliterator<com.google.gson.JsonElement> jsonElementSpliterator12 = jsonArray3.spliterator();
        com.google.gson.JsonNull jsonNull13 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson14 = new com.google.gson.Gson();
        boolean boolean15 = gson14.htmlSafe();
        com.google.gson.internal.Excluder excluder16 = gson14.excluder();
        com.google.gson.internal.Excluder excluder17 = excluder16.excludeFieldsWithoutExposeAnnotation();
        boolean boolean18 = jsonNull13.equals((java.lang.Object) excluder16);
        boolean boolean19 = jsonArray3.contains((com.google.gson.JsonElement) jsonNull13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(jsonElementSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(excluder16);
        org.junit.Assert.assertNotNull(excluder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        int[] intArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.internal.Excluder excluder4 = excluder2.withModifiers(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = objectTypeAdapter6.nullSafe();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader9 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject8);
        com.google.gson.stream.JsonToken jsonToken10 = jsonTreeReader9.peek();
        java.lang.Object obj11 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader9);
        boolean boolean12 = jsonTreeReader9.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            jsonTreeReader9.promoteNameToValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NAME but was END_DOCUMENT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertTrue("'" + jsonToken10 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken10.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "{}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "{}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "{}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        boolean boolean6 = gson0.htmlSafe();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(typeAdapterFactory4);
        org.junit.Assert.assertNotNull(jsonElement5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.Object obj3 = null;
        com.google.gson.JsonElement jsonElement4 = gson0.toJsonTree(obj3);
        boolean boolean5 = gson0.htmlSafe();
        com.google.gson.JsonIOException jsonIOException8 = new com.google.gson.JsonIOException("hi!");
        com.google.gson.stream.MalformedJsonException malformedJsonException9 = new com.google.gson.stream.MalformedJsonException("com.google.gson.JsonSyntaxException: hi!", (java.lang.Throwable) jsonIOException8);
        com.google.gson.stream.MalformedJsonException malformedJsonException10 = new com.google.gson.stream.MalformedJsonException((java.lang.Throwable) jsonIOException8);
        java.lang.Throwable[] throwableArray11 = malformedJsonException10.getSuppressed();
        java.lang.String str12 = gson0.toJson((java.lang.Object) malformedJsonException10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\"cause\":{\"detailMessage\":\"hi!\",\"stackTrace\":[],\"suppressedExceptions\":[]},\"stackTrace\":[],\"suppressedExceptions\":[]}" + "'", str12, "{\"cause\":{\"detailMessage\":\"hi!\",\"stackTrace\":[],\"suppressedExceptions\":[]},\"stackTrace\":[],\"suppressedExceptions\":[]}");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        com.google.gson.JsonNull jsonNull1 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        com.google.gson.internal.Excluder excluder5 = excluder4.excludeFieldsWithoutExposeAnnotation();
        boolean boolean6 = jsonNull1.equals((java.lang.Object) excluder4);
        java.lang.Number number7 = numberTypeAdapter0.fromJsonTree((com.google.gson.JsonElement) jsonNull1);
        com.google.gson.JsonElement jsonElement9 = numberTypeAdapter0.toJsonTree((java.lang.Number) 100L);
        boolean boolean10 = jsonElement9.isJsonObject();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter8 = objTypeAdapter7.nullSafe();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
        org.junit.Assert.assertNotNull(objTypeAdapter8);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        com.google.gson.JsonNull jsonNull1 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        com.google.gson.internal.Excluder excluder5 = excluder4.excludeFieldsWithoutExposeAnnotation();
        boolean boolean6 = jsonNull1.equals((java.lang.Object) excluder4);
        java.lang.Number number7 = numberTypeAdapter0.fromJsonTree((com.google.gson.JsonElement) jsonNull1);
        com.google.gson.Gson gson8 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement9 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader10 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement9);
        java.lang.String str11 = gson8.toJson((java.lang.Object) jsonElement9);
        boolean boolean12 = jsonNull1.equals((java.lang.Object) jsonElement9);
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null" + "'", str11, "null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.TypeAdapter<java.lang.Object> objTypeAdapter7 = autoCloseableArrayTypeAdapter6.nullSafe();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objTypeAdapter7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.FieldNamingStrategy fieldNamingStrategy7 = gson0.fieldNamingStrategy();
        com.google.gson.JsonObject jsonObject8 = new com.google.gson.JsonObject();
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> strEntrySet9 = jsonObject8.entrySet();
        java.lang.String str10 = jsonObject8.toString();
        java.lang.reflect.Type type11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.JsonNull jsonNull12 = gson0.fromJson((com.google.gson.JsonElement) jsonObject8, type11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fieldNamingStrategy7);
        org.junit.Assert.assertNotNull(strEntrySet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "{}" + "'", str10, "{}");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        com.google.gson.JsonNull jsonNull1 = new com.google.gson.JsonNull();
        com.google.gson.Gson gson2 = new com.google.gson.Gson();
        boolean boolean3 = gson2.htmlSafe();
        com.google.gson.internal.Excluder excluder4 = gson2.excluder();
        com.google.gson.internal.Excluder excluder5 = excluder4.excludeFieldsWithoutExposeAnnotation();
        boolean boolean6 = jsonNull1.equals((java.lang.Object) excluder4);
        java.lang.Number number7 = numberTypeAdapter0.fromJsonTree((com.google.gson.JsonElement) jsonNull1);
        com.google.gson.JsonElement jsonElement9 = numberTypeAdapter0.toJsonTree((java.lang.Number) 100L);
        com.google.gson.JsonObject jsonObject10 = new com.google.gson.JsonObject();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader11 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonObject10);
        com.google.gson.stream.JsonToken jsonToken12 = jsonTreeReader11.peek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = numberTypeAdapter0.read((com.google.gson.stream.JsonReader) jsonTreeReader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NUMBER but was BEGIN_OBJECT");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(excluder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(number7);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertTrue("'" + jsonToken12 + "' != '" + com.google.gson.stream.JsonToken.BEGIN_OBJECT + "'", jsonToken12.equals(com.google.gson.stream.JsonToken.BEGIN_OBJECT));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonPrimitive jsonPrimitive8 = new com.google.gson.JsonPrimitive((java.lang.Number) 10.0f);
        boolean boolean9 = jsonPrimitive8.isNumber();
        com.google.gson.JsonElement jsonElement10 = objectTypeAdapter6.toJsonTree((java.lang.Object) boolean9);
        com.google.gson.internal.bind.DateTypeAdapter dateTypeAdapter11 = new com.google.gson.internal.bind.DateTypeAdapter();
        java.util.Date date12 = null;
        java.lang.String str13 = dateTypeAdapter11.toJson(date12);
        java.util.Date date14 = null;
        java.lang.String str15 = dateTypeAdapter11.toJson(date14);
        com.google.gson.JsonNull jsonNull16 = new com.google.gson.JsonNull();
        boolean boolean18 = jsonNull16.equals((java.lang.Object) (byte) 10);
        com.google.gson.JsonNull jsonNull19 = jsonNull16.getAsJsonNull();
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader20 = new com.google.gson.internal.bind.JsonTreeReader((com.google.gson.JsonElement) jsonNull16);
        java.util.Date date21 = dateTypeAdapter11.read((com.google.gson.stream.JsonReader) jsonTreeReader20);
        jsonTreeReader20.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null" + "'", str3, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null" + "'", str13, "null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null" + "'", str15, "null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jsonNull19);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        com.google.gson.internal.Excluder excluder2 = gson0.excluder();
        com.google.gson.internal.Excluder excluder3 = excluder2.excludeFieldsWithoutExposeAnnotation();
        com.google.gson.internal.Excluder excluder4 = excluder2.disableInnerClassSerialization();
        int[] intArray6 = new int[] { 'h' };
        com.google.gson.internal.Excluder excluder7 = excluder4.withModifiers(intArray6);
        com.google.gson.internal.Excluder excluder8 = excluder7.disableInnerClassSerialization();
        com.google.gson.internal.Excluder excluder10 = excluder8.withVersion((double) (short) 0);
        com.google.gson.internal.Excluder excluder12 = excluder8.withVersion((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(excluder2);
        org.junit.Assert.assertNotNull(excluder3);
        org.junit.Assert.assertNotNull(excluder4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[104]");
        org.junit.Assert.assertNotNull(excluder7);
        org.junit.Assert.assertNotNull(excluder8);
        org.junit.Assert.assertNotNull(excluder10);
        org.junit.Assert.assertNotNull(excluder12);
    }
}
