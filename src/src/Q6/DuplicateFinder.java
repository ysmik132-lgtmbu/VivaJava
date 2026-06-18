//Bhudev Katawal 116237 BIT sec "P"

import java.util.ArrayList;

public class DuplicateFinder {

    public static void main(String[] args) {

        ArrayList<String> guests = new ArrayList<>();
        // Guest list

        guests.add("Ram");
        guests.add("Hari");
        guests.add("Ram");
        guests.add("Sita");
        guests.add("Hari");

        for(int i = 0; i < guests.size(); i++) {

            for(int j = i + 1; j < guests.size(); j++) {
                // Compare current name with remaining names

                if(guests.get(i).equals(guests.get(j))) {

                    System.out.println(
                            "Duplicate: " +
                            guests.get(i));
                }
            }
        }
    }
}
