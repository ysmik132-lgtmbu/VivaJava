//Bhudev Katawal
import java.io.FileWriter;
import java.io.IOException;

public class DailyLogger {//Q16

    public static void main(String[] args) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "daily_log.txt",
                            true);
            // true = append mode

            writer.write("System Started\n");//writing

            writer.close();
            // Close file resource

            System.out.println(
                    "Log Written Successfully");

        } catch (Exception e) {

            System.out.println(e);
        }
        // Handles file exceptions
    }
}
