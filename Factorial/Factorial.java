public class Factorial {
    public static Integer factorial(Integer n) {
        // your code here
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}