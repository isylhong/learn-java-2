package com.autumn.learn.jvm.t4;

import java.lang.reflect.Method;

public interface Invoker {

    Object invoke(Method method, Object[] args);
}
