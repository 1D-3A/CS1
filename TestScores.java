import java.util.Scanner;
public class TestScores 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        double score1, score2, score3, average;
        
        System.out.print("Enter the first test score: ");
        score1 = console.nextDouble();
        System.out.print("Enter the second test score: ");
        score2 = console.nextDouble();
        System.out.print("Enter the third test score: ");
        score3 = console.nextDouble();
        
        average = (score1 + score2 + score3) / 3;
        
        System.out.printf("Average %.2f\n", average);
        if (average >= 90)
            System.out.println("Letter Grade: A");
        else if (average >= 80)
            System.out.println("Letter Grade: B");
        else if (average >= 70)
            System.out.println("Letter Grade: C");
        else if (average >= 60)
            System.out.println("Letter Grade: D");
        else
            System.out.println("Letter Grade: F");
        
        console.close();
    }
}
