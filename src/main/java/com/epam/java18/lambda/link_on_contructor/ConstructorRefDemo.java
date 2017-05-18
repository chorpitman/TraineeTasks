package com.epam.java18.lambda.link_on_contructor;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFInter myFInter = MyClass::new;
        MyClass mc = myFInter.func(100);
        System.out.println(mc.getValue());
    }
}
