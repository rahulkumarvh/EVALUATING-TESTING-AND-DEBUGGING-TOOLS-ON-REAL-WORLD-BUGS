package org.joda.time.field;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField18 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField18, and durationField5", !(durationField5.compareTo(unsupportedDurationField18) > 0 && unsupportedDurationField18.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.joda.time.DurationField durationField29 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField29, and durationField4", !(durationField4.compareTo(durationField29) > 0 && durationField29.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        int int21 = scaledDurationField17.getDifference((long) (byte) -1, (long) (short) 0);
        org.joda.time.DurationFieldType durationFieldType22 = scaledDurationField17.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField23 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField23, and durationField5", !(durationField5.compareTo(unsupportedDurationField23) > 0 && unsupportedDurationField23.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        long long17 = dividedDateTimeField11.getDifferenceAsLong(1232672122800032L, 1712048253553L);
        org.joda.time.DurationField durationField18 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField18, and durationField4", !(durationField4.compareTo(durationField18) > 0 && durationField18.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField16, durationField17, and durationField16", !(durationField16.compareTo(durationField17) > 0 && durationField17.compareTo(durationField16) > 0) || durationField16.compareTo(durationField16) > 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.joda.time.DurationField durationField14 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField14, and durationField4", !(durationField4.compareTo(durationField14) > 0 && durationField14.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval17 = null;
        org.joda.time.ReadableInterval readableInterval18 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval17);
        org.joda.time.Chronology chronology19 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval17);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.yearOfCentury();
        boolean boolean21 = durationFieldType16.isSupported(chronology19);
        org.joda.time.DurationField durationField22 = chronology19.eras();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField24 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField11, durationField22, dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField22, and durationField4", !(durationField4.compareTo(durationField22) > 0 && durationField22.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        int int17 = dividedDateTimeField11.getDifference(1712048253526L, 1712048254944L);
        long long20 = dividedDateTimeField11.add((-210742430400000L), (int) 'a');
        org.joda.time.DurationField durationField21 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField21, and durationField4", !(durationField4.compareTo(durationField21) > 0 && durationField21.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.joda.time.DurationField durationField12 = dividedDateTimeField11.iRangeDurationField;
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField12, and durationField4", !(durationField4.compareTo(durationField12) > 0 && durationField12.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        int int29 = remainderDateTimeField22.get(2173795348453L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone34 = new org.joda.time.tz.FixedDateTimeZone("100", "ISOChronology[America/Los_Angeles]", 0, 0);
        int int36 = fixedDateTimeZone34.getStandardOffset((long) 1);
        long long38 = fixedDateTimeZone34.nextTransition((-210742430400000L));
        org.joda.time.chrono.GregorianChronology gregorianChronology39 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone) fixedDateTimeZone34);
        org.joda.time.DateTimeField dateTimeField40 = gregorianChronology39.era();
        org.joda.time.DurationField durationField41 = gregorianChronology39.halfdays();
        org.joda.time.ReadableInterval readableInterval42 = null;
        org.joda.time.ReadableInterval readableInterval43 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval42);
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval42);
        org.joda.time.DateTimeField dateTimeField45 = chronology44.yearOfCentury();
        org.joda.time.DurationField durationField46 = chronology44.millis();
        org.joda.time.DurationField durationField47 = chronology44.centuries();
        org.joda.time.Chronology chronology48 = chronology44.withUTC();
        org.joda.time.DurationField durationField49 = chronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField53 = new org.joda.time.field.DividedDateTimeField(dateTimeField50, dateTimeFieldType51, 10);
        org.joda.time.field.DividedDateTimeField dividedDateTimeField54 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField22, durationField41, dateTimeFieldType51);
        long long56 = remainderDateTimeField22.roundCeiling(970L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField41", (durationField7.compareTo(durationField41) == 0) == durationField7.equals(durationField41));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField4 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField1, durationField4, and durationField1", !(durationField1.compareTo(durationField4) > 0 && durationField4.compareTo(durationField1) > 0) || durationField1.compareTo(durationField1) > 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        long long22 = scaledDurationField17.add((long) (-1), 10);
        org.joda.time.DurationFieldType durationFieldType23 = scaledDurationField17.getType();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField24 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField24, and durationField5", !(durationField5.compareTo(unsupportedDurationField24) > 0 && unsupportedDurationField24.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        long long22 = scaledDurationField17.add((long) (-1), 10);
        org.joda.time.DurationFieldType durationFieldType23 = scaledDurationField17.getType();
        org.joda.time.IllegalFieldValueException illegalFieldValueException25 = new org.joda.time.IllegalFieldValueException(durationFieldType23, "69");
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField26 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField5, unsupportedDurationField26, and durationField5", !(durationField5.compareTo(unsupportedDurationField26) > 0 && unsupportedDurationField26.compareTo(durationField5) > 0) || durationField5.compareTo(durationField5) > 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        int int17 = dividedDateTimeField11.getDifference(1712048253526L, 1712048254944L);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = dividedDateTimeField11.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField20 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField11, dateTimeFieldType19);
        long long22 = zeroIsMaxDateTimeField20.roundHalfFloor((-53459996L));
        org.joda.time.DurationField durationField23 = zeroIsMaxDateTimeField20.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField23, and durationField4", !(durationField4.compareTo(durationField23) > 0 && durationField23.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfDay();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField10 = chronology8.millis();
        org.joda.time.DurationField durationField11 = chronology8.centuries();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DurationField durationField13 = chronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.field.DividedDateTimeField dividedDateTimeField17 = new org.joda.time.field.DividedDateTimeField(dateTimeField14, dateTimeFieldType15, 10);
        long long20 = dividedDateTimeField17.set(0L, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval22 = null;
        org.joda.time.ReadableInterval readableInterval23 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval22);
        org.joda.time.Chronology chronology24 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval22);
        org.joda.time.DateTimeField dateTimeField25 = chronology24.yearOfCentury();
        org.joda.time.DurationField durationField26 = chronology24.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField27 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType21, durationField26);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField28 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField17, dateTimeFieldType21);
        org.joda.time.ReadablePartial readablePartial29 = null;
        java.util.Locale locale31 = null;
        java.lang.String str32 = dividedDateTimeField17.getAsShortText(readablePartial29, 29227899, locale31);
        org.joda.time.field.OffsetDateTimeField offsetDateTimeField34 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField) dividedDateTimeField17, 29227899);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str36 = dateTimeFieldType35.getName();
        org.joda.time.ReadableInterval readableInterval38 = null;
        org.joda.time.ReadableInterval readableInterval39 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval38);
        org.joda.time.Chronology chronology40 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval38);
        org.joda.time.DateTimeField dateTimeField41 = chronology40.yearOfCentury();
        org.joda.time.Partial partial42 = new org.joda.time.Partial(dateTimeFieldType35, (int) (short) 0, chronology40);
        org.joda.time.ReadableInterval readableInterval43 = null;
        org.joda.time.ReadableInterval readableInterval44 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval43);
        org.joda.time.Chronology chronology45 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval43);
        org.joda.time.DateTimeField dateTimeField46 = chronology45.yearOfCentury();
        org.joda.time.DurationField durationField47 = chronology45.millis();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial50 = null;
        int[] intArray57 = new int[] { '#', (-1), 0, (byte) 1, (short) 1, (byte) 1 };
        int int58 = dateTimeField49.getMaximumValue(readablePartial50, intArray57);
        int int59 = dividedDateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) partial42, intArray57);
        boolean boolean61 = partial42.equals((java.lang.Object) "29227899");
        org.joda.time.ReadableInterval readableInterval62 = null;
        org.joda.time.ReadableInterval readableInterval63 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval62);
        org.joda.time.ReadableInterval readableInterval64 = null;
        boolean boolean65 = readableInterval63.contains(readableInterval64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = readableInterval63.toPeriod(periodType66);
        org.joda.time.DateTime dateTime68 = readableInterval63.getEnd();
        boolean boolean69 = partial42.equals((java.lang.Object) readableInterval63);
        int int70 = partial42.size();
        java.util.Locale locale72 = null;
        java.lang.String str73 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) partial42, 11, locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField13", (durationField4.compareTo(durationField13) == 0) == durationField4.equals(durationField13));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        long long27 = scaledDurationField17.getMillis((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval29 = null;
        org.joda.time.ReadableInterval readableInterval30 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval29);
        org.joda.time.Chronology chronology31 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval29);
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.DurationField durationField33 = chronology31.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField34 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType28, durationField33);
        long long37 = durationField33.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval39 = null;
        org.joda.time.ReadableInterval readableInterval40 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval39);
        org.joda.time.Chronology chronology41 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval39);
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        boolean boolean43 = durationFieldType38.isSupported(chronology41);
        org.joda.time.field.ScaledDurationField scaledDurationField45 = new org.joda.time.field.ScaledDurationField(durationField33, durationFieldType38, (int) 'a');
        long long46 = scaledDurationField45.getUnitMillis();
        org.joda.time.DurationFieldType durationFieldType47 = scaledDurationField45.getType();
        org.joda.time.field.PreciseDurationField preciseDurationField49 = new org.joda.time.field.PreciseDurationField(durationFieldType47, 60035L);
        org.joda.time.field.DecoratedDurationField decoratedDurationField50 = new org.joda.time.field.DecoratedDurationField((org.joda.time.DurationField) scaledDurationField17, durationFieldType47);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str52 = dateTimeFieldType51.getName();
        org.joda.time.ReadableInterval readableInterval54 = null;
        org.joda.time.ReadableInterval readableInterval55 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval54);
        org.joda.time.Chronology chronology56 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval54);
        org.joda.time.DateTimeField dateTimeField57 = chronology56.yearOfCentury();
        org.joda.time.Partial partial58 = new org.joda.time.Partial(dateTimeFieldType51, (int) (short) 0, chronology56);
        org.joda.time.Chronology chronology59 = partial58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.era();
        org.joda.time.DurationField durationField61 = durationFieldType47.getField(chronology59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on scaledDurationField17 and decoratedDurationField50", (scaledDurationField17.compareTo(decoratedDurationField50) == 0) == scaledDurationField17.equals(decoratedDurationField50));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        org.joda.time.DateTimeField dateTimeField30 = dividedDateTimeField11.getWrappedField();
        org.joda.time.DurationField durationField31 = dividedDateTimeField11.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField4, durationField31, and durationField4", !(durationField4.compareTo(durationField31) > 0 && durationField31.compareTo(durationField4) > 0) || durationField4.compareTo(durationField4) > 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField1 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType0);
        boolean boolean2 = unsupportedDurationField1.isSupported();
        java.lang.String str3 = unsupportedDurationField1.toString();
        java.lang.String str4 = unsupportedDurationField1.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.ReadableInterval readableInterval6 = null;
        org.joda.time.ReadableInterval readableInterval7 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval6);
        org.joda.time.Chronology chronology8 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval6);
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField10 = chronology8.millis();
        org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField11 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType5, durationField10);
        long long14 = durationField10.getValueAsLong((-210866846400000L), (-31L));
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.ReadableInterval readableInterval16 = null;
        org.joda.time.ReadableInterval readableInterval17 = org.joda.time.DateTimeUtils.getReadableInterval(readableInterval16);
        org.joda.time.Chronology chronology18 = org.joda.time.DateTimeUtils.getIntervalChronology(readableInterval16);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        boolean boolean20 = durationFieldType15.isSupported(chronology18);
        org.joda.time.field.ScaledDurationField scaledDurationField22 = new org.joda.time.field.ScaledDurationField(durationField10, durationFieldType15, (int) 'a');
        org.joda.time.DurationField durationField23 = scaledDurationField22.getWrappedField();
        long long26 = scaledDurationField22.add((-210866846400000L), (long) 53460006);
        long long28 = scaledDurationField22.getMillis(0);
        int int29 = unsupportedDurationField1.compareTo((org.joda.time.DurationField) scaledDurationField22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-transitive on durationField10, unsupportedDurationField1, and durationField10", !(durationField10.compareTo(unsupportedDurationField1) > 0 && unsupportedDurationField1.compareTo(durationField10) > 0) || durationField10.compareTo(durationField10) > 0);
    }
}

