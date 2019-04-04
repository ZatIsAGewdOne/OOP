package Figure;

public class Figures {

    private Figure[] arr;

    public Figures(Figure[] arr) {
        this.arr = arr;
    }

    private int greatestArea(Figure[] arr) {
        if(Square.area(arr[0].getLength()) > Rectangle.area(arr[1].getLength(), arr[1].getWidth()) && Square.area(arr[0].getLength()) > Triangle.area(arr[2].getLength(),arr[2].getWidth())) {
            return Square.area(arr[0].getLength());
        } else if (Triangle.area(arr[2].getLength(),arr[2].getWidth()) > Square.area(arr[0].getLength())) {
            return Triangle.area(arr[2].getLength(),arr[2].getWidth());
        }

        return Rectangle.area(arr[1].getLength(), arr[1].getWidth());
    }

    private int greatestPerimeter(Figure[] arr) {

        if(Square.perimeter(arr[0].getLength()) > Rectangle.perimeter(arr[1].getLength(), arr[1].getWidth()) && Square.perimeter(arr[0].getLength()) > Triangle.perimeter(arr[2].getLength(),arr[2].getWidth(), arr[2].getDiagonal())) {
            return Square.area(arr[0].getLength());
        } else if (Triangle.perimeter(arr[2].getLength(),arr[2].getWidth(), arr[2].getDiagonal()) > Square.perimeter(arr[0].getLength())) {
            return Triangle.area(arr[2].getLength(),arr[2].getWidth());
        }

        return Rectangle.perimeter(arr[1].getLength(), arr[1].getWidth());
    }

    private int greatestLength(Figure[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].getLength()) {
                max = arr[i].getLength();
            }

            if(max < arr[i].getWidth()) {
                max = arr[i].getWidth();
            }

            if(max < arr[i].getDiagonal()) {
                max = arr[i].getDiagonal();
            }
        }

        return max;
    }

    @Override
    public String toString() {
        return "Square: " + arr[0].toString() +
                "\nRectangle: " + arr[1].toString() +
                "\nTriangle: " + arr[2].toString() +
                "\nGreatest area is " + greatestArea(arr) +
                "\nGreatest perimeter is " + greatestPerimeter(arr) +
                "\nGreatest length is " + greatestLength(arr);
    }
}
