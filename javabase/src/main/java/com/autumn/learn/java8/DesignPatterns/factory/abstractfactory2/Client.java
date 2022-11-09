package com.autumn.learn.java8.DesignPatterns.factory.abstractfactory2;

import com.autumn.learn.java8.DesignPatterns.factory.Phone;

public class Client {
    public static void main(String[] args) {
//        AbstractFactory factory = new HuaWeiFactory();
        AbstractFactory factory = new XiaoMiFactory();
        Computer computer = factory.productComputer();
        computer.listConfiguration();
        Phone phone = factory.productPhone();
        phone.listFunction();


    }
}
