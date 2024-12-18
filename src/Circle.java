public class Circle extends GeometricObject {
    private double radius;

    protected Circle() {
        this(10);
    }

    protected Circle(double radius) {
        super();
        this.radius = radius;
    }
    protected Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Radius: " + radius + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimeter: " + getPerimeter() + "\n";
    }
}
