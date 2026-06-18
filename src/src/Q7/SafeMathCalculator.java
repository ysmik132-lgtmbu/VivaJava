//Bhudev Katawal 116237 BIT sec "P"

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeMathCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            // Division operation

            System.out.println("Result = " + result);
        }

        catch(ArithmeticException e) {
            // Handles divide by zero

            System.out.println("Cannot divide by zero");
        }

        catch(InputMismatchException e) {
            // Handles invalid input

            System.out.println("Enter integers only");
        }

        sc.close();
    }
}
