package practice;

import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import javax.swing.JSpinner.NumberEditor;

public class Mathx {

    static <T> T reduce(BinaryOperator<T> binaryOperation, T init, Iterator<T> iterator) {
        return reduceIf(x -> true, binaryOperation, init, iterator);
    }

    // static <T> T sum(T x, T y) {
    // return reduce((x, y) -> x + y, 0, iterator);
    // }

    // static <T> T mul(T x, T y) {
    // return reduce((x, y) -> x * y, 1, iterator);
    // }

    // value semantics
    static <T> T reduceIf(Predicate<T> predicate, BinaryOperator<T> binaryOperation, T init,
            Iterator<T> iterator) {
        T result = init;
        while (iterator.hasNext()) {
            T i = iterator.next();
            if (predicate.test(i))
                result = binaryOperation.apply(i, result);
        }

        return result;
    }

    public static <T> T product(Iterator<T> iterator, T init) {
        return reduce_sum(new Plus(), init, iterator);
    }

    static <T> T reduce_sum(BinaryOperation binaryOperation, T init, Iterator<T> iterator) {
        T result = init;
        while (iterator.hasNext()) {
            result = (T) binaryOperation.apply((Number) result, (Number) iterator.next());
        }
        return result;
    }



    // public static <T> T reduceIf(Predicate<T> predicate, BinaryOperator<T> binaryOperator, T
    // init,
    // Iterator<T> iterator) {
    // T result = init;
    // for (T number : numbers) { // Licskov's Substitution Principle = LSP -> T의 타입이나 서브타입만가능함
    // if (predicate.test(number)) {
    // result = binaryOperator.apply(result, number);
    // }

    // for (int index = 0; index < numbers.length; index++) { // 이런식으로 작성되면, 배열을 제외한 다른것들은 들어올 수
    // // 없음.)
    // if (predicate.test(numbers[index])) {
    // result = binaryOperator.apply(result, numbers[index]);
    // }
    // }
    // return result;
    // }

    // public static int sum(int n) {
    // return n * (n + 1) / 2;
    // }

    // public static int sum(Range range) {
    // return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
    // }

    // public static long gcd(long a, long b) {
    // long n;
    // while (b != 0) {
    // n = a % b;
    // a = b;
    // b = n;
    // }
    // return a;
    // }

}
