package prac_2;

public class fibonacci {
    public static int fibonacci_iterative(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        int sum = 0;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            sum = arr[i];
        }
        return sum;
    }
}
