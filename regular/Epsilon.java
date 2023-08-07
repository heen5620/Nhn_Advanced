package regular;

public final class Epsilon implements Expression {
    //
    public final static Epsilon value = new Epsilon();

    private Epsilon() {}

    @Override
    public String toString() {
        return "\u03B5";
    }
}
