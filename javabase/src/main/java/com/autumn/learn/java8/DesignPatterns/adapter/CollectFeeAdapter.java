package com.autumn.learn.java8.DesignPatterns.adapter;

/**
 * 类适配器模式：继承 + 实现目标接口
 */
public class CollectFeeAdapter extends CollectFee implements ITarget{
    @Override
    public Double collect() {
        super.doCollect();
        return 100.0;
    }
}
