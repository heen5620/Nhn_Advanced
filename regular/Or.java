package regular;

public final class Or extends BinaryOperation implements Expression { // 한쪽은 서브클래싱, 한쪽은 서브타이핑,

    public Or(Expression left, Expression right) {
        // super(left, "|", right);
        super(left, right);
    }



    @Override
    public String getOperator() {
        return "|";
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
