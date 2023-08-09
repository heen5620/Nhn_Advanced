package subtyping;

interface Animal {
    public boolean canfly();

    public boolean swim();

    public default String type() {
        return this.getClass().getSimpleName();
    }
}


