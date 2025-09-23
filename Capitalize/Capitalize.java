import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        // your code here
        if (args.length != 2) {
            return;
        }

        String input = new String(Files.readAllBytes(Paths.get(args[0])));
        input = input.trim();
        String[] splitedInput;
        String result = "";
        if (!input.isEmpty()) {
            splitedInput = input.split(" ");
            for (int i = 0; i < splitedInput.length; i++) {
                String word = splitedInput[i];
                if (!word.isEmpty()) {
                    result += word.substring(0, 1).toUpperCase() +
                            word.substring(1).toLowerCase() + " ";
                }
            }

            result = result.trim();
        }


        FileWriter writer = new FileWriter(args[1]);
        writer.write(result);
        writer.close();
    }

}
