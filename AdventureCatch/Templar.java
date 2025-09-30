public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character obj) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        obj.setCurrentHealth(healCapacity);
    }

    @Override
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " has been beaten, even with its " + this.shield + " shield. So bad, it could heal "
                    + this.healCapacity + " HP." + " He has the weapon " + this.getWeapon().toString();
        }

        return getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal "
                + this.healCapacity + " HP and has a shield of " + this.shield + "." + " He has the weapon "
                + this.getWeapon().toString();
    }

    @Override
    public void attack(Character par) throws DeadCharacterException {

        this.heal(this);
        if (this.getWeapon() != null) {
            par.takeDamage(this.getWeapon().getDamage());
            if (par.getCurrentHealth() == 0) {
                throw new DeadCharacterException(par);
            }
            return;
        }
        par.takeDamage(6);
        if (par.getCurrentHealth() == 0) {
            throw new DeadCharacterException(par);
        }
    }

    @Override
    public void takeDamage(int par) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        setCurrentHealth(-par + this.shield);
        // if (currentHealth < 0) {
        // currentHealth = 0;
        // }
    }

}
