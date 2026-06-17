public class TemperatureAnalysis {//Q8

    public static void main(String[] args) {

        double[] temps =
                {25, 28, 30, 27, 35, 29};

        double sum = 0;

        for (double t : temps) {
            sum += t;
        }
        // Calculate sum

        double average =
                sum / temps.length;

        double max = temps[0];

        for (double t : temps) {

            if (t > max) {
                max = t;
            }
        }
        // Find highest temperature

        System.out.println(
                "Average = " + average);

        System.out.println(
                "Maximum = " + max);
    }
}
