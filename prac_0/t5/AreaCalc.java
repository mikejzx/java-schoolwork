import java.util.Scanner;

/*
 * AreaCalc.java
 *
 * This class calculates the area of a circle
 * given the radius.
 */
public class AreaCalc
{
    public static void main(String[] args)
    {
        // Create input scanner
        Scanner s = new Scanner(System.in);

        // Get radius input
        // System.out.println("Please enter radius of circle in centimetres:");
        // double radius = s.nextDouble();
        double radius = getDoubleInput(s, "Please enter radius of circle in centimetres:\n > ");

        // Convert to metres
        double radiusMetres = radius / 100.0f;

        // Calculate area:
        double area = Math.PI * radiusMetres * radiusMetres;

        // Output to screen
        System.out.printf("Radius in centimetres is %.2f\n", radius);
        System.out.printf("Radius in metres is %.2f\n", radiusMetres);
        System.out.printf("Area of circle with radius %.2f m is %.2f m^2\n", radiusMetres, area);
    }

    /*
     * Gets double input safely, with error handling.
     */
    public static double getDoubleInput(Scanner sc, String prompt)
    {
        double inp = 0.0;
        while(true)
        {
            System.out.print(prompt);
            try
            {
                inp = sc.nextDouble();
                if (inp <= 0.0)
                {
                    System.out.println("Error: Radius must be greater than 0");
                    sc.nextLine();
                    continue;
                }
                return inp;
            }
            catch (Exception e)
            {
                System.out.println("Error: Invalid input");
                sc.nextLine();
            }
        }
    }
}
