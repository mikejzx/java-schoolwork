/*
 * LbsToKg.java
 *
 * This program converts 7.5 pounds (lbs) to kilograms (kg).
 */
public class LbsToKg
{
    public static void main(String[] args)
    {
        // Weigth to convert
        final double LBS = 7.5;

        // Converted value
        double kg = 0.454 * LBS;

        // Print to screen
        System.out.printf("%.2f lbs = %.2f kg\n", LBS, kg);
    }
}
