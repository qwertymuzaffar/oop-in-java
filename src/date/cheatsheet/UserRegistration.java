package date.cheatsheet;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get user's birthdate
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String birthdateInput = scanner.nextLine();

        // Parse the input string into a LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateInput);

        // Define the desired output format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");

        // Format the birthdate using the defined formatter
        String formattedBirthdate = birthdate.format(formatter);

        // Display the result
        System.out.println("Hello " + name + "! Your birthdate is: " + formattedBirthdate);

        // Close the scanner
        scanner.close();
    }
}
