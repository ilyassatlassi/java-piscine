public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        // your code here
        switch (chifoumiAction) {
            case ROCK:
                return ChifoumiAction.SCISSOR;

            case SCISSOR:

                return ChifoumiAction.PAPER;
            default:

                return ChifoumiAction.ROCK;
        }
    }
}