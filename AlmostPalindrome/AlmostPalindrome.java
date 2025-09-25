public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        if (palindrome(s)) {
           return false; 
        }
        // your code here
        // StringBuilder rev = new StringBuilder();
        for(int i = 0; i < s.length() ; i++) {
            String candidate = s.substring(0, i) + s.substring(i+ 1) ;
           if(palindrome(candidate)) {
            return true;
           } 
        }
        return false;
    }

  public static boolean palindrome(String s) {
        // your code here
        String rev = new StringBuilder(s).reverse().toString().toLowerCase();
        if(rev.equals(s.toLowerCase())) {
            return true;
        }
        return false;
    }
}