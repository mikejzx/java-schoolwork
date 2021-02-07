/*
 * VolumeCalc.java
 *
 * This program computes the volume of a radius
 * with a 4cm radius, and length of 40cm, using
 * the below formula:
 *
 * A = radius * Pi
 * V = A * length
 */
public class VolumeCalc
{
    public static void main(String[] args)
    {
        // Radius and length of cylinder
        final double RADIUS = 4.0,
            LENGTH = 40.0;

        // Find area
        double a = RADIUS * Math.PI;

        // Calculate volume
        double v = a * LENGTH;

        // Output to console
        System.out.printf("Volume of cylinder: %.2f cm^2\n", v);
    }
}
