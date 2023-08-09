package usecases;

import regular.*;



public class RegularExpression {
    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');
        // Expression a_ab = new Or( a, new Then( a, b ) );
        // Expression ba_a0n = new Or( new Then( b, a ), new Or(Expression.epsilon, new Star( a ) )
        // );
        // method cascading 방법 동일한 객체(a)에서 여러 메서드를 호출 할 수 있는 방법
        Expression a_ab = a.or(a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.epsilon.or(a.star()));
        Literals literals = new Literals();
        System.out.println(Literals.of(a_ab));
        System.out.println(PrintableForm.of(a_ab));
        System.out.println(PrintableForm.of(ba_a0n));

        // BinaryOperation e = new Or(a,b);
        // Expression r = e;
        // System.out.println(e.then(r));

    }
}
