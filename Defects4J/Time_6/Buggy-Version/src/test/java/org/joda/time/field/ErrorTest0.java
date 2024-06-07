package org.joda.time.base;

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
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months30 = org.joda.time.Months.TWELVE;
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) months30);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology32.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withEra(0);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean39 = localDate35.equals((java.lang.Object) periodType38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean41 = localDate35.isSupported(dateTimeFieldType40);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField43 = new org.joda.time.field.RemainderDateTimeField(dateTimeField33, dateTimeFieldType40, (int) (byte) 10);
        long long45 = remainderDateTimeField43.roundHalfCeiling((long) '#');
        boolean boolean47 = remainderDateTimeField43.isLeap((long) (byte) 100);
        org.joda.time.DurationField durationField48 = remainderDateTimeField43.getDurationField();
        int int49 = unsupportedDurationField8.compareTo(durationField48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on unsupportedDurationField8, durationField48, and unsupportedDurationField8", !(unsupportedDurationField8.compareTo(durationField48) == 0) || (Math.signum(unsupportedDurationField8.compareTo(unsupportedDurationField8)) == Math.signum(durationField48.compareTo(unsupportedDurationField8))));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months30 = org.joda.time.Months.TWELVE;
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) months30);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology32.secondOfMinute();
        org.joda.time.DurationField durationField34 = gregorianChronology32.millis();
        org.joda.time.DurationField durationField35 = gregorianChronology32.hours();
        int int36 = unsupportedDurationField8.compareTo(durationField35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on unsupportedDurationField8 and durationField34", Math.signum(unsupportedDurationField8.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(unsupportedDurationField8)));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology3.getZone();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(0);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean11 = localDate7.equals((java.lang.Object) periodType10);
        org.joda.time.LocalDate localDate13 = localDate7.plusWeeks((int) (byte) 100);
        int[] intArray15 = gregorianChronology3.get((org.joda.time.ReadablePartial) localDate7, (long) (short) 0);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology3.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate5 and localDate7", (localDate5.compareTo(localDate7) == 0) == localDate5.equals(localDate7));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean10 = localDate6.equals((java.lang.Object) periodType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean12 = localDate6.isSupported(dateTimeFieldType11);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField14 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, dateTimeFieldType11, (int) (byte) 10);
        long long16 = remainderDateTimeField14.roundHalfCeiling((long) '#');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withEra(0);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean22 = localDate18.equals((java.lang.Object) periodType21);
        java.util.Locale locale23 = null;
        java.lang.String str24 = remainderDateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDate18, locale23);
        long long26 = remainderDateTimeField14.roundCeiling((long) (short) 0);
        long long28 = remainderDateTimeField14.remainder((-17418239999999990L));
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = localDate30.isSupported(dateTimeFieldType33);
        org.joda.time.Interval interval35 = localDate30.toInterval();
        int int36 = localDate30.size();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months38 = org.joda.time.Months.TWELVE;
        boolean boolean39 = dateTimeZone37.equals((java.lang.Object) months38);
        org.joda.time.chrono.GregorianChronology gregorianChronology40 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField41 = gregorianChronology40.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate43.withEra(0);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean47 = localDate43.equals((java.lang.Object) periodType46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean49 = localDate43.isSupported(dateTimeFieldType48);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField51 = new org.joda.time.field.RemainderDateTimeField(dateTimeField41, dateTimeFieldType48, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone52);
        org.joda.time.LocalDate localDate55 = localDate53.withEra(0);
        org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean57 = localDate53.equals((java.lang.Object) periodType56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean59 = localDate53.isSupported(dateTimeFieldType58);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField60 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField51, dateTimeFieldType58);
        long long62 = zeroIsMaxDateTimeField60.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months64 = org.joda.time.Months.TWELVE;
        boolean boolean65 = dateTimeZone63.equals((java.lang.Object) months64);
        org.joda.time.chrono.GregorianChronology gregorianChronology66 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone63);
        org.joda.time.DateTimeField dateTimeField67 = gregorianChronology66.hourOfHalfday();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology66);
        int[] intArray76 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray78 = zeroIsMaxDateTimeField60.addWrapField((org.joda.time.ReadablePartial) localDate68, 2, intArray76, (int) ' ');
        int int79 = remainderDateTimeField14.getMaximumValue((org.joda.time.ReadablePartial) localDate30, intArray78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate6 and localDate68", (localDate6.compareTo(localDate68) == 0) == localDate6.equals(localDate68));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        boolean boolean29 = unsupportedDurationField27.isSupported();
        long long30 = unsupportedDurationField27.getUnitMillis();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months32 = org.joda.time.Months.TWELVE;
        boolean boolean33 = dateTimeZone31.equals((java.lang.Object) months32);
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology34.yearOfEra();
        org.joda.time.DurationField durationField36 = gregorianChronology34.minutes();
        int int37 = unsupportedDurationField27.compareTo(durationField36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on unsupportedDurationField27, durationField36, and unsupportedDurationField27", !(unsupportedDurationField27.compareTo(durationField36) == 0) || (Math.signum(unsupportedDurationField27.compareTo(unsupportedDurationField27)) == Math.signum(durationField36.compareTo(unsupportedDurationField27))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.year();
        org.joda.time.DurationField durationField6 = gregorianChronology3.eras();
        org.joda.time.DurationField durationField7 = gregorianChronology3.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology3.getZone();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(0);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean11 = localDate7.equals((java.lang.Object) periodType10);
        org.joda.time.LocalDate localDate13 = localDate7.plusWeeks((int) (byte) 100);
        int[] intArray15 = gregorianChronology3.get((org.joda.time.ReadablePartial) localDate7, (long) (short) 0);
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology3.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate5 and localDate7", (localDate5.compareTo(localDate7) == 0) == localDate5.equals(localDate7));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay monthDay3 = monthDay1.plusMonths(24);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months5 = org.joda.time.Months.TWELVE;
        boolean boolean6 = dateTimeZone4.equals((java.lang.Object) months5);
        org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology7.year();
        org.joda.time.DurationField durationField10 = gregorianChronology7.eras();
        java.lang.String str11 = gregorianChronology7.toString();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology7.millisOfSecond();
        org.joda.time.MonthDay monthDay13 = monthDay3.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology7);
        org.joda.time.MonthDay monthDay14 = org.joda.time.MonthDay.now((org.joda.time.Chronology) gregorianChronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on monthDay1 and monthDay13", (monthDay1.compareTo(monthDay13) == 0) == monthDay1.equals(monthDay13));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.year();
        org.joda.time.DurationField durationField6 = gregorianChronology3.eras();
        java.lang.String str7 = gregorianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology3.secondOfDay();
        org.joda.time.DurationField durationField10 = gregorianChronology3.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField10, and durationField6", !(durationField6.compareTo(durationField10) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField10.compareTo(durationField6))));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.LocalDate localDate7 = localDate5.withYear(0);
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = localDate11.isSupported(dateTimeFieldType14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDate11.isSupported(dateTimeFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate11.weekOfWeekyear();
        org.joda.time.Months months19 = org.joda.time.Months.monthsBetween((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType24);
        int int26 = localDate21.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months28 = org.joda.time.Months.TWELVE;
        boolean boolean29 = dateTimeZone27.equals((java.lang.Object) months28);
        org.joda.time.chrono.GregorianChronology gregorianChronology30 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField31 = gregorianChronology30.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.withEra(0);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean37 = localDate33.equals((java.lang.Object) periodType36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean39 = localDate33.isSupported(dateTimeFieldType38);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField41 = new org.joda.time.field.RemainderDateTimeField(dateTimeField31, dateTimeFieldType38, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate43.withEra(0);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean47 = localDate43.equals((java.lang.Object) periodType46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean49 = localDate43.isSupported(dateTimeFieldType48);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField50 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField41, dateTimeFieldType48);
        long long52 = remainderDateTimeField41.roundFloor(0L);
        long long55 = remainderDateTimeField41.addWrapField((long) 100, 9);
        java.util.Locale locale56 = null;
        int int57 = remainderDateTimeField41.getMaximumTextLength(locale56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = remainderDateTimeField41.getType();
        boolean boolean59 = localDate21.isSupported(dateTimeFieldType58);
        org.joda.time.LocalDate.Property property60 = localDate7.property(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate5 and localDate11", (localDate5.compareTo(localDate11) == 0) == localDate5.equals(localDate11));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.LocalDate localDate7 = localDate5.withYear(0);
        org.joda.time.LocalDate localDate9 = localDate7.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.withEra(0);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean15 = localDate11.equals((java.lang.Object) periodType14);
        org.joda.time.LocalDate localDate17 = localDate11.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.withEra(0);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean23 = localDate19.equals((java.lang.Object) periodType22);
        org.joda.time.LocalDate localDate25 = localDate19.plusWeeks((int) (byte) 100);
        boolean boolean26 = localDate11.isAfter((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate28 = localDate25.plusDays(20);
        org.joda.time.LocalDate.Property property29 = localDate28.monthOfYear();
        org.joda.time.Days days30 = org.joda.time.Days.daysBetween((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate5 and localDate11", (localDate5.compareTo(localDate11) == 0) == localDate5.equals(localDate11));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.year();
        org.joda.time.DurationField durationField6 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.hourOfDay();
        org.joda.time.DurationField durationField8 = gregorianChronology3.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField8, and durationField6", !(durationField6.compareTo(durationField8) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField8.compareTo(durationField6))));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean10 = localDate6.equals((java.lang.Object) periodType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean12 = localDate6.isSupported(dateTimeFieldType11);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField14 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, dateTimeFieldType11, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean20 = localDate16.equals((java.lang.Object) periodType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean22 = localDate16.isSupported(dateTimeFieldType21);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField23 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField14, dateTimeFieldType21);
        long long25 = zeroIsMaxDateTimeField23.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months27 = org.joda.time.Months.TWELVE;
        boolean boolean28 = dateTimeZone26.equals((java.lang.Object) months27);
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.hourOfHalfday();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology29);
        int[] intArray39 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray41 = zeroIsMaxDateTimeField23.addWrapField((org.joda.time.ReadablePartial) localDate31, 2, intArray39, (int) ' ');
        org.joda.time.DurationField durationField42 = zeroIsMaxDateTimeField23.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate6 and localDate31", (localDate6.compareTo(localDate31) == 0) == localDate6.equals(localDate31));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        boolean boolean29 = unsupportedDurationField27.isPrecise();
        java.lang.String str30 = unsupportedDurationField27.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months32 = org.joda.time.Months.TWELVE;
        boolean boolean33 = dateTimeZone31.equals((java.lang.Object) months32);
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology34.hourOfHalfday();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology34);
        org.joda.time.DurationField durationField37 = gregorianChronology34.seconds();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months39 = org.joda.time.Months.TWELVE;
        boolean boolean40 = dateTimeZone38.equals((java.lang.Object) months39);
        org.joda.time.chrono.GregorianChronology gregorianChronology41 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone42 = gregorianChronology41.getZone();
        org.joda.time.Chronology chronology43 = gregorianChronology34.withZone(dateTimeZone42);
        boolean boolean44 = unsupportedDurationField27.equals((java.lang.Object) dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on unsupportedDurationField27 and durationField37", Math.signum(unsupportedDurationField27.compareTo(durationField37)) == -Math.signum(durationField37.compareTo(unsupportedDurationField27)));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = gregorianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.year();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.dayOfWeek();
        org.joda.time.DurationField durationField9 = gregorianChronology3.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField9, and durationField6", !(durationField6.compareTo(durationField9) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField9.compareTo(durationField6))));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDate2.isSupported(dateTimeFieldType5);
        org.joda.time.Interval interval7 = localDate2.toInterval();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.dateParser();
        boolean boolean9 = localDate2.equals((java.lang.Object) dateTimeFormatter8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) months11);
        int int14 = dateTimeZone10.getOffsetFromLocal(0L);
        org.joda.time.DateMidnight dateMidnight15 = localDate2.toDateMidnight(dateTimeZone10);
        java.lang.String str16 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate2);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months18 = org.joda.time.Months.TWELVE;
        boolean boolean19 = dateTimeZone17.equals((java.lang.Object) months18);
        org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField21 = gregorianChronology20.hourOfHalfday();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology20);
        org.joda.time.LocalDate localDate24 = localDate22.withYear(0);
        java.lang.String str25 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate2 and localDate22", (localDate2.compareTo(localDate22) == 0) == localDate2.equals(localDate22));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean10 = localDate6.equals((java.lang.Object) periodType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean12 = localDate6.isSupported(dateTimeFieldType11);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField14 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, dateTimeFieldType11, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean20 = localDate16.equals((java.lang.Object) periodType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean22 = localDate16.isSupported(dateTimeFieldType21);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField23 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField14, dateTimeFieldType21);
        int int24 = zeroIsMaxDateTimeField23.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        boolean boolean30 = localDate26.isSupported(dateTimeFieldType29);
        org.joda.time.Interval interval31 = localDate26.toInterval();
        int int32 = localDate26.size();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months34 = org.joda.time.Months.TWELVE;
        boolean boolean35 = dateTimeZone33.equals((java.lang.Object) months34);
        org.joda.time.chrono.GregorianChronology gregorianChronology36 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = gregorianChronology36.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(0);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean43 = localDate39.equals((java.lang.Object) periodType42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean45 = localDate39.isSupported(dateTimeFieldType44);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField47 = new org.joda.time.field.RemainderDateTimeField(dateTimeField37, dateTimeFieldType44, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone48);
        org.joda.time.LocalDate localDate51 = localDate49.withEra(0);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean53 = localDate49.equals((java.lang.Object) periodType52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean55 = localDate49.isSupported(dateTimeFieldType54);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField56 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField47, dateTimeFieldType54);
        long long58 = zeroIsMaxDateTimeField56.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months60 = org.joda.time.Months.TWELVE;
        boolean boolean61 = dateTimeZone59.equals((java.lang.Object) months60);
        org.joda.time.chrono.GregorianChronology gregorianChronology62 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField63 = gregorianChronology62.hourOfHalfday();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology62);
        int[] intArray72 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray74 = zeroIsMaxDateTimeField56.addWrapField((org.joda.time.ReadablePartial) localDate64, 2, intArray72, (int) ' ');
        int int75 = zeroIsMaxDateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDate26, intArray74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate6 and localDate64", (localDate6.compareTo(localDate64) == 0) == localDate6.equals(localDate64));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DurationField durationField6 = gregorianChronology3.eras();
        org.joda.time.DurationField durationField7 = gregorianChronology3.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.LocalDate localDate3 = localDate1.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate1.toDateTimeAtCurrentTime(dateTimeZone6);
        int int9 = localDate1.getValue(0);
        org.joda.time.LocalTime localTime10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months12 = org.joda.time.Months.TWELVE;
        boolean boolean13 = dateTimeZone11.equals((java.lang.Object) months12);
        org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = gregorianChronology14.getZone();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months18 = org.joda.time.Months.TWELVE;
        boolean boolean19 = dateTimeZone17.equals((java.lang.Object) months18);
        int int21 = dateTimeZone17.getOffsetFromLocal(0L);
        int int23 = dateTimeZone17.getOffsetFromLocal((-1L));
        org.joda.time.chrono.ZonedChronology zonedChronology24 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) gregorianChronology14, dateTimeZone17);
        org.joda.time.DateTime dateTime25 = localDate1.toDateTime(localTime10, dateTimeZone17);
        org.joda.time.Chronology chronology26 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate1 and localDate16", (localDate1.compareTo(localDate16) == 0) == localDate1.equals(localDate16));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean10 = localDate6.equals((java.lang.Object) periodType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean12 = localDate6.isSupported(dateTimeFieldType11);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField14 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, dateTimeFieldType11, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean20 = localDate16.equals((java.lang.Object) periodType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean22 = localDate16.isSupported(dateTimeFieldType21);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField23 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField14, dateTimeFieldType21);
        boolean boolean24 = zeroIsMaxDateTimeField23.isSupported();
        org.joda.time.DateTimeField dateTimeField25 = zeroIsMaxDateTimeField23.getWrappedField();
        int int27 = zeroIsMaxDateTimeField23.getMaximumValue((long) (short) -1);
        int int29 = zeroIsMaxDateTimeField23.getMaximumValue(9972000000L);
        org.joda.time.DurationField durationField30 = zeroIsMaxDateTimeField23.getRangeDurationField();
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months33 = org.joda.time.Months.TWELVE;
        boolean boolean34 = dateTimeZone32.equals((java.lang.Object) months33);
        org.joda.time.chrono.GregorianChronology gregorianChronology35 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone36 = gregorianChronology35.getZone();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(0);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean43 = localDate39.equals((java.lang.Object) periodType42);
        org.joda.time.LocalDate localDate45 = localDate39.plusWeeks((int) (byte) 100);
        int[] intArray47 = gregorianChronology35.get((org.joda.time.ReadablePartial) localDate39, (long) (short) 0);
        int int48 = zeroIsMaxDateTimeField23.getMaximumValue(readablePartial31, intArray47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate6 and localDate37", (localDate6.compareTo(localDate37) == 0) == localDate6.equals(localDate37));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        boolean boolean29 = unsupportedDurationField27.isSupported();
        long long30 = unsupportedDurationField27.getUnitMillis();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months32 = org.joda.time.Months.TWELVE;
        boolean boolean33 = dateTimeZone31.equals((java.lang.Object) months32);
        org.joda.time.chrono.GregorianChronology gregorianChronology34 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone31);
        org.joda.time.DurationField durationField35 = gregorianChronology34.days();
        int int36 = unsupportedDurationField27.compareTo(durationField35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on unsupportedDurationField27, durationField35, and unsupportedDurationField27", !(unsupportedDurationField27.compareTo(durationField35) == 0) || (Math.signum(unsupportedDurationField27.compareTo(unsupportedDurationField27)) == Math.signum(durationField35.compareTo(unsupportedDurationField27))));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean10 = localDate6.equals((java.lang.Object) periodType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean12 = localDate6.isSupported(dateTimeFieldType11);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField14 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, dateTimeFieldType11, (int) (byte) 10);
        long long16 = remainderDateTimeField14.roundHalfCeiling((long) '#');
        boolean boolean18 = remainderDateTimeField14.isLeap((long) (byte) 100);
        org.joda.time.DurationField durationField19 = remainderDateTimeField14.getDurationField();
        long long21 = remainderDateTimeField14.roundHalfCeiling(28800000L);
        long long23 = remainderDateTimeField14.remainder(0L);
        org.joda.time.DurationField durationField24 = remainderDateTimeField14.getRangeDurationField();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime27 = localDate26.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        boolean boolean33 = localDate29.isSupported(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate29.toDateTimeAtCurrentTime(dateTimeZone34);
        boolean boolean36 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        boolean boolean38 = dateTime35.isSupported(dateTimeFieldType37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(dateTimeZone39);
        org.joda.time.LocalDate localDate42 = localDate40.withEra(0);
        org.joda.time.DateMidnight dateMidnight43 = localDate40.toDateMidnight();
        org.joda.time.Chronology chronology44 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.millis();
        int int46 = org.joda.time.base.BaseSingleFieldPeriod.between((org.joda.time.ReadableInstant) dateTime35, (org.joda.time.ReadableInstant) dateMidnight43, durationFieldType45);
        java.lang.String str47 = durationFieldType45.toString();
        org.joda.time.field.DecoratedDurationField decoratedDurationField48 = new org.joda.time.field.DecoratedDurationField(durationField24, durationFieldType45);
        int int50 = decoratedDurationField48.getValue((long) (byte) -1);
        long long52 = decoratedDurationField48.getMillis(23);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months54 = org.joda.time.Months.TWELVE;
        boolean boolean55 = dateTimeZone53.equals((java.lang.Object) months54);
        org.joda.time.chrono.GregorianChronology gregorianChronology56 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone57 = gregorianChronology56.getZone();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology56);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months60 = org.joda.time.Months.TWELVE;
        boolean boolean61 = dateTimeZone59.equals((java.lang.Object) months60);
        int int63 = dateTimeZone59.getOffsetFromLocal(0L);
        int int65 = dateTimeZone59.getOffsetFromLocal((-1L));
        org.joda.time.chrono.ZonedChronology zonedChronology66 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) gregorianChronology56, dateTimeZone59);
        org.joda.time.DurationField durationField67 = gregorianChronology56.halfdays();
        int int68 = decoratedDurationField48.compareTo(durationField67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate6 and localDate58", (localDate6.compareTo(localDate58) == 0) == localDate6.equals(localDate58));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.MonthDay.Property property2 = monthDay1.dayOfMonth();
        org.joda.time.MonthDay.Property property3 = monthDay1.monthOfYear();
        org.joda.time.MonthDay monthDay5 = monthDay1.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = monthDay5.getFieldType((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months9 = org.joda.time.Months.TWELVE;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) months9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        long long15 = gregorianChronology11.add((long) 20, (long) (short) 100, (int) (short) 10);
        org.joda.time.MonthDay monthDay16 = org.joda.time.MonthDay.now((org.joda.time.Chronology) gregorianChronology11);
        org.joda.time.DurationField durationField17 = gregorianChronology11.months();
        java.lang.String str18 = gregorianChronology11.toString();
        org.joda.time.DurationField durationField19 = gregorianChronology11.minutes();
        org.joda.time.DateTimeField dateTimeField20 = gregorianChronology11.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType7.getField((org.joda.time.Chronology) gregorianChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on monthDay1 and monthDay16", (monthDay1.compareTo(monthDay16) == 0) == monthDay1.equals(monthDay16));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
        org.joda.time.Period period1 = months0.toPeriod();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        org.joda.time.Months months3 = org.joda.time.Months.THREE;
        org.joda.time.Months months4 = months2.plus(months3);
        org.joda.time.Months months5 = months0.plus(months3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        boolean boolean7 = months5.isSupported(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField8 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.field.UnsupportedDurationField unsupportedDurationField9 = org.joda.time.field.UnsupportedDurationField.getInstance(durationFieldType6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) months11);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.year();
        java.lang.String str16 = gregorianChronology13.toString();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology13.minuteOfDay();
        org.joda.time.DurationField durationField18 = gregorianChronology13.months();
        int int19 = unsupportedDurationField9.compareTo(durationField18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on unsupportedDurationField9, durationField18, and unsupportedDurationField9", !(unsupportedDurationField9.compareTo(durationField18) == 0) || (Math.signum(unsupportedDurationField9.compareTo(unsupportedDurationField9)) == Math.signum(durationField18.compareTo(unsupportedDurationField9))));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology3.getZone();
        int int5 = gregorianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField7 = gregorianChronology3.years();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.withEra(0);
        int int13 = localDate12.getCenturyOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.joda.time.format.ISODateTimeFormat.basicTTime();
        java.lang.String str15 = localDate12.toString(dateTimeFormatter14);
        org.joda.time.LocalDate localDate17 = localDate12.withYearOfEra(23);
        org.joda.time.LocalDate.Property property18 = localDate12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months20 = org.joda.time.Months.TWELVE;
        boolean boolean21 = dateTimeZone19.equals((java.lang.Object) months20);
        org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField23 = gregorianChronology22.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.withEra(0);
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean29 = localDate25.equals((java.lang.Object) periodType28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean31 = localDate25.isSupported(dateTimeFieldType30);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField33 = new org.joda.time.field.RemainderDateTimeField(dateTimeField23, dateTimeFieldType30, (int) (byte) 10);
        boolean boolean34 = localDate12.isSupported(dateTimeFieldType30);
        org.joda.time.Chronology chronology35 = localDate12.getChronology();
        org.joda.time.LocalDate localDate37 = localDate12.plusMonths(19815);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months39 = org.joda.time.Months.TWELVE;
        boolean boolean40 = dateTimeZone38.equals((java.lang.Object) months39);
        org.joda.time.chrono.GregorianChronology gregorianChronology41 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology41.hourOfHalfday();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology41);
        int int44 = localDate37.compareTo((org.joda.time.ReadablePartial) localDate43);
        int int45 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDate37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate10 and localDate43", (localDate10.compareTo(localDate43) == 0) == localDate10.equals(localDate43));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = gregorianChronology3.minutes();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology9.yearOfEra();
        org.joda.time.DurationField durationField11 = gregorianChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology9.yearOfEra();
        org.joda.time.DurationField durationField14 = dateTimeField13.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months16 = org.joda.time.Months.TWELVE;
        boolean boolean17 = dateTimeZone15.equals((java.lang.Object) months16);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean25 = localDate21.equals((java.lang.Object) periodType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean27 = localDate21.isSupported(dateTimeFieldType26);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField29 = new org.joda.time.field.RemainderDateTimeField(dateTimeField19, dateTimeFieldType26, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.withEra(0);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean35 = localDate31.equals((java.lang.Object) periodType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean37 = localDate31.isSupported(dateTimeFieldType36);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField38 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField29, dateTimeFieldType36);
        long long40 = zeroIsMaxDateTimeField38.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months42 = org.joda.time.Months.TWELVE;
        boolean boolean43 = dateTimeZone41.equals((java.lang.Object) months42);
        org.joda.time.chrono.GregorianChronology gregorianChronology44 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology44.hourOfHalfday();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology44);
        int[] intArray54 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray56 = zeroIsMaxDateTimeField38.addWrapField((org.joda.time.ReadablePartial) localDate46, 2, intArray54, (int) ' ');
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDate46, locale57);
        int[] intArray60 = gregorianChronology3.get((org.joda.time.ReadablePartial) localDate46, (long) (short) 0);
        org.joda.time.Chronology chronology61 = org.joda.time.DateTimeUtils.getChronology((org.joda.time.Chronology) gregorianChronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate21 and localDate46", (localDate21.compareTo(localDate46) == 0) == localDate21.equals(localDate46));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean10 = localDate6.equals((java.lang.Object) periodType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean12 = localDate6.isSupported(dateTimeFieldType11);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField14 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, dateTimeFieldType11, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean20 = localDate16.equals((java.lang.Object) periodType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean22 = localDate16.isSupported(dateTimeFieldType21);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField23 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField14, dateTimeFieldType21);
        long long25 = zeroIsMaxDateTimeField23.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months27 = org.joda.time.Months.TWELVE;
        boolean boolean28 = dateTimeZone26.equals((java.lang.Object) months27);
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.hourOfHalfday();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology29);
        int[] intArray39 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray41 = zeroIsMaxDateTimeField23.addWrapField((org.joda.time.ReadablePartial) localDate31, 2, intArray39, (int) ' ');
        org.joda.time.LocalDate localDate43 = localDate31.plusDays((-25200000));
        org.joda.time.LocalDate localDate45 = localDate43.plusMonths(2002);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate6 and localDate31", (localDate6.compareTo(localDate31) == 0) == localDate6.equals(localDate31));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = gregorianChronology3.minutes();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology9.yearOfEra();
        org.joda.time.DurationField durationField11 = gregorianChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology9.yearOfEra();
        org.joda.time.DurationField durationField14 = dateTimeField13.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months16 = org.joda.time.Months.TWELVE;
        boolean boolean17 = dateTimeZone15.equals((java.lang.Object) months16);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean25 = localDate21.equals((java.lang.Object) periodType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean27 = localDate21.isSupported(dateTimeFieldType26);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField29 = new org.joda.time.field.RemainderDateTimeField(dateTimeField19, dateTimeFieldType26, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.withEra(0);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean35 = localDate31.equals((java.lang.Object) periodType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean37 = localDate31.isSupported(dateTimeFieldType36);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField38 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField29, dateTimeFieldType36);
        long long40 = zeroIsMaxDateTimeField38.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months42 = org.joda.time.Months.TWELVE;
        boolean boolean43 = dateTimeZone41.equals((java.lang.Object) months42);
        org.joda.time.chrono.GregorianChronology gregorianChronology44 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology44.hourOfHalfday();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology44);
        int[] intArray54 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray56 = zeroIsMaxDateTimeField38.addWrapField((org.joda.time.ReadablePartial) localDate46, 2, intArray54, (int) ' ');
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDate46, locale57);
        int[] intArray60 = gregorianChronology3.get((org.joda.time.ReadablePartial) localDate46, (long) (short) 0);
        org.joda.time.DateTimeField dateTimeField61 = gregorianChronology3.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate21 and localDate46", (localDate21.compareTo(localDate46) == 0) == localDate21.equals(localDate46));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withEra(0);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean10 = localDate6.equals((java.lang.Object) periodType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean12 = localDate6.isSupported(dateTimeFieldType11);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField14 = new org.joda.time.field.RemainderDateTimeField(dateTimeField4, dateTimeFieldType11, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withEra(0);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean20 = localDate16.equals((java.lang.Object) periodType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean22 = localDate16.isSupported(dateTimeFieldType21);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField23 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField14, dateTimeFieldType21);
        long long25 = zeroIsMaxDateTimeField23.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months27 = org.joda.time.Months.TWELVE;
        boolean boolean28 = dateTimeZone26.equals((java.lang.Object) months27);
        org.joda.time.chrono.GregorianChronology gregorianChronology29 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField30 = gregorianChronology29.hourOfHalfday();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology29);
        int[] intArray39 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray41 = zeroIsMaxDateTimeField23.addWrapField((org.joda.time.ReadablePartial) localDate31, 2, intArray39, (int) ' ');
        org.joda.time.LocalDate localDate43 = localDate31.plusDays((-25200000));
        org.joda.time.LocalDate localDate45 = localDate43.minusMonths((int) (byte) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate6 and localDate31", (localDate6.compareTo(localDate31) == 0) == localDate6.equals(localDate31));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.Months months0 = org.joda.time.Months.THREE;
        java.lang.String str1 = months0.toString();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months3 = org.joda.time.Months.TWELVE;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) months3);
        org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology5.hourOfHalfday();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology5);
        org.joda.time.LocalDate localDate9 = localDate7.withYear(0);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDate14.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localDate14.toDateTimeAtCurrentTime(dateTimeZone19);
        boolean boolean21 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = dateTime20.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.withEra(0);
        org.joda.time.DateMidnight dateMidnight28 = localDate25.toDateMidnight();
        org.joda.time.Chronology chronology29 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.millis();
        int int31 = org.joda.time.base.BaseSingleFieldPeriod.between((org.joda.time.ReadableInstant) dateTime20, (org.joda.time.ReadableInstant) dateMidnight28, durationFieldType30);
        int int32 = localDate7.indexOf(durationFieldType30);
        boolean boolean33 = months0.isSupported(durationFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate7 and localDate11", (localDate7.compareTo(localDate11) == 0) == localDate7.equals(localDate11));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = gregorianChronology3.minutes();
        org.joda.time.DateTimeField dateTimeField6 = gregorianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = gregorianChronology3.years();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = gregorianChronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField5, and durationField8", !(durationField10.compareTo(durationField5) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField5.compareTo(durationField8))));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology3.getZone();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        int int10 = dateTimeZone6.getOffsetFromLocal(0L);
        int int12 = dateTimeZone6.getOffsetFromLocal((-1L));
        org.joda.time.chrono.ZonedChronology zonedChronology13 = org.joda.time.chrono.ZonedChronology.getInstance((org.joda.time.Chronology) gregorianChronology3, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months15 = org.joda.time.Months.TWELVE;
        boolean boolean16 = dateTimeZone14.equals((java.lang.Object) months15);
        int int18 = dateTimeZone14.getOffsetFromLocal(0L);
        int int20 = dateTimeZone14.getOffsetFromLocal((-1L));
        org.joda.time.Chronology chronology21 = zonedChronology13.withZone(dateTimeZone14);
        org.joda.time.Chronology chronology22 = zonedChronology13.withUTC();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months24 = org.joda.time.Months.TWELVE;
        boolean boolean25 = dateTimeZone23.equals((java.lang.Object) months24);
        org.joda.time.chrono.GregorianChronology gregorianChronology26 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone23);
        org.joda.time.DateTimeField dateTimeField27 = gregorianChronology26.yearOfEra();
        org.joda.time.DurationField durationField28 = gregorianChronology26.minutes();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months30 = org.joda.time.Months.TWELVE;
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) months30);
        org.joda.time.chrono.GregorianChronology gregorianChronology32 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField33 = gregorianChronology32.yearOfEra();
        org.joda.time.DurationField durationField34 = gregorianChronology32.minutes();
        org.joda.time.DateTimeField dateTimeField35 = gregorianChronology32.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField36 = gregorianChronology32.yearOfEra();
        org.joda.time.DurationField durationField37 = dateTimeField36.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months39 = org.joda.time.Months.TWELVE;
        boolean boolean40 = dateTimeZone38.equals((java.lang.Object) months39);
        org.joda.time.chrono.GregorianChronology gregorianChronology41 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField42 = gregorianChronology41.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate(dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate44.withEra(0);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean48 = localDate44.equals((java.lang.Object) periodType47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean50 = localDate44.isSupported(dateTimeFieldType49);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField52 = new org.joda.time.field.RemainderDateTimeField(dateTimeField42, dateTimeFieldType49, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate(dateTimeZone53);
        org.joda.time.LocalDate localDate56 = localDate54.withEra(0);
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean58 = localDate54.equals((java.lang.Object) periodType57);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean60 = localDate54.isSupported(dateTimeFieldType59);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField61 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField52, dateTimeFieldType59);
        long long63 = zeroIsMaxDateTimeField61.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months65 = org.joda.time.Months.TWELVE;
        boolean boolean66 = dateTimeZone64.equals((java.lang.Object) months65);
        org.joda.time.chrono.GregorianChronology gregorianChronology67 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone64);
        org.joda.time.DateTimeField dateTimeField68 = gregorianChronology67.hourOfHalfday();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology67);
        int[] intArray77 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray79 = zeroIsMaxDateTimeField61.addWrapField((org.joda.time.ReadablePartial) localDate69, 2, intArray77, (int) ' ');
        java.util.Locale locale80 = null;
        java.lang.String str81 = dateTimeField36.getAsText((org.joda.time.ReadablePartial) localDate69, locale80);
        int[] intArray83 = gregorianChronology26.get((org.joda.time.ReadablePartial) localDate69, (long) (short) 0);
        org.joda.time.Chronology chronology84 = localDate69.getChronology();
        org.joda.time.Interval interval85 = localDate69.toInterval();
        org.joda.time.DurationFieldType durationFieldType86 = org.joda.time.DurationFieldType.years();
        int int87 = localDate69.indexOf(durationFieldType86);
        long long89 = zonedChronology13.set((org.joda.time.ReadablePartial) localDate69, (long) (-28800000));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate5 and localDate44", (localDate5.compareTo(localDate44) == 0) == localDate5.equals(localDate44));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = gregorianChronology3.minutes();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology9.yearOfEra();
        org.joda.time.DurationField durationField11 = gregorianChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology9.yearOfEra();
        org.joda.time.DurationField durationField14 = dateTimeField13.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months16 = org.joda.time.Months.TWELVE;
        boolean boolean17 = dateTimeZone15.equals((java.lang.Object) months16);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean25 = localDate21.equals((java.lang.Object) periodType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean27 = localDate21.isSupported(dateTimeFieldType26);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField29 = new org.joda.time.field.RemainderDateTimeField(dateTimeField19, dateTimeFieldType26, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.withEra(0);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean35 = localDate31.equals((java.lang.Object) periodType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean37 = localDate31.isSupported(dateTimeFieldType36);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField38 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField29, dateTimeFieldType36);
        long long40 = zeroIsMaxDateTimeField38.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months42 = org.joda.time.Months.TWELVE;
        boolean boolean43 = dateTimeZone41.equals((java.lang.Object) months42);
        org.joda.time.chrono.GregorianChronology gregorianChronology44 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology44.hourOfHalfday();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology44);
        int[] intArray54 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray56 = zeroIsMaxDateTimeField38.addWrapField((org.joda.time.ReadablePartial) localDate46, 2, intArray54, (int) ' ');
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDate46, locale57);
        int[] intArray60 = gregorianChronology3.get((org.joda.time.ReadablePartial) localDate46, (long) (short) 0);
        org.joda.time.Chronology chronology61 = localDate46.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate21 and localDate46", (localDate21.compareTo(localDate46) == 0) == localDate21.equals(localDate46));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gregorianChronology3.year();
        org.joda.time.DurationField durationField6 = gregorianChronology3.eras();
        java.lang.String str7 = gregorianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField8 = gregorianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = gregorianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology3.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = gregorianChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField12 = gregorianChronology3.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField12, and durationField6", !(durationField6.compareTo(durationField12) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField12.compareTo(durationField6))));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.yearMonthDay();
        boolean boolean1 = dateTimeFormatter0.isParser();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay(dateTimeZone2);
        org.joda.time.MonthDay.Property property4 = monthDay3.dayOfMonth();
        org.joda.time.MonthDay.Property property5 = monthDay3.monthOfYear();
        org.joda.time.MonthDay monthDay7 = monthDay3.plusMonths((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months9 = org.joda.time.Months.TWELVE;
        boolean boolean10 = dateTimeZone8.equals((java.lang.Object) months9);
        org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology11.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology11.year();
        org.joda.time.DurationField durationField14 = gregorianChronology11.eras();
        java.lang.String str15 = gregorianChronology11.toString();
        org.joda.time.DateTimeField dateTimeField16 = gregorianChronology11.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = gregorianChronology11.millisOfSecond();
        org.joda.time.MonthDay monthDay18 = monthDay3.withChronologyRetainFields((org.joda.time.Chronology) gregorianChronology11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter0.withChronology((org.joda.time.Chronology) gregorianChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on monthDay3 and monthDay18", (monthDay3.compareTo(monthDay18) == 0) == monthDay3.equals(monthDay18));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = gregorianChronology3.minutes();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months7 = org.joda.time.Months.TWELVE;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) months7);
        org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField10 = gregorianChronology9.yearOfEra();
        org.joda.time.DurationField durationField11 = gregorianChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gregorianChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = gregorianChronology9.yearOfEra();
        org.joda.time.DurationField durationField14 = dateTimeField13.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months16 = org.joda.time.Months.TWELVE;
        boolean boolean17 = dateTimeZone15.equals((java.lang.Object) months16);
        org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField19 = gregorianChronology18.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(0);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean25 = localDate21.equals((java.lang.Object) periodType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean27 = localDate21.isSupported(dateTimeFieldType26);
        org.joda.time.field.RemainderDateTimeField remainderDateTimeField29 = new org.joda.time.field.RemainderDateTimeField(dateTimeField19, dateTimeFieldType26, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.withEra(0);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean35 = localDate31.equals((java.lang.Object) periodType34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean37 = localDate31.isSupported(dateTimeFieldType36);
        org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField38 = new org.joda.time.field.ZeroIsMaxDateTimeField((org.joda.time.DateTimeField) remainderDateTimeField29, dateTimeFieldType36);
        long long40 = zeroIsMaxDateTimeField38.roundCeiling((long) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months42 = org.joda.time.Months.TWELVE;
        boolean boolean43 = dateTimeZone41.equals((java.lang.Object) months42);
        org.joda.time.chrono.GregorianChronology gregorianChronology44 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone41);
        org.joda.time.DateTimeField dateTimeField45 = gregorianChronology44.hourOfHalfday();
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology44);
        int[] intArray54 = new int[] { (short) 0, (-292275054), 9, (-28800000), 20, 365 };
        int[] intArray56 = zeroIsMaxDateTimeField38.addWrapField((org.joda.time.ReadablePartial) localDate46, 2, intArray54, (int) ' ');
        java.util.Locale locale57 = null;
        java.lang.String str58 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDate46, locale57);
        int[] intArray60 = gregorianChronology3.get((org.joda.time.ReadablePartial) localDate46, (long) (short) 0);
        org.joda.time.Chronology chronology61 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate21 and localDate46", (localDate21.compareTo(localDate46) == 0) == localDate21.equals(localDate46));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months1 = org.joda.time.Months.TWELVE;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) months1);
        org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField4 = gregorianChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months6 = org.joda.time.Months.TWELVE;
        boolean boolean7 = dateTimeZone5.equals((java.lang.Object) months6);
        org.joda.time.Chronology chronology8 = gregorianChronology3.withZone(dateTimeZone5);
        org.joda.time.DurationField durationField9 = gregorianChronology3.millis();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months11 = org.joda.time.Months.TWELVE;
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) months11);
        org.joda.time.chrono.GregorianChronology gregorianChronology13 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField14 = gregorianChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField15 = gregorianChronology13.year();
        org.joda.time.DurationField durationField16 = gregorianChronology13.eras();
        java.lang.String str17 = gregorianChronology13.toString();
        org.joda.time.DateTimeField dateTimeField18 = gregorianChronology13.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.withEra(0);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean24 = localDate20.equals((java.lang.Object) periodType23);
        org.joda.time.LocalDate localDate26 = localDate20.plusWeeks((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.withEra(0);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearMonthDay();
        boolean boolean32 = localDate28.equals((java.lang.Object) periodType31);
        org.joda.time.LocalDate localDate34 = localDate28.plusWeeks((int) (byte) 100);
        boolean boolean35 = localDate20.isAfter((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.LocalDate localDate37 = localDate34.plusDays(20);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        java.util.Locale locale41 = null;
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localDate39, 3, locale41);
        int[] intArray44 = gregorianChronology3.get((org.joda.time.ReadablePartial) localDate39, (long) 2000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField16", Math.signum(durationField9.compareTo(durationField16)) == -Math.signum(durationField16.compareTo(durationField9)));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        boolean boolean29 = unsupportedDurationField27.isPrecise();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months31 = org.joda.time.Months.TWELVE;
        boolean boolean32 = dateTimeZone30.equals((java.lang.Object) months31);
        org.joda.time.chrono.GregorianChronology gregorianChronology33 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone30);
        org.joda.time.DateTimeField dateTimeField34 = gregorianChronology33.secondOfMinute();
        org.joda.time.DurationField durationField35 = gregorianChronology33.millis();
        int int36 = unsupportedDurationField27.compareTo(durationField35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on unsupportedDurationField27, durationField35, and unsupportedDurationField27", !(unsupportedDurationField27.compareTo(durationField35) == 0) || (Math.signum(unsupportedDurationField27.compareTo(unsupportedDurationField27)) == Math.signum(durationField35.compareTo(unsupportedDurationField27))));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withEra(0);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.months();
        boolean boolean30 = localDate26.isSupported(durationFieldType29);
        org.joda.time.LocalDate localDate32 = localDate26.plusWeeks(2);
        org.joda.time.DateTime dateTime33 = localDate26.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime34 = localDate24.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateTime dateTime37 = localDate36.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.withEra(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        boolean boolean43 = localDate39.isSupported(dateTimeFieldType42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate39.toDateTimeAtCurrentTime(dateTimeZone44);
        boolean boolean46 = dateTime37.isEqual((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        boolean boolean48 = dateTime45.isSupported(dateTimeFieldType47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.LocalDate localDate52 = localDate50.withEra(0);
        org.joda.time.DateMidnight dateMidnight53 = localDate50.toDateMidnight();
        org.joda.time.Chronology chronology54 = org.joda.time.DateTimeUtils.getInstantChronology((org.joda.time.ReadableInstant) dateMidnight53);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.millis();
        int int56 = org.joda.time.base.BaseSingleFieldPeriod.between((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) dateMidnight53, durationFieldType55);
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.weeks();
        int int58 = org.joda.time.base.BaseSingleFieldPeriod.between((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateMidnight53, durationFieldType57);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months60 = org.joda.time.Months.TWELVE;
        boolean boolean61 = dateTimeZone59.equals((java.lang.Object) months60);
        org.joda.time.chrono.GregorianChronology gregorianChronology62 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone59);
        org.joda.time.DateTimeField dateTimeField63 = gregorianChronology62.hourOfHalfday();
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((org.joda.time.Chronology) gregorianChronology62);
        org.joda.time.LocalDate localDate66 = localDate64.withYear(0);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months68 = org.joda.time.Months.TWELVE;
        boolean boolean69 = dateTimeZone67.equals((java.lang.Object) months68);
        long long71 = dateTimeZone67.nextTransition((long) 12);
        org.joda.time.DateTime dateTime72 = localDate66.toDateTimeAtStartOfDay(dateTimeZone67);
        org.joda.time.Chronology chronology73 = org.joda.time.DateTimeUtils.getIntervalChronology((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate1 and localDate64", (localDate1.compareTo(localDate64) == 0) == localDate1.equals(localDate64));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) months2);
        org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = gregorianChronology4.eras();
        org.joda.time.Chronology chronology6 = gregorianChronology4.withUTC();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((-31507200000L), chronology6);
        org.joda.time.DurationField durationField8 = chronology6.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField8, and durationField5", !(durationField5.compareTo(durationField8) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField8.compareTo(durationField5))));
    }
}

