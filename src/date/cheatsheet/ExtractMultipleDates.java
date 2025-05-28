package date.cheatsheet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExtractMultipleDates {
    public static void main(String[] args) {
        String text = "Important dates: 2025-01-23, 2025-02-14, and 2025-03-01.";

        // Define the date pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Split the string to find dates
        String[] parts = text.split(", | and ");

        for (String part : parts) {
            try {
                LocalDate date = LocalDate.parse(part.trim(), formatter);
                System.out.println("Extracted date: " + date);
            } catch (DateTimeParseException e) {
                System.out.println("Error parsing date: " + part.trim());
            }
        }
    }
}
