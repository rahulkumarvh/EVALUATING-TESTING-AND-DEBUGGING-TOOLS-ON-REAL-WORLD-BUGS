package org.apache.commons.compress.archivers.zip;

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
        zipArchiveEntry1.setMethod(0);
        java.lang.Object obj58 = zipArchiveEntry1.clone();
        zipArchiveEntry1.setTime((long) (byte) 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry62 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("");
        zipArchiveEntry62.setName("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray65 = zipArchiveEntry62.getExtraFields();
        zipArchiveEntry62.setComment("hi!");
        long long68 = zipArchiveEntry62.getSize();
        java.lang.String str69 = zipArchiveEntry62.getName();
        int int70 = zipArchiveEntry62.getMethod();
        zipArchiveEntry62.setExtra();
        zipArchiveEntry62.setMethod((int) '#');
        java.lang.String str74 = zipArchiveEntry62.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry76 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("hi!");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray77 = zipArchiveEntry76.getExtraFields();
        zipArchiveEntry62.setExtraFields(zipExtraFieldArray77);
        zipArchiveEntry1.setExtraFields(zipExtraFieldArray77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on zipArchiveEntry26 and zipArchiveEntry76", zipArchiveEntry26.equals(zipArchiveEntry76) ? zipArchiveEntry26.hashCode() == zipArchiveEntry76.hashCode() : true);
    }
}

