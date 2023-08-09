package subtyping;

public class bat implements Animal {
    @Override
    public boolean canfly() {
        return true;
    }

    public boolean swim() {
        return false;
    }
}


