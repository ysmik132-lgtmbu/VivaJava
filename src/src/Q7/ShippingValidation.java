public class ShippingValidation {//Q7

    public static void main(String[] args) {

        double weight = -5;

        boolean isValid = weight > 0 && weight <= 100;//true or false

        if (!isValid) {
            System.out.println(
                    "Invalid Weight!");
            return;
        }
        // Reject invalid weights

        System.out.println(
                "Shipment Accepted");
    }
}
