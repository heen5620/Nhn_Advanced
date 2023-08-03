package prac_2;

public class MathxTest {

    private MathxTest() {}

    public static void main(String[] args) {
        MathxTest.fibonacciTest();
        // MathxTest.FactorialTest();
    }

    public static void fibonacciTest() {
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase();
        FibonacciTest.preCondition(); // require(Analysis Require, Desgin by contract)
        FibonacciTest.postCondition(); // satisfy
    }

    public static void FactorialTest() {
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();
    }

}
