package com.atutumn.learn.timertask.springtask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("taskJob")
public class SpringTaskJob {
    @Scheduled(cron = "0 0 3 * * ?")
    public void job01(){
        System.out.println("通过cron定义的定时任务");
    }

    @Scheduled(fixedDelay = 1000L)
    public void job02() {
        System.out.println("通过fixedDelay定义的定时任务");
    }

    @Scheduled(fixedRate = 1000L)
    public void job03() {
        System.out.println("通过fixedRate定义的定时任务");
    }

}
