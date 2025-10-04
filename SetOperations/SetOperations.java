import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        // your code here
        Set<Integer> res = new HashSet<>();
        for (Integer integer : set1) {
            res.add(integer);
        }

        for (Integer integer : set2) {
            res.add(integer);
        }
        return res;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        // your code here
        Set<Integer> res = new HashSet<>();
        for (Integer integer : set1) {
            if (set2.contains(integer)) {
                res.add(integer);
                
            }
        }

       
        return res;
    }
}