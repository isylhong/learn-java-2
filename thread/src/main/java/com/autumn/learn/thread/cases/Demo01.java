package com.autumn.learn.thread.cases;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 问题: A 线程打印 2 次 A，B 线程打印 3 次 B，C 线程打印 4 次 C,按照此顺序循环 3 轮
 */

public class Demo01 {
    private int count = 1;

    Lock lock = new ReentrantLock();

    Condition conditionA = lock.newCondition();
    Condition conditionB = lock.newCondition();
    Condition conditionC = lock.newCondition();


    public void printA(int n) {
        try {
            lock.lock();
            while (count != 1) {
                conditionA.await();
            }
            for (int i = 0; i < 2; i++) {
                System.out.println(Thread.currentThread().getName() + "输出 A,第" + n + "轮开始");
            }
            count = 2;
            conditionB.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printB(int n) {
        try {
            lock.lock();
            while (count != 2) {
                conditionB.await();
            }
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + "输出 B,第" + n + "轮开始");
            }
            count = 3;
            conditionC.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printC(int n) {
        try {
            lock.lock();
            while (count != 3) {
                conditionC.await();
            }
            for (int i = 0; i < 4; i++) {
                System.out.println(Thread.currentThread().getName() + "输出 C,第" + n + "轮开始");
            }
            count = 1;
            conditionA.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();

        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    demo01.printA(i);
                }
            }
        }.start();

        new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                demo01.printB(i);
            }
        }, "threadB").start();

        new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                demo01.printC(i);
            }
        }, "threadC").start();
    }

}