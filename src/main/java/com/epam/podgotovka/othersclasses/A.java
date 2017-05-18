package com.epam.podgotovka.othersclasses;


class A {
    static void f() {
    }

    void f2() {
    }

    void f1() {
    }
}

class AA {
    AA.B b = new B();
    static class B {
        //статический внетрунний класс

        class BB {
        }
        //внутренний класс
    }

    void f() {
        class C {
            //локальный внетренний класс
        }
    }

    void g() {
        //анонимный класс
    }
}