package com.epam.designpattern.chapter_1.playeralarm;

public class Main {
    public static void main(String[] args) {
        PlayerAlarm playerAlarm = new PlayerAlarm(new PlayerImpl(), new AlarmImpl());

        playerAlarm.play();
        playerAlarm.wakeUp();

        PlayerAlarm playerAlarm1 = new PlayerAlarm(new IPod(), new AlarmImpl());
        playerAlarm1.play();

        Player player = playerAlarm1;
    }
}
