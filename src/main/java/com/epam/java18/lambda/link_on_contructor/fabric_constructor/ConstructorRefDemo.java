package com.epam.java18.lambda.link_on_contructor.fabric_constructor;

public class ConstructorRefDemo {
    static <R, T> R myClassFActory(MyfuncInter<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyfuncInter<MyClass<Double>, Double> myClasscons = MyClass<Double>::new;
        MyClass<Double> mc = myClassFActory(myClasscons, 100.1);

        System.out.println("значение val in mc object equals " + mc.getVal());

        MyfuncInter<MyClass2, String> myClasscons2 = MyClass2::new;
        MyClass2 mc2 = myClassFActory(myClasscons2, "Lambda");
        System.out.println("Значение str в объекте mc2 равно " + mc2.getStr());
    }
}
