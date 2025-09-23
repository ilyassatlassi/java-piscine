import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        // your code here
        FileWriter writer = new FileWriter(fileName);
        writer.write(content);
        writer.close();

    }

    public static String getContentFile(String fileName) throws IOException {
        // your code here
        String input = new String(Files.readAllBytes(Paths.get(fileName)));
        return input;
    }

    public static void deleteFile(String fileName) {
        // your code here
        File file = new File(fileName);
        file.delete();
    }
}