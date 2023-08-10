package practice;

public final class Multiply<T extends Number> implements BinaryOperation<T> {

    @Override
    public T apply(T x, T y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException("Input values cannot be null");
        }

        double result = x.doubleValue() * y.doubleValue();
        return (T) createNumber(result, x.getClass());
    }

    private Number createNumber(double value, Class<? extends Number> numberClass) {
        if (numberClass == Integer.class) {
            return (int) value;
        } else if (numberClass == Double.class) {
            return value;
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }
}
