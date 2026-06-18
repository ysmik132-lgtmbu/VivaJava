//Bhudev Katawal 116237 BIT sec "P"

abstract class ElectronicDevice {

    abstract void powerOn();
    // Abstract method
}

class Printer extends ElectronicDevice {

    public void powerOn() {
        System.out.println("Printer ON");
    }
}

class Scanner extends ElectronicDevice {

    public void powerOn() {
        System.out.println("Scanner ON");
    }
}

public class DeviceManager {

    public static void main(String[] args) {

        ElectronicDevice[] devices =
        {
            new Printer(),
            new Scanner()
        };
        // Polymorphic array

        for(ElectronicDevice d : devices) {
            // Runtime polymorphism

            d.powerOn();
        }
    }
}
