import java.util.Scanner;
public class SalesTax
{    
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        double stateSalesTax = 0.04, countySalesTax = 0.02, itemCost, total;

        System.out.println("Enter the Item Cost: ");
        itemCost = console.nextDouble();
        total = itemCost + (itemCost * stateSalesTax) + (itemCost * countySalesTax);
        System.out.println("Item Cost: $" + itemCost + "\nState Sales Tax: " + stateSalesTax + "%\nCounty Sales Tax: " + countySalesTax + "%\nTotal: $" + total);

        console.close();
        
    }
}