package com.epam.designpattern.listenerproxy;

/**
 * Created by Oleg on 30.12.15.
 */
public class EventWithProxyImpl implements EventWithProxy {
    @Override
    public void doEvent() {
        System.out.println("Event with....");
    }
}
