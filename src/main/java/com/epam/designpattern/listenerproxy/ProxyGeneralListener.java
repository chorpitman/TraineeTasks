package com.epam.designpattern.listenerproxy;

import org.reflections.Reflections;

import java.lang.reflect.Proxy;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ProxyGeneralListener {
    private List<ListenerProxy> listenerProxies = new LinkedList<>();
    private Reflections reflections = new Reflections("com.epam.designpattern.listenerproxy");

    public void init() throws IllegalAccessException, InstantiationException {
        Set<Class<? extends ListenerProxy>> typesOf = reflections.getSubTypesOf(ListenerProxy.class);

        for (Class<? extends ListenerProxy> clazz : typesOf) {
            listenerProxies.add(clazz.newInstance());
        }
    }

    public EventWithProxy start() {
        Proxer proxer = new Proxer(listenerProxies, new EventWithProxyImpl());
        Class<EventWithProxy> [] eventInterfaces = new Class[]{EventWithProxy.class};
        return (EventWithProxy)
                Proxy.newProxyInstance(EventWithProxy.class.getClassLoader(), eventInterfaces, proxer);

    }
}
