package Figures;

public interface Methods {

    double area();
    int perimeter();
    default String print() {
        return "Perimeter = " + perimeter() + "\nArea = " + area();
    }
}
