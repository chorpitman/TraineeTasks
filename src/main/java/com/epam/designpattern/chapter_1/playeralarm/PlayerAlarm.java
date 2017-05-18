package com.epam.designpattern.chapter_1.playeralarm;

public class PlayerAlarm implements Alarm, Player {

    private Player player;
    private Alarm alarm;

    public PlayerAlarm(Player player, Alarm alarm) {
        this.player = player;
        this.alarm = alarm;
    }

    @Override
    public void wakeUp() {
        alarm.wakeUp();
    }

    @Override
    public void play() {
        player.play();
    }
}
