package pl.mps.kodilla.inheritance;

public class Rectangle extends Shape {

    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double field() {
        return firstSide * secondSide;
    }

    @Override
    public double circumference() {
        return 2 * (firstSide + secondSide);
    }
}
