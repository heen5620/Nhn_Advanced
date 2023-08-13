package Practic_alone;

public class MathxTest {

    public static void main(String[] args) {
        MathxTest.sum();
        MathxTest.product();
        MathxTest.sumWithRange();
    }

    private static void sum() {
        assert Mathx.sum() == 0;
        assert Mathx.sum(1, 2, 3, 7, 9, 10, 5, 4, 8, 6) == Mathx.sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
                + 10;
    }

    private static void product() {
        double g = Mathx.product(1);
        assert Mathx.product(1, 2, 3, 7, 9, 10, 5, 4, 8,
                6) == Mathx.product(1, 2, 3, 4, 5, 6, 7, 8, 9) * 10;
        System.out.println("g " + g);
    }

    private static void sumWithRange() {
        long a = Mathx.sum(new Range(0, 10));
        long b = (long) Mathx.sum(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("a = " + a + " b = " + b);

        long c = Mathx.sum(new Range(10, 99)) + 100;
        long d = Mathx.sum(new Range(10, 100));
        System.out.println("c = " + c + " d = " + d);

        long e = Mathx.sum(new Range(-10, 0));
        long ee = -Mathx.sum(new Range(0, 10));
        System.out.println("e = " + e + " ee = " + ee);
        long f = (long) Mathx.sum(-2, -1, 0, 1, 2);
        long ff = Mathx.sum(new Range(-2, 2));
        System.out.println("f = " + f + " ff = " + ff);

    }
}
