import java.util.ArrayList;

public class TheatreSeats {//Q4

    public static void main(String[] args) {

        ArrayList<String> seats = new ArrayList<>();

        seats.add("A1");
        seats.add("A2");
        seats.add("A3");

        System.out.println("Original Seats:");
        System.out.println(seats);

        seats.add(1, "VIP");
        // Insert at index 1

        System.out.println("After Insertion:");
        System.out.println(seats);

        seats.remove("A2");
        // Remove seat

        System.out.println("After Removal:");
        System.out.println(seats);
    }
}
