package date.cheatsheet;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {
    public static void main(String[] args) {
        String dateTimeString = "2025-01-23 15:30";

        // Define the pattern for date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);

        System.out.println("Parsed date and time: " + dateTime);
    }
}
