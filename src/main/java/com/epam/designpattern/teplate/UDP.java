package com.epam.designpattern.teplate;

/**
 * Created by Oleg on 30.12.15.
 */
public class UDP extends Protocol{
    @Override
    public void prepare() {
        System.out.println("UDP prepared...");
    }

    @Override
    public void send() {
        System.out.println("UDP send...");
    }

    @Override
    public void result() {
        System.out.println("UDP result - success...");

    }
}
