package prac_2;

public class Mathx {
    // public static int fibonacci(int n) {
    // if (n < 0)
    // throw new IllegalArgumentException("fibonacci: n < 0");
    // if (n == 0)
    // return 0;
    // else if (n == 1)
    // return 1;
    // return Math.addExact(fibonacci(n - 1), fibonacci(n - 2));
    // }

    public static int fibonacci_iterative(int n) {
        int number = 5;
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = fibonacci_iterative(i - 1) + fibonacci_iterative(i - 2);
            System.out.println(sum);
        }
        return sum;
    }

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("invalid error, negative! ");
        if (n == 0)
            return 1;
        return Math.multiplyExact(n, factorial(n - 1));
    }
}


