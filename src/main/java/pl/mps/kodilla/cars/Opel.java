package pl.mps.kodilla.cars;

import java.util.Objects;

public class Opel implements Car {

    private int speed;

    public Opel() {
    }

    public Opel(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed += 10;
    }

    public void decreaseSpeed() {
        speed -= 20;
        if (speed < 0) speed = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
