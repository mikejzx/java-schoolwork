import java.util.Scanner;
/*
 * VolumeCalc.java
 *
 * This program computes the volume of a cylinder
 * from a radius and length read from user.
 *
 * A = radius * Pi
 * V = A * length
 */
public class VolumeCalc
{
    public static void main(String[] args)
    {
        // Set up input
        Scanner sc = new Scanner(System.in);

        // Read radius and length
        System.out.println("Enter radius of cylinder:");
        double radius = sc.nextDouble();
        System.out.println("Enter length of cylinder:");
        double length = sc.nextDouble();

        // Find area
        double a = radius * Math.PI;

        // Calculate volume
        double v = a * length;

        // Output to console
        System.out.printf("Volume of cylinder: %.2f cm^2\n", v);
    }
}
