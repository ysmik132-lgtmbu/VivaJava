import java.util.ArrayList;

public class DriverManagement {//Q10

    public static void main(String[] args) {

        ArrayList<String> activeDrivers =
                new ArrayList<>();

        activeDrivers.add("Ram");
        activeDrivers.add("Hari");
        activeDrivers.add("Sita");

        System.out.println(activeDrivers);

        activeDrivers.add(1, "PriorityDriver");
        // Inserts and shifts elements right

        System.out.println(activeDrivers);

        activeDrivers.set(2, "UpdatedDriver");
        // Replaces element without shifting

        System.out.println(activeDrivers);
    }
}
