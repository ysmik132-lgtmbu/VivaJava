// BodyFatCategory.java
//A simple health profile evaluator that takes body fat percentage as input and categorizes members as "Athletic" (under 14%), "Fit" (14-24%), or "Regular" (above 24%). The program uses an if-else if-else structure to ensure mutually exclusive conditions, preventing multiple conflicting categories from being printed for a single input value.

//Bhudev katawal
import java.util.Scanner;

public class BodyFatCategory {//Q1
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter body fat percentage: ");
        int fat = input.nextInt();//taking input

        if (fat < 14) {
            System.out.println("Athletic");
        }
        // Under 14%

        else if (fat <= 24) {
            System.out.println("Fit");
        }
        // 14 to 24%

        else {
            System.out.println("Regular");
        }
        // Above 24%

    }
}
