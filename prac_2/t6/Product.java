import java.util.Scanner;

/*
 * Product.java
 *
 * This class prompts a user to enter 2 numbers, and display the product
 * of those numbers.
 */
public class Product
{
    public static void main(String[] args)
    {
        // Get input
        Scanner sc = new Scanner(System.in);
        int i1 = getIntInput(sc, "Enter an integer:");
        int i2 = getIntInput(sc, "Enter another integer:");

        // Compute product
        int prod = i1 * i2;

        // Output
        System.out.printf("You have entered the numbers %,d and %,d\n", i1, i2);
        System.out.printf("The product of %,d and %,d is %,d\n", i1, i2, prod);
    }

    /*
     * Gets int input safely, with error handling.
     */
    public static int getIntInput(Scanner sc, String prompt)
    {
        int inp = 0;
        while(true)
        {
            System.out.print(prompt + "\n> ");
            try
            {
                inp = sc.nextInt();
                return inp;
            }
            catch (Exception e)
            {
                System.out.println("Input must be an integer.");
                sc.nextLine();
            }
        }
    }
}
