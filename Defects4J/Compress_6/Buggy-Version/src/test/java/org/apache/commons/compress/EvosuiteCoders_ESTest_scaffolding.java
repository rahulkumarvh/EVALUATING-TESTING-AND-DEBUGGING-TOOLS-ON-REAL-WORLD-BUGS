/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 01 23:38:41 GMT 2024
 */

package org.apache.commons.compress.archivers.sevenz;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Coders_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.compress.archivers.sevenz.Coders"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/Users/sanjitkumar/personal_projects/CollegeIllinois/SoftwareEngineeringPrinciples/milestone3/m3_scripts"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/q_/q9vzn1hs6pqdw0s9wlgsgybw0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Coders_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder",
      "org.apache.commons.compress.compressors.CompressorInputStream",
      "org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream",
      "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream",
      "org.apache.commons.compress.compressors.bzip2.CRC",
      "org.apache.commons.compress.archivers.sevenz.SevenZMethod$1",
      "org.apache.commons.compress.compressors.bzip2.BlockSort",
      "org.apache.commons.compress.archivers.sevenz.Coders$CoderBase",
      "org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$1",
      "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream",
      "org.apache.commons.compress.archivers.sevenz.SevenZMethod",
      "org.apache.commons.compress.archivers.sevenz.Coders",
      "org.apache.commons.compress.archivers.sevenz.Coders$CopyDecoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$CoderId",
      "org.tukaani.xz.FinishableWrapperOutputStream",
      "org.apache.commons.compress.compressors.CompressorOutputStream",
      "org.apache.commons.compress.archivers.sevenz.Coder",
      "org.apache.commons.compress.archivers.sevenz.Coders$LZMADecoder",
      "org.tukaani.xz.LZMA2InputStream",
      "org.tukaani.xz.LZMAInputStream",
      "org.tukaani.xz.FinishableOutputStream",
      "org.apache.commons.compress.compressors.bzip2.BZip2Constants",
      "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data",
      "org.apache.commons.compress.archivers.sevenz.LZMA2Decoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Coders_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.compress.archivers.sevenz.Coders$CoderId",
      "org.apache.commons.compress.archivers.sevenz.SevenZMethod",
      "org.apache.commons.compress.archivers.sevenz.Coders$CoderBase",
      "org.apache.commons.compress.archivers.sevenz.Coders$CopyDecoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$LZMADecoder",
      "org.apache.commons.compress.archivers.sevenz.LZMA2Decoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$DeflateDecoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$BZIP2Decoder",
      "org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder",
      "org.apache.commons.compress.archivers.sevenz.Coders",
      "org.apache.commons.compress.archivers.sevenz.Coder",
      "org.apache.commons.compress.archivers.sevenz.Coders$AES256SHA256Decoder$1",
      "org.apache.commons.compress.compressors.CompressorInputStream",
      "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream",
      "org.apache.commons.compress.compressors.bzip2.CRC",
      "org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream",
      "org.apache.commons.compress.compressors.CompressorOutputStream",
      "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream",
      "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream$Data",
      "org.apache.commons.compress.compressors.bzip2.BlockSort",
      "org.tukaani.xz.FilterOptions",
      "org.tukaani.xz.LZMA2Options",
      "org.tukaani.xz.FinishableOutputStream",
      "org.tukaani.xz.FinishableWrapperOutputStream",
      "org.tukaani.xz.LZMA2OutputStream",
      "org.tukaani.xz.rangecoder.RangeCoder",
      "org.tukaani.xz.rangecoder.RangeEncoder",
      "org.tukaani.xz.lzma.LZMACoder",
      "org.tukaani.xz.lzma.LZMAEncoder",
      "org.tukaani.xz.lzma.LZMAEncoderNormal",
      "org.tukaani.xz.lz.LZEncoder",
      "org.tukaani.xz.lz.BT4",
      "org.tukaani.xz.lz.CRC32Hash",
      "org.tukaani.xz.lz.Hash234",
      "org.tukaani.xz.lz.Matches",
      "org.tukaani.xz.lzma.State",
      "org.tukaani.xz.lzma.LZMACoder$LiteralCoder",
      "org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder",
      "org.tukaani.xz.lzma.LZMACoder$LiteralCoder$LiteralSubcoder",
      "org.tukaani.xz.lzma.LZMAEncoder$LiteralEncoder$LiteralSubencoder",
      "org.tukaani.xz.lzma.LZMACoder$LengthCoder",
      "org.tukaani.xz.lzma.LZMAEncoder$LengthEncoder",
      "org.tukaani.xz.lzma.Optimum"
    );
  }
}
