package com.google.gson.internal.bind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        boolean boolean3 = gson0.serializeNulls();
        com.google.gson.TypeAdapter<java.lang.AutoCloseable> autoCloseableTypeAdapter4 = null;
        java.lang.Class<java.lang.AutoCloseable> autoCloseableClass5 = null;
        com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable> autoCloseableArrayTypeAdapter6 = new com.google.gson.internal.bind.ArrayTypeAdapter<java.lang.AutoCloseable>(gson0, autoCloseableTypeAdapter4, autoCloseableClass5);
        com.google.gson.JsonElement jsonElement7 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader8 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement7);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.Object obj9 = autoCloseableArrayTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader8);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
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
        com.google.gson.JsonElement jsonElement12 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader13 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement12);
        java.lang.String str14 = jsonTreeReader13.toString();
        java.lang.String str15 = jsonTreeReader13.toString();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        java.lang.Object obj16 = objectTypeAdapter6.read((com.google.gson.stream.JsonReader) jsonTreeReader13);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        com.google.gson.JsonElement jsonElement1 = null;
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader2 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement1);
        java.lang.String str3 = gson0.toJson((java.lang.Object) jsonElement1);
        java.lang.String str5 = gson0.toJson((java.lang.Object) 0);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonPrimitive jsonPrimitive8 = new com.google.gson.JsonPrimitive((java.lang.Number) 10.0f);
        boolean boolean9 = jsonPrimitive8.isNumber();
        com.google.gson.JsonElement jsonElement10 = objectTypeAdapter6.toJsonTree((java.lang.Object) boolean9);
        com.google.gson.JsonPrimitive jsonPrimitive12 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean13 = jsonPrimitive12.isNumber();
        java.math.BigInteger bigInteger14 = jsonPrimitive12.getAsBigInteger();
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter15 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter16 = jsonTreeWriter15.nullValue();
        com.google.gson.internal.Streams.write((com.google.gson.JsonElement) jsonPrimitive12, jsonWriter16);
        com.google.gson.JsonPrimitive jsonPrimitive19 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        boolean boolean20 = jsonPrimitive19.isNumber();
        com.google.gson.JsonArray jsonArray21 = new com.google.gson.JsonArray();
        com.google.gson.JsonPrimitive jsonPrimitive23 = new com.google.gson.JsonPrimitive("hi!");
        boolean boolean24 = jsonPrimitive23.isString();
        boolean boolean25 = jsonPrimitive23.isBoolean();
        boolean boolean26 = jsonArray21.contains((com.google.gson.JsonElement) jsonPrimitive23);
        boolean boolean27 = jsonPrimitive19.equals((java.lang.Object) jsonArray21);
        com.google.gson.JsonPrimitive jsonPrimitive29 = new com.google.gson.JsonPrimitive((java.lang.Character) '4');
        float float30 = jsonPrimitive29.getAsFloat();
        short short31 = jsonPrimitive29.getAsShort();
        boolean boolean32 = jsonArray21.contains((com.google.gson.JsonElement) jsonPrimitive29);
        objectTypeAdapter6.write(jsonWriter16, (java.lang.Object) jsonArray21);
        com.google.gson.stream.JsonWriter jsonWriter35 = jsonWriter16.value((double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter37 = jsonWriter16.jsonValue("com.google.gson.JsonIOException: \"hi!\"");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.gson.Gson gson0 = new com.google.gson.Gson();
        boolean boolean1 = gson0.htmlSafe();
        java.lang.String str2 = gson0.toString();
        java.lang.String str3 = gson0.toString();
        com.google.gson.TypeAdapterFactory typeAdapterFactory4 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        com.google.gson.JsonElement jsonElement5 = gson0.toJsonTree((java.lang.Object) typeAdapterFactory4);
        com.google.gson.internal.bind.ObjectTypeAdapter objectTypeAdapter6 = new com.google.gson.internal.bind.ObjectTypeAdapter(gson0);
        com.google.gson.JsonObject jsonObject7 = new com.google.gson.JsonObject();
        java.util.Set<java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement>> strEntrySet8 = jsonObject7.entrySet();
        com.google.gson.JsonObject jsonObject9 = jsonObject7.getAsJsonObject();
        com.google.gson.JsonPrimitive jsonPrimitive11 = jsonObject7.getAsJsonPrimitive("JsonTreeReader");
        com.google.gson.JsonObject jsonObject13 = jsonObject7.getAsJsonObject("{\"version\":-1.0,\"modifiers\":136,\"serializeInnerClasses\":true,\"requireExpose\":false,\"serializationStrategies\":[],\"deserializationStrategies\":[]}");
        jsonObject7.addProperty("\"hi!\"", "\"1\"");
        com.google.gson.internal.bind.JsonTreeWriter jsonTreeWriter17 = new com.google.gson.internal.bind.JsonTreeWriter();
        com.google.gson.stream.JsonWriter jsonWriter19 = jsonTreeWriter17.value((long) (short) 1);
        gson0.toJson((com.google.gson.JsonElement) jsonObject7, (com.google.gson.stream.JsonWriter) jsonTreeWriter17);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonWriter jsonWriter22 = jsonTreeWriter17.jsonValue("");
    }
}

