package com.epam.homeworks.kramskoy_tasks.addtask;

class Sync implements Runnable {
    private final Object obj = new Object();
    @Override
    public void run() {
        synchronized (obj) {
            System.out.println(Thread.currentThread().getName());
            System.out.print("X ");
            this.run2();
        }
    }


    public void run2() {
        synchronized (obj) {
            System.out.println(Thread.currentThread().getName());
            System.out.print("X2 ");
        }
    }
}

class Test {
    public static void main(String[] args) {
        /*Sync sync = new Sync();
        Thread t1 = new Thread(sync);
        Thread t2 = new Thread(sync);
        t1.start();
        t2.start();*/

//        FutureTask futureTask = new FutureTask();

        for (X.NUM num : X.NUM.values()) {
            System.out.println(num);
        }

        X obj = new X();
        X.B obj2 = obj.new B();
        obj2.f();
    }
}

class X {
    enum NUM{
        ONE,TWO
    }

    interface A{
        void f();
    }

    class B implements A{

        @Override
        public void f() {
            System.out.println("method f...");
        }
    }
}

class Person {
    String name;

    public Person(String personName) {
        name = personName;
    }

    public String greet(String yourName) {
        return String.format("Hi %s, my name is %s", name, yourName);
    }
}