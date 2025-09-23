import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        File root = new File("documents");
        // your code here
        if (!root.isDirectory() || !root.exists()) {
            return null;
        }
        return recursive(root, fileName);
    }

    private static String recursive(File root, String filename) {
        File[] Files = root.listFiles();
        if (Files == null)
            return null;
        for (File file : Files) {
            if (file.isDirectory()) {
                String path = recursive(file, filename);
                if (path != null) {
                    return path;
                }
            } else {
                if (file.getName().equals(filename)) {
                    return file.getPath();
                }
            }
        }
        return null;
    }
}