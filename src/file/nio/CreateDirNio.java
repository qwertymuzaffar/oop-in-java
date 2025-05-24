package file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirNio {
    public static void main(String[] args) {
        // 1) Single directory (fails if parent doesn't exist)
        Path dir1 = Paths.get("output/logs");
        try {
            Files.createDirectory(dir1);
            System.out.println("Created directory: " + dir1);
        } catch (IOException e) {
            System.err.println("Failed to create directory: " + e.getMessage());
        }

        // 2) Nested directories (creates all nonexistent parents)
        Path dir2 = Paths.get("output/archives/2025/05");
        try {
            Files.createDirectories(dir2);
            System.out.println("Created directories: " + dir2);
        } catch (IOException e) {
            System.err.println("Failed to create directories: " + e.getMessage());
        }
    }
}
