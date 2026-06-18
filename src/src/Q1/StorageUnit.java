//Bhudev Katawal 116237 BIT sec "P".


abstract class StorageUnit {

    int id;
    double capacity;

    StorageUnit(int id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }
}

interface Refrigerated {

    void adjustTemp(int temperature);
}

class ColdBox extends StorageUnit implements Refrigerated {

    ColdBox(int id, double capacity) {
        super(id, capacity);
    }

    @Override
    public void adjustTemp(int temperature) {
        System.out.println(
                "Temperature adjusted to "
                        + temperature + "°C");
    }
}

public class SmartWarehouse {

    public static void main(String[] args) {

        ColdBox box =
                new ColdBox(101, 500);

        System.out.println(
                "Storage ID: " + box.id);

        System.out.println(
                "Capacity: " + box.capacity);

        box.adjustTemp(4);
    }
}
