package com.autumn.learn.encryption.bytebit;

import java.util.Arrays;

/**
 * ByteBitDemo
 */
public class ByteBitDemo {
    /**
     * 根据编码的格式不一样，对应的字节也不一样
     * 如果是UTF-8:一个中文对应的是三个字节
     * 如果是GBK : 一个中文对应的是二个字节
     *
     * 如果是英文，就无所谓编码格式
     */
    public static void main(String[] args) throws Exception{
        String str = "中";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        for (byte aByte : bytes) {
            System.out.print(aByte+"\t");
            String s = Integer.toBinaryString(aByte);
            System.out.println(s);
        }
        System.out.println(Integer.toBinaryString(-2));
    }
}