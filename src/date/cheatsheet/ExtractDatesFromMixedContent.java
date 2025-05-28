package date.cheatsheet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExtractDatesFromMixedContent {
    public static void main(String[] args) {
        String mixedContent = "Please note that our deadlines are on 2025-01-23 and 2025-02-28.";

        // Define the date pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Split based on spaces and check each part
        String[] words = mixedContent.split(" ");

        for (String word : words) {
            if (word.matches("\\d{4}-\\d{2}-\\d{2}")) { // Check if it matches a date pattern
                try {
                    LocalDate date = LocalDate.parse(word, formatter);
                    System.out.println("Extracted date: " + date);
                } catch (DateTimeParseException e) {
                    System.out.println("Error parsing date: " + word);
                }
            }
        }
    }
}
