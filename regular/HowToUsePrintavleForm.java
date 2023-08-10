package regular;

import regular.*;
import usecases.Literals;

public class HowToUsePrintavleForm {
    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');

        Expression a_ab = a.or(a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.epsilon.or(a.star()));

        System.out.println(Literals.of(a_ab));
        System.out.println(Literals.of(ba_a0n));

    }

}
