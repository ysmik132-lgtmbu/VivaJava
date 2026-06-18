//Bhudev Katawal 116237 BIT sec "P"

import java.io.*;

public class DailySalesLog {

    public static void main(String[] args) {

        double[] sales =
        {1000, 2000, 1500, 3000, 2500, 1200, 1800};
        // Sales array

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                    new FileWriter("weekly_sales.txt"));
            // Creates file writer

            for(double s : sales) {
                // Loop through array

                bw.write(String.valueOf(s));
                bw.newLine();
            }

            bw.close();
            // Close file

            System.out.println("File Created");

        }

        catch(IOException e) {
            // Handles file exception

            System.out.println(e.getMessage());
        }
    }
}
