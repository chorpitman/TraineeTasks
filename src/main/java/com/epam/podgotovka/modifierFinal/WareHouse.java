package com.epam.podgotovka.modifierFinal;

import java.util.Arrays;

 class Warehouse {
    public static void main(String[] args) {
        final Light light = new Light(); //не изменяемая локальная переменная
        light.noOfWatts = 100;
        System.out.println(Arrays.asList(light));
        light.noOfWatts = 800;
        System.out.println(Arrays.asList(light));
//        light = new Light(); //убираем, ставим final
    }
}