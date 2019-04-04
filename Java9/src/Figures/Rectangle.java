package Figures;

public class Rectangle implements Methods {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int perimeter() {
        return (this.length + this.width) * 2;
    }

    public double area() {
        return this.length * this.width;
    }

    @Override
    public String print() {
        return "Perimeter = " + perimeter() + "\nArea = " + area();
    }
}
