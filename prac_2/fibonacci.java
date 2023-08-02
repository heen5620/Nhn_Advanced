package prac_2;

public class fibonacci {
    public static int fibonacci_iterative(int n) {
        if (n < 1)
            return n;
        int temp = 0;
        int first = 1;
        for (int i = 2; i < n; i++) {
            temp = first;
            first += temp;
            temp = first;
        }
        return temp;

    }

    public static void main(String[] args) {
        System.out.println(fibonacci_iterative(2));
    }
}
