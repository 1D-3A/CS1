import java.util.*;
public class RandomNumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        int number, guess, tries = 0;
        number = rand.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100...");
        do {
            System.out.print("Your guess: ");
            guess = console.nextInt();
            tries++;
            if(guess < number)
                System.out.println("Higher...");
            else if(guess > number)
                System.out.println("Lower...");
        } while(guess != number);
        System.out.println("You got it right in " + tries + " tries!");

        console.close();
    }
}
