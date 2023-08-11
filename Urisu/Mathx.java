package Urisu;

import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;


public class Mathx {

    static <T> T reduce(BinaryOperator<T> binaryOperation, T init, Iterator<T> iterator) {
        return reduceIf(x -> true, binaryOperation, init, iterator);
    }

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

}
