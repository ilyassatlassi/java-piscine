public class CountChar {
    public static int count(String s, char c) {
        // your code here
        if (s == null)
            return 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}