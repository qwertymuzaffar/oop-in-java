package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine(); // Adds a new line
            bufferedWriter.write("This is a Java file handling example.");

            bufferedWriter.close(); // Always close the writer
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
