
public class BubbleSort extends Sorter {
    @Override
    public void sort() {
        // bubble sort algorithm implementation
        int[] array = getArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        setArray(array);
    }
}