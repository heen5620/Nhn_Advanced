package subtyping;


public class Main {
    public static void main(String[] args) {
        Typing.canfly(new bat());
        Typing.canfly(new peng());
        Typing.canfly(new bird());
        Typing.swin(new bat());
        Typing.swin(new peng());
        Typing.swin(new bird());
    }
}


