public class Rectangle extends GeometricObject{
    private double width;
    private double length;

    protected Rectangle() {
        this(5, 5);
    }
    protected Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return  (2 * length) + (2 * width);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Length: " + length + "\n" +
                "Width: " + width + "\n" +
                "Area: " + getArea() + "\n" +
                "Perimeter: " + getPerimeter() + "\n";
    }
}
