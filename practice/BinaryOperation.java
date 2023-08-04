package practice;

public interface BinaryOperation<T> {
    public T apply(T x, T y);
}


class Stack<T> {
    // public stack() {}

    // public Stack push(T newElem) {}

    // public Stack pop() {}

    // public int top() {}

    public static void main(String[] args) {
        String s = new String("");
        Object o = s;
        String s2 = (String) o;
        System.out.println(s == o);

        // RTTI
    }

}
