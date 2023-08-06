package prac_2;

public class Mathx {
    public static int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("fibonacci: n < 0");
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return Math.addExact(fibonacci(n - 1), fibonacci(n - 2));

        // int[] arr = new int[n + 1];
        // arr[0] = 0;
        // arr[1] = 1;

        // int sum = 0;

        // for (int i = 2; i <= n; i++) {
        // arr[i] = arr[i - 1] + arr[i - 2];
        // sum = arr[i];
        // }
        // return sum;

    }

    // public static void setup() {
    // int finalResult = factorial(6);
    // System.out.println("final result " + finalResult);
    // }


    // public static int factorial(int n) {
    // // System.out.println("start of factorial n= " + n);
    // // if (n == 1) {
    // // System.out.println("base case result = 1 ");
    // // return 1;
    // // }
    // // int result = n * factorial(n - 1);
    // // System.out.println("end of factorial, result" + "n" + n);
    // // return result;
    // if (n < 0)
    // throw new IllegalArgumentException("invalid error, negative! ");
    // if (n == 0)
    // return 1;
    // return Math.multiplyExact(n, factorial(n - 1));
    // }

}
