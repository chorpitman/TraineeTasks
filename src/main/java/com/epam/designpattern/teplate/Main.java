package com.epam.designpattern.teplate;

public class Main {
    public static void main(String[] args) {
        Protocol tcp = new TCP();
        tcp.sendMessages();

        System.out.println();

        Protocol udp = new UDP();
        udp.sendMessages();
    }
}
