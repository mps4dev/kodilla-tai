package pl.mps.kodilla.cars;

import java.util.Objects;

public class Toyota implements Car {

    private int speed;

    public Toyota() {
    }

    public Toyota(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed += 30;
    }

    public void decreaseSpeed() {
        speed -= 10;
        if (speed < 0) speed = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return speed == toyota.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
