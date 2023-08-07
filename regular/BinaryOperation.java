package regular;

protected abstract class BinaryOperation implements Expression {
    private Expression left;
    private Expression right;
    private String operator;

    protected BinaryOperation(Expression left, String operator, Expression right) { // 왜 public을
                                                                                    // protected로
                                                                                    // 할까?
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    private String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return "(" + this.getLeft().toString() + this.getOperator() + this.getRight().toString()
                + ")";
    }


}
