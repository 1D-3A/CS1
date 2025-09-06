import java.util.*;
public class DriverExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char[] correctAnswers = {'B', 'D', 'A', 'A', 'C',
                                 'A', 'B', 'A', 'C', 'D',
                                 'B', 'C', 'D', 'A', 'D',
                                 'C', 'C', 'B', 'D', 'A'};
        
        char[] studentAnswers = new char[20];
        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Enter answer for Question " + (i + 1) + ": ");
            studentAnswers[i] = console.next().charAt(0);
            studentAnswers[i] = Character.toUpperCase(studentAnswers[i]); // Convert to uppercase
        }
        console.close();
        
        int tCorrect = totalCorrect(correctAnswers, studentAnswers);
        int tIncorrect = totalIncorrect(tCorrect);
        boolean passFail = passed(tCorrect);
        int[] missed = questionMissed(correctAnswers, studentAnswers);

        System.out.println("Number Correct: " + tCorrect);
        System.out.println("Number Incorrect: " + tIncorrect);
        System.out.println("Passed: " + passFail);
        System.out.print("Questions Missed: ");
        for (int i : missed) {
            if (i != 0) { // Ignore default 0 values in the array
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
   
    public static boolean passed(int correct) {
        boolean passed;
        if (correct >= 15) {
            passed = true;
        }
        else {
            passed = false;
        }
        return passed;
    }
    
    public static int totalCorrect(char[] cAns, char[] sAns) {
        int correct = 0;
        for (int i = 0; i < cAns.length; i++) {
            if (sAns[i] == cAns[i]) {
                correct++;
            }
        }
        return correct;
    }
    
    public static int totalIncorrect(int correct) {
        return 20 - correct;
    }
    
    public static int[] questionMissed(char[] cAns, char[] sAns) {
        int[] questionsMissed = new int[cAns.length];
        int missedIndex = 0;
        for (int i = 0; i < cAns.length; i++) {
            if (sAns[i] != cAns[i]) {
                questionsMissed[missedIndex] = i + 1; // Store question number (1-based index)
                missedIndex++;
            }
        }
        return questionsMissed;
    }
}