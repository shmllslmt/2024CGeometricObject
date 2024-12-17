public class Main {
    public static void main(String[] args) {
//        GeometricObject object = new Circle(7);
//        System.out.println(object);
//
//        // explicit casting whenever supertype is assigned to a subtype object
//        Circle circ = (Circle)object;
//        System.out.println(circ);
//
//        // not compulsory to explicit casting whenever subtype is assigned to a supertype object
//        GeometricObject geoobject = circ;
//
//        Cylinder cyl = new Cylinder(100);
//        System.out.println(cyl);
//
//        Rectangle rect = new Rectangle();
//        System.out.println(rect);

        ComparableRectangle mainRectangle = new ComparableRectangle(100, 100);
        ComparableRectangle subRectangle = new ComparableRectangle(75, 100);

        if(mainRectangle.compareTo(subRectangle) > 0)
            System.out.println("Main is bigger than sub");
        else if (mainRectangle.compareTo(subRectangle) < 0)
            System.out.println("Main is smaller than sub");
        else
            System.out.println("Main and sub is equal size");
    }
}