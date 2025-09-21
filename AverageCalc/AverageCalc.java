public class AverageCalc {
    public static int average(int start, int end, int step) {
        int count = 0;
        int acc = 0;
        if (step > 0) {
            for (int i = start; i <= end; i += step) {
                acc += i;
                count++;
            }
        } else {

            for (int i = start; i >= end; i += step) {
                acc += i;
                count++;
            }
        }
        if (count == 0) {
           return 0; 
        }
        return acc / count;
    }
}