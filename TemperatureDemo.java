import java.util.*;
public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit: ");
        double ftemp = console.nextDouble();

        Temperature temp = new Temperature(ftemp);
        System.out.printf("Fahrenheit: %.2f", temp.getFarenheit());
        System.out.printf("\nCelsius: %.2f", temp.getCelsius());
        System.out.printf("\nKelvin: %.2f", temp.getKelvin());

        console.close();
    }
}