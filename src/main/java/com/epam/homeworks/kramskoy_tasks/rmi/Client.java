package com.epam.homeworks.kramskoy_tasks.rmi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws NamingException, RemoteException {
        String url = "rmi://localhost/test";
        Context context = new InitialContext();
        GreetingService service = (GreetingService) context.lookup(url);
        String response = service.sayHello("HI");
        System.out.println("Response: " + response);
    }
}
