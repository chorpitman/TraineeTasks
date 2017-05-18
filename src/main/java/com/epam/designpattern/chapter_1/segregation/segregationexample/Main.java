//package com.epam.designpattern.chapter_1.segregation.segregationexample;
//
//import com.epam.designpattern.chapter_1.segregation.ToyDuck;
//
//public class Main {
//    public static void main(String[] args) {
//        LiveDuck liveDuck = new LiveDuck();
//
//        StandardDuckBehavior standardDuckBehavior = liveDuck;
//
//        standardDuckBehavior.fly();
//        standardDuckBehavior.swim();
//
//        EatingDuckBehavior eatingDuckBehavior = liveDuck;
//
//        eatingDuckBehavior.eat();
//
//        ToyDuck toyDuck = new ToyDuck();
//
//        StandardDuckBehavior standardDuckBehaviorToy = toyDuck;
//
//        standardDuckBehaviorToy.fly();
//        standardDuckBehaviorToy.swim();
//
//    }
//}
