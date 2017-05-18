package com.epam.designpattern.chapter_1.playeralarm;

/**
 * @author Ivan_Zhuravel
 */
public class IPod implements Player {
    @Override
    public void play() {
        System.out.println("Play on Apple");
    }
}
