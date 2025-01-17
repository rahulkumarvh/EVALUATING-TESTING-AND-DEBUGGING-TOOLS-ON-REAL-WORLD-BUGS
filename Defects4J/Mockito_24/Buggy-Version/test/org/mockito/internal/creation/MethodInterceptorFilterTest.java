/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.creation;

import static org.hamcrest.core.IsInstanceOf.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.creation.cglib.CGLIBHacker;
import org.mockito.internal.invocation.InvocationBuilder;
import org.mockito.internal.invocation.MockitoMethod;
import org.mockito.internal.invocation.SerializableMethod;
import org.mockitousage.MethodsImpl;
import org.mockitoutil.TestBase;

public class MethodInterceptorFilterTest extends TestBase {

    InternalMockHandler handler = Mockito.mock(InternalMockHandler.class);
    MethodInterceptorFilter filter = new MethodInterceptorFilter(handler, (MockSettingsImpl) withSettings());

    @Before
    public void setUp() {
        filter.cglibHacker = Mockito.mock(CGLIBHacker.class);        
    }

    @Test
    public void shouldBeSerializable() throws Exception {
        new ObjectOutputStream(new ByteArrayOutputStream()).writeObject(new MethodInterceptorFilter(null, null));
    }

    @Test
    public void shouldProvideOwnImplementationOfHashCode() throws Throwable {
        //when
        Object ret = filter.intercept(new MethodsImpl(), MethodsImpl.class.getMethod("hashCode"), new Object[0], null);

        //then
        assertTrue((Integer) ret != 0);
        Mockito.verify(handler, never()).handle(any(InvocationImpl.class));
    }

    @Test
    public void shouldProvideOwnImplementationOfEquals() throws Throwable {
        //when
        MethodsImpl proxy = new MethodsImpl();
        Object ret = filter.intercept(proxy, MethodsImpl.class.getMethod("equals", Object.class), new Object[] {proxy}, null);

        //then
        assertTrue((Boolean) ret);
        Mockito.verify(handler, never()).handle(any(InvocationImpl.class));
    }
    
    //TODO: move to separate factory
    @Test
    public void shouldCreateSerializableMethodProxyIfIsSerializableMock() {}
// Defects4J: flaky method
//     @Test
//     public void shouldCreateSerializableMethodProxyIfIsSerializableMock() throws Exception {
//         MethodInterceptorFilter filter = new MethodInterceptorFilter(handler, (MockSettingsImpl) withSettings().serializable());
//         MethodProxy methodProxy = MethodProxy.create(String.class, String.class, "", "toString", "toString");
//         
//         // when
//         MockitoMethodProxy mockitoMethodProxy = filter.createMockitoMethodProxy(methodProxy);
//         
//         // then
//         assertThat(mockitoMethodProxy, instanceOf(SerializableMockitoMethodProxy.class));
//     }
    
    @Test
    public void shouldCreateNONSerializableMethodProxyIfIsNotSerializableMock() {}
// Defects4J: flaky method
//     @Test
//     public void shouldCreateNONSerializableMethodProxyIfIsNotSerializableMock() throws Exception {
//         MethodInterceptorFilter filter = new MethodInterceptorFilter(handler, (MockSettingsImpl) withSettings());
//         MethodProxy methodProxy = MethodProxy.create(String.class, String.class, "", "toString", "toString");
//         
//         // when
//         MockitoMethodProxy mockitoMethodProxy = filter.createMockitoMethodProxy(methodProxy);
//         
//         // then
//         assertThat(mockitoMethodProxy, instanceOf(DelegatingMockitoMethodProxy.class));
//     }
    
    @Test
    public void shouldCreateSerializableMethodIfIsSerializableMock() {}
// Defects4J: flaky method
//     @Test
//     public void shouldCreateSerializableMethodIfIsSerializableMock() throws Exception {
//         MethodInterceptorFilter filter = new MethodInterceptorFilter(handler, (MockSettingsImpl) withSettings().serializable());
//         Method method = new InvocationBuilder().toInvocation().getMethod();
//         
//         // when
//         MockitoMethod mockitoMethod = filter.createMockitoMethod(method);
//         
//         // then
//         assertThat(mockitoMethod, instanceOf(SerializableMethod.class));
//     }
    
    @Test
    public void shouldCreateJustDelegatingMethodIfIsNotSerializableMock() {}
// Defects4J: flaky method
//     @Test
//     public void shouldCreateJustDelegatingMethodIfIsNotSerializableMock() throws Exception {
//         MethodInterceptorFilter filter = new MethodInterceptorFilter(handler, (MockSettingsImpl) withSettings());
//         Method method = new InvocationBuilder().toInvocation().getMethod();
//         
//         // when
//         MockitoMethod mockitoMethod = filter.createMockitoMethod(method);
//         
//         // then
//         assertThat(mockitoMethod, instanceOf(DelegatingMethod.class));
//     }
}