public interface Healer {
    void heal(Character obj) throws DeadCharacterException;

    int getHealCapacity();
}
