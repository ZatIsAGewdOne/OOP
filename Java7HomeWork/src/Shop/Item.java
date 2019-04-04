package Shop;

public class Item {
    private int indexNumber;
    private String name;
    private double price;

    public Item(int indexNumber, String name, double price) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.price = price;
    }

    public Item() {
        this.indexNumber = 0;
        this.name = "";
        this.price = 0d;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
