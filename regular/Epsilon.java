package regular;

public final class Epsilon implements Expression {
    //
    public final static Epsilon value = new Epsilon();

    private Epsilon() {}



    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // @Override
    // public String toString() {
    // return "\u03B5";
    // }

    // Single Ton Pattern => 원소가 하나뿐인 코드의 표현
    // Not thread safety
    // Critical Section을 지정하는 것 = Synchronized
    // public static synchronized Epsilon getInstance() {
    // if (instance == null)
    // instance = new Epsilon();
    // return instance;
    // }


}
