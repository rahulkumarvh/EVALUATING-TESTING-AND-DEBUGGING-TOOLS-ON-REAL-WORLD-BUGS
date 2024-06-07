package org.apache.commons.collections4;

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
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        java.lang.String str16 = strItor4.previous();
        int int17 = strItor4.previousIndex();
        java.lang.String str18 = strItor4.previous();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        int int2 = listIterator0.previousIndex();
        boolean boolean3 = listIterator0.hasNext();
        int int4 = listIterator0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor5);
        int int7 = strItor5.nextIndex();
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        // The following exception was thrown during execution in test generation
        try {
            strItor5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strItor5);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.String>>[]) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) iteratorArray1, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(iteratorItorItor5);
        org.junit.Assert.assertNotNull(strItorItor6);
        org.junit.Assert.assertNotNull(charSequenceItor7);
        org.junit.Assert.assertNotNull(objItor10);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int18 = strComparableComparator15.compare("hi!", "hi!");
        java.lang.String str19 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        int int22 = strComparableComparator15.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator24 = strComparableComparator15.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.util.Comparator<java.lang.String> strComparator25 = strComparableComparator12.thenComparing(strComparator24);
        java.util.Comparator<java.lang.String> strComparator26 = strComparableComparator10.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.Class<?> wildcardClass27 = strComparator26.getClass();
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor28 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass27);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertNotNull(strComparator24);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertNotNull(strComparator26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(annotatedElementItor28);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.collections4.MapIterator mapIterator0 = org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean3 = iteratorItor2.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator4 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.MapIterator[] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[] { mapIterator0, iteratorItor1, iteratorItor2, orderedMapIterator4 };
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorArray5, 0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(mapIteratorArray5);
        org.junit.Assert.assertNotNull(mapIterator0);
        org.junit.Assert.assertNotNull(iteratorItor1);
        org.junit.Assert.assertNotNull(iteratorItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
        org.junit.Assert.assertNotNull(mapIteratorItor7);
        org.junit.Assert.assertNotNull(mapIteratorItor8);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.List[][][] listArray1 = new java.util.List[0][][];
        @SuppressWarnings("unchecked")
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][] wildcardItorListArray2 = (java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]) listArray1;
        org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]> wildcardItorListArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardItorListArray2);
        org.junit.Assert.assertNotNull(listArray1);
        org.junit.Assert.assertNotNull(wildcardItorListArray2);
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor3);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.RandomAccess> randomAccessItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator2 = typeItor0.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor4 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardComparator2);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorItor4);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence[]> charSequenceArrayItor6 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(charSequenceArrayItor6);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor0);
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList4 = typeItor0.getIterators();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type5 = typeItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNotNull(wildcardItorList4);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.nextIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator[], java.lang.Cloneable> iteratorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(iteratorArrayItor0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        boolean boolean9 = strItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: must call next() or previous() before a call to set()");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.util.Comparator<java.lang.String> strComparator9 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.lang.String str10 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Iterable[]> iterableArrayItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparator11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strComparator11);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        org.apache.commons.collections4.ResettableIterator resettableIterator1 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor2 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = charSequenceItorReverseComparator0.compare((org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>) resettableIterator1, charSequenceItor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.iterators.EmptyIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIterator1);
        org.junit.Assert.assertNotNull(charSequenceItor2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("hi!");
        boolean boolean2 = strItor1.hasPrevious();
        int int3 = strItor1.nextIndex();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        boolean boolean6 = strItor0.hasNext();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.collections4.OrderedIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(wildcardItorCollectionItor0);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray5);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[][]> typeArrayItor7 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeArray5);
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArrayItor6);
        org.junit.Assert.assertNotNull(typeArrayItor7);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int12 = strItor11.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor11.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasPrevious();
        int int9 = strItor4.previousIndex();
        boolean boolean10 = strItor4.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator10 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type> typeItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparator10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparator10);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        boolean boolean3 = listIterator0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strItor4);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int9 = strItor4.nextIndex();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strItor10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.util.Comparator comparator0 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator1 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) comparator0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor4 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) comparator0, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator0);
        org.junit.Assert.assertNotNull(strComparator1);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(annotatedElementItor5);
        org.junit.Assert.assertNotNull(strComparableItor6);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasNext();
        boolean boolean5 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        boolean boolean2 = typeItor0.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor0);
        // The following exception was thrown during execution in test generation
        try {
            typeItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No value can be removed at present");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(typeItorItor3);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        boolean boolean10 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int12 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            strItor7.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: must call next() or previous() before a call to set()");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.collections4.ResettableIterator resettableIterator0 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator1 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray3 = new org.apache.commons.collections4.ResettableIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[] charSequenceItorArray4 = (org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]) resettableIteratorArray3;
        charSequenceItorArray4[0] = resettableIterator0;
        charSequenceItorArray4[1] = resettableIterator1;
        org.apache.commons.collections4.ResettableIterator resettableIterator9 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator10 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray12 = new org.apache.commons.collections4.ResettableIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[] charSequenceItorArray13 = (org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]) resettableIteratorArray12;
        charSequenceItorArray13[0] = resettableIterator9;
        charSequenceItorArray13[1] = resettableIterator10;
        org.apache.commons.collections4.ResettableIterator resettableIterator18 = org.apache.commons.collections4.IteratorUtils.EMPTY_ITERATOR;
        org.apache.commons.collections4.ResettableIterator resettableIterator19 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray21 = new org.apache.commons.collections4.ResettableIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[] charSequenceItorArray22 = (org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]) resettableIteratorArray21;
        charSequenceItorArray22[0] = resettableIterator18;
        charSequenceItorArray22[1] = resettableIterator19;
        org.apache.commons.collections4.ResettableIterator[][] resettableIteratorArray28 = new org.apache.commons.collections4.ResettableIterator[3][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[][] charSequenceItorArray29 = (org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[][]) resettableIteratorArray28;
        charSequenceItorArray29[0] = charSequenceItorArray4;
        charSequenceItorArray29[1] = charSequenceItorArray13;
        charSequenceItorArray29[2] = charSequenceItorArray22;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray29, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(resettableIterator0);
        org.junit.Assert.assertNotNull(resettableIterator1);
        org.junit.Assert.assertNotNull(resettableIteratorArray3);
        org.junit.Assert.assertNotNull(charSequenceItorArray4);
        org.junit.Assert.assertNotNull(resettableIterator9);
        org.junit.Assert.assertNotNull(resettableIterator10);
        org.junit.Assert.assertNotNull(resettableIteratorArray12);
        org.junit.Assert.assertNotNull(charSequenceItorArray13);
        org.junit.Assert.assertNotNull(resettableIterator18);
        org.junit.Assert.assertNotNull(resettableIterator19);
        org.junit.Assert.assertNotNull(resettableIteratorArray21);
        org.junit.Assert.assertNotNull(charSequenceItorArray22);
        org.junit.Assert.assertNotNull(resettableIteratorArray28);
        org.junit.Assert.assertNotNull(charSequenceItorArray29);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        boolean boolean2 = typeItor0.hasNext();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator(typeItor0);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator4 = typeItor0.getComparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type5 = typeItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNull(wildcardComparator4);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.collections4.OrderedMapIterator<java.util.ListIterator<java.lang.String>[], org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> strItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(strItorArrayItor0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int18 = strComparableComparator15.compare("hi!", "hi!");
        java.lang.String str19 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        int int22 = strComparableComparator15.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator23 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator24 = strComparableComparator15.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator23);
        java.util.Comparator<java.lang.String> strComparator25 = strComparableComparator12.thenComparing(strComparator24);
        java.util.Comparator<java.lang.String> strComparator26 = strComparableComparator10.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.Class<?> wildcardClass27 = strComparator26.getClass();
        java.lang.Class[] classArray29 = new java.lang.Class[1];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray30 = (java.lang.Class<?>[]) classArray29;
        wildcardClassArray30[0] = wildcardClass27;
        java.lang.Class[][] classArray34 = new java.lang.Class[1][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray35 = (java.lang.Class<?>[][]) classArray34;
        wildcardClassArray35[0] = wildcardClassArray30;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray35);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator23);
        org.junit.Assert.assertNotNull(strComparator24);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertNotNull(strComparator26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertNotNull(wildcardClassArray30);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertNotNull(wildcardClassArray35);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor38);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int3 = strComparableComparator0.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.util.Comparator<java.lang.String> strComparator17 = strComparableComparator4.thenComparing(strComparator16);
        boolean boolean18 = strComparableComparator0.equals((java.lang.Object) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator21.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator29);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator21);
        int int34 = strComparableComparator21.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator21);
        java.util.Comparator<java.lang.String> strComparator36 = strComparator35.reversed();
        java.util.Comparator<java.lang.String> strComparator37 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator36);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3) + "'", int34 == (-3));
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(strComparator36);
        org.junit.Assert.assertNotNull(strComparator37);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        java.util.ListIterator[] listIteratorArray15 = new java.util.ListIterator[1];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray16 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray15;
        strItorArray16[0] = strItor4;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray22);
        boolean boolean24 = strItor23.hasPrevious();
        boolean boolean25 = strItor23.hasNext();
        int int26 = strItor23.previousIndex();
        java.lang.String str27 = strItor23.next();
        strItor23.set("hi!");
        strItor23.set("");
        java.lang.String str32 = strItor23.next();
        java.util.ListIterator[] listIteratorArray34 = new java.util.ListIterator[1];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray35 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray34;
        strItorArray35[0] = strItor23;
        java.lang.String[] strArray41 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor42 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray41);
        boolean boolean43 = strItor42.hasPrevious();
        boolean boolean44 = strItor42.hasNext();
        int int45 = strItor42.previousIndex();
        java.lang.String str46 = strItor42.next();
        strItor42.set("hi!");
        strItor42.set("");
        java.lang.String str51 = strItor42.next();
        java.util.ListIterator[] listIteratorArray53 = new java.util.ListIterator[1];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray54 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray53;
        strItorArray54[0] = strItor42;
        java.lang.String[] strArray60 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor61 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray60);
        boolean boolean62 = strItor61.hasPrevious();
        boolean boolean63 = strItor61.hasNext();
        int int64 = strItor61.previousIndex();
        java.lang.String str65 = strItor61.next();
        strItor61.set("hi!");
        strItor61.set("");
        java.lang.String str70 = strItor61.next();
        java.util.ListIterator[] listIteratorArray72 = new java.util.ListIterator[1];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray73 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray72;
        strItorArray73[0] = strItor61;
        java.util.ListIterator[][] listIteratorArray77 = new java.util.ListIterator[4][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[][] strItorArray78 = (java.util.ListIterator<java.lang.String>[][]) listIteratorArray77;
        strItorArray78[0] = strItorArray16;
        strItorArray78[1] = strItorArray35;
        strItorArray78[2] = strItorArray54;
        strItorArray78[3] = strItorArray73;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>[]> strItorArrayItor89 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray78, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(listIteratorArray15);
        org.junit.Assert.assertNotNull(strItorArray16);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(listIteratorArray34);
        org.junit.Assert.assertNotNull(strItorArray35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strItor42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(listIteratorArray53);
        org.junit.Assert.assertNotNull(strItorArray54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strItor61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(listIteratorArray72);
        org.junit.Assert.assertNotNull(strItorArray73);
        org.junit.Assert.assertNotNull(listIteratorArray77);
        org.junit.Assert.assertNotNull(strItorArray78);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.collections4.ResettableListIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[][]> wildcardItorCollectionArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(wildcardItorCollectionArrayItor0);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        int int11 = strComparableComparator4.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        int int16 = strComparableComparator12.compare("hi!", "hi!");
        int int19 = strComparableComparator12.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator20 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.String str21 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator22 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean24 = charSequenceItorReverseComparator22.equals((java.lang.Object) 100.0f);
        boolean boolean25 = strComparableComparator12.equals((java.lang.Object) charSequenceItorReverseComparator22);
        int int28 = strComparableComparator12.compare("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor30 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableComparator12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorItor0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator3 = iteratorItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(iteratorItorItor2);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.collections4.OrderedIterator<java.lang.Cloneable> cloneableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        java.util.Iterator<?> wildcardItor1 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) cloneableItor0);
        org.junit.Assert.assertNotNull(cloneableItor0);
        org.junit.Assert.assertNotNull(wildcardItor1);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: must call next() or previous() before a call to set()");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceItorReverseComparator0.equals(obj3);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator0);
        org.apache.commons.collections4.ResettableIterator resettableIterator6 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        resettableIterator6.reset();
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = charSequenceItorReverseComparator0.compare((org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>) resettableIterator6, charSequenceItor8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.iterators.EmptyIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor5);
        org.junit.Assert.assertNotNull(resettableIterator6);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int4 = strItor3.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            strItor3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.nextIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        java.lang.String str14 = strItor4.next();
        boolean boolean15 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ArrayList<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorListItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItor1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[], org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strComparableComparatorArrayItor0);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.util.Comparator comparator2 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator3 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) comparator2);
        java.lang.String str4 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) comparator2);
        java.util.Comparator<java.lang.String> strComparator5 = comparator2.reversed();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.ListIterator<java.lang.String>> strItorItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) comparator2, (-3), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator2);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strComparator5);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        boolean boolean12 = strComparableComparator0.equals((java.lang.Object) strComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator14 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int17 = strComparableComparator14.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator21.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator29);
        java.util.Comparator<java.lang.String> strComparator31 = strComparableComparator18.thenComparing(strComparator30);
        boolean boolean32 = strComparableComparator14.equals((java.lang.Object) strComparableComparator18);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator35 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int38 = strComparableComparator35.compare("hi!", "hi!");
        java.lang.String str39 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator35);
        int int42 = strComparableComparator35.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator43 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator44 = strComparableComparator35.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator43);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor45 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator35);
        int int48 = strComparableComparator35.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator49 = strComparableComparator18.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator35);
        java.util.Comparator<java.lang.String> strComparator50 = strComparator13.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator35);
        java.util.Comparator<java.lang.String> strComparator51 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator50);
        java.util.Comparator<java.lang.String> strComparator52 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator51);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparableComparator14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strComparableComparator35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator43);
        org.junit.Assert.assertNotNull(strComparator44);
        org.junit.Assert.assertNotNull(objItor45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-3) + "'", int48 == (-3));
        org.junit.Assert.assertNotNull(strComparator49);
        org.junit.Assert.assertNotNull(strComparator50);
        org.junit.Assert.assertNotNull(strComparator51);
        org.junit.Assert.assertNotNull(strComparator52);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor1 = org.apache.commons.collections4.IteratorUtils.singletonIterator(iteratorItor0);
        boolean boolean2 = iteratorItor0.hasPrevious();
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertNotNull(iteratorItorItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.collections4.comparators.ReverseComparator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<java.lang.reflect.GenericDeclaration[][]>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationArrayReverseComparator0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Iterable[]> iterableArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClass1, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int4 = strItor0.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray6 = new org.apache.commons.collections4.iterators.ZippingIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray7 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray6;
        charSequenceArrayItorArray7[0] = charSequenceArrayItor4;
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray12 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11;
        java.util.Iterator<java.lang.String[]> strArrayItor13 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor14 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray11);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray16 = new org.apache.commons.collections4.iterators.ZippingIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray17 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray16;
        charSequenceArrayItorArray17[0] = charSequenceArrayItor14;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray21 = new org.apache.commons.collections4.iterators.ZippingIterator[2][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][] charSequenceArrayItorArray22 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]) zippingIteratorArray21;
        charSequenceArrayItorArray22[0] = charSequenceArrayItorArray7;
        charSequenceArrayItorArray22[1] = charSequenceArrayItorArray17;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArrayItorArray22, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(zippingIteratorArray6);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray7);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(wildcardItorArray12);
        org.junit.Assert.assertNotNull(strArrayItor13);
        org.junit.Assert.assertNotNull(charSequenceArrayItor14);
        org.junit.Assert.assertNotNull(zippingIteratorArray16);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray17);
        org.junit.Assert.assertNotNull(zippingIteratorArray21);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray22);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasNext();
        boolean boolean5 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) boolean5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        java.util.Iterator[] iteratorArray6 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray7 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6;
        java.util.Iterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray6);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor10 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItor9);
        java.util.Iterator[] iteratorArray12 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray13 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray12;
        java.util.Iterator<java.lang.String[]> strArrayItor14 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray12);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor15 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray12);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor16 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItor15);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray18 = new org.apache.commons.collections4.iterators.ZippingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray19 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray18;
        charSequenceArrayItorArray19[0] = charSequenceArrayItor4;
        charSequenceArrayItorArray19[1] = charSequenceArrayItor9;
        charSequenceArrayItorArray19[2] = charSequenceArrayItor15;
        java.util.Iterator[] iteratorArray27 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray28 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray27;
        java.util.Iterator<java.lang.String[]> strArrayItor29 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray27);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor30 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray27);
        java.util.Iterator[] iteratorArray32 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray33 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray32;
        java.util.Iterator<java.lang.String[]> strArrayItor34 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray32);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor35 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray32);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor36 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItor35);
        java.util.Iterator[] iteratorArray38 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray39 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray38;
        java.util.Iterator<java.lang.String[]> strArrayItor40 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray38);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor41 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray38);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor42 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceArrayItor41);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray44 = new org.apache.commons.collections4.iterators.ZippingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray45 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray44;
        charSequenceArrayItorArray45[0] = charSequenceArrayItor30;
        charSequenceArrayItorArray45[1] = charSequenceArrayItor35;
        charSequenceArrayItorArray45[2] = charSequenceArrayItor41;
        org.apache.commons.collections4.iterators.ZippingIterator[][] zippingIteratorArray53 = new org.apache.commons.collections4.iterators.ZippingIterator[2][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][] charSequenceArrayItorArray54 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]) zippingIteratorArray53;
        charSequenceArrayItorArray54[0] = charSequenceArrayItorArray19;
        charSequenceArrayItorArray54[1] = charSequenceArrayItorArray45;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor60 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceArrayItorArray54, (int) (byte) 1);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][]> charSequenceArrayItorArrayItor61 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItorArray54);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(iteratorArray6);
        org.junit.Assert.assertNotNull(wildcardItorArray7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceArrayItor9);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor10);
        org.junit.Assert.assertNotNull(iteratorArray12);
        org.junit.Assert.assertNotNull(wildcardItorArray13);
        org.junit.Assert.assertNotNull(strArrayItor14);
        org.junit.Assert.assertNotNull(charSequenceArrayItor15);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor16);
        org.junit.Assert.assertNotNull(zippingIteratorArray18);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray19);
        org.junit.Assert.assertNotNull(iteratorArray27);
        org.junit.Assert.assertNotNull(wildcardItorArray28);
        org.junit.Assert.assertNotNull(strArrayItor29);
        org.junit.Assert.assertNotNull(charSequenceArrayItor30);
        org.junit.Assert.assertNotNull(iteratorArray32);
        org.junit.Assert.assertNotNull(wildcardItorArray33);
        org.junit.Assert.assertNotNull(strArrayItor34);
        org.junit.Assert.assertNotNull(charSequenceArrayItor35);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor36);
        org.junit.Assert.assertNotNull(iteratorArray38);
        org.junit.Assert.assertNotNull(wildcardItorArray39);
        org.junit.Assert.assertNotNull(strArrayItor40);
        org.junit.Assert.assertNotNull(charSequenceArrayItor41);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor42);
        org.junit.Assert.assertNotNull(zippingIteratorArray44);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray45);
        org.junit.Assert.assertNotNull(zippingIteratorArray53);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray54);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor60);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor61);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(strArrayItor0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        boolean boolean2 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList3 = typeItor0.getIterators();
        java.util.ListIterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorIterableItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>) wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardItorList3);
        org.junit.Assert.assertNotNull(wildcardItorIterableItor4);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(obj0, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass7);
        java.lang.Class<?> wildcardClass9 = wildcardClassItor8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]> charSequenceItorArrayItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) wildcardClassItor8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.collections4.OrderedMapIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][], java.lang.reflect.Type[][]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor0);
        boolean boolean4 = strItor0.hasNext();
        boolean boolean5 = strItor0.hasPrevious();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor8 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.CharSequence[]) strArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        boolean boolean9 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean11 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        java.lang.Class<?> wildcardClass3 = strItor0.getClass();
        java.util.ListIterator listIterator4 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int5 = listIterator4.nextIndex();
        boolean boolean6 = listIterator4.hasNext();
        boolean boolean7 = listIterator4.hasNext();
        java.lang.Class<?> wildcardClass8 = listIterator4.getClass();
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] { wildcardClass3, wildcardClass8 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean11 = strItor10.hasNext();
        boolean boolean12 = strItor10.hasPrevious();
        java.lang.Class<?> wildcardClass13 = strItor10.getClass();
        java.util.ListIterator listIterator14 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int15 = listIterator14.nextIndex();
        boolean boolean16 = listIterator14.hasNext();
        boolean boolean17 = listIterator14.hasNext();
        java.lang.Class<?> wildcardClass18 = listIterator14.getClass();
        java.lang.reflect.Type[] typeArray19 = new java.lang.reflect.Type[] { wildcardClass13, wildcardClass18 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean21 = strItor20.hasNext();
        boolean boolean22 = strItor20.hasPrevious();
        java.lang.Class<?> wildcardClass23 = strItor20.getClass();
        java.util.ListIterator listIterator24 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int25 = listIterator24.nextIndex();
        boolean boolean26 = listIterator24.hasNext();
        boolean boolean27 = listIterator24.hasNext();
        java.lang.Class<?> wildcardClass28 = listIterator24.getClass();
        java.lang.reflect.Type[] typeArray29 = new java.lang.reflect.Type[] { wildcardClass23, wildcardClass28 };
        java.lang.reflect.Type[][] typeArray30 = new java.lang.reflect.Type[][] { typeArray9, typeArray19, typeArray29 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor33 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray30, 3, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(listIterator24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator0 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray2 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator0, charSequenceArrayItor1 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator3 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator3, charSequenceArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator6 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray8 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator6, charSequenceArrayItor7 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator9 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray11 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator9, charSequenceArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator12 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray14 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator12, charSequenceArrayItor13 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator15 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray17 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator15, charSequenceArrayItor16 };
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray18 = new org.apache.commons.collections4.MapIterator[][] { mapIteratorArray2, mapIteratorArray5, mapIteratorArray8, mapIteratorArray11, mapIteratorArray14, mapIteratorArray17 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray18);
        java.util.Iterator<?> wildcardItor20 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) mapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(orderedMapIterator0);
        org.junit.Assert.assertNotNull(charSequenceArrayItor1);
        org.junit.Assert.assertNotNull(mapIteratorArray2);
        org.junit.Assert.assertNotNull(orderedMapIterator3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
        org.junit.Assert.assertNotNull(orderedMapIterator6);
        org.junit.Assert.assertNotNull(charSequenceArrayItor7);
        org.junit.Assert.assertNotNull(mapIteratorArray8);
        org.junit.Assert.assertNotNull(orderedMapIterator9);
        org.junit.Assert.assertNotNull(charSequenceArrayItor10);
        org.junit.Assert.assertNotNull(mapIteratorArray11);
        org.junit.Assert.assertNotNull(orderedMapIterator12);
        org.junit.Assert.assertNotNull(charSequenceArrayItor13);
        org.junit.Assert.assertNotNull(mapIteratorArray14);
        org.junit.Assert.assertNotNull(orderedMapIterator15);
        org.junit.Assert.assertNotNull(charSequenceArrayItor16);
        org.junit.Assert.assertNotNull(mapIteratorArray17);
        org.junit.Assert.assertNotNull(mapIteratorArray18);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(wildcardItor20);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.Comparator<java.lang.String> strComparator0 = null;
        java.util.Comparator<java.lang.String> strComparator1 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator0);
        java.util.Comparator<java.lang.String> strComparator2 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator0);
        java.util.Comparator<java.lang.String> strComparator3 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator2);
        java.util.Comparator<java.lang.String> strComparator4 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator(strComparator3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparator4, 3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparator1);
        org.junit.Assert.assertNotNull(strComparator2);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[][] charSequenceArrayItorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArrayItorArray0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.collections4.MapIterator<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        int int6 = strItor0.previousIndex();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int8 = strItor7.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strItor7.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        charSequenceItor5.reset();
        charSequenceItor5.reset();
        charSequenceItor5.reset();
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        boolean boolean5 = strItor0.hasNext();
        boolean boolean6 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<?> wildcardItor2 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) "");
        org.junit.Assert.assertNotNull(strComparableItor1);
        org.junit.Assert.assertNotNull(wildcardItor2);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        boolean boolean18 = charSequenceItorReverseComparator0.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray23);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray23);
        java.lang.Class<?> wildcardClass26 = objItor25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray27);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray27, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray27);
        boolean boolean33 = charSequenceItorReverseComparator0.equals((java.lang.Object) genericDeclarationArray27);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor34 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean35 = typeItor34.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator36 = typeItor34.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList37 = typeItor34.getIterators();
        boolean boolean38 = charSequenceItorReverseComparator0.equals((java.lang.Object) typeItor34);
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator39 = typeItor34.getComparator();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = typeItor34.getIteratorIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No value has been returned yet");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceItor24);
        org.junit.Assert.assertNotNull(objItor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(genericDeclarationItor28);
        org.junit.Assert.assertNotNull(genericDeclarationItor31);
        org.junit.Assert.assertNotNull(objItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(wildcardComparator36);
        org.junit.Assert.assertNotNull(wildcardItorList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(wildcardComparator39);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.String[]> strArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        boolean boolean10 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean12 = strItor11.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.reflect.Type, org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]> typeItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(typeItor0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor0);
        boolean boolean4 = strItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.AbstractList<java.util.Iterator<? extends java.lang.reflect.Type>>> charSequenceArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(charSequenceArrayItor0);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.lang.String str9 = strItor4.previous();
        int int10 = strItor4.previousIndex();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        int int12 = strItor11.nextIndex();
        java.util.ListIterator<java.lang.String> strItor13 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(strItor11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strItor13);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.ResettableListIterator<java.lang.String>>[]) iteratorArray1);
        java.util.Iterator<java.lang.CharSequence> charSequenceItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.CharSequence>[]) iteratorArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[][][]> mapIteratorArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) iteratorArray1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Attempt to make an ArrayIterator that starts before the start of the array. ");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(iteratorItorItor5);
        org.junit.Assert.assertNotNull(strItorItor6);
        org.junit.Assert.assertNotNull(charSequenceItor7);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray1);
        java.util.Iterator[] iteratorArray6 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray7 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6;
        java.util.Iterator<java.lang.String[]> strArrayItor8 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray6);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor9 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray6);
        java.util.Iterator[] iteratorArray11 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray12 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11;
        java.util.Iterator<java.lang.String[]> strArrayItor13 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray11);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor14 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray11);
        java.util.Iterator[] iteratorArray16 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray17 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray16;
        java.util.Iterator<java.lang.String[]> strArrayItor18 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray16);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor19 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray16);
        java.util.Iterator[] iteratorArray21 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray22 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray21;
        java.util.Iterator<java.lang.String[]> strArrayItor23 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray21);
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]> charSequenceArrayItor24 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.lang.CharSequence[]>[]) iteratorArray21);
        org.apache.commons.collections4.iterators.ZippingIterator[] zippingIteratorArray26 = new org.apache.commons.collections4.iterators.ZippingIterator[5];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[] charSequenceArrayItorArray27 = (org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]) zippingIteratorArray26;
        charSequenceArrayItorArray27[0] = charSequenceArrayItor4;
        charSequenceArrayItorArray27[1] = charSequenceArrayItor9;
        charSequenceArrayItorArray27[2] = charSequenceArrayItor14;
        charSequenceArrayItorArray27[3] = charSequenceArrayItor19;
        charSequenceArrayItorArray27[4] = charSequenceArrayItor24;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor38 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArrayItorArray27);
        java.util.ListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor39 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceArrayItorArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor42 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArrayItorArray27, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(iteratorArray6);
        org.junit.Assert.assertNotNull(wildcardItorArray7);
        org.junit.Assert.assertNotNull(strArrayItor8);
        org.junit.Assert.assertNotNull(charSequenceArrayItor9);
        org.junit.Assert.assertNotNull(iteratorArray11);
        org.junit.Assert.assertNotNull(wildcardItorArray12);
        org.junit.Assert.assertNotNull(strArrayItor13);
        org.junit.Assert.assertNotNull(charSequenceArrayItor14);
        org.junit.Assert.assertNotNull(iteratorArray16);
        org.junit.Assert.assertNotNull(wildcardItorArray17);
        org.junit.Assert.assertNotNull(strArrayItor18);
        org.junit.Assert.assertNotNull(charSequenceArrayItor19);
        org.junit.Assert.assertNotNull(iteratorArray21);
        org.junit.Assert.assertNotNull(wildcardItorArray22);
        org.junit.Assert.assertNotNull(strArrayItor23);
        org.junit.Assert.assertNotNull(charSequenceArrayItor24);
        org.junit.Assert.assertNotNull(zippingIteratorArray26);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArray27);
        org.junit.Assert.assertNotNull(charSequenceArrayItorItor38);
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor39);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.collections4.ResettableListIterator<java.lang.Cloneable> cloneableItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(cloneableItor0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.collections4.comparators.ComparableComparator[][] comparableComparatorArray1 = new org.apache.commons.collections4.comparators.ComparableComparator[0][];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[][] strComparableComparatorArray2 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[][]) comparableComparatorArray1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]> strComparableComparatorArrayItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray2, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparableComparatorArray1);
        org.junit.Assert.assertNotNull(strComparableComparatorArray2);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strItor7);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor8 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(serializableItor8);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.io.Serializable> serializableItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableComparatorItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparatorItor0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray8 = new org.apache.commons.collections4.comparators.ComparableComparator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray9 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray8;
        strComparableComparatorArray9[0] = strComparableComparator2;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray9);
        org.apache.commons.collections4.ResettableIterator<java.util.Comparator<java.lang.String>> strComparatorItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Comparator<java.lang.String>[]) strComparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(comparableComparatorArray8);
        org.junit.Assert.assertNotNull(strComparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparatorItor12);
        org.junit.Assert.assertNotNull(strComparatorItor13);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator11 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        boolean boolean12 = strComparableComparator0.equals((java.lang.Object) strComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator0);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator16 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int19 = strComparableComparator16.compare("hi!", "hi!");
        java.lang.String str20 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator16);
        int int23 = strComparableComparator16.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator24 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator25 = strComparableComparator16.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator24);
        int int28 = strComparableComparator16.compare("hi!", "hi!");
        int int31 = strComparableComparator16.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator32 = strComparableComparator0.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator16);
        java.util.Comparator comparator35 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.lang.String str36 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) comparator35);
        java.util.Comparator<java.lang.String> strComparator37 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) comparator35);
        java.util.Comparator<java.lang.String> strComparator38 = strComparableComparator0.thenComparing(strComparator37);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor39 = org.apache.commons.collections4.IteratorUtils.singletonIterator(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparableComparator16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator24);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertNotNull(comparator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertNotNull(strComparator38);
        org.junit.Assert.assertNotNull(strComparableComparatorItor39);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        java.lang.String str14 = strItor4.next();
        java.lang.String str15 = strItor4.previous();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.collections4.MapIterator<java.util.ArrayList<java.util.Iterator<? extends java.lang.reflect.Type>>[], java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][][]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(strComparableItor0);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        java.lang.String str9 = strItor4.next();
        java.lang.String str10 = strItor4.next();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        java.util.ListIterator<java.lang.String> strItor9 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        strItor4.set("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strItor9);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.util.Comparator<java.lang.String> strComparator9 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator11 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean12 = strComparableComparator10.equals((java.lang.Object) strComparableComparator11);
        java.util.Comparator<java.lang.String> strComparator13 = strComparator9.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator11);
        java.util.Comparator<java.lang.String> strComparator14 = strComparator13.reversed();
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", strComparator13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[]> wildcardItorListArrayItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) "", (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strComparator9);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.collections4.MapIterator<java.util.ListIterator<java.lang.String>, java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[]> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strItorItor0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray19);
        boolean boolean21 = strComparableComparator2.equals((java.lang.Object) strArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Comparable<java.lang.String>> strComparableItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Comparable<java.lang.String>[]) strArray19, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>, org.apache.commons.collections4.MapIterator> charSequenceItorReverseComparatorItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>, java.lang.reflect.AnnotatedElement> charSequenceItorReverseComparatorItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator mapIterator2 = org.apache.commons.collections4.iterators.EmptyMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>, java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.io.Serializable, org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> serializableItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor5 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean6 = iteratorItor5.hasPrevious();
        boolean boolean7 = iteratorItor5.hasPrevious();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray8 = new org.apache.commons.collections4.MapIterator[] { charSequenceItorReverseComparatorItor0, charSequenceItorReverseComparatorItor1, mapIterator2, typeItorItor3, serializableItor4, iteratorItor5 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray8, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor0);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor1);
        org.junit.Assert.assertNotNull(mapIterator2);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(iteratorItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mapIteratorArray8);
        org.junit.Assert.assertNotNull(mapIteratorItor10);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        java.lang.String str11 = strItor4.previous();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray1 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray2 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray3 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray4 = new java.lang.reflect.GenericDeclaration[] {};
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray5 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray0, genericDeclarationArray1, genericDeclarationArray2, genericDeclarationArray3, genericDeclarationArray4 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.Cloneable> cloneableItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Cloneable[]) genericDeclarationArray5, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertNotNull(genericDeclarationArray1);
        org.junit.Assert.assertNotNull(genericDeclarationArray2);
        org.junit.Assert.assertNotNull(genericDeclarationArray3);
        org.junit.Assert.assertNotNull(genericDeclarationArray4);
        org.junit.Assert.assertNotNull(genericDeclarationArray5);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor6);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator(charSequenceItorReverseComparator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor13);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        boolean boolean2 = iteratorItor0.hasPrevious();
        boolean boolean3 = iteratorItor0.hasPrevious();
        boolean boolean4 = iteratorItor0.hasPrevious();
        boolean boolean5 = iteratorItor0.hasPrevious();
        boolean boolean6 = iteratorItor0.hasPrevious();
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(mapIteratorItor0);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor5 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(strItor6);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.collections4.comparators.ReverseComparator<java.lang.CharSequence> charSequenceReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<java.lang.CharSequence>();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) charSequenceReverseComparator0, 4, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int3 = strComparableComparator0.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.util.Comparator<java.lang.String> strComparator17 = strComparableComparator4.thenComparing(strComparator16);
        boolean boolean18 = strComparableComparator0.equals((java.lang.Object) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator21.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator29);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator21);
        int int34 = strComparableComparator21.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator21);
        java.util.Comparator<java.lang.String> strComparator36 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator4);
        java.util.Comparator<java.lang.String> strComparator37 = strComparableComparator4.reversed();
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3) + "'", int34 == (-3));
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(strComparator36);
        org.junit.Assert.assertNotNull(strComparator37);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("hi!");
        int int2 = strItor1.nextIndex();
        int int3 = strItor1.previousIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strItor1.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasPrevious();
        boolean boolean8 = strItor4.hasPrevious();
        boolean boolean9 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean17 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator17 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator20 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int23 = strComparableComparator20.compare("hi!", "hi!");
        java.lang.String str24 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator20);
        int int27 = strComparableComparator20.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator28 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator20);
        boolean boolean29 = strComparableComparator17.equals((java.lang.Object) strComparator28);
        java.lang.String str30 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator17);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator33 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int36 = strComparableComparator33.compare("hi!", "hi!");
        java.lang.String str37 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator33);
        int int40 = strComparableComparator33.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator41 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator42 = strComparableComparator33.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator41);
        java.util.Comparator<java.lang.String> strComparator43 = strComparableComparator17.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator41);
        java.util.Comparator comparator44 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator45 = strComparableComparator41.thenComparing((java.util.Comparator<java.lang.String>) comparator44);
        java.lang.String str46 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator41);
        boolean boolean47 = charSequenceItorReverseComparator0.equals((java.lang.Object) str46);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator48 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator49 = new org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>();
        boolean boolean50 = strComparableComparator48.equals((java.lang.Object) strComparableComparator49);
        java.util.Comparator<java.lang.String> strComparator51 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator48);
        java.util.Comparator<java.lang.String> strComparator52 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator51);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator57 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator60 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int63 = strComparableComparator60.compare("hi!", "hi!");
        java.lang.String str64 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator60);
        int int67 = strComparableComparator60.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator68 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator60);
        boolean boolean69 = strComparableComparator57.equals((java.lang.Object) strComparator68);
        java.lang.String str70 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator57);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator73 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int76 = strComparableComparator73.compare("hi!", "hi!");
        java.lang.String str77 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator73);
        int int80 = strComparableComparator73.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator81 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator82 = strComparableComparator73.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator81);
        java.util.Comparator<java.lang.String> strComparator83 = strComparableComparator57.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator81);
        java.util.Comparator comparator84 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator<java.lang.String> strComparator85 = strComparableComparator81.thenComparing((java.util.Comparator<java.lang.String>) comparator84);
        java.lang.String str86 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) comparator84);
        java.util.Comparator<java.lang.String> strComparator87 = strComparator51.thenComparing((java.util.Comparator<java.lang.String>) comparator84);
        java.util.Comparator<java.lang.String> strComparator88 = org.apache.commons.collections4.ComparatorUtils.reversedComparator(strComparator51);
        boolean boolean89 = charSequenceItorReverseComparator0.equals((java.lang.Object) strComparator51);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor90 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableComparator17);
        org.junit.Assert.assertNotNull(strComparableComparator20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(strComparator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strComparableComparator33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator41);
        org.junit.Assert.assertNotNull(strComparator42);
        org.junit.Assert.assertNotNull(strComparator43);
        org.junit.Assert.assertNotNull(comparator44);
        org.junit.Assert.assertNotNull(strComparator45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strComparableComparator48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strComparator51);
        org.junit.Assert.assertNotNull(strComparator52);
        org.junit.Assert.assertNotNull(strComparableComparator57);
        org.junit.Assert.assertNotNull(strComparableComparator60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 3 + "'", int67 == 3);
        org.junit.Assert.assertNotNull(strComparator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(strComparableComparator73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator81);
        org.junit.Assert.assertNotNull(strComparator82);
        org.junit.Assert.assertNotNull(strComparator83);
        org.junit.Assert.assertNotNull(comparator84);
        org.junit.Assert.assertNotNull(strComparator85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(strComparator87);
        org.junit.Assert.assertNotNull(strComparator88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor90);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceItorReverseComparator0.equals(obj3);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator0);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray7 = new org.apache.commons.collections4.comparators.ComparableComparator[0];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray8 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray7;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray8, 0);
        boolean boolean11 = charSequenceItorReverseComparator0.equals((java.lang.Object) strComparableComparatorItor10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor5);
        org.junit.Assert.assertNotNull(comparableComparatorArray7);
        org.junit.Assert.assertNotNull(strComparableComparatorArray8);
        org.junit.Assert.assertNotNull(strComparableComparatorItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        java.lang.String str6 = strItor4.previous();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(annotatedElementItor0);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        int int6 = strItor4.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean7 = strItor0.hasNext();
        boolean boolean8 = strItor0.hasNext();
        boolean boolean9 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor12 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator2);
        int int15 = strComparableComparator2.compare("hi!", "hi!");
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        java.lang.Class<?> wildcardClass17 = strComparator16.getClass();
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        java.lang.String str9 = strItor4.next();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.Object obj3 = null;
        boolean boolean4 = charSequenceItorReverseComparator0.equals(obj3);
        java.util.ListIterator<org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>> charSequenceItorReverseComparatorItor5 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(charSequenceItorReverseComparator0);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator6 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator9 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int12 = strComparableComparator9.compare("hi!", "hi!");
        java.lang.String str13 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator9);
        int int16 = strComparableComparator9.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator17 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator9);
        boolean boolean18 = strComparableComparator6.equals((java.lang.Object) strComparator17);
        java.util.Comparator<java.lang.String> strComparator19 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator((java.util.Comparator<java.lang.String>) strComparableComparator6);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator20 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int23 = strComparableComparator20.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator24 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int30 = strComparableComparator27.compare("hi!", "hi!");
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        int int34 = strComparableComparator27.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator35 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator36 = strComparableComparator27.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator35);
        java.util.Comparator<java.lang.String> strComparator37 = strComparableComparator24.thenComparing(strComparator36);
        boolean boolean38 = strComparableComparator20.equals((java.lang.Object) strComparableComparator24);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator41 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int44 = strComparableComparator41.compare("hi!", "hi!");
        java.lang.String str45 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator41);
        int int48 = strComparableComparator41.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator49 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator50 = strComparableComparator41.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator49);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor51 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator41);
        int int54 = strComparableComparator41.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator55 = strComparableComparator24.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator41);
        java.util.Comparator<java.lang.String> strComparator56 = strComparator19.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator41);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator59 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator62 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int65 = strComparableComparator62.compare("hi!", "hi!");
        java.lang.String str66 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator62);
        int int69 = strComparableComparator62.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator70 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator62);
        boolean boolean71 = strComparableComparator59.equals((java.lang.Object) strComparator70);
        java.lang.String str72 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator59);
        java.lang.String[] strArray76 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor77 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray76);
        boolean boolean78 = strComparableComparator59.equals((java.lang.Object) strArray76);
        int int81 = strComparableComparator59.compare("", "");
        java.util.Comparator<java.lang.String> strComparator82 = strComparableComparator59.reversed();
        java.util.Comparator<java.lang.String> strComparator83 = strComparator56.thenComparing(strComparator82);
        boolean boolean84 = charSequenceItorReverseComparator0.equals((java.lang.Object) strComparator56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charSequenceItorReverseComparatorItor5);
        org.junit.Assert.assertNotNull(strComparableComparator6);
        org.junit.Assert.assertNotNull(strComparableComparator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparator19);
        org.junit.Assert.assertNotNull(strComparableComparator20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator24);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator35);
        org.junit.Assert.assertNotNull(strComparator36);
        org.junit.Assert.assertNotNull(strComparator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strComparableComparator41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator49);
        org.junit.Assert.assertNotNull(strComparator50);
        org.junit.Assert.assertNotNull(objItor51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-3) + "'", int54 == (-3));
        org.junit.Assert.assertNotNull(strComparator55);
        org.junit.Assert.assertNotNull(strComparator56);
        org.junit.Assert.assertNotNull(strComparableComparator59);
        org.junit.Assert.assertNotNull(strComparableComparator62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(strComparator70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strItor77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(strComparator82);
        org.junit.Assert.assertNotNull(strComparator83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strItor0.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: Iterator contains no elements");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.collections4.MapIterator<java.io.Serializable, java.lang.reflect.GenericDeclaration[][]> serializableItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(serializableItor0);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.collections4.MapIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>, java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[]> wildcardItorCollectionItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass1 = wildcardItorCollectionItor0.getClass();
        org.junit.Assert.assertNotNull(wildcardItorCollectionItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.previous();
        boolean boolean14 = strItor4.hasPrevious();
        int int15 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        boolean boolean6 = strItor0.hasPrevious();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.lang.Class[][] classArray1 = new java.lang.Class[0][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray2 = (java.lang.Class<?>[][]) classArray1;
        org.apache.commons.collections4.ResettableListIterator<java.lang.Class<?>[]> wildcardClassArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(wildcardClassArray2);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor3);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.reflect.Type[]> typeArrayItor1 = org.apache.commons.collections4.IteratorUtils.arrayIterator(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor12 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator2);
        int int15 = strComparableComparator2.compare("", "");
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(objItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strComparator16);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator0 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray2 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator0, charSequenceArrayItor1 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator3 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator3, charSequenceArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator6 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray8 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator6, charSequenceArrayItor7 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator9 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray11 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator9, charSequenceArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator12 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray14 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator12, charSequenceArrayItor13 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator15 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray17 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator15, charSequenceArrayItor16 };
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray18 = new org.apache.commons.collections4.MapIterator[][] { mapIteratorArray2, mapIteratorArray5, mapIteratorArray8, mapIteratorArray11, mapIteratorArray14, mapIteratorArray17 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayItor20 = org.apache.commons.collections4.IteratorUtils.singletonIterator(mapIteratorArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator[]> iteratorArrayItor22 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[][]) mapIteratorArray18, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIterator0);
        org.junit.Assert.assertNotNull(charSequenceArrayItor1);
        org.junit.Assert.assertNotNull(mapIteratorArray2);
        org.junit.Assert.assertNotNull(orderedMapIterator3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
        org.junit.Assert.assertNotNull(orderedMapIterator6);
        org.junit.Assert.assertNotNull(charSequenceArrayItor7);
        org.junit.Assert.assertNotNull(mapIteratorArray8);
        org.junit.Assert.assertNotNull(orderedMapIterator9);
        org.junit.Assert.assertNotNull(charSequenceArrayItor10);
        org.junit.Assert.assertNotNull(mapIteratorArray11);
        org.junit.Assert.assertNotNull(orderedMapIterator12);
        org.junit.Assert.assertNotNull(charSequenceArrayItor13);
        org.junit.Assert.assertNotNull(mapIteratorArray14);
        org.junit.Assert.assertNotNull(orderedMapIterator15);
        org.junit.Assert.assertNotNull(charSequenceArrayItor16);
        org.junit.Assert.assertNotNull(mapIteratorArray17);
        org.junit.Assert.assertNotNull(mapIteratorArray18);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor20);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[], java.util.AbstractList<java.util.Iterator<? extends java.lang.reflect.Type>>> charSequenceArrayItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        org.junit.Assert.assertNotNull(charSequenceArrayItorArrayItor0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean3 = iteratorItor2.hasPrevious();
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorItor2);
        boolean boolean5 = iteratorItor2.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator6 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[] iteratorItorArray9 = (org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[]) orderedMapIteratorArray8;
        iteratorItorArray9[0] = iteratorItor0;
        iteratorItorArray9[1] = iteratorItor2;
        iteratorItorArray9[2] = orderedMapIterator6;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorItorArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor20 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorItorArray9, 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(iteratorItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iteratorItorItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertNotNull(iteratorItorArray9);
        org.junit.Assert.assertNotNull(iteratorItorItor17);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.previousIndex();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.nextIndex();
        int int5 = strItor0.previousIndex();
        int int6 = strItor0.previousIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator15);
        boolean boolean18 = charSequenceItorReverseComparator0.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray23);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor25 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray23);
        java.lang.Class<?> wildcardClass26 = objItor25.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray27 = new java.lang.reflect.GenericDeclaration[] { wildcardClass26 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor28 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray27);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor31 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray27, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor32 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray27);
        boolean boolean33 = charSequenceItorReverseComparator0.equals((java.lang.Object) genericDeclarationArray27);
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor34 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceItor24);
        org.junit.Assert.assertNotNull(objItor25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(genericDeclarationArray27);
        org.junit.Assert.assertNotNull(genericDeclarationItor28);
        org.junit.Assert.assertNotNull(genericDeclarationItor31);
        org.junit.Assert.assertNotNull(objItor32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(annotatedElementItor34);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.Iterator<?> wildcardItor3 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor0);
        boolean boolean4 = strItor0.hasNext();
        int int5 = strItor0.previousIndex();
        int int6 = strItor0.nextIndex();
        boolean boolean7 = strItor0.hasPrevious();
        boolean boolean8 = strItor0.hasNext();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor1 = null;
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.CharSequence) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = charSequenceItorReverseComparator0.compare(charSequenceItor1, charSequenceItor3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.iterators.SingletonIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceItor3);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.lang.Comparable<java.lang.String> strComparable0 = null;
        java.util.ListIterator<java.lang.Comparable<java.lang.String>> strComparableItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(strComparable0);
        org.junit.Assert.assertNotNull(strComparableItor1);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: remove() method is not supported for an ObjectArrayIterator");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        java.lang.Class<?> wildcardClass1 = charSequenceItor0.getClass();
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor2 = org.apache.commons.collections4.IteratorUtils.singletonIterator(wildcardClass1);
        java.util.ListIterator<java.lang.reflect.AnnotatedElement> annotatedElementItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator((java.lang.reflect.AnnotatedElement) wildcardClass1);
        org.junit.Assert.assertNotNull(charSequenceItor0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClassItor2);
        org.junit.Assert.assertNotNull(annotatedElementItor3);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor0);
        boolean boolean4 = typeItor0.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator5 = typeItor0.getComparator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type type6 = typeItor0.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardComparator5);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        boolean boolean6 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int7 = strItor6.nextIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor10 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) str8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator13 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator14 = strComparableComparator5.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator13);
        java.util.Comparator<java.lang.String> strComparator15 = strComparableComparator2.thenComparing(strComparator14);
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator14);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", strComparator14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator13);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        java.util.Iterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor5 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>>[]) iteratorArray1);
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorIterableItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(iteratorItorItor5);
        org.junit.Assert.assertNotNull(wildcardItorIterableItor6);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        int int8 = strItor4.nextIndex();
        boolean boolean9 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) (byte) 10, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        boolean boolean3 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean1 = typeItor0.hasNext();
        boolean boolean2 = typeItor0.hasNext();
        boolean boolean3 = typeItor0.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList4 = typeItor0.getIterators();
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator5 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean7 = charSequenceItorReverseComparator5.equals((java.lang.Object) 100.0f);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int15 = strComparableComparator12.compare("hi!", "hi!");
        java.lang.String str16 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        int int19 = strComparableComparator12.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator20 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator21 = strComparableComparator12.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator20);
        java.lang.String str22 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator20);
        boolean boolean23 = charSequenceItorReverseComparator5.equals((java.lang.Object) "");
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor29 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray28);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor30 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray28);
        java.lang.Class<?> wildcardClass31 = objItor30.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray32 = new java.lang.reflect.GenericDeclaration[] { wildcardClass31 };
        org.apache.commons.collections4.ResettableIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor33 = org.apache.commons.collections4.IteratorUtils.arrayIterator(genericDeclarationArray32);
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration> genericDeclarationItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(genericDeclarationArray32, (int) (byte) 0, 1);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor37 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object[]) genericDeclarationArray32);
        boolean boolean38 = charSequenceItorReverseComparator5.equals((java.lang.Object) genericDeclarationArray32);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor39 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean40 = typeItor39.hasNext();
        java.util.Comparator<? super java.lang.reflect.Type> wildcardComparator41 = typeItor39.getComparator();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList42 = typeItor39.getIterators();
        boolean boolean43 = charSequenceItorReverseComparator5.equals((java.lang.Object) typeItor39);
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor44 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        boolean boolean45 = typeItor44.hasNext();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList46 = typeItor44.getIterators();
        org.apache.commons.collections4.iterators.CollatingIterator[] collatingIteratorArray48 = new org.apache.commons.collections4.iterators.CollatingIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[] typeItorArray49 = (org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>[]) collatingIteratorArray48;
        typeItorArray49[0] = typeItor0;
        typeItorArray49[1] = typeItor39;
        typeItorArray49[2] = typeItor44;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor56 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeItorArray49);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardItorList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator20);
        org.junit.Assert.assertNotNull(strComparator21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceItor29);
        org.junit.Assert.assertNotNull(objItor30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(genericDeclarationArray32);
        org.junit.Assert.assertNotNull(genericDeclarationItor33);
        org.junit.Assert.assertNotNull(genericDeclarationItor36);
        org.junit.Assert.assertNotNull(objItor37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(wildcardComparator41);
        org.junit.Assert.assertNotNull(wildcardItorList42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardItorList46);
        org.junit.Assert.assertNotNull(collatingIteratorArray48);
        org.junit.Assert.assertNotNull(typeItorArray49);
        org.junit.Assert.assertNotNull(typeItorItor56);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        int int11 = strComparableComparator4.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.String str14 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.util.Comparator<java.lang.String> strComparator15 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int21 = strComparableComparator18.compare("hi!", "hi!");
        java.lang.String str22 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator18);
        int int25 = strComparableComparator18.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator26 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator27 = strComparableComparator18.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator26);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor28 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator18);
        java.util.Comparator<java.lang.String> strComparator29 = strComparableComparator18.reversed();
        java.util.Comparator<java.lang.String> strComparator30 = strComparator29.reversed();
        java.util.Comparator<java.lang.String> strComparator31 = strComparator15.thenComparing(strComparator30);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strComparator15);
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator26);
        org.junit.Assert.assertNotNull(strComparator27);
        org.junit.Assert.assertNotNull(objItor28);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(strComparator31);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        int int6 = strItor0.previousIndex();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor8 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean9 = strItor8.hasNext();
        int int10 = strItor8.nextIndex();
        java.util.ListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor8);
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray13 = new org.apache.commons.collections4.OrderedIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.String>[] strItorArray14 = (org.apache.commons.collections4.OrderedIterator<java.lang.String>[]) orderedIteratorArray13;
        strItorArray14[0] = strItor0;
        strItorArray14[1] = strItor8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>> strItorItor21 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray14, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: End index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertNotNull(orderedIteratorArray13);
        org.junit.Assert.assertNotNull(strItorArray14);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor6 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean7 = strItor0.hasNext();
        boolean boolean8 = strItor0.hasNext();
        boolean boolean9 = strItor0.hasPrevious();
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor14 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray13);
        boolean boolean15 = strItor14.hasPrevious();
        boolean boolean16 = strItor14.hasNext();
        boolean boolean17 = strItor14.hasNext();
        java.util.ListIterator<java.lang.String> strItor18 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor14);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor23 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray22);
        boolean boolean24 = strItor23.hasPrevious();
        boolean boolean25 = strItor23.hasNext();
        int int26 = strItor23.previousIndex();
        java.lang.String str27 = strItor23.next();
        strItor23.set("hi!");
        strItor23.set("");
        java.lang.String str32 = strItor23.next();
        int int33 = strItor23.nextIndex();
        java.lang.String[] strArray37 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor38 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray37);
        boolean boolean39 = strItor38.hasPrevious();
        boolean boolean40 = strItor38.hasNext();
        int int41 = strItor38.previousIndex();
        java.lang.String str42 = strItor38.next();
        java.lang.String str43 = strItor38.previous();
        int int44 = strItor38.previousIndex();
        java.lang.String[] strArray48 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor49 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray48);
        java.lang.String str50 = strItor49.next();
        boolean boolean51 = strItor49.hasPrevious();
        java.lang.String str52 = strItor49.previous();
        java.lang.String[] strArray56 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor57 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray56);
        boolean boolean58 = strItor57.hasPrevious();
        boolean boolean59 = strItor57.hasPrevious();
        boolean boolean60 = strItor57.hasPrevious();
        org.apache.commons.collections4.OrderedIterator[] orderedIteratorArray62 = new org.apache.commons.collections4.OrderedIterator[6];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedIterator<java.lang.String>[] strItorArray63 = (org.apache.commons.collections4.OrderedIterator<java.lang.String>[]) orderedIteratorArray62;
        strItorArray63[0] = strItor0;
        strItorArray63[1] = strItor14;
        strItorArray63[2] = strItor23;
        strItorArray63[3] = strItor38;
        strItorArray63[4] = strItor49;
        strItorArray63[5] = strItor57;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedIterator<java.lang.String>> strItorItor77 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray63, (int) (short) 0);
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strItor18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strItor38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strItor49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(orderedIteratorArray62);
        org.junit.Assert.assertNotNull(strItorArray63);
        org.junit.Assert.assertNotNull(strItorItor77);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        java.util.ListIterator<org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>> typeItorItor3 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(typeItor0);
        boolean boolean4 = typeItor0.hasNext();
        boolean boolean5 = typeItor0.hasNext();
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(typeItorItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray8 = new org.apache.commons.collections4.comparators.ComparableComparator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray9 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray8;
        strComparableComparatorArray9[0] = strComparableComparator2;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor12 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray9);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor13 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strComparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(comparableComparatorArray8);
        org.junit.Assert.assertNotNull(strComparableComparatorArray9);
        org.junit.Assert.assertNotNull(strComparableComparatorItor12);
        org.junit.Assert.assertNotNull(strComparableComparatorItor13);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.Type[]> typeArrayItor9 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(typeArray5, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArrayItor6);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.collections4.OrderedMapIterator<java.lang.Iterable<java.util.Iterator<? extends java.lang.reflect.Type>>, java.util.Iterator> wildcardItorIterableItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.junit.Assert.assertNotNull(wildcardItorIterableItor0);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator6 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int9 = strComparableComparator6.compare("hi!", "hi!");
        java.lang.String str10 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator6);
        int int13 = strComparableComparator6.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator14 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator6);
        boolean boolean15 = strComparableComparator3.equals((java.lang.Object) strComparator14);
        java.util.Comparator<java.lang.String> strComparator16 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator3);
        java.lang.String str17 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator18 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator29 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator21);
        boolean boolean30 = strComparableComparator18.equals((java.lang.Object) strComparator29);
        java.util.Comparator<java.lang.String> strComparator31 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator18);
        org.apache.commons.collections4.comparators.ComparableComparator[] comparableComparatorArray33 = new org.apache.commons.collections4.comparators.ComparableComparator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[] strComparableComparatorArray34 = (org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>[]) comparableComparatorArray33;
        strComparableComparatorArray34[0] = strComparableComparator0;
        strComparableComparatorArray34[1] = strComparableComparator3;
        strComparableComparatorArray34[2] = strComparableComparator18;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor41 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray34);
        org.apache.commons.collections4.ResettableIterator<java.util.Comparator<java.lang.String>> strComparatorItor42 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Comparator<java.lang.String>[]) strComparableComparatorArray34);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String>> strComparableComparatorItor43 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strComparableComparatorArray34);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertNotNull(strComparableComparator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(strComparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strComparableComparator18);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strComparator31);
        org.junit.Assert.assertNotNull(comparableComparatorArray33);
        org.junit.Assert.assertNotNull(strComparableComparatorArray34);
        org.junit.Assert.assertNotNull(strComparableComparatorItor41);
        org.junit.Assert.assertNotNull(strComparatorItor42);
        org.junit.Assert.assertNotNull(strComparableComparatorItor43);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int3 = strComparableComparator0.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.util.Comparator<java.lang.String> strComparator17 = strComparableComparator4.thenComparing(strComparator16);
        boolean boolean18 = strComparableComparator0.equals((java.lang.Object) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator21.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator29);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator21);
        int int34 = strComparableComparator21.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator21);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator38 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int41 = strComparableComparator38.compare("hi!", "hi!");
        java.lang.String str42 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator38);
        int int45 = strComparableComparator38.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator46 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator47 = strComparableComparator38.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator46);
        int int50 = strComparableComparator46.compare("hi!", "hi!");
        int int53 = strComparableComparator46.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator54 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator46);
        java.util.Comparator<java.lang.String> strComparator55 = strComparator35.thenComparing(strComparator54);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator58 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int61 = strComparableComparator58.compare("hi!", "hi!");
        java.lang.String str62 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator58);
        int int65 = strComparableComparator58.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator66 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator67 = strComparableComparator58.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator66);
        int int70 = strComparableComparator58.compare("hi!", "hi!");
        java.util.Comparator<java.lang.String> strComparator71 = strComparator54.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator58);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3) + "'", int34 == (-3));
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(strComparableComparator38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator46);
        org.junit.Assert.assertNotNull(strComparator47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(strComparator54);
        org.junit.Assert.assertNotNull(strComparator55);
        org.junit.Assert.assertNotNull(strComparableComparator58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator66);
        org.junit.Assert.assertNotNull(strComparator67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(strComparator71);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        boolean boolean3 = listIterator0.hasPrevious();
        boolean boolean4 = listIterator0.hasNext();
        boolean boolean5 = listIterator0.hasPrevious();
        int int6 = listIterator0.previousIndex();
        java.util.ListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) listIterator0);
        int int8 = listIterator0.previousIndex();
        int int9 = listIterator0.nextIndex();
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int7 = strComparableComparator4.compare("hi!", "hi!");
        java.lang.String str8 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator4);
        int int11 = strComparableComparator4.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator12 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator13 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator12);
        int int16 = strComparableComparator12.compare("hi!", "hi!");
        int int19 = strComparableComparator12.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator20 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator12);
        java.lang.String str21 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator12);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator22 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean24 = charSequenceItorReverseComparator22.equals((java.lang.Object) 100.0f);
        boolean boolean25 = strComparableComparator12.equals((java.lang.Object) charSequenceItorReverseComparator22);
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor26 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean27 = strItor26.hasNext();
        int int28 = strItor26.nextIndex();
        java.util.Iterator<?> wildcardItor29 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strItor26);
        boolean boolean30 = charSequenceItorReverseComparator22.equals((java.lang.Object) strItor26);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator12);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(strComparator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int4 = strItor0.previousIndex();
        boolean boolean5 = strItor0.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>[]> charSequenceArrayItorArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) (-1.0f), 6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence[]> charSequenceArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(charSequenceArrayItor0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.util.ListIterator<java.lang.String> strItor1 = org.apache.commons.collections4.IteratorUtils.singletonListIterator("hi!");
        boolean boolean2 = strItor1.hasPrevious();
        int int3 = strItor1.previousIndex();
        java.lang.String str4 = strItor1.next();
        org.junit.Assert.assertNotNull(strItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(strItorItor0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            strItor0.set("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Iterator contains no elements");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int3 = strComparableComparator0.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator4 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator7 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int10 = strComparableComparator7.compare("hi!", "hi!");
        java.lang.String str11 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator7);
        int int14 = strComparableComparator7.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator15 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator16 = strComparableComparator7.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator15);
        java.util.Comparator<java.lang.String> strComparator17 = strComparableComparator4.thenComparing(strComparator16);
        boolean boolean18 = strComparableComparator0.equals((java.lang.Object) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int24 = strComparableComparator21.compare("hi!", "hi!");
        java.lang.String str25 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int28 = strComparableComparator21.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator29 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator30 = strComparableComparator21.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator29);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor31 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator21);
        int int34 = strComparableComparator21.compare("", "hi!");
        java.util.Comparator<java.lang.String> strComparator35 = strComparableComparator4.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator21);
        java.util.Comparator<java.lang.String> strComparator36 = org.apache.commons.collections4.ComparatorUtils.nullHighComparator((java.util.Comparator<java.lang.String>) strComparableComparator4);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator37 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int40 = strComparableComparator37.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator41 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator44 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int47 = strComparableComparator44.compare("hi!", "hi!");
        java.lang.String str48 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator44);
        int int51 = strComparableComparator44.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator52 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator53 = strComparableComparator44.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator52);
        java.util.Comparator<java.lang.String> strComparator54 = strComparableComparator41.thenComparing(strComparator53);
        boolean boolean55 = strComparableComparator37.equals((java.lang.Object) strComparableComparator41);
        java.util.Comparator<java.lang.String> strComparator56 = strComparator36.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator37);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator4);
        org.junit.Assert.assertNotNull(strComparableComparator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator15);
        org.junit.Assert.assertNotNull(strComparator16);
        org.junit.Assert.assertNotNull(strComparator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator29);
        org.junit.Assert.assertNotNull(strComparator30);
        org.junit.Assert.assertNotNull(objItor31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-3) + "'", int34 == (-3));
        org.junit.Assert.assertNotNull(strComparator35);
        org.junit.Assert.assertNotNull(strComparator36);
        org.junit.Assert.assertNotNull(strComparableComparator37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator41);
        org.junit.Assert.assertNotNull(strComparableComparator44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator52);
        org.junit.Assert.assertNotNull(strComparator53);
        org.junit.Assert.assertNotNull(strComparator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strComparator56);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        boolean boolean3 = strItor0.hasPrevious();
        boolean boolean4 = strItor0.hasNext();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray6 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.String>[] strItorArray7 = (org.apache.commons.collections4.ResettableListIterator<java.lang.String>[]) resettableListIteratorArray6;
        strItorArray7[0] = strItor0;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor10 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strItorArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.util.Iterator> iteratorItor12 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.util.Iterator[]) strItorArray7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(resettableListIteratorArray6);
        org.junit.Assert.assertNotNull(strItorArray7);
        org.junit.Assert.assertNotNull(strItorItor10);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        strItor7.set("hi!");
        strItor7.set("");
        java.lang.String str16 = strItor7.next();
        boolean boolean17 = strItor7.hasNext();
        boolean boolean18 = charSequenceItorReverseComparator0.equals((java.lang.Object) boolean17);
        org.apache.commons.collections4.ResettableIterator resettableIterator19 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        org.apache.commons.collections4.ResettableIterator resettableIterator20 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        resettableIterator20.reset();
        resettableIterator20.reset();
        resettableIterator20.reset();
        resettableIterator20.reset();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = charSequenceItorReverseComparator0.compare((org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>) resettableIterator19, (org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>) resettableIterator20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.collections4.iterators.EmptyIterator cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(resettableIterator19);
        org.junit.Assert.assertNotNull(resettableIterator20);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor2 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean3 = iteratorItor2.hasPrevious();
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor4 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorItor2);
        boolean boolean5 = iteratorItor2.hasPrevious();
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator6 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator[] orderedMapIteratorArray8 = new org.apache.commons.collections4.OrderedMapIterator[3];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[] iteratorItorArray9 = (org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>[]) orderedMapIteratorArray8;
        iteratorItorArray9[0] = iteratorItor0;
        iteratorItorArray9[1] = iteratorItor2;
        iteratorItorArray9[2] = orderedMapIterator6;
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor17 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(iteratorItorArray9, (int) (byte) 0);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.MapIterator> mapIteratorItor18 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((org.apache.commons.collections4.MapIterator[]) iteratorItorArray9);
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(iteratorItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iteratorItorItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(orderedMapIterator6);
        org.junit.Assert.assertNotNull(orderedMapIteratorArray8);
        org.junit.Assert.assertNotNull(iteratorItorArray9);
        org.junit.Assert.assertNotNull(iteratorItorItor17);
        org.junit.Assert.assertNotNull(mapIteratorItor18);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        int int7 = strItor4.previousIndex();
        java.lang.String str8 = strItor4.next();
        strItor4.set("hi!");
        strItor4.set("");
        java.lang.String str13 = strItor4.next();
        boolean boolean14 = strItor4.hasNext();
        boolean boolean15 = strItor4.hasPrevious();
        int int16 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasPrevious();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        boolean boolean9 = strItor4.hasPrevious();
        java.util.ListIterator<java.lang.String> strItor10 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor4);
        boolean boolean11 = strItor10.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator5 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int8 = strComparableComparator5.compare("hi!", "hi!");
        java.lang.String str9 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator5);
        int int12 = strComparableComparator5.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator13 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator5);
        boolean boolean14 = strComparableComparator2.equals((java.lang.Object) strComparator13);
        java.lang.String str15 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int18 = strComparableComparator2.compare("hi!", "hi!");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator21 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator24 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int27 = strComparableComparator24.compare("hi!", "hi!");
        java.lang.String str28 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator24);
        int int31 = strComparableComparator24.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator32 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator24);
        boolean boolean33 = strComparableComparator21.equals((java.lang.Object) strComparator32);
        java.lang.String str34 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator21);
        int int37 = strComparableComparator21.compare("", "");
        boolean boolean38 = strComparableComparator2.equals((java.lang.Object) strComparableComparator21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor40 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) strComparableComparator2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertNotNull(strComparableComparator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(strComparator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strComparableComparator21);
        org.junit.Assert.assertNotNull(strComparableComparator24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(strComparator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        java.lang.String str10 = strItor4.previous();
        strItor4.set("");
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        boolean boolean2 = strItor0.hasPrevious();
        boolean boolean3 = strItor0.hasPrevious();
        int int4 = strItor0.previousIndex();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.util.Comparator<java.lang.String> strComparator2 = null;
        java.util.Comparator<java.lang.String> strComparator3 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator2);
        java.util.Comparator<java.lang.String> strComparator4 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator2);
        java.util.Comparator<java.lang.String> strComparator5 = org.apache.commons.collections4.ComparatorUtils.nullLowComparator(strComparator2);
        java.util.Iterator<?> wildcardItor6 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) strComparator5);
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("", "", strComparator5);
        org.junit.Assert.assertNotNull(strComparator3);
        org.junit.Assert.assertNotNull(strComparator4);
        org.junit.Assert.assertNotNull(strComparator5);
        org.junit.Assert.assertNotNull(wildcardItor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        int int7 = strItor4.previousIndex();
        boolean boolean8 = strItor4.hasNext();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        org.apache.commons.collections4.ResettableListIterator[] resettableListIteratorArray9 = new org.apache.commons.collections4.ResettableListIterator[1];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableListIterator<java.lang.String>[] strItorArray10 = (org.apache.commons.collections4.ResettableListIterator<java.lang.String>[]) resettableListIteratorArray9;
        strItorArray10[0] = strItor4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>> strItorItor14 = org.apache.commons.collections4.IteratorUtils.arrayIterator(strItorArray10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be greater than the array length");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(resettableListIteratorArray9);
        org.junit.Assert.assertNotNull(strItorArray10);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        java.lang.String str5 = strItor4.next();
        int int6 = strItor4.nextIndex();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.collections4.ResettableIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.reflect.GenericDeclaration[][]> genericDeclarationArrayItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) 10L, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator0 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator3 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int6 = strComparableComparator3.compare("hi!", "hi!");
        java.lang.String str7 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator3);
        int int10 = strComparableComparator3.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator11 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator12 = strComparableComparator3.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator11);
        org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor13 = org.apache.commons.collections4.IteratorUtils.singletonIterator((java.lang.Object) strComparableComparator3);
        int int16 = strComparableComparator3.compare("", "");
        java.util.Iterator<?> wildcardItor17 = org.apache.commons.collections4.IteratorUtils.getIterator((java.lang.Object) "");
        boolean boolean18 = strComparableComparator0.equals((java.lang.Object) wildcardItor17);
        org.junit.Assert.assertNotNull(strComparableComparator0);
        org.junit.Assert.assertNotNull(strComparableComparator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator11);
        org.junit.Assert.assertNotNull(strComparator12);
        org.junit.Assert.assertNotNull(objItor13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        boolean boolean4 = strItor0.hasPrevious();
        int int5 = strItor0.nextIndex();
        boolean boolean6 = strItor0.hasPrevious();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean1 = strItor0.hasNext();
        int int2 = strItor0.nextIndex();
        java.util.ListIterator<java.lang.String> strItor3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor0);
        int int4 = strItor0.previousIndex();
        boolean boolean5 = strItor0.hasPrevious();
        boolean boolean6 = strItor0.hasNext();
        org.junit.Assert.assertNotNull(strItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strItor3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration> iteratorItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        boolean boolean1 = iteratorItor0.hasPrevious();
        java.util.ListIterator<org.apache.commons.collections4.OrderedMapIterator<java.util.Iterator, java.lang.reflect.GenericDeclaration>> iteratorItorItor2 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(iteratorItor0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<java.lang.CharSequence> charSequenceItor3 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) iteratorItor0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iteratorItor0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(iteratorItorItor2);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        charSequenceItor5.reset();
        org.apache.commons.collections4.ResettableIterator resettableIterator7 = org.apache.commons.collections4.iterators.EmptyIterator.RESETTABLE_INSTANCE;
        resettableIterator7.reset();
        resettableIterator7.reset();
        resettableIterator7.reset();
        org.apache.commons.collections4.ResettableIterator[] resettableIteratorArray12 = new org.apache.commons.collections4.ResettableIterator[2];
        @SuppressWarnings("unchecked")
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[] charSequenceItorArray13 = (org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>[]) resettableIteratorArray12;
        charSequenceItorArray13[0] = charSequenceItor5;
        charSequenceItorArray13[1] = resettableIterator7;
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor18 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray13);
        org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor19 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(charSequenceItorArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorItor21 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceItorArray13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Start index must not be less than zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(resettableIterator7);
        org.junit.Assert.assertNotNull(resettableIteratorArray12);
        org.junit.Assert.assertNotNull(charSequenceItorArray13);
        org.junit.Assert.assertNotNull(charSequenceItorItor18);
        org.junit.Assert.assertNotNull(charSequenceItorItor19);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator0 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor1 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray2 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator0, charSequenceArrayItor1 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator3 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor4 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray5 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator3, charSequenceArrayItor4 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator6 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor7 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray8 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator6, charSequenceArrayItor7 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator9 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor10 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray11 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator9, charSequenceArrayItor10 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator12 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor13 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray14 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator12, charSequenceArrayItor13 };
        org.apache.commons.collections4.OrderedMapIterator orderedMapIterator15 = org.apache.commons.collections4.iterators.EmptyOrderedMapIterator.INSTANCE;
        org.apache.commons.collections4.OrderedMapIterator<java.lang.CharSequence[], java.util.Iterator[]> charSequenceArrayItor16 = org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator();
        org.apache.commons.collections4.MapIterator[] mapIteratorArray17 = new org.apache.commons.collections4.MapIterator[] { orderedMapIterator15, charSequenceArrayItor16 };
        org.apache.commons.collections4.MapIterator[][] mapIteratorArray18 = new org.apache.commons.collections4.MapIterator[][] { mapIteratorArray2, mapIteratorArray5, mapIteratorArray8, mapIteratorArray11, mapIteratorArray14, mapIteratorArray17 };
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[]> mapIteratorArrayItor19 = org.apache.commons.collections4.IteratorUtils.arrayIterator(mapIteratorArray18);
        org.apache.commons.collections4.ResettableIterator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayItor20 = org.apache.commons.collections4.IteratorUtils.singletonIterator(mapIteratorArray18);
        java.util.ListIterator<org.apache.commons.collections4.MapIterator[][]> mapIteratorArrayItor21 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(mapIteratorArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.util.Iterator[]> iteratorArrayItor24 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.util.Iterator[][]) mapIteratorArray18, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: End index must not be less than start index");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderedMapIterator0);
        org.junit.Assert.assertNotNull(charSequenceArrayItor1);
        org.junit.Assert.assertNotNull(mapIteratorArray2);
        org.junit.Assert.assertNotNull(orderedMapIterator3);
        org.junit.Assert.assertNotNull(charSequenceArrayItor4);
        org.junit.Assert.assertNotNull(mapIteratorArray5);
        org.junit.Assert.assertNotNull(orderedMapIterator6);
        org.junit.Assert.assertNotNull(charSequenceArrayItor7);
        org.junit.Assert.assertNotNull(mapIteratorArray8);
        org.junit.Assert.assertNotNull(orderedMapIterator9);
        org.junit.Assert.assertNotNull(charSequenceArrayItor10);
        org.junit.Assert.assertNotNull(mapIteratorArray11);
        org.junit.Assert.assertNotNull(orderedMapIterator12);
        org.junit.Assert.assertNotNull(charSequenceArrayItor13);
        org.junit.Assert.assertNotNull(mapIteratorArray14);
        org.junit.Assert.assertNotNull(orderedMapIterator15);
        org.junit.Assert.assertNotNull(charSequenceArrayItor16);
        org.junit.Assert.assertNotNull(mapIteratorArray17);
        org.junit.Assert.assertNotNull(mapIteratorArray18);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor19);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor20);
        org.junit.Assert.assertNotNull(mapIteratorArrayItor21);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type> typeItor0 = new org.apache.commons.collections4.iterators.CollatingIterator<java.lang.reflect.Type>();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList1 = typeItor0.getIterators();
        java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorList2 = typeItor0.getIterators();
        org.apache.commons.collections4.ResettableListIterator<java.util.Iterator<? extends java.lang.reflect.Type>> wildcardItorItor3 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(wildcardItorList2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) wildcardItorItor3, (int) 'a', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardItorList1);
        org.junit.Assert.assertNotNull(wildcardItorList2);
        org.junit.Assert.assertNotNull(wildcardItorItor3);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator2 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int5 = strComparableComparator2.compare("hi!", "hi!");
        java.lang.String str6 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator2);
        int int9 = strComparableComparator2.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator10 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator11 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator10);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator14 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator17 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int20 = strComparableComparator17.compare("hi!", "hi!");
        java.lang.String str21 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator17);
        int int24 = strComparableComparator17.compare("hi!", "");
        java.util.Comparator<java.lang.String> strComparator25 = org.apache.commons.collections4.ComparatorUtils.reversedComparator((java.util.Comparator<java.lang.String>) strComparableComparator17);
        boolean boolean26 = strComparableComparator14.equals((java.lang.Object) strComparator25);
        java.lang.String str27 = org.apache.commons.collections4.ComparatorUtils.max("", "", (java.util.Comparator<java.lang.String>) strComparableComparator14);
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator30 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int33 = strComparableComparator30.compare("hi!", "hi!");
        java.lang.String str34 = org.apache.commons.collections4.ComparatorUtils.max("hi!", "", (java.util.Comparator<java.lang.String>) strComparableComparator30);
        int int37 = strComparableComparator30.compare("hi!", "");
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator38 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        java.util.Comparator<java.lang.String> strComparator39 = strComparableComparator30.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator38);
        java.util.Comparator<java.lang.String> strComparator40 = strComparableComparator14.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator38);
        java.util.Comparator<java.lang.String> strComparator41 = strComparableComparator2.thenComparing((java.util.Comparator<java.lang.String>) strComparableComparator14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>[]> wildcardClassArrayItor43 = org.apache.commons.collections4.IteratorUtils.arrayIterator((java.lang.Object) strComparableComparator2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableComparator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator10);
        org.junit.Assert.assertNotNull(strComparator11);
        org.junit.Assert.assertNotNull(strComparableComparator14);
        org.junit.Assert.assertNotNull(strComparableComparator17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(strComparator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strComparableComparator30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(strComparableComparator38);
        org.junit.Assert.assertNotNull(strComparator39);
        org.junit.Assert.assertNotNull(strComparator40);
        org.junit.Assert.assertNotNull(strComparator41);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.util.Iterator[] iteratorArray1 = new java.util.Iterator[0];
        @SuppressWarnings("unchecked")
        java.util.Iterator<? extends java.lang.String[]>[] wildcardItorArray2 = (java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1;
        java.util.Iterator<java.lang.String[]> strArrayItor3 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.String[]>[]) iteratorArray1);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.Comparable<java.lang.String>>[]) iteratorArray1);
        org.apache.commons.collections4.iterators.ZippingIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>> wildcardItorCollectionItor5 = org.apache.commons.collections4.IteratorUtils.zippingIterator((java.util.Iterator<? extends java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>>[]) iteratorArray1);
        java.util.Iterator<java.io.Serializable> serializableItor6 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.io.Serializable>[]) iteratorArray1);
        java.util.Iterator<java.lang.reflect.GenericDeclaration[]> genericDeclarationArrayItor7 = org.apache.commons.collections4.IteratorUtils.chainedIterator((java.util.Iterator<? extends java.lang.reflect.GenericDeclaration[]>[]) iteratorArray1);
        org.junit.Assert.assertNotNull(iteratorArray1);
        org.junit.Assert.assertNotNull(wildcardItorArray2);
        org.junit.Assert.assertNotNull(strArrayItor3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(wildcardItorCollectionItor5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(genericDeclarationArrayItor7);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.collections4.OrderedIterator<org.apache.commons.collections4.ResettableListIterator<java.lang.String>[]> strItorArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator();
        org.junit.Assert.assertNotNull(strItorArrayItor0);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasPrevious();
        boolean boolean7 = strItor4.hasNext();
        boolean boolean8 = strItor4.hasPrevious();
        java.lang.String str9 = strItor4.next();
        java.lang.String str10 = strItor4.previous();
        // The following exception was thrown during execution in test generation
        try {
            strItor4.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: add() method is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.commons.collections4.ResettableListIterator<java.util.List<java.util.Iterator<? extends java.lang.reflect.Type>>[][]> wildcardItorListArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        org.junit.Assert.assertNotNull(wildcardItorListArrayItor0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!" };
        org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence> charSequenceItor5 = org.apache.commons.collections4.IteratorUtils.arrayIterator(charSequenceArray4);
        org.apache.commons.collections4.ResettableListIterator<java.lang.Object> objItor6 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object[]) charSequenceArray4);
        java.lang.Class<?> wildcardClass7 = objItor6.getClass();
        java.util.ListIterator<java.lang.Class<?>> wildcardClassItor8 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClass7);
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator9 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean11 = charSequenceItorReverseComparator9.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray15);
        boolean boolean17 = strItor16.hasPrevious();
        boolean boolean18 = strItor16.hasNext();
        int int19 = strItor16.previousIndex();
        java.lang.String str20 = strItor16.next();
        boolean boolean21 = charSequenceItorReverseComparator9.equals((java.lang.Object) strItor16);
        java.lang.Class<?> wildcardClass22 = strItor16.getClass();
        org.apache.commons.collections4.comparators.ComparableComparator<java.lang.String> strComparableComparator27 = org.apache.commons.collections4.comparators.ComparableComparator.comparableComparator();
        int int30 = strComparableComparator27.compare("hi!", "hi!");
        java.lang.String str31 = org.apache.commons.collections4.ComparatorUtils.max("", "hi!", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.String str32 = org.apache.commons.collections4.ComparatorUtils.min("", "", (java.util.Comparator<java.lang.String>) strComparableComparator27);
        java.lang.Class<?> wildcardClass33 = strComparableComparator27.getClass();
        org.apache.commons.collections4.MapIterator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>, org.apache.commons.collections4.ResettableListIterator<java.lang.String>> charSequenceItorItor34 = org.apache.commons.collections4.IteratorUtils.emptyMapIterator();
        java.lang.Class<?> wildcardClass35 = charSequenceItorItor34.getClass();
        java.lang.Class[] classArray37 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray38 = (java.lang.Class<?>[]) classArray37;
        wildcardClassArray38[0] = wildcardClass7;
        wildcardClassArray38[1] = wildcardClass22;
        wildcardClassArray38[2] = wildcardClass33;
        wildcardClassArray38[3] = wildcardClass35;
        org.apache.commons.collections4.ResettableIterator<java.lang.Class<?>> wildcardClassItor49 = org.apache.commons.collections4.IteratorUtils.arrayIterator(wildcardClassArray38, (int) (byte) 0, (int) (short) 0);
        java.util.ListIterator<java.lang.Class<?>[]> wildcardClassArrayItor50 = org.apache.commons.collections4.IteratorUtils.singletonListIterator(wildcardClassArray38);
        org.apache.commons.collections4.ResettableListIterator<java.io.Serializable> serializableItor51 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.io.Serializable[]) wildcardClassArray38);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceItor5);
        org.junit.Assert.assertNotNull(objItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClassItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(strComparableComparator27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(charSequenceItorItor34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertNotNull(wildcardClassArray38);
        org.junit.Assert.assertNotNull(wildcardClassItor49);
        org.junit.Assert.assertNotNull(wildcardClassArrayItor50);
        org.junit.Assert.assertNotNull(serializableItor51);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>> charSequenceItorReverseComparator0 = new org.apache.commons.collections4.comparators.ReverseComparator<org.apache.commons.collections4.ResettableIterator<java.lang.CharSequence>>();
        boolean boolean2 = charSequenceItorReverseComparator0.equals((java.lang.Object) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor7 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray6);
        boolean boolean8 = strItor7.hasPrevious();
        boolean boolean9 = strItor7.hasNext();
        int int10 = strItor7.previousIndex();
        java.lang.String str11 = strItor7.next();
        boolean boolean12 = charSequenceItorReverseComparator0.equals((java.lang.Object) strItor7);
        java.lang.String str13 = strItor7.next();
        java.lang.String str14 = strItor7.next();
        java.lang.String str15 = strItor7.previous();
        strItor7.set("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor4 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray3);
        boolean boolean5 = strItor4.hasPrevious();
        boolean boolean6 = strItor4.hasNext();
        boolean boolean7 = strItor4.hasNext();
        int int8 = strItor4.nextIndex();
        boolean boolean9 = strItor4.hasPrevious();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = strItor4.previous();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.collections4.ResettableIterator<java.util.Collection<java.util.Iterator<? extends java.lang.reflect.Type>>[]> wildcardItorCollectionArrayItor0 = org.apache.commons.collections4.IteratorUtils.emptyIterator();
        org.junit.Assert.assertNotNull(wildcardItorCollectionArrayItor0);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        java.util.Comparator comparator0 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator comparator1 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator comparator4 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.lang.String str5 = org.apache.commons.collections4.ComparatorUtils.min("hi!", "hi!", (java.util.Comparator<java.lang.String>) comparator4);
        java.util.Comparator comparator6 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator comparator7 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator comparator8 = org.apache.commons.collections4.ComparatorUtils.NATURAL_COMPARATOR;
        java.util.Comparator[] comparatorArray10 = new java.util.Comparator[6];
        @SuppressWarnings("unchecked")
        java.util.Comparator<org.apache.commons.collections4.MapIterator>[] mapIteratorComparatorArray11 = (java.util.Comparator<org.apache.commons.collections4.MapIterator>[]) comparatorArray10;
        mapIteratorComparatorArray11[0] = comparator0;
        mapIteratorComparatorArray11[1] = comparator1;
        mapIteratorComparatorArray11[2] = comparator4;
        mapIteratorComparatorArray11[3] = comparator6;
        mapIteratorComparatorArray11[4] = comparator7;
        mapIteratorComparatorArray11[5] = comparator8;
        java.util.Comparator<org.apache.commons.collections4.MapIterator> mapIteratorComparator24 = org.apache.commons.collections4.ComparatorUtils.chainedComparator(mapIteratorComparatorArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.collections4.ResettableListIterator<org.apache.commons.collections4.iterators.ZippingIterator<java.lang.CharSequence[]>> charSequenceArrayItorItor26 = org.apache.commons.collections4.IteratorUtils.arrayListIterator((java.lang.Object) mapIteratorComparator24, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(comparator0);
        org.junit.Assert.assertNotNull(comparator1);
        org.junit.Assert.assertNotNull(comparator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(comparator6);
        org.junit.Assert.assertNotNull(comparator7);
        org.junit.Assert.assertNotNull(comparator8);
        org.junit.Assert.assertNotNull(comparatorArray10);
        org.junit.Assert.assertNotNull(mapIteratorComparatorArray11);
        org.junit.Assert.assertNotNull(mapIteratorComparator24);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.util.ListIterator listIterator0 = org.apache.commons.collections4.iterators.EmptyListIterator.INSTANCE;
        int int1 = listIterator0.nextIndex();
        boolean boolean2 = listIterator0.hasPrevious();
        boolean boolean3 = listIterator0.hasPrevious();
        boolean boolean4 = listIterator0.hasNext();
        boolean boolean5 = listIterator0.hasPrevious();
        int int6 = listIterator0.previousIndex();
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "" };
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor11 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strArray10);
        boolean boolean12 = strItor11.hasPrevious();
        boolean boolean13 = strItor11.hasNext();
        int int14 = strItor11.previousIndex();
        boolean boolean15 = strItor11.hasNext();
        org.apache.commons.collections4.ResettableListIterator<java.lang.String> strItor16 = org.apache.commons.collections4.IteratorUtils.emptyListIterator();
        boolean boolean17 = strItor16.hasNext();
        int int18 = strItor16.nextIndex();
        java.util.ListIterator<java.lang.String> strItor19 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator((java.util.ListIterator<java.lang.String>) strItor16);
        boolean boolean20 = strItor16.hasPrevious();
        java.util.ListIterator[] listIteratorArray22 = new java.util.ListIterator[3];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[] strItorArray23 = (java.util.ListIterator<java.lang.String>[]) listIteratorArray22;
        strItorArray23[0] = listIterator0;
        strItorArray23[1] = strItor11;
        strItorArray23[2] = strItor16;
        java.util.ListIterator[][] listIteratorArray31 = new java.util.ListIterator[1][];
        @SuppressWarnings("unchecked")
        java.util.ListIterator<java.lang.String>[][] strItorArray32 = (java.util.ListIterator<java.lang.String>[][]) listIteratorArray31;
        strItorArray32[0] = strItorArray23;
        org.apache.commons.collections4.ResettableListIterator<java.util.ListIterator<java.lang.String>[]> strItorArrayItor36 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(strItorArray32, (int) (byte) 0);
        org.junit.Assert.assertNotNull(listIterator0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(listIteratorArray22);
        org.junit.Assert.assertNotNull(strItorArray23);
        org.junit.Assert.assertNotNull(listIteratorArray31);
        org.junit.Assert.assertNotNull(strItorArray32);
        org.junit.Assert.assertNotNull(strItorArrayItor36);
    }
}

