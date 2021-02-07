import java.util.Scanner;
/*
 * TempConvert.java
 *
 * This program converts the temperature
 * given by user from Fahrenheit to Celsius.
 *
 * The formula used is as follows:
 * C = (F - 32) * 5 / 9
 */
public class TempConvert
{
    public static void main(String[] args)
    {
        // Read temperature from user
        System.out.println("Enter temperature in Fahrenheit:");
        Scanner sc = new Scanner(System.in);
        double tempFahrenheit = sc.nextDouble();

        // Calculate Celsius using formula.
        double tempCelsius = (tempFahrenheit - 32.0) * 5.0 / 9.0;

        // Print to screen.
        System.out.printf("%.2f F = %.2f C\n", tempFahrenheit, tempCelsius);
    }
}
