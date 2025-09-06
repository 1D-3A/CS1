// Sean Fournier
// 27 Feburary 2025
// Determined the distance traveled based on user input for speed and time, prints results in a table

import java.util.Scanner;
public class DistanceTraveled 
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the speed of the vehicle in mph: ");
        int speed = console.nextInt();
        System.out.print("Enter the number of hours the vehicle has traveled: ");
        int hours = console.nextInt();

        while (speed < 0 || hours < 1) {
            System.out.println("Speed must be greater than 0 and hours must be greater than 1.");
            System.out.print("Enter the speed of the vehicle in mph: ");
            speed = console.nextInt();
            System.out.print("Enter the number of hours the vehicle has traveled: ");
            hours = console.nextInt();
        }

        System.out.println("Hour\tDistance Traveled");
        System.out.println("----\t-----------------");

        for (int i = 1; i <= hours; i++) {
            System.out.println(i + "\t" + (speed * i));
        }

        console.close();
    }
}
