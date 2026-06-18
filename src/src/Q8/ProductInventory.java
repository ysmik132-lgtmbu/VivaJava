//Bhudev Katawal 116237 BIT sec "P"

interface Discountable {

    void applyDiscount(double pct);
    // Interface method
}

class Electronics implements Discountable {

    String name;
    double price;

    Electronics(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double pct) {

        price = price - (price * pct / 100);

        System.out.println(
                name + " Price = " + price);
    }
}

public class ProductInventory {

    public static void main(String[] args) {

        Electronics[] inventory = {

                new Electronics("Laptop", 1000),
                new Electronics("Phone", 500)
        };
        // Array of electronics

        for(Electronics e : inventory) {

            e.applyDiscount(10.0);
            // Apply 10% discount
        }
    }
}
