//Bhudev Katawal 116237 BIT sec "P"

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogFileReader {

    public static void main(String[] args) {

        ArrayList<String> errors =
                new ArrayList<>();
        // Stores ERROR lines

        try {

            Scanner sc =
                    new Scanner(
                    new File("server.log"));

            while(sc.hasNextLine()) {

                String line =
                        sc.nextLine();

                if(line.contains("ERROR")) {

                    errors.add(line);
                    // Store matching line
                }
            }

            sc.close();

            for(String e : errors) {

                System.out.println(e);
            }
        }

        catch(FileNotFoundException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}
