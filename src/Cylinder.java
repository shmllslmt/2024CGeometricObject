public class Cylinder extends Circle {
    private double height;

    protected Cylinder() {
        this(15);
    }
    protected Cylinder(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Height: " + height + "\n" +
                "Volume: " + getVolume() + "\n";
    }
}
