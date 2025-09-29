public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a monster and is dead";
        }
        return getName() + " is a monster with " + getCurrentHealth() + " HP";
    }

    @Override
    public void attack(Character par) {
        par.takeDamage(7);
    }

    @Override
    public void takeDamage(int par) {
        
        setCurrentHealth( -(int) (par * 0.8));
        // if (currentHealth < 0) {
        // currentHealth = 0;
        // }
    }
}
