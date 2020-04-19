package pl.mps.kodilla.inheritance;

public class ShapeApplication {

    public static void main(String[] args) {
        Shape circle = new Circle(2.0);
        Shape rectangle = new Rectangle(2.0, 4.0);
        Shape triangle = new Triangle(2.0, 3.0, 4.0);

        printShape(circle);
        printShape(rectangle);
        printShape(triangle);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.getClass().getSimpleName() + " - circumference: " + shape.circumference() + "cm , field: " + shape.field() + "cm2");
    }
}
