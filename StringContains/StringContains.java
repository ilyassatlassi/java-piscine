public class StringContains {
    public static boolean isStringContainedIn(String subString, String s) {
        if (s == null || subString == null) {

            return false;
        }
        // your code here
        return s.contains(subString);
    }
}