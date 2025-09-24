import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centeStar) {
        super(name, x, y, z);
        this.centerStar = centeStar;
    }

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU",
                getName(), this.centerStar.getName(), CelestialObject.getDistanceBetween(this, this.centerStar));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        Planet other = (Planet) obj;
        return centerStar.equals(other.centerStar);
    }
   

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y, z, centerStar);
    }
}
