public class NextPrime {
    public static Integer nextPrime(Integer n) {
        // your code here

        // for (int i = n; i < n; i++) {
        // if (isPrime(i)) {
        // return i;
        // }
        // }
        n++;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    public static boolean isPrime(Integer n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
           return true; 
        }

        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < n/2; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
