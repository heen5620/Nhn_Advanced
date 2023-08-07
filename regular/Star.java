package regular;

public final class Star implements Expression {
    @Override
    public String toString() {
        return "(" + this.getExpression() + ")" + "*";
    }

    private Expression expression;

    public Star(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }
}

