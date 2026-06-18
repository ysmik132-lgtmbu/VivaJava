//Bhudev Katawal 116237 BIT sec "P"

interface Searchable {

    void search(String keyword);
    // Interface method
}

class EBook implements Searchable {

    public void search(String keyword) {

        System.out.println(
                "Searching EBook for: "
                + keyword);
    }
}

class PhysicalBook implements Searchable {

    public void search(String keyword) {

        System.out.println(
                "Searching Physical Book for: "
                + keyword);
    }
}

public class LibrarySystem {

    public static void main(String[] args) {

        Searchable b1 =
                new EBook();

        Searchable b2 =
                new PhysicalBook();

        b1.search("Java");
        b2.search("Java");
    }
}
