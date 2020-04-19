package pl.mps.kodilla.inheritance;

public class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double field() {
        return Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (b + c - a)) / 4;
    }

    @Override
    public double circumference() {
        return a + b + c;
    }
}
