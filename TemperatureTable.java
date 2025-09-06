// Sean Fournier
// 27 Feburary 2025
// Creats a table of Celcius temperatures (0-20) and their Fahrenheit equivalents

public class TemperatureTable 
{
    public static void main(String[] args) 
    {
        System.out.println("Celcius\tFahrenheit");
        System.out.println("-------\t----------");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i + "\t" + (i * 9 / 5 + 32));
        }
    }
}
