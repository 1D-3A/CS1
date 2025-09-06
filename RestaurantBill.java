import java.util.Scanner;
public class RestaurantBill 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        final double TAX = 0.0675, TIP = 0.2;
        double mealCost, taxAmount, tipAmount, totalCost;

        System.out.print("What is the meal cost?: $");
        mealCost = console.nextDouble();

        taxAmount = mealCost * TAX;
        tipAmount = (mealCost + taxAmount) * TIP;
        totalCost = mealCost + taxAmount + tipAmount;

        System.out.printf("\nMeal Cost: $%.2f\nTax: $%.2f\nTip: $%.2f\nTotal: $%.2f\n", mealCost, taxAmount, tipAmount, totalCost);

        console.close();

    }
}
