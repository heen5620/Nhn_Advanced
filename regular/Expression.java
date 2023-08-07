package regular;

public interface Expression {

    public static final Epsilon epsilon = Epsilon.value;

    default Expression or(Expression e) {
        return new Or(this, e);
    }

    default Expression then(Expression e) {
        return new Then(this, e);
    }

    default Expression star() {
        return new Star(this);
    }



    // public abstract Expression then(Expression e);

    // abstract class Subexpr extends Expression {
    // public abstract Expression star();
    // }

}
