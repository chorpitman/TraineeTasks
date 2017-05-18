package com.epam.java18.lambda.lambda_links_on_general_methods;

public class GenericMethRefDemo {
    static <T> int myOp (MyFunctionGeneralMethods<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,2,3,4,4,5};
        String[] strls = {"Один", "Семь", "Три", "Два" };
        int count;

        count = myOp(MyArraysOpp::<Integer>counMatching, vals, 4);
        System.out.println("массив vals содержит " + count + " числа 4");

        count = myOp(MyArraysOpp::<String>counMatching, strls, "Два");
        System.out.println("Массив strls содержит " + count + " числа два");
    }
}
