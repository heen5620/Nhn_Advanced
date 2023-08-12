package Practic_alone;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Predicate;

public class Mathx {

    public static <E, R> R reduce(Predicate<E> predicate, BiFunction<R, E, R> binaryFunction,
            R init, Iterator<E> iterator) {
        R result = init;
        while (iterator.hasNext())
            if (predicate.test(iterator.next()))
                result = binaryFunction.apply(result, iterator.next());
        return result;
    }

    public static <E, R> R reduce(BiFunction<R, E, R> binaryFunction, R init,
            Iterator<E> iterator) {
        R result = init;
        while (iterator.hasNext()) {
            E element = iterator.next();
            result = binaryFunction.apply(result, element);
        }
        return result;
    }

    public static double reduce(DoubleBinaryOperator binaryOperator, double init,
            double... numbers) {
        Iterator<Double> iterator = new Iterator<>() {
            private int index = 0;

            public boolean hasNext() {
                return index < numbers.length;
            }

            public Double next() {
                if (!hasNext())
                    throw new IllegalArgumentException("!!!");
                return numbers[index++];
            }
        };
        return reduce((x, y) -> binaryOperator.applyAsDouble(x.doubleValue(), y.doubleValue()),
                Double.valueOf(init), iterator);
    }

    public static double product(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        return reduce((result, num) -> result * num, numbers[0], Arrays.stream(numbers).iterator());
    }

    public static double sum(double... numbers) {
        return reduce((result, sum) -> result + sum, 0.0, numbers);
    }

    public static long sum(Range range) {
        final long max = range.getMax();
        final long min = range.getMin();
        return (max - min + 1) * (max + min) / 2;
    }
}
