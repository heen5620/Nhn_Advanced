package Practic_alone;

public abstract class animal {

    abstract boolean canfly();

    // public boolean swim();

    public String Type() {
        return this.getClass().getSimpleName();
    }

    abstract boolean canswiming();
}
