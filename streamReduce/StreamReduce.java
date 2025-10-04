import java.util.stream.Stream;

public class StreamReduce {
    public static Integer sumAll(Stream<Integer> s) {
        // your code here
       return s.reduce(0, Integer::sum);
    }

    public static Integer divideAndAddElements(Stream<Integer> s, int divider) {
        // your code here

       return s.map(x -> x/ divider).reduce(0, Integer::sum);
    }
}