package com.autumn.learn.java8.DesignPatterns.decorator;

public class ConcreteDecorator extends TyreDecorator {

    public ConcreteDecorator(ITyre iTyre) {
        super(iTyre);
    }

    @Override
    public void listFunction() {
        super.listFunction(); // 原轮胎功能
        extendFunction(); // 轮胎功能拓展
    }

    // 对listFunction()方法进行功能拓展
    public void extendFunction() {
        System.out.println("功能增强，防滑...");
    }
}
