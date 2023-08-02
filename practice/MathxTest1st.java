package practice;

public class MathxTest1st extends Mathx {
    public static void main(String[] args) {
        double[] numbers = new double[args.length];

        for (int index = 0; index < args.length; index++) {
            numbers[index] = Double.valueOf(args[index]);
        }

        BinaryOperation plus = (x, y) -> x + y;
        System.out.println(Mathx.reduce(plus, 0, 2, 5));

        System.out.println(sum(0, 1, 2, 3, 4));

        BinaryOperation multiply = (x, y) -> x * y;
        System.out.println(mul(1, 2, 3, 4, 5));

        System.out.println(Mathx.reduce(new BinaryOperation() {
            public double apply(double x, double y) {
                return x + y - 1;
            }
        }, 0, 1, 2));
        System.out.println(reduceIf(x -> x % 2 == 0, new Plus(), 0, 1, 2, 3, 4, 5));

        // double[] arr = new double[args.length];
        // int index = 0;
        // for (String numberal : args) {

    }

}
