package pl.mps.kodilla.cars;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println(car.getClass().getSimpleName() + " speed: " + car.getSpeed());
    }

    public static Car getByName(String name) {
        if (Ford.class.getSimpleName().equals(name)) {
            return new Ford();
        }
        if (Opel.class.getSimpleName().equals(name)) {
            return new Opel();
        }
        if (Toyota.class.getSimpleName().equals(name)) {
            return new Toyota();
        }
        throw new IllegalArgumentException("Illegal car brand name.");
    }

}
