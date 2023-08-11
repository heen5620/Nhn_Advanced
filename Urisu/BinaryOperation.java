package Urisu;

public interface BinaryOperation<T extends Number> {
    public T apply(T x, T y);
}
