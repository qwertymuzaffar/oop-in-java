package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream inputFile = null;
        FileOutputStream outputFile = null;

        try {
            // Create FileInputStream to read from "source.txt"
            inputFile = new FileInputStream("source.txt");
            // Create FileOutputStream to write to "destination.txt"
            outputFile = new FileOutputStream("destination.txt");

            int byteData;
            // Read bytes from source and write them to destination
            while ((byteData = inputFile.read()) != -1) {
                outputFile.write(byteData);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close both streams
            try {
                if (inputFile != null) inputFile.close();
                if (outputFile != null) outputFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
