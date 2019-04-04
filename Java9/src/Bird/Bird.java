package Bird;

public abstract class Bird {

    private String color;

    public Bird(String color) {
        this.color = color;
    }

    public abstract String getName();
    public abstract int getAge();
    public abstract double getWeight();

    public String toString() {
        return "Name = " + getName() + "\nAge = " + getAge() + "\nWeight = " + getWeight();
    }
}
