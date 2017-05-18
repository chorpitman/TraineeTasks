package com.epam.homeworks.kramskoy_tasks.addtask;

class MyClass {
    static void main(String[] args) {
        /*MyClass a;
        MySubclass b;

        a = new MyClass();
        b = new MySubclass();

        a = b;
        b = a;

        a = new MySubclass();
        b = new MyClass();*/


        try {
            double f = 1 / 0;
            System.out.println("unreach");
        } catch (ArithmeticException e) {
            System.out.println("reach");
            throw new RuntimeException();
        } finally {
            System.out.println("reach");
        }
        System.out.println("unrich");
    }
}

class MySubclass extends MyClass {

}
