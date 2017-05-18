package com.epam.homeworks.kramskoy_tasks.rmi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Server {
    public static void main(String[] args) throws NamingException {
        GreetingService service = new GreetingServiceImpl();
        Context context = new InitialContext();
        context.bind("rmi:test", service);
        System.out.println("com.epam.homeworks.kramskoy_tasks.rmi.Server is ready...");
    }
}
