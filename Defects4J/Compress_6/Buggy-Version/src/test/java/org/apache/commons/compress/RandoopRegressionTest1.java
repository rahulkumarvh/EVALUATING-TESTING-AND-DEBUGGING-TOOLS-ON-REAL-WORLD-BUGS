package org.apache.commons.compress.archivers.cpio;

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
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) 8);
        byte[] byteArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream2.write(byteArray3, 36864, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        jarArchiveOutputStream11.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream7, (java.io.OutputStream) jarArchiveOutputStream11, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream11);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream15, 0);
        tarArchiveInputStream2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        tarArchiveInputStream16.mark(32);
        int int19 = tarArchiveInputStream16.read();
        tarArchiveInputStream16.close();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream22);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 49152);
        int int31 = tarArchiveInputStream23.read(byteArray26);
        long long33 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray26, true);
        int int36 = tarArchiveInputStream16.read(byteArray26, 1024, (int) (byte) -1);
        int int37 = arArchiveInputStream13.read(byteArray26);
        arArchiveInputStream13.close();
        int int39 = arArchiveInputStream13.read();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2660L + "'", long33 == 2660L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        java.lang.String str4 = jarArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        boolean boolean10 = zipArchiveOutputStream5.isSeekable();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        int int14 = tarArchiveInputStream13.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        long long22 = tarArchiveInputStream18.skip((long) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        int int30 = tarArchiveInputStream18.read(byteArray25, (int) 'a', (-1));
        int int31 = tarArchiveInputStream13.read(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        jarArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        jarArchiveOutputStream2.closeArchiveEntry();
        jarArchiveOutputStream2.closeArchiveEntry();
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean14 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, (int) (short) 4);
        boolean boolean16 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray12, 16);
        boolean boolean18 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray12, 40960);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        byte[] byteArray19 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) (short) 3, (int) (byte) 100, false);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.write(byteArray19, 4096, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0]");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        jarArchiveOutputStream1.closeArchiveEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean10 = cpioArchiveEntry9.isSocket();
        long long11 = cpioArchiveEntry9.getTime();
        boolean boolean12 = cpioArchiveEntry9.isPipe();
        short short13 = cpioArchiveEntry9.getFormat();
        java.lang.String str14 = cpioArchiveEntry9.getName();
        long long15 = cpioArchiveEntry9.getRemoteDeviceMaj();
        cpioArchiveEntry9.setInode(25610L);
        boolean boolean18 = cpioArchiveEntry9.isRegularFile();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "070702" + "'", str14, "070702");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.flush();
        int int8 = tarArchiveOutputStream3.getRecordSize();
        tarArchiveOutputStream3.setDebug(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.setEncoding("org.apache.commons.compress.archivers.ArchiveException");
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream14);
        tarArchiveInputStream15.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream15);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream19 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream19);
        tarArchiveInputStream20.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream20);
        long long24 = tarArchiveInputStream20.skip((long) (byte) -1);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean29 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray27, 2);
        int int32 = tarArchiveInputStream20.read(byteArray27, (int) 'a', (-1));
        int int35 = tarArchiveInputStream17.read(byteArray27, (int) (byte) 100, 1024);
        tarArchiveInputStream17.close();
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream38 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream37);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream38);
        tarArchiveInputStream39.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream39);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream43 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream43);
        tarArchiveInputStream44.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream44);
        long long48 = tarArchiveInputStream44.skip((long) (byte) -1);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean53 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray51, 2);
        int int56 = tarArchiveInputStream44.read(byteArray51, (int) 'a', (-1));
        int int59 = tarArchiveInputStream41.read(byteArray51, (int) (byte) 100, 1024);
        int int60 = tarArchiveInputStream17.read(byteArray51);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.write(byteArray51, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        byte[] byteArray31 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean33 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray31, 2);
        int int36 = tarArchiveInputStream24.read(byteArray31, (int) 'a', (-1));
        boolean boolean38 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray31, (int) '#');
        int int39 = tarArchiveInputStream2.read(byteArray31);
        long long41 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray31, true);
        boolean boolean43 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray31, 1024);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2660L + "'", long41 == 2660L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream8 = archiveStreamFactory0.createArchiveOutputStream("org.apache.commons.compress.archivers.ArchiveException: 070707", (java.io.OutputStream) jarArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.archivers.ArchiveException: 070707 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        tarArchiveInputStream4.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream7);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream9);
        jarArchiveOutputStream10.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
        tarArchiveOutputStream12.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream8, (java.io.OutputStream) tarArchiveOutputStream12);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = jarArchiveInputStream17.getNextEntry();
        boolean boolean19 = jarArchiveInputStream17.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream20 = archiveStreamFactory0.createArchiveInputStream("", (java.io.InputStream) jarArchiveInputStream17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 2);
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 49152);
        int int24 = tarArchiveInputStream16.read(byteArray19);
        int int27 = arArchiveInputStream13.read(byteArray19, (int) ' ', (int) '4');
        boolean boolean29 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 32);
        boolean boolean31 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray19, (int) (byte) -1);
        boolean boolean33 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.lang.String str9 = tarArchiveOutputStream8.getDefaultFileExtension();
        tarArchiveOutputStream8.closeArchiveEntry();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tar" + "'", str9, "tar");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.closeEntry();
        java.lang.String str19 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.setLongFileMode((int) '#');
        int int22 = tarArchiveOutputStream10.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        long long11 = tarArchiveInputStream7.skip((long) (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        int int19 = tarArchiveInputStream7.read(byteArray14, (int) 'a', (-1));
        int int22 = tarArchiveInputStream4.read(byteArray14, (int) (byte) 100, 1024);
        tarArchiveInputStream4.close();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream25);
        tarArchiveInputStream26.reset();
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream28);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        jarArchiveOutputStream30.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream26, (java.io.OutputStream) jarArchiveOutputStream30, 100);
        int int34 = tarArchiveInputStream26.available();
        int int35 = tarArchiveInputStream26.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream26);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream39 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream38);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream39);
        tarArchiveInputStream40.mark(32);
        int int43 = tarArchiveInputStream40.read();
        tarArchiveInputStream40.close();
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream46 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream45);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream46);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean52 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray50, 2);
        boolean boolean54 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray50, 49152);
        int int55 = tarArchiveInputStream47.read(byteArray50);
        long long57 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray50, true);
        int int60 = tarArchiveInputStream40.read(byteArray50, 1024, (int) (byte) -1);
        int int61 = arArchiveInputStream37.read(byteArray50);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = arArchiveInputStream37.getNextEntry();
        java.io.OutputStream outputStream63 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream64 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream63);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream65 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream64);
        jarArchiveOutputStream65.flush();
        jarArchiveOutputStream65.closeEntry();
        jarArchiveOutputStream65.flush();
        jarArchiveOutputStream65.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy71 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream65.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy71);
        java.lang.String str73 = jarArchiveOutputStream65.getEncoding();
        jarArchiveOutputStream65.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream65);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) arArchiveInputStream37, (java.io.OutputStream) jarArchiveOutputStream65, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream79 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream65);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry81 = tarArchiveInputStream4.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: reading from an output buffer");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 2660L + "'", long57 == 2660L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(archiveEntry62);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "UTF8" + "'", str73, "UTF8");
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.setEncoding("tar");
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream11);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream14);
        tarArchiveInputStream15.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream15);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream19 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream19);
        tarArchiveInputStream20.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream20);
        long long24 = tarArchiveInputStream20.skip((long) (byte) -1);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean29 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray27, 2);
        int int32 = tarArchiveInputStream20.read(byteArray27, (int) 'a', (-1));
        int int35 = tarArchiveInputStream17.read(byteArray27, (int) (byte) 100, 1024);
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream17, outputStream36, 4);
        int int39 = tarArchiveInputStream17.available();
        long long41 = tarArchiveInputStream17.skip(0L);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream43 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream43);
        int int45 = tarArchiveInputStream44.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream46 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream44);
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream48 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream47);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream49 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream48);
        tarArchiveInputStream49.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream51 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream49);
        long long53 = tarArchiveInputStream49.skip((long) (byte) -1);
        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean58 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray56, 2);
        int int61 = tarArchiveInputStream49.read(byteArray56, (int) 'a', (-1));
        int int62 = tarArchiveInputStream44.read(byteArray56);
        boolean boolean64 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray56, 2048);
        int int65 = tarArchiveInputStream17.read(byteArray56);
        boolean boolean67 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray56, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream12.write(byteArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 512 + "'", int45 == 512);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) '#');
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry6.setNumberOfLinks((long) 1);
        cpioArchiveEntry6.setDeviceMaj((long) 2048);
        cpioArchiveEntry6.setRemoteDeviceMin((long) (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream16);
        tarArchiveInputStream17.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream17);
        long long21 = tarArchiveInputStream17.skip((long) (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        int int29 = tarArchiveInputStream17.read(byteArray24, (int) 'a', (-1));
        int int32 = tarArchiveInputStream14.read(byteArray24, (int) (byte) 100, 1024);
        tarArchiveInputStream14.close();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream35 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream34);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream35);
        tarArchiveInputStream36.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream40 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream39);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream40);
        tarArchiveInputStream41.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream43 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41);
        long long45 = tarArchiveInputStream41.skip((long) (byte) -1);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, 2);
        int int53 = tarArchiveInputStream41.read(byteArray48, (int) 'a', (-1));
        int int56 = tarArchiveInputStream38.read(byteArray48, (int) (byte) 100, 1024);
        int int57 = tarArchiveInputStream14.read(byteArray48);
        int int58 = tarArchiveInputStream2.read(byteArray48);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream59 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry60 = zipArchiveInputStream59.getNextZipEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream59);
        tarArchiveInputStream61.reset();
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(zipArchiveEntry60);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = tarArchiveInputStream6.read(byteArray9);
        int int15 = tarArchiveInputStream2.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int17 = cpioArchiveInputStream16.available();
        int int18 = cpioArchiveInputStream16.available();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream16, outputStream19);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveOutputStream26.setBufferDebug(false);
        tarArchiveOutputStream26.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, (int) (byte) 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream16, (java.io.OutputStream) tarArchiveOutputStream26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry34 = cpioArchiveInputStream16.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 10, 16);
        tarArchiveOutputStream32.flush();
        tarArchiveOutputStream32.setBufferDebug(true);
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream45 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream44);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream46 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream45);
        tarArchiveInputStream46.reset();
        java.io.OutputStream outputStream48 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream49 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream48);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream50 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream49);
        jarArchiveOutputStream50.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream46, (java.io.OutputStream) jarArchiveOutputStream50, 100);
        java.io.InputStream inputStream54 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream55 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream54);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream55);
        byte[] byteArray59 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean61 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray59, 2);
        boolean boolean63 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray59, 49152);
        int int64 = tarArchiveInputStream56.read(byteArray59);
        int int65 = tarArchiveInputStream46.read(byteArray59);
        java.io.InputStream inputStream66 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream67 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream66);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream67);
        tarArchiveInputStream68.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream70 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream68);
        long long72 = tarArchiveInputStream68.skip((long) (byte) -1);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean77 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray75, 2);
        int int80 = tarArchiveInputStream68.read(byteArray75, (int) 'a', (-1));
        boolean boolean82 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray75, (int) '#');
        int int83 = tarArchiveInputStream46.read(byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream32.write(byteArray75);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.read();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        tarArchiveInputStream16.mark(32);
        int int19 = tarArchiveInputStream16.read();
        tarArchiveInputStream16.close();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream22);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 49152);
        int int31 = tarArchiveInputStream23.read(byteArray26);
        long long33 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray26, true);
        int int36 = tarArchiveInputStream16.read(byteArray26, 1024, (int) (byte) -1);
        int int37 = arArchiveInputStream13.read(byteArray26);
        arArchiveInputStream13.close();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry39 = arArchiveInputStream13.getNextArEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry40 = arArchiveInputStream13.getNextArEntry();
        arArchiveInputStream13.mark(2048);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2660L + "'", long33 == 2660L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry39);
        org.junit.Assert.assertNull(arArchiveEntry40);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean10 = cpioArchiveEntry9.isSocket();
        boolean boolean11 = cpioArchiveEntry9.isCharacterDevice();
        java.lang.String str12 = cpioArchiveEntry9.getName();
        long long13 = cpioArchiveEntry9.getChksum();
        cpioArchiveEntry9.setDeviceMaj(0L);
        long long16 = cpioArchiveEntry9.getMode();
        long long17 = cpioArchiveEntry9.getSize();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream7.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "070702" + "'", str12, "070702");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        long long11 = tarArchiveInputStream7.skip((long) (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        int int19 = tarArchiveInputStream7.read(byteArray14, (int) 'a', (-1));
        int int22 = tarArchiveInputStream4.read(byteArray14, (int) (byte) 100, 1024);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, outputStream23, 4);
        int int26 = tarArchiveInputStream4.available();
        long long28 = tarArchiveInputStream4.skip(0L);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream4, (int) (byte) 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream30);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream33 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream33);
        tarArchiveInputStream34.reset();
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream36);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream38 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream37);
        jarArchiveOutputStream38.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream34, (java.io.OutputStream) jarArchiveOutputStream38, 100);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream43 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream42);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream44 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream43);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean49 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray47, 2);
        boolean boolean51 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray47, 49152);
        int int52 = tarArchiveInputStream44.read(byteArray47);
        int int53 = tarArchiveInputStream34.read(byteArray47);
        java.io.InputStream inputStream54 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream55 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream54);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream56 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream55);
        tarArchiveInputStream56.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream58 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream56);
        long long60 = tarArchiveInputStream56.skip((long) (byte) -1);
        java.io.OutputStream outputStream61 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream62 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream61);
        jarArchiveOutputStream62.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream62);
        tarArchiveOutputStream64.setDebug(false);
        tarArchiveInputStream56.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream64);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream34, (java.io.OutputStream) tarArchiveOutputStream64);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream69 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream64);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream30, (java.io.OutputStream) jarArchiveOutputStream69);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry71 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream69.putNextEntry(zipArchiveEntry71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        long long11 = tarArchiveInputStream7.skip((long) (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        int int19 = tarArchiveInputStream7.read(byteArray14, (int) 'a', (-1));
        int int22 = tarArchiveInputStream4.read(byteArray14, (int) (byte) 100, 1024);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, outputStream23, 4);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = tarArchiveInputStream4.getNextEntry();
        tarArchiveInputStream4.setDebug(false);
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream30 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream29);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream30);
        tarArchiveInputStream31.reset();
        java.io.OutputStream outputStream33 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream33);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream35 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream34);
        jarArchiveOutputStream35.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream31, (java.io.OutputStream) jarArchiveOutputStream35, 100);
        int int39 = tarArchiveInputStream31.available();
        int int40 = tarArchiveInputStream31.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream31);
        java.io.OutputStream outputStream42 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream42);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream44 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream43);
        jarArchiveOutputStream44.flush();
        jarArchiveOutputStream44.closeEntry();
        jarArchiveOutputStream44.flush();
        jarArchiveOutputStream44.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy50 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream44.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy50);
        jarArchiveOutputStream44.setMethod((int) (byte) 10);
        jarArchiveOutputStream44.flush();
        tarArchiveInputStream31.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream44);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream56 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream31);
        java.io.OutputStream outputStream57 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream58 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream57);
        jarArchiveOutputStream58.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream60 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream58);
        tarArchiveOutputStream60.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream63 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream60);
        tarArchiveOutputStream60.flush();
        java.io.InputStream inputStream65 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream66 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream65);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream66);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean72 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray70, 2);
        boolean boolean74 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray70, 49152);
        int int75 = tarArchiveInputStream67.read(byteArray70);
        long long77 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray70, true);
        tarArchiveOutputStream60.write(byteArray70, 49152, (int) (byte) -1);
        int int83 = arArchiveInputStream56.read(byteArray70, 10, 2);
        int int84 = tarArchiveInputStream4.read(byteArray70);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(archiveEntry26);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy50);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 2660L + "'", long77 == 2660L);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.closeEntry();
        jarArchiveOutputStream2.setEncoding("tar");
        jarArchiveOutputStream2.setComment("070702");
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: no current CPIO entry");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        int int14 = tarArchiveInputStream13.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        long long22 = tarArchiveInputStream18.skip((long) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        int int30 = tarArchiveInputStream18.read(byteArray25, (int) 'a', (-1));
        int int31 = tarArchiveInputStream13.read(byteArray25);
        int int32 = tarArchiveInputStream2.read(byteArray25);
        tarArchiveInputStream2.close();
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream36 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream36, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream38);
        int int40 = tarArchiveOutputStream38.getRecordSize();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream38);
        int int42 = tarArchiveInputStream2.getRecordSize();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 512 + "'", int40 == 512);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 512 + "'", int42 == 512);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.flush();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream9);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 2);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 49152);
        int int18 = tarArchiveInputStream10.read(byteArray13);
        long long20 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray13, true);
        tarArchiveOutputStream3.write(byteArray13, 49152, (int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3, (int) (short) 8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2660L + "'", long20 == 2660L);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = jarArchiveInputStream15.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) jarArchiveInputStream15);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry20 = jarArchiveInputStream15.getNextJarEntry();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertNull(zipArchiveEntry17);
        org.junit.Assert.assertNull(archiveEntry19);
        org.junit.Assert.assertNull(jarArchiveEntry20);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.setComment("always");
        jarArchiveOutputStream6.closeEntry();
        jarArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream20 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream20);
        tarArchiveInputStream21.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21);
        long long25 = tarArchiveInputStream21.skip((long) (byte) -1);
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray28, 2);
        int int33 = tarArchiveInputStream21.read(byteArray28, (int) 'a', (-1));
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray28, 0);
        boolean boolean37 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray28, (int) (short) 8);
        boolean boolean39 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray28, 4);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.write(byteArray28, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        int int14 = tarArchiveInputStream13.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        long long22 = tarArchiveInputStream18.skip((long) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        int int30 = tarArchiveInputStream18.read(byteArray25, (int) 'a', (-1));
        int int31 = tarArchiveInputStream13.read(byteArray25);
        int int32 = tarArchiveInputStream2.read(byteArray25);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream33 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream34 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) jarArchiveInputStream33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry35 = arArchiveInputStream34.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: failed to read header");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray15, (int) (short) 4);
        boolean boolean19 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray15, (int) (short) 12);
        int int22 = tarArchiveInputStream2.read(byteArray15, (int) ' ', 64);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream24 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream23);
        jarArchiveOutputStream24.closeEntry();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream26);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream28 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream27);
        jarArchiveOutputStream28.flush();
        jarArchiveOutputStream28.closeEntry();
        jarArchiveOutputStream28.flush();
        jarArchiveOutputStream28.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy34 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream28.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        java.lang.String str36 = unicodeExtraFieldPolicy34.toString();
        java.lang.String str37 = unicodeExtraFieldPolicy34.toString();
        jarArchiveOutputStream24.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy34);
        jarArchiveOutputStream24.setEncoding("070701");
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream24);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "always" + "'", str36, "always");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "always" + "'", str37, "always");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        long long11 = tarArchiveInputStream7.skip((long) (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        int int19 = tarArchiveInputStream7.read(byteArray14, (int) 'a', (-1));
        int int22 = tarArchiveInputStream4.read(byteArray14, (int) (byte) 100, 1024);
        long long24 = tarArchiveInputStream4.skip((long) (short) 3);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream26 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream25);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream27 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream26);
        tarArchiveInputStream27.reset();
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream30 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream29);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream31 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream30);
        jarArchiveOutputStream31.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream27, (java.io.OutputStream) jarArchiveOutputStream31, 100);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream36 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream36);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean42 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray40, 2);
        boolean boolean44 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray40, 49152);
        int int45 = tarArchiveInputStream37.read(byteArray40);
        long long47 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray40, false);
        int int50 = tarArchiveInputStream27.read(byteArray40, 4, 1024);
        int int53 = tarArchiveInputStream4.read(byteArray40, 0, 10);
        java.io.OutputStream outputStream54 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream55 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream54);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream56 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream55);
        jarArchiveOutputStream56.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream58 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream56);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream59 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream58);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream60 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream58);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) arArchiveOutputStream58);
        java.io.InputStream inputStream62 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream63 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream62);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream63);
        int int65 = tarArchiveInputStream64.getRecordSize();
        java.io.InputStream inputStream66 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream67 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream66);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream68 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream67);
        byte[] byteArray71 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean73 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray71, 2);
        boolean boolean75 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray71, 49152);
        int int76 = tarArchiveInputStream68.read(byteArray71);
        int int77 = tarArchiveInputStream64.read(byteArray71);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream78 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream64);
        int int79 = cpioArchiveInputStream78.available();
        int int80 = cpioArchiveInputStream78.available();
        java.io.InputStream inputStream81 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream82 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream81);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream83 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream82);
        byte[] byteArray86 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean88 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray86, 2);
        boolean boolean90 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray86, 49152);
        int int91 = tarArchiveInputStream83.read(byteArray86);
        int int94 = cpioArchiveInputStream78.read(byteArray86, (int) (short) 2, 0);
        boolean boolean96 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray86, 0);
        int int97 = tarArchiveInputStream4.read(byteArray86);
        tarArchiveInputStream4.mark((int) (short) 8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 25610L + "'", long47 == 25610L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 512 + "'", int65 == 512);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray86), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray15, 2);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 49152);
        int int20 = tarArchiveInputStream12.read(byteArray15);
        int int21 = tarArchiveInputStream2.read(byteArray15);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream23);
        tarArchiveInputStream24.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        long long28 = tarArchiveInputStream24.skip((long) (byte) -1);
        java.io.OutputStream outputStream29 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream29);
        jarArchiveOutputStream30.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream30);
        tarArchiveOutputStream32.setDebug(false);
        tarArchiveInputStream24.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32, 10, 16);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream41 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream32);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream41);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream42.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, (int) (short) 3);
        int int9 = tarArchiveInputStream8.read();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream17);
        jarArchiveOutputStream18.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        tarArchiveOutputStream20.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream16, (java.io.OutputStream) tarArchiveOutputStream20);
        tarArchiveInputStream8.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream20);
        int int26 = tarArchiveInputStream8.available();
        int int27 = tarArchiveInputStream8.available();
        int int28 = tarArchiveInputStream8.getRecordSize();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 512 + "'", int28 == 512);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream14.write((int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        jarArchiveOutputStream5.flush();
        jarArchiveOutputStream5.closeEntry();
        jarArchiveOutputStream5.flush();
        jarArchiveOutputStream5.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        java.lang.String str13 = unicodeExtraFieldPolicy11.toString();
        java.lang.String str14 = unicodeExtraFieldPolicy11.toString();
        jarArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        jarArchiveOutputStream1.setEncoding("070701");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1, 0);
        tarArchiveOutputStream19.closeArchiveEntry();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "always" + "'", str13, "always");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "always" + "'", str14, "always");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 2);
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 49152);
        int int24 = tarArchiveInputStream16.read(byteArray19);
        int int27 = arArchiveInputStream13.read(byteArray19, (int) ' ', (int) '4');
        int int28 = arArchiveInputStream13.read();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream4);
        tarArchiveOutputStream4.flush();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream8);
        tarArchiveInputStream9.reset();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        jarArchiveOutputStream13.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream9, (java.io.OutputStream) jarArchiveOutputStream13, 100);
        int int17 = tarArchiveInputStream9.available();
        int int18 = tarArchiveInputStream9.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream20 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        int int21 = arArchiveInputStream20.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = arArchiveInputStream20.getNextEntry();
        byte[] byteArray26 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) 256, (int) (short) 10, true);
        boolean boolean28 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray26, 0);
        int int29 = arArchiveInputStream20.read(byteArray26);
        boolean boolean31 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray26, 256);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.write(byteArray26, (int) (short) 4, 1024);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '1024' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(archiveEntry22);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0, 0, 0, 0, 0, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.setEncoding("org.apache.commons.compress.archivers.ArchiveException");
        jarArchiveOutputStream6.closeArchiveEntry();
        java.lang.String str14 = jarArchiveOutputStream6.getEncoding();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.compress.archivers.ArchiveException" + "'", str14, "org.apache.commons.compress.archivers.ArchiveException");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
        tarArchiveInputStream3.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream8);
        jarArchiveOutputStream9.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream9);
        tarArchiveOutputStream11.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream11);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream7, (java.io.OutputStream) tarArchiveOutputStream11);
        tarArchiveOutputStream11.setLongFileMode(49152);
        java.lang.String str18 = tarArchiveOutputStream11.getDefaultFileExtension();
        java.lang.String str19 = tarArchiveOutputStream11.getDefaultFileExtension();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy(inputStream0, (java.io.OutputStream) tarArchiveOutputStream11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "tar" + "'", str18, "tar");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry17 = jarArchiveInputStream15.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = jarArchiveInputStream15.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = jarArchiveInputStream15.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = jarArchiveInputStream15.getNextEntry();
        int int21 = jarArchiveInputStream15.read();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertNull(jarArchiveEntry17);
        org.junit.Assert.assertNull(zipArchiveEntry18);
        org.junit.Assert.assertNull(archiveEntry19);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry8.setNumberOfLinks((long) 1);
        cpioArchiveEntry8.setDeviceMaj((long) 2048);
        cpioArchiveEntry8.setSize((long) 8);
        java.lang.String str15 = cpioArchiveEntry8.getName();
        cpioArchiveEntry8.setDeviceMin((long) (short) 100);
        cpioArchiveEntry8.setRemoteDeviceMin((long) 100);
        boolean boolean20 = cpioArchiveEntry8.isDirectory();
        cpioArchiveEntry8.setDeviceMin((long) 16384);
        long long23 = cpioArchiveEntry8.getMode();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "070702" + "'", str15, "070702");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        jarArchiveOutputStream6.setEncoding("org.apache.commons.compress.archivers.ArchiveException");
        boolean boolean13 = jarArchiveOutputStream6.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.putNextEntry(zipArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        int int14 = arArchiveInputStream13.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = arArchiveInputStream13.getNextEntry();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        int int19 = tarArchiveInputStream18.getRecordSize();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream20);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream21);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        boolean boolean29 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, 49152);
        int int30 = tarArchiveInputStream22.read(byteArray25);
        int int31 = tarArchiveInputStream18.read(byteArray25);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        int int33 = cpioArchiveInputStream32.available();
        int int34 = cpioArchiveInputStream32.available();
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream36 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream36);
        byte[] byteArray40 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean42 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray40, 2);
        boolean boolean44 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray40, 49152);
        int int45 = tarArchiveInputStream37.read(byteArray40);
        int int48 = cpioArchiveInputStream32.read(byteArray40, (int) (short) 2, 0);
        boolean boolean50 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray40, 64);
        int int51 = arArchiveInputStream13.read(byteArray40);
        java.io.InputStream inputStream52 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream53 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream52);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream53);
        tarArchiveInputStream54.reset();
        java.io.OutputStream outputStream56 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream56);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream58 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream57);
        jarArchiveOutputStream58.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream54, (java.io.OutputStream) jarArchiveOutputStream58, 100);
        java.io.InputStream inputStream62 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream63 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream62);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream64 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream63);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean69 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray67, 2);
        boolean boolean71 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray67, 49152);
        int int72 = tarArchiveInputStream64.read(byteArray67);
        int int73 = tarArchiveInputStream54.read(byteArray67);
        java.io.InputStream inputStream74 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream75 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream74);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream75);
        tarArchiveInputStream76.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream78 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream76);
        long long80 = tarArchiveInputStream76.skip((long) (byte) -1);
        byte[] byteArray83 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean85 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray83, 2);
        int int88 = tarArchiveInputStream76.read(byteArray83, (int) 'a', (-1));
        boolean boolean90 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray83, (int) '#');
        int int91 = tarArchiveInputStream54.read(byteArray83);
        int int94 = arArchiveInputStream13.read(byteArray83, 0, 4096);
        boolean boolean96 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray83, (int) (short) 4);
        boolean boolean98 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray83, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(archiveEntry15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray83), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream11);
        jarArchiveOutputStream12.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream12);
        tarArchiveOutputStream14.setDebug(false);
        tarArchiveOutputStream14.setDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream14, 4);
        tarArchiveOutputStream14.setLongFileMode(0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) tarArchiveOutputStream14, 64);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean30 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray28, (int) (short) 4);
        boolean boolean32 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray28, 16);
        int int33 = tarArchiveInputStream2.read(byteArray28);
        boolean boolean35 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray28, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.closeEntry();
        java.lang.String str19 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.finish();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        int int14 = tarArchiveInputStream13.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        long long22 = tarArchiveInputStream18.skip((long) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        int int30 = tarArchiveInputStream18.read(byteArray25, (int) 'a', (-1));
        int int31 = tarArchiveInputStream13.read(byteArray25);
        int int32 = tarArchiveInputStream2.read(byteArray25);
        tarArchiveInputStream2.close();
        int int34 = tarArchiveInputStream2.available();
        java.io.InputStream inputStream35 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream36 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream35);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream36);
        tarArchiveInputStream37.reset();
        java.io.OutputStream outputStream39 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream40 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream39);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream41 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream40);
        jarArchiveOutputStream41.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream37, (java.io.OutputStream) jarArchiveOutputStream41, 100);
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream46 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream45);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream46);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean52 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray50, 2);
        boolean boolean54 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray50, 49152);
        int int55 = tarArchiveInputStream47.read(byteArray50);
        int int56 = tarArchiveInputStream37.read(byteArray50);
        java.io.InputStream inputStream57 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream58 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream57);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream59 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream58);
        tarArchiveInputStream59.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream61 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream59);
        long long63 = tarArchiveInputStream59.skip((long) (byte) -1);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean68 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray66, 2);
        int int71 = tarArchiveInputStream59.read(byteArray66, (int) 'a', (-1));
        boolean boolean73 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray66, (int) '#');
        int int74 = tarArchiveInputStream37.read(byteArray66);
        int int77 = tarArchiveInputStream2.read(byteArray66, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean21 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray19, 2);
        boolean boolean23 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 49152);
        int int24 = tarArchiveInputStream16.read(byteArray19);
        int int27 = arArchiveInputStream13.read(byteArray19, (int) ' ', (int) '4');
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry28 = arArchiveInputStream13.getNextArEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = arArchiveInputStream13.getNextEntry();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry30 = arArchiveInputStream13.getNextArEntry();
        int int31 = arArchiveInputStream13.read();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry28);
        org.junit.Assert.assertNull(archiveEntry29);
        org.junit.Assert.assertNull(arArchiveEntry30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        jarArchiveOutputStream15.flush();
        jarArchiveOutputStream15.closeEntry();
        jarArchiveOutputStream15.flush();
        jarArchiveOutputStream15.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        jarArchiveOutputStream15.setMethod((int) (byte) 10);
        jarArchiveOutputStream15.flush();
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream15);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream27 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2, (int) (short) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.write(16384);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        int int14 = arArchiveInputStream13.read();
        int int15 = arArchiveInputStream13.read();
        byte[] byteArray19 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray((long) 0, (int) (byte) 10, true);
        int int20 = arArchiveInputStream13.read(byteArray19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream11.setMethod(8192);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        long long11 = tarArchiveInputStream7.skip((long) (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        int int19 = tarArchiveInputStream7.read(byteArray14, (int) 'a', (-1));
        int int22 = tarArchiveInputStream4.read(byteArray14, (int) (byte) 100, 1024);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream4, outputStream23, 4);
        int int26 = tarArchiveInputStream4.available();
        long long28 = tarArchiveInputStream4.skip(0L);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream4, (int) (byte) 0);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream32 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream31);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream33 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream32);
        tarArchiveInputStream33.reset();
        java.io.OutputStream outputStream35 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream36 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream35);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream37 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream36);
        jarArchiveOutputStream37.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream33, (java.io.OutputStream) jarArchiveOutputStream37, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream37);
        jarArchiveOutputStream37.setFallbackToUTF8(true);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream30, (java.io.OutputStream) jarArchiveOutputStream37);
        tarArchiveInputStream30.mark(0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        int int14 = arArchiveInputStream13.read();
        int int15 = arArchiveInputStream13.read();
        int int16 = arArchiveInputStream13.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry18 = arArchiveInputStream13.getNextArEntry();
        arArchiveInputStream13.close();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry18);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream15);
        jarArchiveOutputStream16.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream16);
        tarArchiveOutputStream18.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream18);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry25 = zipArchiveInputStream6.getNextZipEntry();
        int int26 = zipArchiveInputStream6.read();
        int int27 = zipArchiveInputStream6.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6, 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream29, 64, (int) (short) 12);
        long long34 = tarArchiveInputStream29.skip(25610L);
        org.junit.Assert.assertNull(zipArchiveEntry25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        int int17 = jarArchiveInputStream15.read();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry18 = jarArchiveInputStream15.getNextJarEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = jarArchiveInputStream15.getNextJarEntry();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jarArchiveEntry18);
        org.junit.Assert.assertNull(jarArchiveEntry19);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        long long11 = tarArchiveInputStream7.skip((long) (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        int int19 = tarArchiveInputStream7.read(byteArray14, (int) 'a', (-1));
        int int22 = tarArchiveInputStream4.read(byteArray14, (int) (byte) 100, 1024);
        tarArchiveInputStream4.close();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream25);
        tarArchiveInputStream26.reset();
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream28);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        jarArchiveOutputStream30.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream26, (java.io.OutputStream) jarArchiveOutputStream30, 100);
        int int34 = tarArchiveInputStream26.available();
        int int35 = tarArchiveInputStream26.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream26);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream39 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream38);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream39);
        tarArchiveInputStream40.mark(32);
        int int43 = tarArchiveInputStream40.read();
        tarArchiveInputStream40.close();
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream46 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream45);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream46);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean52 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray50, 2);
        boolean boolean54 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray50, 49152);
        int int55 = tarArchiveInputStream47.read(byteArray50);
        long long57 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray50, true);
        int int60 = tarArchiveInputStream40.read(byteArray50, 1024, (int) (byte) -1);
        int int61 = arArchiveInputStream37.read(byteArray50);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = arArchiveInputStream37.getNextEntry();
        java.io.OutputStream outputStream63 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream64 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream63);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream65 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream64);
        jarArchiveOutputStream65.flush();
        jarArchiveOutputStream65.closeEntry();
        jarArchiveOutputStream65.flush();
        jarArchiveOutputStream65.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy71 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream65.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy71);
        java.lang.String str73 = jarArchiveOutputStream65.getEncoding();
        jarArchiveOutputStream65.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream65);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) arArchiveInputStream37, (java.io.OutputStream) jarArchiveOutputStream65, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream79 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream65);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream65);
        jarArchiveOutputStream65.setMethod(1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 2660L + "'", long57 == 2660L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(archiveEntry62);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "UTF8" + "'", str73, "UTF8");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = tarArchiveInputStream6.read(byteArray9);
        int int15 = tarArchiveInputStream2.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int17 = cpioArchiveInputStream16.available();
        int int18 = cpioArchiveInputStream16.available();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream20 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream20);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, 2);
        boolean boolean28 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray24, 49152);
        int int29 = tarArchiveInputStream21.read(byteArray24);
        int int32 = cpioArchiveInputStream16.read(byteArray24, (int) (short) 2, 0);
        cpioArchiveInputStream16.closeEntry();
        java.io.OutputStream outputStream34 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream34);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream36 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream35);
        jarArchiveOutputStream36.flush();
        jarArchiveOutputStream36.closeEntry();
        jarArchiveOutputStream36.flush();
        jarArchiveOutputStream36.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy42 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream36.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy42);
        jarArchiveOutputStream36.setMethod((int) (byte) 10);
        java.io.OutputStream outputStream46 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream47 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream46);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream48 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream47);
        jarArchiveOutputStream48.flush();
        jarArchiveOutputStream48.closeEntry();
        jarArchiveOutputStream48.flush();
        jarArchiveOutputStream48.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy54 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream48.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy54);
        java.lang.String str56 = unicodeExtraFieldPolicy54.toString();
        java.lang.String str57 = unicodeExtraFieldPolicy54.toString();
        java.lang.String str58 = unicodeExtraFieldPolicy54.toString();
        jarArchiveOutputStream36.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy54);
        jarArchiveOutputStream36.setMethod((int) (byte) -1);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream16, (java.io.OutputStream) jarArchiveOutputStream36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry63 = cpioArchiveInputStream16.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy42);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "always" + "'", str56, "always");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "always" + "'", str57, "always");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "always" + "'", str58, "always");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        int int14 = arArchiveInputStream13.read();
        int int15 = arArchiveInputStream13.read();
        int int16 = arArchiveInputStream13.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream13);
        cpioArchiveInputStream17.closeEntry();
        int int19 = cpioArchiveInputStream17.available();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1, (int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.putNextEntry(tarArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        jarArchiveOutputStream8.flush();
        jarArchiveOutputStream8.closeArchiveEntry();
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 1, (byte) 100 };
        boolean boolean18 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray16, (int) (short) 4);
        boolean boolean20 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray16, (int) (short) 12);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream8.write(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        tarArchiveOutputStream10.closeArchiveEntry();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        jarArchiveOutputStream2.closeEntry();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        tarArchiveInputStream6.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
        long long10 = tarArchiveInputStream6.skip((long) (byte) -1);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean15 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray13, 2);
        int int18 = tarArchiveInputStream6.read(byteArray13, (int) 'a', (-1));
        boolean boolean20 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray13, (int) (short) 8);
        boolean boolean24 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray13, 4);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.write(byteArray13, (-1), 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.closeEntry();
        jarArchiveOutputStream6.flush();
        jarArchiveOutputStream6.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy12 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        jarArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy12);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        boolean boolean17 = cpioArchiveEntry16.isSocket();
        long long18 = cpioArchiveEntry16.getTime();
        cpioArchiveEntry16.setDeviceMaj((long) '#');
        cpioArchiveEntry16.setDeviceMaj(1L);
        long long23 = cpioArchiveEntry16.getNumberOfLinks();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        tarArchiveOutputStream10.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        jarArchiveOutputStream6.setFallbackToUTF8(true);
        jarArchiveOutputStream6.closeArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream6.setEncoding("org.apache.commons.compress.archivers.ArchiveException: 070701");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.archivers.ArchiveException: 070701");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        tarArchiveOutputStream10.setLongFileMode(49152);
        java.lang.String str17 = tarArchiveOutputStream10.getName();
        tarArchiveOutputStream10.closeEntry();
        java.lang.String str19 = tarArchiveOutputStream10.getName();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream20);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream21);
        tarArchiveInputStream22.mark(32);
        int int25 = tarArchiveInputStream22.read();
        tarArchiveInputStream22.close();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream27);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream28);
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean34 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray32, 2);
        boolean boolean36 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray32, 49152);
        int int37 = tarArchiveInputStream29.read(byteArray32);
        long long39 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray32, true);
        int int42 = tarArchiveInputStream22.read(byteArray32, 1024, (int) (byte) -1);
        boolean boolean44 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray32, 29127);
        boolean boolean46 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray32, (int) (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream10.write(byteArray32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: request to write '2' bytes exceeds size in header of '0' bytes for entry 'null'");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tar" + "'", str17, "tar");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "tar" + "'", str19, "tar");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2660L + "'", long39 == 2660L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        tarArchiveOutputStream3.setLongFileMode((int) (short) 2);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        tarArchiveOutputStream10.setLongFileMode(100);
        tarArchiveOutputStream10.setLongFileMode((int) ' ');
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream2);
        jarArchiveOutputStream3.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream3);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        jarArchiveOutputStream8.flush();
        jarArchiveOutputStream8.closeEntry();
        jarArchiveOutputStream8.flush();
        jarArchiveOutputStream8.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        jarArchiveOutputStream3.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        jarArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        java.lang.String str18 = jarArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTF8" + "'", str18, "UTF8");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream6);
        tarArchiveOutputStream10.finish();
        tarArchiveOutputStream10.setDebug(true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveInputStream2.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream8);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream12);
        int int14 = tarArchiveInputStream13.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17);
        tarArchiveInputStream18.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream18);
        long long22 = tarArchiveInputStream18.skip((long) (byte) -1);
        byte[] byteArray25 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray25, 2);
        int int30 = tarArchiveInputStream18.read(byteArray25, (int) 'a', (-1));
        int int31 = tarArchiveInputStream13.read(byteArray25);
        int int32 = tarArchiveInputStream2.read(byteArray25);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream33 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream33);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry35 = jarArchiveInputStream33.getNextEntry();
        java.io.OutputStream outputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream37 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream36);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream38 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream37);
        byte[] byteArray41 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean43 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray41, 2);
        boolean boolean45 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray41, 49152);
        cpioArchiveOutputStream37.write(byteArray41, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = jarArchiveInputStream33.read(byteArray41, (int) (short) 3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 512 + "'", int14 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(archiveEntry35);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream4);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        jarArchiveOutputStream6.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream2, (java.io.OutputStream) jarArchiveOutputStream6, 100);
        int int10 = tarArchiveInputStream2.available();
        int int11 = tarArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream15);
        tarArchiveInputStream16.mark(32);
        int int19 = tarArchiveInputStream16.read();
        tarArchiveInputStream16.close();
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream22);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean28 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 2);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray26, 49152);
        int int31 = tarArchiveInputStream23.read(byteArray26);
        long long33 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray26, true);
        int int36 = tarArchiveInputStream16.read(byteArray26, 1024, (int) (byte) -1);
        int int37 = arArchiveInputStream13.read(byteArray26);
        arArchiveInputStream13.close();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry39 = arArchiveInputStream13.getNextArEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry40 = arArchiveInputStream13.getNextEntry();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 2660L + "'", long33 == 2660L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(arArchiveEntry39);
        org.junit.Assert.assertNull(archiveEntry40);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        java.io.OutputStream outputStream15 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream15);
        jarArchiveOutputStream16.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream16);
        tarArchiveOutputStream18.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setLongFileMode((int) (short) 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream18);
        tarArchiveOutputStream18.setBufferDebug(true);
        int int27 = tarArchiveOutputStream18.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream18, 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream3);
        int int5 = tarArchiveInputStream4.getRecordSize();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream7);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, 2);
        boolean boolean15 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray11, 49152);
        int int16 = tarArchiveInputStream8.read(byteArray11);
        int int17 = tarArchiveInputStream4.read(byteArray11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        int int19 = cpioArchiveInputStream18.available();
        int int20 = cpioArchiveInputStream18.available();
        int int21 = cpioArchiveInputStream18.available();
        long long23 = cpioArchiveInputStream18.skip((long) 4096);
        cpioArchiveInputStream18.closeEntry();
        cpioArchiveInputStream18.close();
        org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream26 = archiveStreamFactory0.createArchiveInputStream("tar", (java.io.InputStream) cpioArchiveInputStream18);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream27);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream28);
        tarArchiveInputStream29.reset();
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream32 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream31);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream33 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream32);
        jarArchiveOutputStream33.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream29, (java.io.OutputStream) jarArchiveOutputStream33, 100);
        int int37 = tarArchiveInputStream29.available();
        int int38 = tarArchiveInputStream29.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream39 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream40 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) tarArchiveInputStream39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(archiveInputStream26);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        int int17 = jarArchiveInputStream15.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) jarArchiveInputStream15);
        int int19 = jarArchiveInputStream15.read();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry20 = jarArchiveInputStream15.getNextJarEntry();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(jarArchiveEntry20);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream1 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0);
        jarArchiveOutputStream1.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream1);
        tarArchiveOutputStream3.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream3);
        java.lang.String str8 = tarArchiveOutputStream3.getDefaultFileExtension();
        tarArchiveOutputStream3.closeEntry();
        tarArchiveOutputStream3.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream3.putNextEntry(tarArchiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tar" + "'", str8, "tar");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream7);
        jarArchiveOutputStream8.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream8);
        tarArchiveOutputStream10.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream6, (java.io.OutputStream) tarArchiveOutputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = jarArchiveInputStream15.getNextEntry();
        int int17 = jarArchiveInputStream15.read();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) jarArchiveInputStream15);
        int int19 = jarArchiveInputStream15.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = jarArchiveInputStream15.getNextEntry();
        org.junit.Assert.assertNull(archiveEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(archiveEntry20);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        long long6 = tarArchiveInputStream2.skip((long) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, (int) (short) 3);
        int int9 = tarArchiveInputStream8.read();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream11);
        tarArchiveInputStream12.mark(32);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream17);
        jarArchiveOutputStream18.closeEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream18);
        tarArchiveOutputStream20.setDebug(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream20);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) zipArchiveInputStream16, (java.io.OutputStream) tarArchiveOutputStream20);
        tarArchiveInputStream8.copyEntryContents((java.io.OutputStream) tarArchiveOutputStream20);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream20.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        int int3 = tarArchiveInputStream2.getRecordSize();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream5);
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 2);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 49152);
        int int14 = tarArchiveInputStream6.read(byteArray9);
        int int15 = tarArchiveInputStream2.read(byteArray9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        int int17 = cpioArchiveInputStream16.available();
        int int18 = cpioArchiveInputStream16.available();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream16, outputStream19);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream21);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream23, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream25);
        tarArchiveOutputStream26.setBufferDebug(false);
        tarArchiveOutputStream26.setBufferDebug(false);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream26, (int) (byte) 0);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) cpioArchiveInputStream16, (java.io.OutputStream) tarArchiveOutputStream26);
        tarArchiveOutputStream26.closeArchiveEntry();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 512 + "'", int3 == 512);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070702");
        cpioArchiveEntry4.setNumberOfLinks((long) 1);
        cpioArchiveEntry4.setDeviceMaj((long) 2048);
        cpioArchiveEntry4.setSize((long) 8);
        long long11 = cpioArchiveEntry4.getHeaderSize();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.putNextEntry(cpioArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream6);
        tarArchiveInputStream7.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        long long11 = tarArchiveInputStream7.skip((long) (byte) -1);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 2);
        int int19 = tarArchiveInputStream7.read(byteArray14, (int) 'a', (-1));
        int int22 = tarArchiveInputStream4.read(byteArray14, (int) (byte) 100, 1024);
        tarArchiveInputStream4.close();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream25 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream24);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream25);
        tarArchiveInputStream26.reset();
        java.io.OutputStream outputStream28 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream28);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream30 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream29);
        jarArchiveOutputStream30.flush();
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) tarArchiveInputStream26, (java.io.OutputStream) jarArchiveOutputStream30, 100);
        int int34 = tarArchiveInputStream26.available();
        int int35 = tarArchiveInputStream26.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream36 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream26);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream37 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream36);
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream39 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream38);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream39);
        tarArchiveInputStream40.mark(32);
        int int43 = tarArchiveInputStream40.read();
        tarArchiveInputStream40.close();
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream46 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream45);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream47 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream46);
        byte[] byteArray50 = new byte[] { (byte) 10, (byte) 100 };
        boolean boolean52 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray50, 2);
        boolean boolean54 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray50, 49152);
        int int55 = tarArchiveInputStream47.read(byteArray50);
        long long57 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(byteArray50, true);
        int int60 = tarArchiveInputStream40.read(byteArray50, 1024, (int) (byte) -1);
        int int61 = arArchiveInputStream37.read(byteArray50);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry62 = arArchiveInputStream37.getNextEntry();
        java.io.OutputStream outputStream63 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream64 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream63);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream65 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream64);
        jarArchiveOutputStream65.flush();
        jarArchiveOutputStream65.closeEntry();
        jarArchiveOutputStream65.flush();
        jarArchiveOutputStream65.setMethod(0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy71 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        jarArchiveOutputStream65.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy71);
        java.lang.String str73 = jarArchiveOutputStream65.getEncoding();
        jarArchiveOutputStream65.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream76 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream65);
        org.apache.commons.compress.utils.IOUtils.copy((java.io.InputStream) arArchiveInputStream37, (java.io.OutputStream) jarArchiveOutputStream65, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream79 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream65);
        tarArchiveInputStream4.copyEntryContents((java.io.OutputStream) jarArchiveOutputStream65);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream81 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream84 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream81, 0, 4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 2660L + "'", long57 == 2660L);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(archiveEntry62);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "UTF8" + "'", str73, "UTF8");
    }
}

