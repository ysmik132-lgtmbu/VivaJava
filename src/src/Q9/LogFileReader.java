//Bhudev Katawal 116237 BIT sec "P"

import java.io.*;

public class LogFileReader {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                    new FileReader("weekly_sales.txt"));
            // Opens file for reading

            String line;

            while((line = br.readLine()) != null) {
                // Reads file line by line

                System.out.println(line);
            }

            br.close();
            // Close file

        }

        catch(IOException e) {

            System.out.println(e.getMessage());
        }
    }
}
