import java.util.Scanner;

/*
 * Area.java
 *
 * This class prompts user for a radius (cm) and produces the area in m^2
 */
public class Area
{
    public static void main(String[] args)
    {
        // Get input
        Scanner sc = new Scanner(System.in);
        double radius = getDoubleInput(sc, "Enter radius (cm):");

        // Compute area using metres
        radius /= 100.0;
        double area = Math.PI * radius * radius;

        // Output
        System.out.printf("Radius in metres: %.1f\n", radius);
        System.out.printf("Area of circle with radius %.1fm is: %.1fm^2\n",
            radius, area);
    }

    /*
     * Gets double input safely, with error handling.
     */
    public static double getDoubleInput(Scanner sc, String prompt)
    {
        double inp = 0.0;
        while(true)
        {
            System.out.print(prompt + "\n> ");
            try
            {
                inp = sc.nextDouble();
                if (inp < 0.0)
                {
                    System.out.println("Must be at least 0");
                    sc.nextLine();
                    continue;
                }
                return inp;
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
    }
}
