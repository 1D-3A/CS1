import java.util.*;
public class CircleDemo {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = console.nextDouble();

        Circle c1 = new Circle(radius);
        System.out.printf("Area: %.2f", c1.getArea());
        System.out.printf("\nDiameter: %.2f", c1.getDiameter());
        System.out.printf("\nCircumference: %.2f", c1.getCircumference());

        console.close();
    }
}
