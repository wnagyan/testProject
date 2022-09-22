package com.jike.design.proxy;

import com.jike.design.proxy.JDKDynamicProxy;

import java.lang.reflect.Proxy;

public class TestJDKProxy {

    public static void main(String[] args) {
        JDKDynamicProxy proxy = new JDKDynamicProxy(new Cat("富贵"));
        Animal cat = (Animal) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Animal.class}, proxy);
        cat.wakeup();
        cat.sleep();
    }
}
