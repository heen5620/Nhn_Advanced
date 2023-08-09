package subtyping;

public class peng implements Animal {


    @Override
    public boolean canfly() {
        return false;
    }

    public boolean swim() {
        return true;
    }
}

