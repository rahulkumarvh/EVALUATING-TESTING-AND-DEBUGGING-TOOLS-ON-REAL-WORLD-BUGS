package org.joda.time.base;

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
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider2 = new org.joda.time.tz.ZoneInfoProvider("", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Resource not found: \"/ZoneInfoMap\" ClassLoader: system");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDay();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        java.io.Writer writer1 = null;
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.daysIn(readableInterval2);
        int int4 = days3.getValue();
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter0.printTo(writer1, (org.joda.time.ReadablePeriod) days3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        int int6 = localDate1.getDayOfYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.joda.time.Months months0 = org.joda.time.Months.THREE;
        java.lang.String str1 = months0.toString();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P3M" + "'", str1, "P3M");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTime();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dateTimeFormatter0.parseMillis("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = unsupportedDurationField8.getMillis(2024, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unsupportedDurationField8.getValue(0L, (long) (-28800000));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks(2024);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate1.withYearOfCentury((-28800000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -28800000 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        int int2 = days1.getValue();
        org.joda.time.Days days4 = days1.minus((int) (byte) -1);
        java.lang.String str5 = days1.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0D" + "'", str5, "P0D");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = unsupportedDurationField8.subtract((long) (short) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        int int2 = days1.getValue();
        org.joda.time.PeriodType periodType3 = days1.getPeriodType();
        org.joda.time.Days days5 = days1.plus(2024);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Months months1 = org.joda.time.Months.parseMonths("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("2024W141");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 2024W141");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.Days days20 = org.joda.time.Days.daysIn(readableInterval19);
        org.joda.time.MutablePeriod mutablePeriod21 = days20.toMutablePeriod();
        org.joda.time.Days days23 = days20.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType24 = days23.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.ScaledDurationField scaledDurationField26 = new org.joda.time.field.ScaledDurationField((org.joda.time.DurationField) unsupportedDurationField17, durationFieldType24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The field must be supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(durationFieldType24);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean8 = localDate1.equals((java.lang.Object) dateTimeZone7);
        org.joda.time.LocalTime localTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDate1.toLocalDateTime(localTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.joda.time.Months months0 = org.joda.time.Months.SIX;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = months0.getFieldType(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.minus((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = days8.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        org.joda.time.Months months20 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period21 = months20.toPeriod();
        org.joda.time.Months months22 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months23 = org.joda.time.Months.THREE;
        org.joda.time.Months months24 = months22.plus(months23);
        org.joda.time.Months months25 = months20.plus(months23);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        boolean boolean27 = months25.isSupported(durationFieldType26);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField28 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = localDate18.withFieldAdded(durationFieldType26, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(months20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(months25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField28);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDate2.isSupported(dateTimeFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate10.isSupported(dateTimeFieldType13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int16 = localDate10.indexOf(dateTimeFieldType15);
        int int17 = dateTime8.get(dateTimeFieldType15);
        java.lang.String str18 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime8.getZone();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 24 + "'", int17 == 24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2024W141" + "'", str18, "2024W141");
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.get();
        java.lang.String str24 = property19.toString();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Property[monthOfYear]" + "'", str24, "Property[monthOfYear]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = unsupportedDurationField8.subtract((long) (short) -1, (long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        boolean boolean5 = dateTimeZone3.equals((java.lang.Object) months4);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = gregorianChronology6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone0, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.CachedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue((int) 'a', 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.joda.time.ReadableDuration readableDuration0 = null;
        long long1 = org.joda.time.DateTimeUtils.getDurationMillis(readableDuration0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.joda.time.Months months0 = org.joda.time.Months.NINE;
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gregorianChronology3.getDateTimeMillis(0L, (int) '4', (int) (short) 100, (-28800000), (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean8 = localDate1.equals((java.lang.Object) dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate1.withField(dateTimeFieldType9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicDate();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withChronology(chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay4 = org.joda.time.MonthDay.parse("P3M", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P3M\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Months months2 = org.joda.time.Months.monthsBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("", "");
        org.joda.time.DurationFieldType durationFieldType3 = illegalFieldValueException2.getDurationFieldType();
        org.junit.Assert.assertNull(durationFieldType3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        java.lang.Class<?> wildcardClass7 = days6.getClass();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate1.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.standard();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.daysIn(readableInterval2);
        org.joda.time.MutablePeriod mutablePeriod4 = days3.toMutablePeriod();
        org.joda.time.Days days6 = days3.multipliedBy((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.Days days9 = days3.plus(days8);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.Days days11 = org.joda.time.Days.daysIn(readableInterval10);
        org.joda.time.MutablePeriod mutablePeriod12 = days11.toMutablePeriod();
        org.joda.time.Days days14 = days11.multipliedBy((int) (byte) 0);
        org.joda.time.Days days15 = days3.minus(days14);
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter0.printTo(stringBuffer1, (org.joda.time.ReadablePeriod) days3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.joda.time.Months months0 = org.joda.time.Months.FIVE;
        months0.setValue(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Months months4 = months0.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusDays(0);
        // The following exception was thrown during execution in test generation
        try {
            monthDay3.setValue(3, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months13 = org.joda.time.Months.TWELVE;
        boolean boolean14 = dateTimeZone12.equals((java.lang.Object) months13);
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone12);
        long long21 = gregorianChronology15.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone22 = gregorianChronology15.getZone();
        org.joda.time.DurationField durationField23 = gregorianChronology15.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay24 = new org.joda.time.MonthDay((java.lang.Object) gregorianChronology3, (org.joda.time.Chronology) gregorianChronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.GregorianChronology");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-53999965L) + "'", long21 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        long long7 = interval6.toDurationMillis();
        java.lang.String str8 = interval6.toString();
        org.joda.time.Days days9 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval6);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.Period period11 = interval6.toPeriod(periodType10);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00" + "'", str8, "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00");
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.joda.time.Days days1 = org.joda.time.Days.days(0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months3 = org.joda.time.Months.TWELVE;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) months3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = localDate7.isSupported(dateTimeFieldType10);
        org.joda.time.Interval interval12 = localDate7.toInterval();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean14 = localDate7.equals((java.lang.Object) dateTimeZone13);
        long long16 = dateTimeZone2.getMillisKeepLocal(dateTimeZone13, 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) days1, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Days");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.MonthDay monthDay5 = org.joda.time.MonthDay.now((org.joda.time.Chronology) gregorianChronology3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = monthDay5.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(monthDay5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTime dateTime17 = localDate1.toDateTimeAtCurrentTime();
        boolean boolean18 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) localDate1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTime dateTime17 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime21 = localDate19.toDateTimeAtCurrentTime();
        boolean boolean22 = dateTime17.isBefore((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone1 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        int int4 = dateTimeZone0.getOffsetFromLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        boolean boolean7 = dateTimeZone5.equals((java.lang.Object) months6);
        org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate10.isSupported(dateTimeFieldType13);
        org.joda.time.Interval interval15 = localDate10.toInterval();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean17 = localDate10.equals((java.lang.Object) dateTimeZone16);
        long long19 = dateTimeZone5.getMillisKeepLocal(dateTimeZone16, 1L);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean25 = localDate21.equals((java.lang.Object) periodType24);
        org.joda.time.LocalDate localDate27 = localDate21.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.withEra(0);
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean33 = localDate29.equals((java.lang.Object) periodType32);
        org.joda.time.LocalDate localDate35 = localDate29.plusWeeks((int) (byte) 100);
        boolean boolean36 = localDate21.isAfter((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.LocalDate localDate38 = localDate35.plusDays(20);
        org.joda.time.LocalDate.Property property39 = localDate38.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(dateTimeZone40);
        org.joda.time.LocalDate localDate43 = localDate41.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = localDate41.isSupported(dateTimeFieldType44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtCurrentTime(dateTimeZone46);
        boolean boolean48 = property39.equals((java.lang.Object) dateTime47);
        int int49 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime47);
        long long51 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) 24);
        boolean boolean53 = dateTimeZone5.isStandardOffset((long) 12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-28800000) + "'", int4 == (-28800000));
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gregorianChronology8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-25200000) + "'", int49 == (-25200000));
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 24L + "'", long51 == 24L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTimeNoMillis();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter12.getParser();
        boolean boolean14 = gregorianChronology3.equals((java.lang.Object) dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate6.isSupported(dateTimeFieldType9);
        boolean boolean12 = localDate6.equals((java.lang.Object) (byte) 10);
        int[] intArray14 = null;
        int[] intArray16 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) localDate6, (int) (short) 10, intArray14, 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = localDate18.isSupported(dateTimeFieldType21);
        boolean boolean24 = localDate18.equals((java.lang.Object) (byte) 10);
        int int25 = localDate18.size();
        java.util.Locale locale26 = null;
        java.lang.String str27 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDate18, locale26);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "92" + "'", str27, "92");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = monthDay0.getFieldType(0);
        // The following exception was thrown during execution in test generation
        try {
            monthDay0.setValue(20, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        int int3 = property2.get();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = unsupportedDurationField27.getDifference((long) '#', (long) 24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = unsupportedDurationField17.getMillis(57600032L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTime dateTime17 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate19.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtCurrentTime(dateTimeZone24);
        int int26 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate19);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        long long12 = durationField11.getUnitMillis();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property8 = localDate1.property(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        boolean boolean5 = dateTimeZone3.equals((java.lang.Object) months4);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((-1), (int) (byte) -1, 0, (org.joda.time.Chronology) gregorianChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(gregorianChronology6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate5.isSupported(dateTimeFieldType8);
        org.joda.time.Interval interval10 = localDate5.toInterval();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = localDate5.equals((java.lang.Object) dateTimeZone11);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone11, 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 2000");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gregorianChronology3.getDateTimeMillis((long) 2000, (int) (byte) 1, 0, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap0 = org.joda.time.DateTimeUtils.getDefaultTimeZoneNames();
        org.joda.time.DateTimeUtils.setDefaultTimeZoneNames(strMap0);
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.joda.time.Months months0 = org.joda.time.Months.ZERO;
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DurationField durationField5 = dateTimeField4.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.joda.time.Months months0 = org.joda.time.Months.TWELVE;
        org.joda.time.Period period1 = months0.toPeriod();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        boolean boolean22 = dateTimeZone20.equals((java.lang.Object) months21);
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = gregorianChronology23.getZone();
        boolean boolean25 = property19.equals((java.lang.Object) dateTimeZone24);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.parse("Mar", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        int int6 = localDate1.getDayOfWeek();
        int int7 = localDate1.getYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2024 + "'", int7 == 2024);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        java.util.Locale locale5 = null;
        int int6 = dateTimeField4.getMaximumTextLength(locale5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.time();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        long long7 = interval6.toDurationMillis();
        java.lang.String str8 = interval6.toString();
        org.joda.time.Days days9 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval6);
        org.joda.time.DateTime dateTime10 = interval6.getEnd();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00" + "'", str8, "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00");
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay monthDay4 = property2.setCopy(20);
        int int5 = monthDay4.getMonthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField4.subtract((long) 2000, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod2.setSeconds(2024);
        mutablePeriod2.addMonths(10);
        mutablePeriod2.setMillis(20);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Months months1 = org.joda.time.Months.parseMonths("1/1/70");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1/1/70\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        long long4 = dateTimeZone0.nextTransition(23L);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone0);
        int int6 = localDate5.getYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDate5.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9972000000L + "'", long4 == 9972000000L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2024 + "'", int6 == 2024);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.DurationFieldType durationFieldType19 = unsupportedDurationField8.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = unsupportedDurationField8.getMillis(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = dateTimeFormatter0.parseDateTime("2024W141");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2024W141\" is malformed at \"W141\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateWithWeeks();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate5.isSupported(dateTimeFieldType8);
        org.joda.time.Interval interval10 = localDate5.toInterval();
        long long11 = interval10.toDurationMillis();
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval10);
        mutablePeriod3.addMillis((int) (short) 10);
        int int17 = periodFormatter0.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod3, "-08:00", 100);
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 86400000L + "'", long11 == 86400000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-101) + "'", int17 == (-101));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        java.lang.String str11 = gregorianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.clockhourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GregorianChronology[America/Los_Angeles]" + "'", str11, "GregorianChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-97L) + "'", long2 == (-97L));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.Days days6 = org.joda.time.Days.days(0);
        boolean boolean7 = days4.isLessThan(days6);
        org.joda.time.Days days9 = days6.minus(365);
        org.joda.time.Days days11 = days6.plus((-25200000));
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.year();
        long long8 = dateTimeField6.roundHalfFloor((-23673600000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-31507200000L) + "'", long8 == (-31507200000L));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay(dateTimeZone2);
        org.joda.time.MonthDay monthDay5 = monthDay3.plusMonths(24);
        java.lang.String str6 = monthDay5.toString();
        org.joda.time.Chronology chronology7 = monthDay5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months9 = org.joda.time.Months.TWELVE;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) months9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField12 = gregorianChronology11.minutes();
        org.joda.time.Months months13 = org.joda.time.Months.FIVE;
        months13.setValue(0);
        int[] intArray18 = gregorianChronology11.get((org.joda.time.ReadablePeriod) months13, 0L, 0L);
        org.joda.time.MonthDay monthDay19 = monthDay5.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology11);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadablePartial) monthDay5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "--04-01" + "'", str6, "--04-01");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNotNull(monthDay19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtCurrentTime(dateTimeZone26);
        boolean boolean28 = property19.equals((java.lang.Object) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months30 = org.joda.time.Months.TWELVE;
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) months30);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = localDate35.isSupported(dateTimeFieldType38);
        boolean boolean41 = localDate35.equals((java.lang.Object) (byte) 10);
        int[] intArray43 = null;
        int[] intArray45 = dateTimeField33.addWrapPartial((org.joda.time.ReadablePartial) localDate35, (int) (short) 10, intArray43, 0);
        int int46 = property19.compareTo((org.joda.time.ReadablePartial) localDate35);
        int int47 = localDate35.getWeekyear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(months30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(gregorianChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2024 + "'", int47 == 2024);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType1 = periodFormatter0.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = periodFormatter0.parsePeriod("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNull(periodType1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(0);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean11 = localDate7.equals((java.lang.Object) periodType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean13 = localDate7.isSupported(dateTimeFieldType12);
        int int14 = localDate5.get(dateTimeFieldType12);
        org.joda.time.LocalTime localTime15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months17 = org.joda.time.Months.TWELVE;
        boolean boolean18 = dateTimeZone16.equals((java.lang.Object) months17);
        long long20 = dateTimeZone16.nextTransition(23L);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.DateTime dateTime22 = localDate5.toDateTime(localTime15, dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(months17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9972000000L + "'", long20 == 9972000000L);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        long long7 = interval6.toDurationMillis();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDate9.isSupported(dateTimeFieldType12);
        org.joda.time.Interval interval14 = localDate9.toInterval();
        boolean boolean15 = interval6.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = localDate17.isSupported(dateTimeFieldType20);
        org.joda.time.Interval interval22 = localDate17.toInterval();
        long long23 = interval22.toDurationMillis();
        java.lang.String str24 = interval22.toString();
        boolean boolean25 = interval6.isAfter((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = localDate27.isSupported(dateTimeFieldType30);
        org.joda.time.Interval interval32 = localDate27.toInterval();
        long long33 = interval32.toDurationMillis();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = localDate35.isSupported(dateTimeFieldType38);
        org.joda.time.Interval interval40 = localDate35.toInterval();
        boolean boolean41 = interval32.contains((org.joda.time.ReadableInterval) interval40);
        boolean boolean42 = interval22.contains((org.joda.time.ReadableInterval) interval32);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 86400000L + "'", long23 == 86400000L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00" + "'", str24, "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 86400000L + "'", long33 == 86400000L);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply(0L, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate6.isSupported(dateTimeFieldType9);
        boolean boolean12 = localDate6.equals((java.lang.Object) (byte) 10);
        int[] intArray14 = null;
        int[] intArray16 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) localDate6, (int) (short) 10, intArray14, 0);
        boolean boolean17 = dateTimeField4.isSupported();
        long long19 = dateTimeField4.roundHalfEven((-31507200000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-31507200000L) + "'", long19 == (-31507200000L));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.daysIn(readableInterval5);
        org.joda.time.Days days7 = days1.plus(days6);
        java.lang.String str8 = days1.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0D" + "'", str8, "P0D");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months16 = org.joda.time.Months.TWELVE;
        boolean boolean17 = dateTimeZone15.equals((java.lang.Object) months16);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField19 = gregorianChronology18.minutes();
        org.joda.time.Months months20 = org.joda.time.Months.FIVE;
        months20.setValue(0);
        int[] intArray25 = gregorianChronology18.get((org.joda.time.ReadablePeriod) months20, 0L, 0L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField12.addWrapField(readablePartial13, (int) (byte) 10, intArray25, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(months16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(gregorianChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(months20);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MonthDay monthDay15 = new org.joda.time.MonthDay(dateTimeZone14);
        org.joda.time.MonthDay monthDay17 = monthDay15.plusMonths(24);
        int int18 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) monthDay15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23 + "'", int18 == 23);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long16 = offsetDateTimeField14.roundHalfCeiling((long) (-28800000));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-230400000L) + "'", long16 == (-230400000L));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.withEra(0);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean18 = localDate14.equals((java.lang.Object) periodType17);
        org.joda.time.LocalDate localDate20 = localDate14.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.withEra(0);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean26 = localDate22.equals((java.lang.Object) periodType25);
        org.joda.time.LocalDate localDate28 = localDate22.plusWeeks((int) (byte) 100);
        boolean boolean29 = localDate14.isAfter((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate localDate31 = localDate28.plusDays(20);
        org.joda.time.LocalDate localDate33 = localDate31.minusWeeks(2024);
        int int34 = localDate31.getEra();
        int[] intArray42 = new int[] { 14, 3, 25, (byte) 1, 25, 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = dateTimeField12.addWrapPartial((org.joda.time.ReadablePartial) localDate31, (int) (short) 10, intArray42, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[14, 3, 25, 1, 25, 10]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        java.lang.Class<?> wildcardClass3 = days1.getClass();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodPrinter periodPrinter2 = periodFormatterBuilder1.toPrinter();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodPrinter2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        boolean boolean13 = mutablePeriod2.equals((java.lang.Object) 0L);
        mutablePeriod2.setPeriod((int) (byte) 100, (int) (short) 100, (int) ' ', 23, (int) 'a', 11, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate7.indexOfSupported(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod2.setSeconds(2024);
        mutablePeriod2.addMonths(10);
        mutablePeriod2.addMillis(2026);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatter periodFormatter3 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter3.getPrinter();
        org.joda.time.format.PeriodParser periodParser5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = new org.joda.time.format.PeriodFormatter(periodPrinter4, periodParser5);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder2.append(periodFormatter6);
        java.lang.String[] strArray14 = new java.lang.String[] { "--04-01", "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00", "92", "1969" };
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder15 = periodFormatterBuilder2.appendSeparator("", "weekyears", strArray14);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatter3);
        org.junit.Assert.assertNotNull(periodPrinter4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(periodFormatterBuilder15);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod2.addMillis((int) (short) 10);
        mutablePeriod2.setMonths(0);
        mutablePeriod2.addDays((int) (byte) -1);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("PM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PM\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        int int6 = dateTimeField4.getMaximumValue(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.plusMonths(24);
        java.lang.String str4 = monthDay3.toString();
        org.joda.time.Chronology chronology5 = monthDay3.getChronology();
        org.joda.time.MonthDay.Property property6 = monthDay3.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = monthDay3.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--04-01" + "'", str4, "--04-01");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        org.joda.time.MonthDay monthDay4 = monthDay0.plus((org.joda.time.ReadablePeriod) mutablePeriod3);
        int int5 = monthDay0.getDayOfMonth();
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        long long4 = dateTimeZone0.nextTransition(23L);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfMonth((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDate9.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate9.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = localDate17.isSupported(dateTimeFieldType20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int23 = localDate17.indexOf(dateTimeFieldType22);
        int int24 = dateTime15.get(dateTimeFieldType22);
        java.lang.String str25 = dateTimeFieldType22.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate7.withField(dateTimeFieldType22, (-25200000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -25200000 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9972000000L + "'", long4 == 9972000000L);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "weekyearOfCentury" + "'", str25, "weekyearOfCentury");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.years();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = unsupportedDurationField27.getValue((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        int int19 = localDate18.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        int int6 = dateTimeField4.getMinimumValue((long) 2024);
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.MutablePeriod mutablePeriod10 = days9.toMutablePeriod();
        org.joda.time.MonthDay monthDay11 = monthDay7.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        int[] intArray16 = new int[] { '4', 365, 4 };
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = dateTimeField4.set((org.joda.time.ReadablePartial) monthDay7, (-101), intArray16, "1", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[52, 365, 4]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTime();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) months2);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = gregorianChronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology4.millisOfSecond();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        boolean boolean2 = durationField1.isPrecise();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = unsupportedDurationField8.getValue((long) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.format.PeriodPrinter periodPrinter1 = periodFormatter0.getPrinter();
        java.io.Writer writer2 = null;
        org.joda.time.Months months3 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months4 = org.joda.time.Months.THREE;
        org.joda.time.Months months5 = months3.plus(months4);
        org.joda.time.Months months7 = months3.multipliedBy(365);
        org.joda.time.Months months8 = org.joda.time.Months.FIVE;
        boolean boolean9 = months3.isLessThan(months8);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            periodPrinter1.printTo(writer2, (org.joda.time.ReadablePeriod) months3, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(periodPrinter1);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.Months months19 = org.joda.time.Months.FIVE;
        org.joda.time.Months months20 = months19.negated();
        org.joda.time.LocalDate localDate21 = localDate18.minus((org.joda.time.ReadablePeriod) months20);
        int int22 = localDate18.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate18.withWeekOfWeekyear((-25200000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -25200000 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(months20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.DurationFieldType durationFieldType19 = unsupportedDurationField8.getType();
        long long20 = unsupportedDurationField8.getUnitMillis();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.printZeroNever();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = unsupportedDurationField8.getValueAsLong((-230400000L), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod2.setSeconds(2024);
        mutablePeriod2.addMonths(10);
        org.joda.time.Period period16 = mutablePeriod2.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn((org.joda.time.ReadablePeriod) period16, (long) 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P10M1DT2024S");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.standard();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.joda.time.Months months0 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months1 = org.joda.time.Months.THREE;
        org.joda.time.Months months2 = months0.plus(months1);
        org.joda.time.Months months4 = months0.multipliedBy(365);
        org.joda.time.Months months5 = org.joda.time.Months.FIVE;
        boolean boolean6 = months0.isLessThan(months5);
        int int7 = months0.getValue();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        long long0 = org.joda.time.DateTimeUtils.currentTimeMillis();
// flaky:         org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1711990936182L + "'", long0 == 1711990936182L);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.joda.time.IllegalInstantException illegalInstantException1 = new org.joda.time.IllegalInstantException("March");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTimeNoMillis();
        org.joda.time.format.DateTimeParser dateTimeParser13 = dateTimeFormatter12.getParser();
        boolean boolean14 = gregorianChronology3.equals((java.lang.Object) dateTimeFormatter12);
        org.joda.time.DurationField durationField15 = gregorianChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months17 = org.joda.time.Months.TWELVE;
        boolean boolean18 = dateTimeZone16.equals((java.lang.Object) months17);
        org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology19.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField22 = gregorianChronology19.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) durationField15, (org.joda.time.Chronology) gregorianChronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.UnsupportedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(months17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(gregorianChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeElementParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = dateTimeFormatter0.parseDateTime("2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2024-04-01T00:00:00.000-07:00/2024...\" is malformed at \"24-04-01T00:00:00.000-07:00/2024...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        long long7 = interval6.toDurationMillis();
        java.lang.String str8 = interval6.toString();
        org.joda.time.Days days9 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval6);
        org.joda.time.ReadableInterval readableInterval10 = null;
        boolean boolean11 = interval6.isAfter(readableInterval10);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00" + "'", str8, "2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00");
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = gregorianChronology3.hours();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder2.appendPrefix("Mar", "1");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder2.appendSecondsWithMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        java.lang.String str11 = gregorianChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withEra(0);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean17 = localDate13.equals((java.lang.Object) periodType16);
        org.joda.time.LocalDate localDate19 = localDate13.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean25 = localDate21.equals((java.lang.Object) periodType24);
        org.joda.time.LocalDate localDate27 = localDate21.plusWeeks((int) (byte) 100);
        boolean boolean28 = localDate13.isAfter((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate30 = localDate27.plusDays(20);
        org.joda.time.LocalDate.Property property31 = localDate30.monthOfYear();
        boolean boolean33 = property31.equals((java.lang.Object) "P3M");
        int int34 = property31.getMaximumValueOverall();
        org.joda.time.LocalDate localDate35 = property31.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months37 = org.joda.time.Months.TWELVE;
        boolean boolean38 = dateTimeZone36.equals((java.lang.Object) months37);
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology39.yearOfEra();
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology39.millisOfSecond();
        org.joda.time.Months months42 = org.joda.time.Months.TWELVE;
        int[] intArray44 = gregorianChronology39.get((org.joda.time.ReadablePeriod) months42, (long) (-28800000));
        // The following exception was thrown during execution in test generation
        try {
            gregorianChronology3.validate((org.joda.time.ReadablePartial) localDate35, intArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GregorianChronology[America/Los_Angeles]" + "'", str11, "GregorianChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 12 + "'", int34 == 12);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(months37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(gregorianChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(months42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        long long19 = offsetDateTimeField14.roundHalfCeiling((long) 24);
        org.joda.time.DurationField durationField20 = offsetDateTimeField14.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230400000L) + "'", long19 == (-230400000L));
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.PeriodType periodType1 = periodFormatter0.getParseType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = periodFormatter0.parsePeriod("2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2024-04-01T00:00:00.000-07:00/20...\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNull(periodType1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.year();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.joda.time.Months months0 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months1 = org.joda.time.Months.THREE;
        org.joda.time.Months months2 = months0.plus(months1);
        org.joda.time.Months months4 = months1.multipliedBy((int) (short) 10);
        int int5 = months4.size();
        org.joda.time.Months months6 = months4.negated();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(months6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        int int5 = localDate4.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(0);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean11 = localDate7.equals((java.lang.Object) periodType10);
        org.joda.time.LocalDate localDate13 = localDate7.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean15 = localDate13.isSupported(dateTimeFieldType14);
        int int16 = localDate13.getYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate19.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = localDate27.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int33 = localDate27.indexOf(dateTimeFieldType32);
        int int34 = dateTime25.get(dateTimeFieldType32);
        java.lang.String str35 = dateTimeFormatter17.print((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime25.getZone();
        org.joda.time.DateTime dateTime37 = localDate13.toDateTimeAtStartOfDay(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate13.minusYears(14);
        boolean boolean40 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate39);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 14 + "'", int5 == 14);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2026 + "'", int16 == 2026);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 24 + "'", int34 == 24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2024W141" + "'", str35, "2024W141");
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        long long19 = offsetDateTimeField14.roundHalfCeiling((long) 24);
        java.lang.String str20 = offsetDateTimeField14.getName();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230400000L) + "'", long19 == (-230400000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "weekyearOfCentury" + "'", str20, "weekyearOfCentury");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(0);
        int int10 = localDate7.getYear();
        org.joda.time.LocalDate localDate12 = localDate7.plusMonths(10);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2026 + "'", int10 == 2026);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        int int19 = offsetDateTimeField14.get(9972000000L);
        int int22 = offsetDateTimeField14.getDifference((long) 0, (long) 365);
        long long25 = offsetDateTimeField14.getDifferenceAsLong(24L, (long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = unsupportedDurationField8.getMillis((long) 365);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int int2 = org.joda.time.field.FieldUtils.safeMultiply((int) (byte) 1, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.minuteOfHour();
        int int7 = dateTimeField5.getMinimumValue(716L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months7 = org.joda.time.Months.THREE;
        org.joda.time.Months months8 = months6.plus(months7);
        org.joda.time.Months months10 = months7.multipliedBy((int) (short) 10);
        int int11 = months10.size();
        int[] intArray13 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months10, (-53999965L));
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        int int16 = days15.getValue();
        org.joda.time.PeriodType periodType17 = days15.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = months10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Months cannot be compared to class org.joda.time.Days");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        int int5 = dateTimeField4.getMaximumValue();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField4.getAsText(69, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "69" + "'", str8, "69");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 57600032L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4765776004800000L + "'", long1 == 4765776004800000L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.yearMonth();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.Days days3 = org.joda.time.Days.daysIn(readableInterval2);
        org.joda.time.MutablePeriod mutablePeriod4 = days3.toMutablePeriod();
        org.joda.time.Days days6 = days3.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType7 = days6.getFieldType();
        boolean boolean8 = days1.isSupported(durationFieldType7);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        int int4 = property2.get();
        org.joda.time.DurationField durationField5 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime8 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime11 = localDate10.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDate14.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate22.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int28 = localDate22.indexOf(dateTimeFieldType27);
        int int29 = dateTime20.get(dateTimeFieldType27);
        java.lang.String str30 = dateTimeFieldType27.toString();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType27.getDurationType();
        boolean boolean32 = localDate10.isSupported(durationFieldType31);
        boolean boolean33 = localDate7.isSupported(durationFieldType31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months35 = org.joda.time.Months.TWELVE;
        boolean boolean36 = dateTimeZone34.equals((java.lang.Object) months35);
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone34);
        long long43 = gregorianChronology37.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology37.year();
        org.joda.time.DurationField durationField45 = durationFieldType31.getField((org.joda.time.Chronology) gregorianChronology37);
        boolean boolean46 = months0.isSupported(durationFieldType31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days47 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) months0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P11M");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 24 + "'", int29 == 24);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "weekyearOfCentury" + "'", str30, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(months35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(gregorianChronology37);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-53999965L) + "'", long43 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(0);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean11 = localDate7.equals((java.lang.Object) periodType10);
        org.joda.time.LocalDate localDate13 = localDate7.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra(0);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean19 = localDate15.equals((java.lang.Object) periodType18);
        org.joda.time.LocalDate localDate21 = localDate15.plusWeeks((int) (byte) 100);
        boolean boolean22 = localDate7.isAfter((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate localDate24 = localDate21.plusDays(20);
        org.joda.time.LocalDate.Property property25 = localDate24.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = localDate27.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate27.toDateTimeAtCurrentTime(dateTimeZone32);
        boolean boolean34 = property25.equals((java.lang.Object) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months36 = org.joda.time.Months.TWELVE;
        boolean boolean37 = dateTimeZone35.equals((java.lang.Object) months36);
        org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField39 = gregorianChronology38.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(dateTimeZone40);
        org.joda.time.LocalDate localDate43 = localDate41.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = localDate41.isSupported(dateTimeFieldType44);
        boolean boolean47 = localDate41.equals((java.lang.Object) (byte) 10);
        int[] intArray49 = null;
        int[] intArray51 = dateTimeField39.addWrapPartial((org.joda.time.ReadablePartial) localDate41, (int) (short) 10, intArray49, 0);
        int int52 = property25.compareTo((org.joda.time.ReadablePartial) localDate41);
        int int53 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate41);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(months36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(gregorianChronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(intArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        long long4 = dateTimeZone0.nextTransition(23L);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9972000000L + "'", long4 == 9972000000L);
        org.junit.Assert.assertNotNull(iSOChronology6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        java.lang.String str13 = gregorianChronology3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GregorianChronology[America/Los_Angeles]" + "'", str13, "GregorianChronology[America/Los_Angeles]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField2 = iSOChronology1.weeks();
        long long6 = iSOChronology1.add((long) (short) 1, (long) (byte) 1, 20);
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) "P0D", (org.joda.time.Chronology) iSOChronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"P0D\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21L + "'", long6 == 21L);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTime dateTime17 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.MonthDay monthDay19 = new org.joda.time.MonthDay(10L);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localDate1.compareTo((org.joda.time.ReadablePartial) monthDay19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = days1.getFieldType((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        int int4 = localDate3.getYear();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2024) + "'", int4 == (-2024));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = unsupportedDurationField8.add((long) 2026, (-5756400001L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.plusMonths(24);
        java.lang.String str4 = monthDay3.toString();
        org.joda.time.Chronology chronology5 = monthDay3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField10 = gregorianChronology9.minutes();
        org.joda.time.Months months11 = org.joda.time.Months.FIVE;
        months11.setValue(0);
        int[] intArray16 = gregorianChronology9.get((org.joda.time.ReadablePeriod) months11, 0L, 0L);
        org.joda.time.MonthDay monthDay17 = monthDay3.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate19.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        boolean boolean31 = localDate27.isSupported(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int33 = localDate27.indexOf(dateTimeFieldType32);
        int int34 = dateTime25.get(dateTimeFieldType32);
        java.lang.String str35 = dateTimeFieldType32.toString();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType32.getDurationType();
        java.lang.String str37 = durationFieldType36.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay39 = monthDay3.withFieldAdded(durationFieldType36, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--04-01" + "'", str4, "--04-01");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 24 + "'", int34 == 24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "weekyearOfCentury" + "'", str35, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "weekyears" + "'", str37, "weekyears");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        org.joda.time.DurationField durationField18 = offsetDateTimeField14.getDurationField();
        org.joda.time.DurationField durationField19 = offsetDateTimeField14.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean25 = localDate21.equals((java.lang.Object) periodType24);
        org.joda.time.LocalDate localDate27 = localDate21.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean29 = localDate27.isSupported(dateTimeFieldType28);
        int int30 = localDate27.getYear();
        java.util.Locale locale32 = null;
        java.lang.String str33 = offsetDateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDate27, 3, locale32);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2026 + "'", int30 == 2026);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "3" + "'", str33, "3");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = monthDay0.getFieldType(0);
        org.joda.time.MonthDay monthDay4 = monthDay0.minusMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay6 = monthDay4.withDayOfMonth(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(monthDay4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        org.joda.time.PeriodType periodType6 = days4.getPeriodType();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withEra(0);
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean17 = localDate13.equals((java.lang.Object) periodType16);
        org.joda.time.LocalDate localDate19 = localDate13.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean25 = localDate21.equals((java.lang.Object) periodType24);
        org.joda.time.LocalDate localDate27 = localDate21.plusWeeks((int) (byte) 100);
        boolean boolean28 = localDate13.isAfter((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate30 = localDate27.plusDays(20);
        org.joda.time.LocalDate.Property property31 = localDate30.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        boolean boolean37 = localDate33.isSupported(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localDate33.toDateTimeAtCurrentTime(dateTimeZone38);
        boolean boolean40 = property31.equals((java.lang.Object) dateTime39);
        org.joda.time.Instant instant41 = dateTime39.toInstant();
        boolean boolean42 = interval9.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = nameProvider0.getName(locale1, "GregorianChronology[America/Los_Angeles]", "-08:00");
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.yearOfCentury();
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.MutablePeriod mutablePeriod10 = days9.toMutablePeriod();
        org.joda.time.MonthDay monthDay11 = monthDay7.plus((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months13 = org.joda.time.Months.TWELVE;
        boolean boolean14 = dateTimeZone12.equals((java.lang.Object) months13);
        org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = localDate18.isSupported(dateTimeFieldType21);
        boolean boolean24 = localDate18.equals((java.lang.Object) (byte) 10);
        int[] intArray26 = null;
        int[] intArray28 = dateTimeField16.addWrapPartial((org.joda.time.ReadablePartial) localDate18, (int) (short) 10, intArray26, 0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = localDate30.isSupported(dateTimeFieldType33);
        boolean boolean36 = localDate30.equals((java.lang.Object) (byte) 10);
        int int37 = localDate30.size();
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeField16.getAsText((org.joda.time.ReadablePartial) localDate30, locale38);
        int[] intArray40 = localDate30.getValues();
        // The following exception was thrown during execution in test generation
        try {
            gregorianChronology3.validate((org.joda.time.ReadablePartial) monthDay11, intArray40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gregorianChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(intArray28);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "92" + "'", str39, "92");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[2024, 4, 1]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.minus((int) (byte) -1);
        org.joda.time.Days days10 = days8.minus(100);
        java.lang.String str11 = days8.toString();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P1D" + "'", str11, "P1D");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.millisOfDay();
        org.joda.time.DurationField durationField7 = gregorianChronology3.weeks();
        long long10 = durationField7.add((-31507200000L), (-20));
        long long13 = durationField7.subtract((long) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-43606800000L) + "'", long10 == (-43606800000L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.halfdayOfDay();
        long long8 = dateTimeField5.add((long) 2000, (long) '#');
        int int10 = dateTimeField5.get((-1893049200000L));
        java.util.Locale locale11 = null;
        int int12 = dateTimeField5.getMaximumTextLength(locale11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1512002000L + "'", long8 == 1512002000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long16 = offsetDateTimeField14.roundFloor((-1L));
        org.joda.time.DateTimeField dateTimeField17 = offsetDateTimeField14.getWrappedField();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-230400000L) + "'", long16 == (-230400000L));
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        java.io.Writer writer1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay(dateTimeZone2);
        org.joda.time.MonthDay monthDay5 = monthDay3.minusDays(0);
        org.joda.time.MonthDay monthDay7 = monthDay5.minusDays((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadablePartial) monthDay7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(monthDay7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        org.joda.time.MonthDay monthDay4 = monthDay0.plus((org.joda.time.ReadablePeriod) mutablePeriod3);
        mutablePeriod3.setMinutes((int) '#');
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(monthDay4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.joda.time.field.DividedDateTimeField dividedDateTimeField0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(0);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean6 = localDate2.equals((java.lang.Object) periodType5);
        org.joda.time.LocalDate localDate8 = localDate2.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean10 = localDate8.isSupported(dateTimeFieldType9);
        org.joda.time.IllegalFieldValueException illegalFieldValueException14 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType9, (java.lang.Number) 2024, (java.lang.Number) 100.0d, (java.lang.Number) 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.RemainderDateTimeField remainderDateTimeField15 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField0, dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        int int5 = days1.getDays();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        int[] intArray8 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months6, (long) (-28800000));
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gregorianChronology3.hours();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.plusMonths(24);
        java.lang.String str4 = monthDay3.toString();
        org.joda.time.Chronology chronology5 = monthDay3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DurationField durationField10 = gregorianChronology9.minutes();
        org.joda.time.Months months11 = org.joda.time.Months.FIVE;
        months11.setValue(0);
        int[] intArray16 = gregorianChronology9.get((org.joda.time.ReadablePeriod) months11, 0L, 0L);
        org.joda.time.MonthDay monthDay17 = monthDay3.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology9);
        // The following exception was thrown during execution in test generation
        try {
            monthDay3.setValue((int) (short) 100, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--12-31" + "'", str4, "--12-31");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(monthDay17);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDate1.toString("P3M", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        org.joda.time.DateTimeField dateTimeField22 = property19.getField();
        java.util.Locale locale23 = null;
        int int24 = property19.getMaximumTextLength(locale23);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.joda.time.Months months1 = org.joda.time.Months.months(23);
        org.junit.Assert.assertNotNull(months1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        int int6 = localDate1.getDayOfYear();
        org.joda.time.LocalDate localDate8 = localDate1.minusWeeks(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate1.withField(dateTimeFieldType9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 365 + "'", int6 == 365);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoProvider zoneInfoProvider1 = new org.joda.time.tz.ZoneInfoProvider(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No file directory provided");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        long long19 = offsetDateTimeField14.roundHalfCeiling((long) 24);
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.Days days22 = org.joda.time.Days.daysIn(readableInterval21);
        org.joda.time.MutablePeriod mutablePeriod23 = days22.toMutablePeriod();
        org.joda.time.MonthDay monthDay24 = monthDay20.plus((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months27 = org.joda.time.Months.TWELVE;
        boolean boolean28 = dateTimeZone26.equals((java.lang.Object) months27);
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        long long35 = gregorianChronology29.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone36 = gregorianChronology29.getZone();
        org.joda.time.DurationField durationField37 = gregorianChronology29.months();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology29.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField40 = new org.joda.time.field.OffsetDateTimeField(dateTimeField38, (int) (byte) -1);
        long long43 = offsetDateTimeField40.set((long) (-25200000), (int) (byte) 10);
        long long45 = offsetDateTimeField40.roundHalfCeiling((long) 24);
        java.lang.String str46 = offsetDateTimeField40.getName();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = null;
        boolean boolean52 = localDate48.isSupported(dateTimeFieldType51);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = localDate48.toDateTimeAtCurrentTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months56 = org.joda.time.Months.TWELVE;
        boolean boolean57 = dateTimeZone55.equals((java.lang.Object) months56);
        org.joda.time.chrono.GregorianChronology gregorianChronology58 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone55);
        org.joda.time.DateTimeField dateTimeField59 = gregorianChronology58.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate(dateTimeZone60);
        org.joda.time.LocalDate localDate63 = localDate61.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = null;
        boolean boolean65 = localDate61.isSupported(dateTimeFieldType64);
        boolean boolean67 = localDate61.equals((java.lang.Object) (byte) 10);
        int[] intArray69 = null;
        int[] intArray71 = dateTimeField59.addWrapPartial((org.joda.time.ReadablePartial) localDate61, (int) (short) 10, intArray69, 0);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate(dateTimeZone72);
        org.joda.time.LocalDate localDate75 = localDate73.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = null;
        boolean boolean77 = localDate73.isSupported(dateTimeFieldType76);
        boolean boolean79 = localDate73.equals((java.lang.Object) (byte) 10);
        int int80 = localDate73.size();
        java.util.Locale locale81 = null;
        java.lang.String str82 = dateTimeField59.getAsText((org.joda.time.ReadablePartial) localDate73, locale81);
        int[] intArray83 = localDate73.getValues();
        int int84 = offsetDateTimeField40.getMinimumValue((org.joda.time.ReadablePartial) localDate48, intArray83);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray86 = offsetDateTimeField14.addWrapField((org.joda.time.ReadablePartial) monthDay20, 12, intArray83, 2026);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230400000L) + "'", long19 == (-230400000L));
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(monthDay24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(months27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-53999965L) + "'", long35 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1893049200000L) + "'", long43 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-230400000L) + "'", long45 == (-230400000L));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "weekyearOfCentury" + "'", str46, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(months56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(gregorianChronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(intArray71);
        org.junit.Assert.assertNotNull(localDate75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str82 + "' != '" + "365" + "'", str82, "365");
        org.junit.Assert.assertNotNull(intArray83);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1969, 12, 31]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.joda.time.PeriodType periodType1 = periodType0.withMinutesRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        java.lang.String str29 = unsupportedDurationField8.toString();
        org.joda.time.DurationFieldType durationFieldType30 = unsupportedDurationField8.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = unsupportedDurationField8.getDifference(0L, 31824000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnsupportedDurationField[hours]" + "'", str29, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType30);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        long long19 = offsetDateTimeField14.roundHalfCeiling((long) 24);
        java.lang.String str20 = offsetDateTimeField14.getName();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate22.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = localDate22.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months30 = org.joda.time.Months.TWELVE;
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) months30);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology32.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        boolean boolean39 = localDate35.isSupported(dateTimeFieldType38);
        boolean boolean41 = localDate35.equals((java.lang.Object) (byte) 10);
        int[] intArray43 = null;
        int[] intArray45 = dateTimeField33.addWrapPartial((org.joda.time.ReadablePartial) localDate35, (int) (short) 10, intArray43, 0);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        org.joda.time.LocalDate localDate49 = localDate47.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = localDate47.isSupported(dateTimeFieldType50);
        boolean boolean53 = localDate47.equals((java.lang.Object) (byte) 10);
        int int54 = localDate47.size();
        java.util.Locale locale55 = null;
        java.lang.String str56 = dateTimeField33.getAsText((org.joda.time.ReadablePartial) localDate47, locale55);
        int[] intArray57 = localDate47.getValues();
        int int58 = offsetDateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) localDate22, intArray57);
        long long60 = offsetDateTimeField14.roundHalfCeiling(31824000000L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230400000L) + "'", long19 == (-230400000L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "weekyearOfCentury" + "'", str20, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(months30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(gregorianChronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(intArray45);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "365" + "'", str56, "365");
        org.junit.Assert.assertNotNull(intArray57);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[1969, 12, 31]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 31824000000L + "'", long60 == 31824000000L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology3.hourOfDay();
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        long long7 = interval6.toDurationMillis();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDate9.isSupported(dateTimeFieldType12);
        org.joda.time.Interval interval14 = localDate9.toInterval();
        boolean boolean15 = interval6.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = localDate17.isSupported(dateTimeFieldType20);
        org.joda.time.Interval interval22 = localDate17.toInterval();
        long long23 = interval22.toDurationMillis();
        boolean boolean24 = interval6.isAfter((org.joda.time.ReadableInterval) interval22);
        long long25 = interval6.getStartMillis();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 86400000L + "'", long23 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-57600000L) + "'", long25 == (-57600000L));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months3 = org.joda.time.Months.TWELVE;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) months3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        long long11 = gregorianChronology5.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology5.year();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology5.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField16 = new org.joda.time.field.OffsetDateTimeField(dateTimeField13, dateTimeFieldType14, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField20 = new org.joda.time.field.OffsetDateTimeField(dateTimeField1, dateTimeFieldType14, 0, 4, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The offset cannot be zero");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-53999965L) + "'", long11 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        boolean boolean13 = mutablePeriod2.equals((java.lang.Object) 0L);
        mutablePeriod2.addWeeks((int) 'a');
        mutablePeriod2.setYears(2024);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate6.isSupported(dateTimeFieldType9);
        boolean boolean12 = localDate6.equals((java.lang.Object) (byte) 10);
        int[] intArray14 = null;
        int[] intArray16 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) localDate6, (int) (short) 10, intArray14, 0);
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtStartOfDay();
        long long18 = dateTime17.getMillis();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-57600000L) + "'", long18 == (-57600000L));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("ISOChronology[America/Los_Angeles]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime3 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate5.isSupported(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDate13.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int19 = localDate13.indexOf(dateTimeFieldType18);
        int int20 = dateTime11.get(dateTimeFieldType18);
        org.joda.time.Days days21 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtCurrentTime();
        boolean boolean26 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = localDate28.isSupported(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localDate28.toDateTimeAtCurrentTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = localDate36.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int42 = localDate36.indexOf(dateTimeFieldType41);
        int int43 = dateTime34.get(dateTimeFieldType41);
        java.lang.String str44 = dateTimeFieldType41.toString();
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType41.getDurationType();
        java.lang.String str46 = durationFieldType45.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int47 = org.joda.time.base.BaseSingleFieldPeriod.between(readableInstant0, (org.joda.time.ReadableInstant) dateTime25, durationFieldType45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 69 + "'", int20 == 69);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 69 + "'", int43 == 69);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "weekyearOfCentury" + "'", str44, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "weekyears" + "'", str46, "weekyears");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        long long7 = interval6.toDurationMillis();
        java.lang.String str8 = interval6.toString();
        org.joda.time.Days days9 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval6);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtStartOfDay();
        boolean boolean13 = interval6.contains((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00" + "'", str8, "1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00");
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.joda.time.Months months0 = org.joda.time.Months.FIVE;
        org.joda.time.Months months1 = months0.negated();
        int int2 = months1.getMonths();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendSeparatorIfFieldsAfter("ISOChronology[America/Los_Angeles]");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.minimumPrintedDigits(100);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.plusMonths(24);
        org.joda.time.MonthDay monthDay5 = new org.joda.time.MonthDay(9972000000L);
        int[] intArray6 = monthDay5.getValues();
        monthDay3.setValues(intArray6);
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[4, 26]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate.Property property6 = localDate1.dayOfYear();
        java.util.Locale locale7 = null;
        int int8 = property6.getMaximumShortTextLength(locale7);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate6.isSupported(dateTimeFieldType9);
        boolean boolean12 = localDate6.equals((java.lang.Object) (byte) 10);
        int[] intArray14 = null;
        int[] intArray16 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) localDate6, (int) (short) 10, intArray14, 0);
        boolean boolean17 = dateTimeField4.isSupported();
        long long19 = dateTimeField4.remainder(1711954800000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField4.getType();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int int0 = org.joda.time.MonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.Months months2 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period3 = months2.toPeriod();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months5 = org.joda.time.Months.THREE;
        org.joda.time.Months months6 = months4.plus(months5);
        org.joda.time.Months months7 = months2.plus(months5);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        boolean boolean9 = months7.isSupported(durationFieldType8);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(durationFieldType8, "GregorianChronology[America/Los_Angeles]");
        boolean boolean12 = periodType0.isSupported(durationFieldType8);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField13 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = unsupportedDurationField13.getMillis(12, 1735545600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(unsupportedDurationField13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int int2 = org.joda.time.field.FieldUtils.safeAdd(40, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 140 + "'", int2 == 140);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.daysIn(readableInterval5);
        org.joda.time.Days days7 = days1.plus(days6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        int int10 = days9.getValue();
        org.joda.time.PeriodType periodType11 = days9.getPeriodType();
        boolean boolean12 = days1.isGreaterThan(days9);
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(days13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = gregorianChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = gregorianChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.getMaximumValue();
        java.lang.String str24 = property19.getAsShortText();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Dec" + "'", str24, "Dec");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate8.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = localDate16.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int22 = localDate16.indexOf(dateTimeFieldType21);
        int int23 = dateTime14.get(dateTimeFieldType21);
        java.lang.String str24 = dateTimeFieldType21.toString();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType21.getDurationType();
        boolean boolean26 = localDate4.isSupported(durationFieldType25);
        boolean boolean27 = localDate1.isSupported(durationFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months29 = org.joda.time.Months.TWELVE;
        boolean boolean30 = dateTimeZone28.equals((java.lang.Object) months29);
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone28);
        long long37 = gregorianChronology31.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology31.year();
        org.joda.time.DurationField durationField39 = durationFieldType25.getField((org.joda.time.Chronology) gregorianChronology31);
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology31.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 69 + "'", int23 == 69);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyearOfCentury" + "'", str24, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(months29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(gregorianChronology31);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-53999965L) + "'", long37 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("1/1/70");
        java.lang.String str2 = jodaTimePermission1.getName();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        boolean boolean5 = dateTimeZone3.equals((java.lang.Object) months4);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        org.joda.time.DurationField durationField7 = gregorianChronology6.minutes();
        org.joda.time.Months months8 = org.joda.time.Months.FIVE;
        months8.setValue(0);
        int[] intArray13 = gregorianChronology6.get((org.joda.time.ReadablePeriod) months8, 0L, 0L);
        org.joda.time.DurationField durationField14 = gregorianChronology6.eras();
        jodaTimePermission1.checkGuard((java.lang.Object) durationField14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1/1/70" + "'", str2, "1/1/70");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.Days days3 = days1.multipliedBy((int) (byte) 100);
        org.joda.time.Duration duration4 = days1.toStandardDuration();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTimeNoMillis();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withZone(dateTimeZone1);
        org.joda.time.ReadWritableInstant readWritableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dateTimeFormatter0.parseInto(readWritableInstant3, "P3M", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        java.lang.String str29 = unsupportedDurationField8.toString();
        org.joda.time.DurationFieldType durationFieldType30 = unsupportedDurationField8.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = unsupportedDurationField8.getMillis(100L, 1512002000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnsupportedDurationField[hours]" + "'", str29, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType30);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.standard();
        java.util.Locale locale1 = null;
        org.joda.time.format.PeriodFormatter periodFormatter2 = periodFormatter0.withLocale(locale1);
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(periodFormatter2);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusDays(0);
        org.joda.time.MonthDay monthDay5 = monthDay3.minusDays((int) ' ');
        int int6 = monthDay3.size();
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.time();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = unsupportedDurationField8.getDifferenceAsLong((long) (-1), (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        int int3 = org.joda.time.field.FieldUtils.getWrappedValue(2026, (-1969), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-44) + "'", int3 == (-44));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        java.lang.String str1 = months0.toString();
        java.lang.Object obj2 = null;
        boolean boolean3 = months0.equals(obj2);
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P11M" + "'", str1, "P11M");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.MonthDay monthDay5 = org.joda.time.MonthDay.now((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.minuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate.Property property6 = localDate1.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate1.withDayOfWeek(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        int int3 = days1.getDays();
        org.joda.time.Months months4 = org.joda.time.Months.FIVE;
        org.joda.time.Months months5 = months4.negated();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months7 = org.joda.time.Months.THREE;
        org.joda.time.Months months8 = months6.plus(months7);
        org.joda.time.Months months10 = months6.multipliedBy(365);
        org.joda.time.Months months11 = org.joda.time.Months.FIVE;
        boolean boolean12 = months6.isLessThan(months11);
        boolean boolean13 = months4.isLessThan(months6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = days1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) months6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.joda.time.Days cannot be compared to class org.joda.time.Months");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate5.isSupported(dateTimeFieldType8);
        org.joda.time.Interval interval10 = localDate5.toInterval();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = localDate5.equals((java.lang.Object) dateTimeZone11);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, 1L);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dateTimeZone11.isLocalDateTimeGap(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        java.lang.String str29 = unsupportedDurationField8.toString();
        java.lang.Object obj30 = null;
        boolean boolean31 = unsupportedDurationField8.equals(obj30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay((java.lang.Object) unsupportedDurationField8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.UnsupportedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnsupportedDurationField[hours]" + "'", str29, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        mutablePeriod2.setDays(9);
        mutablePeriod2.addWeeks((int) 'a');
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.Days days8 = org.joda.time.Days.daysIn(readableInterval7);
        org.joda.time.MutablePeriod mutablePeriod9 = days8.toMutablePeriod();
        org.joda.time.Days days11 = days8.multipliedBy((int) (byte) 0);
        org.joda.time.Days days13 = org.joda.time.Days.days(0);
        boolean boolean14 = days11.isLessThan(days13);
        org.joda.time.Days days16 = days13.minus(365);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = localDate18.isSupported(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = localDate26.isSupported(dateTimeFieldType29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int32 = localDate26.indexOf(dateTimeFieldType31);
        int int33 = dateTime24.get(dateTimeFieldType31);
        java.lang.String str34 = dateTimeFieldType31.toString();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType31.getDurationType();
        java.lang.String str36 = durationFieldType35.toString();
        boolean boolean37 = days13.isSupported(durationFieldType35);
        mutablePeriod2.setPeriod((org.joda.time.ReadablePeriod) days13);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 69 + "'", int33 == 69);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "weekyearOfCentury" + "'", str34, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "weekyears" + "'", str36, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.Days days2 = org.joda.time.Days.daysIn(readableInterval1);
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        org.joda.time.MonthDay monthDay4 = monthDay0.plus((org.joda.time.ReadablePeriod) mutablePeriod3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = monthDay0.getField(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(monthDay4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days8 = days6.dividedBy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.format.PeriodFormatter periodFormatter3 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.format.PeriodPrinter periodPrinter4 = periodFormatter3.getPrinter();
        org.joda.time.format.PeriodParser periodParser5 = null;
        org.joda.time.format.PeriodFormatter periodFormatter6 = new org.joda.time.format.PeriodFormatter(periodPrinter4, periodParser5);
        boolean boolean7 = localDate1.equals((java.lang.Object) periodFormatter6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = periodFormatter6.parsePeriod("P1DT0.010S");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(periodFormatter3);
        org.junit.Assert.assertNotNull(periodPrinter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        int[] intArray8 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months6, (long) (-28800000));
        org.joda.time.PeriodType periodType9 = months6.getPeriodType();
        java.lang.String str10 = months6.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P12M" + "'", str10, "P12M");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate1.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate localDate9 = localDate1.withCenturyOfEra((int) (short) 10);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.Interval interval12 = localDate1.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval13 = interval12.toMutableInterval();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(mutableInterval13);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gregorianChronology3.get(readablePeriod6, 0L, (long) 69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = localDate1.toString("P1DT0.010S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(gregorianChronology0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        long long4 = dateTimeZone0.nextTransition(23L);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone0);
        int int6 = localDate5.getYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months8 = org.joda.time.Months.TWELVE;
        boolean boolean9 = dateTimeZone7.equals((java.lang.Object) months8);
        int int11 = dateTimeZone7.getOffsetFromLocal(0L);
        org.joda.time.Interval interval12 = localDate5.toInterval(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9972000000L + "'", long4 == 9972000000L);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1969 + "'", int6 == 1969);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-28800000) + "'", int11 == (-28800000));
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology3.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        boolean boolean16 = offsetDateTimeField14.isLeap((long) (short) 0);
        org.joda.time.DurationField durationField17 = offsetDateTimeField14.getDurationField();
        long long19 = offsetDateTimeField14.roundHalfCeiling((long) (short) 0);
        int int21 = offsetDateTimeField14.getLeapAmount((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230400000L) + "'", long19 == (-230400000L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.joda.time.Months months0 = org.joda.time.Months.MIN_VALUE;
        org.joda.time.MutablePeriod mutablePeriod1 = months0.toMutablePeriod();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate5.isSupported(dateTimeFieldType8);
        org.joda.time.Interval interval10 = localDate5.toInterval();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = localDate5.equals((java.lang.Object) dateTimeZone11);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, 1L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getShortName((long) 366, locale16);
        java.lang.String str19 = dateTimeZone0.getName((-31507200000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-08:00" + "'", str17, "-08:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-08:00" + "'", str19, "-08:00");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology3.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusDays(0);
        org.joda.time.MonthDay monthDay5 = monthDay1.minusDays(365);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay.Property property7 = monthDay1.property(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.MonthDay monthDay5 = org.joda.time.MonthDay.now((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(0);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean11 = localDate7.equals((java.lang.Object) periodType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean13 = localDate7.isSupported(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay15 = monthDay5.withField(dateTimeFieldType12, (-25200000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.minutes();
        org.joda.time.Months months5 = org.joda.time.Months.FIVE;
        months5.setValue(0);
        int[] intArray10 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months5, 0L, 0L);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gregorianChronology3.getDateTimeMillis(0L, (int) '4', 24, 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology3.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        boolean boolean2 = durationField1.isSupported();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        java.util.Locale locale22 = null;
        int int23 = property19.getMaximumShortTextLength(locale22);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.Months months19 = org.joda.time.Months.FIVE;
        org.joda.time.Months months20 = months19.negated();
        org.joda.time.LocalDate localDate21 = localDate18.minus((org.joda.time.ReadablePeriod) months20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = localDate23.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = localDate31.isSupported(dateTimeFieldType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int37 = localDate31.indexOf(dateTimeFieldType36);
        int int38 = dateTime29.get(dateTimeFieldType36);
        boolean boolean39 = localDate18.isSupported(dateTimeFieldType36);
        org.joda.time.IllegalFieldValueException illegalFieldValueException43 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType36, (java.lang.Number) 2024, (java.lang.Number) 24, (java.lang.Number) (-1.0f));
        boolean boolean44 = org.joda.time.IllegalInstantException.isIllegalInstant((java.lang.Throwable) illegalFieldValueException43);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(months20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 69 + "'", int38 == 69);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.Months months8 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months9 = org.joda.time.Months.THREE;
        org.joda.time.Months months10 = months8.plus(months9);
        org.joda.time.Months months12 = months8.multipliedBy(365);
        boolean boolean13 = localDate1.equals((java.lang.Object) months12);
        org.joda.time.Months months15 = months12.minus((-101));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(months15);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        org.joda.time.Days days7 = days4.plus(100);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate6.isSupported(dateTimeFieldType9);
        boolean boolean12 = localDate6.equals((java.lang.Object) (byte) 10);
        int[] intArray14 = null;
        int[] intArray16 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) localDate6, (int) (short) 10, intArray14, 0);
        int int17 = localDate6.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(intArray16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = localDate18.isSupported(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = localDate26.isSupported(dateTimeFieldType29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int32 = localDate26.indexOf(dateTimeFieldType31);
        int int33 = dateTime24.get(dateTimeFieldType31);
        java.lang.String str34 = dateTimeFieldType31.toString();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType31.getDurationType();
        org.joda.time.LocalDate localDate37 = localDate1.withFieldAdded(durationFieldType35, 1969);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 69 + "'", int33 == 69);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "weekyearOfCentury" + "'", str34, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(localDate37);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology3.era();
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate.Property property6 = localDate1.dayOfYear();
        int int7 = property6.getMaximumValue();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property6.getAsText(locale8);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "365" + "'", str9, "365");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        int int18 = offsetDateTimeField14.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = offsetDateTimeField14.set((long) ' ', 2024);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.minutes();
        org.joda.time.Months months5 = org.joda.time.Months.FIVE;
        months5.setValue(0);
        int[] intArray10 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months5, 0L, 0L);
        org.joda.time.Period period11 = months5.toPeriod();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusWeeks((-101));
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        int int2 = localDate1.size();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean11 = localDate4.equals((java.lang.Object) dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDate1.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.Days days14 = org.joda.time.Days.daysIn(readableInterval13);
        int int15 = days14.getValue();
        org.joda.time.PeriodType periodType16 = days14.getPeriodType();
        org.joda.time.Days days18 = days14.dividedBy(2026);
        boolean boolean19 = dateTimeZone10.equals((java.lang.Object) days14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = gregorianChronology3.weekyears();
        int int17 = durationField14.getDifference((long) (byte) 10, (-1893049200000L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = localDate12.isSupported(dateTimeFieldType15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int18 = localDate12.indexOf(dateTimeFieldType17);
        int int19 = dateTime10.get(dateTimeFieldType17);
        java.lang.String str20 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) dateTime10, dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadableInstant) dateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 69 + "'", int19 == 69);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970W013" + "'", str20, "1970W013");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.Months months2 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period3 = months2.toPeriod();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months5 = org.joda.time.Months.THREE;
        org.joda.time.Months months6 = months4.plus(months5);
        org.joda.time.Months months7 = months2.plus(months5);
        org.joda.time.Months months8 = org.joda.time.Months.FIVE;
        months8.setValue(0);
        boolean boolean11 = months5.isGreaterThan(months8);
        boolean boolean12 = periodType1.equals((java.lang.Object) months5);
        org.joda.time.Months months13 = months5.negated();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(months13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay monthDay4 = property2.setCopy(20);
        org.joda.time.MonthDay monthDay6 = property2.setCopy(4);
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        int int9 = property2.get();
        int int10 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertNotNull(monthDay6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        java.io.Writer writer1 = null;
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay(9972000000L);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadablePartial) monthDay3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatterBuilder2.toPrinter();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.Days days5 = org.joda.time.Days.daysIn(readableInterval4);
        org.joda.time.MutablePeriod mutablePeriod6 = days5.toMutablePeriod();
        org.joda.time.Days days8 = days5.multipliedBy((int) (byte) 0);
        org.joda.time.Days days10 = org.joda.time.Days.days(0);
        boolean boolean11 = days8.isLessThan(days10);
        org.joda.time.Days days13 = days10.minus(365);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate15.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDate15.toDateTimeAtCurrentTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = localDate23.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int29 = localDate23.indexOf(dateTimeFieldType28);
        int int30 = dateTime21.get(dateTimeFieldType28);
        java.lang.String str31 = dateTimeFieldType28.toString();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType28.getDurationType();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = days10.isSupported(durationFieldType32);
        java.util.Locale locale35 = null;
        int int36 = periodPrinter3.calculatePrintedLength((org.joda.time.ReadablePeriod) days10, locale35);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodPrinter3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 69 + "'", int30 == 69);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "weekyearOfCentury" + "'", str31, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "weekyears" + "'", str33, "weekyears");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.daysIn(readableInterval5);
        org.joda.time.Days days7 = days1.plus(days6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        int int10 = days9.getValue();
        org.joda.time.PeriodType periodType11 = days9.getPeriodType();
        boolean boolean12 = days1.isGreaterThan(days9);
        int int13 = days1.getDays();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.hourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        boolean boolean3 = days1.equals((java.lang.Object) 1512002000L);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        int int9 = localDate8.getYear();
        long long11 = gregorianChronology3.set((org.joda.time.ReadablePartial) localDate8, (long) 20);
        org.joda.time.LocalDate localDate13 = localDate8.plusMonths(7);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MonthDay monthDay15 = new org.joda.time.MonthDay(dateTimeZone14);
        org.joda.time.MonthDay monthDay17 = monthDay15.minusDays(0);
        org.joda.time.MonthDay monthDay19 = monthDay17.minusDays((int) ' ');
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.Days days21 = org.joda.time.Days.daysIn(readableInterval20);
        org.joda.time.MutablePeriod mutablePeriod22 = days21.toMutablePeriod();
        org.joda.time.Weeks weeks23 = days21.toStandardWeeks();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.joda.time.base.BaseSingleFieldPeriod.between((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) monthDay19, (org.joda.time.ReadablePeriod) days21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDate8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1969) + "'", int9 == (-1969));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-124271280421980L) + "'", long11 == (-124271280421980L));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(mutablePeriod22);
        org.junit.Assert.assertNotNull(weeks23);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate1.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate localDate9 = localDate1.withCenturyOfEra((int) (short) 10);
        org.joda.time.LocalDate localDate11 = localDate1.withYearOfEra(14);
        org.joda.time.LocalDate.Property property12 = localDate1.dayOfYear();
        int int13 = localDate1.getYearOfEra();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1969 + "'", int13 == 1969);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.get();
        org.joda.time.LocalDate localDate24 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months26 = org.joda.time.Months.TWELVE;
        boolean boolean27 = dateTimeZone25.equals((java.lang.Object) months26);
        org.joda.time.chrono.GregorianChronology gregorianChronology28 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = gregorianChronology28.getZone();
        java.lang.String str31 = dateTimeZone29.getShortName((long) (byte) 100);
        org.joda.time.DateTime dateTime32 = localDate24.toDateTimeAtCurrentTime(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(months26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(gregorianChronology28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-08:00" + "'", str31, "-08:00");
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.format.PeriodPrinter periodPrinter1 = periodFormatter0.getPrinter();
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.Months months4 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period5 = months4.toPeriod();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months7 = org.joda.time.Months.THREE;
        org.joda.time.Months months8 = months6.plus(months7);
        org.joda.time.Months months9 = months4.plus(months7);
        org.joda.time.Months months10 = org.joda.time.Months.FIVE;
        months10.setValue(0);
        boolean boolean13 = months7.isGreaterThan(months10);
        java.util.Locale locale15 = null;
        int int16 = periodPrinter1.countFieldsToPrint((org.joda.time.ReadablePeriod) months7, 0, locale15);
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(periodPrinter1);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.Days days6 = org.joda.time.Days.days(0);
        boolean boolean7 = days4.isLessThan(days6);
        int int8 = days4.getDays();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate10.isSupported(dateTimeFieldType13);
        org.joda.time.Interval interval15 = localDate10.toInterval();
        long long16 = interval15.toDurationMillis();
        java.lang.String str17 = interval15.toString();
        org.joda.time.Days days18 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval15);
        boolean boolean19 = days4.isLessThan(days18);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 86400000L + "'", long16 == 86400000L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00" + "'", str17, "1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00");
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.joda.time.Months months0 = org.joda.time.Months.TWO;
        int int1 = months0.getMonths();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        long long2 = org.joda.time.field.FieldUtils.safeSubtract((long) 7, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        java.lang.String str29 = unsupportedDurationField8.toString();
        java.lang.Object obj30 = null;
        boolean boolean31 = unsupportedDurationField8.equals(obj30);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = unsupportedDurationField8.getValueAsLong((long) 100, 1512002000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnsupportedDurationField[hours]" + "'", str29, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getShortName(locale1, "hours", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.Months months14 = org.joda.time.Months.ELEVEN;
        java.lang.String str15 = months14.toString();
        org.joda.time.Period period16 = months14.toPeriod();
        int[] intArray18 = gregorianChronology3.get((org.joda.time.ReadablePeriod) period16, (long) 70);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P11M" + "'", str15, "P11M");
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 70]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.joda.time.Months months0 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months1 = org.joda.time.Months.THREE;
        org.joda.time.Months months2 = months0.plus(months1);
        org.joda.time.Months months4 = months0.multipliedBy(365);
        org.joda.time.Months months5 = org.joda.time.Months.FIVE;
        boolean boolean6 = months0.isLessThan(months5);
        int int7 = months0.getMonths();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = monthDay0.getFieldType(0);
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay((java.lang.Object) monthDay0);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months5 = org.joda.time.Months.TWELVE;
        boolean boolean6 = dateTimeZone4.equals((java.lang.Object) months5);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology7.millisOfDay();
        boolean boolean11 = dateTimeField10.isSupported();
        boolean boolean12 = monthDay0.equals((java.lang.Object) boolean11);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(gregorianChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.centuryOfEra();
        java.lang.String str6 = dateTimeField5.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateTimeField[centuryOfEra]" + "'", str6, "DateTimeField[centuryOfEra]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.hourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay monthDay4 = property2.setCopy(20);
        org.joda.time.MonthDay monthDay6 = property2.setCopy(4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = property2.getAsShortText(locale7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertNotNull(monthDay6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "31" + "'", str8, "31");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("1/1/70");
        org.joda.time.JodaTimePermission jodaTimePermission3 = new org.joda.time.JodaTimePermission("1/1/70");
        java.lang.String str4 = jodaTimePermission3.getName();
        boolean boolean5 = jodaTimePermission1.implies((java.security.Permission) jodaTimePermission3);
        java.lang.String str6 = jodaTimePermission1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1/1/70" + "'", str4, "1/1/70");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(\"org.joda.time.JodaTimePermission\" \"1/1/70\")" + "'", str6, "(\"org.joda.time.JodaTimePermission\" \"1/1/70\")");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        java.lang.String str11 = dateTimeZone10.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        int int14 = dateTimeZone10.getOffsetFromLocal(21L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "America/Los_Angeles" + "'", str11, "America/Los_Angeles");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-28800000) + "'", int14 == (-28800000));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.get();
        org.joda.time.LocalDate localDate24 = property19.roundFloorCopy();
        org.joda.time.DurationField durationField25 = property19.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        boolean boolean16 = offsetDateTimeField14.isLeap((long) (short) 0);
        org.joda.time.DurationField durationField17 = offsetDateTimeField14.getDurationField();
        long long19 = offsetDateTimeField14.roundHalfCeiling((long) (short) 0);
        org.joda.time.DateTimeField dateTimeField20 = offsetDateTimeField14.getWrappedField();
        int int22 = offsetDateTimeField14.get((long) (-44));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230400000L) + "'", long19 == (-230400000L));
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 70 + "'", int22 == 70);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        java.util.Locale locale1 = periodFormatter0.getLocale();
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = periodFormatter0.withParseType(periodType2);
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNotNull(periodFormatter3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDate20.toDateTimeAtStartOfDay();
        long long22 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = localDate18.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-57600000L) + "'", long22 == (-57600000L));
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.joda.time.Days days1 = org.joda.time.Days.days((-1));
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = unsupportedDurationField8.getValueAsLong((-53999965L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField2 = iSOChronology0.millis();
        java.lang.String str3 = iSOChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology0.getDateTimeMillis(2, 11, 1, 2024, 0, 60, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str3, "ISOChronology[America/Los_Angeles]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) months2);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withZone(dateTimeZone1);
        int int6 = dateTimeFormatter5.getDefaultYear();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("Mar");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Mar\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod2.addMillis((int) (short) 10);
        mutablePeriod2.setWeeks((int) (short) -1);
        mutablePeriod2.clear();
        mutablePeriod2.clear();
        mutablePeriod2.setMinutes(0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        org.joda.time.Interval interval26 = localDate21.toInterval();
        long long27 = interval26.toDurationMillis();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = localDate29.isSupported(dateTimeFieldType32);
        org.joda.time.Interval interval34 = localDate29.toInterval();
        boolean boolean35 = interval26.contains((org.joda.time.ReadableInterval) interval34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = localDate37.isSupported(dateTimeFieldType40);
        org.joda.time.Interval interval42 = localDate37.toInterval();
        long long43 = interval42.toDurationMillis();
        java.lang.String str44 = interval42.toString();
        boolean boolean45 = interval26.isAfter((org.joda.time.ReadableInterval) interval42);
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval42);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = null;
        boolean boolean52 = localDate48.isSupported(dateTimeFieldType51);
        org.joda.time.Interval interval53 = localDate48.toInterval();
        org.joda.time.Interval interval54 = interval53.toInterval();
        mutablePeriod2.add((org.joda.time.ReadableInterval) interval54);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 86400000L + "'", long27 == 86400000L);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 86400000L + "'", long43 == 86400000L);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00" + "'", str44, "1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(interval54);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.joda.time.ReadableInstant readableInstant0 = null;
        long long1 = org.joda.time.DateTimeUtils.getInstantMillis(readableInstant0);
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.year();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        java.lang.String str11 = gregorianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GregorianChronology[America/Los_Angeles]" + "'", str11, "GregorianChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = days4.getFieldType();
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.minus((int) (byte) -1);
        org.joda.time.Days days10 = days8.minus(2026);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay1 = org.joda.time.MonthDay.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        int int9 = localDate8.getYear();
        long long11 = gregorianChronology3.set((org.joda.time.ReadablePartial) localDate8, (long) 20);
        org.joda.time.LocalDate localDate13 = localDate8.plusMonths(7);
        org.joda.time.LocalDate.Property property14 = localDate8.year();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDate8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1969) + "'", int9 == (-1969));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-124271280421980L) + "'", long11 == (-124271280421980L));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTimeNoMillis();
        java.io.Writer writer1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.withEra(0);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean7 = localDate3.equals((java.lang.Object) periodType6);
        org.joda.time.LocalDate localDate9 = localDate3.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(0);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean15 = localDate11.equals((java.lang.Object) periodType14);
        org.joda.time.LocalDate localDate17 = localDate11.plusWeeks((int) (byte) 100);
        boolean boolean18 = localDate3.isAfter((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate localDate20 = localDate17.plusDays(20);
        org.joda.time.LocalDate.Property property21 = localDate20.monthOfYear();
        boolean boolean23 = property21.equals((java.lang.Object) "P3M");
        int int24 = property21.getMaximumValueOverall();
        int int25 = property21.getMaximumValue();
        org.joda.time.LocalDate localDate26 = property21.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadablePartial) localDate26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.daysIn(readableInterval5);
        org.joda.time.Days days7 = days1.plus(days6);
        org.joda.time.DurationFieldType durationFieldType8 = days7.getFieldType();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate.Property property6 = localDate1.dayOfYear();
        int int7 = property6.getMaximumValue();
        java.util.Locale locale8 = null;
        int int9 = property6.getMaximumTextLength(locale8);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property6.getAsShortText(locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate13.toDateTimeAtStartOfDay();
        boolean boolean15 = property6.equals((java.lang.Object) localDate13);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 365 + "'", int7 == 365);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "365" + "'", str11, "365");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.daysIn(readableInterval5);
        org.joda.time.Days days7 = days1.plus(days6);
        org.joda.time.Duration duration8 = days7.toStandardDuration();
        long long9 = org.joda.time.DateTimeUtils.getDurationMillis((org.joda.time.ReadableDuration) duration8);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatterBuilder2.toPrinter();
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = new org.joda.time.format.PeriodFormatter(periodPrinter3, periodParser4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodPrinter3);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        int int3 = property2.get();
        org.joda.time.MonthDay monthDay5 = property2.addToCopy(31);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertNotNull(monthDay5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = gregorianChronology0.millisOfSecond();
        org.joda.time.DurationField durationField3 = gregorianChronology0.minutes();
        org.junit.Assert.assertNotNull(gregorianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) months2);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.hourOfHalfday();
        int int6 = dateTimeField5.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(0);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean12 = localDate8.equals((java.lang.Object) periodType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean14 = localDate8.isSupported(dateTimeFieldType13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDate8, 2, locale16);
        java.lang.String str18 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        org.joda.time.Months months28 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period29 = months28.toPeriod();
        org.joda.time.Months months30 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months31 = org.joda.time.Months.THREE;
        org.joda.time.Months months32 = months30.plus(months31);
        org.joda.time.Months months33 = months28.plus(months31);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.hours();
        boolean boolean35 = months33.isSupported(durationFieldType34);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField36 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType34);
        int int37 = unsupportedDurationField27.compareTo((org.joda.time.DurationField) unsupportedDurationField36);
        boolean boolean38 = unsupportedDurationField36.isSupported();
        boolean boolean39 = localDate8.equals((java.lang.Object) unsupportedDurationField36);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2" + "'", str17, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "12/31/69" + "'", str18, "12/31/69");
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertNotNull(months28);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(months30);
        org.junit.Assert.assertNotNull(months31);
        org.junit.Assert.assertNotNull(months32);
        org.junit.Assert.assertNotNull(months33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks(2024);
        int int21 = localDate18.getEra();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDate18.getValue(140);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 140");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        org.joda.time.Interval interval12 = interval9.toInterval();
        org.joda.time.MutableInterval mutableInterval13 = interval9.toMutableInterval();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(mutableInterval13);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        long long4 = dateTimeZone0.nextTransition(23L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) (byte) -1, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9972000000L + "'", long4 == 9972000000L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-08:00" + "'", str7, "-08:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Pacific Standard Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gregorianChronology3.getDateTimeMillis(2026, 0, 2000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        int int10 = localDate7.getYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDate13.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int27 = localDate21.indexOf(dateTimeFieldType26);
        int int28 = dateTime19.get(dateTimeFieldType26);
        java.lang.String str29 = dateTimeFormatter11.print((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime19.getZone();
        org.joda.time.DateTime dateTime31 = localDate7.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate7.minusYears(14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate35 = localDate7.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1971 + "'", int10 == 1971);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 69 + "'", int28 == 69);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970W013" + "'", str29, "1970W013");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDate33);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months3 = org.joda.time.Months.TWELVE;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) months3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        long long11 = gregorianChronology5.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology5.year();
        org.joda.time.DurationField durationField13 = gregorianChronology5.eras();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology5.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay15 = new org.joda.time.MonthDay(14, (int) (short) -1, (org.joda.time.Chronology) gregorianChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-53999965L) + "'", long11 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.joda.time.Months months0 = org.joda.time.Months.FIVE;
        org.joda.time.Months months1 = months0.negated();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months6 = months2.multipliedBy(365);
        org.joda.time.Months months7 = org.joda.time.Months.FIVE;
        boolean boolean8 = months2.isLessThan(months7);
        boolean boolean9 = months0.isLessThan(months2);
        org.joda.time.Months months10 = months2.negated();
        org.joda.time.Period period11 = months2.toPeriod();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay monthDay4 = property2.addToCopy(0);
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(monthDay4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "31" + "'", str6, "31");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusDays(0);
        org.joda.time.MonthDay monthDay5 = monthDay1.minusDays(365);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = monthDay5.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        int int2 = localDate1.size();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean11 = localDate4.equals((java.lang.Object) dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDate1.toDateTimeAtCurrentTime(dateTimeZone10);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone10.getShortName((-31507200000L), locale14);
        java.lang.String str16 = dateTimeZone10.getID();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-08:00" + "'", str15, "-08:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "America/Los_Angeles" + "'", str16, "America/Los_Angeles");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.Months months9 = months5.multipliedBy(24);
        java.lang.Object obj10 = null;
        boolean boolean11 = months9.equals(obj10);
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        long long19 = offsetDateTimeField14.roundFloor((long) 365);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-230400000L) + "'", long19 == (-230400000L));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        int int10 = localDate7.getYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDate13.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int27 = localDate21.indexOf(dateTimeFieldType26);
        int int28 = dateTime19.get(dateTimeFieldType26);
        java.lang.String str29 = dateTimeFormatter11.print((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime19.getZone();
        org.joda.time.DateTime dateTime31 = localDate7.toDateTimeAtStartOfDay(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate7.minusYears(14);
        org.joda.time.LocalTime localTime34 = null;
        org.joda.time.DateTime dateTime35 = localDate7.toDateTime(localTime34);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1971 + "'", int10 == 1971);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 69 + "'", int28 == 69);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970W013" + "'", str29, "1970W013");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        java.lang.String str29 = unsupportedDurationField8.toString();
        java.lang.Object obj30 = null;
        boolean boolean31 = unsupportedDurationField8.equals(obj30);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = unsupportedDurationField8.getDifference(100L, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnsupportedDurationField[hours]" + "'", str29, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.joda.time.Months months1 = org.joda.time.Months.months((int) (short) 100);
        org.junit.Assert.assertNotNull(months1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.io.DataInput dataInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.tz.DateTimeZoneBuilder.readFrom(dataInput0, "DateTimeField[centuryOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months7 = org.joda.time.Months.THREE;
        org.joda.time.Months months8 = months6.plus(months7);
        org.joda.time.Months months10 = months7.multipliedBy((int) (short) 10);
        int int11 = months10.size();
        int[] intArray13 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months10, (-53999965L));
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology3.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology1);
        boolean boolean3 = dateTimeFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(gregorianChronology1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.get();
        int int24 = property19.getMaximumValue();
        boolean boolean26 = property19.equals((java.lang.Object) 10.0d);
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.Days days28 = org.joda.time.Days.daysIn(readableInterval27);
        org.joda.time.MutablePeriod mutablePeriod29 = days28.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = localDate31.isSupported(dateTimeFieldType34);
        org.joda.time.Interval interval36 = localDate31.toInterval();
        long long37 = interval36.toDurationMillis();
        mutablePeriod29.setPeriod((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Interval interval39 = interval36.toInterval();
        org.joda.time.DateTime dateTime40 = interval36.getStart();
        int int41 = property19.getDifference((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDate localDate42 = property19.withMinimumValue();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 86400000L + "'", long37 == 86400000L);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 23 + "'", int41 == 23);
        org.junit.Assert.assertNotNull(localDate42);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology3.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        long long19 = offsetDateTimeField14.roundCeiling(1711954800000L);
        long long21 = offsetDateTimeField14.roundHalfFloor(1735545600000L);
        java.util.Locale locale22 = null;
        int int23 = offsetDateTimeField14.getMaximumTextLength(locale22);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1735545600000L + "'", long19 == 1735545600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1735545600000L + "'", long21 == 1735545600000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod2.addMillis((int) (short) 10);
        mutablePeriod2.setWeeks((int) (short) -1);
        mutablePeriod2.clear();
        mutablePeriod2.clear();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        boolean boolean22 = dateTimeZone20.equals((java.lang.Object) months21);
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = gregorianChronology23.getZone();
        boolean boolean25 = property19.equals((java.lang.Object) dateTimeZone24);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(dateTimeZone24);
        org.joda.time.LocalTime localTime27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = localDate29.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = localDate29.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDate localDate37 = localDate29.withCenturyOfEra((int) (short) 10);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.Interval interval40 = localDate29.toInterval(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDate26.toDateTime(localTime27, dateTimeZone39);
        int int43 = dateTimeZone39.getOffsetFromLocal((long) 92);
        boolean boolean45 = dateTimeZone39.isStandardOffset((long) 1971);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-28800000) + "'", int43 == (-28800000));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.Months months6 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period7 = months6.toPeriod();
        org.joda.time.Months months8 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months9 = org.joda.time.Months.THREE;
        org.joda.time.Months months10 = months8.plus(months9);
        org.joda.time.Months months11 = months6.plus(months9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        boolean boolean13 = months11.isSupported(durationFieldType12);
        java.lang.String str14 = durationFieldType12.toString();
        int int15 = periodType4.indexOf(durationFieldType12);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hours" + "'", str14, "hours");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate20.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localDate20.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = localDate28.isSupported(dateTimeFieldType31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int34 = localDate28.indexOf(dateTimeFieldType33);
        int int35 = dateTime26.get(dateTimeFieldType33);
        java.lang.String str36 = dateTimeFieldType33.toString();
        boolean boolean37 = localDate15.isSupported(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months39 = org.joda.time.Months.TWELVE;
        boolean boolean40 = dateTimeZone38.equals((java.lang.Object) months39);
        long long42 = dateTimeZone38.nextTransition(23L);
        java.util.Locale locale44 = null;
        java.lang.String str45 = dateTimeZone38.getName((long) (byte) -1, locale44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) boolean37, dateTimeZone38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 69 + "'", int35 == 69);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "weekyearOfCentury" + "'", str36, "weekyearOfCentury");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(months39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9972000000L + "'", long42 == 9972000000L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-08:00" + "'", str45, "-08:00");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.Months months19 = org.joda.time.Months.FIVE;
        org.joda.time.Months months20 = months19.negated();
        org.joda.time.LocalDate localDate21 = localDate18.minus((org.joda.time.ReadablePeriod) months20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        boolean boolean27 = localDate23.isSupported(dateTimeFieldType26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localDate23.toDateTimeAtCurrentTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = localDate31.isSupported(dateTimeFieldType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int37 = localDate31.indexOf(dateTimeFieldType36);
        int int38 = dateTime29.get(dateTimeFieldType36);
        boolean boolean39 = localDate18.isSupported(dateTimeFieldType36);
        org.joda.time.IllegalFieldValueException illegalFieldValueException43 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType36, (java.lang.Number) 2024, (java.lang.Number) 24, (java.lang.Number) (-1.0f));
        org.joda.time.IllegalFieldValueException illegalFieldValueException45 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType36, "dayOfMonth");
        org.joda.time.DurationFieldType durationFieldType46 = illegalFieldValueException45.getDurationFieldType();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(months20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 69 + "'", int38 == 69);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(durationFieldType46);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = months0.negated();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        java.util.Locale locale18 = null;
        int int19 = offsetDateTimeField14.getMaximumTextLength(locale18);
        long long22 = offsetDateTimeField14.add((-97L), 140);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 4418063999903L + "'", long22 == 4418063999903L);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.year();
        long long8 = dateTimeField6.roundCeiling(1711990937679L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1735718400000L + "'", long8 == 1735718400000L);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) months2);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter0.withZone(dateTimeZone1);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter5.getPrinter();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimePrinter6);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.util.Collection<org.joda.time.DateTimeFieldType> dateTimeFieldTypeCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.joda.time.format.ISODateTimeFormat.forFields(dateTimeFieldTypeCollection0, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The fields must not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks(2024);
        int int21 = localDate18.getEra();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withEra(0);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean27 = localDate23.equals((java.lang.Object) periodType26);
        org.joda.time.LocalDate localDate29 = localDate23.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.withEra(0);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean35 = localDate31.equals((java.lang.Object) periodType34);
        org.joda.time.LocalDate localDate37 = localDate31.plusWeeks((int) (byte) 100);
        boolean boolean38 = localDate23.isAfter((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTime dateTime39 = localDate23.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(dateTimeZone40);
        org.joda.time.LocalDate localDate43 = localDate41.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        boolean boolean45 = localDate41.isSupported(dateTimeFieldType44);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDate41.toDateTimeAtCurrentTime(dateTimeZone46);
        int int48 = localDate23.compareTo((org.joda.time.ReadablePartial) localDate41);
        org.joda.time.DateTime dateTime49 = localDate41.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime50 = localDate18.toDateTime((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.yearOfCentury();
        org.joda.time.DurationField durationField6 = gregorianChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MonthDay monthDay9 = new org.joda.time.MonthDay(dateTimeZone8);
        org.joda.time.MonthDay.Property property10 = monthDay9.dayOfMonth();
        org.joda.time.MonthDay monthDay12 = property10.setCopy(20);
        org.joda.time.MonthDay monthDay14 = property10.setCopy(4);
        org.joda.time.Months months15 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period16 = months15.toPeriod();
        org.joda.time.MonthDay monthDay17 = monthDay14.plus((org.joda.time.ReadablePeriod) period16);
        long long19 = gregorianChronology3.set((org.joda.time.ReadablePartial) monthDay17, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(monthDay12);
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(months15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(monthDay17);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-4924800000L) + "'", long19 == (-4924800000L));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate.Property property6 = localDate1.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.setCopy((-20));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -20 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay2 = new org.joda.time.MonthDay((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField15 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, dateTimeFieldType13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The offset cannot be zero");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        mutablePeriod2.setMinutes((int) (byte) 1);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean17 = localDate15.isSupported(dateTimeFieldType16);
        int int18 = localDate15.getYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localDate21.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = localDate29.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int35 = localDate29.indexOf(dateTimeFieldType34);
        int int36 = dateTime27.get(dateTimeFieldType34);
        java.lang.String str37 = dateTimeFormatter19.print((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTime27.getZone();
        org.joda.time.DateTime dateTime39 = localDate15.toDateTimeAtStartOfDay(dateTimeZone38);
        int int40 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate15);
        int int41 = localDate15.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight42 = localDate15.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1971 + "'", int18 == 1971);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 69 + "'", int36 == 69);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1970W013" + "'", str37, "1970W013");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 335 + "'", int41 == 335);
        org.junit.Assert.assertNotNull(dateMidnight42);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.joda.time.Months months0 = org.joda.time.Months.TWO;
        org.joda.time.Months months2 = months0.dividedBy(12);
        org.joda.time.DurationFieldType durationFieldType3 = months2.getFieldType();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DurationField durationField5 = durationFieldType3.getField(chronology4);
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate5.isSupported(dateTimeFieldType8);
        org.joda.time.Interval interval10 = localDate5.toInterval();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = localDate5.equals((java.lang.Object) dateTimeZone11);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, 1L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean20 = localDate16.equals((java.lang.Object) periodType19);
        org.joda.time.LocalDate localDate22 = localDate16.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.withEra(0);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean28 = localDate24.equals((java.lang.Object) periodType27);
        org.joda.time.LocalDate localDate30 = localDate24.plusWeeks((int) (byte) 100);
        boolean boolean31 = localDate16.isAfter((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate localDate33 = localDate30.plusDays(20);
        org.joda.time.LocalDate.Property property34 = localDate33.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = localDate36.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtCurrentTime(dateTimeZone41);
        boolean boolean43 = property34.equals((java.lang.Object) dateTime42);
        int int44 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.LocalDate localDate45 = org.joda.time.LocalDate.now(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-28800000) + "'", int44 == (-28800000));
        org.junit.Assert.assertNotNull(localDate45);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long16 = offsetDateTimeField14.roundFloor((-1L));
        long long18 = offsetDateTimeField14.roundCeiling((-97L));
        org.joda.time.DurationField durationField19 = offsetDateTimeField14.getDurationField();
        int int20 = offsetDateTimeField14.getMinimumValue();
        boolean boolean22 = offsetDateTimeField14.isLeap((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-230400000L) + "'", long16 == (-230400000L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 31824000000L + "'", long18 == 31824000000L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType0, (-20), 31, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -20 for dayOfMonth must be in the range [31,0]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate8.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = localDate16.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int22 = localDate16.indexOf(dateTimeFieldType21);
        int int23 = dateTime14.get(dateTimeFieldType21);
        java.lang.String str24 = dateTimeFieldType21.toString();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType21.getDurationType();
        boolean boolean26 = localDate4.isSupported(durationFieldType25);
        boolean boolean27 = localDate1.isSupported(durationFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months29 = org.joda.time.Months.TWELVE;
        boolean boolean30 = dateTimeZone28.equals((java.lang.Object) months29);
        org.joda.time.chrono.GregorianChronology gregorianChronology31 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone28);
        long long37 = gregorianChronology31.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology31.year();
        org.joda.time.DurationField durationField39 = durationFieldType25.getField((org.joda.time.Chronology) gregorianChronology31);
        org.joda.time.DateTimeZone dateTimeZone40 = gregorianChronology31.getZone();
        java.lang.String str42 = dateTimeZone40.getName(0L);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 69 + "'", int23 == 69);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyearOfCentury" + "'", str24, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(months29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(gregorianChronology31);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-53999965L) + "'", long37 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-08:00" + "'", str42, "-08:00");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay.Property property3 = monthDay1.monthOfYear();
        org.joda.time.DurationField durationField4 = property3.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(0);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean6 = localDate2.equals((java.lang.Object) periodType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days7 = org.joda.time.Days.daysBetween(readablePartial0, (org.joda.time.ReadablePartial) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) months2);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.hourOfHalfday();
        int int6 = dateTimeField5.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(0);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean12 = localDate8.equals((java.lang.Object) periodType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean14 = localDate8.isSupported(dateTimeFieldType13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDate8, 2, locale16);
        java.lang.String str18 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate8);
        java.io.Writer writer19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer19, readableInstant20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2" + "'", str17, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "12/31/69" + "'", str18, "12/31/69");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.plusMonths(24);
        java.lang.String str4 = monthDay3.toString();
        org.joda.time.Chronology chronology5 = monthDay3.getChronology();
        org.joda.time.MonthDay.Property property6 = monthDay3.monthOfYear();
        org.joda.time.DurationField durationField7 = property6.getRangeDurationField();
        org.junit.Assert.assertNotNull(monthDay3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--12-31" + "'", str4, "--12-31");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        long long1 = org.joda.time.DateTimeUtils.fromJulianDay((double) 20);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-210865032000000L) + "'", long1 == (-210865032000000L));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        java.lang.String str29 = unsupportedDurationField8.toString();
        org.joda.time.DurationFieldType durationFieldType30 = unsupportedDurationField8.getType();
        java.lang.String str31 = unsupportedDurationField8.toString();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnsupportedDurationField[hours]" + "'", str29, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UnsupportedDurationField[hours]" + "'", str31, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay monthDay4 = property2.addToCopy(0);
        org.joda.time.MonthDay monthDay6 = property2.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = monthDay6.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertNotNull(monthDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withDaysRemoved();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months3 = org.joda.time.Months.TWELVE;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) months3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology5.millisOfSecond();
        org.joda.time.Months months8 = org.joda.time.Months.TWELVE;
        int[] intArray10 = gregorianChronology5.get((org.joda.time.ReadablePeriod) months8, (long) (-28800000));
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = gregorianChronology5.weekyears();
        boolean boolean13 = periodType0.equals((java.lang.Object) durationField12);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(gregorianChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        long long15 = gregorianChronology3.add((long) 14, (long) (short) 10, (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 4L + "'", long15 == 4L);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) months2);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        long long10 = gregorianChronology4.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology4.year();
        org.joda.time.DurationField durationField12 = gregorianChronology4.eras();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology4.weekyearOfCentury();
        boolean boolean15 = durationFieldType0.isSupported((org.joda.time.Chronology) gregorianChronology4);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-53999965L) + "'", long10 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("UnsupportedDurationField[hours]", "-1");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        org.joda.time.Months months2 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period3 = months2.toPeriod();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months5 = org.joda.time.Months.THREE;
        org.joda.time.Months months6 = months4.plus(months5);
        org.joda.time.Months months7 = months2.plus(months5);
        org.joda.time.Months months8 = org.joda.time.Months.FIVE;
        months8.setValue(0);
        boolean boolean11 = months5.isGreaterThan(months8);
        boolean boolean12 = periodType1.equals((java.lang.Object) months5);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        boolean boolean14 = months5.isSupported(durationFieldType13);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology3.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        org.joda.time.LocalDate localDate21 = localDate18.minusWeeks((int) '4');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months23 = org.joda.time.Months.TWELVE;
        boolean boolean24 = dateTimeZone22.equals((java.lang.Object) months23);
        org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone22);
        long long31 = gregorianChronology25.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone32 = gregorianChronology25.getZone();
        org.joda.time.DurationField durationField33 = gregorianChronology25.months();
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology25.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField36 = new org.joda.time.field.OffsetDateTimeField(dateTimeField34, (int) (byte) -1);
        long long39 = offsetDateTimeField36.set((long) (-25200000), (int) (byte) 10);
        int int41 = offsetDateTimeField36.get(9972000000L);
        int int43 = offsetDateTimeField36.get((-31507200000L));
        boolean boolean44 = localDate18.equals((java.lang.Object) (-31507200000L));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gregorianChronology25);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-53999965L) + "'", long31 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1893049200000L) + "'", long39 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 70 + "'", int41 == 70);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 69 + "'", int43 == 69);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
        java.util.Locale locale1 = null;
        java.lang.String str4 = defaultNameProvider0.getName(locale1, "10", "25");
        java.util.Locale locale5 = null;
        java.lang.String str8 = defaultNameProvider0.getName(locale5, "365", "--12-31");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        int int19 = offsetDateTimeField14.get(9972000000L);
        int int22 = offsetDateTimeField14.getDifference((long) 0, (long) 365);
        long long24 = offsetDateTimeField14.roundHalfFloor((long) 16);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay((long) (-2024), chronology26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months30 = org.joda.time.Months.TWELVE;
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) months30);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(dateTimeZone33);
        org.joda.time.LocalDate localDate36 = localDate34.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        boolean boolean38 = localDate34.isSupported(dateTimeFieldType37);
        org.joda.time.Interval interval39 = localDate34.toInterval();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean41 = localDate34.equals((java.lang.Object) dateTimeZone40);
        long long43 = dateTimeZone29.getMillisKeepLocal(dateTimeZone40, 1L);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate45.withEra(0);
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean49 = localDate45.equals((java.lang.Object) periodType48);
        org.joda.time.LocalDate localDate51 = localDate45.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone52);
        org.joda.time.LocalDate localDate55 = localDate53.withEra(0);
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean57 = localDate53.equals((java.lang.Object) periodType56);
        org.joda.time.LocalDate localDate59 = localDate53.plusWeeks((int) (byte) 100);
        boolean boolean60 = localDate45.isAfter((org.joda.time.ReadablePartial) localDate59);
        org.joda.time.LocalDate localDate62 = localDate59.plusDays(20);
        org.joda.time.LocalDate.Property property63 = localDate62.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate(dateTimeZone64);
        org.joda.time.LocalDate localDate67 = localDate65.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = null;
        boolean boolean69 = localDate65.isSupported(dateTimeFieldType68);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDate65.toDateTimeAtCurrentTime(dateTimeZone70);
        boolean boolean72 = property63.equals((java.lang.Object) dateTime71);
        int int73 = dateTimeZone29.getOffset((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.Chronology chronology74 = dateTime71.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.days();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months77 = org.joda.time.Months.TWELVE;
        boolean boolean78 = dateTimeZone76.equals((java.lang.Object) months77);
        org.joda.time.chrono.GregorianChronology gregorianChronology79 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone76);
        org.joda.time.LocalDate localDate80 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology79);
        int int81 = localDate80.getWeekOfWeekyear();
        int[] intArray83 = chronology74.get((org.joda.time.ReadablePartial) localDate80, 0L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray85 = offsetDateTimeField14.add((org.joda.time.ReadablePartial) monthDay27, (-101), intArray83, (-20));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-230400000L) + "'", long24 == (-230400000L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(months30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(gregorianChronology32);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(localDate62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-28800000) + "'", int73 == (-28800000));
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(durationField75);
        org.junit.Assert.assertNotNull(dateTimeZone76);
        org.junit.Assert.assertNotNull(months77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(gregorianChronology79);
// flaky:         org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[1969, 12, 31]");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.get();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property19.getAsText(locale24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months27 = org.joda.time.Months.TWELVE;
        boolean boolean28 = dateTimeZone26.equals((java.lang.Object) months27);
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        long long35 = gregorianChronology29.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology29.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology29.hourOfHalfday();
        boolean boolean38 = property19.equals((java.lang.Object) gregorianChronology29);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "December" + "'", str25, "December");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(months27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gregorianChronology29);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-53999965L) + "'", long35 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        int int9 = localDate8.getYear();
        long long11 = gregorianChronology3.set((org.joda.time.ReadablePartial) localDate8, (long) 20);
        org.joda.time.LocalDate localDate13 = localDate8.plusMonths(7);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((-44));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDate8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1969) + "'", int9 == (-1969));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-124271280421980L) + "'", long11 == (-124271280421980L));
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dateTimeFormatter0.parseMillis("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minuteOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int7 = localDate1.indexOf(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months9 = org.joda.time.Months.TWELVE;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) months9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField12 = gregorianChronology11.eras();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField13 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField12);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unsupportedDateTimeField13.getMaximumTextLength(locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField13);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        java.util.Locale locale3 = null;
        java.lang.String str4 = property2.getAsText(locale3);
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "31" + "'", str4, "31");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        boolean boolean19 = unsupportedDurationField17.isSupported();
        java.lang.String str20 = unsupportedDurationField17.getName();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hours" + "'", str20, "hours");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.IllegalFieldValueException illegalFieldValueException9 = new org.joda.time.IllegalFieldValueException(durationFieldType6, "GregorianChronology[America/Los_Angeles]");
        java.lang.Number number10 = illegalFieldValueException9.getLowerBound();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(number10);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("", "");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean8 = localDate4.equals((java.lang.Object) periodType7);
        org.joda.time.LocalDate localDate10 = localDate4.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.withEra(0);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean16 = localDate12.equals((java.lang.Object) periodType15);
        org.joda.time.LocalDate localDate18 = localDate12.plusWeeks((int) (byte) 100);
        boolean boolean19 = localDate4.isAfter((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate21 = localDate18.plusDays(20);
        org.joda.time.Months months22 = org.joda.time.Months.FIVE;
        org.joda.time.Months months23 = months22.negated();
        org.joda.time.LocalDate localDate24 = localDate21.minus((org.joda.time.ReadablePeriod) months23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = localDate26.isSupported(dateTimeFieldType29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localDate26.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(dateTimeZone33);
        org.joda.time.LocalDate localDate36 = localDate34.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        boolean boolean38 = localDate34.isSupported(dateTimeFieldType37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int40 = localDate34.indexOf(dateTimeFieldType39);
        int int41 = dateTime32.get(dateTimeFieldType39);
        boolean boolean42 = localDate21.isSupported(dateTimeFieldType39);
        org.joda.time.IllegalFieldValueException illegalFieldValueException46 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType39, (java.lang.Number) 2024, (java.lang.Number) 24, (java.lang.Number) (-1.0f));
        org.joda.time.IllegalFieldValueException illegalFieldValueException48 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType39, "dayOfMonth");
        illegalFieldValueException2.addSuppressed((java.lang.Throwable) illegalFieldValueException48);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 69 + "'", int41 == 69);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        org.joda.time.Interval interval7 = interval6.toInterval();
        org.joda.time.DateTime dateTime8 = interval6.getEnd();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        java.util.Locale locale18 = null;
        int int19 = offsetDateTimeField14.getMaximumTextLength(locale18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MonthDay monthDay21 = new org.joda.time.MonthDay(dateTimeZone20);
        org.joda.time.MonthDay monthDay23 = monthDay21.minusDays(0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months26 = org.joda.time.Months.TWELVE;
        boolean boolean27 = dateTimeZone25.equals((java.lang.Object) months26);
        org.joda.time.chrono.GregorianChronology gregorianChronology28 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField29 = gregorianChronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology28.millisOfSecond();
        org.joda.time.Months months31 = org.joda.time.Months.TWELVE;
        int[] intArray33 = gregorianChronology28.get((org.joda.time.ReadablePeriod) months31, (long) (-28800000));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = offsetDateTimeField14.set((org.joda.time.ReadablePartial) monthDay21, 0, intArray33, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(months26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(gregorianChronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(months31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0]");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate1.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate1.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property8.addWrapFieldToCopy(2);
        org.joda.time.LocalDate.Property property11 = localDate10.monthOfYear();
        org.joda.time.LocalDate localDate12 = property11.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate14 = property11.addWrapFieldToCopy((-2024));
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.minutes();
        java.lang.String str1 = periodType0.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Minutes" + "'", str1, "Minutes");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay monthDay4 = property2.setCopy(20);
        org.joda.time.MonthDay monthDay6 = property2.setCopy(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay8 = property2.setCopy("1970W013");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970W013\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertNotNull(monthDay6);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.multipliedBy((int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.Days days6 = org.joda.time.Days.daysIn(readableInterval5);
        org.joda.time.Days days7 = days1.plus(days6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.Days days9 = org.joda.time.Days.daysIn(readableInterval8);
        org.joda.time.MutablePeriod mutablePeriod10 = days9.toMutablePeriod();
        org.joda.time.Days days12 = days9.multipliedBy((int) (byte) 0);
        org.joda.time.Days days14 = org.joda.time.Days.days(0);
        boolean boolean15 = days12.isLessThan(days14);
        org.joda.time.Days days17 = days14.minus(365);
        org.joda.time.Days days18 = days7.plus(days17);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = gregorianChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MonthDay monthDay9 = new org.joda.time.MonthDay(dateTimeZone8);
        org.joda.time.MonthDay monthDay11 = monthDay9.plusMonths(24);
        java.lang.String str12 = monthDay11.toString();
        org.joda.time.Chronology chronology13 = monthDay11.getChronology();
        org.joda.time.MonthDay monthDay15 = new org.joda.time.MonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = monthDay15.getFieldType(0);
        org.joda.time.MonthDay monthDay19 = monthDay15.minusMonths((int) (short) 100);
        int[] intArray20 = monthDay15.getValues();
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = dateTimeField7.set((org.joda.time.ReadablePartial) monthDay11, (int) (short) -1, intArray20, "ISOChronology[America/Los_Angeles]", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[America/Los_Angeles]\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(monthDay11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--12-31" + "'", str12, "--12-31");
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(monthDay19);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[12, 31]");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        long long7 = interval6.toDurationMillis();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        long long11 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime10);
        boolean boolean12 = interval6.contains((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months14 = org.joda.time.Months.TWELVE;
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) months14);
        org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate19.isSupported(dateTimeFieldType22);
        boolean boolean25 = localDate19.equals((java.lang.Object) (byte) 10);
        int[] intArray27 = null;
        int[] intArray29 = dateTimeField17.addWrapPartial((org.joda.time.ReadablePartial) localDate19, (int) (short) 10, intArray27, 0);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.withEra(0);
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean36 = localDate32.equals((java.lang.Object) periodType35);
        org.joda.time.LocalDate localDate38 = localDate32.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate40.withEra(0);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean44 = localDate40.equals((java.lang.Object) periodType43);
        org.joda.time.LocalDate localDate46 = localDate40.plusWeeks((int) (byte) 100);
        boolean boolean47 = localDate32.isAfter((org.joda.time.ReadablePartial) localDate46);
        org.joda.time.DateTime dateTime48 = localDate32.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime51 = localDate50.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime52 = localDate50.toDateTimeAtCurrentTime();
        boolean boolean53 = dateTime48.isBefore((org.joda.time.ReadableInstant) dateTime52);
        boolean boolean54 = dateTime30.isEqual((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean55 = interval6.contains((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-57600000L) + "'", long11 == (-57600000L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(gregorianChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.year();
        org.joda.time.DurationField durationField13 = dateTimeField12.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        int int10 = localDate7.getYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDate13.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localDate13.toDateTimeAtCurrentTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int27 = localDate21.indexOf(dateTimeFieldType26);
        int int28 = dateTime19.get(dateTimeFieldType26);
        java.lang.String str29 = dateTimeFormatter11.print((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime19.getZone();
        org.joda.time.DateTime dateTime31 = localDate7.toDateTimeAtStartOfDay(dateTimeZone30);
        int int33 = localDate7.getValue(0);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1971 + "'", int10 == 1971);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 69 + "'", int28 == 69);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970W013" + "'", str29, "1970W013");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1971 + "'", int33 == 1971);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        java.lang.String str29 = unsupportedDurationField8.toString();
        boolean boolean30 = unsupportedDurationField8.isSupported();
        java.lang.String str31 = unsupportedDurationField8.toString();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnsupportedDurationField[hours]" + "'", str29, "UnsupportedDurationField[hours]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UnsupportedDurationField[hours]" + "'", str31, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        long long4 = dateTimeZone0.nextTransition(23L);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone0);
        java.lang.String str6 = dateTimeZone0.toString();
        int int8 = dateTimeZone0.getStandardOffset((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9972000000L + "'", long4 == 9972000000L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "America/Los_Angeles" + "'", str6, "America/Los_Angeles");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-28800000) + "'", int8 == (-28800000));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate8.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = localDate16.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int22 = localDate16.indexOf(dateTimeFieldType21);
        int int23 = dateTime14.get(dateTimeFieldType21);
        java.lang.String str24 = dateTimeFieldType21.toString();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType21.getDurationType();
        boolean boolean26 = localDate4.isSupported(durationFieldType25);
        boolean boolean27 = localDate1.isSupported(durationFieldType25);
        org.joda.time.LocalDate localDate29 = localDate1.minusMonths((int) (byte) 100);
        int int30 = localDate1.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 69 + "'", int23 == 69);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyearOfCentury" + "'", str24, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1969 + "'", int30 == 1969);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
        boolean boolean1 = dateTimeFormatter0.isOffsetParsed();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        java.util.Locale locale1 = periodFormatter0.getLocale();
        org.joda.time.PeriodType periodType2 = periodFormatter0.getParseType();
        boolean boolean3 = periodFormatter0.isPrinter();
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNull(periodType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.Months months9 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period10 = months9.toPeriod();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months12 = org.joda.time.Months.THREE;
        org.joda.time.Months months13 = months11.plus(months12);
        org.joda.time.Months months14 = months9.plus(months12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        boolean boolean16 = months14.isSupported(durationFieldType15);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField17 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType15);
        int int18 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField17);
        org.joda.time.Months months19 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period20 = months19.toPeriod();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months22 = org.joda.time.Months.THREE;
        org.joda.time.Months months23 = months21.plus(months22);
        org.joda.time.Months months24 = months19.plus(months22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        boolean boolean26 = months24.isSupported(durationFieldType25);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField27 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType25);
        int int28 = unsupportedDurationField8.compareTo((org.joda.time.DurationField) unsupportedDurationField27);
        java.lang.String str29 = unsupportedDurationField8.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long31 = unsupportedDurationField8.getValueAsLong(84L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: hours field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertNotNull(months23);
        org.junit.Assert.assertNotNull(months24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(unsupportedDurationField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnsupportedDurationField[hours]" + "'", str29, "UnsupportedDurationField[hours]");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        int[] intArray8 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months6, (long) (-28800000));
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(0);
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfMonth();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) months2);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology4.hourOfHalfday();
        int int6 = dateTimeField5.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(0);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean12 = localDate8.equals((java.lang.Object) periodType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean14 = localDate8.isSupported(dateTimeFieldType13);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDate8, 2, locale16);
        java.lang.String str18 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime21 = localDate20.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime22 = localDate20.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = localDate24.isSupported(dateTimeFieldType27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate24.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate32.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = null;
        boolean boolean36 = localDate32.isSupported(dateTimeFieldType35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int38 = localDate32.indexOf(dateTimeFieldType37);
        int int39 = dateTime30.get(dateTimeFieldType37);
        java.lang.String str40 = dateTimeFieldType37.toString();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType37.getDurationType();
        boolean boolean42 = localDate20.isSupported(durationFieldType41);
        org.joda.time.LocalDate localDate44 = localDate8.withFieldAdded(durationFieldType41, (int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gregorianChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2" + "'", str17, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "12/31/69" + "'", str18, "12/31/69");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 69 + "'", int39 == 69);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "weekyearOfCentury" + "'", str40, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        int int4 = property2.get();
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        org.joda.time.MonthDay monthDay6 = property2.getMonthDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(monthDay6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks(2024);
        int int21 = localDate18.getEra();
        org.joda.time.LocalDate localDate23 = localDate18.withYearOfEra(365);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.withEra(0);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean29 = localDate25.equals((java.lang.Object) periodType28);
        org.joda.time.LocalDate localDate31 = localDate25.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean33 = localDate31.isSupported(dateTimeFieldType32);
        int int34 = localDate31.getYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = localDate37.isSupported(dateTimeFieldType40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate37.toDateTimeAtCurrentTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate45.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = localDate45.isSupported(dateTimeFieldType48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int51 = localDate45.indexOf(dateTimeFieldType50);
        int int52 = dateTime43.get(dateTimeFieldType50);
        java.lang.String str53 = dateTimeFormatter35.print((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTime43.getZone();
        org.joda.time.DateTime dateTime55 = localDate31.toDateTimeAtStartOfDay(dateTimeZone54);
        org.joda.time.LocalDate localDate57 = localDate31.minusYears(14);
        boolean boolean58 = localDate18.isBefore((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalTime localTime59 = null;
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months61 = org.joda.time.Months.TWELVE;
        boolean boolean62 = dateTimeZone60.equals((java.lang.Object) months61);
        long long64 = dateTimeZone60.nextTransition(23L);
        java.util.Locale locale66 = null;
        java.lang.String str67 = dateTimeZone60.getName((long) (byte) -1, locale66);
        java.util.TimeZone timeZone68 = dateTimeZone60.toTimeZone();
        org.joda.time.DateTime dateTime69 = localDate18.toDateTime(localTime59, dateTimeZone60);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1971 + "'", int34 == 1971);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 69 + "'", int52 == 69);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1970W013" + "'", str53, "1970W013");
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(months61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 9972000000L + "'", long64 == 9972000000L);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "-08:00" + "'", str67, "-08:00");
        org.junit.Assert.assertNotNull(timeZone68);
        org.junit.Assert.assertEquals(timeZone68.getDisplayName(), "Pacific Standard Time");
        org.junit.Assert.assertNotNull(dateTime69);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property3 = localDate1.weekOfWeekyear();
        int int4 = property3.getMinimumValue();
        org.joda.time.LocalDate localDate5 = property3.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime2 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime5 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate8.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localDate8.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = localDate16.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int22 = localDate16.indexOf(dateTimeFieldType21);
        int int23 = dateTime14.get(dateTimeFieldType21);
        java.lang.String str24 = dateTimeFieldType21.toString();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType21.getDurationType();
        boolean boolean26 = localDate4.isSupported(durationFieldType25);
        boolean boolean27 = localDate1.isSupported(durationFieldType25);
        org.joda.time.LocalDate.Property property28 = localDate1.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 69 + "'", int23 == 69);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyearOfCentury" + "'", str24, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.joda.time.JodaTimePermission jodaTimePermission1 = new org.joda.time.JodaTimePermission("1/1/70");
        java.lang.String str2 = jodaTimePermission1.getName();
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.monthOfYear();
        jodaTimePermission1.checkGuard((java.lang.Object) dateTimeField5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1/1/70" + "'", str2, "1/1/70");
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.joda.time.Months months0 = org.joda.time.Months.FOUR;
        java.lang.String str1 = months0.toString();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P4M" + "'", str1, "P4M");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.secondOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int7 = localDate1.indexOf(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months9 = org.joda.time.Months.TWELVE;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) months9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField12 = gregorianChronology11.eras();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField13 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = unsupportedDateTimeField13.getAsText((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField13);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        java.lang.String str1 = months0.toString();
        org.joda.time.Months months3 = months0.multipliedBy(4);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        int int5 = months0.get(durationFieldType4);
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P11M" + "'", str1, "P11M");
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        int int10 = localDate7.getYear();
        org.joda.time.LocalDate localDate12 = localDate7.plusDays(1);
        org.joda.time.Months months13 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period14 = months13.toPeriod();
        org.joda.time.LocalDate localDate15 = localDate12.plus((org.joda.time.ReadablePeriod) period14);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1971 + "'", int10 == 1971);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.get();
        java.util.Locale locale24 = null;
        java.lang.String str25 = property19.getAsText(locale24);
        int int26 = property19.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField27 = property19.getField();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "December" + "'", str25, "December");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean9 = localDate7.isSupported(dateTimeFieldType8);
        int int10 = localDate7.getYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months12 = org.joda.time.Months.TWELVE;
        boolean boolean13 = dateTimeZone11.equals((java.lang.Object) months12);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone11);
        long long20 = gregorianChronology14.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone21 = gregorianChronology14.getZone();
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = localDate7.toInterval(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1971 + "'", int10 == 1971);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(months12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gregorianChronology14);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-53999965L) + "'", long20 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "America/Los_Angeles" + "'", str22, "America/Los_Angeles");
        org.junit.Assert.assertNotNull(interval23);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        mutablePeriod2.addMillis((int) (short) 10);
        mutablePeriod2.setMonths(0);
        java.lang.String str16 = mutablePeriod2.toString();
        mutablePeriod2.setHours((-101));
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P1DT0.010S" + "'", str16, "P1DT0.010S");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        int int5 = localDate4.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = localDate11.isSupported(dateTimeFieldType14);
        org.joda.time.Interval interval16 = localDate11.toInterval();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean18 = localDate11.equals((java.lang.Object) dateTimeZone17);
        long long20 = dateTimeZone6.getMillisKeepLocal(dateTimeZone17, 1L);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.withEra(0);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean26 = localDate22.equals((java.lang.Object) periodType25);
        org.joda.time.LocalDate localDate28 = localDate22.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.withEra(0);
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean34 = localDate30.equals((java.lang.Object) periodType33);
        org.joda.time.LocalDate localDate36 = localDate30.plusWeeks((int) (byte) 100);
        boolean boolean37 = localDate22.isAfter((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.LocalDate localDate39 = localDate36.plusDays(20);
        org.joda.time.LocalDate.Property property40 = localDate39.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate42.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = localDate42.isSupported(dateTimeFieldType45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDate42.toDateTimeAtCurrentTime(dateTimeZone47);
        boolean boolean49 = property40.equals((java.lang.Object) dateTime48);
        int int50 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime48);
        long long51 = dateTime48.getMillis();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone52);
        org.joda.time.LocalDate localDate55 = localDate53.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        boolean boolean57 = localDate53.isSupported(dateTimeFieldType56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = localDate53.toDateTimeAtCurrentTime(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate(dateTimeZone60);
        org.joda.time.LocalDate localDate63 = localDate61.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = null;
        boolean boolean65 = localDate61.isSupported(dateTimeFieldType64);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int67 = localDate61.indexOf(dateTimeFieldType66);
        int int68 = dateTime59.get(dateTimeFieldType66);
        java.lang.String str69 = dateTimeFieldType66.toString();
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType66.getDurationType();
        boolean boolean71 = dateTime48.isSupported(dateTimeFieldType66);
        boolean boolean72 = localDate4.isSupported(dateTimeFieldType66);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-28800000) + "'", int50 == (-28800000));
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int68 + "' != '" + 69 + "'", int68 == 69);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "weekyearOfCentury" + "'", str69, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.Months months2 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period3 = months2.toPeriod();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months5 = org.joda.time.Months.THREE;
        org.joda.time.Months months6 = months4.plus(months5);
        org.joda.time.Months months7 = months2.plus(months5);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        boolean boolean9 = months7.isSupported(durationFieldType8);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(durationFieldType8, "GregorianChronology[America/Los_Angeles]");
        boolean boolean12 = periodType0.isSupported(durationFieldType8);
        org.joda.time.field.PreciseDurationField preciseDurationField14 = new org.joda.time.field.PreciseDurationField(durationFieldType8, (long) 20);
        org.joda.time.DurationFieldType durationFieldType15 = preciseDurationField14.getType();
        int int18 = preciseDurationField14.getDifference((-230400000L), 2L);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-11520000) + "'", int18 == (-11520000));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendSuffix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.printZeroRarelyLast();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder3.appendWeeks();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months7 = org.joda.time.Months.THREE;
        org.joda.time.Months months8 = months6.plus(months7);
        org.joda.time.Months months10 = months7.multipliedBy((int) (short) 10);
        int int11 = months10.size();
        int[] intArray13 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months10, (-53999965L));
        org.joda.time.DurationFieldType durationFieldType14 = months10.getFieldType();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendSuffix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendMonths();
        boolean boolean6 = org.joda.time.field.FieldUtils.equals((java.lang.Object) periodFormatterBuilder4, (java.lang.Object) 86400000L);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder4.appendLiteral("hours");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder4.printZeroRarelyLast();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        int int3 = days1.getDays();
        org.joda.time.Weeks weeks4 = days1.toStandardWeeks();
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(weeks4);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int7 = localDate1.indexOf(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months9 = org.joda.time.Months.TWELVE;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) months9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField12 = gregorianChronology11.eras();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField13 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate15.isSupported(dateTimeFieldType18);
        boolean boolean21 = localDate15.equals((java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = unsupportedDateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDate15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        boolean boolean16 = offsetDateTimeField14.isLeap((long) (short) 0);
        long long18 = offsetDateTimeField14.remainder((long) (short) -1);
        java.lang.String str19 = offsetDateTimeField14.toString();
        org.joda.time.DurationField durationField20 = offsetDateTimeField14.getDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 230399999L + "'", long18 == 230399999L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateTimeField[weekyearOfCentury]" + "'", str19, "DateTimeField[weekyearOfCentury]");
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        int int3 = days1.getDays();
        org.joda.time.Days days5 = days1.minus((int) (short) -1);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.centuryOfEra();
        org.joda.time.Months months13 = org.joda.time.Months.FIVE;
        org.joda.time.Months months14 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months15 = org.joda.time.Months.THREE;
        org.joda.time.Months months16 = months14.plus(months15);
        org.joda.time.Months months18 = months15.multipliedBy((int) (short) 10);
        org.joda.time.Months months19 = months13.plus(months18);
        org.joda.time.Months months20 = org.joda.time.Months.TWO;
        org.joda.time.Months months22 = months20.dividedBy(12);
        boolean boolean23 = months19.isLessThan(months22);
        long long26 = gregorianChronology3.add((org.joda.time.ReadablePeriod) months19, (long) 'a', 2024);
        org.joda.time.Months months28 = months19.minus((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(months13);
        org.junit.Assert.assertNotNull(months14);
        org.junit.Assert.assertNotNull(months15);
        org.junit.Assert.assertNotNull(months16);
        org.junit.Assert.assertNotNull(months18);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertNotNull(months20);
        org.junit.Assert.assertNotNull(months22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 159678172800097L + "'", long26 == 159678172800097L);
        org.junit.Assert.assertNotNull(months28);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay.Property property3 = monthDay1.monthOfYear();
        int int4 = monthDay1.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        org.joda.time.DurationField durationField18 = offsetDateTimeField14.getRangeDurationField();
        long long20 = durationField18.getMillis(0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.joda.time.Days days1 = org.joda.time.Days.days(140);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.joda.time.Months months1 = org.joda.time.Months.months(365);
        org.junit.Assert.assertNotNull(months1);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.joda.time.Months months0 = org.joda.time.Months.TWELVE;
        int int1 = months0.getMonths();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate1.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = localDate1.toDateMidnight();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.Months months1 = org.joda.time.Months.TWO;
        org.joda.time.MonthDay monthDay2 = monthDay0.minus((org.joda.time.ReadablePeriod) months1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        boolean boolean5 = dateTimeZone3.equals((java.lang.Object) months4);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        long long10 = gregorianChronology6.add(0L, (long) 24, (int) (byte) 1);
        org.joda.time.MonthDay monthDay11 = monthDay2.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology6);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 24L + "'", long10 == 24L);
        org.junit.Assert.assertNotNull(monthDay11);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(9972000000L);
        int[] intArray2 = monthDay1.getValues();
        int[] intArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            monthDay1.setValues(intArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[4, 26]");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.Interval interval6 = localDate1.toInterval();
        long long7 = interval6.toDurationMillis();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDate9.isSupported(dateTimeFieldType12);
        org.joda.time.Interval interval14 = localDate9.toInterval();
        boolean boolean15 = interval6.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.withEra(0);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean21 = localDate17.equals((java.lang.Object) periodType20);
        org.joda.time.LocalDate localDate23 = localDate17.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.withEra(0);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean29 = localDate25.equals((java.lang.Object) periodType28);
        org.joda.time.LocalDate localDate31 = localDate25.plusWeeks((int) (byte) 100);
        boolean boolean32 = localDate17.isAfter((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate34 = localDate31.plusDays(20);
        org.joda.time.LocalDate.Property property35 = localDate34.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = localDate37.isSupported(dateTimeFieldType40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = localDate37.toDateTimeAtCurrentTime(dateTimeZone42);
        boolean boolean44 = property35.equals((java.lang.Object) dateTime43);
        org.joda.time.Chronology chronology45 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        org.joda.time.LocalDate localDate49 = localDate47.withEra(0);
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean51 = localDate47.equals((java.lang.Object) periodType50);
        org.joda.time.LocalDate localDate53 = localDate47.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean55 = localDate53.isSupported(dateTimeFieldType54);
        org.joda.time.IllegalFieldValueException illegalFieldValueException59 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType54, (java.lang.Number) 2024, (java.lang.Number) 100.0d, (java.lang.Number) 100.0d);
        int int60 = dateTime43.get(dateTimeFieldType54);
        boolean boolean61 = interval14.isBefore((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int60 + "' != '" + 16 + "'", int60 == 16);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        boolean boolean16 = offsetDateTimeField14.isLeap((long) (short) 0);
        org.joda.time.DurationField durationField17 = offsetDateTimeField14.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months19 = org.joda.time.Months.TWELVE;
        boolean boolean20 = dateTimeZone18.equals((java.lang.Object) months19);
        org.joda.time.chrono.GregorianChronology gregorianChronology21 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone18);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = offsetDateTimeField14.getAsText((org.joda.time.ReadablePartial) localDate22, 25, locale24);
        long long27 = offsetDateTimeField14.roundCeiling((long) 2000);
        long long29 = offsetDateTimeField14.remainder(10L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(months19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(gregorianChronology21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "25" + "'", str25, "25");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 31824000000L + "'", long27 == 31824000000L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 230400010L + "'", long29 == 230400010L);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.now(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(monthDay2);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate1.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate1.weekOfWeekyear();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumShortTextLength(locale9);
        int int11 = property8.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.format.PeriodPrinter periodPrinter1 = periodFormatter0.getPrinter();
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser4);
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months7 = org.joda.time.Months.THREE;
        org.joda.time.Months months8 = months6.plus(months7);
        org.joda.time.Months months10 = months6.multipliedBy(365);
        org.joda.time.Months months11 = org.joda.time.Months.FIVE;
        boolean boolean12 = months6.isLessThan(months11);
        org.joda.time.Period period13 = months11.toPeriod();
        java.util.Locale locale15 = null;
        int int16 = periodPrinter1.countFieldsToPrint((org.joda.time.ReadablePeriod) period13, 31, locale15);
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(periodPrinter1);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(months10);
        org.junit.Assert.assertNotNull(months11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.dayTime();
        boolean boolean4 = days1.equals((java.lang.Object) periodType3);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        long long15 = gregorianChronology3.add((long) 92, (long) '4', 12);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology3.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 716L + "'", long15 == 716L);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        int int19 = offsetDateTimeField14.get(9972000000L);
        int int21 = offsetDateTimeField14.get((-31507200000L));
        org.joda.time.DurationField durationField22 = offsetDateTimeField14.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 69 + "'", int21 == 69);
        org.junit.Assert.assertNull(durationField22);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        org.joda.time.ReadableInstant readableInstant20 = null;
        long long21 = property19.getDifferenceAsLong(readableInstant20);
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property19.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months26 = org.joda.time.Months.TWELVE;
        boolean boolean27 = dateTimeZone25.equals((java.lang.Object) months26);
        org.joda.time.chrono.GregorianChronology gregorianChronology28 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone25);
        long long34 = gregorianChronology28.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology28.year();
        org.joda.time.DurationField durationField36 = gregorianChronology28.eras();
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology28.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = gregorianChronology28.hourOfHalfday();
        boolean boolean39 = dateTimeFieldType24.isSupported((org.joda.time.Chronology) gregorianChronology28);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 23L + "'", long21 == 23L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(months26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(gregorianChronology28);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-53999965L) + "'", long34 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter2 = periodFormatterBuilder1.toFormatter();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatter2);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        java.lang.String str2 = periodType1.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PeriodType[Millis]" + "'", str2, "PeriodType[Millis]");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter2 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder0.append(periodPrinter3, periodParser4);
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder5.printZeroIfSupported();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatter2);
        org.junit.Assert.assertNotNull(periodPrinter3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        java.util.Locale locale1 = periodFormatter0.getLocale();
        org.joda.time.PeriodType periodType2 = periodFormatter0.getParseType();
        org.joda.time.Months months3 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period4 = months3.toPeriod();
        org.joda.time.Months months5 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months6 = org.joda.time.Months.THREE;
        org.joda.time.Months months7 = months5.plus(months6);
        org.joda.time.Months months8 = months3.plus(months6);
        org.joda.time.PeriodType periodType9 = months8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = months8.toMutablePeriod();
        int int13 = periodFormatter0.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod10, "--12-31", 2);
        mutablePeriod10.addMillis(6);
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNull(periodType2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Weeks weeks1 = days0.toStandardWeeks();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(weeks1);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        int int19 = offsetDateTimeField14.get(9972000000L);
        int int22 = offsetDateTimeField14.getDifference((long) 0, (long) 365);
        long long24 = offsetDateTimeField14.roundHalfFloor((long) 16);
        java.util.Locale locale26 = null;
        java.lang.String str27 = offsetDateTimeField14.getAsText((long) (-1969), locale26);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 70 + "'", int19 == 70);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-230400000L) + "'", long24 == (-230400000L));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "70" + "'", str27, "70");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        boolean boolean16 = offsetDateTimeField14.isLeap((long) 'a');
        long long18 = offsetDateTimeField14.roundHalfEven((long) ' ');
        int int20 = offsetDateTimeField14.get((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-230400000L) + "'", long18 == (-230400000L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 70 + "'", int20 == 70);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        int int9 = localDate8.getYear();
        long long11 = gregorianChronology3.set((org.joda.time.ReadablePartial) localDate8, (long) 20);
        org.joda.time.LocalDate localDate13 = localDate8.plusMonths(7);
        int int14 = localDate8.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDate8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1969) + "'", int9 == (-1969));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-124271280421980L) + "'", long11 == (-124271280421980L));
        org.junit.Assert.assertNotNull(localDate13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone13 = gregorianChronology3.getZone();
        int int15 = dateTimeZone13.getOffset((long) 1971);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-28800000) + "'", int15 == (-28800000));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.year();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int7 = localDate1.indexOf(dateTimeFieldType6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months9 = org.joda.time.Months.TWELVE;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) months9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField12 = gregorianChronology11.eras();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField13 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField12);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months15 = org.joda.time.Months.TWELVE;
        boolean boolean16 = dateTimeZone14.equals((java.lang.Object) months15);
        org.joda.time.chrono.GregorianChronology gregorianChronology17 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone14);
        long long23 = gregorianChronology17.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = gregorianChronology17.getZone();
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        long long27 = gregorianChronology17.set((org.joda.time.ReadablePartial) monthDay25, 0L);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = monthDay25.getFieldTypes();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = monthDay25.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months32 = org.joda.time.Months.TWELVE;
        boolean boolean33 = dateTimeZone31.equals((java.lang.Object) months32);
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField35 = gregorianChronology34.minutes();
        org.joda.time.Months months36 = org.joda.time.Months.FIVE;
        months36.setValue(0);
        int[] intArray41 = gregorianChronology34.get((org.joda.time.ReadablePeriod) months36, 0L, 0L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = unsupportedDateTimeField13.add((org.joda.time.ReadablePartial) monthDay25, (int) (short) 0, intArray41, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: weekyearOfCentury field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(months9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gregorianChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(months15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gregorianChronology17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-53999965L) + "'", long23 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(months32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(gregorianChronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(months36);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0]");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(365, 19);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        int int3 = property2.get();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        int int7 = property2.get();
        org.joda.time.MonthDay monthDay9 = property2.setCopy(3);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
        org.junit.Assert.assertNotNull(monthDay9);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate1.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate1.weekOfWeekyear();
        int int9 = property8.getMaximumValue();
        org.joda.time.LocalDate localDate10 = property8.roundCeilingCopy();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gregorianChronology3.getDateTimeMillis(23L, (int) '#', 0, 16, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        java.lang.String str1 = months0.toString();
        org.joda.time.DurationFieldType durationFieldType2 = months0.getFieldType();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P11M" + "'", str1, "P11M");
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.lang.Object obj0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(obj0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate5.isSupported(dateTimeFieldType8);
        org.joda.time.Interval interval10 = localDate5.toInterval();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = localDate5.equals((java.lang.Object) dateTimeZone11);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone11, 1L);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean20 = localDate16.equals((java.lang.Object) periodType19);
        org.joda.time.LocalDate localDate22 = localDate16.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.withEra(0);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean28 = localDate24.equals((java.lang.Object) periodType27);
        org.joda.time.LocalDate localDate30 = localDate24.plusWeeks((int) (byte) 100);
        boolean boolean31 = localDate16.isAfter((org.joda.time.ReadablePartial) localDate30);
        org.joda.time.LocalDate localDate33 = localDate30.plusDays(20);
        org.joda.time.LocalDate.Property property34 = localDate33.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(dateTimeZone35);
        org.joda.time.LocalDate localDate38 = localDate36.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = localDate36.isSupported(dateTimeFieldType39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate36.toDateTimeAtCurrentTime(dateTimeZone41);
        boolean boolean43 = property34.equals((java.lang.Object) dateTime42);
        int int44 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime42);
        java.lang.String str46 = dateTimeZone0.getNameKey((long) 40);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-28800000) + "'", int44 == (-28800000));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PST" + "'", str46, "PST");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.yearOfCentury();
        org.joda.time.DurationField durationField6 = gregorianChronology3.minutes();
        org.joda.time.Chronology chronology7 = gregorianChronology3.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.yearOfCentury();
        long long4 = dateTimeField1.set((-210865032000000L), 24);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-211212100800000L) + "'", long4 == (-211212100800000L));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField2 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.year();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.year();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinute();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        boolean boolean13 = mutablePeriod2.equals((java.lang.Object) 0L);
        mutablePeriod2.setYears((int) (short) 10);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        int[] intArray8 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months6, (long) (-28800000));
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gregorianChronology3.weekyears();
        org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology3.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate1.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDate9.isSupported(dateTimeFieldType12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int15 = localDate9.indexOf(dateTimeFieldType14);
        int int16 = dateTime7.get(dateTimeFieldType14);
        long long17 = dateTime7.getMillis();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtCurrentTime();
        boolean boolean21 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 69 + "'", int16 == 69);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        java.lang.String str8 = durationFieldType6.toString();
        java.lang.String str9 = durationFieldType6.toString();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hours" + "'", str8, "hours");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hours" + "'", str9, "hours");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatterBuilder2.toPrinter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder2.appendSeparator("P12M");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder2.appendSeparator("2024-04-01T00:00:00.000-07:00/2024-04-02T00:00:00.000-07:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot have two adjacent separators");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodPrinter3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        int[] intArray8 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months6, (long) (-28800000));
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.hourOfDay();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField12 = new org.joda.time.field.OffsetDateTimeField(dateTimeField10, 23);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.centuryOfEra();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField14 = iSOChronology13.weeks();
        long long18 = iSOChronology13.add((long) (short) 1, (long) (byte) 1, 20);
        org.joda.time.DurationField durationField19 = iSOChronology13.hours();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology13.getZone();
        org.joda.time.Chronology chronology21 = gregorianChronology3.withZone(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 21L + "'", long18 == 21L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        java.util.Locale locale1 = periodFormatter0.getLocale();
        org.joda.time.PeriodType periodType2 = periodFormatter0.getParseType();
        org.joda.time.Months months3 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period4 = months3.toPeriod();
        org.joda.time.Months months5 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months6 = org.joda.time.Months.THREE;
        org.joda.time.Months months7 = months5.plus(months6);
        org.joda.time.Months months8 = months3.plus(months6);
        org.joda.time.PeriodType periodType9 = months8.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod10 = months8.toMutablePeriod();
        int int13 = periodFormatter0.parseInto((org.joda.time.ReadWritablePeriod) mutablePeriod10, "--12-31", 2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn((org.joda.time.ReadablePeriod) mutablePeriod10, 1711990933760L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as months is not precise in the period P14M");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNull(periodType2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(months8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean5 = localDate1.equals((java.lang.Object) periodType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(0);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean13 = localDate9.equals((java.lang.Object) periodType12);
        org.joda.time.LocalDate localDate15 = localDate9.plusWeeks((int) (byte) 100);
        boolean boolean16 = localDate1.isAfter((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.plusDays(20);
        org.joda.time.LocalDate.Property property19 = localDate18.monthOfYear();
        boolean boolean21 = property19.equals((java.lang.Object) "P3M");
        int int22 = property19.getMaximumValueOverall();
        int int23 = property19.get();
        int int24 = property19.getMaximumValue();
        boolean boolean26 = property19.equals((java.lang.Object) 10.0d);
        org.joda.time.LocalDate localDate27 = property19.roundHalfEvenCopy();
        org.joda.time.Months months28 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months29 = org.joda.time.Months.THREE;
        org.joda.time.Months months30 = months28.plus(months29);
        org.joda.time.Months months32 = months29.multipliedBy((int) (short) 10);
        boolean boolean33 = property19.equals((java.lang.Object) months29);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(months28);
        org.junit.Assert.assertNotNull(months29);
        org.junit.Assert.assertNotNull(months30);
        org.junit.Assert.assertNotNull(months32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        boolean boolean7 = localDate1.equals((java.lang.Object) (byte) 10);
        int int8 = localDate1.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate1.withYearOfCentury((-1969));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1969 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone3 = provider0.getZone("DateTimeField[centuryOfEra]");
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = org.joda.time.DateTimeUtils.getPeriodType(periodType0);
        org.joda.time.Months months2 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period3 = months2.toPeriod();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months5 = org.joda.time.Months.THREE;
        org.joda.time.Months months6 = months4.plus(months5);
        org.joda.time.Months months7 = months2.plus(months5);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        boolean boolean9 = months7.isSupported(durationFieldType8);
        org.joda.time.IllegalFieldValueException illegalFieldValueException11 = new org.joda.time.IllegalFieldValueException(durationFieldType8, "GregorianChronology[America/Los_Angeles]");
        boolean boolean12 = periodType0.isSupported(durationFieldType8);
        org.joda.time.field.PreciseDurationField preciseDurationField14 = new org.joda.time.field.PreciseDurationField(durationFieldType8, (long) 20);
        long long17 = preciseDurationField14.getDifferenceAsLong((long) (short) 0, (long) (short) 0);
        boolean boolean18 = preciseDurationField14.isPrecise();
        long long21 = preciseDurationField14.getMillis((long) (short) 0, (long) 100);
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(months6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField14 = new org.joda.time.field.OffsetDateTimeField(dateTimeField12, (int) (byte) -1);
        long long17 = offsetDateTimeField14.set((long) (-25200000), (int) (byte) 10);
        long long19 = offsetDateTimeField14.roundCeiling(1711954800000L);
        long long21 = offsetDateTimeField14.roundHalfFloor(1735545600000L);
        long long24 = offsetDateTimeField14.getDifferenceAsLong((long) (short) -1, (long) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MonthDay monthDay26 = new org.joda.time.MonthDay(dateTimeZone25);
        org.joda.time.MonthDay monthDay28 = monthDay26.withMonthOfYear((int) (short) 10);
        org.joda.time.MonthDay monthDay29 = new org.joda.time.MonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = monthDay29.getFieldType(0);
        org.joda.time.MonthDay monthDay33 = monthDay29.minusMonths((int) (short) 100);
        int[] intArray34 = monthDay29.getValues();
        int int35 = offsetDateTimeField14.getMaximumValue((org.joda.time.ReadablePartial) monthDay28, intArray34);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1893049200000L) + "'", long17 == (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1735545600000L + "'", long19 == 1735545600000L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1735545600000L + "'", long21 == 1735545600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(monthDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(intArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[12, 31]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 99 + "'", int35 == 99);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.LocalDate.Property property4 = localDate3.dayOfYear();
        org.joda.time.LocalDate localDate6 = localDate3.plusYears(19);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.yearMonthDay();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField2 = iSOChronology1.weeks();
        long long6 = iSOChronology1.add((long) (short) 1, (long) (byte) 1, 20);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay((long) 365, (org.joda.time.Chronology) iSOChronology1);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 21L + "'", long6 == 21L);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter2 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.format.PeriodPrinter periodPrinter3 = periodFormatter2.getPrinter();
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder0.append(periodPrinter3, periodParser4);
        org.joda.time.format.PeriodPrinter periodPrinter6 = periodFormatterBuilder0.toPrinter();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatter2);
        org.junit.Assert.assertNotNull(periodPrinter3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodPrinter6);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.daysIn(readableInterval0);
        org.joda.time.MutablePeriod mutablePeriod2 = days1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate4.isSupported(dateTimeFieldType7);
        org.joda.time.Interval interval9 = localDate4.toInterval();
        long long10 = interval9.toDurationMillis();
        mutablePeriod2.setPeriod((org.joda.time.ReadableInterval) interval9);
        boolean boolean13 = mutablePeriod2.equals((java.lang.Object) 0L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate15.isSupported(dateTimeFieldType18);
        org.joda.time.Interval interval20 = localDate15.toInterval();
        long long21 = interval20.toDurationMillis();
        java.lang.String str22 = interval20.toString();
        org.joda.time.Days days23 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval) interval20);
        mutablePeriod2.add((org.joda.time.ReadablePeriod) days23);
        mutablePeriod2.setSeconds(2000);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 86400000L + "'", long21 == 86400000L);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00" + "'", str22, "1969-12-31T00:00:00.000-08:00/1970-01-01T00:00:00.000-08:00");
        org.junit.Assert.assertNotNull(days23);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime8 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime11 = localDate10.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDate14.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate22.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int28 = localDate22.indexOf(dateTimeFieldType27);
        int int29 = dateTime20.get(dateTimeFieldType27);
        java.lang.String str30 = dateTimeFieldType27.toString();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType27.getDurationType();
        boolean boolean32 = localDate10.isSupported(durationFieldType31);
        boolean boolean33 = localDate7.isSupported(durationFieldType31);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months35 = org.joda.time.Months.TWELVE;
        boolean boolean36 = dateTimeZone34.equals((java.lang.Object) months35);
        org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone34);
        long long43 = gregorianChronology37.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField44 = gregorianChronology37.year();
        org.joda.time.DurationField durationField45 = durationFieldType31.getField((org.joda.time.Chronology) gregorianChronology37);
        boolean boolean46 = months0.isSupported(durationFieldType31);
        java.lang.String str47 = months0.toString();
        org.joda.time.DurationFieldType durationFieldType48 = months0.getFieldType();
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(months2);
        org.junit.Assert.assertNotNull(months3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 69 + "'", int29 == 69);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "weekyearOfCentury" + "'", str30, "weekyearOfCentury");
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(months35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(gregorianChronology37);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-53999965L) + "'", long43 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "P11M" + "'", str47, "P11M");
        org.junit.Assert.assertNotNull(durationFieldType48);
    }
}
