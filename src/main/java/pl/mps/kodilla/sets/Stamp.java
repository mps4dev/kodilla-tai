package pl.mps.kodilla.sets;

import java.util.Objects;

public class Stamp {

    private String name;
    private double width;
    private double length;
    private boolean stamped;

    public Stamp(String name, double width, double length, boolean stamped) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.stamped = stamped;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.width, width) == 0 &&
                Double.compare(stamp.length, length) == 0 &&
                stamped == stamp.stamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, width, length, stamped);
    }
}
