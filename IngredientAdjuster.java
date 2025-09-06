// Sean Fournier
// 02 February 2025
// Adjusts the amount of ingredients needed for a cookie recipe based on the number of cookies

import java.util.Scanner;
public class IngredientAdjuster 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        final double SUGAR = 1.5, BUTTER = 1, FLOUR = 2.75, COOKIES = 48;
        double sugar, butter, flour, cookies;

        System.out.print("Enter the number of cookies you want to make: ");
        cookies = console.nextDouble();

        sugar = (cookies / COOKIES) * SUGAR;
        butter = (cookies / COOKIES) * BUTTER;
        flour = (cookies / COOKIES) * FLOUR;

        System.out.println("To make " + cookies + " cookies, you will need:");
        System.out.printf(" - %.2f cups of sugar", sugar);
        System.out.printf("\n - %.2f cups of butter", butter);
        System.out.printf("\n - %.2f cups of flour",  flour);

        console.close();

    }
}
