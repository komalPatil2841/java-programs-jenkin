import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();

        // Format the date using a DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);
 System.out.println("This is a java program " );
  System.out.println("***************************");
        // Print the formatted date
        System.out.println("Today's Date: " + formattedDate);
    }
}