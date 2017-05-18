package com.epam.designpattern.teplate;

/**
 * Created by Oleg on 30.12.15.
 */
public class TCP extends Protocol {
    @Override
    public void prepare() {
        System.out.println("TCP prepared...");
    }

    @Override
    public void send() {
        System.out.println("TCP send mail...");
    }

    @Override
    public void result() {
        System.out.println("TCP result sucess...");
    }
}
