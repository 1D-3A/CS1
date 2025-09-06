// Sean Fournier
// 02 February 2025
// Asks the user for multiple inputs and then prints a story using those inputs

import java.util.Scanner;
public class WordGame 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        String name, age, city, college, profession, animal, petName;

        System.out.print("Enter your name: ");
        name = console.nextLine();
        System.out.print("Enter your age: ");
        age = console.nextLine();
        System.out.print("Enter the name of a city: ");
        city = console.nextLine();
        System.out.print("Enter the name of a college: ");
        college = console.nextLine();
        System.out.print("Enter a profession: ");
        profession = console.nextLine();
        System.out.print("Enter a type of animal: ");
        animal = console.nextLine();
        System.out.print("Enter a pet's name: ");
        petName = console.nextLine();

        System.out.println("\nThere once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!\n");

        console.close();
    }
}
