package Figure;

public class Figure {

    private int length;
    private int width;
    private int diagonal;

    public Figure(int length) {
        this.length = length;
    }

    public Figure(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return 0;
    }

    public int perimeter() {
        return 0;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getDiagonal() {
        return diagonal;
    }

}
