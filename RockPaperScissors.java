// Sean Fournier
// 26 March 2025
// Rock Paper Scissors game

import java.util.*;
public class RockPaperScissors {
    
    public static char compTurn() {
        Random r = new Random();
        int choice = r.nextInt(1,4);
        switch (choice) {
            case 1:
                return 'R';
            case 2:
                return 'P';
            default:
                return 'S';
        }
    }

    public static char playerTurn() {
        Scanner console = new Scanner(System.in);
        System.out.print("[1: Rock] - [2: Paper] - [3: Scissors]: ");
        int choice = console.nextInt();
        console.close();
        switch (choice) {
            case 1:
                return 'R';
            case 2:
                return 'P';
            case 3:
                return 'S';
            default:
                System.out.println("Invalid choice.");
                return playerTurn();
        }
    }

    public static void determineWinner(char playerChoice, char computerChoice) {
        if (playerChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((playerChoice == 'R' && computerChoice == 'S') || 
                   (playerChoice == 'P' && computerChoice == 'R') || 
                   (playerChoice == 'S' && computerChoice == 'P')) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer Wins!");
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String playAgain;

        do {
            char computerChoice = compTurn();
            char playerChoice = playerTurn();

            System.out.println("Computer Choice: " + computerChoice);
            System.out.println("Player Choice: " + playerChoice);

            determineWinner(playerChoice, computerChoice);

            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = console.next();
        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        console.close();
    }
}