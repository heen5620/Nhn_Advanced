package Practic_alone;

public class Main {
    // 피보나치 수열 출력

    public static int Fibonacci(int number) {
        if (number < 0)
            throw new IllegalArgumentException("Wron numebr!");
        else if (number == 1)
            return 1;
        else if (number == 2)
            return 1;

        return Fibonacci(number - 1) + Fibonacci(number - 2);
    }

    public static void main(String[] args) {
        int result = Fibonacci(3);
        System.out.println(result);
    }
}