package pl.mps.kodilla.lists;

import pl.mps.kodilla.cars.*;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel(100));
        cars.add(new Ford(80));
        cars.add(new Toyota(50));
        cars.add(new Opel(50));
        cars.add(new Ford(30));

        describeCars(cars);

        cars.remove(1);
        cars.remove(new Opel(50));

        describeCars(cars);

    }

    private static void describeCars(List<Car> cars) {
        System.out.println("\nCars size is " + cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
