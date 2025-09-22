public class ComputeArray {
    public static int[] computeArray(int[] array) {
        // your code here
        if (array == null) {
            return null;
        }
        int[] res = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int minOne = -1;
            int minTwo = -2;
            if (array[i] < -1) {
                minOne = 1;
                minTwo = 2;
                res[i] = array[i];
                // continue;
            }
            if (array[i] % 3 == 0) {
                res[i] = array[i] * 5;
            } else if ((array[i] + minOne) % 3 == 0) {
                res[i] = array[i] + 7;
            } else if ((array[i] + minTwo) % 3 == 0) {
                res[i] = array[i];
            }
        }
        return res;
    }
}