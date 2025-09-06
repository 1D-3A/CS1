import java.util.Scanner;
public class InternetServiceProvicer 
{
    public static void main(String[] args) 
    {
        int hours;
        char plan;
        double cost = 0.0;
        Scanner console = new Scanner(System.in);

        while (true)
        {
            System.out.print("Which plan do you have? (A, B, or C): ");
            plan = console.next().charAt(0);
            if (plan == 'A' || plan == 'a' || plan == 'B' || plan == 'b' || plan == 'C' || plan == 'c')
            {
                break;
            }
            else
            {
                System.out.println("Invalid plan.");
            }
        }
        
        System.out.print("How many hours did you use?: ");
        hours = console.nextInt();

        switch(plan)
        {
            case 'A', 'a':
                if (hours > 10)
                    cost = (hours - 10) * 2 + 9.95;
                else
                    cost = 9.95;
                break;
            case 'B', 'b':
                if (hours > 20)
                    cost = (hours - 20) + 13.95;
                else
                    cost = 13.95;
                break;
            case 'C', 'c':
                cost = 19.95;
                break;
            default:
                System.out.println("Invalid plan.");
        }
        
        System.out.printf("Your total cost is: $%.2f\n", cost);
        console.close();
        
    }
}
