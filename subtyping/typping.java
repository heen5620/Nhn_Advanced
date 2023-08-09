package subtyping;

interface Flyable {
}


interface swimable {

}


final class 비행기 implements Flyable {
}


final class FlyBat extends 박쥐 implements Flyable { // 1대1 대응이기 때문에 2개의 extends를 허용하지 않음.

}


final class 헤엄치고나는펭귄 extends 펭귄 implements Flyable, swimable {

}


// Legacy code
abstract class 동물 {

    private boolean flyable;

    protected 동물(boolean flyable) {
        this.flyable = flyable;
    }

    public String type() {
        return typping.type(this);
    }


    public boolean 날수있니() { // 동물의 barrier를 이루고, Flyable이라는 filed가 있음.
        return false;
    }
}


abstract class 새 extends 동물 {
    public 새(boolean flyable) {
        super(flyable);
    }
}


class 박쥐 extends 동물 {
    박쥐() {
        super(true);
    }
}


class 참새 extends 새 {
    참새() {
        super(true);
    }
}



class 펭귄 extends 새 {
    펭귄() {
        super(false);
    }
}


public class typping {

    public static String type(Object thing) {
        return thing.getClass().getSimpleName();
    }

    public static void 날수있니(Flyable thing) {
        System.out.println(typping.type(thing) + "는 날 수 있어.");
    }

    public static void main(String[] args) {
        Flyable[] 날것들 = {new FlyBat(), new 비행기()};

        swimable s = new 헤엄치고나는펭귄();

        for (Flyable 날것 : 날것들) {
            typping.날수있니(날것); // dynamic method binding on actual type -> dynamic dispatch
        }
    }
}
