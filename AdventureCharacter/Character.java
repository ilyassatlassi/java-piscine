public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealth) {
        this.maxHealth = maxHealth;
        this.name = name;
        this.currentHealth = maxHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
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

    public void takeDamage(int par) {
        currentHealth -= par;
        if (currentHealth < 0) {
            currentHealth = 0;
        }

        // if (currentHealth == 0) {
        //     return;
        // }
        // if (condition) {

        // }
        // currentHealth -= par;
    }

    public void attack(Character par) {
        par.takeDamage(9);
    }
}