package com.epam.designpattern.teplate;

public abstract class Protocol {

    public abstract void prepare();
    public abstract void send();
    public abstract void result();

    public void sendMessages() {
        prepare();
        send();
        result();
    }
}
