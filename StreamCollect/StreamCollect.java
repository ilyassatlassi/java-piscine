import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        // your code hereo
        // Map<Character, List<String>> res = new HashMap<>();

        // s.forEach(word -> {
        // Character key = Character.toLowerCase(word.charAt(0));
        // if (res.containsKey(key)) {
        // res.get(key).add(word);
        // } else {
        // List<String> list = new ArrayList<>();
        // list.add(word);
        // res.put(key, list);
        // }
        // });
        // return res;
        return s.collect(Collectors.groupingBy(
                word -> Character.toUpperCase(word.charAt(0))));
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        // your code here
        return s.collect(Collectors.groupingBy(
                n -> n % 4,
                Collectors.maxBy(Integer::compareTo)));
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        // your code here
        return s.sorted().collect(Collectors.joining(" # ", "{", "}"));
    }
}