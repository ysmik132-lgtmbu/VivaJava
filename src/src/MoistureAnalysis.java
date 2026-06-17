//MoistureAnalysis.java
//An automated irrigation system module that tracks daily soil moisture levels using a fixed-size double array of 7 elements. The program iterates through the array using its dynamic length property, computes the total variance from a baseline target of 45.0 using absolute differences, and outputs a decision code indicating whether the system should maintain normal operation or require water adjustment.

public class MoistureAnalysis {//Q2

    public static void main(String[] args) {

        double[] moistureLogs = {42.5, 46.0, 48.5, 44.0, 43.5, 47.0, 45.5};
//Declaring array
        double totalVariance = 0;
        double baseline = 45.0;

        for (int i = 0; i < moistureLogs.length; i++) {
            totalVariance += Math.abs(moistureLogs[i] - baseline);
        }
        // Calculate total variance

        System.out.println("Total Variance = " + totalVariance);

        if (totalVariance < 15)
            System.out.println("Decision: NORMAL");
        else
            System.out.println("Decision: WATER ADJUSTMENT NEEDED");
    }
}
