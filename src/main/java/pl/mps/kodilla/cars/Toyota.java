package pl.mps.kodilla.cars;

public class Toyota implements Car {

    private int speed;

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
}
