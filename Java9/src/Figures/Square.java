package Figures;

public class Square implements Methods{

    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int perimeter() {
        return this.length * 4;
    }

    public double area() {
        return this.length * this.length;
    }

    public String print() {
        return "Perimeter = " + perimeter() + "\nArea = " + area();
    }
}
