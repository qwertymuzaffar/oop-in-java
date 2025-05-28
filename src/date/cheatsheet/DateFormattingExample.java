package date.cheatsheet;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class DateFormattingExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Format the date
        String formattedDate = currentDate.format(formatter);

        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);
    }
}
