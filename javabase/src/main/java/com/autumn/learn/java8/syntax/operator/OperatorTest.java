package com.autumn.learn.java8.syntax.operator;

import org.junit.Test;

public class OperatorTest {
    @Test
    public void test01() {
        int a = 10;
        int b = (a++) + (++a) + (a--) + (--a);
        System.out.println(b);
    }
}
