package date.cheatsheet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomDateParsing {
    public static void main(String[] args) {
        String dateString = "23/01/2025";

        // Define the pattern for parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(dateString, formatter);

        System.out.println("Parsed date: " + date);
    }
}
