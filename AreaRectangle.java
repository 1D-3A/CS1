// Sean Fournier
// 20 March 2025
// Calculate the area of a rectangle based off inputted length and width after input validations

import java.util.*;
public class AreaRectangle {
    public static double getLength(Scanner console) {
        double length;
        do {
            System.out.print("Enter the length of the rectangle: ");
            length = console.nextDouble();
            if (length < 0) {
                System.out.println("Length must be greater than 0.");
            }
        } while (length < 0);
        return length;
    }

    public static double getWidth(Scanner console) {
        double width;
        do {
            System.out.print("Enter the width of the rectangle: ");
            width = console.nextDouble();
            if (width < 0) {
                System.out.println("Width must be greater than 0.");
            }
        } while (width < 0);
        return width;
    }

    public static double getArea(double length, double width) {
        return length * width;
    }

    public static void displayData(double length, double width, double area) {
        System.out.printf("The length of the rectangle is %.2f\n", length);
        System.out.printf("The width of the rectangle is %.2f\n", width);
        System.out.printf("The area of the rectangle is %.2f\n", area);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double length = getLength(console);
        double width = getWidth(console);
        double area = getArea(length, width);
        displayData(length, width, area);
        console.close();
    }
}