import java.util.*;
public class DiverScoring 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        String diverName, diverCity, keepGoing;
        double degreeOfDifficulty, judgeScore1, judgeScore2, judgeScore3, judgeScore4, judgeScore5, highestScore, lowestScore, diverTotal, averageScore, totalAverage = 0.0;
        int numDivers = 0;
        do 
        {
            System.out.print("Enter the Diver's Name: ");
            diverName = console.nextLine();
            System.out.print("Enter the Diver's City: ");
            diverCity = console.nextLine();
            
            do {
                System.out.print("Enter Judge #1's Score: ");
                judgeScore1 = console.nextDouble();
                if (judgeScore1 < 0 || judgeScore1 > 10) {
                    System.out.println("Invalid score! Score must be between 0 and 10.");
                }
            } while (judgeScore1 < 0 || judgeScore1 > 10);
            
            do {
                System.out.print("Enter Judge #2's Score: ");
                judgeScore2 = console.nextDouble();
                if (judgeScore2 < 0 || judgeScore2 > 10) {
                    System.out.println("Invalid score! Score must be between 0 and 10.");
                }
            } while (judgeScore2 < 0 || judgeScore2 > 10);
            
            do {
                System.out.print("Enter Judge #3's Score: ");
                judgeScore3 = console.nextDouble();
                if (judgeScore3 < 0 || judgeScore3 > 10) {
                    System.out.println("Invalid score! Score must be between 0 and 10.");
                }
            } while (judgeScore3 < 0 || judgeScore3 > 10);
            
            do {
                System.out.print("Enter Judge #4's Score: ");
                judgeScore4 = console.nextDouble();
                if (judgeScore4 < 0 || judgeScore4 > 10) {
                    System.out.println("Invalid score! Score must be between 0 and 10.");
                }
            } while (judgeScore4 < 0 || judgeScore4 > 10);
            
            do {
                System.out.print("Enter Judge #5's Score: ");
                judgeScore5 = console.nextDouble();
                if (judgeScore5 < 0 || judgeScore5 > 10) {
                    System.out.println("Invalid score! Score must be between 0 and 10.");
                }
            } while (judgeScore5 < 0 || judgeScore5 > 10);
            
            do {
                System.out.print("Enter the degree of difficulty: ");
                degreeOfDifficulty = console.nextDouble();
                if (degreeOfDifficulty < 1 || degreeOfDifficulty > 1.67) {
                    System.out.println("Invalid score! Degree must be between 1 and 1.67.");
                }
            } while (degreeOfDifficulty < 1 || degreeOfDifficulty > 1.67);

            diverTotal = judgeScore1 + judgeScore2 + judgeScore3 + judgeScore4 + judgeScore5;
            highestScore = Math.max(judgeScore1, Math.max(judgeScore2, Math.max(judgeScore3, Math.max(judgeScore4, judgeScore5))));
            lowestScore = Math.min(judgeScore1, Math.min(judgeScore2, Math.min(judgeScore3, Math.min(judgeScore4, judgeScore5))));
            averageScore = ((diverTotal - highestScore - lowestScore) / 3) * degreeOfDifficulty;
            totalAverage += averageScore;
            numDivers ++;
            System.out.printf("- Diver: %s, City: %s \n - Average Score: %.2f\n", diverName, diverCity, averageScore);
            System.out.print("Do you want to enter another diver? (y/n): ");
            keepGoing = console.next();
            console.nextLine();
            
        } while (keepGoing.equalsIgnoreCase("y"));

        System.out.println("Number of Divers: " + numDivers);
        System.out.printf("Average Score: %.2f\n", totalAverage / numDivers);
        console.close();
    }
}
