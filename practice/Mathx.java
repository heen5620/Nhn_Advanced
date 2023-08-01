package practice;

import java.util.function.BinaryOperator;

public class Mathx {
    static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        double result = init;
        for (double number : numbers) {
            result = binaryOperation.apply(result, number);
        }
        return result;
    }

    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init,
            double... numbers) {
        double result = init;
        for (double number : numbers) { // Licskov's Substitution Principle = LSP
            if (predicate.apply(number)) {
                result = binaryOperation.apply(result, number);
            }
        }
        return result;

    }

    static double sum(double... numbers) {
        return reduce(new Plus(), 0, numbers);
    }

    static double mul(double... numbers) {
        return reduce(new Multiply(), 1, numbers);
    }
}

// return reduceIf(x->true , binaryOperation, init, numbers);
