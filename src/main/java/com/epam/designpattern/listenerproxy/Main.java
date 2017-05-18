package com.epam.designpattern.listenerproxy;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ProxyGeneralListener listener = new ProxyGeneralListener();
        listener.init();
        EventWithProxy proxy = listener.start();
        proxy.doEvent();
    }
}
