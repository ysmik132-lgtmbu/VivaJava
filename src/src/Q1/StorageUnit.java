//Bhudev Katawal 116237 BIT sec "P"

abstract class StorageUnit { // Abstract parent class

    int id;
    double capacity;

    StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

interface Refrigerated { // Interface declaration

    void adjustTemp(int t);
}

class ColdBox extends StorageUnit implements Refrigerated { // Inheritance + Interface

    ColdBox(int id, double capacity) {
        super(id, capacity); // Calls parent constructor
    }

    public void adjustTemp(int t) {
        System.out.println("Temperature adjusted to " + t + "°C");
    }
}

public class SmartWarehouse {

    public static void main(String[] args) {

        ColdBox box = new ColdBox(101, 500); // Object creation

        System.out.println("ID: " + box.id);
        System.out.println("Capacity: " + box.capacity);

        box.adjustTemp(4); // Interface method call
    }
}
