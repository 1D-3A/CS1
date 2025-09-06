import java.util.*;
public class RainFall {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        double [] rain = new double[12];
        double totalRain = 0, averageRain, mostRain, leastRain;
        int leastMonth = 0, mostMonth = 0;
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < rain.length; i++) {
            do
            {
                System.out.print("Enter Rainfall for Month " + (i + 1) + ": ");
                rain[i] = console.nextDouble();
                if (rain[i] < 0)
                    System.out.println("Please enter a positive number.");
            } while (rain[i] < 0);
        }
        
        for (int i = 0; i < rain.length; i++) {
            totalRain += rain[i];
        }
        
        averageRain = totalRain / rain.length;
        
        leastRain = rain[0];
        for (int i = 0; i < rain.length; i++) {
            if (rain[i] < leastRain) {
                leastRain = rain[i];
                leastMonth = i;
            }
        }
        
        mostRain = rain[0];
        for (int i = 0; i < rain.length; i++) {
            if (rain[i] > mostRain) {
                mostRain = rain[i];
                mostMonth = i;
            }
        }
        
        System.out.println("Total Rainfall: " + totalRain + " inches");
        System.out.printf("Average Rainfall: %.2f inches", averageRain);
        System.out.println("\nMost Rainfall: " + mostRain + " inches in " + months[mostMonth]);
        System.out.println("Least Rainfall: " + leastRain + " inches in " + months[leastMonth]);
        console.close();
        
    }
}
