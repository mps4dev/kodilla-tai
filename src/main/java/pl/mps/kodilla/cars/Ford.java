package pl.mps.kodilla.cars;

public class Ford implements Car {

    private int speed;

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
}
