package People;

public class Student extends People {
    private int course;
    private String study;

    public Student(String name, String lastName, int age, int course, String study) {
        super(name, lastName, age);
        this.course = course;
        this.study = study;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Last name: " + getLastName() + " Age: " + getAge() + " Course: " + this.course + " Chosen course: " + this.study;
    }
}
