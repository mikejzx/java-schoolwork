import java.util.Scanner;

/*
 * This class calculates the Body Mass Index (BMI)
 * of a person, given their characteristics.
 */
public class BMI
{
    public static void main(String[] args)
    {
        // Constants
        final double CM_TO_M = 0.01;

        // Characteristics
        double weightKg = 81.9;
        double heightCm = 165;

        // Convert height to m
        double heightM = heightCm * CM_TO_M;

        // Calculate BMI
        double bmi = weightKg / Math.pow(heightM, 2);

        // Output
        System.out.println("A person with:");
        System.out.println(" weight of " + weightKg + " kg");
        System.out.println(" height of " + heightCm + " cm");
        System.out.println("Has a BMI of " + bmi);
    }
}
