package com.autumn.learn.java8.DesignPatterns.decorator;

public class Client {
    public static void main(String[] args) {

        System.out.println("*****默认轮胎******");
        ITyre iTyre = new CarTyre();
        iTyre.listFunction();

        System.out.println("\n*****装饰器模式，增强轮胎功能******");
        ITyre iTyrePlus = new ConcreteDecorator(iTyre);
        iTyrePlus.listFunction();
    }
}
