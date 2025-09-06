// Sean Fournier
// 02 February 2025
// Calulates the cost of a stock purchase and the total commission

public class StockCommission 
{
    public static void main(String [] args) 
    {
        final double PRICE = 21.77, COMMISSION = 0.02;
        double shares = 600, shareCost, commissionAmount, totalCost;

        shareCost = shares * PRICE;
        commissionAmount = shareCost * COMMISSION;
        totalCost = shareCost + commissionAmount;

        System.out.printf("\nShares: %.2f\nShare Cost: $%.2f\nCommission: %.2f%%\nCommission Amount: $%.2f\nTotal: $%.2f\n", shares, shareCost, COMMISSION, commissionAmount, totalCost);
    }
}