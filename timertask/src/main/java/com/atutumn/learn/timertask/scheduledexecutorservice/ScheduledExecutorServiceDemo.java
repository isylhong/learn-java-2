package com.atutumn.learn.timertask.scheduledexecutorservice;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo implements Runnable {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(new ScheduledExecutorServiceDemo(),
                500L, 1000L, TimeUnit.MILLISECONDS);

        executorService.scheduleWithFixedDelay(new ScheduledExecutorServiceDemo(),
                500L, 1000L, TimeUnit.MILLISECONDS);
    }


    @Override
    public void run() {
        System.out.println(new Date() + " : 任务「ScheduleAtFixedRateDemo」被执行。");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
