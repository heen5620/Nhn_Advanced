package prac_2;

import static prac_2.Mathx.*;

public class FactorialTest {

    public static void baseCase() {
        if (factorial(0) != 1)
            System.exit(1);
        return;
    }

    public static void recursionCase() {
        int[][] answers = {{1, 1}, {2, 2}, {3, 6}, {4, 24}};
        for (int[] answer : answers) {
            if (factorial(answer[0]) != answer[1])
                System.exit(1);
            return;
        }
    }

    public static void preCondition() {

        try {
            factorial(-1);
        } catch (IllegalArgumentException e) {
            return;
        }
        System.exit(1); // assert false; 로 대체 할 수 있다. System.exit(1) 보단 낫다..
    }

    public static void postCondition() {
        try {
            factorial(Integer.MAX_VALUE);
        } catch (ArithmeticException e) {
            System.out.println("factorial: n is too big");
            return;
        } catch (StackOverflowError e) {
            System.out.println("factorial: stack over flow");
            return;
        }

    }



}
