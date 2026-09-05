public class TemperatureConverter {

    // Converts Celsius to Fahrenheit: (C * 9/5) + 32
    public double celsiusToFahrenheit(double c) {
        return (c * 9 / 5.0) + 32;
    }

    // Converts Fahrenheit to Celsius: (F - 32) * 5/9
    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9.0;
    }

    // Converts Celsius to Kelvin: C + 273.15
    public double celsiusToKelvin(double c) {
        return c + 273.15;
    }
}