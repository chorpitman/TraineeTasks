package com.epam.java18.lambda.links;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunction<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.function(vals[i], v))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HightTempearture [] weekDayHighs = {
                new HightTempearture(89), new HightTempearture(82),
                new HightTempearture(90), new HightTempearture(89),
                new HightTempearture(89), new HightTempearture(91),
                new HightTempearture(84), new HightTempearture(83),
        };

        count = counter(weekDayHighs, HightTempearture::sameTemp, new HightTempearture(89));
        System.out.println("Дней когда максималка была 89: "+ count);
        System.out.println("============================");

        HightTempearture [] weekDayHighs2 = {
                new HightTempearture(32), new HightTempearture(12),
                new HightTempearture(24), new HightTempearture(19),
                new HightTempearture(18), new HightTempearture(12),
                new HightTempearture(-1), new HightTempearture(13),
        };

        count = counter(weekDayHighs2, HightTempearture::sameTemp, new HightTempearture(12));
        System.out.println("Дней когда максималка была 12: "+ count);
        System.out.println("============================");


        count = counter(weekDayHighs, HightTempearture::lessThanTemp, new HightTempearture(90));
        System.out.println("Дней когда максималка была меньше 90: "+ count);

        System.out.println("----------------------------");

        count = counter(weekDayHighs2, HightTempearture::lessThanTemp, new HightTempearture(12));
        System.out.println("Дней когда максималка была меньше 12: "+ count);

    }
}
