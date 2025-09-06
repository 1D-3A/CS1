// Sean Fournier
// 20 February 2025
// Determines the speed of sound in a medium

import java.util.Scanner;
public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String medium;
        double distance;
        double time;

        System.out.print("Enter the medium (air, water, or steel): ");
        medium = console.nextLine();
       
        if (medium.equalsIgnoreCase("air")) {
            System.out.print("Enter the distance in feet: ");
            distance = console.nextDouble();
            time = distance / 1100;
            System.out.printf("The speed of sound in air is %.2f feet per second.", time);
        } else if (medium.equalsIgnoreCase("water")) {
            System.out.print("Enter the distance in feet: ");
            distance = console.nextDouble();
            time = distance / 4900;
            System.out.printf("The speed of sound in water is %.2f feet per second.", time);
        } else if (medium.equalsIgnoreCase("steel")) {
            System.out.print("Enter the distance in feet: ");
            distance = console.nextDouble();
            time = distance / 16400;
            System.out.printf("The speed of sound in steel is %.2f feet per second.", time);
        } else {
            System.out.println("Invalid medium.");
        }
    
        console.close();
    }
}
