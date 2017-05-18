package yfain.testsrecurs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursTriangleNumbers {
    public static void main(String[] args) throws IOException {
        int theNumber;
        System.out.println("Enter a number ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle " + theAnswer);
    }

    public static int triangle(int n) {
        System.out.println("Entering: n =" + n);
        if (n == 1) {
            System.out.println("Returninng 1");
            return 1;
        } else {
            int temp = n + triangle(n-1);
            System.out.println("Returninng " + temp);
            return temp;
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }


}
