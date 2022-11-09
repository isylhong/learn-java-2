package com.autumn.learn.java8.DesignPatterns.factory.simplefactory;

import com.autumn.learn.java8.DesignPatterns.factory.Phone;

public class Consumer {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Phone phone = factory.productPhone("XiaoMi");
        phone.listFunction();
    }
}
