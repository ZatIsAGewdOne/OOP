package Temperature;

public class Month {

    private String month;
    private double[] temperatures;

    public Month(String month, double[] temperatures) {
        this.month = month;
        this.temperatures = temperatures;
    }

    public String getMonth() {
        return month;
    }

    public double calcSum() {
        double sum = 0d;
        if (temperatures != null) {
            for(double temperature: temperatures) {
                sum += temperature;
            }
        }

        return sum;
    }

    public double calcAvg() {
        return calcSum() / temperatures.length;
    }

    @Override
    public String toString() {
        return getMonth() + " " + calcAvg();
    }
}
