package practice;

public final class Multiply implements BinaryOperation {

    @Override
    public T apply(T x, T y) {
        return x * y;
    }

}
