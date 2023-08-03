package Urisu;

public class mathxx {
    public static int gcd(int numerator, int denomiator) {
        while (denomiator != 0) {
            int result = denomiator;
            denomiator = numerator % denomiator;
            numerator = result;
        }
        return numerator;
    }

    public static int[] add(int numerator, int denomiator) {
        if (numerator == 0 || denomiator == 0) {
            throw new IllegalArgumentException("0은 안돼!");
        }
        return new int[] {numerator, denomiator};
    }
}
