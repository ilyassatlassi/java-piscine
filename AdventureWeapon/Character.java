import java.util.ArrayList;
import java.util.List;

abstract public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    private Weapon weapon;

    public Character(String name, int maxHealth, Weapon weapon) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
        this.weapon = weapon;
        allCharacters.add(this);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    protected void setCurrentHealth(int in) {
        if (in + this.currentHealth > maxHealth) {

            this.currentHealth += (in + this.currentHealth - maxHealth);
            return;
        }
        this.currentHealth += in;
        if (currentHealth < 0) {
            // currentHealth -= in;
            currentHealth = 0;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " : KO";
        }
        return getName() + " : " + getCurrentHealth() + "/" + getMaxHealth();
    }

    abstract public void takeDamage(int par);
    // currentHealth -= par;
    // if (currentHealth < 0) {
    // currentHealth = 0;
    // }

    abstract public void attack(Character par);
    // par.takeDamage(9);

    public static String printStatus() {
        if (allCharacters.isEmpty()) {
            return "------------------------------------------\n" +
                    "Nobody's fighting right now !\n" +
                    "------------------------------------------\n";

        }
        StringBuilder res = new StringBuilder();
        res.append("------------------------------------------\n");

        res.append("Characters currently fighting :\n");

        for (Character character : allCharacters) {
            res.append(" - " + character.toString() + "\n");
        }

        res.append("------------------------------------------\n");
        return res.toString();
    }

    public static Character fight(Character obj1, Character obj2) {
        while (obj1.currentHealth != 0 && obj2.currentHealth != 0) {
            obj1.attack(obj2);
            if (obj2.currentHealth == 0)
                break;
            obj2.attack(obj1);
        }
        if (obj1.currentHealth == 0) {
            return obj2;
        }
        return obj1;
    }
}