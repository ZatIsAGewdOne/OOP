package Bird;

public class Kregzde extends Bird{

    public Kregzde() {
        super("Black and White");
    }

    @Override
    public String getName() {
        return "Kregzde";
    }

    @Override
    public int getAge() {
        return 3;
    }

    @Override
    public double getWeight() {
        return 4.5;
    }
}
