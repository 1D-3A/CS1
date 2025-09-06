// Sean Fournier
// 18 Feburary 2025
// Determines the color of a roulette pocket based on user input

import java.util.Scanner;
public class RouletteWheelColors 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int pocket;
        String color = "";

        System.out.print("Enter a pocket number: ");
        pocket = console.nextInt();

        if (pocket == 0)
            color = "Green";
        else if (pocket >= 1 && pocket <= 10)
        {
            if (pocket % 2 == 0)
                color = "Black";
            else
                color = "Red";
        }
        else if (pocket >= 11 && pocket <= 18)
        {
            if (pocket % 2 == 0)
                color = "Red";
            else
                color = "Black";
        }
        else if (pocket >= 19 && pocket <= 28)
        {
            if (pocket % 2 == 0)
                color = "Black";
            else
                color = "Red";
        }
        else if (pocket >= 29 && pocket <= 36)
        {
            if (pocket % 2 == 0)
                color = "Red";
            else
                color = "Black";
        }
        else
            color = "Invalid pocket number";
        
        System.out.println("Pocket " + pocket + " is " + color + ".");
        console.close();
    }
}
