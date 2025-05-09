class Temp {
    private double celsius;

    public Temp(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}

public class encap4{
    public static void main(String[] args) {
        Temp temp = new Temp(78);
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Fahrenheit: " + temp.getFahrenheit());

        temp.setCelsius(24);
        System.out.println("Updated Celsius: " + temp.getCelsius());
        System.out.println("Updated Fahrenheit: " + temp.getFahrenheit());
    }
}
