package com.autumn.learn.java8.encode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class DecodeTest {
    private static final Logger logger = LoggerFactory.getLogger(DecodeTest.class);
    private static final Charset GBK = Charset.forName("GBK");

    public static void main(String[] args) {
        String str = "中国广东";
        byte[] utf8Bytes = str.getBytes(StandardCharsets.UTF_8);
        String utf8Str = new String(utf8Bytes, StandardCharsets.UTF_8);
        logger.info("utf8Str: " + utf8Str + "\nutf8Bytes: " + Arrays.toString(utf8Bytes));
        byte[] gbkBytes = str.getBytes(GBK);
        String gbkStr = new String(gbkBytes, GBK);
        logger.info("gbkStr: " + gbkStr + "\ngbkBytes: " + Arrays.toString(gbkBytes));

        System.out.println("\n-----------------------");
        // UTF-8编码，GBK读取
        String utf8_GbkStr = new String(utf8Bytes, GBK);
        logger.info("(UTF-8编码，GBK读取)utf8_GbkStr: " + utf8_GbkStr);
        // GBK编码，UTF-8读取
        String gbk_Utf8Str = new String(gbkBytes, StandardCharsets.UTF_8);
        logger.info("(GBK编码，UTF-8读取)gbk_Utf8Str: " + gbk_Utf8Str);

        System.out.println("\n-----------------------");
        // GBK编码，UTF-8读取，再GBK读取
        byte[] gbkUtf8Bytes = gbk_Utf8Str.getBytes(StandardCharsets.UTF_8);
        logger.info(Arrays.toString(gbkUtf8Bytes));
        String gbk_Utf8GbkStr = new String(gbkUtf8Bytes, GBK);
        logger.info("(GBK编码，UTF-8读取,再GBK读取)gbk_Utf8GbkStr: "+gbk_Utf8GbkStr);

        System.out.println("\n-----------------------");
        // UTF-8编码，GBK读取，再UTF-8读取
        byte[] utf8GbkBytes = utf8_GbkStr.getBytes(GBK);
        logger.info(Arrays.toString(utf8GbkBytes));
        String utf8_GbkUtf8Str = new String(utf8GbkBytes, StandardCharsets.UTF_8);
        logger.info("(UTF-8编码，再GBK读取，UTF-8读取)gbk_Utf8GbkStr: "+utf8_GbkUtf8Str);
    }

}
