package com.epam.java18.lambda.lamb_arg;

public class LambdaAsArgumentsDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.function(s);
    }

    public static void main(String[] args) {

        String inStr = "Лямбда выражения повышат эффективность работы Java";
        String outStr;
        System.out.println("Это исходная строка " + inStr);
        System.out.println("================================");

        outStr = stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Верхний регистр -> " + outStr);
        System.out.println("================================");

        outStr = stringOp(str -> {
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != ' ') {
                    result = result + str.charAt(j);
                }
            }
            return result;
        }, inStr);
        System.out.println("замочил все пробелы" + outStr);
        System.out.println("================================");

        StringFunc reverse = str -> {
            String result = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                result = result + str.charAt(j);
            }
            return result;
        };
        System.out.println("Реверс " + stringOp(reverse, inStr));
    }
}
