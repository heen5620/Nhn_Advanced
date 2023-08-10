package practice;

import java.util.*;

public class MathxTest extends Mathx {
    public static void main(String[] args) {

        // MathxTest.testRange();

        // double[] numbers = new double[args.length];

        // for (int index = 0; index < args.length; index++) {
        // numbers[index] = Double.valueOf(args[index]);
        // }

        // BinaryOperation plus = (x, y) -> x + y;
        // System.out.println(Mathx.reduce(plus, 0, 2, 5));

        // System.out.println(sum(0, 1, 2, 3, 4));

        // BinaryOperation multiply = (x, y) -> x * y;
        // System.out.println(mul(1, 2, 3, 4, 5));

        // System.out.println(Mathx.reduce(new BinaryOperation() {
        // public double apply(double x, double y) {
        // return x + y - 1;
        // }
        // }, 0, 1, 2));
        // System.out.println(reduceIf(x -> x % 2 == 0, new Plus(), 0, 1, 2, 3, 4, 5));

        // double[] arr = new double[args.length];
        // int index = 0;
        // for (String numberal : args) {

        // System.out.println(Mathx.sum(new Range(10)));
        // System.out.println(Mathx.sum(new Range(0, 10)));
        // System.out.println(Mathx.sum(new Range(5, 10)));

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);

        Iterator<Integer> it = arr.iterator();
        Iterator<Integer> it2 = arr.iterator();
        Iterator<Integer> it3 = arr.iterator();

        System.out.println(Mathx.reduceIf(x -> true, (x, y) -> x + y, 0, it));
        System.out.println(Mathx.reduce((x, y) -> x + y, 0, it2));
        System.out.println(Mathx.product(it3, 0));



    }

    // private static void testRange() {
    // RangeTest.classInvariant();
    // }

}
