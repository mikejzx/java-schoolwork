import java.util.Scanner;
/*
 * FootToMetres.java
 *
 * This program converts user-inputted measurement
 * in feet to metres.
 */
public class FootToMetres
{
    public static void main(String[] args)
    {
        // Get user input in feet
        System.out.println("Enter measurement in feet:");
        Scanner sc = new Scanner(System.in);
        double feet = sc.nextDouble();

        // Convert to metres
        double metres = feet * 0.305;

        // Print to screen
        System.out.printf("%.2f ft = %.2f m\n", feet, metres);
    }
}
