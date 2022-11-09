package com.atutumn.learn.timertask.timer;

import java.util.Timer;

public class TimerTaskDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();

//        timer.schedule(new MyTimerTask("DelayOneDemo"), 1000L);

//        timer.schedule(new MyTimerTask("PeriodDemo"), 1000L,500L);

        timer.scheduleAtFixedRate(new MyTimerTask("FixedRateDemo"),1000L,500L);
    }
}
