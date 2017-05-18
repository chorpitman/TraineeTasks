package com.epam.java18.lambda.block;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial;

        factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(factorial.func(3));
        System.out.println(factorial.func(7));
        System.out.println("============================");

        StringFunc stringFunc;
        stringFunc = (str) -> {
            String result = "";
            int i;

            for (int j = str.length() - 1; j >= 0; j--) {
                result = result + str.charAt(j);
            }
            return result;
        };
        System.out.println("Реверс слова Лямбда -> " + stringFunc.func("Лямбда"));
    }
}
