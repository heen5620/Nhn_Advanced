package subtyping;

public class bird implements Animal {
    @Override
    public boolean canfly() {
        return true;
    }

    public boolean swim() {
        return false;
    }
}

