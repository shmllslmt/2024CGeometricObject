public abstract class GeometricObject {
    private String color;
    private boolean filled;

    protected GeometricObject() {
        this("White", true);
    }
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    // abstract methods
    // must have abstract keyword
    // must not have implementation / body
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return  "Color: " + color + "\n" +
                "Filled: " + filled + "\n";
    }
}
