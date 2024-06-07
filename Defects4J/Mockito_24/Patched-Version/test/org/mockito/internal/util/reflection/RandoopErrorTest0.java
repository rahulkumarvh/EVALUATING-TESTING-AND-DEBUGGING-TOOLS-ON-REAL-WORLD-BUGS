package org.mockito.internal.stubbing.defaultanswers;

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
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = null;
        returnsEmptyValues0.mockUtil = mockUtil1;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru3 = returnsEmptyValues0.methodsGuru;
        java.lang.reflect.Method method4 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean5 = objectMethodsGuru3.isToString(method4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = null;
        returnsEmptyValues0.mockUtil = mockUtil1;
        org.mockito.stubbing.Stubber stubber3 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) returnsEmptyValues0);
        org.mockito.stubbing.Stubber stubber4 = org.mockito.Mockito.doAnswer((org.mockito.stubbing.Answer) returnsEmptyValues0);
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues5 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil6 = null;
        returnsEmptyValues5.mockUtil = mockUtil6;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru8 = new org.mockito.internal.util.ObjectMethodsGuru();
        returnsEmptyValues5.methodsGuru = objectMethodsGuru8;
        returnsEmptyValues0.methodsGuru = objectMethodsGuru8;
        java.lang.reflect.Method method11 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean12 = objectMethodsGuru8.isToString(method11);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.mockito.internal.creation.MockSettingsImpl<org.mockito.verification.VerificationMode> verificationModeMockSettingsImpl0 = new org.mockito.internal.creation.MockSettingsImpl<org.mockito.verification.VerificationMode>();
        java.util.Set<java.lang.Class> classSet1 = verificationModeMockSettingsImpl0.getExtraInterfaces();
        java.util.Set<java.lang.Class> classSet2 = verificationModeMockSettingsImpl0.getExtraInterfaces();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress3 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.progress.ArgumentMatcherStorage argumentMatcherStorage4 = threadSafeMockingProgress3.getArgumentMatcherStorage();
        org.mockito.internal.matchers.Equals equals5 = new org.mockito.internal.matchers.Equals((java.lang.Object) threadSafeMockingProgress3);
        org.mockito.MockSettings mockSettings6 = org.mockito.Mockito.withSettings();
        java.lang.String str7 = equals5.describe((java.lang.Object) mockSettings6);
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs8 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.MockSettings mockSettings9 = mockSettings6.defaultAnswer((org.mockito.stubbing.Answer) returnsDeepStubs8);
        org.mockito.MockSettings mockSettings10 = verificationModeMockSettingsImpl0.defaultAnswer((org.mockito.stubbing.Answer) returnsDeepStubs8);
        org.mockito.MockSettings mockSettings12 = verificationModeMockSettingsImpl0.name("org.mockito.exceptions.verification.WantedButNotInvoked: hi!");
        java.util.List<org.mockito.listeners.InvocationListener> invocationListenerList13 = verificationModeMockSettingsImpl0.getInvocationListeners();
        org.mockito.MockSettings mockSettings15 = verificationModeMockSettingsImpl0.name("org.mockito.exceptions.verification.WantedButNotInvoked: hi!");
        org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet hashCodeAndEqualsSafeSet16 = new org.mockito.internal.util.collections.HashCodeAndEqualsSafeSet();
        java.lang.String str17 = hashCodeAndEqualsSafeSet16.toString();
        org.mockito.MockSettings mockSettings18 = verificationModeMockSettingsImpl0.spiedInstance((java.lang.Object) str17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on classSet1 and hashCodeAndEqualsSafeSet16.", classSet1.equals(hashCodeAndEqualsSafeSet16) == hashCodeAndEqualsSafeSet16.equals(classSet1));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        threadSafeMockingProgress0.stubbingStarted();
        threadSafeMockingProgress0.stubbingStarted();
        java.lang.String str3 = threadSafeMockingProgress0.toString();
        org.mockito.internal.creation.MockSettingsImpl<org.mockito.verification.VerificationMode> verificationModeMockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl<org.mockito.verification.VerificationMode>();
        java.util.Set<java.lang.Class> classSet5 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        java.util.Set<java.lang.Class> classSet6 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress7 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.progress.ArgumentMatcherStorage argumentMatcherStorage8 = threadSafeMockingProgress7.getArgumentMatcherStorage();
        org.mockito.internal.matchers.Equals equals9 = new org.mockito.internal.matchers.Equals((java.lang.Object) threadSafeMockingProgress7);
        org.mockito.MockSettings mockSettings10 = org.mockito.Mockito.withSettings();
        java.lang.String str11 = equals9.describe((java.lang.Object) mockSettings10);
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs12 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.MockSettings mockSettings13 = mockSettings10.defaultAnswer((org.mockito.stubbing.Answer) returnsDeepStubs12);
        org.mockito.MockSettings mockSettings14 = verificationModeMockSettingsImpl4.defaultAnswer((org.mockito.stubbing.Answer) returnsDeepStubs12);
        org.mockito.MockSettings mockSettings16 = verificationModeMockSettingsImpl4.name("org.mockito.exceptions.verification.WantedButNotInvoked: hi!");
        java.util.Set<java.lang.Class> classSet17 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl18 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) verificationModeMockSettingsImpl4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = invocationContainerImpl18.invokedMock();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        threadSafeMockingProgress0.stubbingStarted();
        threadSafeMockingProgress0.stubbingStarted();
        java.lang.String str3 = threadSafeMockingProgress0.toString();
        org.mockito.internal.creation.MockSettingsImpl<org.mockito.verification.VerificationMode> verificationModeMockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl<org.mockito.verification.VerificationMode>();
        java.util.Set<java.lang.Class> classSet5 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        java.util.Set<java.lang.Class> classSet6 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress7 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.progress.ArgumentMatcherStorage argumentMatcherStorage8 = threadSafeMockingProgress7.getArgumentMatcherStorage();
        org.mockito.internal.matchers.Equals equals9 = new org.mockito.internal.matchers.Equals((java.lang.Object) threadSafeMockingProgress7);
        org.mockito.MockSettings mockSettings10 = org.mockito.Mockito.withSettings();
        java.lang.String str11 = equals9.describe((java.lang.Object) mockSettings10);
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs12 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.MockSettings mockSettings13 = mockSettings10.defaultAnswer((org.mockito.stubbing.Answer) returnsDeepStubs12);
        org.mockito.MockSettings mockSettings14 = verificationModeMockSettingsImpl4.defaultAnswer((org.mockito.stubbing.Answer) returnsDeepStubs12);
        org.mockito.MockSettings mockSettings16 = verificationModeMockSettingsImpl4.name("org.mockito.exceptions.verification.WantedButNotInvoked: hi!");
        java.util.Set<java.lang.Class> classSet17 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl18 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) verificationModeMockSettingsImpl4);
        org.mockito.invocation.Invocation invocation19 = null;
        org.mockito.internal.exceptions.stacktrace.StackTraceFilter stackTraceFilter20 = new org.mockito.internal.exceptions.stacktrace.StackTraceFilter();
        org.mockito.exceptions.misusing.InvalidUseOfMatchersException invalidUseOfMatchersException22 = new org.mockito.exceptions.misusing.InvalidUseOfMatchersException("");
        java.lang.StackTraceElement[] stackTraceElementArray23 = invalidUseOfMatchersException22.getUnfilteredStackTrace();
        java.lang.StackTraceElement[] stackTraceElementArray25 = stackTraceFilter20.filter(stackTraceElementArray23, false);
        java.util.List<org.hamcrest.Matcher> matcherList26 = org.mockito.internal.invocation.ArgumentsProcessor.argumentsToMatchers((java.lang.Object[]) stackTraceElementArray23);
        org.mockito.internal.invocation.InvocationMatcher invocationMatcher27 = new org.mockito.internal.invocation.InvocationMatcher(invocation19, matcherList26);
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        invocationContainerImpl18.setMethodForStubbing(invocationMatcher27);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues returnsEmptyValues0 = new org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues();
        org.mockito.internal.util.MockUtil mockUtil1 = null;
        returnsEmptyValues0.mockUtil = mockUtil1;
        org.mockito.internal.util.ObjectMethodsGuru objectMethodsGuru3 = new org.mockito.internal.util.ObjectMethodsGuru();
        returnsEmptyValues0.methodsGuru = objectMethodsGuru3;
        java.lang.reflect.Method method5 = null;
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        boolean boolean6 = objectMethodsGuru3.isToString(method5);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress0 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        threadSafeMockingProgress0.stubbingStarted();
        threadSafeMockingProgress0.stubbingStarted();
        java.lang.String str3 = threadSafeMockingProgress0.toString();
        org.mockito.internal.creation.MockSettingsImpl<org.mockito.verification.VerificationMode> verificationModeMockSettingsImpl4 = new org.mockito.internal.creation.MockSettingsImpl<org.mockito.verification.VerificationMode>();
        java.util.Set<java.lang.Class> classSet5 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        java.util.Set<java.lang.Class> classSet6 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        org.mockito.internal.progress.ThreadSafeMockingProgress threadSafeMockingProgress7 = new org.mockito.internal.progress.ThreadSafeMockingProgress();
        org.mockito.internal.progress.ArgumentMatcherStorage argumentMatcherStorage8 = threadSafeMockingProgress7.getArgumentMatcherStorage();
        org.mockito.internal.matchers.Equals equals9 = new org.mockito.internal.matchers.Equals((java.lang.Object) threadSafeMockingProgress7);
        org.mockito.MockSettings mockSettings10 = org.mockito.Mockito.withSettings();
        java.lang.String str11 = equals9.describe((java.lang.Object) mockSettings10);
        org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs returnsDeepStubs12 = new org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs();
        org.mockito.MockSettings mockSettings13 = mockSettings10.defaultAnswer((org.mockito.stubbing.Answer) returnsDeepStubs12);
        org.mockito.MockSettings mockSettings14 = verificationModeMockSettingsImpl4.defaultAnswer((org.mockito.stubbing.Answer) returnsDeepStubs12);
        org.mockito.MockSettings mockSettings16 = verificationModeMockSettingsImpl4.name("org.mockito.exceptions.verification.WantedButNotInvoked: hi!");
        java.util.Set<java.lang.Class> classSet17 = verificationModeMockSettingsImpl4.getExtraInterfaces();
        org.mockito.internal.stubbing.InvocationContainerImpl invocationContainerImpl18 = new org.mockito.internal.stubbing.InvocationContainerImpl((org.mockito.internal.progress.MockingProgress) threadSafeMockingProgress0, (org.mockito.mock.MockCreationSettings) verificationModeMockSettingsImpl4);
        org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls returnsSmartNulls19 = new org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        invocationContainerImpl18.addConsecutiveAnswer((org.mockito.stubbing.Answer) returnsSmartNulls19);
    }
}

