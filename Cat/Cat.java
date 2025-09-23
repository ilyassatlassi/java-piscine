import java.io.*;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }

        // Open the file
        try (InputStream in = new FileInputStream(args[0])) {
            byte[] buffer = new byte[1024]; 
            int bytesRead;

            // Read and write until EOF
            while ((bytesRead = in.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
        }
    }
}
