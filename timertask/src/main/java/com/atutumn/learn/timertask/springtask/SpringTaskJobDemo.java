package com.atutumn.learn.timertask.springtask;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTaskJobDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.autumn.timetask");

        SpringTaskJob taskJob = applicationContext.getBean("taskJob", SpringTaskJob.class);

        taskJob.job01();
    }
}
