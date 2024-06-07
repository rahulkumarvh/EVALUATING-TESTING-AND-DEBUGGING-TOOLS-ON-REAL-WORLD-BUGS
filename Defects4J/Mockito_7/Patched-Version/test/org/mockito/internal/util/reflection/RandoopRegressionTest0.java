package org.mockito.internal.util.reflection;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.mockito.Answers answers0 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns1 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers0);
        java.lang.Class<?> wildcardClass2 = returns1.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass2);
        java.util.Map<java.lang.reflect.TypeVariable, java.lang.reflect.Type> typeVariableMap4 = genericMetadataSupport3.actualTypeArguments();
        org.junit.Assert.assertTrue("'" + answers0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(genericMetadataSupport3);
        org.junit.Assert.assertNotNull(typeVariableMap4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.Answers answers0 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns1 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers0);
        java.lang.Class<?> wildcardClass2 = returns1.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport5 = genericMetadataSupport3.resolveGenericReturnType(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + answers0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(genericMetadataSupport3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl1 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        boolean boolean2 = serializableMockSettingsImpl1.isUsingConstructor();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        org.mockito.MockSettings mockSettings5 = serializableMockSettingsImpl3.spiedInstance((java.lang.Object) (byte) -1);
        org.mockito.mock.SerializableMode serializableMode6 = null;
        org.mockito.MockSettings mockSettings7 = serializableMockSettingsImpl3.serializable(serializableMode6);
        boolean boolean8 = serializableMockSettingsImpl3.isUsingConstructor();
        java.lang.Class<?> wildcardClass9 = serializableMockSettingsImpl3.getClass();
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) serializableMockSettingsImpl1, (java.lang.Class) wildcardClass9);
        org.mockito.invocation.Invocation invocation11 = null;
        threadSafeMockingProgress0.stubbingCompleted(invocation11);
        org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing13 = threadSafeMockingProgress0.pullOngoingStubbing();
        java.lang.String str14 = threadSafeMockingProgress0.toString();
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru15 = new org.mockito.internal.util.ObjectMethodsGuru();
        org.mockito.Answers answers16 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns17 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers16);
        java.lang.Class<?> wildcardClass18 = returns17.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport19 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass18);
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) objectMethodsGuru15, (java.lang.Class) wildcardClass18);
        java.lang.reflect.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = objectMethodsGuru15.isCompareToMethod(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(iOngoingStubbing13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null" + "'", str14, "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null");
        org.junit.Assert.assertTrue("'" + answers16 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers16.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericMetadataSupport19);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.exceptions.Reporter reporter0 = new org.mockito.exceptions.Reporter();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress1 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl2 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        boolean boolean3 = serializableMockSettingsImpl2.isUsingConstructor();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        org.mockito.MockSettings mockSettings6 = serializableMockSettingsImpl4.spiedInstance((java.lang.Object) (byte) -1);
        org.mockito.mock.SerializableMode serializableMode7 = null;
        org.mockito.MockSettings mockSettings8 = serializableMockSettingsImpl4.serializable(serializableMode7);
        boolean boolean9 = serializableMockSettingsImpl4.isUsingConstructor();
        java.lang.Class<?> wildcardClass10 = serializableMockSettingsImpl4.getClass();
        threadSafeMockingProgress1.mockingStarted((java.lang.Object) serializableMockSettingsImpl2, (java.lang.Class) wildcardClass10);
        org.mockito.invocation.Invocation invocation12 = null;
        threadSafeMockingProgress1.stubbingCompleted(invocation12);
        org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing14 = threadSafeMockingProgress1.pullOngoingStubbing();
        java.lang.String str15 = threadSafeMockingProgress1.toString();
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru16 = new org.mockito.internal.util.ObjectMethodsGuru();
        org.mockito.Answers answers17 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns18 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers17);
        java.lang.Class<?> wildcardClass19 = returns18.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport20 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass19);
        threadSafeMockingProgress1.mockingStarted((java.lang.Object) objectMethodsGuru16, (java.lang.Class) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            reporter0.serializableWontWorkForObjectsThatDontImplementSerializable((java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type org.mockito.exceptions.base.MockitoException; message: ?You are using the setting 'withSettings().serializable()' however the type you are trying to mock 'Answers'?do not implement Serializable AND do not have a no-arg constructor.?This combination is requested, otherwise you will get an 'java.io.InvalidClassException' when the mock will be serialized??Also note that as requested by the Java serialization specification, the whole hierarchy need to implements Serializable,?i.e. the top-most superclass has to implements Serializable.?");
        } catch (org.mockito.exceptions.base.MockitoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mockSettings6);
        org.junit.Assert.assertNotNull(mockSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(iOngoingStubbing14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null" + "'", str15, "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null");
        org.junit.Assert.assertTrue("'" + answers17 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers17.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(genericMetadataSupport20);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl1 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        boolean boolean2 = serializableMockSettingsImpl1.isUsingConstructor();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        org.mockito.MockSettings mockSettings5 = serializableMockSettingsImpl3.spiedInstance((java.lang.Object) (byte) -1);
        org.mockito.mock.SerializableMode serializableMode6 = null;
        org.mockito.MockSettings mockSettings7 = serializableMockSettingsImpl3.serializable(serializableMode6);
        boolean boolean8 = serializableMockSettingsImpl3.isUsingConstructor();
        java.lang.Class<?> wildcardClass9 = serializableMockSettingsImpl3.getClass();
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) serializableMockSettingsImpl1, (java.lang.Class) wildcardClass9);
        org.mockito.invocation.Invocation invocation11 = null;
        threadSafeMockingProgress0.stubbingCompleted(invocation11);
        org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing13 = threadSafeMockingProgress0.pullOngoingStubbing();
        java.lang.String str14 = threadSafeMockingProgress0.toString();
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru15 = new org.mockito.internal.util.ObjectMethodsGuru();
        org.mockito.Answers answers16 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns17 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers16);
        java.lang.Class<?> wildcardClass18 = returns17.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport19 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass18);
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) objectMethodsGuru15, (java.lang.Class) wildcardClass18);
        java.lang.reflect.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = objectMethodsGuru15.isHashCodeMethod(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(iOngoingStubbing13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null" + "'", str14, "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null");
        org.junit.Assert.assertTrue("'" + answers16 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers16.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericMetadataSupport19);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.Answers answers0 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns1 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers0);
        java.lang.Class<?> wildcardClass2 = returns1.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass2);
        java.lang.reflect.TypeVariable typeVariable4 = null;
        java.lang.reflect.TypeVariable[] typeVariableArray5 = new java.lang.reflect.TypeVariable[] { typeVariable4 };
        // The following exception was thrown during execution in test generation
        try {
            genericMetadataSupport3.registerTypeParametersOn(typeVariableArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + answers0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(genericMetadataSupport3);
        org.junit.Assert.assertNotNull(typeVariableArray5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress1 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl2 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        boolean boolean3 = serializableMockSettingsImpl2.isUsingConstructor();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        org.mockito.MockSettings mockSettings6 = serializableMockSettingsImpl4.spiedInstance((java.lang.Object) (byte) -1);
        org.mockito.mock.SerializableMode serializableMode7 = null;
        org.mockito.MockSettings mockSettings8 = serializableMockSettingsImpl4.serializable(serializableMode7);
        boolean boolean9 = serializableMockSettingsImpl4.isUsingConstructor();
        java.lang.Class<?> wildcardClass10 = serializableMockSettingsImpl4.getClass();
        threadSafeMockingProgress1.mockingStarted((java.lang.Object) serializableMockSettingsImpl2, (java.lang.Class) wildcardClass10);
        org.mockito.invocation.Invocation invocation12 = null;
        threadSafeMockingProgress1.stubbingCompleted(invocation12);
        org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing14 = threadSafeMockingProgress1.pullOngoingStubbing();
        java.lang.String str15 = threadSafeMockingProgress1.toString();
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru16 = new org.mockito.internal.util.ObjectMethodsGuru();
        org.mockito.Answers answers17 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns18 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers17);
        java.lang.Class<?> wildcardClass19 = returns18.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport20 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass19);
        threadSafeMockingProgress1.mockingStarted((java.lang.Object) objectMethodsGuru16, (java.lang.Class) wildcardClass19);
        org.mockito.internal.util.MockNameImpl mockNameImpl22 = new org.mockito.internal.util.MockNameImpl("iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null", (java.lang.Class) wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(mockSettings6);
        org.junit.Assert.assertNotNull(mockSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(iOngoingStubbing14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null" + "'", str15, "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null");
        org.junit.Assert.assertTrue("'" + answers17 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers17.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(genericMetadataSupport20);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl1 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        boolean boolean2 = serializableMockSettingsImpl1.isUsingConstructor();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        org.mockito.MockSettings mockSettings5 = serializableMockSettingsImpl3.spiedInstance((java.lang.Object) (byte) -1);
        org.mockito.mock.SerializableMode serializableMode6 = null;
        org.mockito.MockSettings mockSettings7 = serializableMockSettingsImpl3.serializable(serializableMode6);
        boolean boolean8 = serializableMockSettingsImpl3.isUsingConstructor();
        java.lang.Class<?> wildcardClass9 = serializableMockSettingsImpl3.getClass();
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) serializableMockSettingsImpl1, (java.lang.Class) wildcardClass9);
        org.mockito.invocation.Invocation invocation11 = null;
        threadSafeMockingProgress0.stubbingCompleted(invocation11);
        org.mockito.internal.progress.IOngoingStubbing iOngoingStubbing13 = threadSafeMockingProgress0.pullOngoingStubbing();
        java.lang.String str14 = threadSafeMockingProgress0.toString();
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru15 = new org.mockito.internal.util.ObjectMethodsGuru();
        org.mockito.Answers answers16 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns17 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers16);
        java.lang.Class<?> wildcardClass18 = returns17.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport19 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass18);
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) objectMethodsGuru15, (java.lang.Class) wildcardClass18);
        java.lang.reflect.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = objectMethodsGuru15.isEqualsMethod(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(iOngoingStubbing13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null" + "'", str14, "iOngoingStubbing: null, verificationMode: null, stubbingInProgress: null");
        org.junit.Assert.assertTrue("'" + answers16 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers16.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericMetadataSupport19);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.Answers answers0 = org.mockito.Answers.RETURNS_DEFAULTS;
        org.mockito.internal.stubbing.answers.Returns returns1 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers0);
        java.lang.Class<?> wildcardClass2 = returns1.getReturnType();
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport3 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass2);
        java.lang.Class<?> wildcardClass4 = genericMetadataSupport3.rawType();
        boolean boolean5 = genericMetadataSupport3.hasRawExtraInterfaces();
        boolean boolean6 = genericMetadataSupport3.hasRawExtraInterfaces();
        java.lang.reflect.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport8 = genericMetadataSupport3.resolveGenericReturnType(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + answers0 + "' != '" + org.mockito.Answers.RETURNS_DEFAULTS + "'", answers0.equals(org.mockito.Answers.RETURNS_DEFAULTS));
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(genericMetadataSupport3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl1 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        boolean boolean2 = serializableMockSettingsImpl1.isUsingConstructor();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl3 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        org.mockito.MockSettings mockSettings5 = serializableMockSettingsImpl3.spiedInstance((java.lang.Object) (byte) -1);
        org.mockito.mock.SerializableMode serializableMode6 = null;
        org.mockito.MockSettings mockSettings7 = serializableMockSettingsImpl3.serializable(serializableMode6);
        boolean boolean8 = serializableMockSettingsImpl3.isUsingConstructor();
        java.lang.Class<?> wildcardClass9 = serializableMockSettingsImpl3.getClass();
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) serializableMockSettingsImpl1, (java.lang.Class) wildcardClass9);
        org.mockito.invocation.Invocation invocation11 = null;
        threadSafeMockingProgress0.stubbingCompleted(invocation11);
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl13 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        org.mockito.MockSettings mockSettings15 = serializableMockSettingsImpl13.spiedInstance((java.lang.Object) (byte) -1);
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress16 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl17 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        boolean boolean18 = serializableMockSettingsImpl17.isUsingConstructor();
        org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable> serializableMockSettingsImpl19 = new org.mockito.internal.creation.MockSettingsImpl<java.io.Serializable>();
        org.mockito.MockSettings mockSettings21 = serializableMockSettingsImpl19.spiedInstance((java.lang.Object) (byte) -1);
        org.mockito.mock.SerializableMode serializableMode22 = null;
        org.mockito.MockSettings mockSettings23 = serializableMockSettingsImpl19.serializable(serializableMode22);
        boolean boolean24 = serializableMockSettingsImpl19.isUsingConstructor();
        java.lang.Class<?> wildcardClass25 = serializableMockSettingsImpl19.getClass();
        threadSafeMockingProgress16.mockingStarted((java.lang.Object) serializableMockSettingsImpl17, (java.lang.Class) wildcardClass25);
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) (byte) -1, (java.lang.Class) wildcardClass25);
        org.mockito.plugins.StackTraceCleanerProvider stackTraceCleanerProvider28 = org.mockito.internal.configuration.plugins.Plugins.getStackTraceCleanerProvider();
        org.mockito.Answers answers29 = org.mockito.Answers.RETURNS_DEEP_STUBS;
        org.mockito.internal.stubbing.answers.Returns returns30 = new org.mockito.internal.stubbing.answers.Returns((java.lang.Object) answers29);
        java.lang.Class<?> wildcardClass31 = returns30.getReturnType();
        threadSafeMockingProgress0.mockingStarted((java.lang.Object) stackTraceCleanerProvider28, (java.lang.Class) wildcardClass31);
        org.mockito.internal.util.reflection.GenericMetadataSupport genericMetadataSupport33 = org.mockito.internal.util.reflection.GenericMetadataSupport.inferFrom((java.lang.reflect.Type) wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(mockSettings5);
        org.junit.Assert.assertNotNull(mockSettings7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mockSettings15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mockSettings21);
        org.junit.Assert.assertNotNull(mockSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(stackTraceCleanerProvider28);
        org.junit.Assert.assertTrue("'" + answers29 + "' != '" + org.mockito.Answers.RETURNS_DEEP_STUBS + "'", answers29.equals(org.mockito.Answers.RETURNS_DEEP_STUBS));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(genericMetadataSupport33);
    }
}

