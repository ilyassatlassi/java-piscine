public class SortArgs {
    public static void sort(String[] args) {
        // your code here
        // String[] sortedArray = new String[args.length];
        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i +1; j < args.length; j++) {
                if (Integer.parseInt(args[i]) > Integer.parseInt(args[j])) {
                    String tmp = args[i];
                    args[i] = args[j];
                    args[j] = tmp;
                }
            }
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (args.length - 1 != i) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}