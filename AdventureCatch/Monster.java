public class Monster extends Character {
    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a monster and is dead. " + "He has the weapon " + this.getWeapon().toString();
        }
        return getName() + " is a monster with " + getCurrentHealth() + " HP" + ". He has the weapon "
                + this.getWeapon().toString();
    }

    @Override
    public void attack(Character par) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        if (this.getWeapon() != null) {
            par.takeDamage(this.getWeapon().getDamage());
            return;
        }
        par.takeDamage(7);
    }

    @Override
    public void takeDamage(int par) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        setCurrentHealth(-(int) (par * 0.8));
        // if (currentHealth < 0) {
        // currentHealth = 0;
        // }
    }
}
