package practice;

import java.util.*;
import java.util.function.Predicate;

@FunctionalInterface
interface InnerMathxTest {
    boolean test(int n);
}


public class MathxTest extends Mathx {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(20);
        arr.add(21);

        Iterator<Integer> it = arr.iterator();
        Iterator<Integer> it2 = arr.iterator();

        Predicate<Integer> isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(Mathx.reduceIf(x -> x % 2 == 0, (a, b) -> a + b, 0, it)); // 짝수만 판별해 값
        // // 더하기
        System.out.println(Mathx.reduce((x, y) -> x + y, 0, it2)); // 그냥 값 더하기
        System.out.println(isPrime.test(10)); // 조건 소수판별 하는 방법.
        // System.out.println(Mathx.reduce_sum(new Plus<>(), 1, it));
        // System.out.println(Mathx.product(it, 1));
    }
}
