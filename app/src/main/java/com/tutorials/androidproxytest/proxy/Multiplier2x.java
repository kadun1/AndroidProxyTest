package com.tutorials.androidproxytest.proxy;

public class Multiplier2x implements Multiplier{
    @Override
    public int multiply(int value) {
        return value * 2;
    }

    public int multiply1(int value) {
        return value * 2;
    }
}
