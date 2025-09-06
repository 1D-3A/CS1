// Sean Fourneir
// 20 March 2025
// Calculate retail price based off inputted wholesale cost and markup percent

import java.util.*;
public class RetailPriceCalculator {
    public static double priceCalculator(double wholesaleCost, double markupPercent) {
        return wholesaleCost * (1 + markupPercent / 100);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the wholesale cost: ");
        double wholesaleCost = console.nextDouble();
        System.out.print("Enter the markup percentage: ");
        double markupPercent = console.nextDouble();
        System.out.printf("The retail price is: $%.2f\n", priceCalculator(wholesaleCost, markupPercent));
        console.close();
    }
}