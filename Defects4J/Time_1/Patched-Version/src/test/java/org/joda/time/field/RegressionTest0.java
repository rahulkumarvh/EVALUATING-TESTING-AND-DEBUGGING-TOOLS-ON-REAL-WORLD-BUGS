package org.joda.time.field;

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
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField0, dateTimeFieldType1, 0, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The type must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.junit.Assert.assertNotNull(readableInterval1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = unsupportedDateTimeField6.roundCeiling(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        java.lang.String str7 = chronology3.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str7, "ISOChronology[America/Los_Angeles]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 1, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28800001L + "'", long3 == 28800001L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.joda.time.ReadablePartial readablePartial0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial1 = new org.joda.time.Partial(readablePartial0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.hourOfDay();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        org.joda.time.ReadablePartial readablePartial54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = partial36.isEqual(readablePartial54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong((long) 100, (long) 11);
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.Chronology chronology12 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval10);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.millis();
        org.joda.time.DurationField durationField15 = chronology12.centuries();
        org.joda.time.Chronology chronology16 = chronology12.withUTC();
        org.joda.time.DurationField durationField17 = chronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField21 = new org.joda.time.field.DividedDateTimeField(dateTimeField18, dateTimeFieldType19, 10);
        long long24 = dividedDateTimeField21.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField31 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType25, durationField30);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField32 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField21, dateTimeFieldType25);
        org.joda.time.ReadablePartial readablePartial33 = null;
        java.util.Locale locale35 = null;
        java.lang.String str36 = dividedDateTimeField21.getAsShortText(readablePartial33, 29227899, locale35);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField38 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField21, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str40 = dateTimeFieldType39.getName();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.Partial partial46 = new org.joda.time.Partial(dateTimeFieldType39, (int) (short) 0, chronology44);
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval47);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.DurationField durationField51 = chronology49.millis();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial54 = null;
        int[] intArray61 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int62 = dateTimeField53.getMaximumValue(readablePartial54, intArray61);
        int int63 = dividedDateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) partial46, intArray61);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        int[] intArray77 = chronology67.get((org.joda.time.ReadablePeriod) period75, (-210866846400000L));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray79 = unsupportedDateTimeField6.set((org.joda.time.ReadablePartial) partial46, 28533103, intArray77, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 89L + "'", long9 == 89L);
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-30610224000000L) + "'", long24 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "29227899" + "'", str36, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hourOfDay" + "'", str40, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 24 + "'", int62 == 24);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(10L, 0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str16 = dateTimeFieldType15.getName();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval18);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.Partial partial22 = new org.joda.time.Partial(dateTimeFieldType15, (int) (short) 0, chronology20);
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval24);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval35);
        org.joda.time.ReadableInterval readableInterval37 = null;
        boolean boolean38 = readableInterval36.contains(readableInterval37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = readableInterval36.toPeriod(periodType39);
        int[] intArray42 = chronology32.get((org.joda.time.ReadablePeriod) period40, (-210866846400000L));
        int[] intArray45 = chronology26.get((org.joda.time.ReadablePeriod) period40, 2173795348453L, (long) 1439);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = unsupportedDateTimeField6.set((org.joda.time.ReadablePartial) partial22, (int) ' ', intArray45, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hourOfDay" + "'", str16, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-68, -10, -2, -4, -16, -2, -27, -14]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0 };
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.millis();
        org.joda.time.DurationField durationField7 = chronology4.centuries();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.ReadableInterval readableInterval21 = null;
        boolean boolean22 = readableInterval20.contains(readableInterval21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = readableInterval20.toPeriod(periodType23);
        int[] intArray26 = chronology16.get((org.joda.time.ReadablePeriod) period24, (-210866846400000L));
        int[] intArray29 = chronology10.get((org.joda.time.ReadablePeriod) period24, 2173795348453L, (long) 1439);
        int[] intArray32 = chronology4.get((org.joda.time.ReadablePeriod) period24, (-210861660779418L), 1711989798988L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial33 = new org.joda.time.Partial(dateTimeFieldTypeArray1, intArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[6736, 2, 1, 3, 5, 9, 16, 406]");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weeks();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        long long24 = remainderDateTimeField22.roundHalfFloor((long) 100);
        boolean boolean25 = remainderDateTimeField22.isSupported();
        int int27 = remainderDateTimeField22.get(0L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        java.util.Locale locale55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str56 = partial36.toString("", locale55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.joda.time.Partial partial0 = new org.joda.time.Partial();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval2 = null;
        org.joda.time.ReadableInterval readableInterval3 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval2);
        org.joda.time.Chronology chronology4 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval2);
        org.joda.time.DateTimeField dateTimeField5 = chronology4.yearOfCentury();
        org.joda.time.DurationField durationField6 = chronology4.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField7 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType1, durationField6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = partial0.get(dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(readableInterval3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        int int13 = unsupportedDateTimeField6.getDifference((long) (byte) 10, 10L);
        org.joda.time.Partial partial14 = new org.joda.time.Partial();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = null;
        java.lang.String str42 = dividedDateTimeField27.getAsShortText(readablePartial39, 29227899, locale41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.Partial partial52 = new org.joda.time.Partial(dateTimeFieldType45, (int) (short) 0, chronology50);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray67 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int68 = dateTimeField59.getMaximumValue(readablePartial60, intArray67);
        int int69 = dividedDateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) partial52, intArray67);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray71 = unsupportedDateTimeField6.add((org.joda.time.ReadablePartial) partial14, 53460006, intArray67, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "29227899" + "'", str42, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hourOfDay" + "'", str46, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 24 + "'", int68 == 24);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType57 = partial36.getFieldType(53460006);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53460006");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        java.lang.Object obj56 = null;
        boolean boolean57 = partial36.equals(obj56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField59 = partial36.getField((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        org.joda.time.DurationField durationField18 = scaledDurationField17.getWrappedField();
        long long21 = scaledDurationField17.add((-210866846400000L), (long) 53460006);
        int int24 = scaledDurationField17.getValue((long) 1, 1L);
        boolean boolean25 = scaledDurationField17.isPrecise();
        int int28 = scaledDurationField17.getValue((long) 100, 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-210861660779418L) + "'", long21 == (-210861660779418L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException3 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType4 = dateTimeFieldType0.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException7 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 291L, "hours");
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str9 = dateTimeFieldType8.getName();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.Partial partial15 = new org.joda.time.Partial(dateTimeFieldType8, (int) (short) 0, chronology13);
        boolean boolean16 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField17 = chronology13.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hourOfDay" + "'", str9, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = unsupportedDurationField1.getMillis(166063010319767L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add(2580171L, (-990L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) iSOChronology0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        long long12 = unsupportedDateTimeField6.add(0L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        long long16 = dividedDateTimeField11.roundFloor((-210861660779418L));
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str18 = dateTimeFieldType17.getName();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.Partial partial24 = new org.joda.time.Partial(dateTimeFieldType17, (int) (short) 0, chronology22);
        int[] intArray26 = null;
        java.util.Locale locale28 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dividedDateTimeField11.set((org.joda.time.ReadablePartial) partial24, 3, intArray26, "100", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-210768825600000L) + "'", long16 == (-210768825600000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hourOfDay" + "'", str18, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.add((-210768825600000L), 1439);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.DurationField durationField12 = chronology9.centuries();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField18 = new org.joda.time.field.DividedDateTimeField(dateTimeField15, dateTimeFieldType16, 10);
        long long21 = dividedDateTimeField18.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval23);
        org.joda.time.DateTimeField dateTimeField26 = chronology25.yearOfCentury();
        org.joda.time.DurationField durationField27 = chronology25.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField28 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType22, durationField27);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField29 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField18, dateTimeFieldType22);
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = null;
        java.lang.String str33 = dividedDateTimeField18.getAsShortText(readablePartial30, 29227899, locale32);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField35 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField18, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.Partial partial43 = new org.joda.time.Partial(dateTimeFieldType36, (int) (short) 0, chronology41);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial51 = null;
        int[] intArray58 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int59 = dateTimeField50.getMaximumValue(readablePartial51, intArray58);
        int int60 = dividedDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) partial43, intArray58);
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.Chronology chronology64 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval62);
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfCentury();
        org.joda.time.DurationField durationField66 = chronology64.millis();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval68 = null;
        org.joda.time.ReadableInterval readableInterval69 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval68);
        org.joda.time.Chronology chronology70 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval68);
        org.joda.time.DateTimeField dateTimeField71 = chronology70.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval73 = null;
        org.joda.time.ReadableInterval readableInterval74 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval73);
        org.joda.time.ReadableInterval readableInterval75 = null;
        boolean boolean76 = readableInterval74.contains(readableInterval75);
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.Period period78 = readableInterval74.toPeriod(periodType77);
        int[] intArray80 = chronology70.get((org.joda.time.ReadablePeriod) period78, (-210866846400000L));
        int[] intArray83 = chronology64.get((org.joda.time.ReadablePeriod) period78, 2173795348453L, (long) 1439);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray85 = unsupportedDateTimeField6.add((org.joda.time.ReadablePartial) partial43, 53460006, intArray83, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-30610224000000L) + "'", long21 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "29227899" + "'", str33, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hourOfDay" + "'", str37, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 24 + "'", int59 == 24);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(readableInterval69);
        org.junit.Assert.assertNotNull(chronology70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(readableInterval74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(period78);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[-68, -10, -2, -4, -16, -2, -27, -14]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, 2580171L);
        java.lang.String str5 = dateTimeZone0.getNameKey((long) 24);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31380171L + "'", long3 == 31380171L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis((int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        long long24 = remainderDateTimeField22.roundHalfFloor((long) 100);
        boolean boolean25 = remainderDateTimeField22.isSupported();
        long long27 = remainderDateTimeField22.roundHalfFloor((-971L));
        boolean boolean28 = remainderDateTimeField22.isLenient();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.weekyears();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        org.joda.time.Chronology chronology10 = iSOChronology0.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone9);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.minuteOfHour();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.DurationField durationField8 = chronology5.centuries();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField14 = new org.joda.time.field.DividedDateTimeField(dateTimeField11, dateTimeFieldType12, 10);
        long long17 = dividedDateTimeField14.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField24 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType18, durationField23);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField25 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField14, dateTimeFieldType18);
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale28 = null;
        java.lang.String str29 = dividedDateTimeField14.getAsShortText(readablePartial26, 29227899, locale28);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField31 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField14, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str33 = dateTimeFieldType32.getName();
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval35);
        org.joda.time.Chronology chronology37 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval35);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.yearOfCentury();
        org.joda.time.Partial partial39 = new org.joda.time.Partial(dateTimeFieldType32, (int) (short) 0, chronology37);
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.DurationField durationField44 = chronology42.millis();
        org.joda.time.DateTimeField dateTimeField45 = chronology42.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial47 = null;
        int[] intArray54 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int55 = dateTimeField46.getMaximumValue(readablePartial47, intArray54);
        int int56 = dividedDateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) partial39, intArray54);
        boolean boolean58 = partial39.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.ReadableInterval readableInterval60 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval59);
        org.joda.time.ReadableInterval readableInterval61 = null;
        boolean boolean62 = readableInterval60.contains(readableInterval61);
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.Period period64 = readableInterval60.toPeriod(periodType63);
        org.joda.time.DateTime dateTime65 = readableInterval60.getEnd();
        boolean boolean66 = partial39.equals((java.lang.Object) readableInterval60);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.PeriodType periodType68 = org.joda.time.DateTimeUtils.getPeriodType(periodType67);
        org.joda.time.PeriodType periodType69 = org.joda.time.DateTimeUtils.getPeriodType(periodType67);
        org.joda.time.Period period70 = readableInterval60.toPeriod(periodType69);
        int[] intArray72 = iSOChronology0.get((org.joda.time.ReadablePeriod) period70, 0L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-30610224000000L) + "'", long17 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "29227899" + "'", str29, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hourOfDay" + "'", str33, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 24 + "'", int55 == 24);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(readableInterval60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = unsupportedDateTimeField6.getAsText(29227899, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        long long15 = dividedDateTimeField11.roundCeiling((long) (byte) 1);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = null;
        java.lang.String str42 = dividedDateTimeField27.getAsShortText(readablePartial39, 29227899, locale41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.Partial partial52 = new org.joda.time.Partial(dateTimeFieldType45, (int) (short) 0, chronology50);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray67 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int68 = dateTimeField59.getMaximumValue(readablePartial60, intArray67);
        int int69 = dividedDateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) partial52, intArray67);
        boolean boolean71 = partial52.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval72 = null;
        org.joda.time.ReadableInterval readableInterval73 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        boolean boolean75 = readableInterval73.contains(readableInterval74);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = readableInterval73.toPeriod(periodType76);
        org.joda.time.DateTime dateTime78 = readableInterval73.getEnd();
        boolean boolean79 = partial52.equals((java.lang.Object) readableInterval73);
        int int80 = dividedDateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) partial52);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval82 = null;
        org.joda.time.ReadableInterval readableInterval83 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval82);
        org.joda.time.Chronology chronology84 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval82);
        org.joda.time.DateTimeField dateTimeField85 = chronology84.yearOfCentury();
        org.joda.time.DurationField durationField86 = chronology84.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField87 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType81, durationField86);
        boolean boolean88 = partial52.isSupported(dateTimeFieldType81);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 315532800000L + "'", long15 == 315532800000L);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "29227899" + "'", str42, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hourOfDay" + "'", str46, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 24 + "'", int68 == 24);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(readableInterval73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 29227899 + "'", int80 == 29227899);
        org.junit.Assert.assertNotNull(dateTimeFieldType81);
        org.junit.Assert.assertNotNull(readableInterval83);
        org.junit.Assert.assertNotNull(chronology84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(durationField86);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.Chronology chronology9 = partial7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = partial7.toString("UnsupportedDurationField[minutes]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = partial7.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int6 = fixedDateTimeZone4.getStandardOffset((long) 1);
        long long8 = fixedDateTimeZone4.nextTransition((-210742430400000L));
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str10 = fixedDateTimeZone4.getID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-210742430400000L) + "'", long8 == (-210742430400000L));
        org.junit.Assert.assertNotNull(gregorianChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(10L, 0L);
        org.joda.time.Partial partial15 = new org.joda.time.Partial();
        java.lang.String str17 = partial15.toString("+00:00");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = unsupportedDateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) partial15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval5 = null;
        org.joda.time.ReadableInterval readableInterval6 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval5);
        org.joda.time.ReadableInterval readableInterval7 = null;
        boolean boolean8 = readableInterval6.contains(readableInterval7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = readableInterval6.toPeriod(periodType9);
        int[] intArray12 = chronology2.get((org.joda.time.ReadablePeriod) period10, (-210866846400000L));
        java.lang.String str13 = chronology2.toString();
        java.lang.String str14 = chronology2.toString();
        java.lang.String str15 = chronology2.toString();
        org.joda.time.DurationField durationField16 = chronology2.years();
        org.joda.time.DurationField durationField17 = chronology2.eras();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(readableInterval6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str13, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str14, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[America/Los_Angeles]" + "'", str15, "ISOChronology[America/Los_Angeles]");
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        int int5 = dateTimeField3.get(3423979610009L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = partial36.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField38 = iSOChronology37.minutes();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.millisOfDay();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField42 = new org.joda.time.field.OffsetDateTimeField(dateTimeField40, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.Partial partial50 = new org.joda.time.Partial(dateTimeFieldType43, (int) (short) 0, chronology48);
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.ReadableInterval readableInterval53 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval52);
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval52);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfCentury();
        org.joda.time.DurationField durationField56 = chronology54.millis();
        org.joda.time.DurationField durationField57 = chronology54.centuries();
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval58);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfCentury();
        org.joda.time.DurationField durationField62 = chronology60.millis();
        org.joda.time.DateTimeField dateTimeField63 = chronology60.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.Chronology chronology66 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval64);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField68 = chronology66.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.ReadableInterval readableInterval70 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval69);
        org.joda.time.ReadableInterval readableInterval71 = null;
        boolean boolean72 = readableInterval70.contains(readableInterval71);
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Period period74 = readableInterval70.toPeriod(periodType73);
        int[] intArray76 = chronology66.get((org.joda.time.ReadablePeriod) period74, (-210866846400000L));
        int[] intArray79 = chronology60.get((org.joda.time.ReadablePeriod) period74, 2173795348453L, (long) 1439);
        int[] intArray82 = chronology54.get((org.joda.time.ReadablePeriod) period74, (-210861660779418L), 1711989798988L);
        int[] intArray84 = offsetDateTimeField42.add((org.joda.time.ReadablePartial) partial50, 11, intArray82, 0);
        int int85 = offsetDateTimeField28.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray82);
        org.joda.time.DurationField durationField86 = offsetDateTimeField28.getLeapDurationField();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(iSOChronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hourOfDay" + "'", str44, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(readableInterval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(readableInterval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(durationField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(readableInterval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(readableInterval70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[6736, 2, 1, 3, 5, 9, 16, 406]");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray84), "[6736, 2, 1, 3, 5, 9, 16, 406]");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 29227899 + "'", int85 == 29227899);
        org.junit.Assert.assertNull(durationField86);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int14 = dividedDateTimeField11.getMaximumValue();
        int int15 = dividedDateTimeField11.getMinimumValue();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField17 = iSOChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField21 = new org.joda.time.field.OffsetDateTimeField(dateTimeField19, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str23 = dateTimeFieldType22.getName();
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.Partial partial29 = new org.joda.time.Partial(dateTimeFieldType22, (int) (short) 0, chronology27);
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.DurationField durationField36 = chronology33.centuries();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.ReadableInterval readableInterval44 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval43);
        org.joda.time.Chronology chronology45 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval43);
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.ReadableInterval readableInterval50 = null;
        boolean boolean51 = readableInterval49.contains(readableInterval50);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = readableInterval49.toPeriod(periodType52);
        int[] intArray55 = chronology45.get((org.joda.time.ReadablePeriod) period53, (-210866846400000L));
        int[] intArray58 = chronology39.get((org.joda.time.ReadablePeriod) period53, 2173795348453L, (long) 1439);
        int[] intArray61 = chronology33.get((org.joda.time.ReadablePeriod) period53, (-210861660779418L), 1711989798988L);
        int[] intArray63 = offsetDateTimeField21.add((org.joda.time.ReadablePartial) partial29, 11, intArray61, 0);
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DurationField durationField69 = chronology67.millis();
        org.joda.time.DateTimeField dateTimeField70 = chronology67.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval71 = null;
        org.joda.time.ReadableInterval readableInterval72 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval71);
        org.joda.time.Chronology chronology73 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval71);
        org.joda.time.DateTimeField dateTimeField74 = chronology73.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField75 = chronology73.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval76 = null;
        org.joda.time.ReadableInterval readableInterval77 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval76);
        org.joda.time.ReadableInterval readableInterval78 = null;
        boolean boolean79 = readableInterval77.contains(readableInterval78);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = readableInterval77.toPeriod(periodType80);
        int[] intArray83 = chronology73.get((org.joda.time.ReadablePeriod) period81, (-210866846400000L));
        int[] intArray86 = chronology67.get((org.joda.time.ReadablePeriod) period81, 2173795348453L, (long) 1439);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray88 = dividedDateTimeField11.addWrapField((org.joda.time.ReadablePartial) partial29, 53460006, intArray86, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53460006");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29227899 + "'", int14 == 29227899);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hourOfDay" + "'", str23, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(readableInterval44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[6736, 2, 1, 3, 5, 9, 16, 406]");
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[6736, 2, 1, 3, 5, 9, 16, 406]");
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertNotNull(readableInterval72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(readableInterval77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, 0, 0, 0, -58574124, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[-68, -10, -2, -4, -16, -2, -27, -14]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DurationField durationField6 = iSOChronology0.hours();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField13 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType7, durationField12);
        long long16 = durationField12.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        org.joda.time.Chronology chronology20 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval18);
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        boolean boolean22 = durationFieldType17.isSupported(chronology20);
        org.joda.time.field.ScaledDurationField scaledDurationField24 = new org.joda.time.field.ScaledDurationField(durationField12, durationFieldType17, (int) 'a');
        int int26 = scaledDurationField24.getValue((long) (short) -1);
        long long29 = scaledDurationField24.add((long) (-1), 10);
        org.joda.time.DurationFieldType durationFieldType30 = scaledDurationField24.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException32 = new org.joda.time.IllegalFieldValueException(durationFieldType30, "69");
        org.joda.time.field.ScaledDurationField scaledDurationField34 = new org.joda.time.field.ScaledDurationField(durationField6, durationFieldType30, 28533103);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-210866846400000L) + "'", long16 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(readableInterval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 969L + "'", long29 == 969L);
        org.junit.Assert.assertNotNull(durationFieldType30);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        java.util.Locale locale24 = null;
        java.lang.String str25 = remainderDateTimeField22.getAsShortText((long) 11, locale24);
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.DurationField durationField31 = chronology28.centuries();
        org.joda.time.Chronology chronology32 = chronology28.withUTC();
        org.joda.time.DurationField durationField33 = chronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField37 = new org.joda.time.field.DividedDateTimeField(dateTimeField34, dateTimeFieldType35, 10);
        long long40 = dividedDateTimeField37.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DurationField durationField46 = chronology44.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField47 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType41, durationField46);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField48 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField37, dateTimeFieldType41);
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale51 = null;
        java.lang.String str52 = dividedDateTimeField37.getAsShortText(readablePartial49, 29227899, locale51);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField54 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField37, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str56 = dateTimeFieldType55.getName();
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval58);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfCentury();
        org.joda.time.Partial partial62 = new org.joda.time.Partial(dateTimeFieldType55, (int) (short) 0, chronology60);
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.Chronology chronology65 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval63);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.yearOfCentury();
        org.joda.time.DurationField durationField67 = chronology65.millis();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial70 = null;
        int[] intArray77 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int78 = dateTimeField69.getMaximumValue(readablePartial70, intArray77);
        int int79 = dividedDateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) partial62, intArray77);
        boolean boolean81 = partial62.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval82 = null;
        org.joda.time.ReadableInterval readableInterval83 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval82);
        org.joda.time.ReadableInterval readableInterval84 = null;
        boolean boolean85 = readableInterval83.contains(readableInterval84);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Period period87 = readableInterval83.toPeriod(periodType86);
        org.joda.time.DateTime dateTime88 = readableInterval83.getEnd();
        boolean boolean89 = partial62.equals((java.lang.Object) readableInterval83);
        java.util.Locale locale91 = null;
        java.lang.String str92 = remainderDateTimeField22.getAsText((org.joda.time.ReadablePartial) partial62, (int) (short) 1, locale91);
        org.joda.time.chrono.ISOChronology iSOChronology93 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField94 = iSOChronology93.minutes();
        org.joda.time.DateTimeField dateTimeField95 = iSOChronology93.millisOfDay();
        org.joda.time.DateTimeField dateTimeField96 = iSOChronology93.halfdayOfDay();
        org.joda.time.DurationField durationField97 = iSOChronology93.seconds();
        org.joda.time.DateTimeZone dateTimeZone98 = iSOChronology93.getZone();
        org.joda.time.Partial partial99 = partial62.withChronologyRetainFields((org.joda.time.Chronology) iSOChronology93);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-30610224000000L) + "'", long40 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "29227899" + "'", str52, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hourOfDay" + "'", str56, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 24 + "'", int78 == 24);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(readableInterval83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "1" + "'", str92, "1");
        org.junit.Assert.assertNotNull(iSOChronology93);
        org.junit.Assert.assertNotNull(durationField94);
        org.junit.Assert.assertNotNull(dateTimeField95);
        org.junit.Assert.assertNotNull(dateTimeField96);
        org.junit.Assert.assertNotNull(durationField97);
        org.junit.Assert.assertNotNull(dateTimeZone98);
        org.junit.Assert.assertNotNull(partial99);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.MutableInterval mutableInterval5 = readableInterval1.toMutableInterval();
        long long6 = readableInterval1.getStartMillis();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        boolean boolean10 = readableInterval8.contains(readableInterval9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = readableInterval8.toPeriod(periodType11);
        boolean boolean13 = readableInterval1.contains(readableInterval8);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology16.millis();
        org.joda.time.DurationField durationField19 = chronology16.centuries();
        org.joda.time.Chronology chronology20 = chronology16.withUTC();
        org.joda.time.DurationField durationField21 = chronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField25 = new org.joda.time.field.DividedDateTimeField(dateTimeField22, dateTimeFieldType23, 10);
        long long28 = dividedDateTimeField25.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval30 = null;
        org.joda.time.ReadableInterval readableInterval31 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval30);
        org.joda.time.Chronology chronology32 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval30);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DurationField durationField34 = chronology32.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField35 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType29, durationField34);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField36 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField25, dateTimeFieldType29);
        org.joda.time.ReadablePartial readablePartial37 = null;
        java.util.Locale locale39 = null;
        java.lang.String str40 = dividedDateTimeField25.getAsShortText(readablePartial37, 29227899, locale39);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField42 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField25, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str44 = dateTimeFieldType43.getName();
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.Partial partial50 = new org.joda.time.Partial(dateTimeFieldType43, (int) (short) 0, chronology48);
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.ReadableInterval readableInterval52 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval51);
        org.joda.time.Chronology chronology53 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval51);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.yearOfCentury();
        org.joda.time.DurationField durationField55 = chronology53.millis();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField57 = chronology53.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial58 = null;
        int[] intArray65 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int66 = dateTimeField57.getMaximumValue(readablePartial58, intArray65);
        int int67 = dividedDateTimeField25.getMinimumValue((org.joda.time.ReadablePartial) partial50, intArray65);
        boolean boolean69 = partial50.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        org.joda.time.DateTime dateTime76 = readableInterval71.getEnd();
        boolean boolean77 = partial50.equals((java.lang.Object) readableInterval71);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.PeriodType periodType79 = org.joda.time.DateTimeUtils.getPeriodType(periodType78);
        org.joda.time.PeriodType periodType80 = org.joda.time.DateTimeUtils.getPeriodType(periodType78);
        org.joda.time.Period period81 = readableInterval71.toPeriod(periodType80);
        org.joda.time.PeriodType periodType82 = org.joda.time.DateTimeUtils.getPeriodType(periodType80);
        org.joda.time.Period period83 = readableInterval8.toPeriod(periodType82);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutableInterval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-30610224000000L) + "'", long28 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(readableInterval31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "29227899" + "'", str40, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hourOfDay" + "'", str44, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(readableInterval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 24 + "'", int66 == 24);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(period81);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(period83);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int5 = dateTimeField4.getMinimumValue();
        long long8 = dateTimeField4.add(0L, (long) (byte) 1);
        int int11 = dateTimeField4.getDifference(1711989797111L, 3600000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException15 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType12, (java.lang.Number) 60035L, "");
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField17 = new org.joda.time.field.OffsetDateTimeField(dateTimeField4, dateTimeFieldType12, (int) (short) 1);
        int int19 = offsetDateTimeField17.get((-971L));
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60000L + "'", long8 == 60000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28533103 + "'", int11 == 28533103);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 960 + "'", int19 == 960);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getDurationField();
        org.joda.time.ReadableInterval readableInterval13 = null;
        org.joda.time.ReadableInterval readableInterval14 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval13);
        org.joda.time.Chronology chronology15 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval13);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField17 = chronology15.millis();
        org.joda.time.DurationField durationField18 = chronology15.centuries();
        org.joda.time.Chronology chronology19 = chronology15.withUTC();
        org.joda.time.DurationField durationField20 = chronology19.halfdays();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField24 = new org.joda.time.field.DividedDateTimeField(dateTimeField21, dateTimeFieldType22, 10);
        long long27 = dividedDateTimeField24.set(0L, 100);
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.ReadableInterval readableInterval29 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval28);
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.DurationField durationField37 = chronology34.centuries();
        org.joda.time.Chronology chronology38 = chronology34.withUTC();
        org.joda.time.DurationField durationField39 = chronology38.halfdays();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField43 = new org.joda.time.field.DividedDateTimeField(dateTimeField40, dateTimeFieldType41, 10);
        long long46 = dividedDateTimeField43.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField53 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType47, durationField52);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField54 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField43, dateTimeFieldType47);
        org.joda.time.ReadablePartial readablePartial55 = null;
        java.util.Locale locale57 = null;
        java.lang.String str58 = dividedDateTimeField43.getAsShortText(readablePartial55, 29227899, locale57);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField60 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField43, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str62 = dateTimeFieldType61.getName();
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.Chronology chronology66 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval64);
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.Partial partial68 = new org.joda.time.Partial(dateTimeFieldType61, (int) (short) 0, chronology66);
        org.joda.time.ReadableInterval readableInterval69 = null;
        org.joda.time.ReadableInterval readableInterval70 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval69);
        org.joda.time.Chronology chronology71 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval69);
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfCentury();
        org.joda.time.DurationField durationField73 = chronology71.millis();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField75 = chronology71.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial76 = null;
        int[] intArray83 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int84 = dateTimeField75.getMaximumValue(readablePartial76, intArray83);
        int int85 = dividedDateTimeField43.getMinimumValue((org.joda.time.ReadablePartial) partial68, intArray83);
        boolean boolean87 = partial68.equals((java.lang.Object) "29227899");
        boolean boolean89 = partial68.equals((java.lang.Object) 2767716812L);
        java.util.Locale locale91 = null;
        java.lang.String str92 = dateTimeField31.getAsShortText((org.joda.time.ReadablePartial) partial68, 11, locale91);
        java.util.Locale locale94 = null;
        java.lang.String str95 = dividedDateTimeField24.getAsShortText((org.joda.time.ReadablePartial) partial68, 1, locale94);
        java.util.Locale locale97 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str98 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial68, 53460006, locale97);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(readableInterval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-30610224000000L) + "'", long27 == (-30610224000000L));
        org.junit.Assert.assertNotNull(readableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-30610224000000L) + "'", long46 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(durationField52);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "29227899" + "'", str58, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hourOfDay" + "'", str62, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(readableInterval70);
        org.junit.Assert.assertNotNull(chronology71);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(durationField73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 24 + "'", int84 == 24);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "11" + "'", str92, "11");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "1" + "'", str95, "1");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        long long15 = dividedDateTimeField11.roundCeiling((long) (byte) 1);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = null;
        java.lang.String str42 = dividedDateTimeField27.getAsShortText(readablePartial39, 29227899, locale41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.Partial partial52 = new org.joda.time.Partial(dateTimeFieldType45, (int) (short) 0, chronology50);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray67 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int68 = dateTimeField59.getMaximumValue(readablePartial60, intArray67);
        int int69 = dividedDateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) partial52, intArray67);
        boolean boolean71 = partial52.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval72 = null;
        org.joda.time.ReadableInterval readableInterval73 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        boolean boolean75 = readableInterval73.contains(readableInterval74);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = readableInterval73.toPeriod(periodType76);
        org.joda.time.DateTime dateTime78 = readableInterval73.getEnd();
        boolean boolean79 = partial52.equals((java.lang.Object) readableInterval73);
        int int80 = dividedDateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) partial52);
        long long82 = dividedDateTimeField11.roundFloor(37113L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 315532800000L + "'", long15 == 315532800000L);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "29227899" + "'", str42, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hourOfDay" + "'", str46, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 24 + "'", int68 == 24);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(readableInterval73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 29227899 + "'", int80 == 29227899);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder3.addRecurringSavings("org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay", (int) (byte) 0, (int) ' ', (int) (short) -1, '4', 53460006, 0, (int) (short) -1, false, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder22 = dateTimeZoneBuilder14.addCutover((int) (byte) 0, '4', 1, 10, 3, false, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode: 4");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = unsupportedDurationField1.getMillis((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getValueAsLong((-3155695200000L), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str2, "UnsupportedDurationField[minutes]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int int5 = dateTimeField3.getMinimumValue(readablePartial4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeField3.getAsShortText(0L, locale7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.DurationField durationField14 = chronology11.centuries();
        org.joda.time.Chronology chronology15 = chronology11.withUTC();
        org.joda.time.DurationField durationField16 = chronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField20 = new org.joda.time.field.DividedDateTimeField(dateTimeField17, dateTimeFieldType18, 10);
        long long23 = dividedDateTimeField20.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField30 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType24, durationField29);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField31 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField20, dateTimeFieldType24);
        org.joda.time.ReadablePartial readablePartial32 = null;
        java.util.Locale locale34 = null;
        java.lang.String str35 = dividedDateTimeField20.getAsShortText(readablePartial32, 29227899, locale34);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField37 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField20, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str39 = dateTimeFieldType38.getName();
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.Partial partial45 = new org.joda.time.Partial(dateTimeFieldType38, (int) (short) 0, chronology43);
        org.joda.time.ReadableInterval readableInterval46 = null;
        org.joda.time.ReadableInterval readableInterval47 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval46);
        org.joda.time.Chronology chronology48 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval46);
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.DurationField durationField50 = chronology48.millis();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial53 = null;
        int[] intArray60 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int61 = dateTimeField52.getMaximumValue(readablePartial53, intArray60);
        int int62 = dividedDateTimeField20.getMinimumValue((org.joda.time.ReadablePartial) partial45, intArray60);
        boolean boolean64 = partial45.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.ReadableInterval readableInterval67 = null;
        boolean boolean68 = readableInterval66.contains(readableInterval67);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = readableInterval66.toPeriod(periodType69);
        org.joda.time.DateTime dateTime71 = readableInterval66.getEnd();
        boolean boolean72 = partial45.equals((java.lang.Object) readableInterval66);
        int[] intArray80 = new int[] { (short) 100, (short) 0, (byte) 10, 3, 28533103, 3 };
        java.util.Locale locale82 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray83 = dateTimeField3.set((org.joda.time.ReadablePartial) partial45, (int) '#', intArray80, "org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay", locale82);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"org.joda.time.IllegalFieldValueException: Value 10 for dayOfYear is not supported: hourOfDay\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "70" + "'", str8, "70");
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-30610224000000L) + "'", long23 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "29227899" + "'", str35, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hourOfDay" + "'", str39, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(readableInterval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 24 + "'", int61 == 24);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(period70);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[100, 0, 10, 3, 28533103, 3]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        int int19 = scaledDurationField17.getValue((long) (short) -1);
        long long22 = scaledDurationField17.getMillis(970L, (long) 1439);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 94090L + "'", long22 == 94090L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = readableInterval1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfEra();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        java.util.Locale locale24 = null;
        java.lang.String str25 = remainderDateTimeField22.getAsShortText((long) 11, locale24);
        org.joda.time.ReadableInterval readableInterval26 = null;
        org.joda.time.ReadableInterval readableInterval27 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval26);
        org.joda.time.Chronology chronology28 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval26);
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DurationField durationField30 = chronology28.millis();
        org.joda.time.DurationField durationField31 = chronology28.centuries();
        org.joda.time.Chronology chronology32 = chronology28.withUTC();
        org.joda.time.DurationField durationField33 = chronology32.halfdays();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField37 = new org.joda.time.field.DividedDateTimeField(dateTimeField34, dateTimeFieldType35, 10);
        long long40 = dividedDateTimeField37.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DurationField durationField46 = chronology44.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField47 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType41, durationField46);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField48 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField37, dateTimeFieldType41);
        org.joda.time.ReadablePartial readablePartial49 = null;
        java.util.Locale locale51 = null;
        java.lang.String str52 = dividedDateTimeField37.getAsShortText(readablePartial49, 29227899, locale51);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField54 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField37, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str56 = dateTimeFieldType55.getName();
        org.joda.time.ReadableInterval readableInterval58 = null;
        org.joda.time.ReadableInterval readableInterval59 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval58);
        org.joda.time.Chronology chronology60 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval58);
        org.joda.time.DateTimeField dateTimeField61 = chronology60.yearOfCentury();
        org.joda.time.Partial partial62 = new org.joda.time.Partial(dateTimeFieldType55, (int) (short) 0, chronology60);
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.Chronology chronology65 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval63);
        org.joda.time.DateTimeField dateTimeField66 = chronology65.yearOfCentury();
        org.joda.time.DurationField durationField67 = chronology65.millis();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField69 = chronology65.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial70 = null;
        int[] intArray77 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int78 = dateTimeField69.getMaximumValue(readablePartial70, intArray77);
        int int79 = dividedDateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) partial62, intArray77);
        boolean boolean81 = partial62.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval82 = null;
        org.joda.time.ReadableInterval readableInterval83 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval82);
        org.joda.time.ReadableInterval readableInterval84 = null;
        boolean boolean85 = readableInterval83.contains(readableInterval84);
        org.joda.time.PeriodType periodType86 = null;
        org.joda.time.Period period87 = readableInterval83.toPeriod(periodType86);
        org.joda.time.DateTime dateTime88 = readableInterval83.getEnd();
        boolean boolean89 = partial62.equals((java.lang.Object) readableInterval83);
        java.util.Locale locale91 = null;
        java.lang.String str92 = remainderDateTimeField22.getAsText((org.joda.time.ReadablePartial) partial62, (int) (short) 1, locale91);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType94 = partial62.getFieldType(1439);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1439");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0" + "'", str25, "0");
        org.junit.Assert.assertNotNull(readableInterval27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-30610224000000L) + "'", long40 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "29227899" + "'", str52, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hourOfDay" + "'", str56, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 24 + "'", int78 == 24);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(readableInterval83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(period87);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "1" + "'", str92, "1");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        long long12 = unsupportedDateTimeField6.getDifferenceAsLong((long) (-1), 970L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.Partial partial20 = new org.joda.time.Partial(dateTimeFieldType13, (int) (short) 0, chronology18);
        org.joda.time.Chronology chronology21 = partial20.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean23 = partial20.isSupported(dateTimeFieldType22);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.ReadableInterval readableInterval44 = null;
        boolean boolean45 = readableInterval43.contains(readableInterval44);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.Period period47 = readableInterval43.toPeriod(periodType46);
        int[] intArray49 = chronology39.get((org.joda.time.ReadablePeriod) period47, (-210866846400000L));
        int[] intArray52 = chronology33.get((org.joda.time.ReadablePeriod) period47, 2173795348453L, (long) 1439);
        int[] intArray55 = chronology27.get((org.joda.time.ReadablePeriod) period47, (-210861660779418L), 1711989798988L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray57 = unsupportedDateTimeField6.add((org.joda.time.ReadablePartial) partial20, 0, intArray55, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-971L) + "'", long12 == (-971L));
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hourOfDay" + "'", str14, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(readableInterval43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(intArray49);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray55);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[6736, 2, 1, 3, 4, 16, 18, 406]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0, (int) (byte) 1);
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology5.millis();
        org.joda.time.DurationField durationField8 = chronology5.centuries();
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField14 = new org.joda.time.field.DividedDateTimeField(dateTimeField11, dateTimeFieldType12, 10);
        long long17 = dividedDateTimeField14.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField24 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType18, durationField23);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField25 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField14, dateTimeFieldType18);
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale28 = null;
        java.lang.String str29 = dividedDateTimeField14.getAsShortText(readablePartial26, 29227899, locale28);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField31 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField14, 29227899);
        org.joda.time.DurationField durationField32 = offsetDateTimeField31.getLeapDurationField();
        boolean boolean34 = offsetDateTimeField31.isLeap(1711989797111L);
        boolean boolean35 = gregorianChronology2.equals((java.lang.Object) 1711989797111L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(gregorianChronology2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-30610224000000L) + "'", long17 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "29227899" + "'", str29, "29227899");
        org.junit.Assert.assertNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.centuries();
        org.joda.time.Chronology chronology10 = chronology6.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField15 = new org.joda.time.field.DividedDateTimeField(dateTimeField12, dateTimeFieldType13, 10);
        long long18 = dividedDateTimeField15.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval20 = null;
        org.joda.time.ReadableInterval readableInterval21 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval20);
        org.joda.time.Chronology chronology22 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval20);
        org.joda.time.DateTimeField dateTimeField23 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField25 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType19, durationField24);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField26 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField15, dateTimeFieldType19);
        org.joda.time.ReadablePartial readablePartial27 = null;
        java.util.Locale locale29 = null;
        java.lang.String str30 = dividedDateTimeField15.getAsShortText(readablePartial27, 29227899, locale29);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField32 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField15, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str34 = dateTimeFieldType33.getName();
        org.joda.time.ReadableInterval readableInterval36 = null;
        org.joda.time.ReadableInterval readableInterval37 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval36);
        org.joda.time.Chronology chronology38 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval36);
        org.joda.time.DateTimeField dateTimeField39 = chronology38.yearOfCentury();
        org.joda.time.Partial partial40 = new org.joda.time.Partial(dateTimeFieldType33, (int) (short) 0, chronology38);
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology43.millis();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial48 = null;
        int[] intArray55 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int56 = dateTimeField47.getMaximumValue(readablePartial48, intArray55);
        int int57 = dividedDateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) partial40, intArray55);
        boolean boolean59 = partial40.equals((java.lang.Object) "29227899");
        boolean boolean61 = partial40.equals((java.lang.Object) 2767716812L);
        java.util.Locale locale63 = null;
        java.lang.String str64 = dateTimeField3.getAsShortText((org.joda.time.ReadablePartial) partial40, 11, locale63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField66 = partial40.getField(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-30610224000000L) + "'", long18 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(readableInterval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "29227899" + "'", str30, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hourOfDay" + "'", str34, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 24 + "'", int56 == 24);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "11" + "'", str64, "11");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
        java.lang.Number number1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, number1, (java.lang.Number) 946684800000L, (java.lang.Number) (-210861660779418L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(301418);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DurationField durationField13 = chronology10.centuries();
        org.joda.time.Chronology chronology14 = chronology10.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField19 = new org.joda.time.field.DividedDateTimeField(dateTimeField16, dateTimeFieldType17, 10);
        long long22 = dividedDateTimeField19.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval24);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField29 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType23, durationField28);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField30 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField19, dateTimeFieldType23);
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = dividedDateTimeField19.getAsShortText(readablePartial31, 29227899, locale33);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField36 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField19, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str38 = dateTimeFieldType37.getName();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.Partial partial44 = new org.joda.time.Partial(dateTimeFieldType37, (int) (short) 0, chronology42);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology47.millis();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial52 = null;
        int[] intArray59 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int60 = dateTimeField51.getMaximumValue(readablePartial52, intArray59);
        int int61 = dividedDateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) partial44, intArray59);
        boolean boolean63 = partial44.equals((java.lang.Object) "29227899");
        int[] intArray68 = new int[] { 0, 28533103, 28533103 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray70 = unsupportedDateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) partial44, 100, intArray68, 291);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-30610224000000L) + "'", long22 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "29227899" + "'", str34, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hourOfDay" + "'", str38, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 24 + "'", int60 == 24);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, 28533103, 28533103]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unsupportedDurationField1.getValue(1711989809021L, 315532800350L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str2, "UnsupportedDurationField[minutes]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.getDifferenceAsLong((long) 100, (long) 11);
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str12 = dateTimeFieldType11.getName();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.Partial partial18 = new org.joda.time.Partial(dateTimeFieldType11, (int) (short) 0, chronology16);
        org.joda.time.Chronology chronology19 = partial18.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean21 = partial18.isSupported(dateTimeFieldType20);
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial18, (int) '4', locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 89L + "'", long9 == 89L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hourOfDay" + "'", str12, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getDifferenceAsLong((long) ' ', (long) 301418);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unsupportedDurationField1.getDifference(0L, (-210866846400000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = unsupportedDurationField1.getValueAsLong(970L, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        org.joda.time.DurationField durationField12 = unsupportedDateTimeField6.getDurationField();
        long long15 = unsupportedDateTimeField6.getDifferenceAsLong((long) 10, 35L);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = null;
        java.lang.String str42 = dividedDateTimeField27.getAsShortText(readablePartial39, 29227899, locale41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.Partial partial52 = new org.joda.time.Partial(dateTimeFieldType45, (int) (short) 0, chronology50);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray67 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int68 = dateTimeField59.getMaximumValue(readablePartial60, intArray67);
        int int69 = dividedDateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) partial52, intArray67);
        boolean boolean71 = partial52.equals((java.lang.Object) "29227899");
        java.lang.Object obj72 = null;
        boolean boolean73 = partial52.equals(obj72);
        int int74 = partial52.size();
        java.util.Locale locale76 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = unsupportedDateTimeField6.getAsText((org.joda.time.ReadablePartial) partial52, 838, locale76);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-25L) + "'", long15 == (-25L));
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "29227899" + "'", str42, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hourOfDay" + "'", str46, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 24 + "'", int68 == 24);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.Duration duration4 = readableInterval1.toDuration();
        org.joda.time.MutableInterval mutableInterval5 = readableInterval1.toMutableInterval();
        long long6 = readableInterval1.getStartMillis();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.DurationField durationField12 = chronology9.centuries();
        org.joda.time.Chronology chronology13 = chronology9.withUTC();
        org.joda.time.DurationField durationField14 = chronology13.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField18 = new org.joda.time.field.DividedDateTimeField(dateTimeField15, dateTimeFieldType16, 10);
        long long21 = dividedDateTimeField18.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval23);
        org.joda.time.DateTimeField dateTimeField26 = chronology25.yearOfCentury();
        org.joda.time.DurationField durationField27 = chronology25.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField28 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType22, durationField27);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField29 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField18, dateTimeFieldType22);
        org.joda.time.ReadablePartial readablePartial30 = null;
        java.util.Locale locale32 = null;
        java.lang.String str33 = dividedDateTimeField18.getAsShortText(readablePartial30, 29227899, locale32);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField35 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField18, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.Partial partial43 = new org.joda.time.Partial(dateTimeFieldType36, (int) (short) 0, chronology41);
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DurationField durationField48 = chronology46.millis();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial51 = null;
        int[] intArray58 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int59 = dateTimeField50.getMaximumValue(readablePartial51, intArray58);
        int int60 = dividedDateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) partial43, intArray58);
        boolean boolean62 = partial43.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval63 = null;
        org.joda.time.ReadableInterval readableInterval64 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval63);
        org.joda.time.ReadableInterval readableInterval65 = null;
        boolean boolean66 = readableInterval64.contains(readableInterval65);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.Period period68 = readableInterval64.toPeriod(periodType67);
        org.joda.time.DateTime dateTime69 = readableInterval64.getEnd();
        boolean boolean70 = partial43.equals((java.lang.Object) readableInterval64);
        org.joda.time.ReadableInterval readableInterval71 = null;
        org.joda.time.ReadableInterval readableInterval72 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval71);
        org.joda.time.ReadableInterval readableInterval73 = null;
        boolean boolean74 = readableInterval72.contains(readableInterval73);
        org.joda.time.Duration duration75 = readableInterval72.toDuration();
        org.joda.time.DateTime dateTime76 = readableInterval72.getEnd();
        boolean boolean77 = partial43.isMatch((org.joda.time.ReadableInstant) dateTime76);
        boolean boolean78 = readableInterval1.isAfter((org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(duration4);
        org.junit.Assert.assertNotNull(mutableInterval5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-30610224000000L) + "'", long21 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "29227899" + "'", str33, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hourOfDay" + "'", str37, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 24 + "'", int59 == 24);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(readableInterval64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(readableInterval72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(duration75);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        java.lang.String str5 = dateTimeZone3.getShortName(0L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DurationField durationField13 = chronology10.centuries();
        org.joda.time.Chronology chronology14 = chronology10.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField19 = new org.joda.time.field.DividedDateTimeField(dateTimeField16, dateTimeFieldType17, 10);
        long long22 = dividedDateTimeField19.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval24);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField29 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType23, durationField28);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField30 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField19, dateTimeFieldType23);
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = dividedDateTimeField19.getAsShortText(readablePartial31, 29227899, locale33);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField36 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField19, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str38 = dateTimeFieldType37.getName();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.Partial partial44 = new org.joda.time.Partial(dateTimeFieldType37, (int) (short) 0, chronology42);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology47.millis();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial52 = null;
        int[] intArray59 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int60 = dateTimeField51.getMaximumValue(readablePartial52, intArray59);
        int int61 = dividedDateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) partial44, intArray59);
        boolean boolean63 = partial44.equals((java.lang.Object) "29227899");
        java.lang.Object obj64 = null;
        boolean boolean65 = partial44.equals(obj64);
        org.joda.time.Chronology chronology66 = partial44.getChronology();
        int[] intArray68 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray70 = unsupportedDateTimeField6.set((org.joda.time.ReadablePartial) partial44, (int) '#', intArray68, 53460006);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-30610224000000L) + "'", long22 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "29227899" + "'", str34, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hourOfDay" + "'", str38, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 24 + "'", int60 == 24);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(chronology66);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.ReadableInterval readableInterval57 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval56);
        org.joda.time.ReadableInterval readableInterval58 = null;
        boolean boolean59 = readableInterval57.contains(readableInterval58);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = readableInterval57.toPeriod(periodType60);
        org.joda.time.DateTime dateTime62 = readableInterval57.getEnd();
        boolean boolean63 = partial36.equals((java.lang.Object) readableInterval57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType65 = partial36.getFieldType(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(readableInterval57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.ReadableInterval readableInterval57 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval56);
        org.joda.time.ReadableInterval readableInterval58 = null;
        boolean boolean59 = readableInterval57.contains(readableInterval58);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = readableInterval57.toPeriod(periodType60);
        org.joda.time.DateTime dateTime62 = readableInterval57.getEnd();
        boolean boolean63 = partial36.equals((java.lang.Object) readableInterval57);
        org.joda.time.ReadableInterval readableInterval64 = null;
        org.joda.time.ReadableInterval readableInterval65 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval64);
        org.joda.time.ReadableInterval readableInterval66 = null;
        boolean boolean67 = readableInterval65.contains(readableInterval66);
        org.joda.time.Duration duration68 = readableInterval65.toDuration();
        org.joda.time.DateTime dateTime69 = readableInterval65.getEnd();
        boolean boolean70 = partial36.isMatch((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.Chronology chronology71 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime69);
        long long72 = org.joda.time.DateTimeUtils.getInstantMillis((org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(readableInterval57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(readableInterval65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(duration68);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(chronology71);
// flaky:         org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean10 = partial7.isSupported(dateTimeFieldType9);
        boolean boolean11 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial) partial7);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        java.lang.String str4 = unsupportedDurationField1.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str4, "UnsupportedDurationField[minutes]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.weeks();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DurationField durationField29 = offsetDateTimeField28.getLeapDurationField();
        long long31 = offsetDateTimeField28.roundFloor((long) (short) 1);
        long long34 = offsetDateTimeField28.add(0L, 0L);
        org.joda.time.DateTimeField dateTimeField35 = offsetDateTimeField28.getWrappedField();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str37 = dateTimeFieldType36.getName();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.Partial partial43 = new org.joda.time.Partial(dateTimeFieldType36, (int) (short) 0, chronology41);
        org.joda.time.Chronology chronology44 = partial43.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean46 = partial43.isSupported(dateTimeFieldType45);
        int[] intArray48 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray50 = offsetDateTimeField28.addWrapPartial((org.joda.time.ReadablePartial) partial43, (int) (short) 100, intArray48, 960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNull(durationField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hourOfDay" + "'", str37, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        int int5 = dateTimeField4.getMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = dateTimeField4.getMaximumShortTextLength(locale6);
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval12 = null;
        org.joda.time.ReadableInterval readableInterval13 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval12);
        org.joda.time.Chronology chronology14 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval12);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.joda.time.DurationField durationField17 = chronology14.centuries();
        org.joda.time.Chronology chronology18 = chronology14.withUTC();
        org.joda.time.DurationField durationField19 = chronology18.halfdays();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField23 = new org.joda.time.field.DividedDateTimeField(dateTimeField20, dateTimeFieldType21, 10);
        long long26 = dividedDateTimeField23.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval28 = null;
        org.joda.time.ReadableInterval readableInterval29 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval28);
        org.joda.time.Chronology chronology30 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval28);
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.DurationField durationField32 = chronology30.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField33 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType27, durationField32);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField34 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField23, dateTimeFieldType27);
        org.joda.time.ReadablePartial readablePartial35 = null;
        java.util.Locale locale37 = null;
        java.lang.String str38 = dividedDateTimeField23.getAsShortText(readablePartial35, 29227899, locale37);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField40 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField23, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str42 = dateTimeFieldType41.getName();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.Partial partial48 = new org.joda.time.Partial(dateTimeFieldType41, (int) (short) 0, chronology46);
        org.joda.time.ReadableInterval readableInterval49 = null;
        org.joda.time.ReadableInterval readableInterval50 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval49);
        org.joda.time.Chronology chronology51 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval49);
        org.joda.time.DateTimeField dateTimeField52 = chronology51.yearOfCentury();
        org.joda.time.DurationField durationField53 = chronology51.millis();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField55 = chronology51.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial56 = null;
        int[] intArray63 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int64 = dateTimeField55.getMaximumValue(readablePartial56, intArray63);
        int int65 = dividedDateTimeField23.getMinimumValue((org.joda.time.ReadablePartial) partial48, intArray63);
        boolean boolean67 = partial48.equals((java.lang.Object) "29227899");
        boolean boolean69 = partial48.equals((java.lang.Object) 2767716812L);
        java.util.Locale locale71 = null;
        java.lang.String str72 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) partial48, 11, locale71);
        org.joda.time.ReadableInterval readableInterval73 = null;
        org.joda.time.ReadableInterval readableInterval74 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval73);
        org.joda.time.Chronology chronology75 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval73);
        org.joda.time.DateTimeField dateTimeField76 = chronology75.yearOfCentury();
        org.joda.time.DurationField durationField77 = chronology75.millis();
        org.joda.time.DateTimeField dateTimeField78 = chronology75.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval79 = null;
        org.joda.time.ReadableInterval readableInterval80 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval79);
        org.joda.time.Chronology chronology81 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval79);
        org.joda.time.DateTimeField dateTimeField82 = chronology81.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField83 = chronology81.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval84 = null;
        org.joda.time.ReadableInterval readableInterval85 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval84);
        org.joda.time.ReadableInterval readableInterval86 = null;
        boolean boolean87 = readableInterval85.contains(readableInterval86);
        org.joda.time.PeriodType periodType88 = null;
        org.joda.time.Period period89 = readableInterval85.toPeriod(periodType88);
        int[] intArray91 = chronology81.get((org.joda.time.ReadablePeriod) period89, (-210866846400000L));
        int[] intArray94 = chronology75.get((org.joda.time.ReadablePeriod) period89, 2173795348453L, (long) 1439);
        org.joda.time.Partial partial95 = partial48.minus((org.joda.time.ReadablePeriod) period89);
        java.util.Locale locale96 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) partial48, locale96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(readableInterval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-30610224000000L) + "'", long26 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(readableInterval29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "29227899" + "'", str38, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hourOfDay" + "'", str42, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(readableInterval50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 24 + "'", int64 == 24);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "11" + "'", str72, "11");
        org.junit.Assert.assertNotNull(readableInterval74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertNotNull(dateTimeField78);
        org.junit.Assert.assertNotNull(readableInterval80);
        org.junit.Assert.assertNotNull(chronology81);
        org.junit.Assert.assertNotNull(dateTimeField82);
        org.junit.Assert.assertNotNull(dateTimeField83);
        org.junit.Assert.assertNotNull(readableInterval85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(period89);
        org.junit.Assert.assertNotNull(intArray91);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray91), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(partial95);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        java.lang.String str9 = partial7.toString("9");
        java.lang.String str11 = partial7.toString("-08:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9" + "'", str9, "9");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-08:00" + "'", str11, "-08:00");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = unsupportedDateTimeField6.add((-31L), (long) '#');
        org.joda.time.DurationField durationField10 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.DurationField durationField11 = unsupportedDateTimeField6.getRangeDurationField();
        long long14 = unsupportedDateTimeField6.getDifferenceAsLong(10L, 0L);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = unsupportedDateTimeField6.getType();
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.ReadableInterval readableInterval18 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval17);
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval17);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        org.joda.time.DurationField durationField21 = chronology19.minutes();
        org.joda.time.DurationField durationField22 = chronology19.halfdays();
        org.joda.time.DurationField durationField23 = chronology19.weeks();
        long long27 = chronology19.add((long) 29227899, 97L, (int) (byte) 100);
        org.joda.time.Partial partial28 = new org.joda.time.Partial(dateTimeFieldType15, (int) '4', chronology19);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = partial28.getValue(53460006);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53460006");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 4L + "'", long9 == 4L);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 29237599L + "'", long27 == 29237599L);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        long long15 = dividedDateTimeField11.roundCeiling((long) (byte) 1);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = null;
        java.lang.String str42 = dividedDateTimeField27.getAsShortText(readablePartial39, 29227899, locale41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.Partial partial52 = new org.joda.time.Partial(dateTimeFieldType45, (int) (short) 0, chronology50);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray67 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int68 = dateTimeField59.getMaximumValue(readablePartial60, intArray67);
        int int69 = dividedDateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) partial52, intArray67);
        boolean boolean71 = partial52.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval72 = null;
        org.joda.time.ReadableInterval readableInterval73 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        boolean boolean75 = readableInterval73.contains(readableInterval74);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = readableInterval73.toPeriod(periodType76);
        org.joda.time.DateTime dateTime78 = readableInterval73.getEnd();
        boolean boolean79 = partial52.equals((java.lang.Object) readableInterval73);
        int int80 = dividedDateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) partial52);
        long long82 = dividedDateTimeField11.roundFloor(1711989809021L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 315532800000L + "'", long15 == 315532800000L);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "29227899" + "'", str42, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hourOfDay" + "'", str46, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 24 + "'", int68 == 24);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(readableInterval73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 29227899 + "'", int80 == 29227899);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1577836800000L + "'", long82 == 1577836800000L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        boolean boolean5 = durationFieldType0.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.halfdays();
        long long9 = durationField6.add((long) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-43199990L) + "'", long9 == (-43199990L));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.ReadableInterval readableInterval19 = null;
        org.joda.time.ReadableInterval readableInterval20 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval19);
        org.joda.time.Chronology chronology21 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval19);
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology21.millis();
        org.joda.time.DurationField durationField24 = chronology21.centuries();
        org.joda.time.Chronology chronology25 = chronology21.withUTC();
        org.joda.time.DurationField durationField26 = chronology25.halfdays();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField30 = new org.joda.time.field.DividedDateTimeField(dateTimeField27, dateTimeFieldType28, 10);
        long long33 = dividedDateTimeField30.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval35 = null;
        org.joda.time.ReadableInterval readableInterval36 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval35);
        org.joda.time.Chronology chronology37 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval35);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.yearOfCentury();
        org.joda.time.DurationField durationField39 = chronology37.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField40 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType34, durationField39);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField41 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField30, dateTimeFieldType34);
        org.joda.time.ReadablePartial readablePartial42 = null;
        java.util.Locale locale44 = null;
        java.lang.String str45 = dividedDateTimeField30.getAsShortText(readablePartial42, 29227899, locale44);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField47 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField30, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str49 = dateTimeFieldType48.getName();
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.ReadableInterval readableInterval52 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval51);
        org.joda.time.Chronology chronology53 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval51);
        org.joda.time.DateTimeField dateTimeField54 = chronology53.yearOfCentury();
        org.joda.time.Partial partial55 = new org.joda.time.Partial(dateTimeFieldType48, (int) (short) 0, chronology53);
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.ReadableInterval readableInterval57 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval56);
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval56);
        org.joda.time.DateTimeField dateTimeField59 = chronology58.yearOfCentury();
        org.joda.time.DurationField durationField60 = chronology58.millis();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial63 = null;
        int[] intArray70 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int71 = dateTimeField62.getMaximumValue(readablePartial63, intArray70);
        int int72 = dividedDateTimeField30.getMinimumValue((org.joda.time.ReadablePartial) partial55, intArray70);
        boolean boolean74 = partial55.equals((java.lang.Object) "29227899");
        boolean boolean76 = partial55.equals((java.lang.Object) 2767716812L);
        java.util.Locale locale78 = null;
        java.lang.String str79 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) partial55, 11, locale78);
        java.util.Locale locale81 = null;
        java.lang.String str82 = dividedDateTimeField11.getAsShortText((org.joda.time.ReadablePartial) partial55, 1, locale81);
        long long84 = dividedDateTimeField11.roundFloor((long) (short) 100);
        java.lang.String str85 = dividedDateTimeField11.getName();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(readableInterval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-30610224000000L) + "'", long33 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(readableInterval36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "29227899" + "'", str45, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hourOfDay" + "'", str49, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(readableInterval57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 24 + "'", int71 == 24);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "11" + "'", str79, "11");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "1" + "'", str82, "1");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "centuryOfEra" + "'", str85, "centuryOfEra");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        int int29 = dividedDateTimeField11.iDivisor;
        long long32 = dividedDateTimeField11.add((long) 8, (long) 'a');
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 30610224000008L + "'", long32 == 30610224000008L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        org.joda.time.DurationField durationField7 = unsupportedDateTimeField6.getLeapDurationField();
        org.joda.time.ReadableInterval readableInterval8 = null;
        org.joda.time.ReadableInterval readableInterval9 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval8);
        org.joda.time.Chronology chronology10 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval8);
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.DurationField durationField13 = chronology10.centuries();
        org.joda.time.Chronology chronology14 = chronology10.withUTC();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField19 = new org.joda.time.field.DividedDateTimeField(dateTimeField16, dateTimeFieldType17, 10);
        long long22 = dividedDateTimeField19.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval24);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField29 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType23, durationField28);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField30 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField19, dateTimeFieldType23);
        org.joda.time.ReadablePartial readablePartial31 = null;
        java.util.Locale locale33 = null;
        java.lang.String str34 = dividedDateTimeField19.getAsShortText(readablePartial31, 29227899, locale33);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField36 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField19, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str38 = dateTimeFieldType37.getName();
        org.joda.time.ReadableInterval readableInterval40 = null;
        org.joda.time.ReadableInterval readableInterval41 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval40);
        org.joda.time.Chronology chronology42 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval40);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.yearOfCentury();
        org.joda.time.Partial partial44 = new org.joda.time.Partial(dateTimeFieldType37, (int) (short) 0, chronology42);
        org.joda.time.ReadableInterval readableInterval45 = null;
        org.joda.time.ReadableInterval readableInterval46 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval45);
        org.joda.time.Chronology chronology47 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval45);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField49 = chronology47.millis();
        org.joda.time.DateTimeField dateTimeField50 = chronology47.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = chronology47.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial52 = null;
        int[] intArray59 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int60 = dateTimeField51.getMaximumValue(readablePartial52, intArray59);
        int int61 = dividedDateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) partial44, intArray59);
        boolean boolean63 = partial44.equals((java.lang.Object) "29227899");
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str65 = dateTimeFieldType64.getName();
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.ReadableInterval readableInterval68 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval67);
        org.joda.time.Chronology chronology69 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval67);
        org.joda.time.DateTimeField dateTimeField70 = chronology69.yearOfCentury();
        org.joda.time.Partial partial71 = new org.joda.time.Partial(dateTimeFieldType64, (int) (short) 0, chronology69);
        boolean boolean72 = partial44.isBefore((org.joda.time.ReadablePartial) partial71);
        org.joda.time.chrono.GregorianChronology gregorianChronology73 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone74 = gregorianChronology73.getZone();
        org.joda.time.Chronology chronology75 = gregorianChronology73.withUTC();
        org.joda.time.Partial partial76 = partial71.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology73);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = unsupportedDateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) partial76);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: dayOfYear field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(readableInterval9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-30610224000000L) + "'", long22 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "29227899" + "'", str34, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hourOfDay" + "'", str38, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(readableInterval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 24 + "'", int60 == 24);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hourOfDay" + "'", str65, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(gregorianChronology73);
        org.junit.Assert.assertNotNull(dateTimeZone74);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(partial76);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        long long15 = dividedDateTimeField11.roundCeiling((long) (byte) 1);
        long long17 = dividedDateTimeField11.roundFloor((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField19 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, dateTimeFieldType18);
        int int21 = zeroIsMaxDateTimeField19.getMaximumValue(28800001L);
        long long24 = zeroIsMaxDateTimeField19.add((long) 8, (int) (byte) 0);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.joda.time.Chronology chronology31 = chronology27.withUTC();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology31.add(readablePeriod32, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = chronology31.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = chronology31.hourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField39 = iSOChronology38.minutes();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology38.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology38.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField43 = new org.joda.time.field.OffsetDateTimeField(dateTimeField41, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str45 = dateTimeFieldType44.getName();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval47);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.Partial partial51 = new org.joda.time.Partial(dateTimeFieldType44, (int) (short) 0, chronology49);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DurationField durationField58 = chronology55.centuries();
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.ReadableInterval readableInterval60 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval59);
        org.joda.time.Chronology chronology61 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval59);
        org.joda.time.DateTimeField dateTimeField62 = chronology61.yearOfCentury();
        org.joda.time.DurationField durationField63 = chronology61.millis();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        int[] intArray77 = chronology67.get((org.joda.time.ReadablePeriod) period75, (-210866846400000L));
        int[] intArray80 = chronology61.get((org.joda.time.ReadablePeriod) period75, 2173795348453L, (long) 1439);
        int[] intArray83 = chronology55.get((org.joda.time.ReadablePeriod) period75, (-210861660779418L), 1711989798988L);
        int[] intArray85 = offsetDateTimeField43.add((org.joda.time.ReadablePartial) partial51, 11, intArray83, 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray86 = partial51.getFields();
        int[] intArray87 = null;
        int int88 = dateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) partial51, intArray87);
        org.joda.time.Chronology chronology89 = partial51.getChronology();
        int int90 = zeroIsMaxDateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) partial51);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 315532800000L + "'", long15 == 315532800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29227900 + "'", int21 == 29227900);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8L + "'", long24 == 8L);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(iSOChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hourOfDay" + "'", str45, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(readableInterval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray77);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray83);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[6736, 2, 1, 3, 4, 16, 18, 406]");
        org.junit.Assert.assertNotNull(intArray85);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[6736, 2, 1, 3, 4, 16, 18, 406]");
        org.junit.Assert.assertNotNull(dateTimeFieldArray86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        long long15 = dividedDateTimeField11.roundCeiling((long) (byte) 1);
        long long17 = dividedDateTimeField11.roundFloor((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField19 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, dateTimeFieldType18);
        int int21 = zeroIsMaxDateTimeField19.getMaximumValue(28800001L);
        long long24 = zeroIsMaxDateTimeField19.add((-62135568421900L), 291L);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.joda.time.Chronology chronology31 = chronology27.withUTC();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology31.add(readablePeriod32, 0L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = chronology31.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = chronology31.hourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology38 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField39 = iSOChronology38.minutes();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology38.millisOfDay();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology38.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField43 = new org.joda.time.field.OffsetDateTimeField(dateTimeField41, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str45 = dateTimeFieldType44.getName();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval47);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.Partial partial51 = new org.joda.time.Partial(dateTimeFieldType44, (int) (short) 0, chronology49);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DurationField durationField58 = chronology55.centuries();
        org.joda.time.ReadableInterval readableInterval59 = null;
        org.joda.time.ReadableInterval readableInterval60 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval59);
        org.joda.time.Chronology chronology61 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval59);
        org.joda.time.DateTimeField dateTimeField62 = chronology61.yearOfCentury();
        org.joda.time.DurationField durationField63 = chronology61.millis();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval65 = null;
        org.joda.time.ReadableInterval readableInterval66 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval65);
        org.joda.time.Chronology chronology67 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval65);
        org.joda.time.DateTimeField dateTimeField68 = chronology67.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval70 = null;
        org.joda.time.ReadableInterval readableInterval71 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval70);
        org.joda.time.ReadableInterval readableInterval72 = null;
        boolean boolean73 = readableInterval71.contains(readableInterval72);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = readableInterval71.toPeriod(periodType74);
        int[] intArray77 = chronology67.get((org.joda.time.ReadablePeriod) period75, (-210866846400000L));
        int[] intArray80 = chronology61.get((org.joda.time.ReadablePeriod) period75, 2173795348453L, (long) 1439);
        int[] intArray83 = chronology55.get((org.joda.time.ReadablePeriod) period75, (-210861660779418L), 1711989798988L);
        int[] intArray85 = offsetDateTimeField43.add((org.joda.time.ReadablePartial) partial51, 11, intArray83, 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray86 = partial51.getFields();
        int[] intArray87 = null;
        int int88 = dateTimeField37.getMinimumValue((org.joda.time.ReadablePartial) partial51, intArray87);
        org.joda.time.Chronology chronology89 = partial51.getChronology();
        int int90 = zeroIsMaxDateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) partial51);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 315532800000L + "'", long15 == 315532800000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29227900 + "'", int21 == 29227900);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 29695103578100L + "'", long24 == 29695103578100L);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(iSOChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hourOfDay" + "'", str45, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(readableInterval60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(readableInterval66);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(readableInterval71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertNotNull(intArray77);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray83);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[6736, 2, 1, 3, 4, 16, 18, 406]");
        org.junit.Assert.assertNotNull(intArray85);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray85), "[6736, 2, 1, 3, 4, 16, 18, 406]");
        org.junit.Assert.assertNotNull(dateTimeFieldArray86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(chronology89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        long long15 = dividedDateTimeField11.roundCeiling((long) (byte) 1);
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DurationField durationField21 = chronology18.centuries();
        org.joda.time.Chronology chronology22 = chronology18.withUTC();
        org.joda.time.DurationField durationField23 = chronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField27 = new org.joda.time.field.DividedDateTimeField(dateTimeField24, dateTimeFieldType25, 10);
        long long30 = dividedDateTimeField27.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.DurationField durationField36 = chronology34.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField37 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType31, durationField36);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField38 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField27, dateTimeFieldType31);
        org.joda.time.ReadablePartial readablePartial39 = null;
        java.util.Locale locale41 = null;
        java.lang.String str42 = dividedDateTimeField27.getAsShortText(readablePartial39, 29227899, locale41);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField44 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField27, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.ReadableInterval readableInterval48 = null;
        org.joda.time.ReadableInterval readableInterval49 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval48);
        org.joda.time.Chronology chronology50 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval48);
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.Partial partial52 = new org.joda.time.Partial(dateTimeFieldType45, (int) (short) 0, chronology50);
        org.joda.time.ReadableInterval readableInterval53 = null;
        org.joda.time.ReadableInterval readableInterval54 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval53);
        org.joda.time.Chronology chronology55 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval53);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfCentury();
        org.joda.time.DurationField durationField57 = chronology55.millis();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial60 = null;
        int[] intArray67 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int68 = dateTimeField59.getMaximumValue(readablePartial60, intArray67);
        int int69 = dividedDateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) partial52, intArray67);
        boolean boolean71 = partial52.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval72 = null;
        org.joda.time.ReadableInterval readableInterval73 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval72);
        org.joda.time.ReadableInterval readableInterval74 = null;
        boolean boolean75 = readableInterval73.contains(readableInterval74);
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.Period period77 = readableInterval73.toPeriod(periodType76);
        org.joda.time.DateTime dateTime78 = readableInterval73.getEnd();
        boolean boolean79 = partial52.equals((java.lang.Object) readableInterval73);
        int int80 = dividedDateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) partial52);
        java.lang.String str81 = partial52.toStringList();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 315532800000L + "'", long15 == 315532800000L);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-30610224000000L) + "'", long30 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "29227899" + "'", str42, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hourOfDay" + "'", str46, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(readableInterval54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 24 + "'", int68 == 24);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(readableInterval73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(period77);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 29227899 + "'", int80 == 29227899);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "[hourOfDay=0]" + "'", str81, "[hourOfDay=0]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.Chronology chronology8 = partial7.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType9.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = partial7.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(durationFieldType10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException5 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType0, (java.lang.Number) 1711989800398L, (java.lang.Number) 11, (java.lang.Number) (-31L));
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        org.joda.time.Chronology chronology9 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval7);
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField12 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType6, durationField11);
        long long15 = durationField11.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.ReadableInterval readableInterval18 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval17);
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval17);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        boolean boolean21 = durationFieldType16.isSupported(chronology19);
        org.joda.time.field.ScaledDurationField scaledDurationField23 = new org.joda.time.field.ScaledDurationField(durationField11, durationFieldType16, (int) 'a');
        int int25 = scaledDurationField23.getValue((long) (short) -1);
        long long28 = scaledDurationField23.getMillis((long) 100, 0L);
        long long31 = scaledDurationField23.getDifferenceAsLong((long) 100, (long) 28533103);
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField32 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, (org.joda.time.DurationField) scaledDurationField23);
        org.joda.time.DurationField durationField33 = unsupportedDateTimeField32.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(readableInterval8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-210866846400000L) + "'", long15 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(readableInterval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9700L + "'", long28 == 9700L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-294154L) + "'", long31 == (-294154L));
        org.junit.Assert.assertNotNull(unsupportedDateTimeField32);
        org.junit.Assert.assertNull(durationField33);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int int13 = dividedDateTimeField11.getMaximumValue(readablePartial12);
        int int14 = dividedDateTimeField11.getMaximumValue();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology17.minutes();
        long long22 = durationField19.getDifferenceAsLong(1711989797111L, (long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField24 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField19, dateTimeFieldType23);
        org.joda.time.Partial partial26 = new org.joda.time.Partial(dateTimeFieldType23, (int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.IllegalFieldValueException illegalFieldValueException30 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType27, (java.lang.Number) 60035L, "");
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType27.getDurationType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException34 = new org.joda.time.IllegalFieldValueException(dateTimeFieldType27, (java.lang.Number) 291L, "hours");
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType27.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int36 = partial26.get(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29227899 + "'", int13 == 29227899);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29227899 + "'", int14 == 29227899);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 28533163L + "'", long22 == 28533163L);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(durationFieldType35);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField10 = iSOChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology9.seconds();
        org.joda.time.DurationField durationField14 = iSOChronology9.years();
        org.joda.time.DurationField durationField15 = iSOChronology9.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial16 = new org.joda.time.Partial(dateTimeFieldType0, 97, (org.joda.time.Chronology) iSOChronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology2.getZone();
        org.joda.time.DurationField durationField7 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.clockhourOfHalfday();
        org.joda.time.Partial partial9 = new org.joda.time.Partial(chronology2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = partial9.toString(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadableInterval readableInterval23 = null;
        org.joda.time.ReadableInterval readableInterval24 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval23);
        org.joda.time.Chronology chronology25 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval23);
        org.joda.time.DateTimeField dateTimeField26 = chronology25.yearOfCentury();
        org.joda.time.DurationField durationField27 = chronology25.millis();
        org.joda.time.DurationField durationField28 = chronology25.centuries();
        org.joda.time.Chronology chronology29 = chronology25.withUTC();
        org.joda.time.DurationField durationField30 = chronology29.halfdays();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField34 = new org.joda.time.field.DividedDateTimeField(dateTimeField31, dateTimeFieldType32, 10);
        long long37 = dividedDateTimeField34.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DurationField durationField43 = chronology41.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField44 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType38, durationField43);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField45 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField34, dateTimeFieldType38);
        org.joda.time.ReadablePartial readablePartial46 = null;
        java.util.Locale locale48 = null;
        java.lang.String str49 = dividedDateTimeField34.getAsShortText(readablePartial46, 29227899, locale48);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField51 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField34, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str53 = dateTimeFieldType52.getName();
        org.joda.time.ReadableInterval readableInterval55 = null;
        org.joda.time.ReadableInterval readableInterval56 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval55);
        org.joda.time.Chronology chronology57 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval55);
        org.joda.time.DateTimeField dateTimeField58 = chronology57.yearOfCentury();
        org.joda.time.Partial partial59 = new org.joda.time.Partial(dateTimeFieldType52, (int) (short) 0, chronology57);
        org.joda.time.ReadableInterval readableInterval60 = null;
        org.joda.time.ReadableInterval readableInterval61 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval60);
        org.joda.time.Chronology chronology62 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval60);
        org.joda.time.DateTimeField dateTimeField63 = chronology62.yearOfCentury();
        org.joda.time.DurationField durationField64 = chronology62.millis();
        org.joda.time.DateTimeField dateTimeField65 = chronology62.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField66 = chronology62.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial67 = null;
        int[] intArray74 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int75 = dateTimeField66.getMaximumValue(readablePartial67, intArray74);
        int int76 = dividedDateTimeField34.getMinimumValue((org.joda.time.ReadablePartial) partial59, intArray74);
        boolean boolean78 = partial59.equals((java.lang.Object) "29227899");
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str80 = dateTimeFieldType79.getName();
        org.joda.time.ReadableInterval readableInterval82 = null;
        org.joda.time.ReadableInterval readableInterval83 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval82);
        org.joda.time.Chronology chronology84 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval82);
        org.joda.time.DateTimeField dateTimeField85 = chronology84.yearOfCentury();
        org.joda.time.Partial partial86 = new org.joda.time.Partial(dateTimeFieldType79, (int) (short) 0, chronology84);
        boolean boolean87 = partial59.isBefore((org.joda.time.ReadablePartial) partial86);
        org.joda.time.chrono.GregorianChronology gregorianChronology88 = org.joda.time.chrono.GregorianChronology.getInstanceUTC();
        org.joda.time.DateTimeZone dateTimeZone89 = gregorianChronology88.getZone();
        org.joda.time.Chronology chronology90 = gregorianChronology88.withUTC();
        org.joda.time.Partial partial91 = partial86.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology88);
        java.util.Locale locale93 = null;
        java.lang.String str94 = dividedDateTimeField11.getAsShortText((org.joda.time.ReadablePartial) partial91, (int) (byte) 0, locale93);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertNotNull(readableInterval24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-30610224000000L) + "'", long37 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(readableInterval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "29227899" + "'", str49, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hourOfDay" + "'", str53, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(readableInterval61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 24 + "'", int75 == 24);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hourOfDay" + "'", str80, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval83);
        org.junit.Assert.assertNotNull(chronology84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(gregorianChronology88);
        org.junit.Assert.assertNotNull(dateTimeZone89);
        org.junit.Assert.assertNotNull(chronology90);
        org.junit.Assert.assertNotNull(partial91);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "0" + "'", str94, "0");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField4 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField5 = iSOChronology0.months();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        java.lang.String str2 = unsupportedDurationField1.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval4 = null;
        org.joda.time.ReadableInterval readableInterval5 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval4);
        org.joda.time.Chronology chronology6 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval4);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType3, durationField8);
        long long12 = durationField8.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.ReadableInterval readableInterval15 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval14);
        org.joda.time.Chronology chronology16 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval14);
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        boolean boolean18 = durationFieldType13.isSupported(chronology16);
        org.joda.time.field.ScaledDurationField scaledDurationField20 = new org.joda.time.field.ScaledDurationField(durationField8, durationFieldType13, (int) 'a');
        org.joda.time.DurationField durationField21 = scaledDurationField20.getWrappedField();
        long long24 = scaledDurationField20.add((-210866846400000L), (long) 53460006);
        int int27 = scaledDurationField20.getValue((long) 1, 1L);
        boolean boolean28 = scaledDurationField20.isPrecise();
        long long30 = scaledDurationField20.getMillis((int) (short) 10);
        org.joda.time.DurationField durationField31 = scaledDurationField20.getWrappedField();
        org.joda.time.tz.DefaultNameProvider defaultNameProvider32 = new org.joda.time.tz.DefaultNameProvider();
        boolean boolean33 = scaledDurationField20.equals((java.lang.Object) defaultNameProvider32);
        int int34 = unsupportedDurationField1.compareTo((org.joda.time.DurationField) scaledDurationField20);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnsupportedDurationField[minutes]" + "'", str2, "UnsupportedDurationField[minutes]");
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(readableInterval5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-210866846400000L) + "'", long12 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(readableInterval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-210861660779418L) + "'", long24 == (-210861660779418L));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 970L + "'", long30 == 970L);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder0 = new org.joda.time.tz.DateTimeZoneBuilder();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = dateTimeZoneBuilder0.setFixedSavings("UTC", 100);
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder14 = dateTimeZoneBuilder0.addRecurringSavings("197", (int) ' ', 301418, 4, '4', 8, 291, 2, false, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder3);
        org.junit.Assert.assertNotNull(dateTimeZoneBuilder14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        org.joda.time.DurationField durationField2 = null;
        int int3 = unsupportedDurationField1.compareTo(durationField2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unsupportedDurationField1.getValue(29695103578100L, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.Partial partial7 = new org.joda.time.Partial(dateTimeFieldType0, (int) (short) 0, chronology5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = partial7.get(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hourOfDay" + "'", str1, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval1 = null;
        org.joda.time.ReadableInterval readableInterval2 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval1);
        org.joda.time.Chronology chronology3 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval1);
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField5);
        long long9 = durationField5.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval11 = null;
        org.joda.time.ReadableInterval readableInterval12 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval11);
        org.joda.time.Chronology chronology13 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval11);
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        boolean boolean15 = durationFieldType10.isSupported(chronology13);
        org.joda.time.field.ScaledDurationField scaledDurationField17 = new org.joda.time.field.ScaledDurationField(durationField5, durationFieldType10, (int) 'a');
        int int19 = scaledDurationField17.getValue((long) (short) -1);
        long long22 = scaledDurationField17.getMillis((long) 100, 0L);
        long long25 = scaledDurationField17.getMillis(1, 97L);
        long long27 = scaledDurationField17.getMillis((int) (byte) -1);
        int int29 = scaledDurationField17.getValue((long) '#');
        long long32 = scaledDurationField17.getValueAsLong(31380171L, (long) (byte) -1);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField34 = iSOChronology33.minutes();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology33.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology33.halfdayOfDay();
        boolean boolean38 = scaledDurationField17.equals((java.lang.Object) iSOChronology33);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str40 = dateTimeZone39.toString();
        java.lang.String str42 = dateTimeZone39.getShortName((-210866846400000L));
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeUtils.getZone(dateTimeZone39);
        org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone44 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone43);
        long long47 = cachedDateTimeZone44.adjustOffset((-971L), true);
        org.joda.time.Chronology chronology48 = iSOChronology33.withZone((org.joda.time.DateTimeZone) cachedDateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(readableInterval2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-210866846400000L) + "'", long9 == (-210866846400000L));
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(readableInterval12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9700L + "'", long22 == 9700L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-97L) + "'", long27 == (-97L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 323506L + "'", long32 == 323506L);
        org.junit.Assert.assertNotNull(iSOChronology33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "UTC" + "'", str40, "UTC");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00" + "'", str42, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(cachedDateTimeZone44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-971L) + "'", long47 == (-971L));
        org.junit.Assert.assertNotNull(chronology48);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "minutes" + "'", str3, "minutes");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        long long6 = dateTimeField4.roundFloor((long) (short) 0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        long long29 = dividedDateTimeField11.addWrapField((long) 0, (int) (byte) 100);
        org.joda.time.DurationField durationField30 = dividedDateTimeField11.getDurationField();
        org.joda.time.DurationField durationField31 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str33 = dateTimeFieldType32.toString();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField34 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField31, dateTimeFieldType32);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField36 = iSOChronology35.minutes();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology35.millisOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology35.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField40 = new org.joda.time.field.OffsetDateTimeField(dateTimeField38, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str42 = dateTimeFieldType41.getName();
        org.joda.time.ReadableInterval readableInterval44 = null;
        org.joda.time.ReadableInterval readableInterval45 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval44);
        org.joda.time.Chronology chronology46 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval44);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.Partial partial48 = new org.joda.time.Partial(dateTimeFieldType41, (int) (short) 0, chronology46);
        org.joda.time.ReadableInterval readableInterval50 = null;
        org.joda.time.ReadableInterval readableInterval51 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval50);
        org.joda.time.Chronology chronology52 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval50);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DurationField durationField54 = chronology52.millis();
        org.joda.time.DurationField durationField55 = chronology52.centuries();
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.ReadableInterval readableInterval57 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval56);
        org.joda.time.Chronology chronology58 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval56);
        org.joda.time.DateTimeField dateTimeField59 = chronology58.yearOfCentury();
        org.joda.time.DurationField durationField60 = chronology58.millis();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.Chronology chronology64 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval62);
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval67 = null;
        org.joda.time.ReadableInterval readableInterval68 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval67);
        org.joda.time.ReadableInterval readableInterval69 = null;
        boolean boolean70 = readableInterval68.contains(readableInterval69);
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.Period period72 = readableInterval68.toPeriod(periodType71);
        int[] intArray74 = chronology64.get((org.joda.time.ReadablePeriod) period72, (-210866846400000L));
        int[] intArray77 = chronology58.get((org.joda.time.ReadablePeriod) period72, 2173795348453L, (long) 1439);
        int[] intArray80 = chronology52.get((org.joda.time.ReadablePeriod) period72, (-210861660779418L), 1711989798988L);
        int[] intArray82 = offsetDateTimeField40.add((org.joda.time.ReadablePartial) partial48, 11, intArray80, 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray83 = partial48.getFields();
        java.lang.String str84 = partial48.toStringList();
        java.util.Locale locale85 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str86 = remainderDateTimeField34.getAsText((org.joda.time.ReadablePartial) partial48, locale85);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 31556995200000L + "'", long29 == 31556995200000L);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "dayOfMonth" + "'", str33, "dayOfMonth");
        org.junit.Assert.assertNotNull(iSOChronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hourOfDay" + "'", str42, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(readableInterval51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertNotNull(readableInterval57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(readableInterval68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(period72);
        org.junit.Assert.assertNotNull(intArray74);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray80);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray80), "[6736, 2, 1, 3, 4, 16, 18, 406]");
        org.junit.Assert.assertNotNull(intArray82);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray82), "[6736, 2, 1, 3, 4, 16, 18, 406]");
        org.junit.Assert.assertNotNull(dateTimeFieldArray83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "[hourOfDay=0]" + "'", str84, "[hourOfDay=0]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getChronology(chronology6);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.DurationField durationField14 = chronology11.centuries();
        org.joda.time.Chronology chronology15 = chronology11.withUTC();
        org.joda.time.DurationField durationField16 = chronology15.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField20 = new org.joda.time.field.DividedDateTimeField(dateTimeField17, dateTimeFieldType18, 10);
        org.joda.time.ReadablePartial readablePartial21 = null;
        int int22 = dividedDateTimeField20.getMaximumValue(readablePartial21);
        int int23 = dividedDateTimeField20.getMaximumValue();
        org.joda.time.ReadableInterval readableInterval24 = null;
        org.joda.time.ReadableInterval readableInterval25 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval24);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval24);
        org.joda.time.DateTimeField dateTimeField27 = chronology26.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology26.minutes();
        long long31 = durationField28.getDifferenceAsLong(1711989797111L, (long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField33 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField20, durationField28, dateTimeFieldType32);
        org.joda.time.Partial partial35 = new org.joda.time.Partial(dateTimeFieldType32, (int) (byte) 10);
        int[] intArray37 = chronology8.get((org.joda.time.ReadablePartial) partial35, 1711989799795L);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29227899 + "'", int22 == 29227899);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29227899 + "'", int23 == 29227899);
        org.junit.Assert.assertNotNull(readableInterval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 28533163L + "'", long31 == 28533163L);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[19]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.ReadableInterval readableInterval2 = null;
        boolean boolean3 = readableInterval1.contains(readableInterval2);
        org.joda.time.ReadableInterval readableInterval4 = null;
        boolean boolean5 = readableInterval1.isBefore(readableInterval4);
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        long long8 = readableInterval7.getStartMillis();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        long long11 = readableInterval10.getEndMillis();
        boolean boolean12 = readableInterval7.overlaps(readableInterval10);
        boolean boolean13 = readableInterval1.overlaps(readableInterval7);
        org.joda.time.Duration duration14 = readableInterval1.toDuration();
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.DurationField durationField20 = chronology17.centuries();
        org.joda.time.Chronology chronology21 = chronology17.withUTC();
        org.joda.time.DurationField durationField22 = chronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField26 = new org.joda.time.field.DividedDateTimeField(dateTimeField23, dateTimeFieldType24, 10);
        long long29 = dividedDateTimeField26.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval31 = null;
        org.joda.time.ReadableInterval readableInterval32 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval31);
        org.joda.time.Chronology chronology33 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval31);
        org.joda.time.DateTimeField dateTimeField34 = chronology33.yearOfCentury();
        org.joda.time.DurationField durationField35 = chronology33.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField36 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType30, durationField35);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField37 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField26, dateTimeFieldType30);
        org.joda.time.ReadablePartial readablePartial38 = null;
        java.util.Locale locale40 = null;
        java.lang.String str41 = dividedDateTimeField26.getAsShortText(readablePartial38, 29227899, locale40);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField43 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField26, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str45 = dateTimeFieldType44.getName();
        org.joda.time.ReadableInterval readableInterval47 = null;
        org.joda.time.ReadableInterval readableInterval48 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval47);
        org.joda.time.Chronology chronology49 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval47);
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        org.joda.time.Partial partial51 = new org.joda.time.Partial(dateTimeFieldType44, (int) (short) 0, chronology49);
        org.joda.time.ReadableInterval readableInterval52 = null;
        org.joda.time.ReadableInterval readableInterval53 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval52);
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval52);
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfCentury();
        org.joda.time.DurationField durationField56 = chronology54.millis();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial59 = null;
        int[] intArray66 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int67 = dateTimeField58.getMaximumValue(readablePartial59, intArray66);
        int int68 = dividedDateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) partial51, intArray66);
        boolean boolean70 = partial51.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval71 = null;
        org.joda.time.ReadableInterval readableInterval72 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval71);
        org.joda.time.ReadableInterval readableInterval73 = null;
        boolean boolean74 = readableInterval72.contains(readableInterval73);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = readableInterval72.toPeriod(periodType75);
        org.joda.time.DateTime dateTime77 = readableInterval72.getEnd();
        boolean boolean78 = partial51.equals((java.lang.Object) readableInterval72);
        org.joda.time.PeriodType periodType79 = null;
        org.joda.time.PeriodType periodType80 = org.joda.time.DateTimeUtils.getPeriodType(periodType79);
        org.joda.time.PeriodType periodType81 = org.joda.time.DateTimeUtils.getPeriodType(periodType79);
        org.joda.time.Period period82 = readableInterval72.toPeriod(periodType81);
        org.joda.time.Period period83 = readableInterval1.toPeriod(periodType81);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(readableInterval7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(readableInterval10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-30610224000000L) + "'", long29 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(readableInterval32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "29227899" + "'", str41, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hourOfDay" + "'", str45, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(readableInterval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 24 + "'", int67 == 24);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(readableInterval72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(periodType80);
        org.junit.Assert.assertNotNull(periodType81);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period83);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.joda.time.IllegalFieldValueException illegalFieldValueException2 = new org.joda.time.IllegalFieldValueException("PST", "1");
        java.lang.Number number3 = illegalFieldValueException2.getLowerBound();
        org.junit.Assert.assertNull(number3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval56 = null;
        org.joda.time.ReadableInterval readableInterval57 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval56);
        org.joda.time.ReadableInterval readableInterval58 = null;
        boolean boolean59 = readableInterval57.contains(readableInterval58);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = readableInterval57.toPeriod(periodType60);
        org.joda.time.DateTime dateTime62 = readableInterval57.getEnd();
        boolean boolean63 = partial36.equals((java.lang.Object) readableInterval57);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = partial36.getFormatter();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(readableInterval57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        org.joda.time.ReadablePartial readablePartial23 = null;
        java.util.Locale locale25 = null;
        java.lang.String str26 = dividedDateTimeField11.getAsShortText(readablePartial23, 29227899, locale25);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField28 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str30 = dateTimeFieldType29.getName();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.Chronology chronology34 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval32);
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        org.joda.time.Partial partial36 = new org.joda.time.Partial(dateTimeFieldType29, (int) (short) 0, chronology34);
        org.joda.time.ReadableInterval readableInterval37 = null;
        org.joda.time.ReadableInterval readableInterval38 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval37);
        org.joda.time.Chronology chronology39 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval37);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology39.millis();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField43 = chronology39.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial44 = null;
        int[] intArray51 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int52 = dateTimeField43.getMaximumValue(readablePartial44, intArray51);
        int int53 = dividedDateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) partial36, intArray51);
        boolean boolean55 = partial36.equals((java.lang.Object) "29227899");
        java.lang.Object obj56 = null;
        boolean boolean57 = partial36.equals(obj56);
        org.joda.time.Chronology chronology58 = partial36.getChronology();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = partial36.getFieldTypes();
        java.lang.String str60 = partial36.toString();
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "29227899" + "'", str26, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hourOfDay" + "'", str30, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(readableInterval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "00" + "'", str60, "00");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField5 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.ReadableInterval readableInterval10 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval9);
        org.joda.time.Chronology chronology11 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval9);
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.Partial partial13 = new org.joda.time.Partial(dateTimeFieldType6, (int) (short) 0, chronology11);
        org.joda.time.ReadableInterval readableInterval15 = null;
        org.joda.time.ReadableInterval readableInterval16 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval15);
        org.joda.time.Chronology chronology17 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval15);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.DurationField durationField20 = chronology17.centuries();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        org.joda.time.Chronology chronology23 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval21);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology23.millis();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.dayOfWeek();
        org.joda.time.ReadableInterval readableInterval27 = null;
        org.joda.time.ReadableInterval readableInterval28 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval27);
        org.joda.time.Chronology chronology29 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval27);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.minuteOfDay();
        org.joda.time.ReadableInterval readableInterval32 = null;
        org.joda.time.ReadableInterval readableInterval33 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval32);
        org.joda.time.ReadableInterval readableInterval34 = null;
        boolean boolean35 = readableInterval33.contains(readableInterval34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = readableInterval33.toPeriod(periodType36);
        int[] intArray39 = chronology29.get((org.joda.time.ReadablePeriod) period37, (-210866846400000L));
        int[] intArray42 = chronology23.get((org.joda.time.ReadablePeriod) period37, 2173795348453L, (long) 1439);
        int[] intArray45 = chronology17.get((org.joda.time.ReadablePeriod) period37, (-210861660779418L), 1711989798988L);
        int[] intArray47 = offsetDateTimeField5.add((org.joda.time.ReadablePartial) partial13, 11, intArray45, 0);
        long long49 = offsetDateTimeField5.roundHalfCeiling(0L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hourOfDay" + "'", str7, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(readableInterval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(readableInterval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(readableInterval28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(readableInterval33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(intArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[0, 0, -348655, -3, -12, 0, 0, 0]");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-68, -10, -2, -4, -16, -2, -27, -14]");
        org.junit.Assert.assertNotNull(intArray45);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[6736, 2, 1, 3, 4, 16, 18, 406]");
        org.junit.Assert.assertNotNull(intArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[6736, 2, 1, 3, 4, 16, 18, 406]");
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 946684800000L + "'", long49 == 946684800000L);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        org.joda.time.Chronology chronology2 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval0);
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.millis();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology6.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField11 = new org.joda.time.field.DividedDateTimeField(dateTimeField8, dateTimeFieldType9, 10);
        long long14 = dividedDateTimeField11.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField21 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType15, durationField20);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField22 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, dateTimeFieldType15);
        long long24 = remainderDateTimeField22.roundHalfFloor((long) 100);
        long long26 = remainderDateTimeField22.roundFloor((long) (short) 1);
        org.joda.time.DurationField durationField27 = remainderDateTimeField22.getRangeDurationField();
        java.util.Locale locale29 = null;
        java.lang.String str30 = remainderDateTimeField22.getAsShortText((long) (short) 10, locale29);
        org.joda.time.ReadablePartial readablePartial31 = null;
        int int32 = remainderDateTimeField22.getMaximumValue(readablePartial31);
        org.junit.Assert.assertNotNull(readableInterval1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-30610224000000L) + "'", long14 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(readableInterval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = unsupportedDurationField1.getMillis(0L, (long) (-28800000));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: minutes field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(unsupportedDurationField1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.joda.time.ReadableInterval readableInterval0 = null;
        org.joda.time.ReadableInterval readableInterval1 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval0);
        long long2 = readableInterval1.getStartMillis();
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        long long5 = readableInterval4.getEndMillis();
        boolean boolean6 = readableInterval1.overlaps(readableInterval4);
        org.joda.time.ReadableInterval readableInterval7 = null;
        org.joda.time.ReadableInterval readableInterval8 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval7);
        long long9 = readableInterval8.getStartMillis();
        org.joda.time.ReadableInterval readableInterval10 = null;
        org.joda.time.ReadableInterval readableInterval11 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval10);
        org.joda.time.ReadableInterval readableInterval12 = null;
        boolean boolean13 = readableInterval11.contains(readableInterval12);
        org.joda.time.Duration duration14 = readableInterval11.toDuration();
        org.joda.time.DateTime dateTime15 = readableInterval11.getEnd();
        boolean boolean16 = readableInterval8.contains((org.joda.time.ReadableInstant) dateTime15);
        boolean boolean17 = readableInterval4.isBefore(readableInterval8);
        org.joda.time.ReadableInterval readableInterval18 = null;
        org.joda.time.ReadableInterval readableInterval19 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval18);
        long long20 = readableInterval19.getStartMillis();
        org.joda.time.ReadableInterval readableInterval21 = null;
        org.joda.time.ReadableInterval readableInterval22 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval21);
        long long23 = readableInterval22.getEndMillis();
        boolean boolean24 = readableInterval19.overlaps(readableInterval22);
        org.joda.time.ReadableInterval readableInterval25 = null;
        org.joda.time.ReadableInterval readableInterval26 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval25);
        org.joda.time.Chronology chronology27 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval25);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.DurationField durationField30 = chronology27.centuries();
        org.joda.time.Chronology chronology31 = chronology27.withUTC();
        org.joda.time.DurationField durationField32 = chronology31.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField36 = new org.joda.time.field.DividedDateTimeField(dateTimeField33, dateTimeFieldType34, 10);
        long long39 = dividedDateTimeField36.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval41 = null;
        org.joda.time.ReadableInterval readableInterval42 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval41);
        org.joda.time.Chronology chronology43 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval41);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField45 = chronology43.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField46 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType40, durationField45);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField47 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField36, dateTimeFieldType40);
        org.joda.time.ReadablePartial readablePartial48 = null;
        java.util.Locale locale50 = null;
        java.lang.String str51 = dividedDateTimeField36.getAsShortText(readablePartial48, 29227899, locale50);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField53 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField36, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str55 = dateTimeFieldType54.getName();
        org.joda.time.ReadableInterval readableInterval57 = null;
        org.joda.time.ReadableInterval readableInterval58 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval57);
        org.joda.time.Chronology chronology59 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval57);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.Partial partial61 = new org.joda.time.Partial(dateTimeFieldType54, (int) (short) 0, chronology59);
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.Chronology chronology64 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval62);
        org.joda.time.DateTimeField dateTimeField65 = chronology64.yearOfCentury();
        org.joda.time.DurationField durationField66 = chronology64.millis();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField68 = chronology64.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial69 = null;
        int[] intArray76 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int77 = dateTimeField68.getMaximumValue(readablePartial69, intArray76);
        int int78 = dividedDateTimeField36.getMinimumValue((org.joda.time.ReadablePartial) partial61, intArray76);
        boolean boolean80 = partial61.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval81 = null;
        org.joda.time.ReadableInterval readableInterval82 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval81);
        org.joda.time.ReadableInterval readableInterval83 = null;
        boolean boolean84 = readableInterval82.contains(readableInterval83);
        org.joda.time.PeriodType periodType85 = null;
        org.joda.time.Period period86 = readableInterval82.toPeriod(periodType85);
        org.joda.time.DateTime dateTime87 = readableInterval82.getEnd();
        boolean boolean88 = partial61.equals((java.lang.Object) readableInterval82);
        org.joda.time.PeriodType periodType89 = null;
        org.joda.time.PeriodType periodType90 = org.joda.time.DateTimeUtils.getPeriodType(periodType89);
        org.joda.time.PeriodType periodType91 = org.joda.time.DateTimeUtils.getPeriodType(periodType89);
        org.joda.time.Period period92 = readableInterval82.toPeriod(periodType91);
        org.joda.time.PeriodType periodType93 = org.joda.time.DateTimeUtils.getPeriodType(periodType91);
        org.joda.time.Period period94 = readableInterval22.toPeriod(periodType91);
        org.joda.time.Period period95 = readableInterval8.toPeriod(periodType91);
        org.junit.Assert.assertNotNull(readableInterval1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(readableInterval4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(readableInterval8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(readableInterval11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(readableInterval19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(readableInterval22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(readableInterval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-30610224000000L) + "'", long39 == (-30610224000000L));
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(readableInterval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(unsupportedDateTimeField46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "29227899" + "'", str51, "29227899");
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hourOfDay" + "'", str55, "hourOfDay");
        org.junit.Assert.assertNotNull(readableInterval58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(readableInterval63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTimeField65);
        org.junit.Assert.assertNotNull(durationField66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[35, -1, 0, 1, 1, 1]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 24 + "'", int77 == 24);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(readableInterval82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(dateTime87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(periodType90);
        org.junit.Assert.assertNotNull(periodType91);
        org.junit.Assert.assertNotNull(period92);
        org.junit.Assert.assertNotNull(periodType93);
        org.junit.Assert.assertNotNull(period94);
        org.junit.Assert.assertNotNull(period95);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0, dateTimeFieldType1 };
        org.joda.time.ReadableInterval readableInterval3 = null;
        org.joda.time.ReadableInterval readableInterval4 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval3);
        org.joda.time.Chronology chronology5 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval3);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray14 = new int[] { 53460006, ' ', (short) 100, 28533103, 53460006, 10 };
        int int15 = dateTimeField6.getMinimumValue(readablePartial7, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Partial partial16 = new org.joda.time.Partial(dateTimeFieldTypeArray2, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Values array must be the same length as the types array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertNotNull(readableInterval4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[53460006, 32, 100, 28533103, 53460006, 10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }
}
