package pl.mps.kodilla.cars;

import java.util.Objects;

public class Ford implements Car {

    private int speed;

    public Ford() {
    }

    public Ford(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed += 20;
    }

    public void decreaseSpeed() {
        speed -= 10;
        if (speed < 0) speed = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
