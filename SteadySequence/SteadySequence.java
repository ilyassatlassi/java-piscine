import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SteadySequence {
    public int longestSequence(int[] nums) {
        // Implementation to find the length of the longest consecutive elements
        // sequence
        Set<Integer> seen = new HashSet<>();
        int  maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            seen.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            // seen.add(nums[i])
            int curr = nums[i];
            int currLentgh = 1;
            while(seen.contains(curr +1)){
                // maxLength++;
                currLentgh++;
                curr++;
            }
            maxLength = Math.max(maxLength, currLentgh );
        }

        return maxLength;
    }
}