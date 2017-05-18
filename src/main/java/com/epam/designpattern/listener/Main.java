package com.epam.designpattern.listener;

class Main {

    public static void main(String[] args) {

        GeneralListener generalListener = new GeneralListener(new Event());
        generalListener.add(new ListenerImplement());
        generalListener.init();
    }
}
