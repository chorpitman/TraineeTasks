package com.epam.designpattern.listener;

import java.util.LinkedList;
import java.util.List;

class GeneralListener {

    private List<Listener> listeners = new LinkedList<>();
    private final Event event;

    public GeneralListener(Event event) {
        this.event = event;
    }

    public void add(Listener listener) {
        listeners.add(listener);
    }

    public void init() {
        event.doEvent();
        for (Listener listener : listeners) {
            listener.listen();
        }
    }
}
