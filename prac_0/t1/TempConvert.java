/*
 * TempConvert.java
 *
 * This program converts the temperature of
 * 100 F to Celsius.
 *
 * The formula used is as follows:
 * C = (F - 32) * 5 / 9
 */
public class TempConvert
{
    public static void main(String[] args)
    {
        // The temperature we want to convert, in Fahrenheit
        final double FAHRENHEIT = 100.0;

        // Calculate Celsius using formula.
        double tempCelsius = (FAHRENHEIT - 32.0) * 5.0 / 9.0;

        // Print to screen.
        System.out.printf("%.2f F = %.2f C\n", FAHRENHEIT, tempCelsius);
    }
}
