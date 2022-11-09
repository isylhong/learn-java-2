package com.autumn.learn.timertask;

import com.atutumn.learn.timertask.timer.MyTimerTask;
import org.junit.Test;

import java.util.Timer;

public class TimeTaskTest {

    @Test
    public void delayOne() {
        Timer timer = new Timer();
        timer.schedule(new MyTimerTask("DelayOneDemo"), 1000L);
    }

    @Test
    public void PeriodDemo() {
        Timer timer = new Timer();
        timer.schedule(new MyTimerTask("PeriodDemo"), 1000L,500L);
    }

}
