import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the name of the file you want to read (or type 'exit' to quit):");
            String userInput = scanner.nextLine();

            if (userInput.equals("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            } else {
                Path filePath = Paths.get(userInput);

                try {
                    String content = Files.readString(filePath);

                    System.out.println(content);
                } catch (IOException e) {
                    System.err.println("Error reading file: " + e.getMessage());
                }
            }
        }

        scanner.close();

    }
}
