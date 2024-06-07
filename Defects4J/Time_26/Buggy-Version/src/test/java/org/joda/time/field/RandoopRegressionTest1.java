package org.joda.time.base;

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
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.DurationField durationField11 = gregorianChronology3.months();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DurationField durationField13 = gregorianChronology3.centuries();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months4 = org.joda.time.Months.TWELVE;
        boolean boolean5 = dateTimeZone3.equals((java.lang.Object) months4);
        org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone3);
        long long12 = gregorianChronology6.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology6.year();
        org.joda.time.DurationField durationField14 = gregorianChronology6.eras();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology6.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology6.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(20, 24, (int) (byte) 0, (org.joda.time.Chronology) gregorianChronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(months4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(gregorianChronology6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-53999965L) + "'", long12 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.joda.time.Days days1 = org.joda.time.Days.days(366);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendSuffix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendMonths();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder4.rejectSignedValues(false);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months20 = org.joda.time.Months.TWELVE;
        boolean boolean21 = dateTimeZone19.equals((java.lang.Object) months20);
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone19);
        long long28 = gregorianChronology22.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone29 = gregorianChronology22.getZone();
        org.joda.time.DurationField durationField30 = gregorianChronology22.months();
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology22.weekyearOfCentury();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField33 = new org.joda.time.field.OffsetDateTimeField(dateTimeField31, (int) (byte) -1);
        boolean boolean35 = offsetDateTimeField33.isLeap((long) (short) 0);
        long long37 = offsetDateTimeField33.remainder((long) (short) -1);
        org.joda.time.DurationField durationField38 = offsetDateTimeField33.getRangeDurationField();
        boolean boolean39 = preciseDurationField14.equals((java.lang.Object) offsetDateTimeField33);
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
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(months20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(gregorianChronology22);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-53999965L) + "'", long28 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 230399999L + "'", long37 == 230399999L);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        long long17 = preciseDurationField14.add(4L, 4L);
        boolean boolean18 = preciseDurationField14.isSupported();
        long long21 = preciseDurationField14.subtract(1735545600000L, 2);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 84L + "'", long17 == 84L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1735545599960L + "'", long21 == 1735545599960L);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField5 = gregorianChronology3.eras();
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay(4765776004800000L);
        org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = monthDay8.getFieldType(0);
        org.joda.time.MonthDay monthDay12 = monthDay8.minusMonths((int) (short) 100);
        int[] intArray13 = monthDay8.getValues();
        gregorianChronology3.validate((org.joda.time.ReadablePartial) monthDay7, intArray13);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(monthDay12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[12, 31]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        mutablePeriod2.setPeriod((int) '4', 2000, 2026, 52, 25, 140, 9, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Days days29 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) mutablePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot convert period to duration as years is not precise in the period P52Y2000M2026W52DT25H140M9S");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        long long2 = org.joda.time.field.FieldUtils.safeMultiply((long) 60, (-1893049200000L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-113582952000000L) + "'", long2 == (-113582952000000L));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField5 = gregorianChronology3.eras();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        long long15 = gregorianChronology9.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology9.year();
        org.joda.time.DurationField durationField17 = gregorianChronology9.halfdays();
        long long19 = durationField17.getMillis((int) '#');
        int int20 = durationField5.compareTo(durationField17);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(months7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-53999965L) + "'", long15 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1512000000L + "'", long19 == 1512000000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        long long21 = offsetDateTimeField14.roundCeiling((-1893049200000L));
        int int23 = offsetDateTimeField14.get((long) 52);
        java.util.Locale locale25 = null;
        java.lang.String str26 = offsetDateTimeField14.getAsText(0L, locale25);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1861804800000L) + "'", long21 == (-1861804800000L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 70 + "'", int23 == 70);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "70" + "'", str26, "70");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = gregorianChronology3.millis();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.joda.time.Months months0 = org.joda.time.Months.SEVEN;
        org.junit.Assert.assertNotNull(months0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        mutablePeriod2.setMillis((int) (short) 100);
        mutablePeriod2.setSeconds(99);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 86400000L + "'", long10 == 86400000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.centuryOfEra();
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.centuryOfEra();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeField12.getAsShortText(10, locale14);
        java.util.Locale locale16 = null;
        int int17 = dateTimeField12.getMaximumTextLength(locale16);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        long long21 = offsetDateTimeField14.roundHalfCeiling(1711990933760L);
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1704096000000L + "'", long21 == 1704096000000L);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.joda.time.Months months0 = org.joda.time.Months.FIVE;
        java.lang.String str1 = months0.toString();
        org.junit.Assert.assertNotNull(months0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "P0M" + "'", str1, "P0M");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.plusMonths(24);
        java.lang.String str4 = monthDay3.toString();
        org.joda.time.Chronology chronology5 = monthDay3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = dateTimeField6.getType();
        org.junit.Assert.assertNotNull(monthDay3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "--12-31" + "'", str4, "--12-31");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "dayOfMonth", 0, 99);
        long long6 = fixedDateTimeZone4.previousTransition((-43606800000L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-43606800000L) + "'", long6 == (-43606800000L));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.joda.time.Months months0 = org.joda.time.Months.TEN;
        org.joda.time.Months months2 = months0.plus(70);
        org.junit.Assert.assertNotNull(months0);
        org.junit.Assert.assertNotNull(months2);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.year();
        org.joda.time.DurationField durationField11 = gregorianChronology3.halfdays();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.field.ScaledDurationField scaledDurationField14 = new org.joda.time.field.ScaledDurationField(durationField11, durationFieldType12, (-101));
        int int17 = scaledDurationField14.getValue(1512002000L, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = scaledDurationField14.add(1711990937679L, 1711954800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -172907434800000 * 43200000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField4 = gregorianChronology3.minutes();
        org.joda.time.Months months5 = org.joda.time.Months.FIVE;
        months5.setValue(0);
        int[] intArray10 = gregorianChronology3.get((org.joda.time.ReadablePeriod) months5, 0L, 0L);
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology3.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(months5);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        org.joda.time.DurationField durationField14 = unsupportedDateTimeField13.getLeapDurationField();
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
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withHoursRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withWeeksRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        long long9 = gregorianChronology3.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology3.getZone();
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay();
        long long13 = gregorianChronology3.set((org.joda.time.ReadablePartial) monthDay11, 0L);
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology3.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(months1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(gregorianChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-53999965L) + "'", long9 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months21 = org.joda.time.Months.TWELVE;
        boolean boolean22 = dateTimeZone20.equals((java.lang.Object) months21);
        org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone20);
        long long29 = gregorianChronology23.getDateTimeMillis((long) 'a', 1, 0, 0, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone30 = gregorianChronology23.getZone();
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        long long33 = gregorianChronology23.set((org.joda.time.ReadablePartial) monthDay31, 0L);
        int int34 = offsetDateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) monthDay31);
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
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(months21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gregorianChronology23);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-53999965L) + "'", long29 == (-53999965L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
        org.joda.time.format.PeriodPrinter periodPrinter1 = periodFormatter0.getPrinter();
        org.joda.time.format.PeriodParser periodParser2 = null;
        org.joda.time.format.PeriodFormatter periodFormatter3 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser2);
        org.joda.time.format.PeriodParser periodParser4 = null;
        org.joda.time.format.PeriodFormatter periodFormatter5 = new org.joda.time.format.PeriodFormatter(periodPrinter1, periodParser4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            periodFormatter5.printTo(stringBuffer6, readablePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatter0);
        org.junit.Assert.assertNotNull(periodPrinter1);
    }
}
