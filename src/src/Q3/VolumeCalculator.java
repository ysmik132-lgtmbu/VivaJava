//Bhudev Katawal 116237 BIT sec "P"

class InvalidAgeException extends Exception {
    // Custom exception

    InvalidAgeException(String message) {
        super(message);
    }
}

public class InvalidAgeProtector {

    static void checkEligibility(int age)
            throws InvalidAgeException {
            // Declares exception

        if(age < 18) {
            throw new InvalidAgeException(
                    "Age is not valid");
            // Throws custom exception
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try { // Risky code block

            checkEligibility(16);

        }

        catch(InvalidAgeException e) {
            // Handles exception

            System.out.println(e.getMessage());
        }
    }
}
