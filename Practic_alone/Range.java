package Practic_alone;

public class Range {
    private final long min;
    private final long max;

    public Range(long min, long max) {
        if (min > max) {
            throw new IllegalArgumentException("Invalid range: min > max");
        }
        this.min = min;
        this.max = max;
    }

    public long getMin() {
        return min;
    }

    public long getMax() {
        return max;
    }
}
