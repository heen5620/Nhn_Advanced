package regular;

abstract class BinaryOperation { // 실제로 BinaryOperation은 Expression의 서브타입이 아님. //abstract클래스가 아닌 일반
                                 // class로 바꿔도 상관없다.
    private Expression right;
    private Expression left;
    // private String operator;

    // protected BinaryOperation(Expression left, String operator, Expression right) {
    // this.left = left;
    // this.right = right;
    // // this.operator = operator;
    // }
    protected BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getRight() { // implemention code
        return right;
    }

    public Expression getLeft() { // implemention code
        return left;
    }

    // @Override
    // public String toString() {
    // return "(" + this.getLeft().toString() + this.getOperator() + this.getRight().toString()
    // + ")";
    // }

    public String getOperator() {
        return this.getOperator();
    }

}
