public class DeadCharacterException extends Exception {
    private final Character character;

    public DeadCharacterException(Character character) {
        super();
        this.character = character;
    }

    @Override
    public String getMessage() {
        String name;
        if (this.character instanceof Monster) {
            name = "monster";
        } else if (this.character instanceof Sorcerer) {

            name = "sorcerer";
        } else {

            name = "templar";
        }
        return "The " + name + " " + this.character.getName() + " is dead.";
    }
}
