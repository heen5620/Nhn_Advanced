package Urisu;

public class Multi<T extends Number> implements BinaryOperation {

    @Override
    public Number apply(Number x, Number y) {
        Class<? extends Number> numClass = x.getClass();
        if (numClass == Integer.class)
            return x.intValue() * y.intValue();
        else if (numClass == Double.class)
            return x.doubleValue() * y.doubleValue();
        throw new UnsupportedOperationException("Unimplemented method 'apply'");
    }
}

