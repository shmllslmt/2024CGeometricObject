public class ComparableRectangle extends Rectangle implements Comparable {
    public ComparableRectangle(double length, double width) {
        super(length, width);
    }
    @Override
    public int compareTo(Object o) {
        Rectangle compareObject = (Rectangle) o;

        if(this.getArea() > compareObject.getArea())
            return 1;
        else if(this.getArea() < compareObject.getArea())
            return -1;
        else
            return 0;
    }
}
