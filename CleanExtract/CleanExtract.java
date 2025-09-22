
public class CleanExtract {
    public static String extract(String s) {
        // your code here
        String[] splited = s.split("\\|");
        StringBuilder res = new StringBuilder();

        for (String string : splited) {
            string = string.trim();
            String sub;

            int firstPoint = string.indexOf(".");
            int lastPoint = string.lastIndexOf(".");
            if (firstPoint != -1 && lastPoint != -1 && lastPoint != firstPoint) {
                sub = string.substring(firstPoint + 1, lastPoint).trim();
            } else if (firstPoint != -1) {
                sub = string.substring(firstPoint + 1, string.length()).trim();
            } else {
                // no dots
                sub = string;
            }

            if (!sub.isEmpty()) {

                if (res.length() > 0) {
                    res.append(" ");
                }
                res.append(sub);
            }
            // System.out.println(string.trim());
        }
        return res.toString().trim();
    }
}