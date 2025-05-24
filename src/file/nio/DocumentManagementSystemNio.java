package file.nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Scanner;

public class DocumentManagementSystemNio {
    private static final String BASE_DIRECTORY = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true) {
            System.out.println("1. Create directory\n2. List documents\n3. Delete directory\n4. Exit");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    createDirectory(scanner);
                    break;
                case "2":
                    listDirectory(scanner);
                    break;
                case "3":
                    deleteDirectory(scanner);
                    break;
                case "4":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void createDirectory(Scanner scanner) {
        System.out.print("New directory name: ");
        Path path = Paths.get(BASE_DIRECTORY, scanner.nextLine());
        try {
            System.out.println("Created: " + Files.createDirectories(path));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void listDirectory(Scanner scanner) {
        System.out.print("Directory to list: ");
        Path path = Paths.get(BASE_DIRECTORY, scanner.nextLine());
        try {

            Files.list(path).forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void deleteDirectory(Scanner scanner) {
        System.out.print("Directory to delete: ");
        Path path = Paths.get(BASE_DIRECTORY, scanner.nextLine());
        try {
            Files.delete(path);
            System.out.println("Deleted: " + path);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
