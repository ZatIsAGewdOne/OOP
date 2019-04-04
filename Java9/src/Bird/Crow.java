package Bird;

public class Crow extends Bird {

    public Crow() {
        super("Black");
    }

    @Override
    public String getName() {
        return "Crow";
    }

    @Override
    public int getAge() {
        return 2;
    }

    @Override
    public double getWeight() {
        return 5.5;
    }
}
