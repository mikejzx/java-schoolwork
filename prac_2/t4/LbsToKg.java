import java.util.Scanner;
/*
 * LbsToKg.java
 *
 * This program converts a user-inputted value in pounds (lbs)
 * to kilograms (kg)
 */
public class LbsToKg
{
    public static void main(String[] args)
    {
        // Prompt user
        System.out.println("Enter value in pounds (lbs):");

        // Get input
        Scanner sc = new Scanner(System.in);
        double lbs = sc.nextDouble();

        // Convert value
        double kg = 0.454 * lbs;

        // Print to screen
        System.out.printf("%.2f lbs = %.2f kg\n", lbs, kg);
    }
}
