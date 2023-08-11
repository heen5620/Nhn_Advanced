package Urisu;


public class Plus<T extends Number> implements BinaryOperation {

    @Override
    public Number apply(Number x, Number y) {
        Class<? extends Number> numclass = x.getClass();

        if (numclass == Integer.class)
            return (Number) Integer.valueOf(x.intValue() + y.intValue());
        else if (numclass == Double.class)
            return (Number) Double.valueOf(x.doubleValue() + y.doubleValue());
        else
            throw new IllegalArgumentException(numclass + " Not Support Method!");
    }

}
