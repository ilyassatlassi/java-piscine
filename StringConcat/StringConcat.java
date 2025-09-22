public class StringConcat {
    public static String concat(String s1, String s2) {
        // your code here
        if (s1 != null && s2 != null) {
            return s1.concat(s2);
        } else if (s1 == null) {
            return s2;
        }
        return s1;
    }
}