package com.epam.podgotovka.instance;

class C extends B {
    public static void main(String[] args) {
        /*A a = new A();
        B b = new B();*/
        B a = new C();
        C c = (C) new A();

        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
    }

    public void c() {

    }
}