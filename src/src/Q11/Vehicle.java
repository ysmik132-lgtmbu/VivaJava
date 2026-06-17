class Vehicle {//Q11

    String model;

    Vehicle(String model) {
        this.model = model;
    }

    void display() {
        System.out.println("Model: " + model);
    }
}

class ElectricTruck extends Vehicle {

    ElectricTruck(String model) {
        super(model);
        // Calls parent constructor
    }
}

class pMain {

    public static void main(String[] args) {

        ElectricTruck truck =
                new ElectricTruck("Tesla Semi");

        truck.display();
    }
}
