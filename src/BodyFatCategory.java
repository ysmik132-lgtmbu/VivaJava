//Bhudev Katawal

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
