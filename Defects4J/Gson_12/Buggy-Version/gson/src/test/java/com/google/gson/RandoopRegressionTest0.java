package com.google.gson.internal.bind.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("hi!", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.google.gson.internal.bind.util.ISO8601Utils.format(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.gson.internal.bind.util.ISO8601Utils iSO8601Utils0 = new com.google.gson.internal.bind.util.ISO8601Utils();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.google.gson.internal.bind.util.ISO8601Utils.format(date0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("false", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("\"hi!\"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.gson.internal.bind.util.ISO8601Utils.format(date0, false, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.Date date0 = null;
        java.util.TimeZone timeZone2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.gson.internal.bind.util.ISO8601Utils.format(date0, true, timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.google.gson.internal.bind.util.ISO8601Utils.format(date0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: hi!", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonParseException: hi!", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("-1", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: \"hi!\"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: hi!", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: \"\"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse(" ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException:  ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonParseException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("\" \"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("100", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonParseException: com.google.gson.JsonParseException: hi!", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonParseException:  ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: \" \"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("true", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException:  ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: \"\"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("\"com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: \"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonParseException: false", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: \"\"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("\"\"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonParseException: com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: \"\"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("\"com.google.gson.JsonParseException: com.google.gson.JsonParseException: \"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonSyntaxException", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonParseException: com.google.gson.JsonParseException: com.google.gson.JsonSyntaxException: ", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: com.google.gson.JsonParseException: \" \"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonSyntaxException: com.google.gson.JsonParseException: \" \"", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.text.ParsePosition parsePosition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = com.google.gson.internal.bind.util.ISO8601Utils.parse("com.google.gson.JsonParseException: false", parsePosition1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

