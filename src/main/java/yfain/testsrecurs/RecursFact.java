package yfain.testsrecurs;

public class RecursFact {
    public static void main(String[] args) {
    RecursFact rf = new RecursFact();
        System.out.println(rf.factorial(100));
    }

    public static int factorial (int a) {
        if (a == 0) {
        return 1;
        }
        else {
            return ( a*factorial(a-1) );
        }
    }
}
