public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character obj) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            System.out.println("test");
            throw new DeadCharacterException(this);
        }
        System.out.println("test1");
        obj.setCurrentHealth(healCapacity);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + this.healCapacity + " HP."
                    + " He has the weapon " + this.getWeapon().toString();
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity()
                + " HP." + " He has the weapon " + this.getWeapon().toString();
    }

    @Override
    public void attack(Character par) throws DeadCharacterException {
        // if (par.getCurrentHealth() == 0) {
        // throw new DeadCharacterException(par);
        // }
        this.heal(this);
        if (this.getWeapon() != null) {
            par.takeDamage(this.getWeapon().getDamage());
            if (par.getCurrentHealth() == 0) {
                throw new DeadCharacterException(par);
            }
            return;
        }
        par.takeDamage(10);
        if (par.getCurrentHealth() == 0) {
            throw new DeadCharacterException(par);
        }
    }

    @Override
    public void takeDamage(int par) throws DeadCharacterException {
        if (this.getCurrentHealth() == 0) {
            throw new DeadCharacterException(this);
        }
        setCurrentHealth(-par);
        // if (currentHealth < 0) {
        // currentHealth = 0;
        // }
    }
}
