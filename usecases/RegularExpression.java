package usecases;

import regular.Epsilon;
import regular.Expression;
import regular.Literal;
import regular.Or;
import regular.Star;
import regular.Then;

public class RegularExpression {
    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');

        Expression a_ab = a.or(a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.epsilon.or(a.star()));
        System.out.println(a_ab);
        System.out.println(ba_a0n);
    }
}
