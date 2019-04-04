package People;

public class Employee extends People {
    private int experience;
    private String profession;

    public Employee(String name, String lastName, int age, int experience, String profession) {
        super(name, lastName, age);
        this.experience = experience;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Last name: " + getLastName() + " Age: " + getAge() + " Experience: " + this.experience + " Chosen profession: " + this.profession;
    }
}
