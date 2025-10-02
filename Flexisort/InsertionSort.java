import java.util.Arrays;

public class InsertionSort extends Sorter {
    @Override
    public void sort() {
        // insertion sort algorithm implementation
        int[] array = getArray();
        // Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            int prev = i - 1;

            while (prev >= 0 && array[prev] > array[i]) {
                int tmp = array[i];
                array[i] = array[prev];
                array[prev] = tmp;
                i--;
                prev--;
            }
        }
        setArray(array);
    }
}