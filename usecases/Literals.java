package usecases;

import java.beans.Expression;
import regular.Epsilon;
import regular.Literal;
import regular.Or;
import regular.Star;
import regular.Then;

public final class Literals implements regular.Visitor {
    private StringBuilder literalStringBuilder = new StringBuilder();

    String e = "abc" + "def"; // 이 문장으로 String이 3개가 만들어짐 abc, def, abcdef 이렇게 3개임.

    @Override
    public void visit(Epsilon e) {}

    @Override
    public void visit(Literal e) {
        literalStringBuilder.append(e.getCharacter());
    }

    @Override
    public void visit(Then e) {
        e.getLeft().accept(this);

        e.getRight().accept(this);
    }

    @Override
    public void visit(Or e) {
        e.getLeft().accept(this);

        e.getRight().accept(this);
    }

    @Override
    public void visit(Star e) {
        e.getExpression().accept(this);
    }

    public static String of(regular.Expression e) {
        Literals literals = new Literals();
        e.accept(literals);
        return literals.getLiteralStringBuilder();
    }

    private String getLiteralStringBuilder() {
        return this.literalStringBuilder.toString();
    }


}
