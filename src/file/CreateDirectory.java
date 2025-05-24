package file;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        // Define the directory path
        String directoryPath = "Projects/Java";

        // Create a File object
        File directory = new File(directoryPath);

        // Create the directory
        if (!directory.exists()) {
            boolean created = directory.mkdirs(); // Use mkdirs() to create nested directories
            if (created) {
                System.out.println("Directory created successfully: " + directoryPath);
            } else {
                System.out.println("Failed to create directory.");
            }
        } else {
            System.out.println("Directory already exists: " + directoryPath);
        }
    }
}
