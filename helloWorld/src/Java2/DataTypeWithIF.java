package Java2;

public class DataTypeWithIF {
    public static void main(String[] args) {
        Double number = 5.5;
        checkType(number);

        String str = "Greetings!";
        checkType(str);
    }

    private static void checkType(Object variable) {
        if (variable instanceof Integer) {
            System.out.println("Value is an integer");
        } else if(variable instanceof Double) {
            System.out.println("Value is a double");
        } else if(variable instanceof String) {
            System.out.println("Value is a string");
        }
    }
}
