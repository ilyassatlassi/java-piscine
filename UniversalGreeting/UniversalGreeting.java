public class UniversalGreeting {
    public static String greeting(String message) {
        if (message == "EN") {
            return "Hello, How are you?";
        } else if (message == "FR") {
            return "Bonjour comment allez-vous?";
        } else if (message == "ES") {
            return "Hola, cómo estás?";
        }
        return "";

    }
}