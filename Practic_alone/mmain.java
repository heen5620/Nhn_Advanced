package Practic_alone;

interface ExpressionVisitor {
    void visit(CharacterSetExpression expression);

    void visit(RepetitionExpression expression);
}


interface Expression {
    void accept(ExpressionVisitor visitor);

    boolean match(String input);
}


class CharacterSetExpression implements Expression {
    private String characterSet;

    public CharacterSetExpression(String characterSet) {
        this.characterSet = characterSet;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean match(String input) {
        return input.matches(characterSet);
    }
}


class RepetitionExpression implements Expression {
    private Expression expression;

    public RepetitionExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean match(String input) {
        int endIndex = 0;
        while (endIndex < input.length() && expression.match(input.substring(0, endIndex + 1))) {
            endIndex++;
        }
        return expression.match(input.substring(0, endIndex));
    }
}


class ExpressionMatcherVisitor implements ExpressionVisitor {
    private Expression resultExpression;

    public Expression getResultExpression() {
        return resultExpression;
    }

    @Override
    public void visit(CharacterSetExpression expression) {
        resultExpression = expression;
    }

    @Override
    public void visit(RepetitionExpression expression) {
        resultExpression = expression;
    }
}


class Matcher {
    private Expression expression;

    public Matcher(String expressionString) {
        ExpressionMatcherVisitor visitor = new ExpressionMatcherVisitor();
        // Parse the expressionString to create the expression using the visitor
        // You can use a parser library or manually parse the expressionString here
        // For simplicity, I'll create a simple example
        Expression charSetExp = new CharacterSetExpression("[a-z]");
        Expression repExp = new RepetitionExpression(charSetExp);

        expression = repExp;
    }

    public boolean match(String input) {
        return expression.match(input);
    }
}


public class mmain {
    public static void main(String[] args) {
        String expressionString = "['a'-'z'][a-zA-Z0-9]*";
        Matcher v = new Matcher(expressionString);

        System.out.println("v.match(\"45e\") == " + v.match("45e")); // false
    }
}
