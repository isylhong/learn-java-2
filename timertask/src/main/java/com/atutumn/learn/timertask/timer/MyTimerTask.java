package com.atutumn.learn.timertask.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    private String taskName;

    public MyTimerTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(new Date() + " : 任务「" + taskName + "」被执行。");
    }
}
