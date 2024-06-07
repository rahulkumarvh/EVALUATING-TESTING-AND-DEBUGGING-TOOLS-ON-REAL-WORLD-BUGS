package org.apache.commons.csv;

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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char1 = cSVFormat0.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentStart((java.lang.Character) '\f');
        java.lang.String str4 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentStart((java.lang.Character) '\\');
        java.lang.Character char7 = cSVFormat0.getEscape();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withCommentStart((java.lang.Character) '\037');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.DEFAULT;
        java.lang.Character char14 = cSVFormat13.getCommentStart();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withCommentStart((java.lang.Character) '\f');
        org.apache.commons.csv.Quote quote17 = org.apache.commons.csv.Quote.ALL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withQuotePolicy(quote17);
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("\205", cSVFormat13);
        org.apache.commons.csv.CSVRecord cSVRecord20 = cSVParser19.nextRecord();
        boolean boolean22 = cSVRecord20.isMapped("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<#> EmptyLines:ignored SkipHeaderRecord:false");
        boolean boolean23 = cSVFormat9.equals((java.lang.Object) cSVRecord20);
        java.util.Spliterator<java.lang.String> strSpliterator24 = cSVRecord20.spliterator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.String> strMap25 = cSVRecord20.toMap();
    }
}

