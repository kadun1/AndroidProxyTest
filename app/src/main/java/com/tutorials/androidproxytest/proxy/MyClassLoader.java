package com.tutorials.androidproxytest.proxy;

import java.lang.reflect.Proxy;

public class MyClassLoader {

    public int testClassLoad() throws ClassNotFoundException {
        Multiplier multiplier = new Multiplier2x();
        Multiplier multiplierProxy = (Multiplier) Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class[]{Multiplier.class}, new MyProxyHandler(multiplier));
        int result = multiplierProxy.multiply(3);
        Class.forName("com.tutorials.androidproxytest");
        return result;
    }
}
