//Bhudev Katawal 116237 BIT sec "P"

public class SafeMathCalculator {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {

            int result = a / b;
            // May throw exception

            System.out.println(result);

        }

        catch(ArithmeticException e) {
            // Handles divide-by-zero

            System.out.println( "Cannot divide by zero");
        }
    }
}
