package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContactReader {

    public static void main(String[] args) {
        // Step 2: Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 3: Prompt the user to enter the file name containing contacts
        System.out.println("Enter the name of the contacts file:");


        // Step 4: Read the file name entered by the user
        String fileName = scanner.nextLine();

        // Optional Bonus:
        // Step 11: Add a feature to count and display the total number of contacts read
        int contactCount = 0;

        try {
            // Step 5: Create a FileReader or similar object to read the file
            // Hint: You can use FileReader, BufferedReader, or Files class
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            System.out.println("\n===== CONTACT LIST =====");

            // Step 6: Read the file line by line
            // Read the file line by line until we reach the end (null)
            while ((line = reader.readLine()) != null) {
                // Make sure line is not empty
                if (!line.trim().isEmpty()) {
                    // Step 7: Parse each line to extract name and phone number
                    // The format is expected to be: Name:PhoneNumber
                    String[] parts = line.split(":");

                    // Verify the line has the expected format
                    if (parts.length == 2) {
                        String name = parts[0].trim();
                        String phoneNumber = parts[1].trim();

                        // Step 8: Display the contact information in a formatted way
                        // Example: "Contact: John Doe | Phone: +1-555-123-4567"
                        System.out.println("Contact: " + name + " | Phone: " + phoneNumber);

                        // Increment the contact count
                        contactCount++;
                    } else {
                        // Line doesn't match expected format
                        System.out.println("Warning: Skipping improperly formatted line: " + line);
                    }
                }
            }

            // Step 9: Close the file reader when done
            reader.close();
            System.out.println("\nTotal contacts read: " + contactCount);

        }
        // Step 10: Handle exceptions appropriately
        catch (FileNotFoundException e) {
            // Handle case where the file doesn't exist
            System.err.println("Error: File not found - " + fileName);
            System.err.println("Please check the file name and path and try again.");
        } catch (IOException e) {
            // Handle other I/O errors that may occur during reading
            System.err.println("Error reading from file: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other unexpected errors
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }


    }

}
