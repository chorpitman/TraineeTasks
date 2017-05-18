package com.epam.designpattern.chapter_1.playeralarm;

/**
 * @author Ivan_Zhuravel
 */
public class AlarmImpl implements Alarm {
    @Override
    public void wakeUp() {
        System.out.println("Wake up! (Wake uP)");
    }
}
