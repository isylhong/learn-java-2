package com.autumn.learn.jvm.t3.bytecode;

public class Demo3_12_1 {
    public static void main(String[] args) {
        int result = test();
        System.out.println(result);
    }

    public static int test() {
        try {
            int i = 1/0;
            return 10;
        } finally {
            return 20; // finally中有return，1/0不会抛出异常
        }
    }
}
