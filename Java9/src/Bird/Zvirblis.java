package Bird;

public class Zvirblis extends Bird {

    public Zvirblis() {
        super("Black and yellow");
    }

    @Override
    public String getName() {
        return "Zvirblis";
    }

    @Override
    public int getAge() {
        return 3;
    }

    @Override
    public double getWeight() {
        return 2.5;
    }
}
