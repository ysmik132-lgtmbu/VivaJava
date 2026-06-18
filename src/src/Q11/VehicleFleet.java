//Bhudev Katawal 116237 BIT sec "P"

import java.util.ArrayList;

class Vehicle {

    public double calculateFee() {
        return 0;
    }
}

class Bike extends Vehicle {

    public double calculateFee() {
        return 100;
    }
}

class Bus extends Vehicle {

    public double calculateFee() {
        return 500;
    }
}

public class VehicleFleet {

    public static void main(String[] args) {

        ArrayList<Vehicle> fleet =
                new ArrayList<>();
        // Store different vehicle objects

        fleet.add(new Bike());
        fleet.add(new Bus());

        for(Vehicle v : fleet) {
            // Runtime polymorphism

            System.out.println(
                    "Fee = " +
                    v.calculateFee());
        }
    }
}
