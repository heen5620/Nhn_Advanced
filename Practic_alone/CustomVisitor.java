package Practic_alone;

interface ExpressionVisitor {
    boolean visit(String expression);
}


public class CustomVisitor implements ExpressionVisitor {
    private CustomMatcher matcher;

    public CustomVisitor(String expression) {
        this.matcher = new CustomMatcher(expression);
    }

    @Override
    public boolean visit(String expression) {
        return matcher.match(expression);
    }

    public static void main(String[] args) {
        CustomVisitor visitor = new CustomVisitor("['a'-'z'][a-zA-Z0-9]*");

        System.out.println(visitor.visit("45e")); // false
        System.out.println(visitor.visit("a1b")); // true
    }
}

