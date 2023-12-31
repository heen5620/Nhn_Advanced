package Urisu;

public class FractionalTest {
    private FractionalTest() {}

    private static int[] fractional(int numerator, int denomiator) {
        if (denomiator == 0)
            throw new IllegalArgumentException("0이 될 수 없어!");
        // gcd(numerator, denomiator);
        return new int[] {numerator, denomiator};
    }

    // getter 만들기
    private static int numerator(int[] r) {
        normalization(r);
        return r[0];
    }

    private static int denomiator(int[] r) {
        normalization(r);
        return r[1];
    }

    private static int gcd(int numerator, int denomiator) {
        while (denomiator != 0) {
            int result = denomiator;
            denomiator = numerator % denomiator;
            numerator = result;
        }
        return numerator;
    }

    public static int[] add(int[] r1, int[] r2) {
        return fractional(numerator(r1) * denomiator(r2) + numerator(r2) * denomiator(r1),
                denomiator(r1) * denomiator(r2));
    }

    private static void normalization(int[] r) {
        int a = gcd(r[0], r[1]);
        r[0] /= a;
        r[1] /= a;
    }

    private static String toString(int[] r) {
        String string = numerator(r) + "/" + denomiator(r);
        return string;
    }

    public static void main(String[] args) {
        // int[][] arr = {fractional(1, 2)}; // 왜 2차원 배열로 선언하는걸까 => 분모, 분자는 1차원으로 따로 받고, 분자, 분모를 동시에
        // 출력하기 위해 2차원이 필요하다.
        // for (int[] r : arr) {
        // System.out.println(toString(r));
        // }
        // int a = gcd(arr[0], arr[1]);
        // System.out.println(arr[0] + "/" + arr[1]);
        // int numerator = numerator(arr);
        // System.out.println(numerator(arr) + "/" + denomiator(arr));
        // int arr[] = add(fractional(1, 2), fractional(4, 8));
        // System.out.println(arr[0] + "/" + arr[1]);
    }
}
