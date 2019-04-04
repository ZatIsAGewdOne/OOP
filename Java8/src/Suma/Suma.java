package Suma;

public class Suma {
    private int firstValue;
    private int secondValue;

    protected Suma(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    protected Suma() {
        this.firstValue = 0;
        this.secondValue = 0;
    }

    private int add(int a, int b) {
        return a+b;
    }

    @Override
    public String toString() {
        return firstValue + " + " + secondValue + " = " + add(firstValue, secondValue);
    }
}
