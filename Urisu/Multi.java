package Urisu;

public class Multi<T extends Number> implements BinaryOperation {

    @Override
    public Number apply(Number x, Number y) {
        Class<? extends Number> numClass = x.getClass();
        if (numClass == Integer.class)
            return (Number) (x.intValue() + y.intValue());
        else if (numClass == Double.class)
            return (Number) (x.doubleValue() + y.doubleValue());
        throw new IllegalArgumentException("!!!");
    }

}
