package Figure;

public class Triangle extends Figure {
    private int diagonal;

    public Triangle(int length, int width, int diagonal) {
        super(length, width);
        this.diagonal = diagonal;
    }

    public static int perimeter(int length, int width, int diagonal) {
        return length + width + diagonal;
    }

    public static int area(int length, int width) {
        return (length * width) / 2;
    }

    @Override
    public String toString() {
        return "Perimeter is " + perimeter(super.getLength(), super.getWidth(), diagonal) + ", Area is " + area(super.getLength(), super.getWidth());
    }

    @Override
    public int getDiagonal() {
        return diagonal;
    }
}
