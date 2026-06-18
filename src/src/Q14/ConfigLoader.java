//Bhudev Katawal 116237 BIT sec "P"

import java.io.*;

public class ConfigLoader {

    static void createDefaultConfig()
            throws IOException {
        // Create default config file

        BufferedWriter bw =
                new BufferedWriter(
                new FileWriter("config.txt"));

        bw.write("theme=light");
        bw.newLine();
        bw.write("language=en");

        bw.close();

        System.out.println(
                "Default config created");
    }

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                    new FileReader("config.txt"));
            // Try reading config

            System.out.println(
                    "Config loaded");

            br.close();
        }

        catch(FileNotFoundException e) {
            // Create file if missing

            try {

                createDefaultConfig();

            }

            catch(IOException ex) {

                System.out.println(
                        ex.getMessage());
            }
        }

        catch(IOException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}
