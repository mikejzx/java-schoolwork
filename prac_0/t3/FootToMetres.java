/*
 * FootToMetres.java
 *
 * This program converts 6.2 feet into metres.
 */
public class FootToMetres
{
    public static void main(String[] args)
    {
        // Measurement to convert
        final double FEET = 6.2;

        // Converted value
        double metres = 0.305 * FEET;

        // Print to screen
        System.out.printf("%.2f ft = %.2f m\n", FEET, metres);
    }
}
