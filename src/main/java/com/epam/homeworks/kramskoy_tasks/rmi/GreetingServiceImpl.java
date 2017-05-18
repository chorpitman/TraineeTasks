package com.epam.homeworks.kramskoy_tasks.rmi;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello(String msg) {
        System.out.println("Message: " + msg);
        return "Good Morning! AVATAR";
    }
}
