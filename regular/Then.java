package regular;

public final class Then extends BinaryOperation {

    private Expression left;
    private Expression right;

    public Then(Expression left, Expression right) {
        super(left, "/", right);
    }

    // public Then(Expression left, Expression right) {
    // this.left = left;
    // this.right = right;
    // }

    // public Expression getLeft() {
    // return left;
    // }

    // public Expression getRight() {
    // return right;
    // }

    // @Override
    // public String toString() {
    // return "(" + this.getLeft().toString() + this.getRight().toString() + ")";
    // }
}
