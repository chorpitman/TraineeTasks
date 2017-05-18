package com.epam.homeworks.kramskoy_tasks.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GreetingService extends Remote {
    String sayHello(String msg) throws RemoteException;
}
