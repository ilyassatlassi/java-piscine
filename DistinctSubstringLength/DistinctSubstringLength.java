import java.util.HashSet;
import java.util.Set;

public class DistinctSubstringLength {
    public int maxLength(String s) {
        // Implementation to find the length of the longest substring without repeating
        if (s.isEmpty()) {
            return 0;
        }
        int left =0 , maxLength = 0;
        Set<Character> seen = new HashSet<>(); 
        for(int i =0; i < s.length(); i++ ){
            char c =s.charAt(i);
            while(seen.contains(c)){
                // maxLength =seen.size();
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(c);
            maxLength = Math.max(maxLength, i -left +1);

        }
       return maxLength;

    }
}