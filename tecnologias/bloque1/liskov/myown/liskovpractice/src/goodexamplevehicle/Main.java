package goodexamplevehicle;

import wrongexample.Bicycle;
import wrongexample.Car;
import wrongexample.Mortalika;
import wrongexample.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<wrongexample.Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Mortalika());
        vehicleList.add(new Car());
        vehicleList.add(new Bicycle());

        // Objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
        // objects of your subclasses to behave in the same way as the objects of your superclass
        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.getNumberOfWheels().toString());
        }

    }
}
