/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 03 03:37:55 GMT 2024
 */

package org.springframework.cloud.gcp.storage;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class GoogleStorageResourceObject_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.springframework.cloud.gcp.storage.GoogleStorageResourceObject"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    System.setProperties((java.util.Properties) defaultProperties.clone());
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
 
    System.setProperties((java.util.Properties) defaultProperties.clone());
    System.setProperty("file.encoding", "UTF-8");
    System.setProperty("java.awt.headless", "true");
    System.setProperty("java.io.tmpdir", "/var/folders/bj/3xblkdjx1lvdc8rmcdhf6ngw0000gn/T/");
    System.setProperty("user.country", "IN");
    System.setProperty("user.dir", "/Users/rahul/Documents/UIUC SEM 2/527/Temp milestone 3/Final/Bears-180/Patched-Version/spring-cloud-gcp-storage");
    System.setProperty("user.home", "/Users/rahul");
    System.setProperty("user.language", "en");
    System.setProperty("user.name", "rahul");
    System.setProperty("user.timezone", "America/Chicago");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GoogleStorageResourceObject_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.cloud.storage.BlobInfo$Builder",
      "com.google.cloud.storage.BlobId",
      "com.google.cloud.storage.StorageOptions",
      "com.google.cloud.storage.Bucket$BlobTargetOption",
      "org.springframework.core.io.WritableResource",
      "com.google.cloud.storage.Bucket$BucketSourceOption",
      "com.google.cloud.storage.Blob",
      "com.google.cloud.Restorable",
      "com.google.cloud.storage.BucketInfo$Builder",
      "com.google.cloud.storage.BucketInfo$DeleteRule",
      "com.google.api.client.json.GenericJson",
      "com.google.cloud.storage.Option",
      "com.google.cloud.storage.Acl$RawEntity",
      "com.google.cloud.storage.BlobInfo$CustomerEncryption",
      "org.springframework.core.io.Resource",
      "com.google.api.services.storage.model.StorageObject",
      "org.springframework.cloud.gcp.storage.GoogleStorageResourceObject",
      "com.google.cloud.storage.Cors",
      "com.google.api.client.util.GenericData",
      "com.google.cloud.storage.Storage$BlobSourceOption",
      "com.google.cloud.storage.Bucket",
      "com.google.api.gax.paging.Page",
      "com.google.cloud.storage.Bucket$BlobWriteOption",
      "com.google.common.base.Function",
      "com.google.cloud.storage.Storage$ComposeRequest",
      "com.google.cloud.storage.BlobInfo$1",
      "com.google.cloud.storage.BucketInfo",
      "com.google.cloud.Service",
      "com.google.cloud.storage.BlobInfo$BuilderImpl",
      "com.google.cloud.storage.ServiceAccount",
      "com.google.cloud.storage.Bucket$Builder",
      "org.springframework.core.io.InputStreamSource",
      "com.google.cloud.storage.Storage$BlobWriteOption",
      "com.google.cloud.storage.Storage$BucketGetOption",
      "com.google.cloud.storage.Storage",
      "com.google.cloud.WriteChannel",
      "com.google.cloud.GcpLaunchStage$Beta",
      "com.google.cloud.storage.StorageBatch",
      "com.google.cloud.ReadChannel",
      "com.google.cloud.Policy",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.cloud.http.BaseHttpServiceException",
      "com.google.cloud.storage.Storage$BucketSourceOption",
      "com.google.cloud.storage.Storage$BlobTargetOption",
      "com.google.cloud.storage.Acl$Domain",
      "com.google.cloud.ServiceOptions",
      "org.springframework.cloud.gcp.storage.GoogleStorageResourceBucket",
      "com.google.cloud.storage.BucketInfo$NumNewerVersionsDeleteRule",
      "com.google.cloud.storage.Blob$1",
      "com.google.cloud.storage.Blob$BlobSourceOption",
      "com.google.cloud.storage.Storage$BlobGetOption",
      "com.google.cloud.storage.Blob$Builder",
      "com.google.cloud.BaseServiceException",
      "com.google.cloud.storage.BucketInfo$BuilderImpl",
      "com.google.cloud.storage.BlobInfo",
      "com.google.cloud.storage.Storage$BlobListOption",
      "com.google.cloud.storage.BucketInfo$1",
      "com.google.cloud.storage.Acl$Group",
      "com.google.cloud.storage.BucketInfo$AgeDeleteRule",
      "com.google.cloud.storage.BucketInfo$2",
      "com.google.cloud.storage.Storage$BucketListOption",
      "com.google.cloud.storage.Acl",
      "com.google.common.base.MoreObjects",
      "com.google.cloud.storage.Storage$BucketTargetOption",
      "com.google.cloud.storage.Storage$CopyRequest",
      "com.google.cloud.storage.BucketInfo$RawDeleteRule",
      "com.google.cloud.StringEnumValue",
      "com.google.cloud.storage.CopyWriter",
      "com.google.api.services.storage.model.Bucket",
      "com.google.cloud.storage.BucketInfo$IsLiveDeleteRule",
      "com.google.cloud.storage.Acl$Project",
      "com.google.cloud.storage.Acl$Entity",
      "com.google.cloud.storage.StorageException",
      "com.google.cloud.storage.Storage$SignUrlOption",
      "com.google.cloud.storage.Acl$User",
      "com.google.common.base.Preconditions",
      "com.google.cloud.storage.StorageClass",
      "com.google.cloud.storage.BucketInfo$CreatedBeforeDeleteRule",
      "org.springframework.util.Assert"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.cloud.storage.Blob", false, GoogleStorageResourceObject_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.cloud.storage.Bucket", false, GoogleStorageResourceObject_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.cloud.storage.Storage", false, GoogleStorageResourceObject_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GoogleStorageResourceObject_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.springframework.cloud.gcp.storage.GoogleStorageResourceObject",
      "org.springframework.util.Assert",
      "com.google.cloud.storage.BlobId",
      "com.google.common.base.Preconditions",
      "org.springframework.cloud.gcp.storage.GoogleStorageResourceBucket",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.cloud.storage.BlobInfo$1",
      "com.google.cloud.storage.BlobInfo",
      "com.google.cloud.storage.Blob$1",
      "com.google.cloud.storage.Blob",
      "com.google.cloud.storage.BucketInfo$1",
      "com.google.cloud.storage.BucketInfo$2",
      "com.google.cloud.storage.BucketInfo",
      "com.google.cloud.storage.BucketInfo$Builder",
      "com.google.cloud.storage.BucketInfo$BuilderImpl",
      "com.google.cloud.storage.BlobInfo$Builder",
      "com.google.cloud.storage.BlobInfo$BuilderImpl",
      "com.google.cloud.storage.Bucket"
    );
  }
}
