package pl.mps.kodilla.inheritance;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double field() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
