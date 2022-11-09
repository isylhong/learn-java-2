package com.autumn.learn.network.base.channel;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

//通道之间数据传输
public class FileChannelDemo4 {

    //transferTo()
    public static void main(String[] args) throws Exception {
        // 创建两个fileChannel
        RandomAccessFile aFile = new RandomAccessFile("d:\\atguigu\\001.txt","rw");
        FileChannel fromChannel = aFile.getChannel();

        RandomAccessFile bFile = new RandomAccessFile("d:\\atguigu\\03.txt","rw");
        FileChannel toChannel = bFile.getChannel();

        //fromChannel 传输到 toChannel
        long position = 0;
        long size = fromChannel.size();
        fromChannel.transferTo(0,size,toChannel);

        aFile.close();
        bFile.close();
        System.out.println("over!");
    }
}
