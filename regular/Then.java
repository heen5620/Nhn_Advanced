package regular;

import javax.naming.ldap.ExtendedRequest;

public final class Then extends BinaryOperation implements Expression { // extends BinaryOperation
                                                                        // => 서브클래싱 , implements
                                                                        // Expression => 서브타이핑

    public Then(Expression left, Expression right) {
        super(left, right);
    }

    // 여기서 추상클래스와 인터페이스를 동시에 사용하는 이유?
    @Override
    public String getOperator() {
        return "";
    }



    public void accept(Visitor visitor) {
        visitor.visit(this);
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
