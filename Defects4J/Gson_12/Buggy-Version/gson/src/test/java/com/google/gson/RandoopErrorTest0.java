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
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        int int1 = jsonArray0.size();
        com.google.gson.JsonPrimitive jsonPrimitive3 = new com.google.gson.JsonPrimitive("");
        boolean boolean4 = jsonPrimitive3.isJsonNull();
        boolean boolean5 = jsonPrimitive3.isNumber();
        boolean boolean6 = jsonArray0.remove((com.google.gson.JsonElement) jsonPrimitive3);
        com.google.gson.JsonArray jsonArray7 = new com.google.gson.JsonArray();
        jsonArray7.add((java.lang.Number) (-1.0f));
        boolean boolean10 = jsonArray0.equals((java.lang.Object) jsonArray7);
        boolean boolean12 = jsonArray7.equals((java.lang.Object) "com.google.gson.stream.MalformedJsonException: ");
        int int13 = jsonArray7.size();
        com.google.gson.JsonArray jsonArray14 = new com.google.gson.JsonArray();
        int int15 = jsonArray14.size();
        jsonArray7.addAll(jsonArray14);
        jsonArray7.add((java.lang.Boolean) true);
        com.google.gson.JsonElement jsonElement19 = null;
        boolean boolean20 = jsonArray7.remove(jsonElement19);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader21 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement19);
        java.lang.String str22 = jsonTreeReader21.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        int int23 = jsonTreeReader21.nextInt();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        int int1 = jsonArray0.size();
        com.google.gson.JsonPrimitive jsonPrimitive3 = new com.google.gson.JsonPrimitive("");
        boolean boolean4 = jsonPrimitive3.isJsonNull();
        boolean boolean5 = jsonPrimitive3.isNumber();
        boolean boolean6 = jsonArray0.remove((com.google.gson.JsonElement) jsonPrimitive3);
        com.google.gson.JsonArray jsonArray7 = new com.google.gson.JsonArray();
        jsonArray7.add((java.lang.Number) (-1.0f));
        boolean boolean10 = jsonArray0.equals((java.lang.Object) jsonArray7);
        boolean boolean12 = jsonArray7.equals((java.lang.Object) "com.google.gson.stream.MalformedJsonException: ");
        int int13 = jsonArray7.size();
        com.google.gson.JsonArray jsonArray14 = new com.google.gson.JsonArray();
        int int15 = jsonArray14.size();
        jsonArray7.addAll(jsonArray14);
        jsonArray7.add((java.lang.Boolean) true);
        com.google.gson.JsonElement jsonElement19 = null;
        boolean boolean20 = jsonArray7.remove(jsonElement19);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader21 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement19);
        java.lang.String str22 = jsonTreeReader21.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader21.endArray();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        int int1 = jsonArray0.size();
        com.google.gson.JsonPrimitive jsonPrimitive3 = new com.google.gson.JsonPrimitive("");
        boolean boolean4 = jsonPrimitive3.isJsonNull();
        boolean boolean5 = jsonPrimitive3.isNumber();
        boolean boolean6 = jsonArray0.remove((com.google.gson.JsonElement) jsonPrimitive3);
        com.google.gson.JsonArray jsonArray7 = new com.google.gson.JsonArray();
        jsonArray7.add((java.lang.Number) (-1.0f));
        boolean boolean10 = jsonArray0.equals((java.lang.Object) jsonArray7);
        boolean boolean12 = jsonArray7.equals((java.lang.Object) "com.google.gson.stream.MalformedJsonException: ");
        int int13 = jsonArray7.size();
        com.google.gson.JsonArray jsonArray14 = new com.google.gson.JsonArray();
        int int15 = jsonArray14.size();
        jsonArray7.addAll(jsonArray14);
        jsonArray7.add((java.lang.Boolean) true);
        com.google.gson.JsonElement jsonElement19 = null;
        boolean boolean20 = jsonArray7.remove(jsonElement19);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader21 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader21.endObject();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        int int1 = jsonArray0.size();
        com.google.gson.JsonPrimitive jsonPrimitive3 = new com.google.gson.JsonPrimitive("");
        boolean boolean4 = jsonPrimitive3.isJsonNull();
        boolean boolean5 = jsonPrimitive3.isNumber();
        boolean boolean6 = jsonArray0.remove((com.google.gson.JsonElement) jsonPrimitive3);
        com.google.gson.JsonArray jsonArray7 = new com.google.gson.JsonArray();
        jsonArray7.add((java.lang.Number) (-1.0f));
        boolean boolean10 = jsonArray0.equals((java.lang.Object) jsonArray7);
        boolean boolean12 = jsonArray7.equals((java.lang.Object) "com.google.gson.stream.MalformedJsonException: ");
        int int13 = jsonArray7.size();
        com.google.gson.JsonArray jsonArray14 = new com.google.gson.JsonArray();
        int int15 = jsonArray14.size();
        jsonArray7.addAll(jsonArray14);
        jsonArray7.add((java.lang.Boolean) true);
        com.google.gson.JsonElement jsonElement19 = null;
        boolean boolean20 = jsonArray7.remove(jsonElement19);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader21 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement19);
        java.lang.String str22 = jsonTreeReader21.getPath();
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        com.google.gson.stream.JsonToken jsonToken23 = jsonTreeReader21.peek();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.google.gson.JsonArray jsonArray0 = new com.google.gson.JsonArray();
        int int1 = jsonArray0.size();
        com.google.gson.JsonPrimitive jsonPrimitive3 = new com.google.gson.JsonPrimitive("");
        boolean boolean4 = jsonPrimitive3.isJsonNull();
        boolean boolean5 = jsonPrimitive3.isNumber();
        boolean boolean6 = jsonArray0.remove((com.google.gson.JsonElement) jsonPrimitive3);
        com.google.gson.JsonArray jsonArray7 = new com.google.gson.JsonArray();
        jsonArray7.add((java.lang.Number) (-1.0f));
        boolean boolean10 = jsonArray0.equals((java.lang.Object) jsonArray7);
        boolean boolean12 = jsonArray7.equals((java.lang.Object) "com.google.gson.stream.MalformedJsonException: ");
        int int13 = jsonArray7.size();
        com.google.gson.JsonArray jsonArray14 = new com.google.gson.JsonArray();
        int int15 = jsonArray14.size();
        jsonArray7.addAll(jsonArray14);
        jsonArray7.add((java.lang.Boolean) true);
        com.google.gson.JsonElement jsonElement19 = null;
        boolean boolean20 = jsonArray7.remove(jsonElement19);
        com.google.gson.internal.bind.JsonTreeReader jsonTreeReader21 = new com.google.gson.internal.bind.JsonTreeReader(jsonElement19);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        jsonTreeReader21.skipValue();
    }
}

