package com.autumn.learn.java8.DesignPatterns.adapter;

public class CollectFee implements ICollect {

    @Override
    public void doCollect() {
        System.out.println("开始收集班费！");
    }
}
