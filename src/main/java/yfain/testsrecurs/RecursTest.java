package yfain.testsrecurs;

public class RecursTest {
    public static void main(String[] args) {
//         recursion(5);
        // System.out.println("Factorial: ");
        factorial(2);
    }

    public static void recursion(int a) {
        a--;
        if (a > 0) {
            System.out.println("IN recursion " + a);
            recursion(a);
            System.out.println("OUT recursion " + a);
        }
        System.out.println("OUT " + a);
    }

    public static void factorial(int n) {
        if (n == 1) {
            System.out.println(n);

        }
        if (n == 2) {
            System.out.println(n);
            System.exit(0);
        } else {
            factorial(n - 1);
            System.out.println((n - 1) * n);
        }
    }
}
