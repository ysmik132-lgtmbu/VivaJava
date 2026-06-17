//Bhudev Katawal
interface SmartDevice {

    void turnOn();

    void turnOff();
    // Contract methods
}

class SmartFan implements SmartDevice {

    public void turnOn() {
        System.out.println("Fan ON");
    }

    public void turnOff() {
        System.out.println("Fan OFF");
    }
}

class SmartLight implements SmartDevice {

    public void turnOn() {
        System.out.println("Light ON");
    }

    public void turnOff() {
        System.out.println("Light OFF");
    }
}

class oMain {

    public static void main(String[] args) {
//creating object
        SmartDevice fan =
                new SmartFan();

        SmartDevice light =
                new SmartLight();

        fan.turnOn();
        light.turnOn();

        fan.turnOff();
        light.turnOff();
    }
}
