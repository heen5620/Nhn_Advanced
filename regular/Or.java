package regular;

public final class Or extends BinaryOperation {

    // public Or(Expression left, Expression right) {
    // this.left = left;
    // this.right = right;
    // }

    public Or(Expression left, Expression right) {
        super(left, "/", right);
    }

    // public Expression or(Expression other) {
    // return new Or(this, other);
    // }

    // public Expression getLeft() {
    // return left;
    // }

    // public Expression getRight() {
    // return right;
    // }

    // @Override
    // public String toString() {
    // return "(" + this.getLeft().toString() + " |" + this.getRight().toString() + ")";
    // }

}
