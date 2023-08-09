package Practic_alone;

class Typing {
    public static void canfly(animal x) {
        System.out.println(x.Type() + (x.canfly() ? "는(은) 날 수 있어!!." : "는(은) 못날아bb."));
    }

    public static void canswiming(animal x) {
        System.out.println(x.Type() + (x.canswiming() ? "는(은) 물질 가능." : "는(은) 물질 불가능."));
    }
}
