package com.autumn.learn.java8.DesignPatterns.factory.multimethod;

import com.autumn.learn.java8.DesignPatterns.factory.Phone;

public class Consumer {
    public static void main(String[] args) {
        MultiMethodFactory factory = new MultiMethodFactory();
        Phone phone = factory.productHuaWeiPhone();
        phone.listFunction();
    }
}
