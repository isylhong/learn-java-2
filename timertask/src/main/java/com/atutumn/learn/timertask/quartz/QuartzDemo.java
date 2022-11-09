package com.atutumn.learn.timertask.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzDemo {
    public static void main(String[] args) throws SchedulerException {
        // 1、创建调度器Scheduler
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        // 2、创建JobDetail实例，并与PrintJob类绑定(Job执行内容)
        JobDetail jobDetail = JobBuilder.newJob(PrintJob.class).withIdentity("job01","job-group").build();
        // 3、构建Trigger实例，每隔1s执行一次
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger01","trigger-group")
                .startNow()  // 立即生效
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().
                        withIntervalInSeconds(1).  // 一直执行
                        repeatForever()).build();
        // 4、Scheduler绑定Job和Trigger，并执行
        scheduler.scheduleJob(jobDetail,trigger);
        System.out.println("--------scheduler start ! ------------");
        scheduler.start();
    }
}
