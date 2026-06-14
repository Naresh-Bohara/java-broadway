package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {
        
        // -----------------------------------------------------------
        // 1. Check if a single file exists (d://yyy.txt)
        // -----------------------------------------------------------
        File file = new File("d://yyy.txt");
        System.out.println("Does d://yyy.txt exist? " + file.exists());
        
        // -----------------------------------------------------------
        // 2. Create directory (with all parent directories)
        // -----------------------------------------------------------
        File dir = new File("d://Javabroadway/6files");
        if (!dir.exists()) {
            dir.mkdirs();  // mkdirs() creates parent folders as well
            System.out.println("Directory created: " + dir.getAbsolutePath());
        } else {
            System.out.println("Directory already exists: " + dir.getAbsolutePath());
        }
        
        // -----------------------------------------------------------
        // 3. Create a sample file (message.txt) if it doesn't exist
        // -----------------------------------------------------------
        File messageFile = new File(dir, "message.txt");
        if (!messageFile.exists()) {
            // Write some default content
            String defaultContent = "Hello, this is a sample message.\nWelcome to Java file handling!";
            Files.writeString(Path.of(messageFile.getAbsolutePath()), defaultContent, StandardOpenOption.CREATE);
            System.out.println("Created missing file: " + messageFile.getName());
        } else {
            System.out.println("File already exists: " + messageFile.getName());
        }
        
        // -----------------------------------------------------------
        // 4. Get all file names from the folder (as String array)
        // -----------------------------------------------------------
        String[] fileNames = dir.list();
        System.out.println("\nAll files in directory: " + Arrays.toString(fileNames));
        
        // -----------------------------------------------------------
        // 5. Check if "message.txt" exists using list + contains
        // -----------------------------------------------------------
        if (Arrays.asList(fileNames).contains("message.txt")) {
            System.out.println("✓ 'message.txt' found using list search.");
        } else {
            System.out.println("✗ 'message.txt' NOT found (unexpected).");
        }
        
        // -----------------------------------------------------------
        // 6. Read and print content of ALL files in the folder
        // -----------------------------------------------------------
        System.out.println("\n--- Reading ALL files ---");
        File[] fileList = dir.listFiles();
        if (fileList != null && fileList.length > 0) {
            for (File fl : fileList) {
                System.out.println("File: " + fl.getName());
                String content = Files.readString(Path.of(fl.getAbsolutePath()));
                System.out.println(content);
                System.out.println("------------------------");
            }
        } else {
            System.out.println("No files found in directory.");
        }
        
        // -----------------------------------------------------------
        // 7. Read only a SINGLE file – message.txt
        // -----------------------------------------------------------
        System.out.println("\n--- Reading ONLY message.txt ---");
        Path singleFilePath = Path.of(dir.getAbsolutePath(), "message.txt");
        if (Files.exists(singleFilePath)) {
            String singleContent = Files.readString(singleFilePath);
            System.out.println("Content of message.txt:\n" + singleContent);
        } else {
            System.out.println("message.txt does not exist!");
        }
    }
}