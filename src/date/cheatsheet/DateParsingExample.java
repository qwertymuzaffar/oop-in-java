package date.cheatsheet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParsingExample {
    public static void main(String[] args) {
        // Define a date string to parse
        String dateString = "2025-01-23";

        // Create a DateTimeFormatter to define the expected format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the string into a LocalDate object
        LocalDate date = LocalDate.parse(dateString, formatter);

        // Output the parsed date
        System.out.println("Parsed date: " + date);
    }
}
