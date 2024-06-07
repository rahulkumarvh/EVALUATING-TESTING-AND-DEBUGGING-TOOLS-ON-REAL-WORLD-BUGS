package org.apache.commons.compress.archivers.zip;

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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setCrc((long) 0);
        long long9 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setExternalAttributes((long) 8);
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setSize((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setName("hi!");
        long long20 = zipArchiveEntry17.getExternalAttributes();
        boolean boolean21 = zipArchiveEntry17.isDirectory();
        zipArchiveEntry17.setInternalAttributes(10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry17.getExtraFields();
        zipArchiveEntry17.setInternalAttributes((int) (short) 1);
        java.lang.String str27 = zipArchiveEntry17.getComment();
        boolean boolean28 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry17);
        zipArchiveEntry17.setCompressedSize((long) 10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        java.lang.String str11 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setCrc((long) (short) 100);
        java.lang.Class<?> wildcardClass14 = zipArchiveEntry1.getClass();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        int int9 = zipArchiveEntry1.getPlatform();
        int int10 = zipArchiveEntry1.getPlatform();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastAccessTime();
        java.lang.String str12 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        long long4 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = zipArchiveEntry1.getExtraField(zipShort5);
        zipArchiveEntry1.setUnixMode((int) (short) 1);
        java.util.Date date9 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 15:59:59 PST 1969");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastAccessTime();
        long long5 = zipArchiveEntry1.getExternalAttributes();
        long long6 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        byte[] byteArray8 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setCompressedSize((long) '#');
        int int5 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setCrc((long) 0);
        boolean boolean9 = zipArchiveEntry1.isDirectory();
        long long10 = zipArchiveEntry1.getCrc();
        byte[] byteArray11 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(byteArray11);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry14.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry14.getExtraFields();
        zipArchiveEntry14.setComment("hi!");
        zipArchiveEntry14.setCrc((long) 0);
        long long22 = zipArchiveEntry14.getSize();
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry14.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry25.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry25.setComment("hi!");
        long long31 = zipArchiveEntry25.getExternalAttributes();
        zipArchiveEntry25.setTime((long) (short) -1);
        boolean boolean34 = zipArchiveEntry25.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime35 = zipArchiveEntry25.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry36 = zipArchiveEntry14.setCreationTime(fileTime35);
        java.util.zip.ZipEntry zipEntry37 = zipArchiveEntry12.setLastAccessTime(fileTime35);
        java.util.zip.ZipEntry zipEntry38 = zipArchiveEntry1.setLastModifiedTime(fileTime35);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry40.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = zipArchiveEntry40.getExtraFields();
        zipArchiveEntry40.setComment("hi!");
        zipArchiveEntry40.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry49.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry49.getExtraFields();
        zipArchiveEntry49.setComment("hi!");
        zipArchiveEntry49.setInternalAttributes((int) (byte) 10);
        int int57 = zipArchiveEntry49.getUnixMode();
        java.lang.String str58 = zipArchiveEntry49.getComment();
        long long59 = zipArchiveEntry49.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry62.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray65 = zipArchiveEntry62.getExtraFields();
        zipArchiveEntry62.setComment("hi!");
        zipArchiveEntry62.setCrc((long) 0);
        long long70 = zipArchiveEntry62.getSize();
        java.nio.file.attribute.FileTime fileTime71 = zipArchiveEntry62.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry73 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry73.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray76 = zipArchiveEntry73.getExtraFields();
        zipArchiveEntry73.setComment("hi!");
        long long79 = zipArchiveEntry73.getExternalAttributes();
        zipArchiveEntry73.setTime((long) (short) -1);
        boolean boolean82 = zipArchiveEntry73.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime83 = zipArchiveEntry73.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry62.setCreationTime(fileTime83);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry60.setLastAccessTime(fileTime83);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry49.setLastModifiedTime(fileTime83);
        byte[] byteArray87 = zipArchiveEntry49.getLocalFileDataExtra();
        zipArchiveEntry40.setExtra(byteArray87);
        byte[] byteArray89 = zipArchiveEntry40.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray89);
        zipArchiveEntry1.setComment("");
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fileTime35);
        org.junit.Assert.assertNotNull(zipEntry36);
        org.junit.Assert.assertEquals(zipEntry36.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry37);
        org.junit.Assert.assertEquals(zipEntry37.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry38);
        org.junit.Assert.assertEquals(zipEntry38.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray65);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertNull(fileTime71);
        org.junit.Assert.assertNotNull(zipExtraFieldArray76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(fileTime83);
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[]");
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[]");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        boolean boolean3 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setName("hi!");
        zipArchiveEntry10.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry10.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray15);
        zipArchiveEntry1.setInternalAttributes(0);
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        boolean boolean12 = zipArchiveEntry1.isSupportedCompressionMethod();
        java.lang.String str13 = zipArchiveEntry1.getComment();
        long long14 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        long long4 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setInternalAttributes(10);
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setTime((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 15:59:59 PST 1969");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        zipArchiveEntry1.setCompressedSize(1L);
        zipArchiveEntry1.setComment("hi!");
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNull(fileTime9);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setCrc((long) 0);
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean12 = zipArchiveEntry11.isDirectory();
        int int13 = zipArchiveEntry11.getUnixMode();
        boolean boolean14 = zipArchiveEntry11.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry16.getExtraFields();
        zipArchiveEntry11.setExtraFields(zipExtraFieldArray19);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray19);
        long long22 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        zipArchiveEntry1.setCompressedSize(1L);
        zipArchiveEntry1.setComment("hi!");
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setInternalAttributes((int) (byte) -1);
        int int12 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        int int9 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setMethod((int) '#');
        long long13 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addExtraField(zipExtraField14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setCrc((long) 0);
        long long9 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setExternalAttributes((long) 8);
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry1.getCreationTime();
        int int14 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addExtraField(zipExtraField15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setPlatform((int) '4');
        java.lang.String str5 = zipArchiveEntry1.getComment();
        long long6 = zipArchiveEntry1.getSize();
        java.lang.Object obj7 = zipArchiveEntry1.clone();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
        org.junit.Assert.assertNull(fileTime8);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.String str4 = zipArchiveEntry1.getName();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        long long6 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setExternalAttributes((long) 0);
        int int9 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setUnixMode((int) '4');
        zipArchiveEntry1.setPlatform((int) (short) 1);
        zipArchiveEntry1.setCompressedSize(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry17.getExtraFields();
        zipArchiveEntry17.setComment("hi!");
        long long23 = zipArchiveEntry17.getSize();
        java.lang.String str24 = zipArchiveEntry17.getName();
        int int25 = zipArchiveEntry17.getMethod();
        byte[] byteArray26 = zipArchiveEntry17.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        int int9 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setName("hi!");
        long long12 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setTime((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = zipArchiveEntry11.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray14);
        zipArchiveEntry1.setMethod(0);
        zipArchiveEntry1.setCrc(0L);
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setName("hi!");
        zipArchiveEntry23.setTime((long) (-1));
        boolean boolean28 = zipArchiveEntry23.isDirectory();
        boolean boolean29 = zipArchiveEntry23.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry31.getExtraFields();
        zipArchiveEntry31.setComment("hi!");
        long long37 = zipArchiveEntry31.getSize();
        java.lang.String str38 = zipArchiveEntry31.getName();
        int int39 = zipArchiveEntry31.getMethod();
        byte[] byteArray40 = zipArchiveEntry31.getLocalFileDataExtra();
        zipArchiveEntry23.setCentralDirectoryExtra(byteArray40);
        zipArchiveEntry1.setExtra(byteArray40);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort43 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort43);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        byte[] byteArray11 = zipArchiveEntry1.getCentralDirectoryExtra();
        byte[] byteArray12 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = zipArchiveEntry1.getExtraField(zipShort12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = zipArchiveEntry1.getExtraFields();
        boolean boolean15 = zipArchiveEntry1.isSupportedCompressionMethod();
        int int16 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        long long9 = zipArchiveEntry1.getCrc();
        long long10 = zipArchiveEntry1.getTime();
        byte[] byteArray11 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(byteArray11);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        long long4 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setInternalAttributes(10);
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        java.util.Date date9 = zipArchiveEntry1.getLastModifiedDate();
        java.lang.Object obj10 = zipArchiveEntry1.clone();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setPlatform((int) '4');
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = zipArchiveEntry1.getExtraField(zipShort5);
        java.lang.String str7 = zipArchiveEntry1.getComment();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        long long4 = zipArchiveEntry1.getTime();
        java.lang.String str5 = zipArchiveEntry1.getName();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        int int9 = zipArchiveEntry1.getMethod();
        byte[] byteArray10 = zipArchiveEntry1.getLocalFileDataExtra();
        int int11 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setUnixMode(0);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        java.util.Date date3 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry6.setComment("hi!");
        zipArchiveEntry6.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry15.setComment("hi!");
        zipArchiveEntry15.setInternalAttributes((int) (byte) 10);
        int int23 = zipArchiveEntry15.getUnixMode();
        java.lang.String str24 = zipArchiveEntry15.getComment();
        long long25 = zipArchiveEntry15.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry28.setComment("hi!");
        zipArchiveEntry28.setCrc((long) 0);
        long long36 = zipArchiveEntry28.getSize();
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry28.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry39.setComment("hi!");
        long long45 = zipArchiveEntry39.getExternalAttributes();
        zipArchiveEntry39.setTime((long) (short) -1);
        boolean boolean48 = zipArchiveEntry39.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry39.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry28.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry26.setLastAccessTime(fileTime49);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry15.setLastModifiedTime(fileTime49);
        byte[] byteArray53 = zipArchiveEntry15.getLocalFileDataExtra();
        zipArchiveEntry6.setExtra(byteArray53);
        zipArchiveEntry1.setExtra(byteArray53);
        java.util.Date date56 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry58.setName("hi!");
        zipArchiveEntry58.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry64.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray67 = zipArchiveEntry64.getExtraFields();
        zipArchiveEntry64.setComment("hi!");
        zipArchiveEntry64.setInternalAttributes((int) (byte) 10);
        byte[] byteArray72 = zipArchiveEntry64.getCentralDirectoryExtra();
        zipArchiveEntry64.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry76 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry76.setName("hi!");
        zipArchiveEntry76.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray81 = zipArchiveEntry76.getExtraFields();
        java.nio.file.attribute.FileTime fileTime82 = zipArchiveEntry76.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry64.setLastAccessTime(fileTime82);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry58.setLastAccessTime(fileTime82);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry1.setLastModifiedTime(fileTime82);
        zipArchiveEntry1.setInternalAttributes(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(fileTime37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fileTime49);
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(zipExtraFieldArray67);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray81);
        org.junit.Assert.assertNotNull(fileTime82);
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        long long4 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setInternalAttributes(10);
        long long8 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str9 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setName("hi!");
        zipArchiveEntry11.setTime((long) (-1));
        boolean boolean16 = zipArchiveEntry11.isDirectory();
        boolean boolean17 = zipArchiveEntry11.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = zipArchiveEntry19.getExtraFields();
        zipArchiveEntry19.setComment("hi!");
        long long25 = zipArchiveEntry19.getSize();
        java.lang.String str26 = zipArchiveEntry19.getName();
        int int27 = zipArchiveEntry19.getMethod();
        byte[] byteArray28 = zipArchiveEntry19.getLocalFileDataExtra();
        zipArchiveEntry11.setCentralDirectoryExtra(byteArray28);
        java.lang.String str30 = zipArchiveEntry11.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry11.getExtraFields();
        zipArchiveEntry11.setTime((long) 'a');
        zipArchiveEntry11.setName("hi!");
        zipArchiveEntry11.setSize((long) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry11.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray38);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry9.setComment("hi!");
        long long15 = zipArchiveEntry9.getSize();
        java.lang.String str16 = zipArchiveEntry9.getName();
        int int17 = zipArchiveEntry9.getMethod();
        byte[] byteArray18 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray18);
        java.lang.String str20 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = zipArchiveEntry1.getExtraFields();
        java.util.Date date22 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addAsFirstExtraField(zipExtraField23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Wed Dec 31 15:59:59 PST 1969");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        byte[] byteArray8 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.String str4 = zipArchiveEntry1.getName();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        long long6 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setExternalAttributes((long) 0);
        zipArchiveEntry1.setPlatform((int) (byte) 100);
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastAccessTime();
        long long5 = zipArchiveEntry1.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        java.lang.String str7 = zipArchiveEntry1.getName();
        byte[] byteArray8 = zipArchiveEntry1.getCentralDirectoryExtra();
        long long9 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry9.setComment("hi!");
        long long15 = zipArchiveEntry9.getSize();
        java.lang.String str16 = zipArchiveEntry9.getName();
        int int17 = zipArchiveEntry9.getMethod();
        byte[] byteArray18 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray18);
        boolean boolean20 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addExtraField(zipExtraField22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(fileTime21);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setTime((long) (short) -1);
        long long10 = zipArchiveEntry1.getSize();
        int int11 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastAccessTime();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setName("hi!");
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry10.getLastAccessTime();
        long long14 = zipArchiveEntry10.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry10.getCreationTime();
        java.lang.String str16 = zipArchiveEntry10.getName();
        byte[] byteArray17 = zipArchiveEntry10.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray17);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields();
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setCompressedSize(10L);
        zipArchiveEntry1.setMethod((int) (short) 1);
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertNotNull(fileTime7);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setName("hi!");
        zipArchiveEntry8.setTime((long) (-1));
        boolean boolean13 = zipArchiveEntry8.isDirectory();
        boolean boolean14 = zipArchiveEntry8.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry16.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = zipArchiveEntry16.getExtraFields();
        zipArchiveEntry16.setComment("hi!");
        long long22 = zipArchiveEntry16.getSize();
        java.lang.String str23 = zipArchiveEntry16.getName();
        int int24 = zipArchiveEntry16.getMethod();
        byte[] byteArray25 = zipArchiveEntry16.getLocalFileDataExtra();
        zipArchiveEntry8.setCentralDirectoryExtra(byteArray25);
        java.lang.String str27 = zipArchiveEntry8.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry8.getExtraFields();
        zipArchiveEntry8.setTime((long) 'a');
        zipArchiveEntry8.setName("hi!");
        zipArchiveEntry8.setSize((long) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean37 = zipArchiveEntry36.isDirectory();
        java.util.Date date38 = zipArchiveEntry36.getLastModifiedDate();
        byte[] byteArray39 = zipArchiveEntry36.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = zipArchiveEntry41.getExtraFields();
        zipArchiveEntry41.setComment("hi!");
        zipArchiveEntry41.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray53 = zipArchiveEntry50.getExtraFields();
        zipArchiveEntry50.setComment("hi!");
        zipArchiveEntry50.setInternalAttributes((int) (byte) 10);
        int int58 = zipArchiveEntry50.getUnixMode();
        java.lang.String str59 = zipArchiveEntry50.getComment();
        long long60 = zipArchiveEntry50.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry61 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry63 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry63.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray66 = zipArchiveEntry63.getExtraFields();
        zipArchiveEntry63.setComment("hi!");
        zipArchiveEntry63.setCrc((long) 0);
        long long71 = zipArchiveEntry63.getSize();
        java.nio.file.attribute.FileTime fileTime72 = zipArchiveEntry63.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry74 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry74.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray77 = zipArchiveEntry74.getExtraFields();
        zipArchiveEntry74.setComment("hi!");
        long long80 = zipArchiveEntry74.getExternalAttributes();
        zipArchiveEntry74.setTime((long) (short) -1);
        boolean boolean83 = zipArchiveEntry74.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime84 = zipArchiveEntry74.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry63.setCreationTime(fileTime84);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry61.setLastAccessTime(fileTime84);
        java.util.zip.ZipEntry zipEntry87 = zipArchiveEntry50.setLastModifiedTime(fileTime84);
        byte[] byteArray88 = zipArchiveEntry50.getLocalFileDataExtra();
        zipArchiveEntry41.setExtra(byteArray88);
        zipArchiveEntry36.setExtra(byteArray88);
        int int91 = zipArchiveEntry36.getUnixMode();
        java.util.Date date92 = zipArchiveEntry36.getLastModifiedDate();
        byte[] byteArray93 = zipArchiveEntry36.getCentralDirectoryExtra();
        zipArchiveEntry8.setExtra(byteArray93);
        boolean boolean95 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertNotNull(zipExtraFieldArray53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray66);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1L) + "'", long71 == (-1L));
        org.junit.Assert.assertNull(fileTime72);
        org.junit.Assert.assertNotNull(zipExtraFieldArray77);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(fileTime84);
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry87);
        org.junit.Assert.assertEquals(zipEntry87.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray88), "[]");
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(date92);
        org.junit.Assert.assertEquals(date92.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray93), "[]");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 100);
        long long7 = zipArchiveEntry1.getCrc();
        zipArchiveEntry1.setExtra();
        java.lang.String str9 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setCompressedSize((long) '#');
        byte[] byteArray5 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean8 = zipArchiveEntry1.isDirectory();
        int int9 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setCompressedSize((long) (byte) 0);
        boolean boolean14 = zipArchiveEntry11.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry11.getExtraFields();
        java.util.Date date16 = zipArchiveEntry11.getLastModifiedDate();
        boolean boolean17 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry11);
        java.util.Date date18 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Dec 31 15:59:59 PST 1969");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        boolean boolean4 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setExtra();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = zipArchiveEntry1.getExtraField(zipShort5);
        byte[] byteArray7 = zipArchiveEntry1.getExtra();
        java.lang.String str8 = zipArchiveEntry1.getComment();
        java.util.Date date9 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setComment("hi!");
        int int12 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        int int9 = zipArchiveEntry1.getMethod();
        byte[] byteArray10 = zipArchiveEntry1.getLocalFileDataExtra();
        int int11 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setUnixMode(0);
        zipArchiveEntry1.setExtra();
        zipArchiveEntry1.setUnixMode((int) (short) 100);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setTime((long) (short) -1);
        boolean boolean10 = zipArchiveEntry1.isSupportedCompressionMethod();
        byte[] byteArray11 = zipArchiveEntry1.getExtra();
        long long12 = zipArchiveEntry1.getSize();
        long long13 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str14 = zipArchiveEntry1.getComment();
        java.lang.String str15 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setCompressedSize((long) (byte) 0);
        zipArchiveEntry17.setCompressedSize(1L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry24.setComment("hi!");
        zipArchiveEntry24.setCrc((long) 0);
        long long32 = zipArchiveEntry24.getSize();
        java.nio.file.attribute.FileTime fileTime33 = zipArchiveEntry24.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry35.getExtraFields();
        zipArchiveEntry35.setComment("hi!");
        long long41 = zipArchiveEntry35.getExternalAttributes();
        zipArchiveEntry35.setTime((long) (short) -1);
        boolean boolean44 = zipArchiveEntry35.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime45 = zipArchiveEntry35.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry46 = zipArchiveEntry24.setCreationTime(fileTime45);
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry22.setLastAccessTime(fileTime45);
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry17.setLastAccessTime(fileTime45);
        java.util.zip.ZipEntry zipEntry49 = zipArchiveEntry1.setCreationTime(fileTime45);
        java.nio.file.attribute.FileTime fileTime50 = zipEntry49.getLastAccessTime();
        java.lang.String str51 = zipEntry49.toString();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNull(fileTime33);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fileTime45);
        org.junit.Assert.assertNotNull(zipEntry46);
        org.junit.Assert.assertEquals(zipEntry46.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry49);
        org.junit.Assert.assertEquals(zipEntry49.toString(), "hi!");
        org.junit.Assert.assertNull(fileTime50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        zipArchiveEntry1.setCompressedSize(1L);
        zipArchiveEntry1.setComment("hi!");
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        long long9 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setComment("");
        java.lang.String str12 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry14.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry14.getExtraFields();
        zipArchiveEntry14.setComment("hi!");
        zipArchiveEntry14.setInternalAttributes((int) (byte) 10);
        byte[] byteArray22 = zipArchiveEntry14.getCentralDirectoryExtra();
        zipArchiveEntry14.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry26.setName("hi!");
        zipArchiveEntry26.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry26.getExtraFields();
        java.nio.file.attribute.FileTime fileTime32 = zipArchiveEntry26.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry33 = zipArchiveEntry14.setLastAccessTime(fileTime32);
        java.util.zip.ZipEntry zipEntry34 = zipArchiveEntry1.setLastModifiedTime(fileTime32);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertNotNull(fileTime32);
        org.junit.Assert.assertNotNull(zipEntry33);
        org.junit.Assert.assertEquals(zipEntry33.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry34);
        org.junit.Assert.assertEquals(zipEntry34.toString(), "");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setTime((long) (short) -1);
        boolean boolean10 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setName("hi!");
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry12.getLastAccessTime();
        long long16 = zipArchiveEntry12.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry12.getCreationTime();
        byte[] byteArray18 = zipArchiveEntry12.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean22 = zipArchiveEntry21.isDirectory();
        int int23 = zipArchiveEntry21.getUnixMode();
        java.lang.Object obj24 = zipArchiveEntry21.clone();
        zipArchiveEntry21.setExtra();
        long long26 = zipArchiveEntry21.getSize();
        boolean boolean27 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry21);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setCompressedSize((long) (byte) 0);
        zipArchiveEntry29.setCompressedSize(1L);
        zipArchiveEntry29.setComment("hi!");
        java.util.Date date36 = zipArchiveEntry29.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry39.setComment("hi!");
        zipArchiveEntry39.setCrc((long) 0);
        long long47 = zipArchiveEntry39.getSize();
        java.nio.file.attribute.FileTime fileTime48 = zipArchiveEntry39.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray53 = zipArchiveEntry50.getExtraFields();
        zipArchiveEntry50.setComment("hi!");
        long long56 = zipArchiveEntry50.getExternalAttributes();
        zipArchiveEntry50.setTime((long) (short) -1);
        boolean boolean59 = zipArchiveEntry50.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime60 = zipArchiveEntry50.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry61 = zipArchiveEntry39.setCreationTime(fileTime60);
        java.util.zip.ZipEntry zipEntry62 = zipArchiveEntry37.setLastAccessTime(fileTime60);
        java.util.zip.ZipEntry zipEntry63 = zipArchiveEntry29.setCreationTime(fileTime60);
        java.util.zip.ZipEntry zipEntry64 = zipArchiveEntry21.setLastModifiedTime(fileTime60);
        boolean boolean65 = zipArchiveEntry21.isDirectory();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNull(fileTime48);
        org.junit.Assert.assertNotNull(zipExtraFieldArray53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(fileTime60);
        org.junit.Assert.assertNotNull(zipEntry61);
        org.junit.Assert.assertEquals(zipEntry61.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry62);
        org.junit.Assert.assertEquals(zipEntry62.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry63);
        org.junit.Assert.assertEquals(zipEntry63.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry64);
        org.junit.Assert.assertEquals(zipEntry64.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = zipArchiveEntry1.getExtraField(zipShort5);
        long long7 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setPlatform((int) (short) 10);
        java.lang.Object obj11 = zipArchiveEntry1.clone();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        boolean boolean12 = zipArchiveEntry1.isSupportedCompressionMethod();
        java.lang.String str13 = zipArchiveEntry1.getComment();
        long long14 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 100);
        long long17 = zipArchiveEntry1.getExternalAttributes();
        byte[] byteArray18 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setPlatform((int) '#');
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        int int7 = zipArchiveEntry1.getMethod();
        byte[] byteArray8 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime9 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNull(fileTime9);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        java.util.Date date3 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.lang.String str6 = zipArchiveEntry1.getName();
        long long7 = zipArchiveEntry1.getCompressedSize();
        boolean boolean9 = zipArchiveEntry1.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry2.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry2.getExtraFields();
        zipArchiveEntry2.setComment("hi!");
        zipArchiveEntry2.setCrc((long) 0);
        long long10 = zipArchiveEntry2.getSize();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry2.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry13.getExtraFields();
        zipArchiveEntry13.setComment("hi!");
        long long19 = zipArchiveEntry13.getExternalAttributes();
        zipArchiveEntry13.setTime((long) (short) -1);
        boolean boolean22 = zipArchiveEntry13.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry13.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry24 = zipArchiveEntry2.setCreationTime(fileTime23);
        java.util.zip.ZipEntry zipEntry25 = zipArchiveEntry0.setLastAccessTime(fileTime23);
        long long26 = zipArchiveEntry0.getTime();
        zipArchiveEntry0.setInternalAttributes(8);
        zipArchiveEntry0.setSize((long) (byte) 10);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fileTime23);
        org.junit.Assert.assertNotNull(zipEntry24);
        org.junit.Assert.assertEquals(zipEntry24.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry25);
        org.junit.Assert.assertEquals(zipEntry25.toString(), "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        java.lang.String str3 = zipArchiveEntry1.getName();
        byte[] byteArray4 = zipArchiveEntry1.getLocalFileDataExtra();
        byte[] byteArray5 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastAccessTime();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        int int6 = zipArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = zipArchiveEntry8.getExtraFields();
        zipArchiveEntry8.setComment("hi!");
        zipArchiveEntry8.setInternalAttributes((int) (byte) 10);
        byte[] byteArray16 = zipArchiveEntry8.getCentralDirectoryExtra();
        zipArchiveEntry8.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = zipArchiveEntry8.getExtraField(zipShort19);
        java.lang.String str21 = zipArchiveEntry8.getName();
        int int22 = zipArchiveEntry8.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry24.setComment("hi!");
        zipArchiveEntry24.setCrc((long) 0);
        long long32 = zipArchiveEntry24.getSize();
        java.nio.file.attribute.FileTime fileTime33 = zipArchiveEntry24.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry35.getExtraFields();
        zipArchiveEntry35.setComment("hi!");
        long long41 = zipArchiveEntry35.getExternalAttributes();
        zipArchiveEntry35.setTime((long) (short) -1);
        boolean boolean44 = zipArchiveEntry35.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime45 = zipArchiveEntry35.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry46 = zipArchiveEntry24.setCreationTime(fileTime45);
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry8.setLastModifiedTime(fileTime45);
        java.util.zip.ZipEntry zipEntry48 = zipArchiveEntry1.setCreationTime(fileTime45);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(zipExtraField20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNull(fileTime33);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(fileTime45);
        org.junit.Assert.assertNotNull(zipEntry46);
        org.junit.Assert.assertEquals(zipEntry46.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry48);
        org.junit.Assert.assertEquals(zipEntry48.toString(), "hi!");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        int int9 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry2.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry2.getExtraFields();
        zipArchiveEntry2.setComment("hi!");
        zipArchiveEntry2.setCrc((long) 0);
        long long10 = zipArchiveEntry2.getSize();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry2.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry13.getExtraFields();
        zipArchiveEntry13.setComment("hi!");
        long long19 = zipArchiveEntry13.getExternalAttributes();
        zipArchiveEntry13.setTime((long) (short) -1);
        boolean boolean22 = zipArchiveEntry13.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry13.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry24 = zipArchiveEntry2.setCreationTime(fileTime23);
        java.util.zip.ZipEntry zipEntry25 = zipArchiveEntry0.setLastAccessTime(fileTime23);
        long long26 = zipArchiveEntry0.getTime();
        zipArchiveEntry0.setSize((long) 0);
        zipArchiveEntry0.setPlatform(10);
        boolean boolean31 = zipArchiveEntry0.isDirectory();
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fileTime23);
        org.junit.Assert.assertNotNull(zipEntry24);
        org.junit.Assert.assertEquals(zipEntry24.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry25);
        org.junit.Assert.assertEquals(zipEntry25.toString(), "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry14.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry14.getExtraFields();
        zipArchiveEntry14.setComment("hi!");
        zipArchiveEntry14.setCrc((long) 0);
        long long22 = zipArchiveEntry14.getSize();
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry14.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry25.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry25.setComment("hi!");
        long long31 = zipArchiveEntry25.getExternalAttributes();
        zipArchiveEntry25.setTime((long) (short) -1);
        boolean boolean34 = zipArchiveEntry25.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime35 = zipArchiveEntry25.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry36 = zipArchiveEntry14.setCreationTime(fileTime35);
        java.util.zip.ZipEntry zipEntry37 = zipArchiveEntry12.setLastAccessTime(fileTime35);
        java.util.zip.ZipEntry zipEntry38 = zipArchiveEntry1.setLastModifiedTime(fileTime35);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry40.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = zipArchiveEntry40.getExtraFields();
        zipArchiveEntry40.setComment("hi!");
        zipArchiveEntry40.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry49 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry49.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray52 = zipArchiveEntry49.getExtraFields();
        zipArchiveEntry49.setComment("hi!");
        zipArchiveEntry49.setInternalAttributes((int) (byte) 10);
        int int57 = zipArchiveEntry49.getUnixMode();
        java.lang.String str58 = zipArchiveEntry49.getComment();
        long long59 = zipArchiveEntry49.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry62.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray65 = zipArchiveEntry62.getExtraFields();
        zipArchiveEntry62.setComment("hi!");
        zipArchiveEntry62.setCrc((long) 0);
        long long70 = zipArchiveEntry62.getSize();
        java.nio.file.attribute.FileTime fileTime71 = zipArchiveEntry62.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry73 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry73.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray76 = zipArchiveEntry73.getExtraFields();
        zipArchiveEntry73.setComment("hi!");
        long long79 = zipArchiveEntry73.getExternalAttributes();
        zipArchiveEntry73.setTime((long) (short) -1);
        boolean boolean82 = zipArchiveEntry73.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime83 = zipArchiveEntry73.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry62.setCreationTime(fileTime83);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry60.setLastAccessTime(fileTime83);
        java.util.zip.ZipEntry zipEntry86 = zipArchiveEntry49.setLastModifiedTime(fileTime83);
        byte[] byteArray87 = zipArchiveEntry49.getLocalFileDataExtra();
        zipArchiveEntry40.setExtra(byteArray87);
        byte[] byteArray89 = zipArchiveEntry40.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray89);
        long long91 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fileTime35);
        org.junit.Assert.assertNotNull(zipEntry36);
        org.junit.Assert.assertEquals(zipEntry36.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry37);
        org.junit.Assert.assertEquals(zipEntry37.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry38);
        org.junit.Assert.assertEquals(zipEntry38.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertNotNull(zipExtraFieldArray52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray65);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + (-1L) + "'", long70 == (-1L));
        org.junit.Assert.assertNull(fileTime71);
        org.junit.Assert.assertNotNull(zipExtraFieldArray76);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(fileTime83);
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry86);
        org.junit.Assert.assertEquals(zipEntry86.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[]");
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray89), "[]");
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + (-1L) + "'", long91 == (-1L));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry10.getExtraFields();
        zipArchiveEntry10.setComment("hi!");
        zipArchiveEntry10.setInternalAttributes((int) (byte) 10);
        int int18 = zipArchiveEntry10.getUnixMode();
        java.lang.String str19 = zipArchiveEntry10.getComment();
        long long20 = zipArchiveEntry10.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry23.getExtraFields();
        zipArchiveEntry23.setComment("hi!");
        zipArchiveEntry23.setCrc((long) 0);
        long long31 = zipArchiveEntry23.getSize();
        java.nio.file.attribute.FileTime fileTime32 = zipArchiveEntry23.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = zipArchiveEntry34.getExtraFields();
        zipArchiveEntry34.setComment("hi!");
        long long40 = zipArchiveEntry34.getExternalAttributes();
        zipArchiveEntry34.setTime((long) (short) -1);
        boolean boolean43 = zipArchiveEntry34.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime44 = zipArchiveEntry34.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry45 = zipArchiveEntry23.setCreationTime(fileTime44);
        java.util.zip.ZipEntry zipEntry46 = zipArchiveEntry21.setLastAccessTime(fileTime44);
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry10.setLastModifiedTime(fileTime44);
        byte[] byteArray48 = zipArchiveEntry10.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray48);
        byte[] byteArray50 = zipArchiveEntry1.getLocalFileDataExtra();
        long long51 = zipArchiveEntry1.getSize();
        boolean boolean52 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNull(fileTime32);
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(fileTime44);
        org.junit.Assert.assertNotNull(zipEntry45);
        org.junit.Assert.assertEquals(zipEntry45.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry46);
        org.junit.Assert.assertEquals(zipEntry46.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[]");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.String str4 = zipArchiveEntry1.getName();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        long long6 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setExternalAttributes((long) 0);
        int int9 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean12 = zipArchiveEntry11.isDirectory();
        int int13 = zipArchiveEntry11.getUnixMode();
        java.lang.String str14 = zipArchiveEntry11.getName();
        boolean boolean15 = zipArchiveEntry11.isDirectory();
        long long16 = zipArchiveEntry11.getCompressedSize();
        zipArchiveEntry11.setExternalAttributes((long) 0);
        zipArchiveEntry11.setPlatform((int) (byte) 100);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry22.setName("hi!");
        long long25 = zipArchiveEntry22.getExternalAttributes();
        boolean boolean26 = zipArchiveEntry22.isDirectory();
        zipArchiveEntry22.setInternalAttributes(10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray29 = zipArchiveEntry22.getExtraFields();
        zipArchiveEntry22.setInternalAttributes((int) (short) 1);
        byte[] byteArray32 = zipArchiveEntry22.getCentralDirectoryExtra();
        zipArchiveEntry11.setCentralDirectoryExtra(byteArray32);
        zipArchiveEntry1.setExtra(byteArray32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry9.setComment("hi!");
        long long15 = zipArchiveEntry9.getSize();
        java.lang.String str16 = zipArchiveEntry9.getName();
        int int17 = zipArchiveEntry9.getMethod();
        byte[] byteArray18 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray18);
        byte[] byteArray20 = zipArchiveEntry1.getCentralDirectoryExtra();
        boolean boolean21 = zipArchiveEntry1.isDirectory();
        boolean boolean22 = zipArchiveEntry1.isSupportedCompressionMethod();
        zipArchiveEntry1.setPlatform((int) (byte) 0);
        byte[] byteArray25 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime3 = zipArchiveEntry1.getCreationTime();
        zipArchiveEntry1.setInternalAttributes((int) (short) -1);
        zipArchiveEntry1.setExternalAttributes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addExtraField(zipExtraField8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime3);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastAccessTime();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        boolean boolean12 = zipArchiveEntry1.isSupportedCompressionMethod();
        zipArchiveEntry1.setName("hi!");
        long long15 = zipArchiveEntry1.getTime();
        int int16 = zipArchiveEntry1.getMethod();
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry1.getCreationTime();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(fileTime17);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry13.getExtraFields();
        zipArchiveEntry13.setComment("hi!");
        zipArchiveEntry13.setCrc((long) 0);
        long long21 = zipArchiveEntry13.getSize();
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry13.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry24.setComment("hi!");
        long long30 = zipArchiveEntry24.getExternalAttributes();
        zipArchiveEntry24.setTime((long) (short) -1);
        boolean boolean33 = zipArchiveEntry24.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry24.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry35 = zipArchiveEntry13.setCreationTime(fileTime34);
        java.util.zip.ZipEntry zipEntry36 = zipArchiveEntry11.setLastAccessTime(fileTime34);
        java.util.zip.ZipEntry zipEntry37 = zipArchiveEntry1.setLastModifiedTime(fileTime34);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort38 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField39 = zipArchiveEntry1.getExtraField(zipShort38);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField40 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addAsFirstExtraField(zipExtraField40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(fileTime22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fileTime34);
        org.junit.Assert.assertNotNull(zipEntry35);
        org.junit.Assert.assertEquals(zipEntry35.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry36);
        org.junit.Assert.assertEquals(zipEntry36.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry37);
        org.junit.Assert.assertEquals(zipEntry37.toString(), "hi!");
        org.junit.Assert.assertNull(zipExtraField39);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        long long4 = zipArchiveEntry1.getTime();
        java.util.Date date5 = zipArchiveEntry1.getLastModifiedDate();
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setMethod((int) 'a');
        zipArchiveEntry1.setTime(10L);
        zipArchiveEntry1.setCompressedSize((-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 15:59:59 PST 1969");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.String str4 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry6.setComment("hi!");
        zipArchiveEntry6.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry15.setComment("hi!");
        zipArchiveEntry15.setInternalAttributes((int) (byte) 10);
        int int23 = zipArchiveEntry15.getUnixMode();
        java.lang.String str24 = zipArchiveEntry15.getComment();
        long long25 = zipArchiveEntry15.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry28.setComment("hi!");
        zipArchiveEntry28.setCrc((long) 0);
        long long36 = zipArchiveEntry28.getSize();
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry28.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry39.setComment("hi!");
        long long45 = zipArchiveEntry39.getExternalAttributes();
        zipArchiveEntry39.setTime((long) (short) -1);
        boolean boolean48 = zipArchiveEntry39.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry39.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry28.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry26.setLastAccessTime(fileTime49);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry15.setLastModifiedTime(fileTime49);
        byte[] byteArray53 = zipArchiveEntry15.getLocalFileDataExtra();
        zipArchiveEntry6.setExtra(byteArray53);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray53);
        boolean boolean56 = zipArchiveEntry1.isSupportedCompressionMethod();
        java.lang.String str57 = zipArchiveEntry1.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(fileTime37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fileTime49);
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        java.lang.String str11 = zipArchiveEntry1.getName();
        java.lang.String str12 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setExternalAttributes((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastModifiedTime();
        long long9 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = zipArchiveEntry1.getExtraField(zipShort10);
        zipArchiveEntry1.setExternalAttributes(0L);
        java.lang.String str14 = zipArchiveEntry1.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(fileTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(zipExtraField11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        boolean boolean12 = zipArchiveEntry1.isSupportedCompressionMethod();
        java.lang.String str13 = zipArchiveEntry1.getComment();
        long long14 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 100);
        java.lang.String str17 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = zipArchiveEntry20.getExtraFields();
        zipArchiveEntry20.setComment("hi!");
        long long26 = zipArchiveEntry20.getExternalAttributes();
        zipArchiveEntry20.setTime((long) (short) -1);
        boolean boolean29 = zipArchiveEntry20.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setName("hi!");
        java.nio.file.attribute.FileTime fileTime34 = zipArchiveEntry31.getLastAccessTime();
        long long35 = zipArchiveEntry31.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime36 = zipArchiveEntry31.getCreationTime();
        byte[] byteArray37 = zipArchiveEntry31.getCentralDirectoryExtra();
        zipArchiveEntry20.setExtra(byteArray37);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean41 = zipArchiveEntry40.isDirectory();
        int int42 = zipArchiveEntry40.getUnixMode();
        java.lang.Object obj43 = zipArchiveEntry40.clone();
        zipArchiveEntry40.setExtra();
        long long45 = zipArchiveEntry40.getSize();
        boolean boolean46 = zipArchiveEntry20.equals((java.lang.Object) zipArchiveEntry40);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry48.setCompressedSize((long) (byte) 0);
        zipArchiveEntry48.setCompressedSize(1L);
        zipArchiveEntry48.setComment("hi!");
        java.util.Date date55 = zipArchiveEntry48.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry58.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray61 = zipArchiveEntry58.getExtraFields();
        zipArchiveEntry58.setComment("hi!");
        zipArchiveEntry58.setCrc((long) 0);
        long long66 = zipArchiveEntry58.getSize();
        java.nio.file.attribute.FileTime fileTime67 = zipArchiveEntry58.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry69.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray72 = zipArchiveEntry69.getExtraFields();
        zipArchiveEntry69.setComment("hi!");
        long long75 = zipArchiveEntry69.getExternalAttributes();
        zipArchiveEntry69.setTime((long) (short) -1);
        boolean boolean78 = zipArchiveEntry69.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime79 = zipArchiveEntry69.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry80 = zipArchiveEntry58.setCreationTime(fileTime79);
        java.util.zip.ZipEntry zipEntry81 = zipArchiveEntry56.setLastAccessTime(fileTime79);
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry48.setCreationTime(fileTime79);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry40.setLastModifiedTime(fileTime79);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry1.setLastAccessTime(fileTime79);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry86 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry86.setCompressedSize((long) (byte) 0);
        zipArchiveEntry86.setCompressedSize(1L);
        zipArchiveEntry86.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray93 = zipArchiveEntry86.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray93);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(fileTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(fileTime36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(date55);
        org.junit.Assert.assertEquals(date55.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(zipExtraFieldArray61);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNull(fileTime67);
        org.junit.Assert.assertNotNull(zipExtraFieldArray72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(fileTime79);
        org.junit.Assert.assertNotNull(zipEntry80);
        org.junit.Assert.assertEquals(zipEntry80.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry81);
        org.junit.Assert.assertEquals(zipEntry81.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry82);
        org.junit.Assert.assertEquals(zipEntry82.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray93);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setTime((long) (short) -1);
        boolean boolean10 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setName("hi!");
        java.nio.file.attribute.FileTime fileTime15 = zipArchiveEntry12.getLastAccessTime();
        long long16 = zipArchiveEntry12.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry12.getCreationTime();
        byte[] byteArray18 = zipArchiveEntry12.getCentralDirectoryExtra();
        zipArchiveEntry1.setExtra(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean22 = zipArchiveEntry21.isDirectory();
        int int23 = zipArchiveEntry21.getUnixMode();
        java.lang.Object obj24 = zipArchiveEntry21.clone();
        zipArchiveEntry21.setExtra();
        long long26 = zipArchiveEntry21.getSize();
        boolean boolean27 = zipArchiveEntry1.equals((java.lang.Object) zipArchiveEntry21);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setCompressedSize((long) (byte) 0);
        zipArchiveEntry29.setCompressedSize(1L);
        zipArchiveEntry29.setComment("hi!");
        java.util.Date date36 = zipArchiveEntry29.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry37 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry39.setComment("hi!");
        zipArchiveEntry39.setCrc((long) 0);
        long long47 = zipArchiveEntry39.getSize();
        java.nio.file.attribute.FileTime fileTime48 = zipArchiveEntry39.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry50 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry50.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray53 = zipArchiveEntry50.getExtraFields();
        zipArchiveEntry50.setComment("hi!");
        long long56 = zipArchiveEntry50.getExternalAttributes();
        zipArchiveEntry50.setTime((long) (short) -1);
        boolean boolean59 = zipArchiveEntry50.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime60 = zipArchiveEntry50.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry61 = zipArchiveEntry39.setCreationTime(fileTime60);
        java.util.zip.ZipEntry zipEntry62 = zipArchiveEntry37.setLastAccessTime(fileTime60);
        java.util.zip.ZipEntry zipEntry63 = zipArchiveEntry29.setCreationTime(fileTime60);
        java.util.zip.ZipEntry zipEntry64 = zipArchiveEntry21.setLastModifiedTime(fileTime60);
        byte[] byteArray65 = zipArchiveEntry21.getCentralDirectoryExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date36);
        org.junit.Assert.assertEquals(date36.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNull(fileTime48);
        org.junit.Assert.assertNotNull(zipExtraFieldArray53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(fileTime60);
        org.junit.Assert.assertNotNull(zipEntry61);
        org.junit.Assert.assertEquals(zipEntry61.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry62);
        org.junit.Assert.assertEquals(zipEntry62.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry63);
        org.junit.Assert.assertEquals(zipEntry63.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry64);
        org.junit.Assert.assertEquals(zipEntry64.toString(), "");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[]");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry2.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry2.getExtraFields();
        zipArchiveEntry2.setComment("hi!");
        zipArchiveEntry2.setCrc((long) 0);
        long long10 = zipArchiveEntry2.getSize();
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry2.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry13 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry13.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = zipArchiveEntry13.getExtraFields();
        zipArchiveEntry13.setComment("hi!");
        long long19 = zipArchiveEntry13.getExternalAttributes();
        zipArchiveEntry13.setTime((long) (short) -1);
        boolean boolean22 = zipArchiveEntry13.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry13.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry24 = zipArchiveEntry2.setCreationTime(fileTime23);
        java.util.zip.ZipEntry zipEntry25 = zipArchiveEntry0.setLastAccessTime(fileTime23);
        long long26 = zipArchiveEntry0.getTime();
        zipArchiveEntry0.setSize((long) 0);
        zipArchiveEntry0.setPlatform(10);
        java.util.Date date31 = zipArchiveEntry0.getLastModifiedDate();
        zipArchiveEntry0.setExternalAttributes(97L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(fileTime11);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fileTime23);
        org.junit.Assert.assertNotNull(zipEntry24);
        org.junit.Assert.assertEquals(zipEntry24.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry25);
        org.junit.Assert.assertEquals(zipEntry25.toString(), "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed Dec 31 15:59:59 PST 1969");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        boolean boolean12 = zipArchiveEntry1.isSupportedCompressionMethod();
        java.lang.String str13 = zipArchiveEntry1.getComment();
        long long14 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setInternalAttributes((int) (byte) 100);
        zipArchiveEntry1.setTime((long) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry20.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = zipArchiveEntry20.getExtraFields();
        zipArchiveEntry20.setComment("hi!");
        long long26 = zipArchiveEntry20.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setName("hi!");
        zipArchiveEntry28.setTime((long) (-1));
        boolean boolean33 = zipArchiveEntry28.isDirectory();
        boolean boolean34 = zipArchiveEntry28.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray39 = zipArchiveEntry36.getExtraFields();
        zipArchiveEntry36.setComment("hi!");
        long long42 = zipArchiveEntry36.getSize();
        boolean boolean43 = zipArchiveEntry28.equals((java.lang.Object) long42);
        boolean boolean44 = zipArchiveEntry20.equals((java.lang.Object) long42);
        long long45 = zipArchiveEntry20.getCompressedSize();
        boolean boolean46 = zipArchiveEntry1.equals((java.lang.Object) long45);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray39);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.String str4 = zipArchiveEntry1.getName();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        long long6 = zipArchiveEntry1.getCompressedSize();
        zipArchiveEntry1.setExternalAttributes((long) 0);
        int int9 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setUnixMode((int) '4');
        zipArchiveEntry1.setPlatform((int) (short) 1);
        zipArchiveEntry1.setCompressedSize(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setName("hi!");
        zipArchiveEntry17.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry23.getExtraFields();
        zipArchiveEntry23.setComment("hi!");
        zipArchiveEntry23.setInternalAttributes((int) (byte) 10);
        byte[] byteArray31 = zipArchiveEntry23.getCentralDirectoryExtra();
        zipArchiveEntry23.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setName("hi!");
        zipArchiveEntry35.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = zipArchiveEntry35.getExtraFields();
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry35.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry42 = zipArchiveEntry23.setLastAccessTime(fileTime41);
        java.util.zip.ZipEntry zipEntry43 = zipArchiveEntry17.setLastAccessTime(fileTime41);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry45.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = zipArchiveEntry45.getExtraFields();
        zipArchiveEntry45.setComment("hi!");
        long long51 = zipArchiveEntry45.getSize();
        java.lang.String str52 = zipArchiveEntry45.getName();
        int int53 = zipArchiveEntry45.getMethod();
        byte[] byteArray54 = zipArchiveEntry45.getLocalFileDataExtra();
        zipArchiveEntry17.setCentralDirectoryExtra(byteArray54);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertNotNull(fileTime41);
        org.junit.Assert.assertNotNull(zipEntry42);
        org.junit.Assert.assertEquals(zipEntry42.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry43);
        org.junit.Assert.assertEquals(zipEntry43.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        boolean boolean4 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray9);
        zipArchiveEntry1.setInternalAttributes((int) (short) 1);
        int int13 = zipArchiveEntry1.getMethod();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        boolean boolean4 = zipArchiveEntry1.isDirectory();
        int int5 = zipArchiveEntry1.getPlatform();
        java.lang.String str6 = zipArchiveEntry1.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastAccessTime();
        int int9 = zipArchiveEntry1.getPlatform();
        long long10 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setCompressedSize((long) (byte) 0);
        long long15 = zipArchiveEntry12.getTime();
        zipArchiveEntry12.setExternalAttributes(100L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setName("hi!");
        java.nio.file.attribute.FileTime fileTime22 = zipArchiveEntry19.getLastAccessTime();
        long long23 = zipArchiveEntry19.getExternalAttributes();
        long long24 = zipArchiveEntry19.getCrc();
        boolean boolean25 = zipArchiveEntry19.isDirectory();
        java.lang.Object obj26 = zipArchiveEntry19.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry29 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry29.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = zipArchiveEntry29.getExtraFields();
        zipArchiveEntry29.setComment("hi!");
        zipArchiveEntry29.setCrc((long) 0);
        long long37 = zipArchiveEntry29.getSize();
        java.nio.file.attribute.FileTime fileTime38 = zipArchiveEntry29.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry40 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry40.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray43 = zipArchiveEntry40.getExtraFields();
        zipArchiveEntry40.setComment("hi!");
        long long46 = zipArchiveEntry40.getExternalAttributes();
        zipArchiveEntry40.setTime((long) (short) -1);
        boolean boolean49 = zipArchiveEntry40.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime50 = zipArchiveEntry40.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry29.setCreationTime(fileTime50);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry27.setLastAccessTime(fileTime50);
        boolean boolean53 = zipArchiveEntry27.isSupportedCompressionMethod();
        zipArchiveEntry27.setComment("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry56 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry58.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray61 = zipArchiveEntry58.getExtraFields();
        zipArchiveEntry58.setComment("hi!");
        zipArchiveEntry58.setCrc((long) 0);
        long long66 = zipArchiveEntry58.getSize();
        java.nio.file.attribute.FileTime fileTime67 = zipArchiveEntry58.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry69.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray72 = zipArchiveEntry69.getExtraFields();
        zipArchiveEntry69.setComment("hi!");
        long long75 = zipArchiveEntry69.getExternalAttributes();
        zipArchiveEntry69.setTime((long) (short) -1);
        boolean boolean78 = zipArchiveEntry69.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime79 = zipArchiveEntry69.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry80 = zipArchiveEntry58.setCreationTime(fileTime79);
        java.util.zip.ZipEntry zipEntry81 = zipArchiveEntry56.setLastAccessTime(fileTime79);
        java.util.zip.ZipEntry zipEntry82 = zipArchiveEntry27.setCreationTime(fileTime79);
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry19.setCreationTime(fileTime79);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry12.setCreationTime(fileTime79);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry1.setLastAccessTime(fileTime79);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort86 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField87 = zipArchiveEntry1.getExtraField(zipShort86);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(fileTime22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(fileTime38);
        org.junit.Assert.assertNotNull(zipExtraFieldArray43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(fileTime50);
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray61);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertNull(fileTime67);
        org.junit.Assert.assertNotNull(zipExtraFieldArray72);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(fileTime79);
        org.junit.Assert.assertNotNull(zipEntry80);
        org.junit.Assert.assertEquals(zipEntry80.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry81);
        org.junit.Assert.assertEquals(zipEntry81.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry82);
        org.junit.Assert.assertEquals(zipEntry82.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "hi!");
        org.junit.Assert.assertNull(zipExtraField87);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        java.util.Date date3 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry6.setComment("hi!");
        zipArchiveEntry6.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry15.setComment("hi!");
        zipArchiveEntry15.setInternalAttributes((int) (byte) 10);
        int int23 = zipArchiveEntry15.getUnixMode();
        java.lang.String str24 = zipArchiveEntry15.getComment();
        long long25 = zipArchiveEntry15.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry28.setComment("hi!");
        zipArchiveEntry28.setCrc((long) 0);
        long long36 = zipArchiveEntry28.getSize();
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry28.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry39.setComment("hi!");
        long long45 = zipArchiveEntry39.getExternalAttributes();
        zipArchiveEntry39.setTime((long) (short) -1);
        boolean boolean48 = zipArchiveEntry39.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry39.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry28.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry26.setLastAccessTime(fileTime49);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry15.setLastModifiedTime(fileTime49);
        byte[] byteArray53 = zipArchiveEntry15.getLocalFileDataExtra();
        zipArchiveEntry6.setExtra(byteArray53);
        zipArchiveEntry1.setExtra(byteArray53);
        java.util.Date date56 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray57 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setSize((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(fileTime37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fileTime49);
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        zipArchiveEntry1.setCompressedSize(1L);
        zipArchiveEntry1.setComment("hi!");
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.Object obj10 = zipArchiveEntry1.clone();
        int int11 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        long long9 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setName("hi!");
        zipArchiveEntry10.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry10.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray15);
        long long17 = zipArchiveEntry1.getCrc();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        byte[] byteArray9 = zipArchiveEntry1.getCentralDirectoryExtra();
        zipArchiveEntry1.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = zipArchiveEntry1.getExtraField(zipShort12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setCrc((long) (short) 1);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastAccessTime();
        int int9 = zipArchiveEntry1.getPlatform();
        zipArchiveEntry1.setInternalAttributes((int) (short) 10);
        byte[] byteArray12 = zipArchiveEntry1.getLocalFileDataExtra();
        zipArchiveEntry1.setCrc((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        int int9 = zipArchiveEntry1.getPlatform();
        int int10 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setCompressedSize((long) (byte) 0);
        zipArchiveEntry12.setCompressedSize(1L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setName("hi!");
        long long21 = zipArchiveEntry18.getExternalAttributes();
        boolean boolean22 = zipArchiveEntry18.isDirectory();
        zipArchiveEntry18.setCrc((long) ' ');
        zipArchiveEntry18.setInternalAttributes(3);
        byte[] byteArray27 = zipArchiveEntry18.getCentralDirectoryExtra();
        zipArchiveEntry12.setExtra(byteArray27);
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray27);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry10.getExtraFields();
        zipArchiveEntry10.setComment("hi!");
        zipArchiveEntry10.setInternalAttributes((int) (byte) 10);
        int int18 = zipArchiveEntry10.getUnixMode();
        java.lang.String str19 = zipArchiveEntry10.getComment();
        long long20 = zipArchiveEntry10.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray26 = zipArchiveEntry23.getExtraFields();
        zipArchiveEntry23.setComment("hi!");
        zipArchiveEntry23.setCrc((long) 0);
        long long31 = zipArchiveEntry23.getSize();
        java.nio.file.attribute.FileTime fileTime32 = zipArchiveEntry23.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry34 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry34.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = zipArchiveEntry34.getExtraFields();
        zipArchiveEntry34.setComment("hi!");
        long long40 = zipArchiveEntry34.getExternalAttributes();
        zipArchiveEntry34.setTime((long) (short) -1);
        boolean boolean43 = zipArchiveEntry34.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime44 = zipArchiveEntry34.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry45 = zipArchiveEntry23.setCreationTime(fileTime44);
        java.util.zip.ZipEntry zipEntry46 = zipArchiveEntry21.setLastAccessTime(fileTime44);
        java.util.zip.ZipEntry zipEntry47 = zipArchiveEntry10.setLastModifiedTime(fileTime44);
        byte[] byteArray48 = zipArchiveEntry10.getLocalFileDataExtra();
        zipArchiveEntry1.setExtra(byteArray48);
        zipArchiveEntry1.setExternalAttributes((long) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry53 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry53.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray56 = zipArchiveEntry53.getExtraFields();
        zipArchiveEntry53.setComment("hi!");
        zipArchiveEntry53.setInternalAttributes((int) (byte) 10);
        byte[] byteArray61 = zipArchiveEntry53.getCentralDirectoryExtra();
        zipArchiveEntry53.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry65 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry65.setName("hi!");
        zipArchiveEntry65.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray70 = zipArchiveEntry65.getExtraFields();
        java.nio.file.attribute.FileTime fileTime71 = zipArchiveEntry65.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry53.setLastAccessTime(fileTime71);
        java.util.zip.ZipEntry zipEntry73 = zipArchiveEntry1.setLastModifiedTime(fileTime71);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNull(fileTime32);
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(fileTime44);
        org.junit.Assert.assertNotNull(zipEntry45);
        org.junit.Assert.assertEquals(zipEntry45.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry46);
        org.junit.Assert.assertEquals(zipEntry46.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry47);
        org.junit.Assert.assertEquals(zipEntry47.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray56);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray61), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray70);
        org.junit.Assert.assertNotNull(fileTime71);
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry73);
        org.junit.Assert.assertEquals(zipEntry73.toString(), "hi!");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setCrc((long) 0);
        java.lang.String str9 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setExternalAttributes((long) ' ');
        java.nio.file.attribute.FileTime fileTime12 = zipArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        zipArchiveEntry1.setMethod((int) ' ');
        zipArchiveEntry1.setCompressedSize((long) 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastModifiedTime();
        java.lang.Object obj7 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setComment("");
        java.lang.String str10 = zipArchiveEntry1.toString();
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setTime((long) (short) -1);
        boolean boolean10 = zipArchiveEntry1.isSupportedCompressionMethod();
        byte[] byteArray11 = zipArchiveEntry1.getExtra();
        long long12 = zipArchiveEntry1.getSize();
        long long13 = zipArchiveEntry1.getExternalAttributes();
        java.lang.String str14 = zipArchiveEntry1.getComment();
        java.lang.String str15 = zipArchiveEntry1.getName();
        long long16 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setCompressedSize(0L);
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean22 = zipArchiveEntry21.isDirectory();
        java.util.Date date23 = zipArchiveEntry21.getLastModifiedDate();
        byte[] byteArray24 = zipArchiveEntry21.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry26.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray29 = zipArchiveEntry26.getExtraFields();
        zipArchiveEntry26.setComment("hi!");
        zipArchiveEntry26.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry35.getExtraFields();
        zipArchiveEntry35.setComment("hi!");
        zipArchiveEntry35.setInternalAttributes((int) (byte) 10);
        int int43 = zipArchiveEntry35.getUnixMode();
        java.lang.String str44 = zipArchiveEntry35.getComment();
        long long45 = zipArchiveEntry35.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry46 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry48 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry48.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray51 = zipArchiveEntry48.getExtraFields();
        zipArchiveEntry48.setComment("hi!");
        zipArchiveEntry48.setCrc((long) 0);
        long long56 = zipArchiveEntry48.getSize();
        java.nio.file.attribute.FileTime fileTime57 = zipArchiveEntry48.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray62 = zipArchiveEntry59.getExtraFields();
        zipArchiveEntry59.setComment("hi!");
        long long65 = zipArchiveEntry59.getExternalAttributes();
        zipArchiveEntry59.setTime((long) (short) -1);
        boolean boolean68 = zipArchiveEntry59.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime69 = zipArchiveEntry59.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry70 = zipArchiveEntry48.setCreationTime(fileTime69);
        java.util.zip.ZipEntry zipEntry71 = zipArchiveEntry46.setLastAccessTime(fileTime69);
        java.util.zip.ZipEntry zipEntry72 = zipArchiveEntry35.setLastModifiedTime(fileTime69);
        byte[] byteArray73 = zipArchiveEntry35.getLocalFileDataExtra();
        zipArchiveEntry26.setExtra(byteArray73);
        zipArchiveEntry21.setExtra(byteArray73);
        java.lang.Class<?> wildcardClass76 = byteArray73.getClass();
        boolean boolean77 = zipArchiveEntry1.equals((java.lang.Object) wildcardClass76);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray29);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1L) + "'", long45 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray51);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertNull(fileTime57);
        org.junit.Assert.assertNotNull(zipExtraFieldArray62);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(fileTime69);
        org.junit.Assert.assertNotNull(zipEntry70);
        org.junit.Assert.assertEquals(zipEntry70.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry71);
        org.junit.Assert.assertEquals(zipEntry71.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry72);
        org.junit.Assert.assertEquals(zipEntry72.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime3 = zipArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(fileTime3);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry1.getLastModifiedTime();
        int int8 = zipArchiveEntry1.getPlatform();
        java.lang.String str9 = zipArchiveEntry1.getName();
        int int10 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setCrc(100L);
        zipArchiveEntry1.setPlatform((int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addAsFirstExtraField(zipExtraField9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        java.lang.String str3 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setSize((long) (byte) 100);
        zipArchiveEntry1.setTime(1L);
        zipArchiveEntry1.setExternalAttributes((long) ' ');
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = zipArchiveEntry1.getExtraField(zipShort5);
        long long7 = zipArchiveEntry1.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = zipArchiveEntry10.getExtraFields();
        zipArchiveEntry10.setComment("hi!");
        zipArchiveEntry10.setCrc((long) 0);
        long long18 = zipArchiveEntry10.getSize();
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry10.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry21.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = zipArchiveEntry21.getExtraFields();
        zipArchiveEntry21.setComment("hi!");
        long long27 = zipArchiveEntry21.getExternalAttributes();
        zipArchiveEntry21.setTime((long) (short) -1);
        boolean boolean30 = zipArchiveEntry21.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime31 = zipArchiveEntry21.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry32 = zipArchiveEntry10.setCreationTime(fileTime31);
        java.util.zip.ZipEntry zipEntry33 = zipArchiveEntry8.setLastAccessTime(fileTime31);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry35 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry35.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = zipArchiveEntry35.getExtraFields();
        zipArchiveEntry35.setComment("hi!");
        java.nio.file.attribute.FileTime fileTime41 = zipArchiveEntry35.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry43 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry43.setName("hi!");
        zipArchiveEntry43.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = zipArchiveEntry43.getExtraFields();
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry43.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry35.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry51 = zipEntry33.setLastModifiedTime(fileTime49);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry1.setCreationTime(fileTime49);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fileTime31);
        org.junit.Assert.assertNotNull(zipEntry32);
        org.junit.Assert.assertEquals(zipEntry32.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry33);
        org.junit.Assert.assertEquals(zipEntry33.toString(), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
        org.junit.Assert.assertNull(fileTime41);
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
        org.junit.Assert.assertNotNull(fileTime49);
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "hi!");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = zipArchiveEntry1.getExtraField(zipShort5);
        byte[] byteArray7 = zipArchiveEntry1.getExtra();
        zipArchiveEntry1.setCrc((long) 8);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.addAsFirstExtraField(zipExtraField10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry9.setComment("hi!");
        long long15 = zipArchiveEntry9.getSize();
        java.lang.String str16 = zipArchiveEntry9.getName();
        int int17 = zipArchiveEntry9.getMethod();
        byte[] byteArray18 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray18);
        java.lang.String str20 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setTime((long) 'a');
        zipArchiveEntry1.setName("hi!");
        int int26 = zipArchiveEntry1.getUnixMode();
        java.util.Date date27 = zipArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 16:00:00 PST 1969");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastAccessTime();
        long long5 = zipArchiveEntry1.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getCreationTime();
        java.lang.Object obj7 = zipArchiveEntry1.clone();
        java.lang.String str8 = zipArchiveEntry1.getComment();
        zipArchiveEntry1.setUnixMode((int) (byte) 1);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastAccessTime();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setExternalAttributes((long) 'a');
        long long8 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean9 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(fileTime10);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.String str4 = zipArchiveEntry1.getName();
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastModifiedTime();
        long long6 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        zipArchiveEntry1.setCompressedSize(1L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry8.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = zipArchiveEntry8.getExtraFields();
        zipArchiveEntry8.setComment("hi!");
        zipArchiveEntry8.setCrc((long) 0);
        long long16 = zipArchiveEntry8.getSize();
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry8.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry19.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = zipArchiveEntry19.getExtraFields();
        zipArchiveEntry19.setComment("hi!");
        long long25 = zipArchiveEntry19.getExternalAttributes();
        zipArchiveEntry19.setTime((long) (short) -1);
        boolean boolean28 = zipArchiveEntry19.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime29 = zipArchiveEntry19.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry30 = zipArchiveEntry8.setCreationTime(fileTime29);
        java.util.zip.ZipEntry zipEntry31 = zipArchiveEntry6.setLastAccessTime(fileTime29);
        java.util.zip.ZipEntry zipEntry32 = zipArchiveEntry1.setLastAccessTime(fileTime29);
        int int33 = zipArchiveEntry1.getUnixMode();
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(fileTime29);
        org.junit.Assert.assertNotNull(zipEntry30);
        org.junit.Assert.assertEquals(zipEntry30.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry31);
        org.junit.Assert.assertEquals(zipEntry31.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry32);
        org.junit.Assert.assertEquals(zipEntry32.toString(), "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.String str4 = zipArchiveEntry1.getName();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        java.util.Date date6 = zipArchiveEntry1.getLastModifiedDate();
        long long7 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setComment("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry9.setComment("hi!");
        long long15 = zipArchiveEntry9.getSize();
        boolean boolean16 = zipArchiveEntry1.equals((java.lang.Object) long15);
        java.nio.file.attribute.FileTime fileTime17 = zipArchiveEntry1.getCreationTime();
        java.lang.Object obj18 = zipArchiveEntry1.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(fileTime17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        int int7 = zipArchiveEntry1.getMethod();
        zipArchiveEntry1.setExternalAttributes(10L);
        java.lang.String str10 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = zipArchiveEntry1.getExtraField(zipShort11);
        java.lang.String str13 = zipArchiveEntry1.getComment();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry15.setComment("hi!");
        java.nio.file.attribute.FileTime fileTime21 = zipArchiveEntry15.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry23.setName("hi!");
        zipArchiveEntry23.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry23.getExtraFields();
        java.nio.file.attribute.FileTime fileTime29 = zipArchiveEntry23.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry30 = zipArchiveEntry15.setCreationTime(fileTime29);
        java.util.zip.ZipEntry zipEntry31 = zipArchiveEntry1.setLastAccessTime(fileTime29);
        int int32 = zipArchiveEntry1.getUnixMode();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(zipExtraField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertNull(fileTime21);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertNotNull(fileTime29);
        org.junit.Assert.assertNotNull(zipEntry30);
        org.junit.Assert.assertEquals(zipEntry30.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry31);
        org.junit.Assert.assertEquals(zipEntry31.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        java.util.Date date3 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry6.setComment("hi!");
        zipArchiveEntry6.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry15.setComment("hi!");
        zipArchiveEntry15.setInternalAttributes((int) (byte) 10);
        int int23 = zipArchiveEntry15.getUnixMode();
        java.lang.String str24 = zipArchiveEntry15.getComment();
        long long25 = zipArchiveEntry15.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry28.setComment("hi!");
        zipArchiveEntry28.setCrc((long) 0);
        long long36 = zipArchiveEntry28.getSize();
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry28.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry39.setComment("hi!");
        long long45 = zipArchiveEntry39.getExternalAttributes();
        zipArchiveEntry39.setTime((long) (short) -1);
        boolean boolean48 = zipArchiveEntry39.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry39.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry28.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry26.setLastAccessTime(fileTime49);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry15.setLastModifiedTime(fileTime49);
        byte[] byteArray53 = zipArchiveEntry15.getLocalFileDataExtra();
        zipArchiveEntry6.setExtra(byteArray53);
        zipArchiveEntry1.setExtra(byteArray53);
        java.util.Date date56 = zipArchiveEntry1.getLastModifiedDate();
        zipArchiveEntry1.setCompressedSize((-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(fileTime37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fileTime49);
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 31 15:59:59 PST 1969");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry9.setComment("hi!");
        long long15 = zipArchiveEntry9.getSize();
        java.lang.String str16 = zipArchiveEntry9.getName();
        int int17 = zipArchiveEntry9.getMethod();
        byte[] byteArray18 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray18);
        byte[] byteArray20 = zipArchiveEntry1.getCentralDirectoryExtra();
        boolean boolean21 = zipArchiveEntry1.isDirectory();
        boolean boolean22 = zipArchiveEntry1.isSupportedCompressionMethod();
        java.lang.String str23 = zipArchiveEntry1.getComment();
        java.util.Date date24 = zipArchiveEntry1.getLastModifiedDate();
        long long25 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean28 = zipArchiveEntry27.isDirectory();
        int int29 = zipArchiveEntry27.getUnixMode();
        java.lang.Object obj30 = zipArchiveEntry27.clone();
        zipArchiveEntry27.setExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry33 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry33.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = zipArchiveEntry33.getExtraFields();
        zipArchiveEntry33.setComment("hi!");
        zipArchiveEntry33.setCrc((long) 0);
        long long41 = zipArchiveEntry33.getSize();
        java.nio.file.attribute.FileTime fileTime42 = zipArchiveEntry33.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry44.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = zipArchiveEntry44.getExtraFields();
        zipArchiveEntry44.setComment("hi!");
        long long50 = zipArchiveEntry44.getExternalAttributes();
        zipArchiveEntry44.setTime((long) (short) -1);
        boolean boolean53 = zipArchiveEntry44.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime54 = zipArchiveEntry44.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry55 = zipArchiveEntry33.setCreationTime(fileTime54);
        java.util.zip.ZipEntry zipEntry56 = zipArchiveEntry27.setLastModifiedTime(fileTime54);
        java.util.zip.ZipEntry zipEntry57 = zipArchiveEntry1.setLastAccessTime(fileTime54);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNull(fileTime42);
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(fileTime54);
        org.junit.Assert.assertNotNull(zipEntry55);
        org.junit.Assert.assertEquals(zipEntry55.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry56);
        org.junit.Assert.assertEquals(zipEntry56.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry57);
        org.junit.Assert.assertEquals(zipEntry57.toString(), "hi!");
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastModifiedTime();
        boolean boolean9 = zipArchiveEntry1.isDirectory();
        java.util.Date date10 = zipArchiveEntry1.getLastModifiedDate();
        long long11 = zipArchiveEntry1.getExternalAttributes();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry9 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry9.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = zipArchiveEntry9.getExtraFields();
        zipArchiveEntry9.setComment("hi!");
        long long15 = zipArchiveEntry9.getSize();
        java.lang.String str16 = zipArchiveEntry9.getName();
        int int17 = zipArchiveEntry9.getMethod();
        byte[] byteArray18 = zipArchiveEntry9.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray18);
        java.lang.String str20 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setTime((long) 'a');
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setSize((long) (byte) 1);
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry31.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray34 = zipArchiveEntry31.getExtraFields();
        zipArchiveEntry31.setComment("hi!");
        long long37 = zipArchiveEntry31.getExternalAttributes();
        zipArchiveEntry31.setTime((long) (short) -1);
        boolean boolean40 = zipArchiveEntry31.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry42 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry42.setName("hi!");
        java.nio.file.attribute.FileTime fileTime45 = zipArchiveEntry42.getLastAccessTime();
        long long46 = zipArchiveEntry42.getExternalAttributes();
        java.nio.file.attribute.FileTime fileTime47 = zipArchiveEntry42.getCreationTime();
        byte[] byteArray48 = zipArchiveEntry42.getCentralDirectoryExtra();
        zipArchiveEntry31.setExtra(byteArray48);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry51 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean52 = zipArchiveEntry51.isDirectory();
        int int53 = zipArchiveEntry51.getUnixMode();
        java.lang.Object obj54 = zipArchiveEntry51.clone();
        zipArchiveEntry51.setExtra();
        long long56 = zipArchiveEntry51.getSize();
        boolean boolean57 = zipArchiveEntry31.equals((java.lang.Object) zipArchiveEntry51);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry59 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry59.setCompressedSize((long) (byte) 0);
        zipArchiveEntry59.setCompressedSize(1L);
        zipArchiveEntry59.setComment("hi!");
        java.util.Date date66 = zipArchiveEntry59.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry67 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry69 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry69.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray72 = zipArchiveEntry69.getExtraFields();
        zipArchiveEntry69.setComment("hi!");
        zipArchiveEntry69.setCrc((long) 0);
        long long77 = zipArchiveEntry69.getSize();
        java.nio.file.attribute.FileTime fileTime78 = zipArchiveEntry69.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry80 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry80.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray83 = zipArchiveEntry80.getExtraFields();
        zipArchiveEntry80.setComment("hi!");
        long long86 = zipArchiveEntry80.getExternalAttributes();
        zipArchiveEntry80.setTime((long) (short) -1);
        boolean boolean89 = zipArchiveEntry80.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime90 = zipArchiveEntry80.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry91 = zipArchiveEntry69.setCreationTime(fileTime90);
        java.util.zip.ZipEntry zipEntry92 = zipArchiveEntry67.setLastAccessTime(fileTime90);
        java.util.zip.ZipEntry zipEntry93 = zipArchiveEntry59.setCreationTime(fileTime90);
        java.util.zip.ZipEntry zipEntry94 = zipArchiveEntry51.setLastModifiedTime(fileTime90);
        java.util.zip.ZipEntry zipEntry95 = zipArchiveEntry1.setLastModifiedTime(fileTime90);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertNotNull(zipExtraFieldArray34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(fileTime45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNull(fileTime47);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "");
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(date66);
        org.junit.Assert.assertEquals(date66.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(zipExtraFieldArray72);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + (-1L) + "'", long77 == (-1L));
        org.junit.Assert.assertNull(fileTime78);
        org.junit.Assert.assertNotNull(zipExtraFieldArray83);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(fileTime90);
        org.junit.Assert.assertNotNull(zipEntry91);
        org.junit.Assert.assertEquals(zipEntry91.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry92);
        org.junit.Assert.assertEquals(zipEntry92.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry93);
        org.junit.Assert.assertEquals(zipEntry93.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry94);
        org.junit.Assert.assertEquals(zipEntry94.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry95);
        org.junit.Assert.assertEquals(zipEntry95.toString(), "hi!");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setExtra();
        long long6 = zipArchiveEntry1.getCompressedSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getSize();
        java.lang.String str8 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setName("hi!");
        zipArchiveEntry10.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry10.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray15);
        zipArchiveEntry1.setUnixMode((int) 'a');
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = zipArchiveEntry1.getExtraField(zipShort4);
        java.nio.file.attribute.FileTime fileTime6 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNull(fileTime6);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        boolean boolean12 = zipArchiveEntry1.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry14.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry14.getExtraFields();
        zipArchiveEntry14.setComment("hi!");
        long long20 = zipArchiveEntry14.getExternalAttributes();
        zipArchiveEntry14.setTime((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry24.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = zipArchiveEntry24.getExtraFields();
        zipArchiveEntry14.setExtraFields(zipExtraFieldArray27);
        zipArchiveEntry14.setMethod(0);
        zipArchiveEntry14.setCrc(0L);
        zipArchiveEntry14.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry36.setName("hi!");
        zipArchiveEntry36.setTime((long) (-1));
        boolean boolean41 = zipArchiveEntry36.isDirectory();
        boolean boolean42 = zipArchiveEntry36.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry44 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry44.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray47 = zipArchiveEntry44.getExtraFields();
        zipArchiveEntry44.setComment("hi!");
        long long50 = zipArchiveEntry44.getSize();
        java.lang.String str51 = zipArchiveEntry44.getName();
        int int52 = zipArchiveEntry44.getMethod();
        byte[] byteArray53 = zipArchiveEntry44.getLocalFileDataExtra();
        zipArchiveEntry36.setCentralDirectoryExtra(byteArray53);
        zipArchiveEntry14.setExtra(byteArray53);
        boolean boolean56 = zipArchiveEntry1.equals((java.lang.Object) byteArray53);
        zipArchiveEntry1.setCrc((long) '#');
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray47);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry14.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = zipArchiveEntry14.getExtraFields();
        zipArchiveEntry14.setComment("hi!");
        zipArchiveEntry14.setCrc((long) 0);
        long long22 = zipArchiveEntry14.getSize();
        java.nio.file.attribute.FileTime fileTime23 = zipArchiveEntry14.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry25.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry25.getExtraFields();
        zipArchiveEntry25.setComment("hi!");
        long long31 = zipArchiveEntry25.getExternalAttributes();
        zipArchiveEntry25.setTime((long) (short) -1);
        boolean boolean34 = zipArchiveEntry25.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime35 = zipArchiveEntry25.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry36 = zipArchiveEntry14.setCreationTime(fileTime35);
        java.util.zip.ZipEntry zipEntry37 = zipArchiveEntry12.setLastAccessTime(fileTime35);
        java.util.zip.ZipEntry zipEntry38 = zipArchiveEntry1.setLastModifiedTime(fileTime35);
        byte[] byteArray39 = zipArchiveEntry1.getLocalFileDataExtra();
        byte[] byteArray40 = zipArchiveEntry1.getLocalFileDataExtra();
        int int41 = zipArchiveEntry1.getPlatform();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry1.getExtraFields();
        long long43 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(fileTime23);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fileTime35);
        org.junit.Assert.assertNotNull(zipEntry36);
        org.junit.Assert.assertEquals(zipEntry36.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry37);
        org.junit.Assert.assertEquals(zipEntry37.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry38);
        org.junit.Assert.assertEquals(zipEntry38.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        java.nio.file.attribute.FileTime fileTime2 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setPlatform((int) '4');
        java.nio.file.attribute.FileTime fileTime5 = zipArchiveEntry1.getLastAccessTime();
        java.lang.String str6 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setPlatform((int) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry10.setCompressedSize((long) (byte) 0);
        zipArchiveEntry10.setCompressedSize(1L);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry17.getExtraFields();
        zipArchiveEntry17.setComment("hi!");
        zipArchiveEntry17.setCrc((long) 0);
        long long25 = zipArchiveEntry17.getSize();
        java.nio.file.attribute.FileTime fileTime26 = zipArchiveEntry17.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry28.setComment("hi!");
        long long34 = zipArchiveEntry28.getExternalAttributes();
        zipArchiveEntry28.setTime((long) (short) -1);
        boolean boolean37 = zipArchiveEntry28.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime38 = zipArchiveEntry28.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry39 = zipArchiveEntry17.setCreationTime(fileTime38);
        java.util.zip.ZipEntry zipEntry40 = zipArchiveEntry15.setLastAccessTime(fileTime38);
        java.util.zip.ZipEntry zipEntry41 = zipArchiveEntry10.setLastAccessTime(fileTime38);
        zipArchiveEntry10.setCompressedSize((long) 'a');
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry45 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry45.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray48 = zipArchiveEntry45.getExtraFields();
        zipArchiveEntry45.setComment("hi!");
        zipArchiveEntry45.setInternalAttributes((int) (byte) 10);
        byte[] byteArray53 = zipArchiveEntry45.getCentralDirectoryExtra();
        zipArchiveEntry45.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry57 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry57.setName("hi!");
        zipArchiveEntry57.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray62 = zipArchiveEntry57.getExtraFields();
        java.nio.file.attribute.FileTime fileTime63 = zipArchiveEntry57.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry64 = zipArchiveEntry45.setLastAccessTime(fileTime63);
        java.util.zip.ZipEntry zipEntry65 = zipArchiveEntry10.setLastAccessTime(fileTime63);
        java.util.zip.ZipEntry zipEntry66 = zipArchiveEntry1.setCreationTime(fileTime63);
        long long67 = zipArchiveEntry1.getSize();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fileTime38);
        org.junit.Assert.assertNotNull(zipEntry39);
        org.junit.Assert.assertEquals(zipEntry39.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry40);
        org.junit.Assert.assertEquals(zipEntry40.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry41);
        org.junit.Assert.assertEquals(zipEntry41.toString(), "");
        org.junit.Assert.assertNotNull(zipExtraFieldArray48);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray62);
        org.junit.Assert.assertNotNull(fileTime63);
        org.junit.Assert.assertNotNull(zipEntry64);
        org.junit.Assert.assertEquals(zipEntry64.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry65);
        org.junit.Assert.assertEquals(zipEntry65.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry66);
        org.junit.Assert.assertEquals(zipEntry66.toString(), "");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setCrc((long) 0);
        long long9 = zipArchiveEntry1.getSize();
        java.nio.file.attribute.FileTime fileTime10 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setExternalAttributes((long) 8);
        java.nio.file.attribute.FileTime fileTime13 = zipArchiveEntry1.getCreationTime();
        int int14 = zipArchiveEntry1.getPlatform();
        byte[] byteArray15 = zipArchiveEntry1.getLocalFileDataExtra();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry5.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry5.getExtraFields();
        zipArchiveEntry5.setComment("hi!");
        long long11 = zipArchiveEntry5.getSize();
        java.lang.String str12 = zipArchiveEntry5.getName();
        int int13 = zipArchiveEntry5.getMethod();
        byte[] byteArray14 = zipArchiveEntry5.getLocalFileDataExtra();
        int int15 = zipArchiveEntry5.getMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry17.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = zipArchiveEntry17.getExtraFields();
        zipArchiveEntry17.setComment("hi!");
        zipArchiveEntry17.setInternalAttributes((int) (byte) 10);
        int int25 = zipArchiveEntry17.getUnixMode();
        java.lang.String str26 = zipArchiveEntry17.getComment();
        long long27 = zipArchiveEntry17.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry30 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry30.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray33 = zipArchiveEntry30.getExtraFields();
        zipArchiveEntry30.setComment("hi!");
        zipArchiveEntry30.setCrc((long) 0);
        long long38 = zipArchiveEntry30.getSize();
        java.nio.file.attribute.FileTime fileTime39 = zipArchiveEntry30.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry41 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry41.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray44 = zipArchiveEntry41.getExtraFields();
        zipArchiveEntry41.setComment("hi!");
        long long47 = zipArchiveEntry41.getExternalAttributes();
        zipArchiveEntry41.setTime((long) (short) -1);
        boolean boolean50 = zipArchiveEntry41.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime51 = zipArchiveEntry41.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry30.setCreationTime(fileTime51);
        java.util.zip.ZipEntry zipEntry53 = zipArchiveEntry28.setLastAccessTime(fileTime51);
        java.util.zip.ZipEntry zipEntry54 = zipArchiveEntry17.setLastModifiedTime(fileTime51);
        java.util.zip.ZipEntry zipEntry55 = zipArchiveEntry5.setLastAccessTime(fileTime51);
        java.util.zip.ZipEntry zipEntry56 = zipArchiveEntry1.setCreationTime(fileTime51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray33);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertNull(fileTime39);
        org.junit.Assert.assertNotNull(zipExtraFieldArray44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(fileTime51);
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry53);
        org.junit.Assert.assertEquals(zipEntry53.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry54);
        org.junit.Assert.assertEquals(zipEntry54.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry55);
        org.junit.Assert.assertEquals(zipEntry55.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry56);
        org.junit.Assert.assertEquals(zipEntry56.toString(), "");
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        zipArchiveEntry1.setInternalAttributes((int) (byte) 10);
        int int9 = zipArchiveEntry1.getUnixMode();
        java.lang.String str10 = zipArchiveEntry1.getComment();
        long long11 = zipArchiveEntry1.getSize();
        boolean boolean12 = zipArchiveEntry1.isSupportedCompressionMethod();
        boolean boolean13 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime14 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(fileTime14);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        zipArchiveEntry1.setCompressedSize(1L);
        zipArchiveEntry1.setComment("hi!");
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        java.lang.String str9 = zipArchiveEntry1.getName();
        int int10 = zipArchiveEntry1.getUnixMode();
        java.lang.String str11 = zipArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.String str4 = zipArchiveEntry1.getName();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        long long6 = zipArchiveEntry1.getCompressedSize();
        byte[] byteArray7 = zipArchiveEntry1.getLocalFileDataExtra();
        java.lang.String str8 = zipArchiveEntry1.getComment();
        int int9 = zipArchiveEntry1.getInternalAttributes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        long long4 = zipArchiveEntry1.getExternalAttributes();
        boolean boolean5 = zipArchiveEntry1.isDirectory();
        zipArchiveEntry1.setInternalAttributes(10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = zipArchiveEntry1.getExtraFields();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeExtraField(zipShort9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setCompressedSize((long) (byte) 0);
        zipArchiveEntry1.setCompressedSize(1L);
        zipArchiveEntry1.setComment("hi!");
        java.util.Date date8 = zipArchiveEntry1.getLastModifiedDate();
        long long9 = zipArchiveEntry1.getSize();
        zipArchiveEntry1.setComment("");
        zipArchiveEntry1.setExternalAttributes(0L);
        zipArchiveEntry1.setTime((long) (byte) 0);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        zipArchiveEntry1.setTime((long) (-1));
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        boolean boolean7 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime8 = zipArchiveEntry1.getLastAccessTime();
        int int9 = zipArchiveEntry1.getPlatform();
        java.lang.String str10 = zipArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry12.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = zipArchiveEntry12.getExtraFields();
        zipArchiveEntry12.setComment("hi!");
        zipArchiveEntry12.setCrc((long) 0);
        java.nio.file.attribute.FileTime fileTime20 = zipArchiveEntry12.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry22 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean23 = zipArchiveEntry22.isDirectory();
        int int24 = zipArchiveEntry22.getUnixMode();
        boolean boolean25 = zipArchiveEntry22.isSupportedCompressionMethod();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry27 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry27.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = zipArchiveEntry27.getExtraFields();
        zipArchiveEntry22.setExtraFields(zipExtraFieldArray30);
        zipArchiveEntry12.setExtraFields(zipExtraFieldArray30);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray30);
        int int34 = zipArchiveEntry1.getPlatform();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNull(fileTime20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getLastAccessTime();
        zipArchiveEntry1.setExternalAttributes((long) (short) 10);
        byte[] byteArray7 = zipArchiveEntry1.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry1.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = zipArchiveEntry1.getExtraFields();
        zipArchiveEntry1.setComment("hi!");
        long long7 = zipArchiveEntry1.getExternalAttributes();
        zipArchiveEntry1.setTime((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry11.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = zipArchiveEntry11.getExtraFields();
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray14);
        boolean boolean16 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry18.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = zipArchiveEntry18.getExtraFields();
        zipArchiveEntry18.setComment("hi!");
        zipArchiveEntry18.setInternalAttributes((int) (byte) 10);
        int int26 = zipArchiveEntry18.getUnixMode();
        java.lang.String str27 = zipArchiveEntry18.getComment();
        long long28 = zipArchiveEntry18.getSize();
        boolean boolean29 = zipArchiveEntry18.isSupportedCompressionMethod();
        java.lang.String str30 = zipArchiveEntry18.getComment();
        zipArchiveEntry18.setInternalAttributes((int) (byte) 0);
        java.nio.file.attribute.FileTime fileTime33 = zipArchiveEntry18.getLastAccessTime();
        byte[] byteArray34 = zipArchiveEntry18.getLocalFileDataExtra();
        zipArchiveEntry1.setCentralDirectoryExtra(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry36 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(fileTime33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        int int3 = zipArchiveEntry1.getUnixMode();
        java.lang.Object obj4 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setExtra();
        long long6 = zipArchiveEntry1.getSize();
        java.lang.String str7 = zipArchiveEntry1.getName();
        zipArchiveEntry1.setComment("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        java.util.Date date3 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry6.setComment("hi!");
        zipArchiveEntry6.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry15.setComment("hi!");
        zipArchiveEntry15.setInternalAttributes((int) (byte) 10);
        int int23 = zipArchiveEntry15.getUnixMode();
        java.lang.String str24 = zipArchiveEntry15.getComment();
        long long25 = zipArchiveEntry15.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry28.setComment("hi!");
        zipArchiveEntry28.setCrc((long) 0);
        long long36 = zipArchiveEntry28.getSize();
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry28.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry39.setComment("hi!");
        long long45 = zipArchiveEntry39.getExternalAttributes();
        zipArchiveEntry39.setTime((long) (short) -1);
        boolean boolean48 = zipArchiveEntry39.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry39.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry28.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry26.setLastAccessTime(fileTime49);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry15.setLastModifiedTime(fileTime49);
        byte[] byteArray53 = zipArchiveEntry15.getLocalFileDataExtra();
        zipArchiveEntry6.setExtra(byteArray53);
        zipArchiveEntry1.setExtra(byteArray53);
        java.util.Date date56 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry58.setName("hi!");
        zipArchiveEntry58.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry64.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray67 = zipArchiveEntry64.getExtraFields();
        zipArchiveEntry64.setComment("hi!");
        zipArchiveEntry64.setInternalAttributes((int) (byte) 10);
        byte[] byteArray72 = zipArchiveEntry64.getCentralDirectoryExtra();
        zipArchiveEntry64.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry76 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry76.setName("hi!");
        zipArchiveEntry76.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray81 = zipArchiveEntry76.getExtraFields();
        java.nio.file.attribute.FileTime fileTime82 = zipArchiveEntry76.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry64.setLastAccessTime(fileTime82);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry58.setLastAccessTime(fileTime82);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry1.setLastModifiedTime(fileTime82);
        zipArchiveEntry1.setUnixMode((int) '4');
        boolean boolean88 = zipArchiveEntry1.isDirectory();
        java.nio.file.attribute.FileTime fileTime89 = zipArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(fileTime37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fileTime49);
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(zipExtraFieldArray67);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray81);
        org.junit.Assert.assertNotNull(fileTime82);
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(fileTime89);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        boolean boolean2 = zipArchiveEntry1.isDirectory();
        java.util.Date date3 = zipArchiveEntry1.getLastModifiedDate();
        byte[] byteArray4 = zipArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry6.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = zipArchiveEntry6.getExtraFields();
        zipArchiveEntry6.setComment("hi!");
        zipArchiveEntry6.setInternalAttributes((int) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry15 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry15.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = zipArchiveEntry15.getExtraFields();
        zipArchiveEntry15.setComment("hi!");
        zipArchiveEntry15.setInternalAttributes((int) (byte) 10);
        int int23 = zipArchiveEntry15.getUnixMode();
        java.lang.String str24 = zipArchiveEntry15.getComment();
        long long25 = zipArchiveEntry15.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry28 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry28.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = zipArchiveEntry28.getExtraFields();
        zipArchiveEntry28.setComment("hi!");
        zipArchiveEntry28.setCrc((long) 0);
        long long36 = zipArchiveEntry28.getSize();
        java.nio.file.attribute.FileTime fileTime37 = zipArchiveEntry28.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry39.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = zipArchiveEntry39.getExtraFields();
        zipArchiveEntry39.setComment("hi!");
        long long45 = zipArchiveEntry39.getExternalAttributes();
        zipArchiveEntry39.setTime((long) (short) -1);
        boolean boolean48 = zipArchiveEntry39.isSupportedCompressionMethod();
        java.nio.file.attribute.FileTime fileTime49 = zipArchiveEntry39.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry50 = zipArchiveEntry28.setCreationTime(fileTime49);
        java.util.zip.ZipEntry zipEntry51 = zipArchiveEntry26.setLastAccessTime(fileTime49);
        java.util.zip.ZipEntry zipEntry52 = zipArchiveEntry15.setLastModifiedTime(fileTime49);
        byte[] byteArray53 = zipArchiveEntry15.getLocalFileDataExtra();
        zipArchiveEntry6.setExtra(byteArray53);
        zipArchiveEntry1.setExtra(byteArray53);
        java.util.Date date56 = zipArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry58 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry58.setName("hi!");
        zipArchiveEntry58.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry64 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry64.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray67 = zipArchiveEntry64.getExtraFields();
        zipArchiveEntry64.setComment("hi!");
        zipArchiveEntry64.setInternalAttributes((int) (byte) 10);
        byte[] byteArray72 = zipArchiveEntry64.getCentralDirectoryExtra();
        zipArchiveEntry64.setInternalAttributes((int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry76 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry76.setName("hi!");
        zipArchiveEntry76.setTime((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray81 = zipArchiveEntry76.getExtraFields();
        java.nio.file.attribute.FileTime fileTime82 = zipArchiveEntry76.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry83 = zipArchiveEntry64.setLastAccessTime(fileTime82);
        java.util.zip.ZipEntry zipEntry84 = zipArchiveEntry58.setLastAccessTime(fileTime82);
        java.util.zip.ZipEntry zipEntry85 = zipArchiveEntry1.setLastModifiedTime(fileTime82);
        zipArchiveEntry1.setUnixMode(0);
        zipArchiveEntry1.setInternalAttributes(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNull(fileTime37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(fileTime49);
        org.junit.Assert.assertNotNull(zipEntry50);
        org.junit.Assert.assertEquals(zipEntry50.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry51);
        org.junit.Assert.assertEquals(zipEntry51.toString(), "");
        org.junit.Assert.assertNotNull(zipEntry52);
        org.junit.Assert.assertEquals(zipEntry52.toString(), "hi!");
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray53), "[]");
        org.junit.Assert.assertNotNull(date56);
        org.junit.Assert.assertEquals(date56.toString(), "Wed Dec 31 15:59:59 PST 1969");
        org.junit.Assert.assertNotNull(zipExtraFieldArray67);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray81);
        org.junit.Assert.assertNotNull(fileTime82);
        org.junit.Assert.assertNotNull(zipEntry83);
        org.junit.Assert.assertEquals(zipEntry83.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry84);
        org.junit.Assert.assertEquals(zipEntry84.toString(), "hi!");
        org.junit.Assert.assertNotNull(zipEntry85);
        org.junit.Assert.assertEquals(zipEntry85.toString(), "");
    }
}

