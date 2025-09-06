// Sean Fournier
// 26 February 2025
// Find the largest and smallest interger from a list of numbers a user inputs before inputting -99 to stop

import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int num, largest, smallest;
        System.out.print("Enter a number (-99 to stop): ");
        
        num = console.nextInt();
        largest = num;
        smallest = num;
        
        while (num != -99)
        {
            if (num > largest)
            {
                largest = num;
            }
            else if (num < smallest)
            {
                smallest = num;
            }
            System.out.print("Enter a number (-99 to stop): ");
            num = console.nextInt();
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        
        console.close();
    }
}
