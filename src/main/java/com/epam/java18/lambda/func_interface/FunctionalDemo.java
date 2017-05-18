package com.epam.java18.lambda.func_interface;

//Some text. Need delete
public class FunctionalDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse;
        reverse = (str) -> {
            String result = "";
            int i;
            for (int j = str.length() - 1; j >= 0; j--) {
                result = result + str.charAt(j);
            } 
            return result;
        };

        System.out.println(reverse.func("Улыбок тебе дед Макар"));
        System.out.println("============================");

        SomeFunc<Integer> factorial;
        factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(factorial.func(10));
    }
}
