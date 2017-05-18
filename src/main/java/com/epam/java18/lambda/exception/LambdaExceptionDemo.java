package com.epam.java18.lambda.exception;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};
//        double[] values = {};
        DoubleNumericArrayFunc avarege;
        avarege = n -> {
            double summ = 0;
            if (n.length == 0) {
                throw new EmptyArrayException();
            }

            for (int i = 0; i < n.length; i++) {
                summ = summ + n[i];
            }
            return summ / n.length;
        };
        System.out.println(avarege.func(values));
    }
}
