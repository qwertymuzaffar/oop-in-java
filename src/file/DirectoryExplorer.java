package file;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class DirectoryExplorer {

    // Method to handle file management operations
    private static void fileManagement(File file) {
        // Display options to the user
        System.out.println("\nPress 1 to rename the file," +
                "\nPress 2 to delete the file," +
                "\nAny other key to exit");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        // Handle user choice
        if (userChoice.equals("1")) {
            // Get new name for the file
            System.out.println("Enter the new name for the file " + file.getName());
            String newfileName = scanner.nextLine();
            // Attempt to rename the file
            boolean changed = file.renameTo(new File(file.getParent(), newfileName));
            //Print message about success or failure of file renaming
            if (changed) {
                System.out.println("Filename successfully changed");
            } else {
                System.out.println("Filename couldn't be changed!");
            }
        } else if (userChoice.equals("2")) {
            // Delete the file
            boolean deleted = file.delete();
            //Print message about success or failure of file deletion
            if (deleted) {
                System.out.println("Filename successfully deleted");
            } else {
                System.out.println("Filename couldn't be deleted!");
            }
        }
    }

    // Method to handle directory management operations (list, rename, or delete)
    private static void directoryManagement(File dirObj) {
        // Display options to the user
        System.out.println("\nPress 1 to list the directory," +
                "\nPress 2 to rename the directory," +
                "\nPress 3 to delete the directory," +
                "\nAny other key to exit");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        // Handle user choice
        if (userChoice.equals("1")) {
            // List the contents of the directory
            String[] fileNames = dirObj.list();
            if (fileNames.length == 0) {
                System.out.println("The directory is empty!");
            } else {
                for (int i = 0; i < fileNames.length; i++) {
                    System.out.println(fileNames[i]);
                }
            }
        } else if (userChoice.equals("2")) {
            // Rename the directory
            System.out.println("Enter the new name for the directory " + dirObj.getName());
            String newDirName = scanner.nextLine();
            // Attempt to rename the directory
            boolean changed = dirObj.renameTo(new File(dirObj.getParent(), newDirName));
            //Print message about success or failure of dir renaming
            if (changed) {
                System.out.println("Directory name successfully changed");
            } else {
                System.out.println("Directory name couldn't be changed!");
            }
        } else if (userChoice.equals("3")) {
            // Delete the directory
            boolean deleted = dirObj.delete();
            //Print message about success or failure of dir deletion
            if (deleted) {
                System.out.println("Directory successfully deleted");
            } else {
                System.out.println("Directory couldn't be deleted! It might not be empty");
            }
        }
    }

    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in);

        // Loop indefinitely until the user chooses to exit
        while (true) {
            // Display the menu options to the user
            System.out.println("\nPress 1 for File Management," + "\nAny other key to exit");

            // Read the user's choice
            String userAction = scanner.nextLine();

            // Option 1: File Management
            if (userAction.equals("1")) {
                // Prompt the user to enter the name of the file or directory with the path
                System.out.println("Enter the name of the file or directory with the path");

                // Read the file name with path
                String fileName = scanner.nextLine();

                // Create a File object representing the file or directory
                File file = new File(fileName);

                // Check if the file or directory exists
                if (file.exists()) {
                    // Check if the file is a file or directory
                    if (file.isFile()) {
                        System.out.println(fileName + " is a file");
                        // Call the fileManagement method for file operations
                        fileManagement(file);
                    } else {
                        System.out.println(fileName + " is a directory");
                        // Call the directoryManagement method for directory operations
                        directoryManagement(file);
                    }
                } else {
                    // If the file or directory does not exist, prompt the user to create it
                    System.out.println(fileName + " is not a valid file or directory");
                    System.out.println("To create a file with given name press 1\n"
                            + "To create a directory with given name press 2\n"
                            + "To do nothing and continue, press any other key");

                    // Read the user's choice
                    String createChoice = scanner.nextLine();

                    // Create a file
                    if (createChoice.equals("1")) {
                        // Get the parent directory
                        String parentDirStr = file.getParent();
                        File parentDir = new File(parentDirStr);

                        // Create the parent directory if it does not exist
                        if (!parentDir.exists()) {
                            boolean created = parentDir.mkdirs();
                            if (!created) {
                                System.out.println("The parent directory could not be created");
                                continue;
                            }
                        }

                        // Create the file
                        try {
                            file.createNewFile();
                            System.out.println("File successfully created!");
                        } catch (IOException ioe) {
                            System.out.println("Unable to create file. " + ioe.getMessage());
                        }
                    }
                    // Create a directory
                    else if (createChoice.equals("2")) {
                        // Create the directory
                        boolean created = file.mkdirs();
                        if (created) {
                            System.out.println("The directory has been created");
                        } else {
                            System.out.println("The directory couldn't be created");
                        }
                    }
                }
            }
            // Exit the program
            else {
                System.out.println("Bye!");
                break;
            }
        }
    }
}
