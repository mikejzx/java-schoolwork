import java.util.Scanner;

/*
 * Payroll.java
 *
 * This class asks the user for an employee's information, and produces payroll
 * information about them, including total earnings before/after tax.
 *
 * The program asks for:
 * + Employee's full name
 * + Number of hours worked
 * + Hourly pay rate
 * + Tax withholding
 */
public class Payroll
{
    public static void main(String[] args)
    {
        // Set up some constants we will use.
        final String RESULTS_LINE = "========================================\n";

        // Print a fancy header
        System.out.println("== EMPLOYEE PAYROLL ==");

        // Set up input stream
        Scanner sc = new Scanner(System.in);

        // Get employee name
        System.out.print("Enter employee name:\n> ");
        String eName = sc.nextLine();

        // And ask for numeric info.
        double eHoursWorked = getDoubleInput(sc, "Enter hours worked:");
        double ePayRate = getDoubleInput(sc, "Enter pay rate ($/hour):");
        double eTaxPercent = getDoubleInput(sc, "Enter withholding tax (%):");

        // Calculate total earnings, before and after tax.
        double earnings = ePayRate * eHoursWorked;
        double earningsTaxed = earnings * (100 - eTaxPercent) / 100.0;
        double tax = earningsTaxed - earnings;

        // And output all the information we gathered
        System.out.println(String.format(
            RESULTS_LINE +
            "  EMPLOYEE INFO\n" +
            "* Name:            %s\n" +
            "* Hours worked:    %.1f hours\n" +
            "* Pay rate:      $ %.2f per hour\n" +
            "* Tax percent:   %% %.0f\n" +
            RESULTS_LINE +
            "  EARNINGS\n" +
            "* Earned:        $ %.2f\n" +
            "* Tax:           $ %.2f\n" +
            "* Total earned:  $ %.2f\n" +
            RESULTS_LINE,
            eName, eHoursWorked, ePayRate, eTaxPercent, earnings, tax, earningsTaxed
        ));
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
