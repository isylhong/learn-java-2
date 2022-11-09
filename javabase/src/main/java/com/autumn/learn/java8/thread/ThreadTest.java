package com.autumn.learn.java8.thread;

public class ThreadTest {
    private int i = 0;

    public void f1() {
        this.i = 1;
    }

    public void f2() {
        int j = this.i;
        System.out.println(j);
    }
}
