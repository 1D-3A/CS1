import java.util.*;
public class SlotMachine {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        String image1 = "", image2 = "", image3 = "";
        char playAgain = 'y';
        int num;
        double bet, totalMoney = 1000;
        do
        {
            System.out.printf("Total Money: $%.2f\n", totalMoney);
            System.out.print("Enter your bet: ");
            bet = console.nextDouble();
            num = rand.nextInt(6);
            switch(num)
            {
                case 0:
                    image1 = "Cherries";
                    break;
                case 1:
                    image1 = "Oranges";
                    break;
                case 2:
                    image1 = "Plums";
                    break;
                case 3:
                    image1 = "Bells";
                    break;
                case 4:
                    image1 = "Melons";
                    break;
                case 5:
                    image1 = "Bars";
                    break;
            }
            num = rand.nextInt(6);
            switch(num)
            {
                case 0:
                    image2 = "Cherries";
                    break;
                case 1:
                    image2 = "Oranges";
                    break;
                case 2:
                    image2 = "Plums";
                    break;
                case 3:
                    image2 = "Bells";
                    break;
                case 4:
                    image2 = "Melons";
                    break;
                case 5:
                    image2 = "Bars";
                    break;
            }
            num = rand.nextInt(6);
            switch(num)
            {
                case 0:
                    image3 = "Cherries";
                    break;
                case 1:
                    image3 = "Oranges";
                    break;
                case 2:
                    image3 = "Plums";
                    break;
                case 3:
                    image3 = "Bells";
                    break;
                case 4:
                    image3 = "Melons";
                    break;
                case 5:
                    image3 = "Bars";
                    break;
            }
            
            System.out.println(image1 + " " + image2 + " " + image3);
            if (image1.equals(image2) && image2.equals(image3))
            {
                totalMoney += bet * 3;
                System.out.println("You win 3x your bet!");
                System.out.printf("You won $%.2f!", bet * 3);
            }
            else if (image1.equals(image2) || image2.equals(image3) || image1.equals(image3))
            {
                totalMoney += bet * 2;
                System.out.println("\nYou win 2x your bet!");
                System.out.printf("You won $%.2f!", bet * 2);
            }
            else
            {
                totalMoney -= bet;
                System.out.println("You lose!");
            }
            
            System.out.print("\nPlay again? (y/n): ");
            playAgain = console.next().charAt(0);
        } while(playAgain == 'y');
        System.out.println("Goodbye!");
        console.close();
    }
}
