//Bhudev Katawal
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
