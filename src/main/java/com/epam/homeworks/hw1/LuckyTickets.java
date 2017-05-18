package com.epam.homeworks.hw1;

public class LuckyTickets {

    public static void main(String[] args) {
        int count = 0;
        int[] massive = new int[6];

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            for (int n = 0; n <= 9; n++) {
                                massive[0] = i;
                                massive[1] = j;
                                massive[2] = k;
                                massive[3] = l;
                                massive[4] = m;
                                massive[5] = n;

                                int sum = massive[0] + massive[1] + massive[2];
                                int sum1 = massive[3] + massive[4] + massive[5];
                                if (sum == sum1) {
                                    count++;
                                    System.out.println(massive[0] + "" + massive[1] + "" + massive[2] + "" + massive[3] + "" + massive[4] + "" + massive[5]);
                                    System.out.println("Сумма " + (massive[0] + massive[1] + massive[2]));
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
