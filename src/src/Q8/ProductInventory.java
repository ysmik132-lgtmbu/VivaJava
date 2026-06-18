//Bhudev Katawal 116237 BIT sec "P"

interface Stockable {

    void updateStock(int qty);
    // Interface method
}

class Product implements Stockable {

    int stock = 50;

    public void updateStock(int qty) {

        stock += qty;

        System.out.println(
                "Updated Stock = " +
                stock);
    }
}

public class ProductInventory {

    public static void main(String[] args) {

        Product p = new Product();
        // Object creation

        p.updateStock(20);
    }
}
