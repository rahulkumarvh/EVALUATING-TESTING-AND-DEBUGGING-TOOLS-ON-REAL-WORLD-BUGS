package org.apache.commons.csv;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String[] strArray15 = cSVFormat8.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat9.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.Appendable appendable11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withHeader(strArray23);
        java.lang.String str25 = cSVFormat21.format((java.lang.Object[]) strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat16.withHeader(strArray23);
        cSVFormat6.printRecord(appendable11, (java.lang.Object[]) strArray23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat16", cSVFormat12.equals(cSVFormat16) ? cSVFormat12.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(strArray11);
        java.lang.String str13 = cSVFormat9.format((java.lang.Object[]) strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withAllowMissingColumnNames();
        boolean boolean13 = cSVFormat8.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0L, cSVFormat20, cSVFormat24 };
        java.lang.String str26 = cSVFormat17.format(objArray25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker(' ');
        java.lang.Object[] objArray38 = new java.lang.Object[] { 0L, cSVFormat33, cSVFormat37 };
        java.lang.String str39 = cSVFormat30.format(objArray38);
        java.lang.String str40 = cSVFormat17.format(objArray38);
        org.apache.commons.csv.QuoteMode quoteMode41 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat17.withQuoteMode(quoteMode41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat8.withQuoteMode(quoteMode41);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat4.withQuoteMode(quoteMode41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withEscape((java.lang.Character) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withRecordSeparator('\n');
        boolean boolean21 = cSVFormat16.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withFirstRecordAsHeader();
        boolean boolean26 = cSVFormat24.getTrim();
        java.lang.Appendable appendable27 = null;
        cSVFormat24.println(appendable27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat24.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char33 = cSVFormat32.getCommentMarker();
        boolean boolean34 = cSVFormat32.isNullStringSet();
        java.lang.String str35 = cSVFormat32.getNullString();
        boolean boolean36 = cSVFormat32.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray38 = cSVFormat37.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withQuote('\f');
        java.lang.String[] strArray44 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat32.withHeader(strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat30.withHeaderComments((java.lang.Object[]) strArray44);
        java.lang.String str48 = cSVFormat22.format((java.lang.Object[]) strArray44);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat7.withHeader(strArray44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat14 and cSVFormat22", cSVFormat14.equals(cSVFormat22) ? cSVFormat14.hashCode() == cSVFormat22.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        boolean boolean18 = cSVFormat15.isQuoteCharacterSet();
        java.lang.String str19 = cSVFormat15.getNullString();
        boolean boolean20 = cSVFormat15.isEscapeCharacterSet();
        boolean boolean21 = cSVFormat15.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat15.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        boolean boolean24 = cSVFormat8.equals((java.lang.Object) cSVFormat23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat26.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withRecordSeparator('\n');
        boolean boolean38 = cSVFormat33.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat33.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withFirstRecordAsHeader();
        boolean boolean43 = cSVFormat41.getTrim();
        java.lang.Appendable appendable44 = null;
        cSVFormat41.println(appendable44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat41.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char50 = cSVFormat49.getCommentMarker();
        boolean boolean51 = cSVFormat49.isNullStringSet();
        java.lang.String str52 = cSVFormat49.getNullString();
        boolean boolean53 = cSVFormat49.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray55 = cSVFormat54.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat54.withQuote('\f');
        java.lang.String[] strArray61 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat57.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat49.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat47.withHeaderComments((java.lang.Object[]) strArray61);
        java.lang.String str65 = cSVFormat39.format((java.lang.Object[]) strArray61);
        java.lang.String str66 = cSVFormat8.format((java.lang.Object[]) strArray61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat39", cSVFormat6.equals(cSVFormat39) ? cSVFormat6.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean13 = cSVFormat12.isQuoteCharacterSet();
        boolean boolean14 = cSVFormat12.isCommentMarkerSet();
        boolean boolean15 = cSVFormat12.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat12.withEscape((java.lang.Character) '\b');
        boolean boolean18 = cSVFormat17.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker(' ');
        java.lang.Object[] objArray30 = new java.lang.Object[] { 0L, cSVFormat25, cSVFormat29 };
        java.lang.String str31 = cSVFormat22.format(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withCommentMarker(' ');
        java.lang.Object[] objArray43 = new java.lang.Object[] { 0L, cSVFormat38, cSVFormat42 };
        java.lang.String str44 = cSVFormat35.format(objArray43);
        java.lang.String str45 = cSVFormat22.format(objArray43);
        boolean boolean46 = cSVFormat17.equals((java.lang.Object) objArray43);
        java.lang.String str47 = cSVFormat1.format(objArray43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat20", cSVFormat10.equals(cSVFormat20) ? cSVFormat10.hashCode() == cSVFormat20.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withTrim();
        boolean boolean15 = cSVFormat9.equals((java.lang.Object) cSVFormat14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        boolean boolean3 = cSVFormat0.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withEscape((java.lang.Character) '\b');
        boolean boolean6 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean7 = cSVFormat0.getIgnoreEmptyLines();
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withHeader(resultSet8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        boolean boolean9 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat8", cSVFormat2.equals(cSVFormat8) ? cSVFormat2.hashCode() == cSVFormat8.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass10 = cSVFormat0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('\b');
        boolean boolean10 = cSVFormat9.getIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean7 = cSVFormat6.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withEscape('#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat9", cSVFormat1.equals(cSVFormat9) ? cSVFormat1.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        java.lang.String[] strArray15 = cSVFormat8.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(strArray11);
        java.lang.String str13 = cSVFormat9.format((java.lang.Object[]) strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat4.withHeader(strArray11);
        boolean boolean15 = cSVFormat4.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat14", cSVFormat2.equals(cSVFormat14) ? cSVFormat2.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withFirstRecordAsHeader();
        boolean boolean6 = cSVFormat4.getTrim();
        java.lang.Appendable appendable7 = null;
        cSVFormat4.println(appendable7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker(' ');
        java.lang.Object[] objArray23 = new java.lang.Object[] { 0L, cSVFormat18, cSVFormat22 };
        java.lang.String str24 = cSVFormat15.format(objArray23);
        java.lang.String str25 = cSVFormat11.format(objArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat0.withHeaderComments(objArray23);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat0.withIgnoreHeaderCase();
        boolean boolean28 = cSVFormat0.getAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat27", cSVFormat2.equals(cSVFormat27) ? cSVFormat2.hashCode() == cSVFormat27.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        java.lang.Appendable appendable7 = null;
        cSVFormat4.println(appendable7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withRecordSeparator('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat9", cSVFormat1.equals(cSVFormat9) ? cSVFormat1.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.Appendable appendable7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray9 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(strArray9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withHeader(strArray19);
        java.lang.String str21 = cSVFormat17.format((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat12.withHeader(strArray19);
        cSVFormat6.printRecord(appendable7, (java.lang.Object[]) strArray19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat8 and cSVFormat12", cSVFormat8.equals(cSVFormat12) ? cSVFormat8.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator(',');
        java.lang.String str7 = cSVFormat6.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat4", cSVFormat1.equals(cSVFormat4) ? cSVFormat1.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat9", cSVFormat1.equals(cSVFormat9) ? cSVFormat1.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.QuoteMode quoteMode10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withQuoteMode(quoteMode10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat9", cSVFormat6.equals(cSVFormat9) ? cSVFormat6.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withEscape((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat16.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withRecordSeparator('\n');
        boolean boolean28 = cSVFormat23.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withFirstRecordAsHeader();
        boolean boolean33 = cSVFormat31.getTrim();
        java.lang.Appendable appendable34 = null;
        cSVFormat31.println(appendable34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat31.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char40 = cSVFormat39.getCommentMarker();
        boolean boolean41 = cSVFormat39.isNullStringSet();
        java.lang.String str42 = cSVFormat39.getNullString();
        boolean boolean43 = cSVFormat39.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray45 = cSVFormat44.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat44.withQuote('\f');
        java.lang.String[] strArray51 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat47.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat39.withHeader(strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat37.withHeaderComments((java.lang.Object[]) strArray51);
        java.lang.String str55 = cSVFormat29.format((java.lang.Object[]) strArray51);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat8.withHeaderComments((java.lang.Object[]) strArray51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat29", cSVFormat6.equals(cSVFormat29) ? cSVFormat6.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat1.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withNullString("\u2029a0 aDelimiter=< a>  SkipHe aderRecord:f alse aDelimiter=< a>  CommentSt art=<  >  SkipHe aderRecord:f alsea\205");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat9", cSVFormat1.equals(cSVFormat9) ? cSVFormat1.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, cSVFormat14, cSVFormat18 };
        java.lang.String str20 = cSVFormat11.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0L, cSVFormat27, cSVFormat31 };
        java.lang.String str33 = cSVFormat24.format(objArray32);
        java.lang.String str34 = cSVFormat11.format(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode35 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat11.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat7.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat37.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        boolean boolean5 = cSVFormat2.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char11 = cSVFormat1.getEscapeCharacter();
        boolean boolean12 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withIgnoreHeaderCase(true);
        java.lang.String str15 = cSVFormat14.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat10", cSVFormat1.equals(cSVFormat10) ? cSVFormat1.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        java.sql.ResultSet resultSet42 = null;
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withHeader(resultSet42);
        boolean boolean44 = cSVFormat14.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat43", cSVFormat6.equals(cSVFormat43) ? cSVFormat6.hashCode() == cSVFormat43.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        java.lang.String[] strArray7 = cSVFormat1.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrailingDelimiter(true);
        java.lang.String[] strArray14 = cSVFormat11.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withDelimiter('\f');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withFirstRecordAsHeader();
        boolean boolean20 = cSVFormat18.getTrim();
        java.lang.Appendable appendable21 = null;
        cSVFormat18.println(appendable21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat18.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withCommentMarker(' ');
        java.lang.Object[] objArray36 = new java.lang.Object[] { 0L, cSVFormat31, cSVFormat35 };
        java.lang.String str37 = cSVFormat28.format(objArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat44 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withCommentMarker(' ');
        java.lang.Object[] objArray49 = new java.lang.Object[] { 0L, cSVFormat44, cSVFormat48 };
        java.lang.String str50 = cSVFormat41.format(objArray49);
        java.lang.String str51 = cSVFormat28.format(objArray49);
        org.apache.commons.csv.QuoteMode quoteMode52 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat28.withQuoteMode(quoteMode52);
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat24.withQuoteMode(quoteMode52);
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat11.withQuoteMode(quoteMode52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat24", cSVFormat1.equals(cSVFormat24) ? cSVFormat1.hashCode() == cSVFormat24.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreEmptyLines(true);
        boolean boolean15 = cSVFormat8.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat8.withIgnoreEmptyLines();
        boolean boolean17 = cSVFormat16.isNullStringSet();
        java.lang.Appendable appendable18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withFirstRecordAsHeader();
        boolean boolean22 = cSVFormat20.getTrim();
        java.lang.Appendable appendable23 = null;
        cSVFormat20.println(appendable23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat20.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean30 = cSVFormat29.isQuoteCharacterSet();
        boolean boolean31 = cSVFormat29.isCommentMarkerSet();
        char char32 = cSVFormat29.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode34 = cSVFormat29.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat29.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withFirstRecordAsHeader();
        boolean boolean40 = cSVFormat38.getTrim();
        java.lang.Appendable appendable41 = null;
        cSVFormat38.println(appendable41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat38.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat38.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withCommentMarker(' ');
        java.lang.Object[] objArray57 = new java.lang.Object[] { 0L, cSVFormat52, cSVFormat56 };
        java.lang.String str58 = cSVFormat49.format(objArray57);
        java.lang.String str59 = cSVFormat45.format(objArray57);
        org.apache.commons.csv.CSVFormat cSVFormat60 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray61 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat60.withHeader(strArray61);
        java.lang.String str63 = cSVFormat45.format((java.lang.Object[]) strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat29.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat26.withHeader(strArray61);
        cSVFormat16.printRecord(appendable18, (java.lang.Object[]) strArray61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat26", cSVFormat1.equals(cSVFormat26) ? cSVFormat1.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreSurroundingSpaces();
        java.lang.Object[] objArray11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeaderComments(objArray11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char11 = cSVFormat1.getEscapeCharacter();
        boolean boolean12 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat10", cSVFormat1.equals(cSVFormat10) ? cSVFormat1.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces();
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) '\n');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withTrim();
        java.lang.Appendable appendable15 = null;
        cSVFormat14.println(appendable15);
        java.sql.ResultSetMetaData resultSetMetaData17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withHeader(resultSetMetaData17);
        boolean boolean19 = cSVFormat6.equals((java.lang.Object) cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat23.withFirstRecordAsHeader();
        boolean boolean25 = cSVFormat23.getTrim();
        java.lang.Appendable appendable26 = null;
        cSVFormat23.println(appendable26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat23.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean33 = cSVFormat32.isQuoteCharacterSet();
        boolean boolean34 = cSVFormat32.isCommentMarkerSet();
        char char35 = cSVFormat32.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat32.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode37 = cSVFormat32.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat32.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withFirstRecordAsHeader();
        boolean boolean43 = cSVFormat41.getTrim();
        java.lang.Appendable appendable44 = null;
        cSVFormat41.println(appendable44);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat41.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat41.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat55 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat57 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat57.withCommentMarker(' ');
        java.lang.Object[] objArray60 = new java.lang.Object[] { 0L, cSVFormat55, cSVFormat59 };
        java.lang.String str61 = cSVFormat52.format(objArray60);
        java.lang.String str62 = cSVFormat48.format(objArray60);
        org.apache.commons.csv.CSVFormat cSVFormat63 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray64 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat63.withHeader(strArray64);
        java.lang.String str66 = cSVFormat48.format((java.lang.Object[]) strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat32.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat29.withHeader(strArray64);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat6.withHeader(strArray64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat29", cSVFormat1.equals(cSVFormat29) ? cSVFormat1.hashCode() == cSVFormat29.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim(false);
        boolean boolean8 = cSVFormat4.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        java.lang.String[] strArray2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(strArray2);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat4", cSVFormat3.equals(cSVFormat4) ? cSVFormat3.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker((java.lang.Character) '|');
        boolean boolean10 = cSVFormat9.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withAllowMissingColumnNames();
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withRecordSeparator(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat4", cSVFormat2.equals(cSVFormat4) ? cSVFormat2.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        java.lang.Character char10 = cSVFormat1.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withSkipHeaderRecord(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        java.sql.ResultSetMetaData resultSetMetaData4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withHeader(resultSetMetaData4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat3", cSVFormat2.equals(cSVFormat3) ? cSVFormat2.hashCode() == cSVFormat3.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char10 = cSVFormat9.getCommentMarker();
        boolean boolean11 = cSVFormat9.isNullStringSet();
        java.lang.String str12 = cSVFormat9.getNullString();
        boolean boolean13 = cSVFormat9.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray15 = cSVFormat14.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withQuote('\f');
        java.lang.String[] strArray21 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat17.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat9.withHeader(strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat7.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withHeader(resultSetMetaData27);
        java.lang.String str29 = cSVFormat28.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat26", cSVFormat7.equals(cSVFormat26) ? cSVFormat7.hashCode() == cSVFormat26.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withIgnoreHeaderCase(true);
        java.lang.Character char16 = cSVFormat11.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat13 and cSVFormat15", cSVFormat13.equals(cSVFormat15) ? cSVFormat13.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.Character char4 = cSVFormat3.getCommentMarker();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        boolean boolean11 = cSVFormat9.getTrim();
        java.lang.Appendable appendable12 = null;
        cSVFormat9.println(appendable12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker(' ');
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0L, cSVFormat22, cSVFormat26 };
        java.lang.String str28 = cSVFormat19.format(objArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker(' ');
        java.lang.Object[] objArray40 = new java.lang.Object[] { 0L, cSVFormat35, cSVFormat39 };
        java.lang.String str41 = cSVFormat32.format(objArray40);
        java.lang.String str42 = cSVFormat19.format(objArray40);
        org.apache.commons.csv.QuoteMode quoteMode43 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat19.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat15.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat7.withQuoteMode(quoteMode43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat15", cSVFormat1.equals(cSVFormat15) ? cSVFormat1.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        boolean boolean6 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withCommentMarker(' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] { 0L, cSVFormat13, cSVFormat17 };
        java.lang.String str19 = cSVFormat10.format(objArray18);
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0L, cSVFormat26, cSVFormat30 };
        java.lang.String str32 = cSVFormat23.format(objArray31);
        java.lang.String str33 = cSVFormat10.format(objArray31);
        org.apache.commons.csv.QuoteMode quoteMode34 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat10.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat1.withQuoteMode(quoteMode34);
        java.sql.ResultSetMetaData resultSetMetaData37 = null;
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat1.withHeader(resultSetMetaData37);
        java.sql.ResultSetMetaData resultSetMetaData39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat1.withHeader(resultSetMetaData39);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat1.withEscape('\t');
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withIgnoreHeaderCase();
        java.lang.Character char46 = cSVFormat44.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat42 and cSVFormat45", cSVFormat42.equals(cSVFormat45) ? cSVFormat42.hashCode() == cSVFormat45.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.lang.String[] strArray2 = cSVFormat1.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat3.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(strArray6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(strArray16);
        java.lang.String str18 = cSVFormat14.format((java.lang.Object[]) strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat9.withHeader(strArray16);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat9", cSVFormat5.equals(cSVFormat9) ? cSVFormat5.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withTrailingDelimiter(false);
        java.lang.Class<?> wildcardClass44 = cSVFormat43.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) true, "Delimiter=<a> CommentStart=< > SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray8 = cSVFormat7.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withQuote('\f');
        java.lang.String[] strArray14 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat10.withHeader(strArray14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat1.withHeader(strArray14);
        java.lang.Character char17 = cSVFormat1.getQuoteCharacter();
        java.lang.Character char18 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat1.withDelimiter('|');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withFirstRecordAsHeader();
        boolean boolean24 = cSVFormat22.getTrim();
        java.lang.Appendable appendable25 = null;
        cSVFormat22.println(appendable25);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat22.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat22.withIgnoreHeaderCase();
        java.lang.Character char32 = cSVFormat22.getEscapeCharacter();
        boolean boolean33 = cSVFormat22.getIgnoreEmptyLines();
        boolean boolean34 = cSVFormat22.isQuoteCharacterSet();
        boolean boolean35 = cSVFormat20.equals((java.lang.Object) boolean34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat31", cSVFormat1.equals(cSVFormat31) ? cSVFormat1.hashCode() == cSVFormat31.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withTrailingDelimiter(false);
        java.lang.String str44 = cSVFormat14.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat43", cSVFormat6.equals(cSVFormat43) ? cSVFormat6.hashCode() == cSVFormat43.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean11 = cSVFormat10.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat10.isCommentMarkerSet();
        char char13 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withFirstRecordAsHeader();
        boolean boolean21 = cSVFormat19.getTrim();
        java.lang.Appendable appendable22 = null;
        cSVFormat19.println(appendable22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker(' ');
        java.lang.Object[] objArray38 = new java.lang.Object[] { 0L, cSVFormat33, cSVFormat37 };
        java.lang.String str39 = cSVFormat30.format(objArray38);
        java.lang.String str40 = cSVFormat26.format(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withHeader(strArray42);
        java.lang.String str44 = cSVFormat26.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat10.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat7.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat7.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withDelimiter('a');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        java.lang.String[] strArray5 = cSVFormat4.getHeaderComments();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker((java.lang.Character) '|');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat4", cSVFormat1.equals(cSVFormat4) ? cSVFormat1.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape((java.lang.Character) '\037');
        java.lang.Character char5 = cSVFormat4.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean2 = cSVFormat0.isCommentMarkerSet();
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreEmptyLines();
        boolean boolean6 = cSVFormat5.getIgnoreEmptyLines();
        java.lang.String[] strArray7 = cSVFormat5.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\b');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat6", cSVFormat1.equals(cSVFormat6) ? cSVFormat1.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('\f');
        java.lang.Character char10 = cSVFormat9.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withRecordSeparator(' ');
        boolean boolean15 = cSVFormat9.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray17 = cSVFormat16.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withQuote('\f');
        java.lang.String[] strArray23 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withIgnoreEmptyLines(false);
        java.lang.Character char29 = cSVFormat19.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char44 = cSVFormat43.getCommentMarker();
        boolean boolean45 = cSVFormat43.isNullStringSet();
        java.lang.String str46 = cSVFormat43.getNullString();
        boolean boolean47 = cSVFormat43.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray49 = cSVFormat48.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withQuote('\f');
        java.lang.String[] strArray55 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat43.withHeader(strArray55);
        java.lang.String str58 = cSVFormat41.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat9.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat60 and cSVFormat61", cSVFormat60.equals(cSVFormat61) ? cSVFormat60.hashCode() == cSVFormat61.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        java.lang.String str10 = cSVFormat9.toString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withIgnoreEmptyLines(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat11", cSVFormat9.equals(cSVFormat11) ? cSVFormat9.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean11 = cSVFormat10.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat10.isCommentMarkerSet();
        char char13 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withFirstRecordAsHeader();
        boolean boolean21 = cSVFormat19.getTrim();
        java.lang.Appendable appendable22 = null;
        cSVFormat19.println(appendable22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker(' ');
        java.lang.Object[] objArray38 = new java.lang.Object[] { 0L, cSVFormat33, cSVFormat37 };
        java.lang.String str39 = cSVFormat30.format(objArray38);
        java.lang.String str40 = cSVFormat26.format(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withHeader(strArray42);
        java.lang.String str44 = cSVFormat26.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat10.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat7.withHeader(strArray42);
        java.lang.Character char47 = cSVFormat46.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withFirstRecordAsHeader();
        boolean boolean17 = cSVFormat16.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames(true);
        java.lang.Character char7 = cSVFormat4.getQuoteCharacter();
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray23 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withHeader(strArray23);
        java.lang.String str25 = cSVFormat21.format((java.lang.Object[]) strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat16.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat12 and cSVFormat16", cSVFormat12.equals(cSVFormat16) ? cSVFormat12.hashCode() == cSVFormat16.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreEmptyLines();
        boolean boolean17 = cSVFormat16.getTrim();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withTrailingDelimiter(false);
        boolean boolean44 = cSVFormat14.getIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat43", cSVFormat6.equals(cSVFormat43) ? cSVFormat6.hashCode() == cSVFormat43.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        java.lang.Character char7 = cSVFormat6.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat5", cSVFormat0.equals(cSVFormat5) ? cSVFormat0.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withSkipHeaderRecord(false);
        boolean boolean18 = cSVFormat15.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat11 and cSVFormat17", cSVFormat11.equals(cSVFormat17) ? cSVFormat11.hashCode() == cSVFormat17.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withNullString("\u2028");
        boolean boolean10 = cSVFormat9.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat7", cSVFormat3.equals(cSVFormat7) ? cSVFormat3.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker((java.lang.Character) '|');
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSetMetaData10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrim(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat5", cSVFormat2.equals(cSVFormat5) ? cSVFormat2.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('\f');
        java.lang.Character char10 = cSVFormat9.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withRecordSeparator(' ');
        boolean boolean15 = cSVFormat9.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray17 = cSVFormat16.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withQuote('\f');
        java.lang.String[] strArray23 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withIgnoreEmptyLines(false);
        java.lang.Character char29 = cSVFormat19.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char44 = cSVFormat43.getCommentMarker();
        boolean boolean45 = cSVFormat43.isNullStringSet();
        java.lang.String str46 = cSVFormat43.getNullString();
        boolean boolean47 = cSVFormat43.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray49 = cSVFormat48.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withQuote('\f');
        java.lang.String[] strArray55 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat43.withHeader(strArray55);
        java.lang.String str58 = cSVFormat41.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat63.withIgnoreEmptyLines();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat61", cSVFormat9.equals(cSVFormat61) ? cSVFormat9.hashCode() == cSVFormat61.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withEscape('\037');
        java.lang.String[] strArray12 = cSVFormat11.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str3 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withEscape((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withFirstRecordAsHeader();
        boolean boolean11 = cSVFormat9.getTrim();
        java.lang.Appendable appendable12 = null;
        cSVFormat9.println(appendable12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat9.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat24.withCommentMarker(' ');
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0L, cSVFormat22, cSVFormat26 };
        java.lang.String str28 = cSVFormat19.format(objArray27);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker(' ');
        java.lang.Object[] objArray40 = new java.lang.Object[] { 0L, cSVFormat35, cSVFormat39 };
        java.lang.String str41 = cSVFormat32.format(objArray40);
        java.lang.String str42 = cSVFormat19.format(objArray40);
        org.apache.commons.csv.QuoteMode quoteMode43 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat19.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat15.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat7.withQuoteMode(quoteMode43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat15", cSVFormat1.equals(cSVFormat15) ? cSVFormat1.hashCode() == cSVFormat15.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withIgnoreEmptyLines();
        java.lang.String str13 = cSVFormat12.getNullString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat10", cSVFormat1.equals(cSVFormat10) ? cSVFormat1.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        java.lang.String str4 = cSVFormat1.getRecordSeparator();
        java.lang.String str5 = cSVFormat1.toString();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, cSVFormat14, cSVFormat18 };
        java.lang.String str20 = cSVFormat11.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0L, cSVFormat27, cSVFormat31 };
        java.lang.String str33 = cSVFormat24.format(objArray32);
        java.lang.String str34 = cSVFormat11.format(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode35 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat11.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat1.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat1.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.Character char41 = cSVFormat1.getQuoteCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat40", cSVFormat7.equals(cSVFormat40) ? cSVFormat7.hashCode() == cSVFormat40.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat5", cSVFormat2.equals(cSVFormat5) ? cSVFormat2.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean11 = cSVFormat10.isQuoteCharacterSet();
        boolean boolean12 = cSVFormat10.isCommentMarkerSet();
        char char13 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat10.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withFirstRecordAsHeader();
        boolean boolean21 = cSVFormat19.getTrim();
        java.lang.Appendable appendable22 = null;
        cSVFormat19.println(appendable22);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withCommentMarker(' ');
        java.lang.Object[] objArray38 = new java.lang.Object[] { 0L, cSVFormat33, cSVFormat37 };
        java.lang.String str39 = cSVFormat30.format(objArray38);
        java.lang.String str40 = cSVFormat26.format(objArray38);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray42 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat41.withHeader(strArray42);
        java.lang.String str44 = cSVFormat26.format((java.lang.Object[]) strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat10.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat7.withHeader(strArray42);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        java.lang.String str9 = cSVFormat8.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean5 = cSVFormat4.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        java.lang.Class<?> wildcardClass7 = cSVFormat6.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, cSVFormat14, cSVFormat18 };
        java.lang.String str20 = cSVFormat11.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0L, cSVFormat27, cSVFormat31 };
        java.lang.String str33 = cSVFormat24.format(objArray32);
        java.lang.String str34 = cSVFormat11.format(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode35 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat11.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat7.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat7.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat41 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat41.withFirstRecordAsHeader();
        boolean boolean43 = cSVFormat41.getTrim();
        java.lang.Appendable appendable44 = null;
        cSVFormat41.println(appendable44);
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat41.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat47.withRecordSeparator('\b');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean51 = cSVFormat50.isQuoteCharacterSet();
        boolean boolean52 = cSVFormat50.isCommentMarkerSet();
        char char53 = cSVFormat50.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat50.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.QuoteMode quoteMode55 = cSVFormat50.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat50.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat59.withFirstRecordAsHeader();
        boolean boolean61 = cSVFormat59.getTrim();
        java.lang.Appendable appendable62 = null;
        cSVFormat59.println(appendable62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat59.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat59.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat68 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat70 = cSVFormat68.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat75 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat77 = cSVFormat75.withCommentMarker(' ');
        java.lang.Object[] objArray78 = new java.lang.Object[] { 0L, cSVFormat73, cSVFormat77 };
        java.lang.String str79 = cSVFormat70.format(objArray78);
        java.lang.String str80 = cSVFormat66.format(objArray78);
        org.apache.commons.csv.CSVFormat cSVFormat81 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray82 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat83 = cSVFormat81.withHeader(strArray82);
        java.lang.String str84 = cSVFormat66.format((java.lang.Object[]) strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat85 = cSVFormat50.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat86 = cSVFormat47.withHeader(strArray82);
        org.apache.commons.csv.CSVFormat cSVFormat87 = cSVFormat7.withHeaderComments((java.lang.Object[]) strArray82);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat39", cSVFormat1.equals(cSVFormat39) ? cSVFormat1.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withIgnoreHeaderCase();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat7", cSVFormat1.equals(cSVFormat7) ? cSVFormat1.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        boolean boolean42 = cSVFormat14.getIgnoreSurroundingSpaces();
        java.lang.Character char43 = cSVFormat14.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat14.withRecordSeparator('\f');
        java.lang.String[] strArray46 = cSVFormat45.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.newFormat('a');
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreEmptyLines(false);
        java.lang.Appendable appendable11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withTrailingDelimiter(true);
        char char23 = cSVFormat22.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker(' ');
        java.lang.Object[] objArray35 = new java.lang.Object[] { 0L, cSVFormat30, cSVFormat34 };
        java.lang.String str36 = cSVFormat27.format(objArray35);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker(' ');
        java.lang.Object[] objArray48 = new java.lang.Object[] { 0L, cSVFormat43, cSVFormat47 };
        java.lang.String str49 = cSVFormat40.format(objArray48);
        java.lang.String str50 = cSVFormat27.format(objArray48);
        org.apache.commons.csv.QuoteMode quoteMode51 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat27.withQuoteMode(quoteMode51);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat22.withQuoteMode(quoteMode51);
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean55 = cSVFormat54.isQuoteCharacterSet();
        boolean boolean56 = cSVFormat54.isCommentMarkerSet();
        boolean boolean57 = cSVFormat54.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat54.withEscape((java.lang.Character) '\b');
        boolean boolean60 = cSVFormat54.getSkipHeaderRecord();
        boolean boolean61 = cSVFormat54.getIgnoreEmptyLines();
        java.sql.ResultSet resultSet62 = null;
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat54.withHeader(resultSet62);
        org.apache.commons.csv.CSVFormat cSVFormat65 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char66 = cSVFormat65.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat65.withFirstRecordAsHeader();
        char char68 = cSVFormat67.getDelimiter();
        java.lang.Character char69 = cSVFormat67.getQuoteCharacter();
        java.lang.String[] strArray70 = null;
        org.apache.commons.csv.CSVFormat cSVFormat71 = cSVFormat67.withHeader(strArray70);
        java.lang.Appendable appendable72 = null;
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray74 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat73.withHeader(strArray74);
        cSVFormat71.printRecord(appendable72, (java.lang.Object[]) strArray74);
        java.lang.String str77 = cSVFormat54.format((java.lang.Object[]) strArray74);
        org.apache.commons.csv.CSVFormat cSVFormat78 = cSVFormat53.withHeader(strArray74);
        cSVFormat10.printRecord(appendable11, (java.lang.Object[]) strArray74);
        org.apache.commons.csv.CSVFormat cSVFormat80 = cSVFormat2.withHeader(strArray74);
        org.apache.commons.csv.CSVFormat cSVFormat82 = cSVFormat80.withTrailingDelimiter(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        boolean boolean6 = cSVFormat5.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        boolean boolean11 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char14 = cSVFormat13.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withFirstRecordAsHeader();
        char char16 = cSVFormat15.getDelimiter();
        java.lang.Character char17 = cSVFormat15.getQuoteCharacter();
        java.lang.String[] strArray18 = null;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withHeader(strArray18);
        java.lang.Appendable appendable20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray22 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withHeader(strArray22);
        cSVFormat19.printRecord(appendable20, (java.lang.Object[]) strArray22);
        java.lang.String str25 = cSVFormat8.format((java.lang.Object[]) strArray22);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat38.withRecordSeparator('\n');
        boolean boolean43 = cSVFormat38.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat38.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat46 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat46.withFirstRecordAsHeader();
        boolean boolean48 = cSVFormat46.getTrim();
        java.lang.Appendable appendable49 = null;
        cSVFormat46.println(appendable49);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat46.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char55 = cSVFormat54.getCommentMarker();
        boolean boolean56 = cSVFormat54.isNullStringSet();
        java.lang.String str57 = cSVFormat54.getNullString();
        boolean boolean58 = cSVFormat54.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat59 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray60 = cSVFormat59.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat59.withQuote('\f');
        java.lang.String[] strArray66 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat67 = cSVFormat62.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat68 = cSVFormat54.withHeader(strArray66);
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat52.withHeaderComments((java.lang.Object[]) strArray66);
        java.lang.String str70 = cSVFormat44.format((java.lang.Object[]) strArray66);
        java.lang.String str71 = cSVFormat27.format((java.lang.Object[]) strArray66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat44", cSVFormat6.equals(cSVFormat44) ? cSVFormat6.hashCode() == cSVFormat44.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(true);
        char char8 = cSVFormat7.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote((java.lang.Character) '\b');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat7", cSVFormat3.equals(cSVFormat7) ? cSVFormat3.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat43.withQuote(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        boolean boolean12 = cSVFormat11.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat7", cSVFormat3.equals(cSVFormat7) ? cSVFormat3.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        java.lang.Character char7 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withRecordSeparator('\f');
        java.lang.Character char10 = cSVFormat9.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withRecordSeparator(' ');
        boolean boolean15 = cSVFormat9.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray17 = cSVFormat16.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withQuote('\f');
        java.lang.String[] strArray23 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat19.withHeader(strArray23);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat19.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat19.withIgnoreEmptyLines(false);
        java.lang.Character char29 = cSVFormat19.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat31.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat31.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat31.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat37.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char44 = cSVFormat43.getCommentMarker();
        boolean boolean45 = cSVFormat43.isNullStringSet();
        java.lang.String str46 = cSVFormat43.getNullString();
        boolean boolean47 = cSVFormat43.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat48 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray49 = cSVFormat48.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat48.withQuote('\f');
        java.lang.String[] strArray55 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat51.withHeader(strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat43.withHeader(strArray55);
        java.lang.String str58 = cSVFormat41.format((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat19.withHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat9.withHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat9.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat61.withIgnoreSurroundingSpaces(false);
        boolean boolean64 = cSVFormat63.isCommentMarkerSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat9 and cSVFormat61", cSVFormat9.equals(cSVFormat61) ? cSVFormat9.hashCode() == cSVFormat61.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withEscape((java.lang.Character) '\b');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat2 and cSVFormat5", cSVFormat2.equals(cSVFormat5) ? cSVFormat2.hashCode() == cSVFormat5.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSet10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withRecordSeparator('4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat9", cSVFormat0.equals(cSVFormat9) ? cSVFormat0.hashCode() == cSVFormat9.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, cSVFormat14, cSVFormat18 };
        java.lang.String str20 = cSVFormat11.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0L, cSVFormat27, cSVFormat31 };
        java.lang.String str33 = cSVFormat24.format(objArray32);
        java.lang.String str34 = cSVFormat11.format(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode35 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat11.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat7.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat7.withTrim(false);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat7, "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat39", cSVFormat1.equals(cSVFormat39) ? cSVFormat1.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        boolean boolean5 = cSVFormat4.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withEscape(' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrim();
        java.lang.String[] strArray18 = cSVFormat17.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withHeader(resultSet5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator("\205");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode15 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuoteMode(quoteMode15);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat22.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat22.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char35 = cSVFormat34.getCommentMarker();
        boolean boolean36 = cSVFormat34.isNullStringSet();
        java.lang.String str37 = cSVFormat34.getNullString();
        boolean boolean38 = cSVFormat34.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray40 = cSVFormat39.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withQuote('\f');
        java.lang.String[] strArray46 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat42.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat34.withHeader(strArray46);
        java.lang.String str49 = cSVFormat32.format((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat20.withHeader(strArray46);
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat20.withNullString("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat53 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean54 = cSVFormat53.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat53.withIgnoreEmptyLines(true);
        org.apache.commons.csv.QuoteMode quoteMode57 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withQuoteMode(quoteMode57);
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat20.withQuoteMode(quoteMode57);
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat18.withQuoteMode(quoteMode57);
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat6.withQuoteMode(quoteMode57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat18", cSVFormat3.equals(cSVFormat18) ? cSVFormat3.hashCode() == cSVFormat18.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, cSVFormat14, cSVFormat18 };
        java.lang.String str20 = cSVFormat11.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0L, cSVFormat27, cSVFormat31 };
        java.lang.String str33 = cSVFormat24.format(objArray32);
        java.lang.String str34 = cSVFormat11.format(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode35 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat11.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat7.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat7.withTrim(true);
        java.sql.ResultSet resultSet40 = null;
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat7.withHeader(resultSet40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat39", cSVFormat1.equals(cSVFormat39) ? cSVFormat1.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        boolean boolean15 = cSVFormat14.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withSkipHeaderRecord(false);
        java.lang.String[] strArray18 = cSVFormat17.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char24 = cSVFormat23.getCommentMarker();
        boolean boolean25 = cSVFormat23.isNullStringSet();
        java.lang.String str26 = cSVFormat23.getNullString();
        boolean boolean27 = cSVFormat23.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray29 = cSVFormat28.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withQuote('\f');
        java.lang.String[] strArray35 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat23.withHeader(strArray35);
        java.lang.String str38 = cSVFormat21.format((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat9.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat9.withNullString("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean43 = cSVFormat42.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withIgnoreEmptyLines(true);
        org.apache.commons.csv.QuoteMode quoteMode46 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat9.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat7.withQuoteMode(quoteMode46);
        boolean boolean50 = cSVFormat49.isNullStringSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat7", cSVFormat3.equals(cSVFormat7) ? cSVFormat3.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat1.withIgnoreHeaderCase(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat10 and cSVFormat13", cSVFormat10.equals(cSVFormat13) ? cSVFormat10.hashCode() == cSVFormat13.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray1 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\f');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withIgnoreHeaderCase(true);
        java.sql.ResultSet resultSet10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withHeader(resultSet10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withAllowMissingColumnNames();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat11", cSVFormat0.equals(cSVFormat11) ? cSVFormat0.hashCode() == cSVFormat11.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator(',');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withAllowMissingColumnNames();
        java.lang.String[] strArray8 = cSVFormat4.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat7", cSVFormat0.equals(cSVFormat7) ? cSVFormat0.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat1, "\u2029 a 0aDelimiter=<a>  SkipHeaderRecord:falseaDelimiter=<a>  CommentStart=<  >  SkipHeaderRecord:false a\205");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat12.getQuoteMode();
        boolean boolean16 = cSVFormat12.isCommentMarkerSet();
        boolean boolean17 = cSVFormat12.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withFirstRecordAsHeader();
        org.apache.commons.csv.Assertions.notNull((java.lang.Object) cSVFormat19, "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false");
        java.lang.Character char23 = cSVFormat19.getQuoteCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean25 = cSVFormat24.isQuoteCharacterSet();
        boolean boolean26 = cSVFormat24.isCommentMarkerSet();
        boolean boolean27 = cSVFormat24.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat24.withEscape((java.lang.Character) '\b');
        boolean boolean30 = cSVFormat29.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withCommentMarker(' ');
        java.lang.Object[] objArray42 = new java.lang.Object[] { 0L, cSVFormat37, cSVFormat41 };
        java.lang.String str43 = cSVFormat34.format(objArray42);
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat52 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withCommentMarker(' ');
        java.lang.Object[] objArray55 = new java.lang.Object[] { 0L, cSVFormat50, cSVFormat54 };
        java.lang.String str56 = cSVFormat47.format(objArray55);
        java.lang.String str57 = cSVFormat34.format(objArray55);
        boolean boolean58 = cSVFormat29.equals((java.lang.Object) objArray55);
        java.lang.String str59 = cSVFormat19.format(objArray55);
        java.lang.String str60 = cSVFormat12.format(objArray55);
        java.lang.String str61 = cSVFormat1.format(objArray55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat7 and cSVFormat12", cSVFormat7.equals(cSVFormat12) ? cSVFormat7.hashCode() == cSVFormat12.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 0L, cSVFormat14, cSVFormat18 };
        java.lang.String str20 = cSVFormat11.format(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withCommentMarker(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0L, cSVFormat27, cSVFormat31 };
        java.lang.String str33 = cSVFormat24.format(objArray32);
        java.lang.String str34 = cSVFormat11.format(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode35 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat11.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat7.withQuoteMode(quoteMode35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat7.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat7.withAllowMissingColumnNames(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat39", cSVFormat1.equals(cSVFormat39) ? cSVFormat1.hashCode() == cSVFormat39.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean3 = cSVFormat1.getTrim();
        java.lang.Appendable appendable4 = null;
        cSVFormat1.println(appendable4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreHeaderCase();
        java.lang.String str11 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withQuote((java.lang.Character) '\b');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat10", cSVFormat1.equals(cSVFormat10) ? cSVFormat1.hashCode() == cSVFormat10.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        java.lang.String[] strArray3 = cSVFormat2.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreHeaderCase(false);
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat2", cSVFormat0.equals(cSVFormat2) ? cSVFormat0.hashCode() == cSVFormat2.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreSurroundingSpaces(false);
        java.lang.Character char12 = cSVFormat11.getEscapeCharacter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat3 and cSVFormat7", cSVFormat3.equals(cSVFormat7) ? cSVFormat3.hashCode() == cSVFormat7.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat11.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withCommentMarker('\b');
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withEscape(' ');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char24 = cSVFormat23.getCommentMarker();
        boolean boolean25 = cSVFormat23.isNullStringSet();
        java.lang.String str26 = cSVFormat23.getNullString();
        boolean boolean27 = cSVFormat23.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray29 = cSVFormat28.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withQuote('\f');
        java.lang.String[] strArray35 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat31.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat23.withHeader(strArray35);
        java.lang.String str38 = cSVFormat21.format((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat9.withHeader(strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat9.withNullString("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean43 = cSVFormat42.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat42.withIgnoreEmptyLines(true);
        org.apache.commons.csv.QuoteMode quoteMode46 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat9.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat49 = cSVFormat7.withQuoteMode(quoteMode46);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat7.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat5 and cSVFormat49", cSVFormat5.equals(cSVFormat49) ? cSVFormat5.hashCode() == cSVFormat49.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        boolean boolean4 = cSVFormat1.isQuoteCharacterSet();
        java.lang.String str5 = cSVFormat1.getNullString();
        boolean boolean6 = cSVFormat1.isEscapeCharacterSet();
        boolean boolean7 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("Delimiter=<a> SkipHeaderRecord:false");
        char char10 = cSVFormat1.getDelimiter();
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withIgnoreHeaderCase(true);
        boolean boolean15 = cSVFormat12.isQuoteCharacterSet();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat14", cSVFormat1.equals(cSVFormat14) ? cSVFormat1.hashCode() == cSVFormat14.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        java.lang.Class<?> wildcardClass7 = cSVFormat5.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat6", cSVFormat0.equals(cSVFormat6) ? cSVFormat0.hashCode() == cSVFormat6.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(strArray1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withRecordSeparator(',');
        boolean boolean7 = cSVFormat6.getTrailingDelimiter();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat0 and cSVFormat4", cSVFormat0.equals(cSVFormat4) ? cSVFormat0.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        boolean boolean5 = cSVFormat4.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat1 and cSVFormat4", cSVFormat1.equals(cSVFormat4) ? cSVFormat1.hashCode() == cSVFormat4.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withCommentMarker(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator('\n');
        boolean boolean13 = cSVFormat8.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withFirstRecordAsHeader();
        boolean boolean18 = cSVFormat16.getTrim();
        java.lang.Appendable appendable19 = null;
        cSVFormat16.println(appendable19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat16.withRecordSeparator("\u2029");
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.newFormat('a');
        java.lang.Character char25 = cSVFormat24.getCommentMarker();
        boolean boolean26 = cSVFormat24.isNullStringSet();
        java.lang.String str27 = cSVFormat24.getNullString();
        boolean boolean28 = cSVFormat24.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String[] strArray30 = cSVFormat29.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuote('\f');
        java.lang.String[] strArray36 = new java.lang.String[] { "\u2029", "0aDelimiter=<a> SkipHeaderRecord:falseaDelimiter=<a> CommentStart=< > SkipHeaderRecord:false", "\205" };
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat24.withHeader(strArray36);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat22.withHeaderComments((java.lang.Object[]) strArray36);
        java.lang.String str40 = cSVFormat14.format((java.lang.Object[]) strArray36);
        boolean boolean41 = cSVFormat14.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat14.withTrailingDelimiter(false);
        boolean boolean44 = cSVFormat43.getSkipHeaderRecord();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on cSVFormat6 and cSVFormat14", cSVFormat6.equals(cSVFormat14) ? cSVFormat6.hashCode() == cSVFormat14.hashCode() : true);
    }
}

