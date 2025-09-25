public class Digitlen {
    public static int digitlen(long number) {
        // your code here
        int count = 1;
        if (number < 0) {
           number = -number; 
        }
        while (number >= 10) {
            number /= 10;
            count++;
        }
        return count;
    }
}