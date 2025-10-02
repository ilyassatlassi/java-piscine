import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {
        // Implementation to check if str1 and str2 are anagrams
        Map<Character, Integer> res = new HashMap<>();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            if (res.containsKey(str1.charAt(i))) {
                res.put(str1.charAt(i), res.get(str1.charAt(i)) + 1);
            } else {
                res.put(str1.charAt(i), 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (!res.containsKey(str2.charAt(i))) {
                return false;

            } else {
                res.put(str1.charAt(i), res.get(str1.charAt(i)) - 1);
            }

        }
        for (Integer item : res.values()) {
            if (item != 0) {
                return false;
            }
        }
        return true;
    }
}