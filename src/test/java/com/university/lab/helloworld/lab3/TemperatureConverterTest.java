import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();
    private final double DELTA = 0.01; // Tolerance for floating-point comparison

    @Test
    public void testKnownPairs() {
        // Verify 0°C -> 32°F
        assertEquals(32.0, converter.celsiusToFahrenheit(0), DELTA);
        
        // Verify 100°C -> 212°F
        assertEquals(212.0, converter.celsiusToFahrenheit(100), DELTA);
        
        // Verify 0°C -> 273.15 K
        assertEquals(273.15, converter.celsiusToKelvin(0), DELTA);
    }

    @Test
    public void testRoundTripConversion() {
        double originalCelsius = 25.0;
        
        // Convert C -> F -> C
        double fahrenheit = converter.celsiusToFahrenheit(originalCelsius);
        double convertedBackCelsius = converter.fahrenheitToCelsius(fahrenheit);
        
        // Verify round-trip accuracy
        assertEquals(originalCelsius, convertedBackCelsius, DELTA);
    }
}