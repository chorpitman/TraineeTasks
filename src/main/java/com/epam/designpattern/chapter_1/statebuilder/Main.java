package com.epam.designpattern.chapter_1.statebuilder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Client client = new Client.Builder().setPhone(3452318).setName("Vasya").setLastName("Pypkin").build();


        System.out.println(client.getPhone());
        System.out.println(client.getName());

    }
}
