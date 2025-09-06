// Sean Fournier
// 18 Feburary 2025
// Determines the age classification of a person based on their age

import java.util.Scanner;
public class AgeClassifier 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int age;
        String classification = "";

        System.out.print("Enter your age: ");
        age = console.nextInt();

        if (age >= 20)
            classification = "Adult";
        else if (age >= 13)
            classification = "Teenager";
        else if (age > 1)
            classification = "Child";
        else
            classification = "Infant";

        System.out.println("You are a " + classification + ".");
        console.close();
    }
}
