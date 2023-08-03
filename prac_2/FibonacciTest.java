package prac_2;

import static prac_2.Mathx.*; // 두개의 namespace가 겹치는 위험한 짓?
import javax.swing.text.Style;

public class FibonacciTest {

    public static void baseCase() {
        if (fibonacci(0) == 0 && fibonacci(1) == 1)
            return;
        System.exit(1);
    }

    public static void recursionCase() {
        int[][] answers = {{5, 5}, {6, 8}, {9, 34}, {14, 377}, {18, 2584}};
        for (int[] answer : answers)
            if (answer[1] != fibonacci(answer[0]))
                System.exit(1);
        return;
    }

    public static void preCondition() {
        // n>1보다 커야함 모든 입력이 다 0보다 커야
        try {
            fibonacci(-1);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            for (int i = 0; i < 100; i++) {
                fibonacci(i);

            }

        } catch (StackOverflowError e) {
            System.out.println("fibonacci_iterative: n is to big! ");
            return;
        }
        System.exit(1);
    }



}
