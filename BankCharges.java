// Sean Fournier
// 20 February 2025
// Calculates the bank charges based on the number of checks written

import java.util.Scanner;
public class BankCharges {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int checks;

        
        System.out.print("Enter the number of checks written: ");
        checks = console.nextInt();

        if (checks >= 60) {
            System.out.printf("The bank charges are $%.2f\n for %d checks", 0.04 * checks + 10, checks);
        } else if (checks >= 40) {
            System.out.printf("The bank charges are $%.2f\n for %d checks.", 0.06 * checks + 10, checks);
        } else if (checks >= 20) {
            System.out.printf("The bank charges are $%.2f\n for %d checks.", 0.08 * checks + 10, checks);
        } else {
            System.out.printf("The bank charges are $%.2f\n for %d checks.", 0.10 * checks + 10, checks);
        }
        
        console.close();
    }
}