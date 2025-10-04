import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        // your code here
        Map<String, String> res = new HashMap<>();
    

        Iterator<String> it1 = first.iterator();
        Iterator<String> it2 = second.iterator();

        while (it1.hasNext() && it2.hasNext()) {
        res.put(it1.next(), it2.next());
        }
        return res;

    }
}