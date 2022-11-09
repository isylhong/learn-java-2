package com.autumn.learn.java8.DesignPatterns.adapter;

/**
 * 对象适配器模式：成员变量 + 实现目标接口
 */
public class CollectFeeAdapter2 implements ITarget {

    private ICollect iCollect;

    public CollectFeeAdapter2(ICollect iCollect) {
        this.iCollect = iCollect;
    }

    @Override
    public Double collect() {
        iCollect.doCollect();
        return 101.0;
    }
}
