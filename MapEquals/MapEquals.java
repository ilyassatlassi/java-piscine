import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        // your code here
        if (map1.size() != map2.size()) {
            return false;
        }
        for (String key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                return false;
            }
            if (!map2.get(key).equals(map1.get(key))) {
                return false;
            }
        }
        return true;

    }
}