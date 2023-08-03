package practice;

public class FractionalTest {
    private FractionalTest() {}

    public static int[] fractional(int numerator, int denomiator) {
        if (denomiator == 0)
            throw new IllegalArgumentException("Bonnja is 0! ");
        // int[] rep = new int[] {numerator, denomiator};
        // normalization(rep);
        // int a = gcd(numerator, denomiator);
        return new int[] {numerator, denomiator};
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int result = y;
            y = x % y;
            x = result;
        }
        return x;
    }

    private static int numerator(int[] r) {
        normalization(r);
        return r[0];
    } // 분자 //selector //getter

    private static int denomiator(int[] r) {
        normalization(r);
        return r[1];
    } // 분모 //getter

    private static void normalization(int[] r) {
        int g = gcd(r[0], r[1]);
        r[0] /= g;
        r[1] /= g;
    }

    private static int[] add(int[] r1, int[] r2) {
        return fractional(numerator(r1) * denomiator(r2) + numerator(r2) * denomiator(r1),
                denomiator(r1) * denomiator(r2));
    }

    // 1/2 , 2/4
    // public static boolean equals(int[] x, int[] y) {
    // return numerator(x) == numerator(y) && denomiator(x) == denomiator(y);
    // }

    private static String toString(int[] add) {
        String string = numerator(add) + "/" + denomiator(add);
        return string;
    }

    public static void main(String[] args) {
        int[][] rs = {fractional(1, 2), fractional(2, 4), fractional(4, 8), fractional(5, 10)};

        // add(fractional(1, 2), fractional(4, 8));

        for (int[] r : rs) {
            System.out.println(toString(r));
        }

        // int[] x = fractional(1, 2);
        // int[] y = fractional(2, 4);
        // int[] z = fractional(4, 8);
        // int[] w = fractional(5, 10);
        // System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
        // System.out.println(x == y); // false
        // System.out.println(add(x, y) == add(z, w)); // false 왜 false false가 나오나?
        int arr[] = add(fractional(1, 2), fractional(4, 8));
        System.out.println(arr[0] + "/" + arr[1]);


        // double[] arr = new double[args.length];

        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = Double.valueOf(args[i]);
        // }
        // System.out.println(arr[0] + " / " + arr[1]);
        // System.out.println(arr[2] + " / " + arr[3]);
    }



}
