package subtyping;



public class Typing {
    public static void canfly(Animal x) {
        System.out.println(x.type() + (x.canfly() ? "는(은) 날 수 있어." : "는(은) 못날아."));
    }

    public static void swin(Animal x) {
        System.out.println(x.type() + (x.swim() ? "는(은) 헤엄칠수 있어." : "는(은) 헤엄칠수 없어."));
    }
}
