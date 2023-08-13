package Urisu;

import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;


public class Mathx {

    static <T> T reduce(BinaryOperator<T> binaryOperator, T init, Iterator<T> iterator) {
        return reduceIf(x -> true, binaryOperator, init, iterator);
    }

    static <T> T reduceIf(Predicate<T> predicate, BinaryOperator<T> binaryOperator, T init,
            Iterator<T> iterator) {
        T result = init;
        while (iterator.hasNext()) {
            T i = iterator.next();
            if (predicate.test(i))
                result = binaryOperator.apply(i, result);
        }
        return result;
    }

}
