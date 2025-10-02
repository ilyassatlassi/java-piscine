public class HarmoniousFusion {
    public int[] merge(int[] arr1, int[] arr2) {
        int arrLength = arr1.length + arr2.length;
        int[] res = new int[arrLength];
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[i + j] = arr1[i];
                i++;
            } else {
                res[i + j] = arr2[j];
                j++;
            }
        }
        while (i < arr1.length) {
            System.out.println(i);
            System.out.println(j);
            res[i + j] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            res[i + j] = arr2[j];
            j++;
        }
        return res;
    }
}