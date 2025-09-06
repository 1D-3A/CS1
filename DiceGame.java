import java.util.*;
public class DiceGame 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int cRoll, uRoll, cWins = 0, uWins = 0;
        
        for(int i = 1; i <= 10; i++) {
            cRoll = rand.nextInt(6) + 1;
            uRoll = rand.nextInt(6) + 1;
            if(cRoll > uRoll)
                cWins++;
            else
                uWins++;
        }
        
        if (cWins > uWins)
            System.out.println("Computer wins: " + cWins + " to " + uWins);
        else
            System.out.println("User wins: " + uWins + " to " + cWins);
            
    }
}
