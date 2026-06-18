//Bhudev Katawal 116237 BIT sec "P"

import java.util.ArrayList;

public class StudentGradeFilter {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        // Dynamic ArrayList

        scores.add(95);
        scores.add(65);
        scores.add(30);

        for(int score : scores) { // Enhanced for loop

            if(score >= 90) {
                System.out.println("Distinction");
            }

            else if(score >= 40) {
                System.out.println("Pass");
            }

            else {
                System.out.println("Fail");
            }
        }
    }
}
