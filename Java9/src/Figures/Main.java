package Figures;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("Square: \n" + square.print());
        System.out.println("---------");
        System.out.println("Rectangle: \n" + rectangle.print());
        System.out.println("---------");
        System.out.println("Triangle: \n" + triangle.print());
    }
}
