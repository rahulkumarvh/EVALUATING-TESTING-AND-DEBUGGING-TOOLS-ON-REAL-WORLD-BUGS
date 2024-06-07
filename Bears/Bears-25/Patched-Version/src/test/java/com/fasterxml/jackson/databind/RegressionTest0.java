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
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        java.lang.Class<?> wildcardClass5 = objJsonSerializer2.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objJsonSerializer0.serializeWithType((java.lang.Object) false, jsonGenerator4, serializerProvider5, typeSerializer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = objJsonSerializer9.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) nameTransformer12, jsonGenerator14, serializerProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = objJsonSerializer6.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) '#', jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer6.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer8.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = objJsonSerializer11.unwrappingSerializer(nameTransformer12);
        java.lang.Class<?> wildcardClass14 = objJsonSerializer11.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = objJsonSerializer10.withFilterId((java.lang.Object) objJsonSerializer11);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) objJsonSerializer10, jsonGenerator16, serializerProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer15);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = objJsonSerializer2.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.lang.Class<?> wildcardClass2 = stringKeySerializer0.getClass();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) "hi!", jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) ' ', jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = objJsonSerializer10.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = objJsonSerializer15.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = objJsonSerializer17.unwrappingSerializer(nameTransformer18);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = objJsonSerializer17.unwrappingSerializer(nameTransformer20);
        boolean boolean22 = objJsonSerializer14.isEmpty((java.lang.Object) objJsonSerializer21);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator23 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) boolean22, jsonGenerator23, serializerProvider24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(objJsonSerializer19);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Object obj10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj10, jsonGenerator11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.lang.Object obj2 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator3 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj2, jsonGenerator3, serializerProvider4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer6.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = objJsonSerializer11.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer14 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = objJsonSerializer11.unwrappingSerializer(nameTransformer14);
        boolean boolean16 = objJsonSerializer8.isEmpty((java.lang.Object) objJsonSerializer15);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) boolean16, jsonGenerator17, serializerProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) 0.0f, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = objJsonSerializer2.getDelegatee();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic6 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator7 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objJsonSerializer2.serializeWithType((java.lang.Object) dynamic6, jsonGenerator7, serializerProvider8, typeSerializer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer2.replaceDelegatee(objJsonSerializer5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<?> wildcardClass1 = stringKeySerializer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        boolean boolean12 = dynamic0.usesObjectId();
        java.lang.Object obj13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj13, jsonGenerator14, serializerProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor15 = objJsonSerializer14.properties();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serializeWithType((java.lang.Object) objJsonSerializer14, jsonGenerator16, serializerProvider17, typeSerializer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(propertyWriterItor15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = objJsonSerializer14.unwrappingSerializer(nameTransformer15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = objJsonSerializer14.unwrappingSerializer(nameTransformer17);
        boolean boolean19 = objJsonSerializer11.isEmpty((java.lang.Object) objJsonSerializer18);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator20 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) objJsonSerializer18, jsonGenerator20, serializerProvider21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
        org.junit.Assert.assertNotNull(objJsonSerializer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = objJsonSerializer2.getDelegatee();
        boolean boolean6 = objJsonSerializer2.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer7);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = objJsonSerializer7.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = objJsonSerializer2.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer2.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer6.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer8.unwrappingSerializer(nameTransformer9);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer2.replaceDelegatee(objJsonSerializer8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = objJsonSerializer4.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer4.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) objJsonSerializer7, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.fasterxml.jackson.databind.ser.std.StdKeySerializer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) (byte) 0, jsonGenerator16, serializerProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass11 = stringKeySerializer10.handledType();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator12 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) stringKeySerializer10, jsonGenerator12, serializerProvider13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer2.unwrappingSerializer(nameTransformer5);
        java.lang.Class<?> wildcardClass7 = objJsonSerializer6.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider8 = null;
        java.lang.Throwable throwable9 = null;
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider8, throwable9, obj10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = objJsonSerializer11.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = wildcardJsonSerializer11.getDelegatee();
        java.lang.Class<?> wildcardClass13 = wildcardJsonSerializer11.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) 10.0d, jsonGenerator11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        java.lang.Class<?> wildcardClass18 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = wildcardJsonSerializer11.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = wildcardJsonSerializer12.properties();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        java.lang.Class<?> wildcardClass15 = objJsonSerializer12.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = objJsonSerializer11.withFilterId((java.lang.Object) objJsonSerializer12);
        java.lang.Class<?> wildcardClass17 = objJsonSerializer11.getClass();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) objJsonSerializer11, jsonGenerator18, serializerProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.fasterxml.jackson.databind.ser.std.StdKeySerializer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = objJsonSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer0.withFilterId((java.lang.Object) nameTransformer5);
        java.lang.Class<?> wildcardClass8 = wildcardJsonSerializer7.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = dynamic0.getDelegatee();
        java.lang.Object obj12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj12, jsonGenerator13, serializerProvider14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = objJsonSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = objJsonSerializer0.withFilterId((java.lang.Object) (-1.0d));
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = wildcardJsonSerializer4.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator16 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) 1.0d, jsonGenerator16, serializerProvider17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        java.lang.Object obj8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj8, jsonGenerator9, serializerProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = wildcardJsonSerializer4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = objJsonSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer0.withFilterId((java.lang.Object) nameTransformer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = wildcardJsonSerializer7.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        boolean boolean10 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        java.lang.Object obj12 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator13 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider14 = null;
        com.fasterxml.jackson.databind.jsontype.TypeSerializer typeSerializer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serializeWithType(obj12, jsonGenerator13, serializerProvider14, typeSerializer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer6.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = objJsonSerializer6.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = null;
        boolean boolean7 = objJsonSerializer4.isEmpty(serializerProvider5, obj6);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer8.unwrappingSerializer(nameTransformer9);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = objJsonSerializer10.properties();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = objJsonSerializer4.replaceDelegatee(objJsonSerializer10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stringKeySerializer0.withFilterId(obj1);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) (byte) 100, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = dynamic0.getDelegatee();
        java.lang.Class<?> wildcardClass12 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        org.junit.Assert.assertNotNull(objClass10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer6.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = wildcardJsonSerializer7.isUnwrappingSerializer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stringKeySerializer0.withFilterId(obj1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer3 = stringKeySerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNull(wildcardJsonSerializer3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        java.lang.Object obj16 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj16, jsonGenerator17, serializerProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.withFilterId((java.lang.Object) '4');
        java.lang.Object obj5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj5, jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = objJsonSerializer2.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer2.unwrappingSerializer(nameTransformer4);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer2.unwrappingSerializer(nameTransformer6);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor20 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor20);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator2 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj1, jsonGenerator2, serializerProvider3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        boolean boolean13 = dynamic0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass14 = dynamic0.handledType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objClass14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer2.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = objJsonSerializer1.unwrappingSerializer(nameTransformer2);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer1.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = objJsonSerializer1.withFilterId((java.lang.Object) nameTransformer6);
        boolean boolean9 = objJsonSerializer0.isEmpty((java.lang.Object) nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer0.unwrappingSerializer(nameTransformer10);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer2.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer6.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        boolean boolean13 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer0.isUnwrappingSerializer();
        boolean boolean4 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stringKeySerializer0.withFilterId(obj1);
        java.lang.Object obj3 = new java.lang.Object();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj3, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        boolean boolean10 = dynamic0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = objJsonSerializer16.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer20 = objJsonSerializer16.withFilterId((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) wildcardJsonSerializer20, jsonGenerator21, serializerProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
        org.junit.Assert.assertNotNull(objJsonSerializer18);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = objJsonSerializer2.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer2.unwrappingSerializer(nameTransformer4);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor6 = objJsonSerializer5.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(propertyWriterItor6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer6.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer9 = objJsonSerializer6.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = objJsonSerializer6.getDelegatee();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize((java.lang.Object) objJsonSerializer6, jsonGenerator11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: com.fasterxml.jackson.databind.ser.std.StdKeySerializer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNull(wildcardJsonSerializer9);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stringKeySerializer0.withFilterId(obj1);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        boolean boolean10 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper22, javaType23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.getDelegatee();
        boolean boolean5 = stringKeySerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = dynamic0.getDelegatee();
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic19 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic19.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        boolean boolean23 = dynamic19.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = dynamic19.unwrappingSerializer(nameTransformer24);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = dynamic0.replaceDelegatee(objJsonSerializer25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer25);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass17 = dynamic0.handledType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertNotNull(objClass17);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = objJsonSerializer0.withFilterId((java.lang.Object) (-1.0d));
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = wildcardJsonSerializer4.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer0.isUnwrappingSerializer();
        boolean boolean4 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = objJsonSerializer0.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = objJsonSerializer1.unwrappingSerializer(nameTransformer2);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer1.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = objJsonSerializer1.withFilterId((java.lang.Object) nameTransformer6);
        boolean boolean9 = objJsonSerializer0.isEmpty((java.lang.Object) nameTransformer6);
        boolean boolean10 = objJsonSerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor3 = objJsonSerializer0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer0.withFilterId((java.lang.Object) nameTransformer5);
        java.lang.Class<?> wildcardClass8 = objJsonSerializer0.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(propertyWriterItor3);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = objJsonSerializer6.usesObjectId();
        boolean boolean8 = objJsonSerializer6.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer6.unwrappingSerializer(nameTransformer9);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        boolean boolean12 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic13 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic13.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        boolean boolean17 = dynamic13.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode21 = dynamic13.getSchema(serializerProvider18, (java.lang.reflect.Type) wildcardClass20);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        dynamic13.acceptJsonFormatVisitor(jsonFormatVisitorWrapper22, javaType23);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        dynamic13.acceptJsonFormatVisitor(jsonFormatVisitorWrapper25, javaType26);
        boolean boolean28 = dynamic13.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        dynamic13.acceptJsonFormatVisitor(jsonFormatVisitorWrapper29, javaType30);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        dynamic13.acceptJsonFormatVisitor(jsonFormatVisitorWrapper32, javaType33);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = dynamic13.unwrappingSerializer(nameTransformer35);
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer37 = dynamic0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) dynamic13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(jsonNode21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.withFilterId((java.lang.Object) '4');
        boolean boolean5 = stringKeySerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        boolean boolean1 = objJsonSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        java.lang.Object obj10 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator11 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj10, jsonGenerator11, serializerProvider12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic10.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        boolean boolean14 = dynamic10.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = dynamic10.unwrappingSerializer(nameTransformer15);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        dynamic10.acceptJsonFormatVisitor(jsonFormatVisitorWrapper17, javaType18);
        boolean boolean20 = dynamic10.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic10.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator24 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) dynamic10, jsonGenerator24, serializerProvider25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        java.lang.Object obj13 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator14 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj13, jsonGenerator14, serializerProvider15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        boolean boolean24 = dynamic0.isUnwrappingSerializer();
        boolean boolean25 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = dynamic0.unwrappingSerializer(nameTransformer22);
        java.lang.Class<?> wildcardClass24 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic18 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic18.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        dynamic18.acceptJsonFormatVisitor(jsonFormatVisitorWrapper22, javaType23);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        dynamic18.acceptJsonFormatVisitor(jsonFormatVisitorWrapper25, javaType26);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = dynamic18.unwrappingSerializer(nameTransformer28);
        java.lang.Class<java.lang.Object> objClass30 = dynamic18.handledType();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer31 = dynamic0.replaceDelegatee((com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) dynamic18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objJsonSerializer29);
        org.junit.Assert.assertNotNull(objClass30);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = dynamic0.unwrappingSerializer(nameTransformer13);
        java.lang.Class<?> wildcardClass15 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        java.lang.Class<?> wildcardClass4 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer7);
        java.lang.Class<?> wildcardClass12 = wildcardJsonSerializer11.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer4 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = objJsonSerializer0.unwrappingSerializer(nameTransformer4);
        java.lang.Class<?> wildcardClass6 = objJsonSerializer0.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        boolean boolean10 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<?> wildcardClass10 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer2.unwrappingSerializer(nameTransformer5);
        boolean boolean7 = objJsonSerializer2.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        boolean boolean12 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<?> wildcardClass15 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator21 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) "", jsonGenerator21, serializerProvider22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = objJsonSerializer4.properties();
        java.lang.Class<?> wildcardClass8 = objJsonSerializer4.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer0.isUnwrappingSerializer();
        boolean boolean4 = objJsonSerializer0.usesObjectId();
        boolean boolean5 = objJsonSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        boolean boolean13 = dynamic0.usesObjectId();
        boolean boolean14 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = objJsonSerializer15.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer18 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = objJsonSerializer17.unwrappingSerializer(nameTransformer18);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = objJsonSerializer19.unwrappingSerializer(nameTransformer20);
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator22 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) objJsonSerializer21, jsonGenerator22, serializerProvider23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertNotNull(objJsonSerializer19);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider13 = null;
        java.lang.reflect.Type type14 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode16 = dynamic0.getSchema(serializerProvider13, type14, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(jsonNode16);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = dynamic0.getDelegatee();
        java.lang.Class<java.lang.Object> objClass14 = dynamic0.handledType();
        boolean boolean15 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
        org.junit.Assert.assertNotNull(objClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = dynamic0.getSchema(serializerProvider11, type12, true);
        java.lang.Class<?> wildcardClass15 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = dynamic0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.withFilterId((java.lang.Object) '4');
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor5 = stringKeySerializer0.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(propertyWriterItor5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = null;
        boolean boolean7 = objJsonSerializer4.isEmpty(serializerProvider5, obj6);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = objJsonSerializer4.properties();
        boolean boolean9 = objJsonSerializer4.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.Throwable throwable19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = objJsonSerializer20.unwrappingSerializer(nameTransformer21);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = objJsonSerializer22.unwrappingSerializer(nameTransformer23);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = objJsonSerializer24.unwrappingSerializer(nameTransformer25);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer27 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer28 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer29 = objJsonSerializer27.unwrappingSerializer(nameTransformer28);
        java.lang.Class<?> wildcardClass30 = objJsonSerializer27.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer31 = objJsonSerializer26.withFilterId((java.lang.Object) objJsonSerializer27);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer32 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer33 = objJsonSerializer27.unwrappingSerializer(nameTransformer32);
        boolean boolean34 = objJsonSerializer33.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer35 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer36 = objJsonSerializer33.unwrappingSerializer(nameTransformer35);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor37 = objJsonSerializer36.properties();
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider18, throwable19, (java.lang.Object) objJsonSerializer36, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
        org.junit.Assert.assertNotNull(objJsonSerializer24);
        org.junit.Assert.assertNotNull(objJsonSerializer26);
        org.junit.Assert.assertNotNull(objJsonSerializer27);
        org.junit.Assert.assertNotNull(objJsonSerializer29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer31);
        org.junit.Assert.assertNotNull(objJsonSerializer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer36);
        org.junit.Assert.assertNotNull(propertyWriterItor37);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper3 = null;
        com.fasterxml.jackson.databind.JavaType javaType4 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper3, javaType4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        boolean boolean2 = dynamic0.usesObjectId();
        boolean boolean3 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        java.lang.Class<java.lang.Object> objClass12 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<?> wildcardClass16 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer21 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer22 = dynamic0.unwrappingSerializer(nameTransformer21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertNotNull(objJsonSerializer22);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = objJsonSerializer7.unwrappingSerializer(nameTransformer12);
        boolean boolean14 = objJsonSerializer13.isUnwrappingSerializer();
        boolean boolean15 = objJsonSerializer13.isUnwrappingSerializer();
        boolean boolean16 = objJsonSerializer13.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor22 = dynamic0.properties();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        java.lang.reflect.Type type24 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode25 = dynamic0.getSchema(serializerProvider23, type24);
        java.lang.Class<?> wildcardClass26 = jsonNode25.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor22);
        org.junit.Assert.assertNotNull(jsonNode25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper22, javaType23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        java.lang.Class<java.lang.Object> objClass12 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.lang.Class<?> wildcardClass19 = dynamic0.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objClass12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer2.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer2.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = wildcardJsonSerializer7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        java.lang.Throwable throwable11 = null;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider10, throwable11, obj12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper24, javaType25);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper27, javaType28);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer30 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertNull(wildcardJsonSerializer30);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer4.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer4.unwrappingSerializer(nameTransformer9);
        java.lang.Object obj11 = null;
        boolean boolean12 = objJsonSerializer10.isEmpty(obj11);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer7.unwrappingSerializer(nameTransformer10);
        boolean boolean12 = objJsonSerializer4.isEmpty((java.lang.Object) objJsonSerializer11);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer13 = objJsonSerializer11.getDelegatee();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = dynamic0.unwrappingSerializer(nameTransformer3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj3, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        boolean boolean12 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj3, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = dynamic0.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer15 = dynamic0.replaceDelegatee(objJsonSerializer14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        boolean boolean1 = dynamic0.isUnwrappingSerializer();
        boolean boolean2 = dynamic0.usesObjectId();
        java.lang.Class<?> wildcardClass3 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = objJsonSerializer1.unwrappingSerializer(nameTransformer2);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer1.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = objJsonSerializer1.withFilterId((java.lang.Object) nameTransformer6);
        boolean boolean9 = objJsonSerializer0.isEmpty((java.lang.Object) nameTransformer6);
        boolean boolean10 = objJsonSerializer0.usesObjectId();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        boolean boolean10 = dynamic0.usesObjectId();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor16 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stringKeySerializer0.withFilterId(obj1);
        java.lang.Object obj3 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator4 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj3, jsonGenerator4, serializerProvider5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        boolean boolean18 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer12.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = objJsonSerializer14.unwrappingSerializer(nameTransformer15);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer17 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer18 = objJsonSerializer16.unwrappingSerializer(nameTransformer17);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer19 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = objJsonSerializer19.unwrappingSerializer(nameTransformer20);
        java.lang.Class<?> wildcardClass22 = objJsonSerializer19.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer23 = objJsonSerializer18.withFilterId((java.lang.Object) objJsonSerializer19);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer24 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer25 = objJsonSerializer19.unwrappingSerializer(nameTransformer24);
        boolean boolean26 = objJsonSerializer25.isUnwrappingSerializer();
        boolean boolean27 = objJsonSerializer25.isUnwrappingSerializer();
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator28 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize((java.lang.Object) objJsonSerializer25, jsonGenerator28, serializerProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
        org.junit.Assert.assertNotNull(objJsonSerializer18);
        org.junit.Assert.assertNotNull(objJsonSerializer19);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer23);
        org.junit.Assert.assertNotNull(objJsonSerializer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        boolean boolean5 = objJsonSerializer2.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        java.lang.Object obj7 = null;
        boolean boolean8 = objJsonSerializer2.isEmpty(serializerProvider6, obj7);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        boolean boolean12 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor20 = dynamic0.properties();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer21 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor20);
        org.junit.Assert.assertNull(wildcardJsonSerializer21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        boolean boolean16 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper17, javaType18);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor11 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(propertyWriterItor11);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stringKeySerializer0.withFilterId(obj1);
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        java.lang.Object obj4 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator5 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider6 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj4, jsonGenerator5, serializerProvider6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = dynamic0.unwrappingSerializer(nameTransformer23);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer25 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer26 = dynamic0.unwrappingSerializer(nameTransformer25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(objJsonSerializer24);
        org.junit.Assert.assertNotNull(objJsonSerializer26);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer19 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer20 = dynamic0.unwrappingSerializer(nameTransformer19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(objJsonSerializer20);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = dynamic0.unwrappingSerializer(nameTransformer12);
        boolean boolean14 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        boolean boolean1 = stringKeySerializer0.isUnwrappingSerializer();
        java.lang.Class<java.lang.Object> objClass2 = stringKeySerializer0.handledType();
        java.lang.Class<?> wildcardClass3 = stringKeySerializer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(objClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.Throwable throwable17 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic18 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic18.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        boolean boolean22 = dynamic18.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer23 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer24 = dynamic18.unwrappingSerializer(nameTransformer23);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        dynamic18.acceptJsonFormatVisitor(jsonFormatVisitorWrapper25, javaType26);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper28 = null;
        com.fasterxml.jackson.databind.JavaType javaType29 = null;
        dynamic18.acceptJsonFormatVisitor(jsonFormatVisitorWrapper28, javaType29);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper31 = null;
        com.fasterxml.jackson.databind.JavaType javaType32 = null;
        dynamic18.acceptJsonFormatVisitor(jsonFormatVisitorWrapper31, javaType32);
        java.lang.Class<java.lang.Object> objClass34 = dynamic18.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor35 = dynamic18.properties();
        boolean boolean36 = dynamic18.usesObjectId();
        boolean boolean37 = dynamic18.usesObjectId();
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider16, throwable17, (java.lang.Object) boolean37, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer24);
        org.junit.Assert.assertNotNull(objClass34);
        org.junit.Assert.assertNotNull(propertyWriterItor35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        java.lang.Class<java.lang.Object> objClass22 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic24 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper25, javaType26);
        boolean boolean28 = dynamic24.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = dynamic24.getSchema(serializerProvider29, (java.lang.reflect.Type) wildcardClass31);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper33, javaType34);
        boolean boolean36 = dynamic24.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper37, javaType38);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper40, javaType41);
        boolean boolean43 = dynamic0.isEmpty(serializerProvider23, (java.lang.Object) jsonFormatVisitorWrapper40);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor44 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objClass22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(propertyWriterItor44);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        boolean boolean1 = stringKeySerializer0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper2 = null;
        com.fasterxml.jackson.databind.JavaType javaType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper2, javaType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider22 = null;
        java.lang.Throwable throwable23 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic24 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper25, javaType26);
        boolean boolean28 = dynamic24.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper29, javaType30);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper32 = null;
        com.fasterxml.jackson.databind.JavaType javaType33 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper32, javaType33);
        java.lang.Class<java.lang.Object> objClass35 = dynamic24.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper36 = null;
        com.fasterxml.jackson.databind.JavaType javaType37 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper36, javaType37);
        boolean boolean39 = dynamic24.usesObjectId();
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider22, throwable23, (java.lang.Object) boolean39, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objClass35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer17 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        java.lang.Throwable throwable19 = null;
        java.lang.Object obj20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider18, throwable19, obj20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNull(wildcardJsonSerializer17);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.withFilterId((java.lang.Object) '4');
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = stringKeySerializer0.unwrappingSerializer(nameTransformer5);
        java.lang.Class<java.lang.Object> objClass7 = stringKeySerializer0.handledType();
        java.lang.Object obj8 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator9 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider10 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj8, jsonGenerator9, serializerProvider10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass7);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor7 = objJsonSerializer4.properties();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer4.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer9.unwrappingSerializer(nameTransformer10);
        java.lang.Class<?> wildcardClass12 = objJsonSerializer9.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(propertyWriterItor7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        java.lang.Class<?> wildcardClass22 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor23 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper24, javaType25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(propertyWriterItor23);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        boolean boolean23 = dynamic0.isUnwrappingSerializer();
        boolean boolean24 = dynamic0.isUnwrappingSerializer();
        boolean boolean25 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper26, javaType27);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper29 = null;
        com.fasterxml.jackson.databind.JavaType javaType30 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper29, javaType30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = dynamic0.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic10 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic10.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        boolean boolean14 = dynamic10.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode18 = dynamic10.getSchema(serializerProvider15, (java.lang.reflect.Type) wildcardClass17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic10.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        boolean boolean22 = dynamic10.usesObjectId();
        boolean boolean23 = dynamic0.isEmpty(serializerProvider9, (java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(jsonNode18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        boolean boolean12 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        boolean boolean11 = dynamic0.isUnwrappingSerializer();
        java.lang.Class<?> wildcardClass12 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = dynamic0.getDelegatee();
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = dynamic0.unwrappingSerializer(nameTransformer16);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        boolean boolean21 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        boolean boolean18 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor22 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper23, javaType24);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper26 = null;
        com.fasterxml.jackson.databind.JavaType javaType27 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper26, javaType27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(propertyWriterItor22);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper17, javaType18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = dynamic0.getDelegatee();
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = dynamic0.unwrappingSerializer(nameTransformer20);
        boolean boolean22 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper23, javaType24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = objJsonSerializer7.unwrappingSerializer(nameTransformer12);
        boolean boolean14 = objJsonSerializer13.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = objJsonSerializer13.unwrappingSerializer(nameTransformer15);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = objJsonSerializer16.properties();
        java.lang.Class<?> wildcardClass18 = propertyWriterItor17.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        boolean boolean12 = dynamic0.usesObjectId();
        boolean boolean13 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = dynamic0.unwrappingSerializer(nameTransformer12);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer16 = dynamic0.getDelegatee();
        java.lang.Object obj17 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator18 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj17, jsonGenerator18, serializerProvider19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer7.unwrappingSerializer(nameTransformer10);
        boolean boolean12 = objJsonSerializer4.isEmpty((java.lang.Object) objJsonSerializer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = objJsonSerializer4.unwrappingSerializer(nameTransformer13);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        java.lang.Class<java.lang.Object> objClass13 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer5 = objJsonSerializer4.getDelegatee();
        java.lang.Class<?> wildcardClass6 = objJsonSerializer4.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNull(wildcardJsonSerializer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        boolean boolean16 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper17, javaType18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer4.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer4.unwrappingSerializer(nameTransformer9);
        java.lang.Class<?> wildcardClass11 = objJsonSerializer10.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor10 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNotNull(propertyWriterItor10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        java.lang.Class<java.lang.Object> objClass21 = dynamic0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer22 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper23, javaType24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertNotNull(objClass21);
        org.junit.Assert.assertNull(wildcardJsonSerializer22);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor12 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(propertyWriterItor12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = dynamic0.unwrappingSerializer(nameTransformer22);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer24 = objJsonSerializer23.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertNull(wildcardJsonSerializer24);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        boolean boolean16 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper17, javaType18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        boolean boolean11 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = dynamic0.getSchema(serializerProvider11, type12, true);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider15 = null;
        java.lang.Throwable throwable16 = null;
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider15, throwable16, obj17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNode14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        java.lang.Class<java.lang.Object> objClass12 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNotNull(objClass12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = dynamic0.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = dynamic0.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        boolean boolean24 = dynamic0.isUnwrappingSerializer();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor25 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor25);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = dynamic0.getDelegatee();
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper22, javaType23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(objClass15);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.lang.Class<java.lang.Object> objClass19 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer21 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = stringKeySerializer21.unwrappingSerializer(nameTransformer22);
        java.lang.Class<?> wildcardClass24 = stringKeySerializer21.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode26 = dynamic0.getSchema(serializerProvider20, (java.lang.reflect.Type) wildcardClass24, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass19);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(jsonNode26);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer20 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer21 = dynamic0.unwrappingSerializer(nameTransformer20);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper22 = null;
        com.fasterxml.jackson.databind.JavaType javaType23 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper22, javaType23);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer25 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer21);
        org.junit.Assert.assertNull(wildcardJsonSerializer25);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.lang.Class<java.lang.Object> objClass19 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper23 = null;
        com.fasterxml.jackson.databind.JavaType javaType24 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper23, javaType24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass19);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.reflect.Type type21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = dynamic0.getSchema(serializerProvider20, type21, true);
        java.lang.Class<?> wildcardClass24 = jsonNode23.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNode23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = dynamic0.getDelegatee();
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        java.lang.Object obj16 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator17 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.serialize(obj16, jsonGenerator17, serializerProvider18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
        org.junit.Assert.assertNotNull(objClass15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        java.lang.Class<java.lang.Object> objClass22 = dynamic0.handledType();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider23 = null;
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic24 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper25, javaType26);
        boolean boolean28 = dynamic24.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider29 = null;
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode32 = dynamic24.getSchema(serializerProvider29, (java.lang.reflect.Type) wildcardClass31);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper33 = null;
        com.fasterxml.jackson.databind.JavaType javaType34 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper33, javaType34);
        boolean boolean36 = dynamic24.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper37 = null;
        com.fasterxml.jackson.databind.JavaType javaType38 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper37, javaType38);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper40 = null;
        com.fasterxml.jackson.databind.JavaType javaType41 = null;
        dynamic24.acceptJsonFormatVisitor(jsonFormatVisitorWrapper40, javaType41);
        boolean boolean43 = dynamic0.isEmpty(serializerProvider23, (java.lang.Object) jsonFormatVisitorWrapper40);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper44 = null;
        com.fasterxml.jackson.databind.JavaType javaType45 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper44, javaType45);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper47 = null;
        com.fasterxml.jackson.databind.JavaType javaType48 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper47, javaType48);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objClass22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(jsonNode32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = dynamic0.unwrappingSerializer(nameTransformer13);
        java.lang.Object obj15 = null;
        boolean boolean16 = dynamic0.isEmpty(obj15);
        boolean boolean17 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer2 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer3 = objJsonSerializer1.unwrappingSerializer(nameTransformer2);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor4 = objJsonSerializer1.properties();
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer8 = objJsonSerializer1.withFilterId((java.lang.Object) nameTransformer6);
        boolean boolean9 = objJsonSerializer0.isEmpty((java.lang.Object) nameTransformer6);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer10 = objJsonSerializer0.getDelegatee();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = wildcardJsonSerializer10.usesObjectId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer1);
        org.junit.Assert.assertNotNull(objJsonSerializer3);
        org.junit.Assert.assertNotNull(propertyWriterItor4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardJsonSerializer10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer22 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer23 = dynamic0.unwrappingSerializer(nameTransformer22);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor24 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper25, javaType26);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer23);
        org.junit.Assert.assertNotNull(propertyWriterItor24);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass20 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper24, javaType25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(objClass20);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Object obj1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer2 = stringKeySerializer0.withFilterId(obj1);
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardJsonSerializer2);
        org.junit.Assert.assertNotNull(objClass3);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        boolean boolean8 = dynamic0.isUnwrappingSerializer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.getDelegatee();
        java.lang.Object obj5 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator6 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider7 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj5, jsonGenerator6, serializerProvider7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertNull(wildcardJsonSerializer4);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(objClass11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer14 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardJsonSerializer14);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        boolean boolean13 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper14 = null;
        com.fasterxml.jackson.databind.JavaType javaType15 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper14, javaType15);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper17 = null;
        com.fasterxml.jackson.databind.JavaType javaType18 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper17, javaType18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer7 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer8 = objJsonSerializer4.unwrappingSerializer(nameTransformer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer9 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer10 = objJsonSerializer4.unwrappingSerializer(nameTransformer9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = objJsonSerializer10.unwrappingSerializer(nameTransformer11);
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer8);
        org.junit.Assert.assertNotNull(objJsonSerializer10);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer13 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer14 = dynamic0.unwrappingSerializer(nameTransformer13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        boolean boolean21 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertNotNull(objJsonSerializer14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = dynamic0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper11 = null;
        com.fasterxml.jackson.databind.JavaType javaType12 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper11, javaType12);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor14 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        boolean boolean12 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider20 = null;
        java.lang.reflect.Type type21 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode23 = dynamic0.getSchema(serializerProvider20, type21, true);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper24, javaType25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jsonNode23);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        boolean boolean12 = dynamic0.usesObjectId();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider11 = null;
        java.lang.reflect.Type type12 = null;
        com.fasterxml.jackson.databind.JsonNode jsonNode14 = dynamic0.getSchema(serializerProvider11, type12, true);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = dynamic0.getDelegatee();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonNode14);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        java.lang.Class<java.lang.Object> objClass1 = stringKeySerializer0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor2 = stringKeySerializer0.properties();
        java.lang.Class<java.lang.Object> objClass3 = stringKeySerializer0.handledType();
        boolean boolean4 = stringKeySerializer0.isUnwrappingSerializer();
        org.junit.Assert.assertNotNull(objClass1);
        org.junit.Assert.assertNotNull(propertyWriterItor2);
        org.junit.Assert.assertNotNull(objClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        java.lang.Class<java.lang.Object> objClass20 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper24 = null;
        com.fasterxml.jackson.databind.JavaType javaType25 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper24, javaType25);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper27 = null;
        com.fasterxml.jackson.databind.JavaType javaType28 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper27, javaType28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertNotNull(objClass20);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer5 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer6 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = objJsonSerializer5.unwrappingSerializer(nameTransformer6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = objJsonSerializer7.unwrappingSerializer(nameTransformer10);
        boolean boolean12 = objJsonSerializer4.isEmpty((java.lang.Object) objJsonSerializer11);
        java.lang.Class<?> wildcardClass13 = objJsonSerializer11.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer5);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        boolean boolean3 = objJsonSerializer0.isUnwrappingSerializer();
        boolean boolean4 = objJsonSerializer0.usesObjectId();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer7 = objJsonSerializer6.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor8 = objJsonSerializer6.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNull(wildcardJsonSerializer7);
        org.junit.Assert.assertNotNull(propertyWriterItor8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        java.lang.Class<java.lang.Object> objClass16 = dynamic0.handledType();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = dynamic0.properties();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor18 = dynamic0.properties();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
        org.junit.Assert.assertNotNull(propertyWriterItor18);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = dynamic0.unwrappingSerializer(nameTransformer8);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        boolean boolean13 = dynamic0.isUnwrappingSerializer();
        boolean boolean14 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer stringKeySerializer0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.StringKeySerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = stringKeySerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer4 = stringKeySerializer0.withFilterId((java.lang.Object) '4');
        java.lang.Object obj5 = null;
        boolean boolean6 = stringKeySerializer0.isEmpty(obj5);
        java.lang.Object obj7 = null;
        com.fasterxml.jackson.core.JsonGenerator jsonGenerator8 = null;
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider9 = null;
        // The following exception was thrown during execution in test generation
        try {
            stringKeySerializer0.serialize(obj7, jsonGenerator8, serializerProvider9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        boolean boolean21 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        java.lang.Class<java.lang.Object> objClass15 = dynamic0.handledType();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer16 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer17 = dynamic0.unwrappingSerializer(nameTransformer16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass15);
        org.junit.Assert.assertNotNull(objJsonSerializer17);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor19 = dynamic0.properties();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        boolean boolean23 = dynamic0.isUnwrappingSerializer();
        boolean boolean24 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper25 = null;
        com.fasterxml.jackson.databind.JavaType javaType26 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper25, javaType26);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(propertyWriterItor19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        java.lang.Class<java.lang.Object> objClass9 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper10 = null;
        com.fasterxml.jackson.databind.JavaType javaType11 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper10, javaType11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer19 = dynamic0.getDelegatee();
        boolean boolean20 = dynamic0.usesObjectId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertNotNull(objClass9);
        org.junit.Assert.assertNull(wildcardJsonSerializer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper19 = null;
        com.fasterxml.jackson.databind.JavaType javaType20 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper19, javaType20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer7);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer12 = wildcardJsonSerializer11.getDelegatee();
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor13 = wildcardJsonSerializer11.properties();
        java.lang.Class<?> wildcardClass14 = wildcardJsonSerializer11.getClass();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNull(wildcardJsonSerializer12);
        org.junit.Assert.assertNotNull(propertyWriterItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer0 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer1 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer2 = objJsonSerializer0.unwrappingSerializer(nameTransformer1);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer3 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer4 = objJsonSerializer2.unwrappingSerializer(nameTransformer3);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = objJsonSerializer4.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer7 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer8 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer9 = objJsonSerializer7.unwrappingSerializer(nameTransformer8);
        java.lang.Class<?> wildcardClass10 = objJsonSerializer7.getClass();
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer11 = objJsonSerializer6.withFilterId((java.lang.Object) objJsonSerializer7);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer12 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer13 = objJsonSerializer7.unwrappingSerializer(nameTransformer12);
        boolean boolean14 = objJsonSerializer13.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer15 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer16 = objJsonSerializer13.unwrappingSerializer(nameTransformer15);
        java.util.Iterator<com.fasterxml.jackson.databind.ser.PropertyWriter> propertyWriterItor17 = objJsonSerializer13.properties();
        org.junit.Assert.assertNotNull(objJsonSerializer0);
        org.junit.Assert.assertNotNull(objJsonSerializer2);
        org.junit.Assert.assertNotNull(objJsonSerializer4);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objJsonSerializer7);
        org.junit.Assert.assertNotNull(objJsonSerializer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardJsonSerializer11);
        org.junit.Assert.assertNotNull(objJsonSerializer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer16);
        org.junit.Assert.assertNotNull(propertyWriterItor17);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.JsonSerializer<?> wildcardJsonSerializer15 = dynamic0.getDelegatee();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertNull(wildcardJsonSerializer15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper5 = null;
        com.fasterxml.jackson.databind.JavaType javaType6 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper5, javaType6);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper8 = null;
        com.fasterxml.jackson.databind.JavaType javaType9 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper8, javaType9);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer11 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer12 = dynamic0.unwrappingSerializer(nameTransformer11);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        boolean boolean19 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper20 = null;
        com.fasterxml.jackson.databind.JavaType javaType21 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper20, javaType21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper15 = null;
        com.fasterxml.jackson.databind.JavaType javaType16 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper15, javaType16);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper18 = null;
        com.fasterxml.jackson.databind.JavaType javaType19 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper18, javaType19);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper21 = null;
        com.fasterxml.jackson.databind.JavaType javaType22 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper21, javaType22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer5 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer6 = dynamic0.unwrappingSerializer(nameTransformer5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        java.lang.Class<java.lang.Object> objClass10 = dynamic0.handledType();
        java.lang.Class<java.lang.Object> objClass11 = dynamic0.handledType();
        boolean boolean12 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper16 = null;
        com.fasterxml.jackson.databind.JavaType javaType17 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper16, javaType17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objJsonSerializer6);
        org.junit.Assert.assertNotNull(objClass10);
        org.junit.Assert.assertNotNull(objClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        boolean boolean4 = dynamic0.isUnwrappingSerializer();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider5 = null;
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        com.fasterxml.jackson.databind.JsonNode jsonNode8 = dynamic0.getSchema(serializerProvider5, (java.lang.reflect.Type) wildcardClass7);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper9 = null;
        com.fasterxml.jackson.databind.JavaType javaType10 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper9, javaType10);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper12 = null;
        com.fasterxml.jackson.databind.JavaType javaType13 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper12, javaType13);
        boolean boolean15 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.SerializerProvider serializerProvider16 = null;
        java.lang.Throwable throwable17 = null;
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dynamic0.wrapAndThrow(serializerProvider16, throwable17, obj18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(jsonNode8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic dynamic0 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper1 = null;
        com.fasterxml.jackson.databind.JavaType javaType2 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper1, javaType2);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper4 = null;
        com.fasterxml.jackson.databind.JavaType javaType5 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper4, javaType5);
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper7 = null;
        com.fasterxml.jackson.databind.JavaType javaType8 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper7, javaType8);
        com.fasterxml.jackson.databind.util.NameTransformer nameTransformer10 = null;
        com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> objJsonSerializer11 = dynamic0.unwrappingSerializer(nameTransformer10);
        boolean boolean12 = dynamic0.usesObjectId();
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper jsonFormatVisitorWrapper13 = null;
        com.fasterxml.jackson.databind.JavaType javaType14 = null;
        dynamic0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper13, javaType14);
        org.junit.Assert.assertNotNull(objJsonSerializer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}

