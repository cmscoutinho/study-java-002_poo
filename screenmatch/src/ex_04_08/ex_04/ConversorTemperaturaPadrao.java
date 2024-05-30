package ex_04_08.ex_04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return 1.8 * celsius + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        System.out.println("%.2f C = %.2f F".formatted(28.0, conversor.celsiusParaFahrenheit(28.0)));
        System.out.println("%.2f F = %.2f C".formatted(96.0, conversor.fahrenheitParaCelsius(96.0)));
    }
}
