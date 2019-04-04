package Figure;

public class Rectangle extends Figure {

    private int width;

    public Rectangle(int length, int width) {
        super(length);
        this.width = width;
    }


    public static int perimeter(int length, int width) {
        return length * 2 + width * 2;
    }

    public static int area(int length, int width) {
        return length * width;
    }

    @Override
    public String toString() {
        return "Perimeter is " + perimeter(super.getLength(), width) + ", Area is " + area(super.getLength(), width);
    }

    @Override
    public int getWidth() {
        return width;
    }

}
