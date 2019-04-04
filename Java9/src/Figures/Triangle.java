package Figures;

public class Triangle implements Methods{

    private int length;
    private int width;
    private int diagonal;

    public Triangle(int length, int width, int diagonal) {
        this.length = length;
        this.width = width;
        this.diagonal = diagonal;
    }

    public int perimeter() {
        return this.diagonal + this.length + this.width;
    }

    public double area() {
        return (this.length * this.width) / 2;
    }

    @Override
    public String print() {
        return "Perimeter = " + perimeter() + "\nArea = " + area();
    }
}
