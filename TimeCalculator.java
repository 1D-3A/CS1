// Sean Fournier
// 20 February 2025
// Calculates time based off seconds inputted

import java.util.Scanner;
public class TimeCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int seconds;
        int minutes;
        int hours;
        int days;
        int remainingMinutes;
        int remainingSeconds;

        System.out.print("Enter the number of seconds: ");
        seconds = console.nextInt();

        if (seconds >= 86400) {
            days = seconds / 86400;
            hours = (seconds % 86400) / 3600;
            remainingMinutes = ((seconds % 86400) % 3600) / 60;
            remainingSeconds = ((seconds % 86400) % 3600) % 60;
            System.out.printf("%d seconds is equivalent to %d days, %d hours, %d minutes, and %d seconds.", seconds, days, hours, remainingMinutes, remainingSeconds);
        } else if (seconds >= 3600) {
            hours = seconds / 3600;
            remainingMinutes = (seconds % 3600) / 60;
            remainingSeconds = (seconds % 3600) % 60;
            System.out.printf("%d seconds is equivalent to %d hours, %d minutes, and %d seconds.", seconds, hours, remainingMinutes, remainingSeconds);
        } else if (seconds >= 60) {
            minutes = seconds / 60;
            remainingSeconds = seconds % 60;
            System.out.printf("%d seconds is equivalent to %d minutes and %d seconds.", seconds, minutes, remainingSeconds);
        } else {
            System.out.printf("%d seconds is equivalent to %d seconds.", seconds, seconds);
        }

        console.close();
    }
}
