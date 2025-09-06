// Sean Fournier
// 4 March 2025
// Use nested loops to calculate the average rainfall over a period of years

import java.util.Scanner;
public class AverageRainfall {
    public static void main(String[] args) {
        int years;
        double amtRain, totalRain = 0, avgRain = 0;
        Scanner console = new Scanner(System.in);
        do {
            System.out.print("Enter the number of years: ");
            years = console.nextInt();
            if (years < 1) {
                System.out.println("Number of years mus be at least 1");
            }
        } while (years < 1);
        
        for (int y = 1; y <= years; y++) {
            for (int m = 1; m <= 12; m++) {
                do {
                    System.out.print("Enter the inches of rainfall for year " + y + " month " + m + ": ");
                    amtRain = console.nextDouble();
                    if (amtRain < 0) {
                        System.out.println("Rainfall must be at least 0");
                    }
                } while (amtRain < 0);
                totalRain += amtRain;
            }
        }
        
        avgRain = totalRain / (years * 12);
        System.out.println("Number of months: " + years * 12);
        System.out.println("Total inches of rainfall: " + totalRain);
        System.out.println("Average rainfall: " + avgRain);

        console.close();
    }
}
