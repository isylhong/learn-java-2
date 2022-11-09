package com.autumn.learn.java8.DesignPatterns.adapter;

public class Client {
    public static void main(String[] args) {
        // 未使用适配器模式下，使用 ICollect接口的doCollect()方法；
        ICollect iCollect = new CollectFee();
        iCollect.doCollect();

        System.out.println();

        // 使用适配器模式下，使用目标接口ITarget接口的collect()方法；
        ITarget iTarget = new CollectFeeAdapter();
        iTarget.collect();


    }
}
