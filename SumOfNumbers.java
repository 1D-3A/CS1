import java.util.Scanner;
public class SumOfNumbers 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int num, sum, count;
        System.out.print("Enter a number: ");
        num = console.nextInt();
        count = 0;
        sum = 0;
        while (count <= num)
        {
            sum = sum + count;
            System.out.println("Current Sum: " + sum);
            count++;
        }
        System.out.println("Sum: " + sum);
        console.close();
    }
}
