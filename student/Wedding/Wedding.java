import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        // your code here
        Map<String, String> res = new HashMap<>();
        for (String string : first) {
            for (String string2 : second) {

                if (res.size() == first.size()) {
                    break;
                }
                res.put(string, string2);
                break;
            }
            if (res.size() == second.size()) {
                break;
            }
        }

        // Iterator<String> it1 = first.iterator();
        // Iterator<String> it2 = second.iterator();

        // while (it1.hasNext() && it2.hasNext()) {
        // res.put(it1.next(), it2.next());
        // }
        return res;

    }
}