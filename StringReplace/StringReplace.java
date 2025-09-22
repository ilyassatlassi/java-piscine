public class StringReplace {
    public static String replace(String s, CharSequence target, CharSequence replacement) {
        // your code here
        if (s == null || target == null || replacement == null) {
           return ""; 
        }
        return s.replace(target, replacement); 
    }
}