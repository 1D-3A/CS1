// Sean Fournier
// 10 February 2025
// Determines the discount on a software purchase based on quantity

import java.util.Scanner;
public class SoftwareSales 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int quantity;
        double discount, total;
        
        System.out.print("Enter the number of packages purchased: ");
        quantity = console.nextInt();
        
        if (quantity < 10)
            discount = 0;
        else if (quantity < 20)
            discount = 0.2;
        else if (quantity < 50)
            discount = 0.3;
        else if (quantity < 100)
            discount = 0.4;
        else
            discount = 0.5;
        
        total = quantity * 99 * (1 - discount);
        
        System.out.printf("Discount: %.0f%%\n", discount * 100);
        System.out.printf("Total: $%.2f\n", total);
        
        console.close();
    }
}
