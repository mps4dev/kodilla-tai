package pl.mps.kodilla.cars;

public class Opel implements Car {

    private int speed;

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
}
