
import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        // your code here
        if (list == null) {
            return null;
        }
        //  list.lastIndexOf(value);

        Integer res =  list.lastIndexOf(value);
        if (res == -1) {
           return null ;
        }
        return res;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        // your code here
        if (list == null) {
            return null;
        }
        Integer res =  list.indexOf(value);
        if (res == -1) {
           return null ;
        }
        return res;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> indexes = new ArrayList<>();
        if (list == null) {
           return indexes; 
        }
        // your code here
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                indexes.add(i);
            }
        }
        return indexes;

    }
}