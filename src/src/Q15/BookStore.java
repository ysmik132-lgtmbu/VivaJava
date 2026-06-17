//Bhudev Katawal
import java.util.ArrayList;

public class BookStore {//Q15

    public static void main(String[] args) {

        ArrayList<String> books =
                new ArrayList<>();

        books.add("Nepali");
        books.add("English");
        books.add("Computer");

        books.forEach(book ->
                System.out.println(
                        "Book: " + book));
        // Lambda processes each item
    }
}
