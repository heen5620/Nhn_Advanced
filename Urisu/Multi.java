package Urisu;

public class Multi<T extends Number> implements BinaryOperation {

    @Override
    public Number apply(Number x, Number y) {
        Class<? extends Number> numclass = x.getClass();

        if (numclass == Integer.class)
            return (Number) (x.intValue() * y.intValue());
        else if (numclass == Double.class)
            return (Number) (x.doubleValue() * y.doubleValue());
        else
            throw new UnsupportedOperationException("Unimplemented method 'apply'");
    }


}
