package Figure;

public class Square extends Figure {

    public Square(int length) {
        super(length);
    }

    public static int area(int length) {
        return length * length;
    }

    public static int perimeter(int length) {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Perimeter is " + perimeter(super.getLength()) + ", Area is " + area(super.getLength());
    }
}
