package prac_2;

public class fac {
    public static void setup() {
        int finalResult = factorial(6);
        System.out.println("final result " + finalResult);
    }


    public static int factorial(int n) {
        System.out.println("start of factorial n= " + n);
        if (n == 1) {
            System.out.println("base case result = 1 ");
            return 1;
        }
        int result = n * factorial(n - 1);
        System.out.println("end of factorial, result" + "n" + n);
        return result;
        // if (n < 0)
        // throw new IllegalArgumentException("invalid error, negative! ");
        // if (n == 0)
        // return 1;
        // return Math.multiplyExact(n, factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
