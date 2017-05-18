package com.epam.java18.lambda.simple;

class Lambda {
    public static void main(String[] args) {
        MyNumber myNumber;  //link on functional interface
        //функциональный интерфей - это такой интерфейс
        // у которого есть один метод и он абстрактный (без реализации)

        myNumber = () -> 4469 / 42;
        System.out.println(myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println(myNumber.getValue());
        System.out.println(myNumber.getValue());
        System.out.println("==============EVEN EXAMPLE==================");

        NUmericTest nTest = (n) -> (n % 2 == 0);
        int n = 9;
        if (nTest.test(n)) {
            System.out.println("Число " + n + " четное");
        }
        if (!nTest.test(n)) {
            System.out.println("Число " + n + " не четное");
        }

        System.out.println("==============NEGATIVE EXAMPLE==================");

        NUmericTest negativeTest = (int n1) -> n1 >= 0;
        int n1 = -1;

        if (negativeTest.test(n1)) {
            System.out.println("Число " + n1 + " положительное");
        }

        if (!negativeTest.test(n1)) {
            System.out.println("Число " + n1 + " отрицательное");

        }

        System.out.println("==============2 arguments EXAMPLE==================");
        NumericTest2 numericTest2;
        numericTest2 = (int i, int d) -> (i % d) == 0;
        if (numericTest2.test(10,2)) {
            System.out.println("первое число - множитель второго");
        }
        if(!numericTest2.test(10, 3)) {
            System.out.println("первое число - не  множитель второго");

        }

//        numericTest2 = (int a, b) -> (a%b);  - так нельзя делать

    }
}
