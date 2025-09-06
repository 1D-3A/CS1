public class TestDecisions 
{
    public static void main(String[] args) 
    {
        int cost = 100;
        double gpa = 2.67;
        char letter = 'B';
        String response = "yes";
        boolean valid = false;

        if (cost >= 100)
        {
            System.out.println("Shipping is free");
            System.out.println("Your cost is $100");
        }

        if (gpa >= 3.0)
            System.out.println("Dean\'s List");

        if  (letter == 'B')
        {
            System.out.println("Your answer was B");
        }

        if (valid)
            System.out.println("Valid");

        if (valid == false)
            System.out.println("Not valid");

        if (!valid)
            System.out.println("Not valid");

        if (response.equals("yes"))
        {
            System.out.println("You answered yes");
            System.out.println("That is correct");
        }

        if (response.equals("Yes")) 
            System.out.println("You answered yes");

        if (response.equalsIgnoreCase("Yes"))
            System.out.println("You answered yes");

        if (response == "yes")
            System.out.println("You answered yes");
    }
}
