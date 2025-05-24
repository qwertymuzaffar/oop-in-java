package file;

import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
        String directoryPath = "Projects/Java";
        File directory = new File(directoryPath);

        if (directory.exists()) {
            boolean deleted = directory.delete();

            if (deleted) {
                System.out.println("Directory deleted successfully: " + directoryPath);
            } else {
                System.out.println("Failed to delete directory. It may not be empty");
            }
        } else {
            System.out.println("Directory does not exist: Projects/Java");
        }
    }
}
