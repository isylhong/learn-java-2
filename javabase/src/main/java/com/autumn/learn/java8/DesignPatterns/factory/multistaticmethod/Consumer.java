package com.autumn.learn.java8.DesignPatterns.factory.multistaticmethod;

import com.autumn.learn.java8.DesignPatterns.factory.Phone;
public class Consumer {
    public static void main(String[] args) {
        Phone phone = MultiStaticMethodFactory.productNokiaPhone();
        phone.listFunction();
    }
}
