package wrongexample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Mortalika());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        // Objects of a superclass shall be replaceable with objects of its subclasses
        // without breaking the application.
        // In this example, this breaks the Liskov Principle

        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.hasEngine().toString());
        }

    }
}
