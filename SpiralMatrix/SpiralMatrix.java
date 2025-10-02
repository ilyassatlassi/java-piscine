public class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        // Implementation to generate a spiral matrix
        int[][] res = new int[n][n];
        int top = 0;
        int rigth = n - 1;
        int bottom = n - 1;
        int left = 0;
        int num = 1;
        int target = n * n;
        while (num <= target) {
            System.out.println(num);
            for (int i = top; i <= rigth; i++) {
                res[top][i] = num;
                num++;
            }
            if (num > target) {
                break;
            }
            for (int i = top + 1; i <= bottom; i++) {
                res[i][rigth] = num;
                num++;
            }

            if (num > target) {
                break;
            }
            for (int i = rigth - 1; i >= left; i--) {
                res[bottom][i] = num;
                num++;
            }

            if (num > target) {
                break;
            }
            for (int i = bottom - 1; i > top; i--) {
                res[i][left] = num;
                num++;
            }

            top++;
            rigth--;
            bottom--;
            left++;

        }
        return res;

    }
}