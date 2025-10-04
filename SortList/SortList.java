import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        // your code here
        if (list == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>(list);

        Collections.sort(result);
        return result;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        // your code here
        if (list == null) {
            return null;
        }
        List<Integer> result = new ArrayList<>(list);

        Collections.sort(result, Collections.reverseOrder());
        return result;
    }
}