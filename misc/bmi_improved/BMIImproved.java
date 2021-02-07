import java.util.Scanner;

/*
 * This class calculates the Body Mass Index (BMI)
 * of a person, given their characteristics.
 */
public class BMIImproved
{
    public static void main(String[] args)
    {
        // Constants
        final double CM_TO_M = 0.01;

        // Set up input stream
        Scanner sc = new Scanner(System.in);

        // Characteristics
        System.out.println("Enter your weight in kg:");
        double weightKg = sc.nextDouble();
        System.out.println("Enter your height in cm:");
        double heightCm = sc.nextDouble();

        // Convert height to m
        double heightM = heightCm * CM_TO_M;

        // Calculate BMI
        double bmi = weightKg / Math.pow(heightM, 2);

        // Output
        System.out.println("Your BMI is " + bmi);
    }
}
