import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        super();
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super.name = name;
        super.x = x;
        super.y = y;
        super.z = z;
        this.magnitude = magnitude;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude",
                name, this.magnitude);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Star other = (Star) obj; // cast safely
        if (Double.compare(this.x, other.x) != 0)
            return false;
        if (Double.compare(this.y, other.y) != 0)
            return false;
        if (Double.compare(this.z, other.z) != 0)
            return false;
        if (Double.compare(this.magnitude, other.magnitude) != 0)
            return false;
        if (this.name == null && other.name != null)
            return false;
        if (this.name != null && !this.name.equals(other.name))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z, magnitude);
    }
}
