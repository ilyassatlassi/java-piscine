public class DoOp {
    public static String operate(String[] args) {
        // your code here
        if (args.length != 3) {
            return "Error";
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        if (args[1] == "+") {
            return String.valueOf(num1 + num2);
        } else if (args[1] == "-") {

            return String.valueOf(num1 - num2);
        } else if (args[1] == "*") {

            return String.valueOf(num1 * num2);
        } else if (args[1] == "%") {
            if (num2 == 0) {
                return "Error";
            }

            return String.valueOf(num1 - num2);
        } else if (args[1] == "/") {

            return String.valueOf(num1 / num2);
        }
        return "Error";
    }
}