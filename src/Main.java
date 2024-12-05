public class Main {
    public static void main(String[] args) {
        GeometricObject object = new Circle(7);
        System.out.println(object);

        // explicit casting whenever supertype is assigned to a subtype object
        Circle circ = (Circle)object;
        System.out.println(circ);

        // not compulsory to explicit casting whenever subtype is assigned to a supertype object
        GeometricObject geoobject = circ;

        Cylinder cyl = new Cylinder(100);
        System.out.println(cyl);
    }
}