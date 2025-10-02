import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class SteadySequence {
    public int longestSequence(int[] nums) {
        // Implementation to find the length of the longest consecutive elements
        // sequence
        Set<Integer> seen = new HashSet<>();
        int left, maxlength = 0;
        for (int rigth = 0; rigth < nums.length; rigth++) {
            seen.add(nums[rigth]);
            while (seen.contains(nums[rigth])) {
            }
        }
        return seen.size();
    }
}