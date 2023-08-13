package Practic_alone;

public class Range {
    private long min;
    private long max;

    public Range(long min, long max) {
        if (min > max)
            throw new IllegalArgumentException("Invalid range: min > max");
        this.max = max;
        this.min = min;
    }

    public long getMin() {
        return min;
    }

    public long getMax() {
        return max;
    }

}

