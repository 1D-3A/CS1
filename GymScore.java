// Sean Fournier
// 7 May 2025
// Program to calculate overall scores for a gynmast based on judge scores

import java.util.*;
public class GymScore {
    
    // Method to validate score input
    public static double validateScore(Scanner console, double min, double max) {
        double score;
        do {
            System.out.printf("Enter a value between %.1f and %.1f: ", min, max);
            score = console.nextDouble();
            if (score < min || score > max) {
                System.out.println("Invalid score. Try again.");
            }
        } while (score < min || score > max);
        return score;
    }

    // Method to calculate the overall score
    public static double calculateOverallScore(double[] scores) {
        double highest = scores[0];
        double lowest = scores[0];
        double total = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
            total += scores[i];
        }

        total -= (highest + lowest);
        return total / 3;
    }

    // Main method
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char continueProgram;

        do {
            System.out.print("Enter the gymnast's name: ");
            String gymnastName = console.nextLine();
            System.out.print("Enter the gymnast's city: ");
            String gymnastCity = console.nextLine();

            double[] judgeScores = new double[5];

            for (int i = 0; i < 5; i++) {
                System.out.printf("Judge #%d:\n", i + 1);
                System.out.print("  Difficulty score (0.1 to 7.5): ");
                double difficulty = validateScore(console, 0.1, 7.5);

                System.out.print("  Execution score (0.1 to 2.5): ");
                double execution = validateScore(console, 0.1, 2.5);

                System.out.print("  Deductions (0.1 to 1.0): ");
                double deductions = validateScore(console, 0.1, 1.0);

                judgeScores[i] = (difficulty + execution) - deductions;
                System.out.printf("  Judge %d Score: %.2f\n", i + 1, judgeScores[i]);
            }

            double overallScore = calculateOverallScore(judgeScores);

            System.out.printf("Gymnast: %s, City: %s\n", gymnastName, gymnastCity);
            System.out.printf("Overall score was %.2f\n", overallScore);

            System.out.print("Continue? (Y/N): ");
            continueProgram = console.nextLine().charAt(0);

        } while (Character.toUpperCase(continueProgram) == 'Y');

        // Close the scanner
        console.close();
    }
}
