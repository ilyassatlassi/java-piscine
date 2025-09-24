import java.util.Objects;

public class CelestialObject {
    static double KM_IN_ONE_AU = 1.5E8;
    public double x;
    public double y;
    public double z;
    public String name;

    public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double dz = b.z - a.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {
        return getDistanceBetween(a, b) * KM_IN_ONE_AU;
    }

    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)",
                name, x, y, z);
    }

    public boolean equals(CelestialObject other) {
        if (this == other)
            return true; // same reference
        if (other == null || getClass() != other.getClass())
            return false;

        if (Double.compare(this.x, other.x) != 0)
            return false;
        if (Double.compare(this.y, other.y) != 0)
            return false;
        if (Double.compare(this.z, other.z) != 0)
            return false;

        if (this.name == null && other.name != null)
            return false;
        if (this.name != null && !this.name.equals(other.name))
            return false;

        return true;
    }

    public int hashCode() {
        return Objects.hash(name, x, y, z);
    }

    public CelestialObject() {
        this("Soleil", 0, 0, 0);
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
