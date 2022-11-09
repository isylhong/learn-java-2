package com.autumn.learn.encryption.ascii;

/**
 * AsciiDemo
 *
 */
public class AsciiDemo {

    public static void main(String[] args) {
//        char a = 'a';
//        int b = a;
        // 定义字符串
        String a = "AaZ";
        // 需要拆开字符串
        char[] chars = a.toCharArray();
        for (char aChar : chars) {
            int asciiCode = aChar;
            System.out.println(asciiCode);
        }
        // 打印b，在ascii当中十进制的数字对应是多少
//        System.out.println(b);
    }
}