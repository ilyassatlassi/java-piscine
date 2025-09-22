public class Palindrome {
    public static boolean isPalindrome(String s) {
        // your code here
        if (s == null) {
            return false;
        }
        String rev = new StringBuilder(s).reverse().toString();
        // System.out.println(rev);
        // System.out.println(s);
        if (rev.equals(s)  ) {
            return true;
        }
        return false;
    }
}