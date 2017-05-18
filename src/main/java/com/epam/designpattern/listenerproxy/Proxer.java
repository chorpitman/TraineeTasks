package com.epam.designpattern.listenerproxy;

import com.epam.designpattern.listener.Event;
import com.epam.designpattern.listener.Listener;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Proxer implements InvocationHandler {
    private List<ListenerProxy> listenerProxies = new LinkedList<>();
    private EventWithProxy eventWithProxy;

    public Proxer(List<ListenerProxy> listenerProxies, EventWithProxy eventWithProxy) {
        this.listenerProxies = listenerProxies;
        this.eventWithProxy = eventWithProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        for (ListenerProxy listenerProxy: listenerProxies) {
            listenerProxy.listen();
        }

        return method.invoke(eventWithProxy, args);
    }
}
