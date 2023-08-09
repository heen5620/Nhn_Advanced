package visitor;

public class test {
    public static void main(String[] args) {
        Top leftTop = new Left();
        Top rightTop = new Right();
        leftTop.accept(new walk());
        rightTop.accept(new run());
    }
}
