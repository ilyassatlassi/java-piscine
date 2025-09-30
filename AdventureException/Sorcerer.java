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
    public void heal(Character obj) {
        obj.setCurrentHealth(healCapacity);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + this.healCapacity + " HP."+ " He has the weapon " + this.getWeapon().toString() ;
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + getHealCapacity()
                + " HP."+ " He has the weapon " + this.getWeapon().toString() ;
    }

    @Override
    public void attack(Character par) {
        this.heal(this);
        if (this.getWeapon() != null) {
            par.takeDamage(this.getWeapon().getDamage());
            return;
        }
        par.takeDamage(10);
    }

    @Override
    public void takeDamage(int par) {
        setCurrentHealth(-par);
        // if (currentHealth < 0) {
        // currentHealth = 0;
        // }
    }
}
