// Sean Fournier
// 10 February 2025
// Determines if a date is magic
import java.util.Scanner;
public class MagicDates 
{
    public static void main(String[] args) 
    {
        int month, day, year;
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter a month in numeric form: ");
        month = console.nextInt();
        System.out.print("Enter a day in numeric form: ");
        day = console.nextInt();
        System.out.print("Enter a year in two-digit form: ");
        year = console.nextInt();

        if ((month * day) == year)
            System.out.println("The date is magic.");
        else
            System.out.println("The date is not magic.");

        console.close();
    }
}
